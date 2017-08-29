package android.support.v4.p007g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.g.af */
class af {
    private static Field f510a;
    private static boolean f511b;

    static ColorStateList m1167a(View view) {
        return view instanceof ab ? ((ab) view).getSupportBackgroundTintList() : null;
    }

    static void m1168a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - abs, view.getRight(), (top + view.getHeight()) + abs);
                return;
            }
            view.invalidate();
        }
    }

    static void m1169a(View view, ColorStateList colorStateList) {
        if (view instanceof ab) {
            ((ab) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    static void m1170a(View view, Mode mode) {
        if (view instanceof ab) {
            ((ab) view).setSupportBackgroundTintMode(mode);
        }
    }

    static Mode m1171b(View view) {
        return view instanceof ab ? ((ab) view).getSupportBackgroundTintMode() : null;
    }

    static void m1172b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(left - abs, view.getTop(), (left + view.getWidth()) + abs, view.getBottom());
                return;
            }
            view.invalidate();
        }
    }

    static boolean m1173c(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    static int m1174d(View view) {
        if (!f511b) {
            try {
                f510a = View.class.getDeclaredField("mMinHeight");
                f510a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f511b = true;
        }
        if (f510a != null) {
            try {
                return ((Integer) f510a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    static boolean m1175e(View view) {
        return view.getWindowToken() != null;
    }
}
