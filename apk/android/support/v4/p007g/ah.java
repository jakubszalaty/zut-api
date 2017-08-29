package android.support.v4.p007g;

import android.view.View;
import android.view.View.AccessibilityDelegate;

/* renamed from: android.support.v4.g.ah */
class ah {
    public static void m1191a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    public static boolean m1192a(View view, int i) {
        return view.canScrollVertically(i);
    }
}
