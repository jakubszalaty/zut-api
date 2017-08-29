package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0007e;
import p000a.C0015m;
import p022b.C0633c;
import pl.edu.zut.mobile.C0660a.C0644c;

public class VacationsActivity extends C0399b implements C0644c {
    private int f2119m;
    private C0660a f2120n;
    private String f2121o;
    private String f2122p;
    private final int f2123q;
    private final int f2124r;
    private List<C0633c> f2125s;
    private C0015m f2126t;
    private C0015m f2127u;
    private List<C0633c> f2128v;
    private ProgressDialog f2129w;
    private List<String> f2130x;

    /* renamed from: pl.edu.zut.mobile.VacationsActivity.1 */
    class C06551 implements OnItemSelectedListener {
        final /* synthetic */ VacationsActivity f2117a;

        C06551(VacationsActivity vacationsActivity) {
            this.f2117a = vacationsActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str = (String) this.f2117a.f2130x.get(i);
            if (!this.f2117a.f2129w.isShowing()) {
                this.f2117a.f2129w.show();
            }
            this.f2117a.f2120n.m3357e(this.f2117a.f2122p, this.f2117a.f2121o, str, 1001);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: pl.edu.zut.mobile.VacationsActivity.2 */
    class C06562 implements OnItemClickListener {
        final /* synthetic */ VacationsActivity f2118a;

        C06562(VacationsActivity vacationsActivity) {
            this.f2118a = vacationsActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2118a.m3330b(i);
        }
    }

    public VacationsActivity() {
        this.f2123q = 1001;
        this.f2124r = 1002;
        this.f2130x = Arrays.asList(new String[]{" "});
    }

    private String m3322b(String str) {
        try {
            str = str.substring(8) + "." + str.substring(5, 7) + "." + str.substring(2, 4);
        } catch (Exception e) {
        }
        return str;
    }

    private ArrayList m3326j() {
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        Calendar instance = Calendar.getInstance();
        String format = simpleDateFormat.format(instance.getTime());
        arrayList.add(format);
        while (!format.equals("2013")) {
            instance.add(1, -1);
            format = simpleDateFormat.format(instance.getTime());
            arrayList.add(format);
        }
        return arrayList;
    }

    public void m3327a(Bitmap bitmap, int i) {
    }

    void m3328a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3329a(String str, int i) {
        Object obj;
        try {
            if (this.f2129w.isShowing()) {
                this.f2129w.dismiss();
            }
        } catch (Exception e) {
        }
        JSONObject jSONObject;
        JSONArray jSONArray;
        int i2;
        JSONObject jSONObject2;
        if (i == 1001) {
            try {
                jSONObject = new JSONObject(str);
                if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                    m3328a(getString(2131099860));
                    startActivity(new Intent(this, LoginActivity.class));
                }
                this.f2125s.clear();
                if (str == null || !str.contains("Urlop")) {
                    m3328a(getString(2131099689));
                } else {
                    this.f2125s.add(new C0633c(getString(2131099853), getString(2131099848), getString(2131099849), getString(2131099760)));
                    if (jSONObject.get("Urlop") instanceof JSONArray) {
                        jSONArray = jSONObject.getJSONArray("Urlop");
                        for (i2 = 0; i2 < jSONArray.length(); i2++) {
                            jSONObject2 = jSONArray.getJSONObject(i2);
                            this.f2125s.add(new C0633c(jSONObject2.optString("nazwa"), m3322b(jSONObject2.optString("odDnia")), m3322b(jSONObject2.optString("doDnia")), jSONObject2.optString("iloscDni")));
                        }
                    } else {
                        jSONObject = (JSONObject) jSONObject.get("Urlop");
                        this.f2125s.add(new C0633c(jSONObject.optString("nazwa"), m3322b(jSONObject.optString("odDnia")), m3322b(jSONObject.optString("doDnia")), jSONObject.optString("iloscDni")));
                    }
                }
                this.f2126t.notifyDataSetChanged();
            } catch (JSONException e2) {
                obj = 1;
            }
        } else if (i == 1002) {
            jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3328a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            this.f2128v.clear();
            if (str == null || !str.contains("UrlopDni")) {
                m3328a(getString(2131099689));
            } else {
                this.f2128v.add(new C0633c(getString(2131099854), getString(2131099850), getString(2131099851), getString(2131099852)));
                if (jSONObject.get("UrlopDni") instanceof JSONArray) {
                    jSONArray = jSONObject.getJSONArray("UrlopDni");
                    for (i2 = 0; i2 < jSONArray.length(); i2++) {
                        jSONObject2 = jSONArray.getJSONObject(i2);
                        this.f2128v.add(new C0633c(jSONObject2.optString("ou"), m3322b(jSONObject2.optString("wymiar")), m3322b(jSONObject2.optString("wykorzystano")), jSONObject2.optString("pozostalo")));
                    }
                } else {
                    jSONObject = (JSONObject) jSONObject.get("UrlopDni");
                    this.f2128v.add(new C0633c(jSONObject.optString("ou"), m3322b(jSONObject.optString("wymiar")), m3322b(jSONObject.optString("wykorzystano")), jSONObject.optString("pozostalo")));
                }
            }
            this.f2127u.notifyDataSetChanged();
        }
        obj = null;
        if (obj != null) {
            m3328a(getString(2131099676));
        }
    }

    public void m3330b(int i) {
    }

    public void m3331b(String str, int i) {
        try {
            if (this.f2129w.isShowing()) {
                this.f2129w.dismiss();
            }
        } catch (Exception e) {
        }
        m3328a(i == 1001 ? getString(2131099678) : getString(2131099678));
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3332i() {
        ((TextView) findViewById(2131427476)).setText(2131099922);
        ArrayList arrayList = new ArrayList();
        this.f2130x = m3326j();
        this.f2119m = -1;
        this.f2120n = new C0660a(this);
        this.f2129w = new ProgressDialog(this);
        this.f2129w.setMessage(getString(2131099679));
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2121o = sharedPreferences.getString("AUTHKEY", null);
        this.f2122p = sharedPreferences.getString("USERID", null);
        this.f2129w.show();
        this.f2120n.m3352c(this.f2122p, this.f2121o, 1002);
        Spinner spinner = (Spinner) findViewById(2131427423);
        spinner.setAdapter(new C0007e(this, this.f2130x));
        spinner.setOnItemSelectedListener(new C06551(this));
        this.f2125s = new ArrayList();
        this.f2126t = new C0015m(this, this.f2125s);
        ListView listView = (ListView) findViewById(2131427481);
        listView.setAdapter(this.f2126t);
        listView.setOnItemClickListener(new C06562(this));
        this.f2128v = new ArrayList();
        this.f2127u = new C0015m(this, this.f2128v);
        ((ListView) findViewById(2131427479)).setAdapter(this.f2127u);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968619);
        m3332i();
    }
}
