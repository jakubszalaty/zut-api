package android.support.v4.p007g;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.g.f */
public final class C0290f {
    static final C0287a f549a;

    /* renamed from: android.support.v4.g.f.a */
    interface C0287a {
        int m1463a(int i, int i2);
    }

    /* renamed from: android.support.v4.g.f.b */
    static class C0288b implements C0287a {
        C0288b() {
        }

        public int m1464a(int i, int i2) {
            return -8388609 & i;
        }
    }

    /* renamed from: android.support.v4.g.f.c */
    static class C0289c implements C0287a {
        C0289c() {
        }

        public int m1465a(int i, int i2) {
            return C0291g.m1467a(i, i2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f549a = new C0289c();
        } else {
            f549a = new C0288b();
        }
    }

    public static int m1466a(int i, int i2) {
        return f549a.m1463a(i, i2);
    }
}
