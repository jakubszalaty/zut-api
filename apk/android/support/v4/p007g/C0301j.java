package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

/* renamed from: android.support.v4.g.j */
public final class C0301j {
    static final C0297a f551a;

    /* renamed from: android.support.v4.g.j.a */
    interface C0297a {
        C0077n m1473a(LayoutInflater layoutInflater);

        void m1474a(LayoutInflater layoutInflater, C0077n c0077n);
    }

    /* renamed from: android.support.v4.g.j.b */
    static class C0298b implements C0297a {
        C0298b() {
        }

        public C0077n m1475a(LayoutInflater layoutInflater) {
            return C0303k.m1481a(layoutInflater);
        }

        public void m1476a(LayoutInflater layoutInflater, C0077n c0077n) {
            C0303k.m1482a(layoutInflater, c0077n);
        }
    }

    /* renamed from: android.support.v4.g.j.c */
    static class C0299c extends C0298b {
        C0299c() {
        }

        public void m1477a(LayoutInflater layoutInflater, C0077n c0077n) {
            C0305l.m1483a(layoutInflater, c0077n);
        }
    }

    /* renamed from: android.support.v4.g.j.d */
    static class C0300d extends C0299c {
        C0300d() {
        }

        public void m1478a(LayoutInflater layoutInflater, C0077n c0077n) {
            C0306m.m1485a(layoutInflater, c0077n);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f551a = new C0300d();
        } else if (i >= 11) {
            f551a = new C0299c();
        } else {
            f551a = new C0298b();
        }
    }

    public static C0077n m1479a(LayoutInflater layoutInflater) {
        return f551a.m1473a(layoutInflater);
    }

    public static void m1480a(LayoutInflater layoutInflater, C0077n c0077n) {
        f551a.m1474a(layoutInflater, c0077n);
    }
}
