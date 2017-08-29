package android.support.v4.p007g;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.ag */
class ag {
    public static int m1176a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int m1177a(View view) {
        return view.getLayerType();
    }

    static long m1178a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void m1179a(View view, float f) {
        view.setTranslationY(f);
    }

    static void m1180a(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            ag.m1190f(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                ag.m1190f((View) parent);
            }
        }
    }

    public static void m1181a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void m1182a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static int m1183b(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static void m1184b(View view, float f) {
        view.setAlpha(f);
    }

    static void m1185b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            ag.m1190f(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                ag.m1190f((View) parent);
            }
        }
    }

    public static void m1186b(View view, boolean z) {
        view.setActivated(z);
    }

    public static int m1187c(View view) {
        return view.getMeasuredState();
    }

    public static float m1188d(View view) {
        return view.getTranslationY();
    }

    public static void m1189e(View view) {
        view.jumpDrawablesToCurrentState();
    }

    private static void m1190f(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
