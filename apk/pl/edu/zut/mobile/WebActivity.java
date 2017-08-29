package pl.edu.zut.mobile;

import android.os.Bundle;
import android.support.v7.p014a.C0399b;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebActivity extends C0399b {
    private WebView f2131m;
    private String f2132n;

    public void backHomeActivity(View view) {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968620);
        ((TextView) findViewById(2131427476)).setText(getIntent().getStringExtra("TYTUL"));
        this.f2132n = getIntent().getStringExtra("ADRES_WWW");
        this.f2131m = (WebView) findViewById(2131427482);
        this.f2131m.loadUrl(this.f2132n);
        this.f2131m.getSettings().setJavaScriptEnabled(true);
        this.f2131m.setWebViewClient(new WebViewClient());
    }
}
