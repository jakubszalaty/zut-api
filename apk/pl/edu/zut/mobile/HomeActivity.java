package pl.edu.zut.mobile;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.p014a.C0399b;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0005c;
import p022b.C0632b;
import pl.edu.zut.mobile.C0660a.C0644c;

public class HomeActivity extends C0399b implements C0644c {
    private final int f1981A;
    private final int f1982B;
    private ProgressDialog f1983C;
    private DrawerLayout f1984m;
    private C0005c f1985n;
    private List<String> f1986o;
    private HashMap<String, List<String>> f1987p;
    private SharedPreferences f1988q;
    private boolean f1989r;
    private boolean f1990s;
    private boolean f1991t;
    private boolean f1992u;
    private String f1993v;
    private String f1994w;
    private String f1995x;
    private List<C0632b> f1996y;
    private final int f1997z;

    /* renamed from: pl.edu.zut.mobile.HomeActivity.1 */
    class C06471 implements OnGroupClickListener {
        final /* synthetic */ HomeActivity f1978a;

        C06471(HomeActivity homeActivity) {
            this.f1978a = homeActivity;
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            this.f1978a.m3249b(i);
            return (!((String) this.f1978a.f1986o.get(i)).equals(this.f1978a.getString(2131099873)) || this.f1978a.f1996y.size() <= 0) ? (!((String) this.f1978a.f1986o.get(i)).equals(this.f1978a.getString(2131099877)) || this.f1978a.f1996y.size() <= 0) ? !((String) this.f1978a.f1986o.get(i)).equals(this.f1978a.getString(2131099867)) || this.f1978a.f1996y.size() <= 0 : false : false;
        }
    }

    /* renamed from: pl.edu.zut.mobile.HomeActivity.2 */
    class C06482 implements OnChildClickListener {
        final /* synthetic */ HomeActivity f1979a;

        C06482(HomeActivity homeActivity) {
            this.f1979a = homeActivity;
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            this.f1979a.m3245a(i, i2);
            return false;
        }
    }

    /* renamed from: pl.edu.zut.mobile.HomeActivity.3 */
    class C06493 implements OnClickListener {
        final /* synthetic */ HomeActivity f1980a;

        C06493(HomeActivity homeActivity) {
            this.f1980a = homeActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f1980a.f1988q.edit().clear().commit();
            this.f1980a.m3252i();
            this.f1980a.f1984m.m1647f(8388611);
            this.f1980a.m3250b(this.f1980a.getString(2131099680));
        }
    }

    public HomeActivity() {
        this.f1989r = false;
        this.f1990s = false;
        this.f1991t = false;
        this.f1992u = false;
        this.f1997z = 1000;
        this.f1981A = 1001;
        this.f1982B = 1002;
    }

    public void m3245a(int i, int i2) {
        if (((String) this.f1986o.get(i)).equals(getString(2131099873)) && this.f1996y.size() > 0) {
            this.f1984m.m1647f(8388611);
            Intent intent = new Intent(this, StudentAccountingActivity.class);
            intent.putExtra("PRZYNALEZNOSCID", ((C0632b) this.f1996y.get(i2)).m3173a());
            startActivity(intent);
        }
        if (((String) this.f1986o.get(i)).equals(getString(2131099877)) && this.f1996y.size() > 0) {
            this.f1984m.m1647f(8388611);
            intent = new Intent(this, StudentStudiesActivity.class);
            intent.putExtra("PRZYNALEZNOSCID", ((C0632b) this.f1996y.get(i2)).m3173a());
            String b = ((C0632b) this.f1996y.get(i2)).m3174b();
            if (b != null && b.equals("STS")) {
                intent.putExtra("DOKTORANT", true);
            }
            startActivity(intent);
        }
        if (((String) this.f1986o.get(i)).equals(getString(2131099867)) && this.f1996y.size() > 0) {
            this.f1984m.m1647f(8388611);
            intent = new Intent(this, StudentGradesActivity.class);
            intent.putExtra("PRZYNALEZNOSCID", ((C0632b) this.f1996y.get(i2)).m3173a());
            intent.putExtra("POZIOM", ((C0632b) this.f1996y.get(i2)).m3174b());
            startActivity(intent);
        }
    }

    public void m3246a(Bitmap bitmap, int i) {
    }

    void m3247a(String str) {
        Builder builder = new Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(2131099696, null);
        builder.create().show();
    }

    public void m3248a(String str, int i) {
        try {
            if (this.f1983C.isShowing()) {
                this.f1983C.dismiss();
            }
        } catch (Exception e) {
        }
        if (i == 1002) {
            Object obj;
            int i2;
            try {
                this.f1996y = new ArrayList();
                List arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject(str);
                if (str != null && str.contains("Menu")) {
                    if (jSONObject.get("Menu") instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray("Menu");
                        for (i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("przynaleznoscId");
                            String optString2 = jSONObject2.optString("nazwa");
                            String optString3 = jSONObject2.optString("poziom");
                            arrayList.add(optString2);
                            this.f1996y.add(new C0632b(optString, optString2, optString3));
                            if (this.f1989r) {
                                this.f1987p.put(getString(2131099877), arrayList);
                                this.f1987p.put(getString(2131099873), arrayList);
                                this.f1987p.put(getString(2131099867), arrayList);
                            }
                            this.f1985n.notifyDataSetChanged();
                        }
                    } else {
                        jSONObject = (JSONObject) jSONObject.get("Menu");
                        this.f1995x = jSONObject.optString("przynaleznoscId");
                        if (jSONObject.optString("poziom").equals("STS")) {
                            this.f1992u = true;
                        }
                    }
                }
                obj = null;
            } catch (Exception e2) {
                i2 = 1;
            }
            if (obj != null) {
                m3247a(getString(2131099676));
            }
        }
    }

    public void m3249b(int i) {
        if (i == 0) {
            this.f1984m.m1647f(8388611);
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099870))) {
            this.f1984m.m1647f(8388611);
            logOutAction();
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099869))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, LoginActivity.class));
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099874))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, StudentProfileActivity.class));
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099875))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, ClassRoutineActivity.class));
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099876))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, SearchActivity.class));
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099873)) && this.f1996y.size() < 1) {
            this.f1984m.m1647f(8388611);
            r0 = new Intent(this, StudentAccountingActivity.class);
            r0.putExtra("PRZYNALEZNOSCID", this.f1995x);
            startActivity(r0);
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099877)) && this.f1996y.size() < 1) {
            this.f1984m.m1647f(8388611);
            r0 = new Intent(this, StudentStudiesActivity.class);
            r0.putExtra("PRZYNALEZNOSCID", this.f1995x);
            r0.putExtra("DOKTORANT", this.f1992u);
            startActivity(r0);
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099867)) && this.f1996y.size() < 1) {
            this.f1984m.m1647f(8388611);
            r0 = new Intent(this, StudentGradesActivity.class);
            r0.putExtra("PRZYNALEZNOSCID", this.f1995x);
            r0.putExtra("DOKTORANT", this.f1992u);
            startActivity(r0);
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099872))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, StudentNoticesActivity.class));
        } else if (((String) this.f1986o.get(i)).equals(getString(2131099878))) {
            this.f1984m.m1647f(8388611);
            startActivity(new Intent(this, VacationsActivity.class));
        }
    }

    void m3250b(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void m3251b(String str, int i) {
        try {
            if (this.f1983C.isShowing()) {
                this.f1983C.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        if (i == 1002) {
            m3247a(getString(2131099678));
        }
    }

    public void m3252i() {
        this.f1988q = getApplicationContext().getSharedPreferences("mZut", 0);
        C0660a c0660a = new C0660a(this);
        this.f1994w = this.f1988q.getString("AUTHKEY", null);
        this.f1993v = this.f1988q.getString("USERID", null);
        this.f1989r = this.f1988q.getBoolean("STUDENT", false);
        this.f1990s = this.f1988q.getBoolean("DYDAKTYK", false);
        this.f1991t = this.f1988q.getBoolean("PRACOWNIK", false);
        CharSequence string = this.f1988q.getString("USERNAME", "");
        this.f1983C = new ProgressDialog(this);
        this.f1983C.setMessage(getString(2131099679));
        if (this.f1993v != null && this.f1989r) {
            c0660a.m3341a(this.f1994w, this.f1993v, 1002);
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels / 2;
        ImageView imageView = (ImageView) findViewById(2131427426);
        imageView.getLayoutParams().height = i;
        imageView.getLayoutParams().width = i;
        ((TextView) findViewById(2131427428)).setText(string);
        this.f1986o = new ArrayList();
        this.f1987p = new HashMap();
        Collection arrayList = new ArrayList();
        if (this.f1993v != null) {
            if (getResources().getConfiguration().orientation == 1) {
                ((TextView) findViewById(2131427436)).setVisibility(4);
                ((TextView) findViewById(2131427438)).setVisibility(0);
            }
            ((ImageView) findViewById(2131427435)).setVisibility(4);
            ((ImageView) findViewById(2131427437)).setVisibility(0);
            arrayList.add(getString(2131099868));
            if (this.f1989r || this.f1990s) {
                arrayList.add(getString(2131099872));
            }
            if (this.f1991t) {
                arrayList.add(getString(2131099878));
            }
            if (this.f1989r) {
                arrayList.add(getString(2131099877));
                arrayList.add(getString(2131099867));
                arrayList.add(getString(2131099873));
            }
            if (this.f1989r || this.f1990s) {
                arrayList.add(getString(2131099875));
                arrayList.add(getString(2131099876));
            }
            arrayList.add(getString(2131099870));
        } else {
            if (getResources().getConfiguration().orientation == 1) {
                ((TextView) findViewById(2131427436)).setVisibility(0);
                ((TextView) findViewById(2131427438)).setVisibility(4);
            }
            ((ImageView) findViewById(2131427435)).setVisibility(0);
            ((ImageView) findViewById(2131427437)).setVisibility(4);
            this.f1986o.addAll(Arrays.asList(new String[]{getString(2131099868), getString(2131099869)}));
        }
        this.f1986o.addAll(arrayList);
        this.f1984m = (DrawerLayout) findViewById(2131427425);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(2131427439);
        this.f1985n = new C0005c(this, this.f1986o, this.f1987p);
        expandableListView.setAdapter(this.f1985n);
        expandableListView.setOnGroupClickListener(new C06471(this));
        expandableListView.setOnChildClickListener(new C06482(this));
    }

    public void logInAction(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void logOutAction() {
        Builder builder = new Builder(this);
        builder.setMessage(2131099705);
        builder.setPositiveButton(2131099696, new C06493(this));
        builder.setNegativeButton(2131099693, null);
        builder.create().show();
    }

    public void logOutAction(View view) {
        logOutAction();
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968605);
        m3252i();
    }

    protected void onStart() {
        super.onStart();
    }

    public void openCandicatesWeb(View view) {
        Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
        intent.putExtra("ADRES_WWW", "http://www.zut.edu.pl/rssfeed-kandydaci");
        intent.putExtra("TYTUL", getString(2131099911));
        startActivity(intent);
    }

    public void openStudentsWeb(View view) {
        Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
        intent.putExtra("ADRES_WWW", "http://www.zut.edu.pl/rssfeed-studenci");
        intent.putExtra("TYTUL", getString(2131099919));
        startActivity(intent);
    }

    public void openTeachersWeb(View view) {
        Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
        intent.putExtra("ADRES_WWW", "http://www.zut.edu.pl/rssfeed-pracownicy");
        intent.putExtra("TYTUL", getString(2131099921));
        startActivity(intent);
    }

    public void showMenuAction(View view) {
        this.f1984m.m1646e(8388611);
    }
}
