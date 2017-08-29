package android.support.v4.p005b.p008a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.b.a.d */
public final class C0108d {
    public static Drawable m457a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? C0109e.m458a(resources, i, theme) : resources.getDrawable(i);
    }
}
