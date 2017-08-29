package android.support.v4.p007g;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: android.support.v4.g.ax */
class ax {

    /* renamed from: android.support.v4.g.ax.1 */
    static class C02661 implements AnimatorUpdateListener {
        final /* synthetic */ ba f533a;
        final /* synthetic */ View f534b;

        C02661(ba baVar, View view) {
            this.f533a = baVar;
            this.f534b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f533a.m1410a(this.f534b);
        }
    }

    public static void m1330a(View view, ba baVar) {
        AnimatorUpdateListener animatorUpdateListener = null;
        if (baVar != null) {
            animatorUpdateListener = new C02661(baVar, view);
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
