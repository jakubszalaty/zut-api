package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0003a;
import p000a.C0007e;
import p022b.C0631a;
import pl.edu.zut.mobile.C0660a.C0644c;

public class AttendanceActivity extends C0399b implements C0644c {
    private final int f1942A;
    private final int f1943B;
    String f1944m;
    String f1945n;
    String f1946o;
    private C0007e f1947p;
    private List<String> f1948q;
    private C0660a f1949r;
    private String f1950s;
    private String f1951t;
    private boolean f1952u;
    private List<C0631a> f1953v;
    private C0003a f1954w;
    private ProgressDialog f1955x;
    private int f1956y;
    private final int f1957z;

    /* renamed from: pl.edu.zut.mobile.AttendanceActivity.1 */
    class C06431 implements OnItemSelectedListener {
        final /* synthetic */ AttendanceActivity f1941a;

        C06431(AttendanceActivity attendanceActivity) {
            this.f1941a = attendanceActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f1941a.f1956y = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public AttendanceActivity() {
        this.f1957z = 1000;
        this.f1942A = 1001;
        this.f1943B = 1002;
    }

    public void m3216a(Bitmap bitmap, int i) {
    }

    void m3217a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3218a(String str, int i) {
        Object obj;
        try {
            this.f1953v.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3217a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (i == 1000) {
                try {
                    if (this.f1955x.isShowing()) {
                        this.f1955x.dismiss();
                    }
                } catch (Exception e) {
                }
                if (str != null) {
                    if (str.contains("Obecnosc")) {
                        String optString;
                        String str2;
                        String optString2;
                        String optString3;
                        String str3;
                        if (jSONObject.get("Obecnosc") instanceof JSONArray) {
                            JSONArray jSONArray = jSONObject.getJSONArray("Obecnosc");
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                jSONObject = jSONArray.getJSONObject(i2);
                                optString = jSONObject.optString("album");
                                str2 = jSONObject.optString("nazwisko") + " " + jSONObject.optString("imie");
                                optString2 = jSONObject.optString("nazwa");
                                optString3 = jSONObject.optString("przynaleznoscId");
                                str3 = (jSONObject.optString("imageUrl") == null || jSONObject.optString("imageUrl").length() <= 0) ? null : "https://www.zut.edu.pl/app-json-proxy/image/?userId=" + optString + "&tokenJpg=" + jSONObject.optString("imageUrl") + "&cv=TRUE";
                                this.f1953v.add(new C0631a(optString, str2, optString2, str3, optString3));
                            }
                        } else {
                            jSONObject = (JSONObject) jSONObject.get("Obecnosc");
                            optString = jSONObject.optString("album");
                            str2 = jSONObject.optString("nazwisko") + " " + jSONObject.optString("imie");
                            optString2 = jSONObject.optString("nazwa");
                            optString3 = jSONObject.optString("przynaleznoscId");
                            str3 = (jSONObject.optString("imageUrl") == null || jSONObject.optString("imageUrl").length() <= 0) ? null : "https://www.zut.edu.pl/app-json-proxy/image/?userId=" + optString + "&tokenJpg=" + jSONObject.optString("imageUrl") + "&cv=TRUE";
                            this.f1953v.add(new C0631a(optString, str2, optString2, str3, optString3));
                        }
                        this.f1954w.notifyDataSetChanged();
                    }
                }
                m3217a(getString(2131099685));
            } else if (i == 1001) {
                this.f1949r.m3344a(this.f1950s, this.f1951t, this.f1944m, this.f1945n, this.f1946o, 1000);
            } else if (i == 1002) {
                this.f1949r.m3344a(this.f1950s, this.f1951t, this.f1944m, this.f1945n, this.f1946o, 1000);
            }
            if (this.f1952u) {
                m3220b(getString(2131099726));
            }
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3217a(getString(2131099676));
        }
    }

    public void m3219a(String str, String str2) {
        this.f1955x.show();
        this.f1949r.m3351b(this.f1950s, this.f1951t, str, this.f1946o, str2, 1001);
    }

    void m3220b(String str) {
        Toast.makeText(this, str, 1).show();
        Editor edit = getApplicationContext().getSharedPreferences("mZut", 0).edit();
        edit.putBoolean("HAA", false);
        edit.apply();
    }

    public void m3221b(String str, int i) {
        try {
            if (this.f1955x.isShowing()) {
                this.f1955x.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        m3217a(getString(2131099678));
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3222i() {
        ((TextView) findViewById(2131427476)).setText(2131099910);
        ((TextView) findViewById(2131427418)).setText(2131099838);
        ((TextView) findViewById(2131427419)).setText(2131099835);
        this.f1949r = new C0660a(this);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f1951t = sharedPreferences.getString("AUTHKEY", "");
        this.f1950s = sharedPreferences.getString("USERID", null);
        this.f1952u = sharedPreferences.getBoolean("HAA", true);
        this.f1953v = new ArrayList();
        this.f1954w = new C0003a(this, this.f1953v);
        ((ListView) findViewById(2131427421)).setAdapter(this.f1954w);
        this.f1955x = new ProgressDialog(this);
        this.f1955x.setMessage(getString(2131099679));
        m3223j();
    }

    public void m3223j() {
        this.f1948q = new ArrayList();
        this.f1948q.add(getString(2131099817));
        this.f1948q.add(getString(2131099731));
        this.f1948q.add(getString(2131099789));
        this.f1947p = new C0007e(this, this.f1948q);
        Spinner spinner = (Spinner) findViewById(2131427416);
        spinner.setAdapter(this.f1947p);
        spinner.setOnItemSelectedListener(new C06431(this));
        this.f1944m = getIntent().getStringExtra("gpracownikId");
        this.f1945n = getIntent().getStringExtra("dydaktykId");
        this.f1946o = getIntent().getStringExtra("zajeciaElemId");
        this.f1955x.show();
        this.f1949r.m3344a(this.f1950s, this.f1951t, this.f1944m, this.f1945n, this.f1946o, 1000);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968603);
        m3222i();
    }

    public void viewButtonAction(View view) {
        String str = null;
        if (this.f1947p.getItemId(this.f1956y) == 0) {
            str = "O";
        } else if (this.f1947p.getItemId(this.f1956y) == 1) {
            str = "N";
        } else if (this.f1947p.getItemId(this.f1956y) == 2) {
            str = "NU";
        }
        this.f1955x.show();
        this.f1949r.m3345a(this.f1950s, this.f1951t, this.f1946o, this.f1944m, this.f1945n, str, 1002);
    }
}
