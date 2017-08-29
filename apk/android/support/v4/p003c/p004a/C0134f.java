package android.support.v4.p003c.p004a;

import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.c.a.f */
class C0134f {
    public static void m562a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean m563a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable m564b(Drawable drawable) {
        return !(drawable instanceof C0020m) ? new C0143k(drawable) : drawable;
    }

    public static int m565c(Drawable drawable) {
        return drawable.getAlpha();
    }
}
