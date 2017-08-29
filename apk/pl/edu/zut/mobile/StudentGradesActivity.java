package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
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
import p000a.C0007e;
import p000a.C0009g;
import p022b.C0635e;
import p022b.C0641i;
import pl.edu.zut.mobile.C0660a.C0644c;

public class StudentGradesActivity extends C0399b implements C0644c {
    private int f2050m;
    private List<C0641i> f2051n;
    private C0660a f2052o;
    private String f2053p;
    private String f2054q;
    private final int f2055r;
    private final int f2056s;
    private List<C0635e> f2057t;
    private C0009g f2058u;
    private C0007e f2059v;
    private List<String> f2060w;
    private ProgressDialog f2061x;
    private Spinner f2062y;

    /* renamed from: pl.edu.zut.mobile.StudentGradesActivity.1 */
    class C06531 implements OnItemSelectedListener {
        final /* synthetic */ StudentGradesActivity f2049a;

        C06531(StudentGradesActivity studentGradesActivity) {
            this.f2049a = studentGradesActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2049a.f2050m = i;
            String a = ((C0641i) this.f2049a.f2051n.get(i)).m3206a();
            this.f2049a.f2061x.show();
            this.f2049a.f2052o.m3353c(this.f2049a.f2054q, this.f2049a.f2053p, a, 1001);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public StudentGradesActivity() {
        this.f2050m = 0;
        this.f2055r = 1000;
        this.f2056s = 1001;
    }

    public void m3290a(Bitmap bitmap, int i) {
    }

    void m3291a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3292a(String str, int i) {
        Object obj;
        try {
            if (this.f2061x.isShowing()) {
                this.f2061x.dismiss();
            }
        } catch (Exception e) {
        }
        int i2 = getResources().getConfiguration().orientation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3291a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            String optString;
            String optString2;
            String str2;
            String optString3;
            String optString4;
            if (i == 1000) {
                if (str == null || !str.contains("Przebieg")) {
                    m3291a(getString(2131099677));
                } else if (jSONObject.get("Przebieg") instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject.getJSONArray("Przebieg");
                    for (i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        optString = jSONObject2.optString("listaSemestrowId");
                        optString2 = jSONObject2.optString("status");
                        if (!m3295j().equals("PL")) {
                            optString2 = jSONObject2.optString("statusO");
                        }
                        str2 = jSONObject2.optString("nrSemestru") + " " + jSONObject2.optString("pora") + " - " + optString2 + " " + jSONObject2.optString("rokAkademicki");
                        this.f2051n.add(new C0641i(optString, str2, optString2));
                        this.f2060w.add(str2);
                    }
                } else {
                    jSONObject = (JSONObject) jSONObject.get("Menu");
                    optString3 = jSONObject.optString("listaSemestrowId");
                    optString4 = jSONObject.optString("status");
                    if (!m3295j().equals("PL")) {
                        optString4 = jSONObject.optString("statusO");
                    }
                    optString2 = jSONObject.optString("nrSemestru") + " " + jSONObject.optString("pora") + " - " + optString4 + " " + jSONObject.optString("rokAkademicki");
                    this.f2051n.add(new C0641i(optString3, optString2, optString4));
                    this.f2060w.add(optString2);
                }
                this.f2059v.notifyDataSetChanged();
                this.f2062y.setSelection(this.f2050m);
            } else if (i == 1001) {
                this.f2057t.clear();
                if (str == null || !str.contains("Ocena")) {
                    m3291a(getString(2131099677));
                } else if (jSONObject.get("Ocena") instanceof JSONArray) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("Ocena");
                    if (i2 == 1) {
                        this.f2057t.add(new C0635e(getString(2131099840), getString(2131099842), getString(2131099751), getString(2131099784)));
                        for (i2 = 0; i2 < jSONArray2.length(); i2++) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                            str2 = jSONObject3.optString("ocena");
                            optString = jSONObject3.optString("pracownik");
                            r5 = jSONObject3.optString("data");
                            optString2 = jSONObject3.optString("przedmiot");
                            if (!m3295j().equals("PL")) {
                                optString2 = jSONObject3.optString("przedmiotO");
                            }
                            this.f2057t.add(new C0635e(optString2, optString, r5, str2));
                        }
                    } else {
                        this.f2057t.add(new C0635e(getString(2131099840), getString(2131099842), getString(2131099782), getString(2131099843), getString(2131099751), getString(2131099784), getString(2131099768)));
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            jSONObject = jSONArray2.getJSONObject(i3);
                            r6 = jSONObject.optString("ocena");
                            optString3 = jSONObject.optString("pracownik");
                            r5 = jSONObject.optString("data");
                            optString4 = jSONObject.optString("przedmiot");
                            if (!m3295j().equals("PL")) {
                                optString4 = jSONObject.optString("przedmiotO");
                            }
                            str2 = jSONObject.optString("formaZajec");
                            if (!m3295j().equals("PL")) {
                                str2 = jSONObject.optString("formaZajecO");
                            }
                            r7 = jSONObject.optString("ects");
                            optString = jSONObject.optString("termin");
                            if (!m3295j().equals("PL")) {
                                optString = jSONObject.optString("terminO");
                            }
                            this.f2057t.add(new C0635e(optString4, optString3, str2, optString, r5, r6, r7));
                        }
                    }
                } else {
                    jSONObject = (JSONObject) jSONObject.get("Ocena");
                    if (i2 == 1) {
                        optString3 = jSONObject.optString("ocena");
                        this.f2057t.add(new C0635e(!m3295j().equals("PL") ? jSONObject.optString("przedmiotO") : jSONObject.optString("przedmiot"), jSONObject.optString("pracownik"), jSONObject.optString("data"), optString3));
                    } else {
                        r6 = jSONObject.optString("ocena");
                        optString3 = jSONObject.optString("pracownik");
                        r5 = jSONObject.optString("data");
                        optString4 = jSONObject.optString("przedmiot");
                        if (!m3295j().equals("PL")) {
                            optString4 = jSONObject.optString("przedmiotO");
                        }
                        str2 = jSONObject.optString("formaZajec");
                        if (!m3295j().equals("PL")) {
                            str2 = jSONObject.optString("formaZajecO");
                        }
                        r7 = jSONObject.optString("ects");
                        optString = jSONObject.optString("termin");
                        if (!m3295j().equals("PL")) {
                            optString = jSONObject.optString("terminO");
                        }
                        this.f2057t.add(new C0635e(optString4, optString3, str2, optString, r5, r6, r7));
                    }
                }
                this.f2058u.notifyDataSetChanged();
            }
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3291a(getString(2131099676));
        }
    }

    public void m3293b(String str, int i) {
        try {
            if (this.f2061x.isShowing()) {
                this.f2061x.dismiss();
            }
        } catch (Exception e) {
        }
        String string = i == 1000 ? getString(2131099678) : i == 1001 ? getString(2131099678) : getString(2131099678);
        m3291a(string);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3294i() {
        ((TextView) findViewById(2131427476)).setText(2131099912);
        this.f2052o = new C0660a(this);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2053p = sharedPreferences.getString("AUTHKEY", null);
        this.f2054q = sharedPreferences.getString("USERID", null);
        this.f2051n = new ArrayList();
        this.f2060w = new ArrayList();
        String stringExtra = getIntent().getStringExtra("PRZYNALEZNOSCID");
        this.f2061x = new ProgressDialog(this);
        this.f2061x.setMessage(getString(2131099679));
        this.f2052o.m3354c(this.f2054q, this.f2053p, stringExtra, "true", 1000);
        this.f2059v = new C0007e(this, this.f2060w);
        this.f2062y = (Spinner) findViewById(2131427462);
        this.f2062y.setAdapter(this.f2059v);
        this.f2062y.setOnItemSelectedListener(new C06531(this));
        this.f2057t = new ArrayList();
        this.f2058u = new C0009g(this, this.f2057t);
        ((ListView) findViewById(2131427463)).setAdapter(this.f2058u);
    }

    public String m3295j() {
        return getResources().getConfiguration().locale.toString().equals("pl_PL") ? "PL" : "";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968613);
        m3294i();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f2050m = bundle.getInt("selectedSection");
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selectedSection", this.f2050m);
    }
}
