package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p009d.p010a.C0147a;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v4.p009d.p010a.C0149c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0528q {
    public static Menu m2568a(Context context, C0147a c0147a) {
        if (VERSION.SDK_INT >= 14) {
            return new C0529r(context, c0147a);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem m2569a(Context context, C0148b c0148b) {
        if (VERSION.SDK_INT >= 16) {
            return new C0525l(context, c0148b);
        }
        if (VERSION.SDK_INT >= 14) {
            return new C0523k(context, c0148b);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu m2570a(Context context, C0149c c0149c) {
        if (VERSION.SDK_INT >= 14) {
            return new C0533v(context, c0149c);
        }
        throw new UnsupportedOperationException();
    }
}
