package android.support.v4.p007g;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.g.e */
public abstract class C0286e {
    private final Context f546a;
    private C0284a f547b;
    private C0285b f548c;

    /* renamed from: android.support.v4.g.e.a */
    public interface C0284a {
        void m1450a(boolean z);
    }

    /* renamed from: android.support.v4.g.e.b */
    public interface C0285b {
        void m1451a(boolean z);
    }

    public C0286e(Context context) {
        this.f546a = context;
    }

    public abstract View m1452a();

    public View m1453a(MenuItem menuItem) {
        return m1452a();
    }

    public void m1454a(C0284a c0284a) {
        this.f547b = c0284a;
    }

    public void m1455a(C0285b c0285b) {
        if (!(this.f548c == null || c0285b == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f548c = c0285b;
    }

    public void m1456a(SubMenu subMenu) {
    }

    public void m1457a(boolean z) {
        if (this.f547b != null) {
            this.f547b.m1450a(z);
        }
    }

    public boolean m1458b() {
        return false;
    }

    public boolean m1459c() {
        return true;
    }

    public boolean m1460d() {
        return false;
    }

    public boolean m1461e() {
        return false;
    }

    public void m1462f() {
        this.f548c = null;
        this.f547b = null;
    }
}
