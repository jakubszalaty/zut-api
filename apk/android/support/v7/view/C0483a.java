package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p005b.p008a.C0105a;
import android.support.v4.p007g.ao;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0466b;
import android.support.v7.p015b.C0475a.C0468d;
import android.support.v7.p015b.C0475a.C0474j;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0483a {
    private Context f1031a;

    private C0483a(Context context) {
        this.f1031a = context;
    }

    public static C0483a m2256a(Context context) {
        return new C0483a(context);
    }

    public int m2257a() {
        Resources resources = this.f1031a.getResources();
        int b = C0105a.m449b(resources);
        int a = C0105a.m448a(resources);
        return (C0105a.m450c(resources) > 600 || b > 600 || ((b > 960 && a > 720) || (b > 720 && a > 960))) ? 5 : (b >= 500 || ((b > 640 && a > 480) || (b > 480 && a > 640))) ? 4 : b >= 360 ? 3 : 2;
    }

    public boolean m2258b() {
        return VERSION.SDK_INT >= 19 || !ao.m1228a(ViewConfiguration.get(this.f1031a));
    }

    public int m2259c() {
        return this.f1031a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean m2260d() {
        return this.f1031a.getResources().getBoolean(C0466b.abc_action_bar_embed_tabs);
    }

    public int m2261e() {
        TypedArray obtainStyledAttributes = this.f1031a.obtainStyledAttributes(null, C0474j.ActionBar, C0465a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0474j.ActionBar_height, 0);
        Resources resources = this.f1031a.getResources();
        if (!m2260d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0468d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean m2262f() {
        return this.f1031a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int m2263g() {
        return this.f1031a.getResources().getDimensionPixelSize(C0468d.abc_action_bar_stacked_tab_max_width);
    }
}
