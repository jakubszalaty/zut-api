package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0350a implements OnTouchListener {
    private static final int f660r;
    final C0348a f661a;
    final View f662b;
    boolean f663c;
    boolean f664d;
    boolean f665e;
    private final Interpolator f666f;
    private Runnable f667g;
    private float[] f668h;
    private float[] f669i;
    private int f670j;
    private int f671k;
    private float[] f672l;
    private float[] f673m;
    private float[] f674n;
    private boolean f675o;
    private boolean f676p;
    private boolean f677q;

    /* renamed from: android.support.v4.widget.a.a */
    private static class C0348a {
        private int f648a;
        private int f649b;
        private float f650c;
        private float f651d;
        private long f652e;
        private long f653f;
        private int f654g;
        private int f655h;
        private long f656i;
        private float f657j;
        private int f658k;

        C0348a() {
            this.f652e = Long.MIN_VALUE;
            this.f656i = -1;
            this.f653f = 0;
            this.f654g = 0;
            this.f655h = 0;
        }

        private float m1689a(float f) {
            return ((-4.0f * f) * f) + (4.0f * f);
        }

        private float m1690a(long j) {
            if (j < this.f652e) {
                return 0.0f;
            }
            if (this.f656i < 0 || j < this.f656i) {
                return C0350a.m1702a(((float) (j - this.f652e)) / ((float) this.f648a), 0.0f, 1.0f) * 0.5f;
            }
            long j2 = j - this.f656i;
            return (C0350a.m1702a(((float) j2) / ((float) this.f658k), 0.0f, 1.0f) * this.f657j) + (1.0f - this.f657j);
        }

        public void m1691a() {
            this.f652e = AnimationUtils.currentAnimationTimeMillis();
            this.f656i = -1;
            this.f653f = this.f652e;
            this.f657j = 0.5f;
            this.f654g = 0;
            this.f655h = 0;
        }

        public void m1692a(float f, float f2) {
            this.f650c = f;
            this.f651d = f2;
        }

        public void m1693a(int i) {
            this.f648a = i;
        }

        public void m1694b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f658k = C0350a.m1705a((int) (currentAnimationTimeMillis - this.f652e), 0, this.f649b);
            this.f657j = m1690a(currentAnimationTimeMillis);
            this.f656i = currentAnimationTimeMillis;
        }

        public void m1695b(int i) {
            this.f649b = i;
        }

        public boolean m1696c() {
            return this.f656i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f656i + ((long) this.f658k);
        }

        public void m1697d() {
            if (this.f653f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m1689a(m1690a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f653f;
            this.f653f = currentAnimationTimeMillis;
            this.f654g = (int) ((((float) j) * a) * this.f650c);
            this.f655h = (int) ((((float) j) * a) * this.f651d);
        }

        public int m1698e() {
            return (int) (this.f650c / Math.abs(this.f650c));
        }

        public int m1699f() {
            return (int) (this.f651d / Math.abs(this.f651d));
        }

        public int m1700g() {
            return this.f654g;
        }

        public int m1701h() {
            return this.f655h;
        }
    }

    /* renamed from: android.support.v4.widget.a.b */
    private class C0349b implements Runnable {
        final /* synthetic */ C0350a f659a;

        C0349b(C0350a c0350a) {
            this.f659a = c0350a;
        }

        public void run() {
            if (this.f659a.f665e) {
                if (this.f659a.f663c) {
                    this.f659a.f663c = false;
                    this.f659a.f661a.m1691a();
                }
                C0348a c0348a = this.f659a.f661a;
                if (c0348a.m1696c() || !this.f659a.m1713a()) {
                    this.f659a.f665e = false;
                    return;
                }
                if (this.f659a.f664d) {
                    this.f659a.f664d = false;
                    this.f659a.m1716b();
                }
                c0348a.m1697d();
                this.f659a.m1712a(c0348a.m1700g(), c0348a.m1701h());
                ae.m1136a(this.f659a.f662b, (Runnable) this);
            }
        }
    }

    static {
        f660r = ViewConfiguration.getTapTimeout();
    }

    public C0350a(View view) {
        this.f661a = new C0348a();
        this.f666f = new AccelerateInterpolator();
        this.f668h = new float[]{0.0f, 0.0f};
        this.f669i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f672l = new float[]{0.0f, 0.0f};
        this.f673m = new float[]{0.0f, 0.0f};
        this.f674n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f662b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m1709a((float) i, (float) i);
        m1714b((float) i2, (float) i2);
        m1710a(1);
        m1721e(Float.MAX_VALUE, Float.MAX_VALUE);
        m1719d(0.2f, 0.2f);
        m1717c(1.0f, 1.0f);
        m1715b(f660r);
        m1718c(500);
        m1720d(500);
    }

    static float m1702a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private float m1703a(float f, float f2, float f3, float f4) {
        float f5;
        float a = C0350a.m1702a(f * f2, 0.0f, f3);
        a = m1708f(f2 - f4, a) - m1708f(f4, a);
        if (a < 0.0f) {
            f5 = -this.f666f.getInterpolation(-a);
        } else if (a <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f666f.getInterpolation(a);
        }
        return C0350a.m1702a(f5, -1.0f, 1.0f);
    }

    private float m1704a(int i, float f, float f2, float f3) {
        float a = m1703a(this.f668h[i], f2, this.f669i[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f672l[i];
        float f5 = this.f673m[i];
        float f6 = this.f674n[i];
        f4 *= f3;
        return a > 0.0f ? C0350a.m1702a(a * f4, f5, f6) : -C0350a.m1702a((-a) * f4, f5, f6);
    }

    static int m1705a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private void m1706c() {
        if (this.f667g == null) {
            this.f667g = new C0349b(this);
        }
        this.f665e = true;
        this.f663c = true;
        if (this.f675o || this.f671k <= 0) {
            this.f667g.run();
        } else {
            ae.m1137a(this.f662b, this.f667g, (long) this.f671k);
        }
        this.f675o = true;
    }

    private void m1707d() {
        if (this.f663c) {
            this.f665e = false;
        } else {
            this.f661a.m1694b();
        }
    }

    private float m1708f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f670j) {
            case C0474j.View_android_theme /*0*/:
            case C0474j.View_android_focusable /*1*/:
                return f < f2 ? f >= 0.0f ? 1.0f - (f / f2) : (this.f665e && this.f670j == 1) ? 1.0f : 0.0f : 0.0f;
            case C0474j.View_paddingStart /*2*/:
                return f < 0.0f ? f / (-f2) : 0.0f;
            default:
                return 0.0f;
        }
    }

    public C0350a m1709a(float f, float f2) {
        this.f674n[0] = f / 1000.0f;
        this.f674n[1] = f2 / 1000.0f;
        return this;
    }

    public C0350a m1710a(int i) {
        this.f670j = i;
        return this;
    }

    public C0350a m1711a(boolean z) {
        if (this.f676p && !z) {
            m1707d();
        }
        this.f676p = z;
        return this;
    }

    public abstract void m1712a(int i, int i2);

    boolean m1713a() {
        C0348a c0348a = this.f661a;
        int f = c0348a.m1699f();
        int e = c0348a.m1698e();
        return (f != 0 && m1723f(f)) || (e != 0 && m1722e(e));
    }

    public C0350a m1714b(float f, float f2) {
        this.f673m[0] = f / 1000.0f;
        this.f673m[1] = f2 / 1000.0f;
        return this;
    }

    public C0350a m1715b(int i) {
        this.f671k = i;
        return this;
    }

    void m1716b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f662b.onTouchEvent(obtain);
        obtain.recycle();
    }

    public C0350a m1717c(float f, float f2) {
        this.f672l[0] = f / 1000.0f;
        this.f672l[1] = f2 / 1000.0f;
        return this;
    }

    public C0350a m1718c(int i) {
        this.f661a.m1693a(i);
        return this;
    }

    public C0350a m1719d(float f, float f2) {
        this.f668h[0] = f;
        this.f668h[1] = f2;
        return this;
    }

    public C0350a m1720d(int i) {
        this.f661a.m1695b(i);
        return this;
    }

    public C0350a m1721e(float f, float f2) {
        this.f669i[0] = f;
        this.f669i[1] = f2;
        return this;
    }

    public abstract boolean m1722e(int i);

    public abstract boolean m1723f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f676p) {
            return false;
        }
        switch (C0324t.m1535a(motionEvent)) {
            case C0474j.View_android_theme /*0*/:
                this.f664d = true;
                this.f675o = false;
                break;
            case C0474j.View_android_focusable /*1*/:
            case C0474j.View_paddingEnd /*3*/:
                m1707d();
                break;
            case C0474j.View_paddingStart /*2*/:
                break;
        }
        this.f661a.m1692a(m1704a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f662b.getWidth()), m1704a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f662b.getHeight()));
        if (!this.f665e && m1713a()) {
            m1706c();
        }
        if (!(this.f677q && this.f665e)) {
            z = false;
        }
        return z;
    }
}
