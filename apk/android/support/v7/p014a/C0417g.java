package android.support.v7.p014a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p011e.C0152c;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.a.g */
public abstract class C0417g {
    private static int f844a;
    private static boolean f845b;

    static {
        f844a = -1;
        f845b = false;
    }

    C0417g() {
    }

    public static C0417g m1961a(Activity activity, C0397f c0397f) {
        return C0417g.m1963a(activity, activity.getWindow(), c0397f);
    }

    public static C0417g m1962a(Dialog dialog, C0397f c0397f) {
        return C0417g.m1963a(dialog.getContext(), dialog.getWindow(), c0397f);
    }

    private static C0417g m1963a(Context context, Window window, C0397f c0397f) {
        int i = VERSION.SDK_INT;
        return C0152c.m599a() ? new C0430i(context, window, c0397f) : i >= 23 ? new C0429l(context, window, c0397f) : i >= 14 ? new C0428k(context, window, c0397f) : i >= 11 ? new C0427j(context, window, c0397f) : new C0426m(context, window, c0397f);
    }

    public static int m1964j() {
        return f844a;
    }

    public static boolean m1965k() {
        return f845b;
    }

    public abstract C0396a m1966a();

    public abstract View m1967a(int i);

    public abstract void m1968a(Configuration configuration);

    public abstract void m1969a(Bundle bundle);

    public abstract void m1970a(View view);

    public abstract void m1971a(View view, LayoutParams layoutParams);

    public abstract void m1972a(CharSequence charSequence);

    public abstract MenuInflater m1973b();

    public abstract void m1974b(int i);

    public abstract void m1975b(Bundle bundle);

    public abstract void m1976b(View view, LayoutParams layoutParams);

    public abstract void m1977c();

    public abstract void m1978c(Bundle bundle);

    public abstract boolean m1979c(int i);

    public abstract void m1980d();

    public abstract void m1981e();

    public abstract void m1982f();

    public abstract void m1983g();

    public abstract void m1984h();

    public abstract boolean m1985i();
}
