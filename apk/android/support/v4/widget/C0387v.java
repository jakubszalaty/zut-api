package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.v */
public final class C0387v {
    OverScroller f704a;
    private final boolean f705b;

    C0387v(boolean z, Context context, Interpolator interpolator) {
        this.f705b = z;
        this.f704a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static C0387v m1822a(Context context) {
        return C0387v.m1823a(context, null);
    }

    public static C0387v m1823a(Context context, Interpolator interpolator) {
        return new C0387v(VERSION.SDK_INT >= 14, context, interpolator);
    }

    public void m1824a(int i, int i2, int i3, int i4) {
        this.f704a.startScroll(i, i2, i3, i4);
    }

    public void m1825a(int i, int i2, int i3, int i4, int i5) {
        this.f704a.startScroll(i, i2, i3, i4, i5);
    }

    public void m1826a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f704a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void m1827a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f704a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public boolean m1828a() {
        return this.f704a.isFinished();
    }

    public boolean m1829a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f704a.springBack(i, i2, i3, i4, i5, i6);
    }

    public int m1830b() {
        return this.f704a.getCurrX();
    }

    public int m1831c() {
        return this.f704a.getCurrY();
    }

    public int m1832d() {
        return this.f704a.getFinalX();
    }

    public int m1833e() {
        return this.f704a.getFinalY();
    }

    public float m1834f() {
        return this.f705b ? C0388w.m1837a(this.f704a) : 0.0f;
    }

    public boolean m1835g() {
        return this.f704a.computeScrollOffset();
    }

    public void m1836h() {
        this.f704a.abortAnimation();
    }
}
