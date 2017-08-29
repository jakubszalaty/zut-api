package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.support.v4.p009d.p010a.C0148b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.g.q */
public final class C0317q {
    static final C0312d f556a;

    /* renamed from: android.support.v4.g.q.d */
    interface C0312d {
        MenuItem m1496a(MenuItem menuItem, View view);

        View m1497a(MenuItem menuItem);

        void m1498a(MenuItem menuItem, int i);

        MenuItem m1499b(MenuItem menuItem, int i);

        boolean m1500b(MenuItem menuItem);

        boolean m1501c(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.g.q.a */
    static class C0313a implements C0312d {
        C0313a() {
        }

        public MenuItem m1502a(MenuItem menuItem, View view) {
            return menuItem;
        }

        public View m1503a(MenuItem menuItem) {
            return null;
        }

        public void m1504a(MenuItem menuItem, int i) {
        }

        public MenuItem m1505b(MenuItem menuItem, int i) {
            return menuItem;
        }

        public boolean m1506b(MenuItem menuItem) {
            return false;
        }

        public boolean m1507c(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.q.b */
    static class C0314b implements C0312d {
        C0314b() {
        }

        public MenuItem m1508a(MenuItem menuItem, View view) {
            return C0318r.m1525a(menuItem, view);
        }

        public View m1509a(MenuItem menuItem) {
            return C0318r.m1526a(menuItem);
        }

        public void m1510a(MenuItem menuItem, int i) {
            C0318r.m1527a(menuItem, i);
        }

        public MenuItem m1511b(MenuItem menuItem, int i) {
            return C0318r.m1528b(menuItem, i);
        }

        public boolean m1512b(MenuItem menuItem) {
            return false;
        }

        public boolean m1513c(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.q.c */
    static class C0315c extends C0314b {
        C0315c() {
        }

        public boolean m1514b(MenuItem menuItem) {
            return C0319s.m1529a(menuItem);
        }

        public boolean m1515c(MenuItem menuItem) {
            return C0319s.m1530b(menuItem);
        }
    }

    /* renamed from: android.support.v4.g.q.e */
    public interface C0316e {
        boolean m1516a(MenuItem menuItem);

        boolean m1517b(MenuItem menuItem);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            f556a = new C0315c();
        } else if (i >= 11) {
            f556a = new C0314b();
        } else {
            f556a = new C0313a();
        }
    }

    public static MenuItem m1518a(MenuItem menuItem, C0286e c0286e) {
        if (menuItem instanceof C0148b) {
            return ((C0148b) menuItem).m594a(c0286e);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static MenuItem m1519a(MenuItem menuItem, View view) {
        return menuItem instanceof C0148b ? ((C0148b) menuItem).setActionView(view) : f556a.m1496a(menuItem, view);
    }

    public static View m1520a(MenuItem menuItem) {
        return menuItem instanceof C0148b ? ((C0148b) menuItem).getActionView() : f556a.m1497a(menuItem);
    }

    public static void m1521a(MenuItem menuItem, int i) {
        if (menuItem instanceof C0148b) {
            ((C0148b) menuItem).setShowAsAction(i);
        } else {
            f556a.m1498a(menuItem, i);
        }
    }

    public static MenuItem m1522b(MenuItem menuItem, int i) {
        return menuItem instanceof C0148b ? ((C0148b) menuItem).setActionView(i) : f556a.m1499b(menuItem, i);
    }

    public static boolean m1523b(MenuItem menuItem) {
        return menuItem instanceof C0148b ? ((C0148b) menuItem).expandActionView() : f556a.m1500b(menuItem);
    }

    public static boolean m1524c(MenuItem menuItem) {
        return menuItem instanceof C0148b ? ((C0148b) menuItem).isActionViewExpanded() : f556a.m1501c(menuItem);
    }
}
