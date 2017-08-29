package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: android.support.v4.g.aq */
public final class aq {
    static final C0244c f515a;

    /* renamed from: android.support.v4.g.aq.c */
    interface C0244c {
        void m1230a(ViewGroup viewGroup, boolean z);
    }

    /* renamed from: android.support.v4.g.aq.f */
    static class C0245f implements C0244c {
        C0245f() {
        }

        public void m1231a(ViewGroup viewGroup, boolean z) {
        }
    }

    /* renamed from: android.support.v4.g.aq.a */
    static class C0246a extends C0245f {
        C0246a() {
        }

        public void m1232a(ViewGroup viewGroup, boolean z) {
            ar.m1234a(viewGroup, z);
        }
    }

    /* renamed from: android.support.v4.g.aq.b */
    static class C0247b extends C0246a {
        C0247b() {
        }
    }

    /* renamed from: android.support.v4.g.aq.d */
    static class C0248d extends C0247b {
        C0248d() {
        }
    }

    /* renamed from: android.support.v4.g.aq.e */
    static class C0249e extends C0248d {
        C0249e() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f515a = new C0249e();
        } else if (i >= 18) {
            f515a = new C0248d();
        } else if (i >= 14) {
            f515a = new C0247b();
        } else if (i >= 11) {
            f515a = new C0246a();
        } else {
            f515a = new C0245f();
        }
    }

    public static void m1233a(ViewGroup viewGroup, boolean z) {
        f515a.m1230a(viewGroup, z);
    }
}
