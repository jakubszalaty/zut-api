package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0461b {
    private Object f981a;
    private boolean f982b;

    /* renamed from: android.support.v7.view.b.a */
    public interface C0445a {
        void m2107a(C0461b c0461b);

        boolean m2108a(C0461b c0461b, Menu menu);

        boolean m2109a(C0461b c0461b, MenuItem menuItem);

        boolean m2110b(C0461b c0461b, Menu menu);
    }

    public abstract MenuInflater m2161a();

    public abstract void m2162a(int i);

    public abstract void m2163a(View view);

    public abstract void m2164a(CharSequence charSequence);

    public void m2165a(Object obj) {
        this.f981a = obj;
    }

    public void m2166a(boolean z) {
        this.f982b = z;
    }

    public abstract Menu m2167b();

    public abstract void m2168b(int i);

    public abstract void m2169b(CharSequence charSequence);

    public abstract void m2170c();

    public abstract void m2171d();

    public abstract CharSequence m2172f();

    public abstract CharSequence m2173g();

    public boolean m2174h() {
        return false;
    }

    public abstract View m2175i();

    public Object m2176j() {
        return this.f981a;
    }

    public boolean m2177k() {
        return this.f982b;
    }
}
