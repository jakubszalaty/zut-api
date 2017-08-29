package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0011i;
import p022b.C0637g;
import pl.edu.zut.mobile.C0660a.C0644c;

public class StudentAccountingActivity extends C0399b implements C0644c {
    private List<C0637g> f2046m;
    private C0011i f2047n;
    private ProgressDialog f2048o;

    public void m3278a(Bitmap bitmap, int i) {
    }

    public void m3279a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3280a(String str, int i) {
        Object obj;
        try {
            if (this.f2048o.isShowing()) {
                this.f2048o.dismiss();
            }
        } catch (Exception e) {
        }
        int i2 = getResources().getConfiguration().orientation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3279a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (str == null || !str.contains("Oplata")) {
                m3279a(getString(2131099684));
            } else if (jSONObject.get("Oplata") instanceof JSONArray) {
                JSONArray jSONArray = jSONObject.getJSONArray("Oplata");
                if (i2 == 1) {
                    this.f2046m.add(new C0637g(getString(2131099808), getString(2131099744), getString(2131099743), getString(2131099735)));
                    for (i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        r1 = jSONObject2.optString("nazwa");
                        if (!m3283j().equals("PL")) {
                            r1 = jSONObject2.optString("nazwaO");
                        }
                        r4 = jSONObject2.optString("naleznosc");
                        String optString = jSONObject2.optString("wplata");
                        this.f2046m.add(new C0637g(r1, jSONObject2.optString("dataPlatnosci"), r4, optString));
                    }
                } else {
                    this.f2046m.add(new C0637g(getString(2131099808), getString(2131099744), getString(2131099743), getString(2131099805), getString(2131099735), getString(2131099739), getString(2131099741)));
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        jSONObject = jSONArray.getJSONObject(i3);
                        r2 = jSONObject.optString("nazwa");
                        if (!m3283j().equals("PL")) {
                            r2 = jSONObject.optString("nazwaO");
                        }
                        r4 = jSONObject.optString("naleznosc");
                        r6 = jSONObject.optString("wplata");
                        this.f2046m.add(new C0637g(r2, jSONObject.optString("dataPlatnosci"), r4, jSONObject.optString("dataWplaty"), r6, jSONObject.optString("saldo"), jSONObject.optString("konto")));
                    }
                }
            } else {
                JSONObject jSONObject3 = (JSONObject) jSONObject.get("Oplata");
                if (i2 == 1) {
                    this.f2046m.add(new C0637g(getString(2131099808), getString(2131099744), getString(2131099743), getString(2131099735)));
                    r1 = jSONObject3.optString("nazwa");
                    if (!m3283j().equals("PL")) {
                        r1 = jSONObject3.optString("nazwaO");
                    }
                    r2 = jSONObject3.optString("naleznosc");
                    String optString2 = jSONObject3.optString("wplata");
                    this.f2046m.add(new C0637g(r1, jSONObject3.optString("dataPlatnosci"), r2, optString2));
                } else {
                    this.f2046m.add(new C0637g(getString(2131099808), getString(2131099744), getString(2131099743), getString(2131099805), getString(2131099735), getString(2131099739), getString(2131099741)));
                    r2 = jSONObject3.optString("nazwa");
                    if (!m3283j().equals("PL")) {
                        r2 = jSONObject3.optString("nazwaO");
                    }
                    r4 = jSONObject3.optString("naleznosc");
                    r6 = jSONObject3.optString("wplata");
                    this.f2046m.add(new C0637g(r2, jSONObject3.optString("dataPlatnosci"), r4, jSONObject3.optString("dataWplaty"), r6, jSONObject3.optString("saldo"), jSONObject3.optString("konto")));
                }
            }
            this.f2047n.notifyDataSetChanged();
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3279a(getString(2131099676));
        }
    }

    public void m3281b(String str, int i) {
        try {
            if (this.f2048o.isShowing()) {
                this.f2048o.dismiss();
            }
        } catch (Exception e) {
        }
        m3279a(getString(2131099678));
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3282i() {
        ((TextView) findViewById(2131427476)).setText(2131099916);
        TextView textView = (TextView) findViewById(2131427485);
        this.f2046m = new ArrayList();
        this.f2047n = new C0011i(this, this.f2046m);
        ((ListView) findViewById(2131427461)).setAdapter(this.f2047n);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        sharedPreferences.getString("LOGINTYPE", "");
        String string = sharedPreferences.getString("AUTHKEY", null);
        String string2 = sharedPreferences.getString("USERID", null);
        this.f2048o = new ProgressDialog(this);
        this.f2048o.setMessage(getString(2131099679));
        C0660a c0660a = new C0660a(this);
        this.f2048o.show();
        c0660a.m3358f(string2, string, getIntent().getStringExtra("PRZYNALEZNOSCID"), 0);
    }

    public String m3283j() {
        return getResources().getConfiguration().locale.toString().equals("pl_PL") ? "PL" : "";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968612);
        m3282i();
    }
}
