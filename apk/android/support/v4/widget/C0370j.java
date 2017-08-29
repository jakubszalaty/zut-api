package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.widget.j */
public final class C0370j {
    private static final C0366c f694b;
    private Object f695a;

    /* renamed from: android.support.v4.widget.j.c */
    interface C0366c {
        Object m1761a(Context context);

        void m1762a(Object obj, int i, int i2);

        boolean m1763a(Object obj);

        boolean m1764a(Object obj, float f, float f2);

        boolean m1765a(Object obj, int i);

        boolean m1766a(Object obj, Canvas canvas);

        boolean m1767b(Object obj);
    }

    /* renamed from: android.support.v4.widget.j.a */
    static class C0367a implements C0366c {
        C0367a() {
        }

        public Object m1768a(Context context) {
            return null;
        }

        public void m1769a(Object obj, int i, int i2) {
        }

        public boolean m1770a(Object obj) {
            return true;
        }

        public boolean m1771a(Object obj, float f, float f2) {
            return false;
        }

        public boolean m1772a(Object obj, int i) {
            return false;
        }

        public boolean m1773a(Object obj, Canvas canvas) {
            return false;
        }

        public boolean m1774b(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.j.b */
    static class C0368b implements C0366c {
        C0368b() {
        }

        public Object m1775a(Context context) {
            return C0371k.m1789a(context);
        }

        public void m1776a(Object obj, int i, int i2) {
            C0371k.m1790a(obj, i, i2);
        }

        public boolean m1777a(Object obj) {
            return C0371k.m1791a(obj);
        }

        public boolean m1778a(Object obj, float f, float f2) {
            return C0371k.m1792a(obj, f);
        }

        public boolean m1779a(Object obj, int i) {
            return C0371k.m1793a(obj, i);
        }

        public boolean m1780a(Object obj, Canvas canvas) {
            return C0371k.m1794a(obj, canvas);
        }

        public boolean m1781b(Object obj) {
            return C0371k.m1795b(obj);
        }
    }

    /* renamed from: android.support.v4.widget.j.d */
    static class C0369d extends C0368b {
        C0369d() {
        }

        public boolean m1782a(Object obj, float f, float f2) {
            return C0372l.m1796a(obj, f, f2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f694b = new C0369d();
        } else if (VERSION.SDK_INT >= 14) {
            f694b = new C0368b();
        } else {
            f694b = new C0367a();
        }
    }

    public C0370j(Context context) {
        this.f695a = f694b.m1761a(context);
    }

    public void m1783a(int i, int i2) {
        f694b.m1762a(this.f695a, i, i2);
    }

    public boolean m1784a() {
        return f694b.m1763a(this.f695a);
    }

    public boolean m1785a(float f, float f2) {
        return f694b.m1764a(this.f695a, f, f2);
    }

    public boolean m1786a(int i) {
        return f694b.m1765a(this.f695a, i);
    }

    public boolean m1787a(Canvas canvas) {
        return f694b.m1766a(this.f695a, canvas);
    }

    public boolean m1788b() {
        return f694b.m1767b(this.f695a);
    }
}
