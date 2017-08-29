package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0013k;
import p022b.C0642j;
import pl.edu.zut.mobile.C0660a.C0644c;

public class SearchActivity extends C0399b implements C0644c {
    private List<C0642j> f2039m;
    private List<C0642j> f2040n;
    private C0013k f2041o;
    private C0660a f2042p;
    private final int f2043q;
    private ProgressDialog f2044r;
    private SearchView f2045s;

    /* renamed from: pl.edu.zut.mobile.SearchActivity.1 */
    class C06511 implements OnQueryTextListener {
        final /* synthetic */ SearchActivity f2037a;

        C06511(SearchActivity searchActivity) {
            this.f2037a = searchActivity;
        }

        public boolean onQueryTextChange(String str) {
            this.f2037a.m3272a(str);
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            this.f2037a.m3272a(str);
            return true;
        }
    }

    /* renamed from: pl.edu.zut.mobile.SearchActivity.2 */
    class C06522 implements OnItemClickListener {
        final /* synthetic */ SearchActivity f2038a;

        C06522(SearchActivity searchActivity) {
            this.f2038a = searchActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2038a.m3274b(i);
        }
    }

    public SearchActivity() {
        this.f2043q = 1000000;
    }

    public void m3271a(Bitmap bitmap, int i) {
        ((C0642j) this.f2040n.get(i - 1000000)).m3208a(bitmap);
        this.f2041o.notifyDataSetChanged();
    }

    public void m3272a(String str) {
        this.f2040n.clear();
        for (int i = 0; i < this.f2039m.size(); i++) {
            if (((C0642j) this.f2039m.get(i)).m3209b().toLowerCase().contains(str.toLowerCase())) {
                this.f2040n.add(this.f2039m.get(i));
            }
        }
        this.f2041o.notifyDataSetChanged();
    }

    public void m3273a(String str, int i) {
        Object obj;
        try {
            if (this.f2044r.isShowing()) {
                this.f2044r.dismiss();
            }
        } catch (Exception e) {
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str != null && str.contains("logInStatus") && jSONObject.get("logInStatus").equals("TOKEN OR ID ERROR")) {
                m3275b(getString(2131099860));
                startActivity(new Intent(this, LoginActivity.class));
            }
            if (str == null || !str.contains("Wyszukiwanie")) {
                m3275b(getString(2131099688));
            } else if (jSONObject.get("Wyszukiwanie") instanceof JSONArray) {
                JSONArray jSONArray = jSONObject.getJSONArray("Wyszukiwanie");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    String optString = jSONObject2.optString("dydaktykId");
                    r3 = jSONObject2.optString("tytul").length() > 0 ? ", " + jSONObject2.optString("tytul") : "";
                    String optString2 = jSONObject2.optString("nazwa");
                    r0 = (jSONObject2.optString("imageUrl") == null || jSONObject2.optString("imageUrl").length() <= 0) ? null : "https://www.zut.edu.pl/app-json-proxy/image/?userId=" + optString + "&tokenJpg=" + jSONObject2.optString("imageUrl") + "&cv=TRUE";
                    this.f2039m.add(new C0642j(optString, optString2, r0));
                    this.f2040n.add(new C0642j(optString, optString2 + r3, r0));
                }
            } else {
                jSONObject = (JSONObject) jSONObject.get("Wyszukiwanie");
                String optString3 = jSONObject.optString("dydaktykId");
                r3 = "";
                if (jSONObject.optString("tytul").length() > 0) {
                    r3 = ", " + jSONObject.optString("tytul");
                }
                String optString4 = jSONObject.optString("nazwa");
                r0 = (jSONObject.optString("imageUrl") == null || jSONObject.optString("imageUrl").length() <= 0) ? null : "https://www.zut.edu.pl/app-json-proxy/image/?userId=" + optString3 + "&tokenJpg=" + jSONObject.optString("imageUrl") + "&cv=TRUE";
                this.f2039m.add(new C0642j(optString3, optString4, r0));
                this.f2040n.add(new C0642j(optString3, optString4 + r3, r0));
            }
            this.f2041o.notifyDataSetChanged();
            if (VERSION.SDK_INT >= 11 && this.f2045s.getQuery() != null) {
                m3272a(this.f2045s.getQuery().toString());
            }
            obj = null;
        } catch (JSONException e2) {
            obj = 1;
        }
        if (obj != null) {
            m3275b(getString(2131099676));
        }
    }

    public void m3274b(int i) {
        Intent intent = new Intent(this, UserProfileActivity.class);
        intent.putExtra("dydaktykId", ((C0642j) this.f2040n.get(i)).m3207a());
        intent.putExtra("imageUrl", ((C0642j) this.f2040n.get(i)).m3210c());
        startActivity(intent);
    }

    void m3275b(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3276b(String str, int i) {
        try {
            if (this.f2044r.isShowing()) {
                this.f2044r.dismiss();
            }
        } catch (Exception e) {
        }
        m3275b("");
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3277i() {
        getIntent();
        ((TextView) findViewById(2131427476)).setText(2131099918);
        this.f2045s = (SearchView) findViewById(2131427459);
        if (VERSION.SDK_INT >= 11) {
            this.f2045s.setOnQueryTextListener(new C06511(this));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968611);
        m3277i();
    }

    protected void onStart() {
        super.onStart();
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mZut", 0);
        String string = sharedPreferences.getString("AUTHKEY", "");
        String string2 = sharedPreferences.getString("USERID", null);
        this.f2044r = new ProgressDialog(this);
        this.f2044r.setMessage(getString(2131099679));
        this.f2042p = new C0660a(this);
        this.f2039m = new ArrayList();
        this.f2040n = new ArrayList();
        ListView listView = (ListView) findViewById(2131427460);
        this.f2041o = new C0013k(this, this.f2040n);
        listView.setAdapter(this.f2041o);
        listView.setOnItemClickListener(new C06522(this));
        this.f2044r.show();
        this.f2042p.m3342a(string2, string, "", 0);
    }
}
