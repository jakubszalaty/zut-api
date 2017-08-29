package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.n */
public final class C0374n {
    public static void m1800a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            C0376p.m1802a(listView, i);
        } else {
            C0375o.m1801a(listView, i);
        }
    }
}
