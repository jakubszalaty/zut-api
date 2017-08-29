package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0008f;
import p000a.C0012j;
import p022b.C0634d;
import pl.edu.zut.mobile.C0660a.C0644c;

public class StudentStudiesActivity extends C0399b implements C0644c {
    private boolean f2091A;
    private String f2092B;
    private String f2093C;
    private String f2094D;
    private ProgressDialog f2095E;
    private int f2096F;
    private final int f2097m;
    private final int f2098n;
    private final int f2099o;
    private List<String> f2100p;
    private List<String> f2101q;
    private List<String> f2102r;
    private List<String> f2103s;
    private ListView f2104t;
    private ListView f2105u;
    private List<C0634d> f2106v;
    private ListView f2107w;
    private C0012j f2108x;
    private C0012j f2109y;
    private C0008f f2110z;

    public StudentStudiesActivity() {
        this.f2097m = 1000;
        this.f2098n = 1001;
        this.f2099o = 1002;
        this.f2096F = 1;
    }

    public void m3308a(Bitmap bitmap, int i) {
        ((ImageView) findViewById(2131427464)).setImageBitmap(bitmap);
    }

    void m3309a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3310a(String str, int i) {
        Object string;
        try {
            if (this.f2095E.isShowing()) {
                this.f2095E.dismiss();
            }
        } catch (Exception e) {
        }
        int i2 = getResources().getConfiguration().orientation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3309a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (i == 1000) {
                this.f2100p.add(getString(2131099837));
                this.f2101q.add(jSONObject.optString("album"));
                this.f2100p.add(getString(2131099762));
                if (m3314k().equals("PL")) {
                    this.f2101q.add(jSONObject.optString("wydzial"));
                } else {
                    this.f2101q.add(jSONObject.optString("wydzialAng"));
                }
                if (this.f2091A) {
                    this.f2100p.add(getString(2131099765));
                } else {
                    this.f2100p.add(getString(2131099778));
                }
                if (m3314k().equals("PL")) {
                    this.f2101q.add(jSONObject.optString("kierunek"));
                } else {
                    this.f2101q.add(jSONObject.optString("kierunekAng"));
                }
                this.f2100p.add(getString(2131099782));
                if (m3314k().equals("PL")) {
                    this.f2101q.add(jSONObject.optString("forma"));
                } else {
                    this.f2101q.add(jSONObject.optString("formaAng"));
                }
                this.f2100p.add(getString(2131099792));
                if (m3314k().equals("PL")) {
                    this.f2101q.add(jSONObject.optString("poziom"));
                } else {
                    this.f2101q.add(jSONObject.optString("poziomAng"));
                }
                if (jSONObject.optString("specjalnosc") != null && jSONObject.optString("specjalnosc").length() > 0) {
                    this.f2100p.add(getString(2131099830));
                    if (m3314k().equals("PL")) {
                        this.f2101q.add(jSONObject.optString("specjalnosc"));
                    } else {
                        this.f2101q.add(jSONObject.optString("specjalnoscO"));
                    }
                }
                if (jSONObject.optString("specjalizacja") != null && jSONObject.optString("specjalizacja").length() > 0) {
                    this.f2100p.add(getString(2131099831));
                    if (m3314k().equals("PL")) {
                        this.f2101q.add(jSONObject.optString("specjalizacja"));
                    } else {
                        this.f2101q.add(jSONObject.optString("specjalizacjaO"));
                    }
                }
                this.f2100p.add(getString(2131099832));
                if (m3314k().equals("PL")) {
                    this.f2101q.add(jSONObject.optString("status"));
                } else {
                    this.f2101q.add(jSONObject.optString("statusAng"));
                }
                this.f2100p.add(getString(2131099856));
                this.f2101q.add(jSONObject.optString("rokAkademicki"));
                this.f2100p.add(getString(2131099826));
                this.f2101q.add(jSONObject.optString("nrSemestru") + " " + jSONObject.optString("pora"));
                this.f2108x.notifyDataSetChanged();
            } else if (i == 1001) {
                JSONObject jSONObject2 = new JSONObject(str);
                if (str == null || !str.contains("Przebieg")) {
                    m3309a(getString(2131099686));
                } else if (jSONObject2.get("Przebieg") instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("Przebieg");
                    String optString;
                    String str2;
                    String optString2;
                    if (i2 == 1) {
                        this.f2106v.add(new C0634d(getString(2131099857), getString(2131099827), getString(2131099754), getString(2131099832)));
                        for (i2 = 0; i2 < jSONArray.length(); i2++) {
                            jSONObject = jSONArray.getJSONObject(i2);
                            optString = jSONObject.optString("rokAkademicki");
                            str2 = jSONObject.optString("nrSemestru") + " " + jSONObject.optString("pora");
                            optString2 = jSONObject.optString("dataOd");
                            String optString3 = jSONObject.optString("status");
                            if (!m3314k().equals("PL")) {
                                optString3 = jSONObject.optString("statusO");
                            }
                            this.f2106v.add(new C0634d(optString, str2, optString2, optString3));
                        }
                    } else {
                        this.f2106v.add(new C0634d(getString(2131099856), getString(2131099826), getString(2131099754), getString(2131099759), getString(2131099832), getString(2131099748)));
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            jSONObject2 = jSONArray.getJSONObject(i3);
                            String optString4 = jSONObject2.optString("rokAkademicki");
                            String str3 = jSONObject2.optString("nrSemestru") + " " + jSONObject2.optString("pora");
                            optString = jSONObject2.optString("dataOd");
                            str2 = jSONObject2.optString("dataDo");
                            optString2 = jSONObject2.optString("status");
                            if (!m3314k().equals("PL")) {
                                optString2 = jSONObject2.optString("statusO");
                            }
                            this.f2106v.add(new C0634d(optString4, str3, optString, str2, optString2));
                        }
                    }
                } else {
                    JSONObject jSONObject3 = (JSONObject) jSONObject2.get("Przebieg");
                    if (i2 == 1) {
                        this.f2106v.add(new C0634d(getString(2131099857), getString(2131099827), getString(2131099754), getString(2131099832)));
                        this.f2106v.add(new C0634d(jSONObject3.optString("rokAkademicki"), jSONObject3.optString("nrSemestru") + " " + jSONObject3.optString("pora"), jSONObject3.optString("dataOd"), jSONObject3.optString("status")));
                    } else {
                        this.f2106v.add(new C0634d(getString(2131099856), getString(2131099826), getString(2131099754), getString(2131099759), getString(2131099832), getString(2131099748)));
                        this.f2106v.add(new C0634d(jSONObject3.optString("rokAkademicki"), jSONObject3.optString("nrSemestru") + " " + jSONObject3.optString("pora"), jSONObject3.optString("dataOd"), jSONObject3.optString("dataDo"), jSONObject3.optString("status"), jSONObject3.optString("powod")));
                    }
                }
                this.f2110z.notifyDataSetChanged();
            } else if (i == 1002) {
                this.f2102r.add(getString(2131099845));
                this.f2103s.add(jSONObject.optString("tytulPracy"));
                this.f2102r.add(getString(2131099841));
                this.f2103s.add(jSONObject.optString("promotor"));
                if (jSONObject.optString("promotor2") != null && jSONObject.optString("promotor2").length() > 0) {
                    this.f2102r.add(getString(2131099824));
                    this.f2103s.add(jSONObject.optString("promotor2"));
                }
                this.f2102r.add(getString(2131099820));
                this.f2103s.add(jSONObject.optString("recenzent"));
                if (jSONObject.optString("recenzent2") != null && jSONObject.optString("recenzent2").length() > 0) {
                    this.f2102r.add(getString(2131099823));
                    this.f2103s.add(jSONObject.optString("recenzent2"));
                }
                this.f2102r.add(getString(2131099818));
                this.f2103s.add(jSONObject.optString("przewodniczacy"));
                this.f2102r.add(getString(2131099758));
                this.f2103s.add(jSONObject.optString("dataZlozeniaPracy"));
                this.f2102r.add(getString(2131099844));
                this.f2103s.add(jSONObject.optString("ocenaPracaDyplomowa"));
                this.f2102r.add(getString(2131099773));
                this.f2103s.add(jSONObject.optString("ocenaEgzaminDyplomowy"));
                this.f2102r.add(getString(2131099753));
                this.f2103s.add(jSONObject.optString("dataObrony"));
                this.f2102r.add(getString(2131099774));
                this.f2103s.add(jSONObject.optString("ocenaPromotora"));
                if (jSONObject.optString("ocenaPromotora2") != null && jSONObject.optString("ocenaPromotora2").length() > 0) {
                    this.f2102r.add(getString(2131099776));
                    this.f2103s.add(jSONObject.optString("ocenaPromotora2"));
                }
                this.f2102r.add(getString(2131099775));
                this.f2103s.add(jSONObject.optString("ocenaRecenzenta"));
                if (jSONObject.optString("ocenaRecenzenta2") != null && jSONObject.optString("ocenaRecenzenta2").length() > 0) {
                    this.f2102r.add(getString(2131099777));
                    this.f2103s.add(jSONObject.optString("ocenaRecenzenta2"));
                }
                this.f2102r.add(getString(2131099755));
                this.f2103s.add(jSONObject.optString("dataWystawienia"));
                this.f2102r.add(getString(2131099752));
                this.f2103s.add(jSONObject.optString("dataWydania"));
                this.f2102r.add(getString(2131099763));
                this.f2103s.add(jSONObject.optString("nrDyplomu"));
                this.f2102r.add(getString(2131099803));
                this.f2103s.add(jSONObject.optString("uwagi"));
                string = getString(2131099858);
                if (jSONObject.optString("dyplomDoOdbioru").equals("0")) {
                    string = getString(2131099801);
                }
                this.f2102r.add(getString(2131099764));
                this.f2103s.add(string);
                this.f2110z.notifyDataSetChanged();
            }
            string = null;
        } catch (JSONException e2) {
            int i4 = 1;
        }
        if (string != null) {
            m3309a(getString(2131099676));
        }
    }

    public void m3311b(String str, int i) {
        try {
            if (this.f2095E.isShowing()) {
                this.f2095E.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        if (i == 1000) {
            str2 = getString(2131099678);
        } else if (i == 1001) {
            str2 = getString(2131099678);
        } else if (i == 1002) {
            str2 = getString(2131099678);
        }
        m3309a(str2);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void diplomaButtonAction(View view) {
        Button button = (Button) findViewById(2131427470);
        Button button2 = (Button) findViewById(2131427471);
        Button button3 = (Button) findViewById(2131427472);
        button.setBackgroundColor(-1);
        button.setTextColor(getResources().getColor(2131361813));
        button2.setBackgroundColor(-1);
        button2.setTextColor(getResources().getColor(2131361813));
        button3.setBackgroundColor(getResources().getColor(2131361813));
        button3.setTextColor(-1);
        this.f2104t.setVisibility(4);
        this.f2107w.setVisibility(4);
        this.f2105u.setVisibility(0);
        this.f2096F = 3;
    }

    public void m3312i() {
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        ((TextView) findViewById(2131427476)).setText(2131099920);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2093C = sharedPreferences.getString("AUTHKEY", null);
        this.f2094D = sharedPreferences.getString("LOGINTYPE", "");
        this.f2092B = sharedPreferences.getString("USERID", null);
        this.f2100p = new ArrayList();
        this.f2101q = new ArrayList();
        this.f2108x = new C0012j(this, this.f2100p, this.f2101q);
        this.f2104t = (ListView) findViewById(2131427473);
        this.f2104t.setAdapter(this.f2108x);
        this.f2104t.setVisibility(0);
        this.f2106v = new ArrayList();
        this.f2110z = new C0008f(this, this.f2106v);
        this.f2107w = (ListView) findViewById(2131427474);
        this.f2107w.setAdapter(this.f2110z);
        this.f2107w.setVisibility(4);
        this.f2102r = new ArrayList();
        this.f2103s = new ArrayList();
        this.f2109y = new C0012j(this, this.f2102r, this.f2103s);
        this.f2105u = (ListView) findViewById(2131427475);
        this.f2105u.setAdapter(this.f2109y);
        this.f2105u.setVisibility(4);
        this.f2095E = new ProgressDialog(this);
        this.f2095E.setMessage(getString(2131099679));
        C0660a c0660a = new C0660a(this);
        this.f2095E.show();
        String stringExtra = getIntent().getStringExtra("PRZYNALEZNOSCID");
        this.f2091A = getIntent().getBooleanExtra("DOKTORANT", false);
        if (this.f2091A) {
            ((Button) findViewById(2131427472)).setText(2131099889);
        }
        c0660a.m3349b(this.f2092B, this.f2093C, stringExtra, 1000);
        c0660a.m3354c(this.f2092B, this.f2093C, stringExtra, "false", 1001);
        c0660a.m3346a(this.f2092B, this.f2093C, stringExtra, this.f2091A, 1002);
    }

    public void m3313j() {
        Button button = (Button) findViewById(2131427470);
        Button button2 = (Button) findViewById(2131427471);
        Button button3 = (Button) findViewById(2131427472);
        if (this.f2096F == 1) {
            button.setBackgroundColor(getResources().getColor(2131361813));
            button.setTextColor(-1);
            button2.setBackgroundColor(-1);
            button2.setTextColor(getResources().getColor(2131361813));
            button3.setBackgroundColor(-1);
            button3.setTextColor(getResources().getColor(2131361813));
            this.f2104t.setVisibility(0);
            this.f2107w.setVisibility(4);
            this.f2105u.setVisibility(4);
        } else if (this.f2096F == 2) {
            button.setBackgroundColor(-1);
            button.setTextColor(getResources().getColor(2131361813));
            button2.setBackgroundColor(getResources().getColor(2131361813));
            button2.setTextColor(-1);
            button3.setBackgroundColor(-1);
            button3.setTextColor(getResources().getColor(2131361813));
            this.f2104t.setVisibility(4);
            this.f2107w.setVisibility(0);
            this.f2105u.setVisibility(4);
        } else if (this.f2096F == 3) {
            button.setBackgroundColor(-1);
            button.setTextColor(getResources().getColor(2131361813));
            button2.setBackgroundColor(-1);
            button2.setTextColor(getResources().getColor(2131361813));
            button3.setBackgroundColor(getResources().getColor(2131361813));
            button3.setTextColor(-1);
            this.f2104t.setVisibility(4);
            this.f2107w.setVisibility(4);
            this.f2105u.setVisibility(0);
        }
    }

    public String m3314k() {
        return getResources().getConfiguration().locale.toString().equals("pl_PL") ? "PL" : "";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968616);
        m3312i();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f2096F = bundle.getInt("activePanel");
    }

    protected void onResume() {
        super.onResume();
        m3313j();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activePanel", this.f2096F);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    public void studiesButtonAction(View view) {
        Button button = (Button) findViewById(2131427470);
        Button button2 = (Button) findViewById(2131427471);
        Button button3 = (Button) findViewById(2131427472);
        button.setBackgroundColor(-1);
        button.setTextColor(getResources().getColor(2131361813));
        button2.setBackgroundColor(getResources().getColor(2131361813));
        button2.setTextColor(-1);
        button3.setBackgroundColor(-1);
        button3.setTextColor(getResources().getColor(2131361813));
        this.f2104t.setVisibility(4);
        this.f2107w.setVisibility(0);
        this.f2105u.setVisibility(4);
        this.f2096F = 2;
    }

    public void studyButtonAction(View view) {
        Button button = (Button) findViewById(2131427470);
        Button button2 = (Button) findViewById(2131427471);
        Button button3 = (Button) findViewById(2131427472);
        button.setBackgroundColor(getResources().getColor(2131361813));
        button.setTextColor(-1);
        button2.setBackgroundColor(-1);
        button2.setTextColor(getResources().getColor(2131361813));
        button3.setBackgroundColor(-1);
        button3.setTextColor(getResources().getColor(2131361813));
        this.f2104t.setVisibility(0);
        this.f2107w.setVisibility(4);
        this.f2105u.setVisibility(4);
        this.f2096F = 1;
    }
}
