package pl.edu.zut.mobile;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class NewsDetailsActivity extends C0399b {
    WebView f2009m;
    TextView f2010n;
    TextView f2011o;
    TextView f2012p;
    private String f2013q;
    private String f2014r;
    private String f2015s;
    private String f2016t;
    private String f2017u;
    private ProgressDialog f2018v;

    public NewsDetailsActivity() {
        this.f2013q = "text/html; charset=UTF-8";
        this.f2014r = "UTF-8";
    }

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    public void m3265i() {
        this.f2011o = (TextView) findViewById(2131427476);
        this.f2011o.setText(getIntent().getStringExtra("TOP_TYTUL"));
        this.f2012p = (TextView) findViewById(2131427414);
        this.f2010n = (TextView) findViewById(2131427412);
        this.f2009m = (WebView) findViewById(2131427454);
        this.f2018v = new ProgressDialog(this);
        this.f2016t = getIntent().getStringExtra("DATA");
        this.f2012p.setText(this.f2016t);
        this.f2015s = getIntent().getStringExtra("TYTUL");
        this.f2010n.setText(this.f2015s);
        this.f2018v.show();
        this.f2017u = getIntent().getStringExtra("CONTENT");
        this.f2009m.loadData(this.f2017u, this.f2013q, null);
        try {
            if (this.f2018v.isShowing()) {
                this.f2018v.dismiss();
            }
        } catch (Exception e) {
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968608);
        m3265i();
    }
}
