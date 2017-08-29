package android.support.v4.p003c.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.c.a.g */
class C0135g {
    public static Drawable m566a(Drawable drawable) {
        return !(drawable instanceof C0020m) ? new C0145l(drawable) : drawable;
    }

    public static void m567a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void m568a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void m569a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void m570a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void m571a(Drawable drawable, Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void m572a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void m573a(Drawable drawable, Mode mode) {
        drawable.setTintMode(mode);
    }

    public static boolean m574b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter m575c(Drawable drawable) {
        return drawable.getColorFilter();
    }
}
