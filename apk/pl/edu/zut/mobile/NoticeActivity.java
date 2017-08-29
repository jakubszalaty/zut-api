package pl.edu.zut.mobile;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;
import pl.edu.zut.mobile.C0660a.C0644c;

public class NoticeActivity extends C0399b implements C0644c {
    private String f2019A;
    private String f2020B;
    private String f2021C;
    private ProgressDialog f2022D;
    WebView f2023m;
    TextView f2024n;
    TextView f2025o;
    TextView f2026p;
    TextView f2027q;
    private final int f2028r;
    private String f2029s;
    private String f2030t;
    private C0660a f2031u;
    private String f2032v;
    private String f2033w;
    private String f2034x;
    private String f2035y;
    private String f2036z;

    public NoticeActivity() {
        this.f2028r = 1000;
        this.f2029s = "text/html";
        this.f2030t = "UTF-8";
    }

    public void m3266a(Bitmap bitmap, int i) {
    }

    void m3267a(String str) {
        Builder builder = new Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(2131099696, null);
        builder.create().show();
    }

    public void m3268a(String str, int i) {
        Object obj;
        try {
            if (this.f2022D.isShowing()) {
                this.f2022D.dismiss();
            }
        } catch (Exception e) {
        }
        if (i == 1000) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                    m3267a("Wymagane ponowne logowanie");
                    startActivity(new Intent(this, LoginActivity.class));
                }
                if (str == null || !str.contains("Ogloszenie")) {
                    m3267a(getString(2131099682));
                } else {
                    jSONObject = (JSONObject) jSONObject.get("Ogloszenie");
                    this.f2036z = jSONObject.optString("data");
                    this.f2019A = jSONObject.optString("nadawca");
                    this.f2035y = jSONObject.optString("tytul");
                    this.f2021C = jSONObject.optString("tresc");
                    this.f2020B = jSONObject.optString("odczyt");
                    this.f2023m.loadDataWithBaseURL("", this.f2021C, this.f2029s, this.f2030t, "");
                    this.f2024n.setText(this.f2035y);
                    this.f2026p.setText(this.f2036z);
                    this.f2027q.setText(this.f2019A);
                }
            } catch (JSONException e2) {
                obj = 1;
            }
        }
        obj = null;
        if (obj != null) {
            m3267a(getString(2131099683));
        }
    }

    public void m3269b(String str, int i) {
        if (this.f2022D.isShowing()) {
            this.f2022D.dismiss();
        }
        String str2 = "";
        if (i == 1000) {
            str2 = getString(2131099678);
        }
        m3267a(str2);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3270i() {
        this.f2024n = (TextView) findViewById(2131427412);
        this.f2025o = (TextView) findViewById(2131427476);
        this.f2025o.setText(2131099913);
        this.f2026p = (TextView) findViewById(2131427414);
        this.f2027q = (TextView) findViewById(2131427458);
        this.f2023m = (WebView) findViewById(2131427454);
        this.f2024n.setText("");
        this.f2026p.setText("");
        this.f2027q.setText("");
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2033w = sharedPreferences.getString("AUTHKEY", null);
        this.f2032v = sharedPreferences.getString("USERID", null);
        this.f2022D = new ProgressDialog(this);
        this.f2031u = new C0660a(this);
        this.f2034x = getIntent().getStringExtra("ogloszenieId");
        this.f2022D.show();
        this.f2031u.m3356d(this.f2032v, this.f2033w, this.f2034x, "0", 1000);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968609);
        m3270i();
    }
}
