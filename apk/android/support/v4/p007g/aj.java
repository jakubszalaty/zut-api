package android.support.v4.p007g;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.aj */
class aj {
    public static void m1194a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void m1195a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void m1196a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void m1197a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int m1198b(View view) {
        return view.getImportantForAccessibility();
    }

    public static ViewParent m1199c(View view) {
        return view.getParentForAccessibility();
    }

    public static int m1200d(View view) {
        return view.getMinimumHeight();
    }

    public static void m1201e(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean m1202f(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean m1203g(View view) {
        return view.hasOverlappingRendering();
    }
}
