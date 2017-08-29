package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

/* renamed from: android.support.v4.g.ac */
public final class ac {
    static final C0222c f504a;

    /* renamed from: android.support.v4.g.ac.c */
    interface C0222c {
        float m982a(VelocityTracker velocityTracker, int i);

        float m983b(VelocityTracker velocityTracker, int i);
    }

    /* renamed from: android.support.v4.g.ac.a */
    static class C0223a implements C0222c {
        C0223a() {
        }

        public float m984a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }

        public float m985b(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getYVelocity();
        }
    }

    /* renamed from: android.support.v4.g.ac.b */
    static class C0224b implements C0222c {
        C0224b() {
        }

        public float m986a(VelocityTracker velocityTracker, int i) {
            return ad.m990a(velocityTracker, i);
        }

        public float m987b(VelocityTracker velocityTracker, int i) {
            return ad.m991b(velocityTracker, i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f504a = new C0224b();
        } else {
            f504a = new C0223a();
        }
    }

    public static float m988a(VelocityTracker velocityTracker, int i) {
        return f504a.m982a(velocityTracker, i);
    }

    public static float m989b(VelocityTracker velocityTracker, int i) {
        return f504a.m983b(velocityTracker, i);
    }
}
