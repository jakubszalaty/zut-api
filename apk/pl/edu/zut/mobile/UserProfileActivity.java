package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0014l;
import pl.edu.zut.mobile.C0660a.C0644c;

public class UserProfileActivity extends C0399b implements C0644c {
    TextView f2111m;
    private List<String> f2112n;
    private List<String> f2113o;
    private C0014l f2114p;
    private ProgressDialog f2115q;
    private String f2116r;

    public void m3315a(Bitmap bitmap, int i) {
        ((ImageView) findViewById(2131427477)).setImageBitmap(bitmap);
    }

    void m3316a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3317a(String str, int i) {
        Object obj;
        try {
            if (this.f2115q.isShowing()) {
                this.f2115q.dismiss();
            }
        } catch (Exception e) {
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3316a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (!(jSONObject.optString("album") == null || jSONObject.optString("album").equals("0"))) {
                this.f2112n.add("Nr albumu");
                this.f2113o.add(jSONObject.optString("album"));
            }
            this.f2112n.add(getString(2131099798));
            this.f2113o.add(jSONObject.optString("pierwszeImie"));
            this.f2112n.add(getString(2131099791));
            this.f2113o.add(jSONObject.optString("nazwisko"));
            String str2 = "";
            if (jSONObject.optString("tytul") != null && jSONObject.optString("tytul").length() > 0) {
                this.f2112n.add(getString(2131099732));
                this.f2113o.add(jSONObject.optString("tytul"));
                str2 = str2 + jSONObject.optString("tytul") + " ";
            }
            str2 + jSONObject.optString("pierwszeImie") + " " + jSONObject.optString("nazwisko");
            if (jSONObject.optString("email") != null && jSONObject.optString("email").length() > 0) {
                this.f2112n.add(getString(2131099771));
                this.f2113o.add(jSONObject.optString("email"));
            }
            if (jSONObject.optString("emailZut") != null && jSONObject.optString("emailZut").length() > 0) {
                this.f2112n.add(getString(2131099772));
                this.f2113o.add(jSONObject.optString("emailZut"));
            }
            if (jSONObject.optString("stanowisko") != null && jSONObject.optString("stanowisko").length() > 0) {
                this.f2112n.add(getString(2131099815));
                this.f2113o.add(jSONObject.optString("stanowisko"));
            }
            if (jSONObject.optString("jednostka") != null && jSONObject.optString("jednostka").length() > 0) {
                this.f2112n.add(getString(2131099846));
                this.f2113o.add(jSONObject.optString("jednostka"));
            }
            if (str != null && str.contains("Konsultacja")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("konsultacje");
                if (!str.contains("Konsultacja")) {
                    m3316a(getString(2131099673));
                } else if (jSONObject2.opt("Konsultacja") instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("Konsultacja");
                    this.f2112n.add("Konsultacje");
                    this.f2113o.add("");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject3.optString("data");
                        String optString2 = jSONObject3.optString("dzien");
                        String optString3 = jSONObject3.optString("godzinaOd");
                        String optString4 = jSONObject3.optString("godzinaDo");
                        String optString5 = jSONObject3.optString("sala");
                        this.f2112n.add(optString + " " + optString2.toLowerCase());
                        this.f2113o.add(optString3 + "-" + optString4 + "   " + optString5);
                    }
                }
            }
            this.f2114p.notifyDataSetChanged();
            this.f2111m.setText(jSONObject.optString("pierwszeImie") + " " + jSONObject.optString("nazwisko"));
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3316a(getString(2131099676));
        }
    }

    public void m3318b(String str, int i) {
        try {
            if (this.f2115q.isShowing()) {
                this.f2115q.dismiss();
            }
        } catch (Exception e) {
        }
        m3316a(getString(2131099678));
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3319i() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels / 8;
        ImageView imageView = (ImageView) findViewById(2131427477);
        imageView.getLayoutParams().height = i;
        imageView.getLayoutParams().width = i;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dydaktykId");
        String stringExtra2 = intent.getStringExtra("album");
        String stringExtra3 = intent.getStringExtra("imageUrl");
        this.f2111m = (TextView) findViewById(2131427428);
        this.f2111m.setText("");
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        String string = sharedPreferences.getString("USERID", null);
        String string2 = sharedPreferences.getString("AUTHKEY", "");
        this.f2116r = sharedPreferences.getString("DYDAKTYKID", null);
        this.f2112n = new ArrayList();
        this.f2113o = new ArrayList();
        C0660a c0660a = new C0660a(this);
        this.f2115q = new ProgressDialog(this);
        this.f2115q.setMessage(getString(2131099679));
        this.f2114p = new C0014l(this, this.f2112n, this.f2113o);
        ((ListView) findViewById(2131427478)).setAdapter(this.f2114p);
        this.f2115q.show();
        c0660a.m3350b(string, string2, stringExtra, stringExtra2, 0);
        if (stringExtra3 != null && stringExtra3.length() > 0) {
            c0660a.m3340a(stringExtra3, i, 0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968618);
        m3319i();
    }

    public void profileTextClicked(View view) {
    }
}
