package android.support.v4.p003c.p004a;

import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.c.a.d */
class C0132d {
    public static void m558a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable m559b(Drawable drawable) {
        return !(drawable instanceof C0020m) ? new C0141j(drawable) : drawable;
    }
}
