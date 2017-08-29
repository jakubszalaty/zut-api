package android.support.v4.p007g.p013a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.g.a.a */
public final class C0181a {
    private static final C0176e f460a;

    /* renamed from: android.support.v4.g.a.a.e */
    interface C0176e {
    }

    /* renamed from: android.support.v4.g.a.a.d */
    static class C0177d implements C0176e {
        C0177d() {
        }
    }

    /* renamed from: android.support.v4.g.a.a.a */
    static class C0178a extends C0177d {
        C0178a() {
        }
    }

    /* renamed from: android.support.v4.g.a.a.b */
    static class C0179b extends C0178a {
        C0179b() {
        }
    }

    /* renamed from: android.support.v4.g.a.a.c */
    static class C0180c extends C0179b {
        C0180c() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f460a = new C0180c();
        } else if (VERSION.SDK_INT >= 16) {
            f460a = new C0179b();
        } else if (VERSION.SDK_INT >= 14) {
            f460a = new C0178a();
        } else {
            f460a = new C0177d();
        }
    }

    public static C0219l m687a(AccessibilityEvent accessibilityEvent) {
        return new C0219l(accessibilityEvent);
    }
}
