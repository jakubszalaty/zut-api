package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

/* renamed from: android.support.v4.widget.h */
class C0365h {
    private static final int[] f693a;

    /* renamed from: android.support.v4.widget.h.a */
    static class C0364a implements OnApplyWindowInsetsListener {
        C0364a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((C0343i) view).m1609a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    static {
        f693a = new int[]{16843828};
    }

    public static int m1756a(Object obj) {
        return obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
    }

    public static Drawable m1757a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f693a);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void m1758a(View view) {
        if (view instanceof C0343i) {
            view.setOnApplyWindowInsetsListener(new C0364a());
            view.setSystemUiVisibility(1280);
        }
    }

    public static void m1759a(View view, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void m1760a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
    }
}
