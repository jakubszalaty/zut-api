package android.support.v4.p007g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.g.av */
class av {

    /* renamed from: android.support.v4.g.av.1 */
    static class C02641 extends AnimatorListenerAdapter {
        final /* synthetic */ ay f529a;
        final /* synthetic */ View f530b;

        C02641(ay ayVar, View view) {
            this.f529a = ayVar;
            this.f530b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f529a.m1295c(this.f530b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f529a.m1294b(this.f530b);
        }

        public void onAnimationStart(Animator animator) {
            this.f529a.m1293a(this.f530b);
        }
    }

    public static long m1320a(View view) {
        return view.animate().getDuration();
    }

    public static void m1321a(View view, float f) {
        view.animate().alpha(f);
    }

    public static void m1322a(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void m1323a(View view, ay ayVar) {
        if (ayVar != null) {
            view.animate().setListener(new C02641(ayVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public static void m1324a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    public static void m1325b(View view) {
        view.animate().cancel();
    }

    public static void m1326b(View view, float f) {
        view.animate().translationY(f);
    }

    public static void m1327b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    public static void m1328c(View view) {
        view.animate().start();
    }
}
