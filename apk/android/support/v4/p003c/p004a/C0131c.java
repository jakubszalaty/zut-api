package android.support.v4.p003c.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.c.a.c */
class C0131c {
    public static Drawable m553a(Drawable drawable) {
        return !(drawable instanceof C0020m) ? new C0139i(drawable) : drawable;
    }

    public static void m554a(Drawable drawable, int i) {
        if (drawable instanceof C0020m) {
            ((C0020m) drawable).setTint(i);
        }
    }

    public static void m555a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof C0020m) {
            ((C0020m) drawable).setTintList(colorStateList);
        }
    }

    public static void m556a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }

    public static void m557a(Drawable drawable, Mode mode) {
        if (drawable instanceof C0020m) {
            ((C0020m) drawable).setTintMode(mode);
        }
    }
}
