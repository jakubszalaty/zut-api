package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v4.g.o */
public final class C0310o {
    static final C0307a f555a;

    /* renamed from: android.support.v4.g.o.a */
    interface C0307a {
        int m1486a(MarginLayoutParams marginLayoutParams);

        int m1487b(MarginLayoutParams marginLayoutParams);
    }

    /* renamed from: android.support.v4.g.o.b */
    static class C0308b implements C0307a {
        C0308b() {
        }

        public int m1488a(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        public int m1489b(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    /* renamed from: android.support.v4.g.o.c */
    static class C0309c implements C0307a {
        C0309c() {
        }

        public int m1490a(MarginLayoutParams marginLayoutParams) {
            return C0311p.m1494a(marginLayoutParams);
        }

        public int m1491b(MarginLayoutParams marginLayoutParams) {
            return C0311p.m1495b(marginLayoutParams);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f555a = new C0309c();
        } else {
            f555a = new C0308b();
        }
    }

    public static int m1492a(MarginLayoutParams marginLayoutParams) {
        return f555a.m1486a(marginLayoutParams);
    }

    public static int m1493b(MarginLayoutParams marginLayoutParams) {
        return f555a.m1487b(marginLayoutParams);
    }
}
