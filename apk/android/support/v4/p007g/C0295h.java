package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* renamed from: android.support.v4.g.h */
public final class C0295h {
    static final C0292c f550a;

    /* renamed from: android.support.v4.g.h.c */
    interface C0292c {
        boolean m1468a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.g.h.a */
    static class C0293a implements C0292c {
        C0293a() {
        }

        public boolean m1469a(KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.h.b */
    static class C0294b extends C0293a {
        C0294b() {
        }

        public boolean m1470a(KeyEvent keyEvent) {
            return C0296i.m1472a(keyEvent);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f550a = new C0294b();
        } else {
            f550a = new C0293a();
        }
    }

    public static boolean m1471a(KeyEvent keyEvent) {
        return f550a.m1468a(keyEvent);
    }
}
