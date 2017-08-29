package android.support.v4.p007g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;

/* renamed from: android.support.v4.g.am */
class am {
    private static ThreadLocal<Rect> f513a;

    /* renamed from: android.support.v4.g.am.a */
    public interface C0237a {
        Object m1124a(View view, Object obj);
    }

    /* renamed from: android.support.v4.g.am.1 */
    static class C02391 implements OnApplyWindowInsetsListener {
        final /* synthetic */ C0237a f512a;

        C02391(C0237a c0237a) {
            this.f512a = c0237a;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) this.f512a.m1124a(view, windowInsets);
        }
    }

    private static Rect m1208a() {
        if (f513a == null) {
            f513a = new ThreadLocal();
        }
        Rect rect = (Rect) f513a.get();
        if (rect == null) {
            rect = new Rect();
            f513a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static Object m1209a(View view, Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets != windowInsets ? new WindowInsets(onApplyWindowInsets) : obj;
    }

    public static void m1210a(View view) {
        view.requestApplyInsets();
    }

    public static void m1211a(View view, float f) {
        view.setElevation(f);
    }

    static void m1212a(View view, int i) {
        Object obj;
        Rect a = am.m1208a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        ag.m1180a(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    static void m1213a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    static void m1214a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void m1215a(View view, C0237a c0237a) {
        if (c0237a == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new C02391(c0237a));
        }
    }

    public static float m1216b(View view) {
        return view.getElevation();
    }

    static void m1217b(View view, int i) {
        Object obj;
        Rect a = am.m1208a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        ag.m1185b(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    static ColorStateList m1218c(View view) {
        return view.getBackgroundTintList();
    }

    static Mode m1219d(View view) {
        return view.getBackgroundTintMode();
    }

    public static void m1220e(View view) {
        view.stopNestedScroll();
    }
}
