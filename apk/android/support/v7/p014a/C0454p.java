package android.support.v7.p014a;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.p007g.ae;
import android.support.v7.p014a.C0396a.C0394b;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.widget.ac;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.a.p */
class C0454p extends C0396a {
    ac f958a;
    Callback f959b;
    private boolean f960c;
    private boolean f961d;
    private ArrayList<C0394b> f962e;
    private final Runnable f963f;

    /* renamed from: android.support.v7.a.p.a */
    private final class C0452a implements C0442a {
        final /* synthetic */ C0454p f955a;
        private boolean f956b;

        C0452a(C0454p c0454p) {
            this.f955a = c0454p;
        }

        public void m2130a(C0515h c0515h, boolean z) {
            if (!this.f956b) {
                this.f956b = true;
                this.f955a.f958a.m2832n();
                if (this.f955a.f959b != null) {
                    this.f955a.f959b.onPanelClosed(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
                }
                this.f956b = false;
            }
        }

        public boolean m2131a(C0515h c0515h) {
            if (this.f955a.f959b == null) {
                return false;
            }
            this.f955a.f959b.onMenuOpened(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
            return true;
        }
    }

    /* renamed from: android.support.v7.a.p.b */
    private final class C0453b implements C0425a {
        final /* synthetic */ C0454p f957a;

        C0453b(C0454p c0454p) {
            this.f957a = c0454p;
        }

        public void m2132a(C0515h c0515h) {
            if (this.f957a.f959b == null) {
                return;
            }
            if (this.f957a.f958a.m2827i()) {
                this.f957a.f959b.onPanelClosed(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
            } else if (this.f957a.f959b.onPreparePanel(0, null, c0515h)) {
                this.f957a.f959b.onMenuOpened(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
            }
        }

        public boolean m2133a(C0515h c0515h, MenuItem menuItem) {
            return false;
        }
    }

    private Menu m2134i() {
        if (!this.f960c) {
            this.f958a.m2810a(new C0452a(this), new C0453b(this));
            this.f960c = true;
        }
        return this.f958a.m2836r();
    }

    public int m2135a() {
        return this.f958a.m2833o();
    }

    public void m2136a(float f) {
        ae.m1145c(this.f958a.m2807a(), f);
    }

    public void m2137a(Configuration configuration) {
        super.m1889a(configuration);
    }

    public void m2138a(CharSequence charSequence) {
        this.f958a.m2814a(charSequence);
    }

    public void m2139a(boolean z) {
    }

    public boolean m2140a(int i, KeyEvent keyEvent) {
        Menu i2 = m2134i();
        if (i2 != null) {
            i2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            i2.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    public boolean m2141b() {
        return this.f958a.m2835q() == 0;
    }

    public Context m2142c() {
        return this.f958a.m2816b();
    }

    public void m2143c(boolean z) {
    }

    public void m2144d(boolean z) {
    }

    public void m2145e(boolean z) {
        if (z != this.f961d) {
            this.f961d = z;
            int size = this.f962e.size();
            for (int i = 0; i < size; i++) {
                ((C0394b) this.f962e.get(i)).m1880a(z);
            }
        }
    }

    public boolean m2146e() {
        this.f958a.m2807a().removeCallbacks(this.f963f);
        ae.m1136a(this.f958a.m2807a(), this.f963f);
        return true;
    }

    public boolean m2147f() {
        if (!this.f958a.m2820c()) {
            return false;
        }
        this.f958a.m2821d();
        return true;
    }

    public boolean m2148g() {
        ViewGroup a = this.f958a.m2807a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    void m2149h() {
        this.f958a.m2807a().removeCallbacks(this.f963f);
    }
}
