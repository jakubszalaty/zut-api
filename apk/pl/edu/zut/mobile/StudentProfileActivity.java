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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0012j;
import pl.edu.zut.mobile.C0660a.C0644c;

public class StudentProfileActivity extends C0399b implements C0644c {
    private ProgressDialog f2075A;
    private int f2076B;
    private final int f2077m;
    private final int f2078n;
    private List<String> f2079o;
    private List<String> f2080p;
    private List<String> f2081q;
    private List<String> f2082r;
    private C0012j f2083s;
    private C0012j f2084t;
    private ListView f2085u;
    private ListView f2086v;
    private C0660a f2087w;
    private String f2088x;
    private String f2089y;
    private String f2090z;

    public StudentProfileActivity() {
        this.f2077m = 1000;
        this.f2078n = 1001;
        this.f2076B = 1;
    }

    public void m3302a(Bitmap bitmap, int i) {
        ((ImageView) findViewById(2131427464)).setImageBitmap(bitmap);
    }

    void m3303a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3304a(String str, int i) {
        try {
            if (this.f2075A.isShowing()) {
                this.f2075A.dismiss();
            }
        } catch (Exception e) {
        }
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("OK")) {
                if (jSONObject.optString("pierwszeImie") != null && jSONObject.optString("pierwszeImie").length() > 0) {
                    this.f2079o.add(getString(2131099781));
                    this.f2080p.add(jSONObject.optString("pierwszeImie"));
                }
                if (jSONObject.optString("drugieImie") != null && jSONObject.optString("drugieImie").length() > 0) {
                    this.f2079o.add(getString(2131099822));
                    this.f2080p.add(jSONObject.optString("drugieImie"));
                }
                if (jSONObject.optString("nazwisko") != null && jSONObject.optString("nazwisko").length() > 0) {
                    this.f2079o.add(getString(2131099791));
                    this.f2080p.add(jSONObject.optString("nazwisko"));
                }
                if (jSONObject.optString("pesel") != null && jSONObject.optString("pesel").length() > 0) {
                    this.f2079o.add(getString(2131099812));
                    this.f2080p.add(jSONObject.optString("pesel"));
                }
                if (jSONObject.optString("nrDowodu") != null && jSONObject.optString("nrDowodu").length() > 0) {
                    this.f2079o.add(getString(2131099767));
                    this.f2080p.add(jSONObject.optString("nrDowodu"));
                }
                if (jSONObject.optString("nip") != null && jSONObject.optString("nip").length() > 0) {
                    this.f2079o.add(getString(2131099800));
                    this.f2080p.add(jSONObject.optString("nip"));
                }
                if (jSONObject.optString("nrKonta") != null && jSONObject.optString("nrKonta").length() > 0) {
                    this.f2079o.add(getString(2131099836));
                    this.f2080p.add(jSONObject.optString("nrKonta"));
                }
                if (jSONObject.optString("dataUrodzenia") != null && jSONObject.optString("dataUrodzenia").length() > 0) {
                    this.f2079o.add(getString(2131099756));
                    this.f2080p.add(jSONObject.optString("dataUrodzenia"));
                }
                if (jSONObject.optString("miastoUrodzenia") != null && jSONObject.optString("miastoUrodzenia").length() > 0) {
                    this.f2079o.add(getString(2131099814));
                    this.f2080p.add(jSONObject.optString("miastoUrodzenia"));
                }
                if (jSONObject.optString("imieOjca") != null && jSONObject.optString("imieOjca").length() > 0) {
                    this.f2079o.add(getString(2131099779));
                    this.f2080p.add(jSONObject.optString("imieOjca"));
                }
                if (jSONObject.optString("imieMatki") != null && jSONObject.optString("imieMatki").length() > 0) {
                    this.f2079o.add(getString(2131099797));
                    this.f2080p.add(jSONObject.optString("imieMatki"));
                }
                if (jSONObject.optString("obywatelstwo") != null && jSONObject.optString("obywatelstwo").length() > 0) {
                    this.f2079o.add(getString(2131099746));
                    this.f2080p.add(jSONObject.optString("obywatelstwo"));
                }
                if (jSONObject.optString("narodowosc") != null && jSONObject.optString("narodowosc").length() > 0) {
                    this.f2079o.add(getString(2131099799));
                    this.f2080p.add(jSONObject.optString("narodowosc"));
                }
                if (jSONObject.optString("stanCywilny") != null && jSONObject.optString("stanCywilny").length() > 0) {
                    this.f2079o.add(getString(2131099796));
                    this.f2080p.add(jSONObject.optString("stanCywilny"));
                }
                if (jSONObject.optString("plec") != null && jSONObject.optString("plec").length() > 0) {
                    this.f2079o.add(getString(2131099829));
                    this.f2080p.add(jSONObject.optString("plec"));
                }
                this.f2083s.notifyDataSetChanged();
                if (jSONObject.optString("email") != null && jSONObject.optString("email").length() > 0) {
                    this.f2081q.add(getString(2131099771));
                    this.f2082r.add(jSONObject.optString("email"));
                }
                if (jSONObject.optString("emailZut") != null && jSONObject.optString("emailZut").length() > 0) {
                    this.f2081q.add(getString(2131099772));
                    this.f2082r.add(jSONObject.optString("emailZut"));
                }
                if (jSONObject.optString("telefon") != null && jSONObject.optString("telefon").length() > 0) {
                    this.f2081q.add(getString(2131099813));
                    this.f2082r.add(jSONObject.optString("telefon"));
                }
                if (jSONObject.optString("komorka") != null && jSONObject.optString("komorka").length() > 0) {
                    this.f2081q.add(getString(2131099742));
                    this.f2082r.add(jSONObject.optString("komorka"));
                }
                this.f2081q.add(getString(2131099811));
                this.f2082r.add("");
                if (jSONObject.optString("kodStaly") != null && jSONObject.optString("kodStaly").length() > 0) {
                    this.f2081q.add(getString(2131099816));
                    this.f2082r.add(jSONObject.optString("kodStaly"));
                }
                if (jSONObject.optString("ulicaStaly") != null && jSONObject.optString("ulicaStaly").length() > 0) {
                    this.f2081q.add(getString(2131099834));
                    this.f2082r.add(jSONObject.optString("ulicaStaly"));
                }
                if (jSONObject.optString("miastoStaly") != null && jSONObject.optString("miastoStaly").length() > 0) {
                    this.f2081q.add(getString(2131099747));
                    this.f2082r.add(jSONObject.optString("miastoStaly"));
                }
                if (jSONObject.optString("wojewodztwoStaly") != null && jSONObject.optString("wojewodztwoStaly").length() > 0) {
                    this.f2081q.add(getString(2131099819));
                    this.f2082r.add(jSONObject.optString("wojewodztwoStaly"));
                }
                if (jSONObject.optString("krajStaly") != null && jSONObject.optString("krajStaly").length() > 0) {
                    this.f2081q.add(getString(2131099750));
                    this.f2082r.add(jSONObject.optString("krajStaly"));
                }
                if (jSONObject.optString("kodKorespondencja") != null && jSONObject.optString("kodKorespondencja").length() > 0) {
                    this.f2081q.add(getString(2131099749));
                    this.f2082r.add("");
                    if (jSONObject.optString("kodKorespondencja") != null && jSONObject.optString("kodKorespondencja").length() > 0) {
                        this.f2081q.add(getString(2131099816));
                        this.f2082r.add(jSONObject.optString("kodKorespondencja"));
                    }
                    if (jSONObject.optString("ulicaKorespondencja") != null && jSONObject.optString("ulicaKorespondencja").length() > 0) {
                        this.f2081q.add(getString(2131099834));
                        this.f2082r.add(jSONObject.optString("ulicaKorespondencja"));
                    }
                    if (jSONObject.optString("miastoKorespondencja") != null && jSONObject.optString("miastoKorespondencja").length() > 0) {
                        this.f2081q.add(getString(2131099747));
                        this.f2082r.add(jSONObject.optString("miastoKorespondencja"));
                    }
                    if (jSONObject.optString("wojewodztwoKorespondencja") != null && jSONObject.optString("wojewodztwoKorespondencja").length() > 0) {
                        this.f2081q.add(getString(2131099819));
                        this.f2082r.add(jSONObject.optString("wojewodztwoKorespondencja"));
                    }
                    if (jSONObject.optString("krajKorespondencja") != null && jSONObject.optString("krajKorespondencja").length() > 0) {
                        this.f2081q.add(getString(2131099750));
                        this.f2082r.add(jSONObject.optString("krajKorespondencja"));
                    }
                }
                this.f2084t.notifyDataSetChanged();
                if (obj != null) {
                    m3303a(getString(2131099676));
                }
            }
            if (jSONObject != null) {
                if (jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                    m3303a(getString(2131099860));
                    startActivity(new Intent(this, LoginActivity.class));
                }
            }
            if (obj != null) {
                m3303a(getString(2131099676));
            }
        } catch (JSONException e2) {
            obj = 1;
        }
    }

    public void addressButtonClicked(View view) {
        Button button = (Button) findViewById(2131427466);
        Button button2 = (Button) findViewById(2131427467);
        button2.setBackgroundColor(getResources().getColor(2131361813));
        button2.setTextColor(-1);
        button.setBackgroundColor(-1);
        button.setTextColor(getResources().getColor(2131361813));
        this.f2085u.setVisibility(4);
        this.f2086v.setVisibility(0);
        this.f2076B = 2;
    }

    public void m3305b(String str, int i) {
        try {
            if (this.f2075A.isShowing()) {
                this.f2075A.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        if (i == 1000) {
            str2 = getString(2131099678);
        } else if (i == 1001) {
            str2 = getString(2131099678);
        }
        m3303a(str2);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3306i() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels / 8;
        ImageView imageView = (ImageView) findViewById(2131427464);
        imageView.getLayoutParams().height = i;
        imageView.getLayoutParams().width = i;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2088x = sharedPreferences.getString("AUTHKEY", "");
        this.f2089y = sharedPreferences.getString("USERID", null);
        this.f2090z = sharedPreferences.getString("USERNAME", "");
        String string = sharedPreferences.getString("IMAGEURL", "");
        ((TextView) findViewById(2131427465)).setText(this.f2090z);
        this.f2079o = new ArrayList();
        this.f2080p = new ArrayList();
        this.f2083s = new C0012j(this, this.f2079o, this.f2080p);
        this.f2085u = (ListView) findViewById(2131427468);
        this.f2085u.setAdapter(this.f2083s);
        this.f2085u.setVisibility(0);
        this.f2081q = new ArrayList();
        this.f2082r = new ArrayList();
        this.f2084t = new C0012j(this, this.f2081q, this.f2082r);
        this.f2086v = (ListView) findViewById(2131427469);
        this.f2086v.setAdapter(this.f2084t);
        this.f2086v.setVisibility(4);
        this.f2075A = new ProgressDialog(this);
        this.f2087w = new C0660a(this);
        this.f2075A.setMessage(getString(2131099679));
        this.f2075A.show();
        this.f2087w.m3348b(this.f2088x, this.f2089y, 1000);
        this.f2087w.m3340a(string, i, 0);
    }

    public void m3307j() {
        Button button = (Button) findViewById(2131427466);
        Button button2 = (Button) findViewById(2131427467);
        if (this.f2076B == 1) {
            button.setBackgroundColor(getResources().getColor(2131361813));
            button.setTextColor(-1);
            button2.setBackgroundColor(-1);
            button2.setTextColor(getResources().getColor(2131361813));
            this.f2085u.setVisibility(0);
            this.f2086v.setVisibility(4);
        } else if (this.f2076B == 2) {
            button.setBackgroundColor(-1);
            button.setTextColor(getResources().getColor(2131361813));
            button2.setBackgroundColor(getResources().getColor(2131361813));
            button2.setTextColor(-1);
            this.f2085u.setVisibility(4);
            this.f2086v.setVisibility(0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968615);
        m3306i();
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
        this.f2076B = bundle.getInt("activePanel");
    }

    protected void onResume() {
        super.onResume();
        m3307j();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activePanel", this.f2076B);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    public void profileButtonAction(View view) {
        Button button = (Button) findViewById(2131427466);
        Button button2 = (Button) findViewById(2131427467);
        button.setBackgroundColor(getResources().getColor(2131361813));
        button.setTextColor(-1);
        button2.setBackgroundColor(-1);
        button2.setTextColor(getResources().getColor(2131361813));
        this.f2085u.setVisibility(0);
        this.f2086v.setVisibility(4);
        this.f2076B = 1;
    }

    public void profileTextClicked(View view) {
    }
}
