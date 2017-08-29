package pl.edu.zut.mobile;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.C0006d;
import p022b.C0636f;
import p022b.C0640h;
import pl.edu.zut.mobile.C0660a.C0644c;

public class NewsActivity extends C0399b implements C0644c {
    String f2002m;
    private final int f2003n;
    private List<C0636f> f2004o;
    private ListView f2005p;
    private C0006d f2006q;
    private C0660a f2007r;
    private ProgressDialog f2008s;

    /* renamed from: pl.edu.zut.mobile.NewsActivity.1 */
    class C06501 implements OnItemClickListener {
        final /* synthetic */ NewsActivity f2001a;

        C06501(NewsActivity newsActivity) {
            this.f2001a = newsActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2001a.m3262b(i);
        }
    }

    public NewsActivity() {
        this.f2003n = 1000;
    }

    public void m3259a(Bitmap bitmap, int i) {
        ((ImageView) findViewById(2131427464)).setImageBitmap(bitmap);
    }

    void m3260a(String str) {
        Builder builder = new Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(2131099696, null);
        builder.create().show();
    }

    public void m3261a(String str, int i) {
        Object obj = null;
        try {
            if (this.f2008s.isShowing()) {
                this.f2008s.dismiss();
            }
        } catch (Exception e) {
        }
        if (i == 1000) {
            try {
                C0640h c0640h = new C0640h(str);
                for (int i2 = 0; i2 < c0640h.f1927a.size(); i2++) {
                    String str2 = c0640h.m3205a(i2).f1925h;
                    if (str2 == null || str2.length() == 0) {
                        str2 = c0640h.m3205a(i2).f1920c;
                    }
                    this.f2004o.add(new C0636f(c0640h.m3205a(i2).f1922e, c0640h.m3205a(i2).f1918a, str2, ""));
                }
                this.f2006q.notifyDataSetChanged();
            } catch (Exception e2) {
                obj = 1;
            }
        }
        if (obj != null) {
            m3260a(getString(2131099676));
        }
    }

    public void m3262b(int i) {
        Intent intent = new Intent(this, NewsDetailsActivity.class);
        intent.putExtra("DATA", ((C0636f) this.f2004o.get(i)).m3193a());
        intent.putExtra("TYTUL", ((C0636f) this.f2004o.get(i)).m3194b());
        intent.putExtra("CONTENT", ((C0636f) this.f2004o.get(i)).m3195c());
        intent.putExtra("TOP_TYTUL", this.f2002m);
        startActivity(intent);
    }

    public void m3263b(String str, int i) {
        try {
            if (this.f2008s.isShowing()) {
                this.f2008s.dismiss();
            }
        } catch (Exception e) {
        }
        String str2 = "";
        if (i == 1000) {
            str2 = getString(2131099678);
        }
        m3260a(str2);
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3264i() {
        TextView textView = (TextView) findViewById(2131427476);
        this.f2002m = getIntent().getStringExtra("TYTUL");
        textView.setText(this.f2002m);
        this.f2004o = new ArrayList();
        this.f2006q = new C0006d(this, this.f2004o);
        this.f2005p = (ListView) findViewById(2131427452);
        this.f2005p.setAdapter(this.f2006q);
        this.f2008s = new ProgressDialog(this);
        this.f2008s.setMessage(getString(2131099679));
        this.f2007r = new C0660a(this);
        this.f2005p.setOnItemClickListener(new C06501(this));
        String stringExtra = getIntent().getStringExtra("ADRES_WWW");
        this.f2008s.show();
        this.f2007r.m3339a(stringExtra, 1000);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968607);
        m3264i();
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
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}
