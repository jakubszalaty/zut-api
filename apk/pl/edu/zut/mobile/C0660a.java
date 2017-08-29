package pl.edu.zut.mobile;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/* renamed from: pl.edu.zut.mobile.a */
public class C0660a {
    private final String f2144a;
    private C0644c f2145b;

    /* renamed from: pl.edu.zut.mobile.a.c */
    public interface C0644c {
        void m3212a(Bitmap bitmap, int i);

        void m3213a(String str, int i);

        void m3214b(String str, int i);
    }

    /* renamed from: pl.edu.zut.mobile.a.1 */
    class C06571 implements X509TrustManager {
        final /* synthetic */ C0660a f2133a;

        C06571(C0660a c0660a) {
            this.f2133a = c0660a;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: pl.edu.zut.mobile.a.a */
    private class C0658a extends AsyncTask<Void, Void, String> {
        final /* synthetic */ C0660a f2134a;
        private String f2135b;
        private HashMap<String, String> f2136c;
        private int f2137d;
        private String f2138e;

        public C0658a(C0660a c0660a, String str, HashMap<String, String> hashMap, int i) {
            this.f2134a = c0660a;
            this.f2135b = "";
            this.f2136c = null;
            this.f2138e = "";
            this.f2135b = str;
            this.f2136c = hashMap;
            this.f2137d = i;
        }

        protected String m3333a(Void... voidArr) {
            String str = "";
            HttpClient defaultHttpClient = new DefaultHttpClient();
            HttpUriRequest httpPost = new HttpPost(this.f2135b);
            try {
                String str2;
                List arrayList = new ArrayList();
                for (String str22 : this.f2136c.keySet()) {
                    arrayList.add(new BasicNameValuePair(str22, (String) this.f2136c.get(str22)));
                }
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f2138e = "ok";
                    str22 = new String(EntityUtils.toByteArray(execute.getEntity()), "UTF-8");
                } else {
                    str22 = str;
                }
                return str22;
            } catch (UnsupportedEncodingException e) {
                this.f2138e = "Encoding is not supported";
                return str;
            } catch (Exception e2) {
                this.f2138e = "An error occurred";
                return str;
            }
        }

        protected void m3334a(String str) {
            if (this.f2138e.equals("ok")) {
                this.f2134a.f2145b.m3213a(str, this.f2137d);
            } else {
                this.f2134a.f2145b.m3214b(this.f2138e, this.f2137d);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m3333a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m3334a((String) obj);
        }
    }

    /* renamed from: pl.edu.zut.mobile.a.b */
    private class C0659b extends AsyncTask<String, String, String> {
        Bitmap f2139a;
        final /* synthetic */ C0660a f2140b;
        private String f2141c;
        private int f2142d;
        private int f2143e;

        public C0659b(C0660a c0660a, String str, int i, int i2) {
            this.f2140b = c0660a;
            this.f2141c = str;
            this.f2142d = i;
            this.f2143e = i2;
        }

        protected Bitmap m3335a(InputStream inputStream, int i) {
            InputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
            try {
                Options options = new Options();
                if (i > 0) {
                    Options options2 = new Options();
                    options2.inJustDecodeBounds = true;
                    bufferedInputStream.mark(32768);
                    BitmapFactory.decodeStream(bufferedInputStream, null, options2);
                    bufferedInputStream.reset();
                    options.inSampleSize = Math.max(1, Math.min(options2.outWidth / i, options2.outHeight / i));
                }
                Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                }
                return decodeStream;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e3) {
                }
            }
        }

        protected String m3336a(String... strArr) {
            try {
                this.f2139a = m3335a(new BufferedInputStream(new URL(this.f2141c).openStream()), this.f2142d);
            } catch (Exception e) {
            }
            return null;
        }

        protected void m3337a(String str) {
            this.f2140b.f2145b.m3212a(this.f2139a, this.f2143e);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m3336a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m3337a((String) obj);
        }
    }

    public C0660a(Activity activity) {
        this.f2144a = "https://www.zut.edu.pl/app-json-proxy/";
        this.f2145b = (C0644c) activity;
    }

    public void m3339a(String str, int i) {
        new C0658a(this, str, new HashMap(), i).execute(new Void[0]);
    }

    public void m3340a(String str, int i, int i2) {
        new C0659b(this, str, i, i2).execute(new String[0]);
    }

    public void m3341a(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str2);
        hashMap.put("token", str);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getMenuStudent", hashMap, i).execute(new Void[0]);
    }

    public void m3342a(String str, String str2, String str3, int i) {
        String str4 = "";
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("name", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getSearch", hashMap, i).execute(new Void[0]);
    }

    public void m3343a(String str, String str2, String str3, String str4, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("password", str2);
        hashMap.put("token", str3);
        hashMap.put("tokenJpg", str4);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getAuthorization", hashMap, i).execute(new Void[0]);
    }

    public void m3344a(String str, String str2, String str3, String str4, String str5, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("gpracownikId", str3);
        hashMap.put("dydaktykId", str4);
        hashMap.put("zajeciaElemId", str5);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getAttendance", hashMap, i).execute(new Void[0]);
    }

    public void m3345a(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("zajeciaElemId", str3);
        hashMap.put("gpracownikId", str4);
        hashMap.put("pracownikId", str5);
        hashMap.put("status", str6);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=setAttendances", hashMap, i).execute(new Void[0]);
    }

    public void m3346a(String str, String str2, String str3, boolean z, int i) {
        String str4 = "";
        str4 = "";
        str4 = "https://www.zut.edu.pl/app-json-proxy/index.php?f=getDiploma";
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("przynaleznoscId", str3);
        if (z) {
            hashMap.put("dypTyp", "1");
        } else {
            hashMap.put("dypTyp", "0");
        }
        new C0658a(this, str4, hashMap, i).execute(new Void[0]);
    }

    public boolean m3347a() {
        boolean z = true;
        try {
            if (VERSION.SDK_INT <= 8) {
                return true;
            }
            StrictMode.setThreadPolicy(new Builder().permitAll().build());
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new C06571(this)}, null);
            SSLSocket sSLSocket = (SSLSocket) instance.getSocketFactory().createSocket("www.zut.edu.pl", 443);
            sSLSocket.startHandshake();
            if (!sSLSocket.getSession().getPeerPrincipal().getName().contains("CN=www.zut.edu.pl")) {
                z = false;
            }
            try {
                sSLSocket.close();
                return z;
            } catch (Exception e) {
                return z;
            }
        } catch (Exception e2) {
            return false;
        };
    }

    public void m3348b(String str, String str2, int i) {
        String str3 = "";
        str3 = "";
        HashMap hashMap = new HashMap();
        hashMap.put("login", str2);
        hashMap.put("token", str);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getPersonal", hashMap, i).execute(new Void[0]);
    }

    public void m3349b(String str, String str2, String str3, int i) {
        String str4 = "";
        str4 = "";
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("przynaleznoscId", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getStudy", hashMap, i).execute(new Void[0]);
    }

    public void m3350b(String str, String str2, String str3, String str4, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("dydaktykId", str3);
        hashMap.put("album", str4);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getPersonalMini", hashMap, i).execute(new Void[0]);
    }

    public void m3351b(String str, String str2, String str3, String str4, String str5, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("przynaleznoscId", str3);
        hashMap.put("zajeciaElemId", str4);
        hashMap.put("status", str5);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=setAttendance", hashMap, i).execute(new Void[0]);
    }

    public void m3352c(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=    ", hashMap, i).execute(new Void[0]);
    }

    public void m3353c(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("listaSemestrowId", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getGrade", hashMap, i).execute(new Void[0]);
    }

    public void m3354c(String str, String str2, String str3, String str4, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("przynaleznoscId", str3);
        hashMap.put("oceny", str4);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getStudies", hashMap, i).execute(new Void[0]);
    }

    public void m3355d(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("day", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getPlan", hashMap, i).execute(new Void[0]);
    }

    public void m3356d(String str, String str2, String str3, String str4, int i) {
        String str5 = "https://www.zut.edu.pl/app-json-proxy/index.php?f=getNotice";
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        if (str3 != null) {
            hashMap.put("ogloszenieId", str3);
        }
        hashMap.put("odczyt", str4);
        new C0658a(this, str5, hashMap, i).execute(new Void[0]);
    }

    public void m3357e(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("rok", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getVacations", hashMap, i).execute(new Void[0]);
    }

    public void m3358f(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("token", str2);
        hashMap.put("przynaleznoscId", str3);
        new C0658a(this, "https://www.zut.edu.pl/app-json-proxy/index.php?f=getPayment", hashMap, i).execute(new Void[0]);
    }
}
