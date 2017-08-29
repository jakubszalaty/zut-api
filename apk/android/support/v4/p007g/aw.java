package android.support.v4.p007g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v4.g.aw */
class aw {

    /* renamed from: android.support.v4.g.aw.1 */
    static class C02651 extends AnimatorListenerAdapter {
        final /* synthetic */ ay f531a;
        final /* synthetic */ View f532b;

        C02651(ay ayVar, View view) {
            this.f531a = ayVar;
            this.f532b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f531a.m1295c(this.f532b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f531a.m1294b(this.f532b);
        }

        public void onAnimationStart(Animator animator) {
            this.f531a.m1293a(this.f532b);
        }
    }

    public static void m1329a(View view, ay ayVar) {
        if (ayVar != null) {
            view.animate().setListener(new C02651(ayVar, view));
        } else {
            view.animate().setListener(null);
        }
    }
}
