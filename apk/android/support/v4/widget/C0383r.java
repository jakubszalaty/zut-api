package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.r */
class C0383r {
    private static Field f700a;

    static {
        try {
            f700a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f700a.setAccessible(true);
        } catch (Throwable e) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }

    static void m1816a(PopupWindow popupWindow, boolean z) {
        if (f700a != null) {
            try {
                f700a.set(popupWindow, Boolean.valueOf(z));
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }
}
