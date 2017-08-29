package android.support.v4.p005b.p008a;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: android.support.v4.b.a.b */
class C0106b {
    static int m451a(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    static int m452b(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    static int m453c(Resources resources) {
        return Math.min(C0106b.m452b(resources), C0106b.m451a(resources));
    }
}
