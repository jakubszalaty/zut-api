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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0010h;
import p022b.C0636f;
import pl.edu.zut.mobile.C0660a.C0644c;

public class StudentNoticesActivity extends C0399b implements C0644c {
    private final int f2064m;
    private final int f2065n;
    private List<C0636f> f2066o;
    private ListView f2067p;
    private C0010h f2068q;
    private C0660a f2069r;
    private String f2070s;
    private String f2071t;
    private String f2072u;
    private ProgressDialog f2073v;
    private int f2074w;

    /* renamed from: pl.edu.zut.mobile.StudentNoticesActivity.1 */
    class C06541 implements OnItemClickListener {
        final /* synthetic */ StudentNoticesActivity f2063a;

        C06541(StudentNoticesActivity studentNoticesActivity) {
            this.f2063a = studentNoticesActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2063a.m3299b(i);
        }
    }

    public StudentNoticesActivity() {
        this.f2064m = 1000;
        this.f2065n = 1001;
        this.f2074w = 1;
    }

    public void m3296a(Bitmap bitmap, int i) {
        ((ImageView) findViewById(2131427464)).setImageBitmap(bitmap);
    }

    void m3297a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3298a(String str, int i) {
        try {
            if (this.f2073v.isShowing()) {
                this.f2073v.dismiss();
            }
        } catch (Exception e) {
        }
        int i2 = getResources().getConfiguration().orientation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3297a(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (i == 1000) {
                if (str == null || !str.contains("Ogloszenie")) {
                    m3297a(getString(2131099683));
                } else {
                    JSONObject jSONObject2;
                    if (jSONObject.get("Ogloszenie") instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray("Ogloszenie");
                        if (i2 == 1) {
                            for (i2 = 0; i2 < jSONArray.length(); i2++) {
                                jSONObject = jSONArray.getJSONObject(i2);
                                this.f2066o.add(new C0636f(jSONObject.optString("ogloszenieId"), jSONObject.optString("data"), jSONObject.optString("nadawca"), jSONObject.optString("tytul")));
                            }
                        } else {
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                jSONObject2 = jSONArray.getJSONObject(i3);
                                this.f2066o.add(new C0636f(jSONObject2.optString("data"), jSONObject2.optString("nadawca"), jSONObject2.optString("tytul"), jSONObject2.optString("odczyt"), null, jSONObject2.optString("arch")));
                            }
                        }
                    } else {
                        jSONObject2 = (JSONObject) jSONObject.get("Ogloszenie");
                        this.f2066o.add(new C0636f(jSONObject2.optString("ogloszenieId"), jSONObject2.optString("data"), jSONObject2.optString("nadawca"), jSONObject2.optString("tytul"), null));
                    }
                    this.f2068q.notifyDataSetChanged();
                }
            }
            Object obj = null;
        } catch (Exception e2) {
            i2 = 1;
        }
        if (obj != null) {
            m3297a(getString(2131099676));
        }
    }

    public void m3299b(int i) {
        Intent intent = new Intent(this, NoticeActivity.class);
        intent.putExtra("ogloszenieId", ((C0636f) this.f2066o.get(i)).m3193a());
        startActivity(intent);
    }

    public void m3300b(String str, int i) {
        try {
            if (this.f2073v.isShowing()) {
                this.f2073v.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        if (i == 1000) {
            m3297a(getString(2131099678));
        }
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3301i() {
        ((TextView) findViewById(2131427476)).setText(2131099914);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        this.f2071t = sharedPreferences.getString("AUTHKEY", null);
        this.f2072u = sharedPreferences.getString("LOGINTYPE", "");
        this.f2070s = sharedPreferences.getString("USERID", null);
        this.f2066o = new ArrayList();
        this.f2068q = new C0010h(this, this.f2066o);
        this.f2067p = (ListView) findViewById(2131427452);
        this.f2067p.setAdapter(this.f2068q);
        this.f2073v = new ProgressDialog(this);
        this.f2073v.setMessage(getString(2131099679));
        this.f2069r = new C0660a(this);
        this.f2067p.setOnItemClickListener(new C06541(this));
        this.f2073v.show();
        this.f2069r.m3356d(this.f2070s, this.f2071t, null, "0", 1000);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968614);
        m3301i();
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
        this.f2074w = bundle.getInt("activePanel");
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activePanel", this.f2074w);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}
