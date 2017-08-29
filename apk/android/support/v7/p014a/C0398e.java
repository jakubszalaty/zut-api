package android.support.v7.p014a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p006a.C0036a;
import android.support.v4.p006a.C0068l;
import android.support.v4.p006a.C0099y;
import android.support.v4.p006a.ad;
import android.support.v4.p006a.ad.C0037a;
import android.support.v4.p007g.C0295h;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.widget.ax;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.a.e */
public class C0398e extends C0068l implements C0037a, C0397f {
    private C0417g f731m;
    private int f732n;
    private boolean f733o;
    private Resources f734p;

    public C0398e() {
        this.f732n = 0;
    }

    public Intent m1907a() {
        return C0099y.m429a(this);
    }

    public C0461b m1908a(C0445a c0445a) {
        return null;
    }

    public void m1909a(ad adVar) {
        adVar.m83a((Activity) this);
    }

    public void m1910a(C0461b c0461b) {
    }

    public boolean m1911a(Intent intent) {
        return C0099y.m431a((Activity) this, intent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m1919h().m1976b(view, layoutParams);
    }

    public void m1912b(Intent intent) {
        C0099y.m434b((Activity) this, intent);
    }

    public void m1913b(ad adVar) {
    }

    public void m1914b(C0461b c0461b) {
    }

    public void m1915c() {
        m1919h().m1982f();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (C0295h.m1471a(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                C0396a e = m1916e();
                if (e != null && e.m1894b() && e.m1902g()) {
                    this.f733o = true;
                    return true;
                }
            } else if (action == 1 && this.f733o) {
                this.f733o = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public C0396a m1916e() {
        return m1919h().m1966a();
    }

    public boolean m1917f() {
        Intent a = m1907a();
        if (a == null) {
            return false;
        }
        if (m1911a(a)) {
            ad a2 = ad.m82a((Context) this);
            m1909a(a2);
            m1913b(a2);
            a2.m86a();
            try {
                C0036a.m76a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            m1912b(a);
        }
        return true;
    }

    public View findViewById(int i) {
        return m1919h().m1967a(i);
    }

    @Deprecated
    public void m1918g() {
    }

    public MenuInflater getMenuInflater() {
        return m1919h().m1973b();
    }

    public Resources getResources() {
        if (this.f734p == null && ax.m3012a()) {
            this.f734p = new ax(this, super.getResources());
        }
        return this.f734p == null ? super.getResources() : this.f734p;
    }

    public C0417g m1919h() {
        if (this.f731m == null) {
            this.f731m = C0417g.m1961a((Activity) this, (C0397f) this);
        }
        return this.f731m;
    }

    public void invalidateOptionsMenu() {
        m1919h().m1982f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1919h().m1968a(configuration);
        if (this.f734p != null) {
            this.f734p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        m1918g();
    }

    protected void onCreate(Bundle bundle) {
        C0417g h = m1919h();
        h.m1984h();
        h.m1969a(bundle);
        if (h.m1985i() && this.f732n != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f732n, false);
            } else {
                setTheme(this.f732n);
            }
        }
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        m1919h().m1983g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0396a e = m1916e();
        return (menuItem.getItemId() != 16908332 || e == null || (e.m1886a() & 4) == 0) ? false : m1917f();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m1919h().m1975b(bundle);
    }

    protected void onPostResume() {
        super.onPostResume();
        m1919h().m1981e();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1919h().m1978c(bundle);
    }

    protected void onStart() {
        super.onStart();
        m1919h().m1977c();
    }

    protected void onStop() {
        super.onStop();
        m1919h().m1980d();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m1919h().m1972a(charSequence);
    }

    public void setContentView(int i) {
        m1919h().m1974b(i);
    }

    public void setContentView(View view) {
        m1919h().m1970a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m1919h().m1971a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f732n = i;
    }
}
