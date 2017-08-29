package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.g.ao */
public final class ao {
    static final C0240d f514a;

    /* renamed from: android.support.v4.g.ao.d */
    interface C0240d {
        boolean m1224a(ViewConfiguration viewConfiguration);
    }

    /* renamed from: android.support.v4.g.ao.a */
    static class C0241a implements C0240d {
        C0241a() {
        }

        public boolean m1225a(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* renamed from: android.support.v4.g.ao.b */
    static class C0242b extends C0241a {
        C0242b() {
        }

        public boolean m1226a(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.ao.c */
    static class C0243c extends C0242b {
        C0243c() {
        }

        public boolean m1227a(ViewConfiguration viewConfiguration) {
            return ap.m1229a(viewConfiguration);
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f514a = new C0243c();
        } else if (VERSION.SDK_INT >= 11) {
            f514a = new C0242b();
        } else {
            f514a = new C0241a();
        }
    }

    public static boolean m1228a(ViewConfiguration viewConfiguration) {
        return f514a.m1224a(viewConfiguration);
    }
}
