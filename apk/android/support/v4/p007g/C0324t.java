package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* renamed from: android.support.v4.g.t */
public final class C0324t {
    static final C0320d f557a;

    /* renamed from: android.support.v4.g.t.d */
    interface C0320d {
        float m1531a(MotionEvent motionEvent, int i);
    }

    /* renamed from: android.support.v4.g.t.a */
    static class C0321a implements C0320d {
        C0321a() {
        }

        public float m1532a(MotionEvent motionEvent, int i) {
            return 0.0f;
        }
    }

    /* renamed from: android.support.v4.g.t.b */
    static class C0322b extends C0321a {
        C0322b() {
        }

        public float m1533a(MotionEvent motionEvent, int i) {
            return C0325u.m1537a(motionEvent, i);
        }
    }

    /* renamed from: android.support.v4.g.t.c */
    private static class C0323c extends C0322b {
        C0323c() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f557a = new C0323c();
        } else if (VERSION.SDK_INT >= 12) {
            f557a = new C0322b();
        } else {
            f557a = new C0321a();
        }
    }

    public static float m1534a(MotionEvent motionEvent, int i) {
        return f557a.m1531a(motionEvent, i);
    }

    public static int m1535a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m1536b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }
}
