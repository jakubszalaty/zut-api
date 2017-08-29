package android.support.v4.widget;

import android.content.Context;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.ac;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.y */
public class C0392y {
    private static final Interpolator f707v;
    private int f708a;
    private int f709b;
    private int f710c;
    private float[] f711d;
    private float[] f712e;
    private float[] f713f;
    private float[] f714g;
    private int[] f715h;
    private int[] f716i;
    private int[] f717j;
    private int f718k;
    private VelocityTracker f719l;
    private float f720m;
    private float f721n;
    private int f722o;
    private int f723p;
    private C0387v f724q;
    private final C0341a f725r;
    private View f726s;
    private boolean f727t;
    private final ViewGroup f728u;
    private final Runnable f729w;

    /* renamed from: android.support.v4.widget.y.a */
    public static abstract class C0341a {
        public int m1581a(View view) {
            return 0;
        }

        public int m1582a(View view, int i, int i2) {
            return 0;
        }

        public void m1583a(int i) {
        }

        public void m1584a(int i, int i2) {
        }

        public void m1585a(View view, float f, float f2) {
        }

        public void m1586a(View view, int i, int i2, int i3, int i4) {
        }

        public abstract boolean m1587a(View view, int i);

        public int m1588b(View view) {
            return 0;
        }

        public int m1589b(View view, int i, int i2) {
            return 0;
        }

        public void m1590b(int i, int i2) {
        }

        public void m1591b(View view, int i) {
        }

        public boolean m1592b(int i) {
            return false;
        }

        public int m1593c(int i) {
            return i;
        }
    }

    /* renamed from: android.support.v4.widget.y.1 */
    static class C03901 implements Interpolator {
        C03901() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    /* renamed from: android.support.v4.widget.y.2 */
    class C03912 implements Runnable {
        final /* synthetic */ C0392y f706a;

        C03912(C0392y c0392y) {
            this.f706a = c0392y;
        }

        public void run() {
            this.f706a.m1874c(0);
        }
    }

    static {
        f707v = new C03901();
    }

    private C0392y(Context context, ViewGroup viewGroup, C0341a c0341a) {
        this.f710c = -1;
        this.f729w = new C03912(this);
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0341a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f728u = viewGroup;
            this.f725r = c0341a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f722o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f709b = viewConfiguration.getScaledTouchSlop();
            this.f720m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f721n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f724q = C0387v.m1823a(context, f707v);
        }
    }

    private float m1838a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int m1839a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f728u.getWidth();
        int i4 = width / 2;
        float b = (m1848b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(b / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    private int m1840a(View view, int i, int i2, int i3, int i4) {
        int b = m1849b(i3, (int) this.f721n, (int) this.f720m);
        int b2 = m1849b(i4, (int) this.f721n, (int) this.f720m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) m1839a(i2, b2, this.f725r.m1588b(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) m1839a(i, b, this.f725r.m1581a(view)))));
    }

    public static C0392y m1841a(ViewGroup viewGroup, float f, C0341a c0341a) {
        C0392y a = C0392y.m1842a(viewGroup, c0341a);
        a.f709b = (int) (((float) a.f709b) * (1.0f / f));
        return a;
    }

    public static C0392y m1842a(ViewGroup viewGroup, C0341a c0341a) {
        return new C0392y(viewGroup.getContext(), viewGroup, c0341a);
    }

    private void m1843a(float f, float f2) {
        this.f727t = true;
        this.f725r.m1585a(this.f726s, f, f2);
        this.f727t = false;
        if (this.f708a == 1) {
            m1874c(0);
        }
    }

    private void m1844a(float f, float f2, int i) {
        m1856f(i);
        float[] fArr = this.f711d;
        this.f713f[i] = f;
        fArr[i] = f;
        fArr = this.f712e;
        this.f714g[i] = f2;
        fArr[i] = f2;
        this.f715h[i] = m1853e((int) f, (int) f2);
        this.f718k |= 1 << i;
    }

    private boolean m1845a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f715h[i] & i2) != i2 || (this.f723p & i2) == 0 || (this.f717j[i] & i2) == i2 || (this.f716i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f709b) && abs2 <= ((float) this.f709b)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f725r.m1592b(i2)) {
            return (this.f716i[i] & i2) == 0 && abs > ((float) this.f709b);
        } else {
            int[] iArr = this.f717j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
    }

    private boolean m1846a(int i, int i2, int i3, int i4) {
        int left = this.f726s.getLeft();
        int top = this.f726s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f724q.m1836h();
            m1874c(0);
            return false;
        }
        this.f724q.m1825a(left, top, i5, i6, m1840a(this.f726s, i5, i6, i3, i4));
        m1874c(2);
        return true;
    }

    private boolean m1847a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f725r.m1581a(view) > 0;
        boolean z2 = this.f725r.m1588b(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f709b * this.f709b)) : z ? Math.abs(f) > ((float) this.f709b) : z2 ? Math.abs(f2) > ((float) this.f709b) : false;
    }

    private float m1848b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    private int m1849b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void m1850b(float f, float f2, int i) {
        int i2 = 1;
        if (!m1845a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m1845a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m1845a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m1845a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f716i;
            iArr[i] = iArr[i] | i2;
            this.f725r.m1590b(i2, i);
        }
    }

    private void m1851b(int i, int i2, int i3, int i4) {
        int a;
        int b;
        int left = this.f726s.getLeft();
        int top = this.f726s.getTop();
        if (i3 != 0) {
            a = this.f725r.m1582a(this.f726s, i, i3);
            ae.m1148d(this.f726s, a - left);
        } else {
            a = i;
        }
        if (i4 != 0) {
            b = this.f725r.m1589b(this.f726s, i2, i4);
            ae.m1146c(this.f726s, b - top);
        } else {
            b = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f725r.m1586a(this.f726s, a, b, a - left, b - top);
        }
    }

    private void m1852c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1858g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f713f[pointerId] = x;
                this.f714g[pointerId] = y;
            }
        }
    }

    private int m1853e(int i, int i2) {
        int i3 = 0;
        if (i < this.f728u.getLeft() + this.f722o) {
            i3 = 1;
        }
        if (i2 < this.f728u.getTop() + this.f722o) {
            i3 |= 4;
        }
        if (i > this.f728u.getRight() - this.f722o) {
            i3 |= 2;
        }
        return i2 > this.f728u.getBottom() - this.f722o ? i3 | 8 : i3;
    }

    private void m1854e(int i) {
        if (this.f711d != null && m1869b(i)) {
            this.f711d[i] = 0.0f;
            this.f712e[i] = 0.0f;
            this.f713f[i] = 0.0f;
            this.f714g[i] = 0.0f;
            this.f715h[i] = 0;
            this.f716i[i] = 0;
            this.f717j[i] = 0;
            this.f718k &= (1 << i) ^ -1;
        }
    }

    private void m1855f() {
        if (this.f711d != null) {
            Arrays.fill(this.f711d, 0.0f);
            Arrays.fill(this.f712e, 0.0f);
            Arrays.fill(this.f713f, 0.0f);
            Arrays.fill(this.f714g, 0.0f);
            Arrays.fill(this.f715h, 0);
            Arrays.fill(this.f716i, 0);
            Arrays.fill(this.f717j, 0);
            this.f718k = 0;
        }
    }

    private void m1856f(int i) {
        if (this.f711d == null || this.f711d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f711d != null) {
                System.arraycopy(this.f711d, 0, obj, 0, this.f711d.length);
                System.arraycopy(this.f712e, 0, obj2, 0, this.f712e.length);
                System.arraycopy(this.f713f, 0, obj3, 0, this.f713f.length);
                System.arraycopy(this.f714g, 0, obj4, 0, this.f714g.length);
                System.arraycopy(this.f715h, 0, obj5, 0, this.f715h.length);
                System.arraycopy(this.f716i, 0, obj6, 0, this.f716i.length);
                System.arraycopy(this.f717j, 0, obj7, 0, this.f717j.length);
            }
            this.f711d = obj;
            this.f712e = obj2;
            this.f713f = obj3;
            this.f714g = obj4;
            this.f715h = obj5;
            this.f716i = obj6;
            this.f717j = obj7;
        }
    }

    private void m1857g() {
        this.f719l.computeCurrentVelocity(1000, this.f720m);
        m1843a(m1838a(ac.m988a(this.f719l, this.f710c), this.f721n, this.f720m), m1838a(ac.m989b(this.f719l, this.f710c), this.f721n, this.f720m));
    }

    private boolean m1858g(int i) {
        if (m1869b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public int m1859a() {
        return this.f708a;
    }

    public void m1860a(float f) {
        this.f721n = f;
    }

    public void m1861a(int i) {
        this.f723p = i;
    }

    public void m1862a(View view, int i) {
        if (view.getParent() != this.f728u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f728u + ")");
        }
        this.f726s = view;
        this.f710c = i;
        this.f725r.m1591b(view, i);
        m1874c(1);
    }

    public boolean m1863a(int i, int i2) {
        if (this.f727t) {
            return m1846a(i, i2, (int) ac.m988a(this.f719l, this.f710c), (int) ac.m989b(this.f719l, this.f710c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1864a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = android.support.v4.p007g.C0324t.m1535a(r14);
        r1 = android.support.v4.p007g.C0324t.m1536b(r14);
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.m1879e();
    L_0x000d:
        r2 = r13.f719l;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.f719l = r2;
    L_0x0017:
        r2 = r13.f719l;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0128;
            case 2: goto L_0x0092;
            case 3: goto L_0x0128;
            case 4: goto L_0x001f;
            case 5: goto L_0x005a;
            case 6: goto L_0x011f;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.f708a;
        r1 = 1;
        if (r0 != r1) goto L_0x012d;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.m1844a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.m1877d(r0, r1);
        r1 = r13.f726s;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.f708a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.m1871b(r0, r2);
    L_0x0048:
        r0 = r13.f715h;
        r0 = r0[r2];
        r1 = r13.f723p;
        r1 = r1 & r0;
        if (r1 == 0) goto L_0x001f;
    L_0x0051:
        r1 = r13.f725r;
        r3 = r13.f723p;
        r0 = r0 & r3;
        r1.m1584a(r0, r2);
        goto L_0x001f;
    L_0x005a:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.m1844a(r2, r1, r0);
        r3 = r13.f708a;
        if (r3 != 0) goto L_0x007f;
    L_0x006d:
        r1 = r13.f715h;
        r1 = r1[r0];
        r2 = r13.f723p;
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x001f;
    L_0x0076:
        r2 = r13.f725r;
        r3 = r13.f723p;
        r1 = r1 & r3;
        r2.m1584a(r1, r0);
        goto L_0x001f;
    L_0x007f:
        r3 = r13.f708a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x0084:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.m1877d(r2, r1);
        r2 = r13.f726s;
        if (r1 != r2) goto L_0x001f;
    L_0x008e:
        r13.m1871b(r1, r0);
        goto L_0x001f;
    L_0x0092:
        r0 = r13.f711d;
        if (r0 == 0) goto L_0x001f;
    L_0x0096:
        r0 = r13.f712e;
        if (r0 == 0) goto L_0x001f;
    L_0x009a:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x00a0:
        if (r1 >= r2) goto L_0x0107;
    L_0x00a2:
        r3 = r14.getPointerId(r1);
        r0 = r13.m1858g(r3);
        if (r0 != 0) goto L_0x00b0;
    L_0x00ac:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00a0;
    L_0x00b0:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.f711d;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f712e;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.m1877d(r0, r4);
        if (r4 == 0) goto L_0x010c;
    L_0x00cc:
        r0 = r13.m1847a(r4, r5, r6);
        if (r0 == 0) goto L_0x010c;
    L_0x00d2:
        r0 = 1;
    L_0x00d3:
        if (r0 == 0) goto L_0x010e;
    L_0x00d5:
        r7 = r4.getLeft();
        r8 = (int) r5;
        r8 = r8 + r7;
        r9 = r13.f725r;
        r10 = (int) r5;
        r8 = r9.m1582a(r4, r8, r10);
        r9 = r4.getTop();
        r10 = (int) r6;
        r10 = r10 + r9;
        r11 = r13.f725r;
        r12 = (int) r6;
        r10 = r11.m1589b(r4, r10, r12);
        r11 = r13.f725r;
        r11 = r11.m1581a(r4);
        r12 = r13.f725r;
        r12 = r12.m1588b(r4);
        if (r11 == 0) goto L_0x0101;
    L_0x00fd:
        if (r11 <= 0) goto L_0x010e;
    L_0x00ff:
        if (r8 != r7) goto L_0x010e;
    L_0x0101:
        if (r12 == 0) goto L_0x0107;
    L_0x0103:
        if (r12 <= 0) goto L_0x010e;
    L_0x0105:
        if (r10 != r9) goto L_0x010e;
    L_0x0107:
        r13.m1852c(r14);
        goto L_0x001f;
    L_0x010c:
        r0 = 0;
        goto L_0x00d3;
    L_0x010e:
        r13.m1850b(r5, r6, r3);
        r5 = r13.f708a;
        r6 = 1;
        if (r5 == r6) goto L_0x0107;
    L_0x0116:
        if (r0 == 0) goto L_0x00ac;
    L_0x0118:
        r0 = r13.m1871b(r4, r3);
        if (r0 == 0) goto L_0x00ac;
    L_0x011e:
        goto L_0x0107;
    L_0x011f:
        r0 = r14.getPointerId(r1);
        r13.m1854e(r0);
        goto L_0x001f;
    L_0x0128:
        r13.m1879e();
        goto L_0x001f;
    L_0x012d:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.y.a(android.view.MotionEvent):boolean");
    }

    public boolean m1865a(View view, int i, int i2) {
        this.f726s = view;
        this.f710c = -1;
        boolean a = m1846a(i, i2, 0, 0);
        if (!(a || this.f708a != 0 || this.f726s == null)) {
            this.f726s = null;
        }
        return a;
    }

    public boolean m1866a(boolean z) {
        if (this.f708a == 2) {
            int i;
            boolean g = this.f724q.m1835g();
            int b = this.f724q.m1830b();
            int c = this.f724q.m1831c();
            int left = b - this.f726s.getLeft();
            int top = c - this.f726s.getTop();
            if (left != 0) {
                ae.m1148d(this.f726s, left);
            }
            if (top != 0) {
                ae.m1146c(this.f726s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f725r.m1586a(this.f726s, b, c, left, top);
            }
            if (g && b == this.f724q.m1832d() && c == this.f724q.m1833e()) {
                this.f724q.m1836h();
                i = 0;
            } else {
                boolean z2 = g;
            }
            if (i == 0) {
                if (z) {
                    this.f728u.post(this.f729w);
                } else {
                    m1874c(0);
                }
            }
        }
        return this.f708a == 2;
    }

    public int m1867b() {
        return this.f722o;
    }

    public void m1868b(MotionEvent motionEvent) {
        int i = 0;
        int a = C0324t.m1535a(motionEvent);
        int b = C0324t.m1536b(motionEvent);
        if (a == 0) {
            m1879e();
        }
        if (this.f719l == null) {
            this.f719l = VelocityTracker.obtain();
        }
        this.f719l.addMovement(motionEvent);
        float x;
        float y;
        View d;
        int i2;
        switch (a) {
            case C0474j.View_android_theme /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                d = m1877d((int) x, (int) y);
                m1844a(x, y, i);
                m1871b(d, i);
                i2 = this.f715h[i];
                if ((this.f723p & i2) != 0) {
                    this.f725r.m1584a(i2 & this.f723p, i);
                }
            case C0474j.View_android_focusable /*1*/:
                if (this.f708a == 1) {
                    m1857g();
                }
                m1879e();
            case C0474j.View_paddingStart /*2*/:
                if (this.f708a != 1) {
                    i2 = motionEvent.getPointerCount();
                    while (i < i2) {
                        a = motionEvent.getPointerId(i);
                        if (m1858g(a)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f711d[a];
                            float f2 = y2 - this.f712e[a];
                            m1850b(f, f2, a);
                            if (this.f708a != 1) {
                                d = m1877d((int) x2, (int) y2);
                                if (m1847a(d, f, f2) && m1871b(d, a)) {
                                }
                            }
                            m1852c(motionEvent);
                        }
                        i++;
                    }
                    m1852c(motionEvent);
                } else if (m1858g(this.f710c)) {
                    i = motionEvent.findPointerIndex(this.f710c);
                    x = motionEvent.getX(i);
                    i2 = (int) (x - this.f713f[this.f710c]);
                    i = (int) (motionEvent.getY(i) - this.f714g[this.f710c]);
                    m1851b(this.f726s.getLeft() + i2, this.f726s.getTop() + i, i2, i);
                    m1852c(motionEvent);
                }
            case C0474j.View_paddingEnd /*3*/:
                if (this.f708a == 1) {
                    m1843a(0.0f, 0.0f);
                }
                m1879e();
            case C0474j.Toolbar_contentInsetStart /*5*/:
                i = motionEvent.getPointerId(b);
                x = motionEvent.getX(b);
                y = motionEvent.getY(b);
                m1844a(x, y, i);
                if (this.f708a == 0) {
                    m1871b(m1877d((int) x, (int) y), i);
                    i2 = this.f715h[i];
                    if ((this.f723p & i2) != 0) {
                        this.f725r.m1584a(i2 & this.f723p, i);
                    }
                } else if (m1875c((int) x, (int) y)) {
                    m1871b(this.f726s, i);
                }
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                a = motionEvent.getPointerId(b);
                if (this.f708a == 1 && a == this.f710c) {
                    b = motionEvent.getPointerCount();
                    while (i < b) {
                        int pointerId = motionEvent.getPointerId(i);
                        if (pointerId != this.f710c) {
                            if (m1877d((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f726s && m1871b(this.f726s, pointerId)) {
                                i = this.f710c;
                                if (i == -1) {
                                    m1857g();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m1857g();
                    }
                }
                m1854e(a);
            default:
        }
    }

    public boolean m1869b(int i) {
        return (this.f718k & (1 << i)) != 0;
    }

    public boolean m1870b(int i, int i2) {
        if (!m1869b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f713f[i2] - this.f711d[i2];
        float f2 = this.f714g[i2] - this.f712e[i2];
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f709b * this.f709b)) : z ? Math.abs(f) > ((float) this.f709b) : z2 ? Math.abs(f2) > ((float) this.f709b) : false;
    }

    boolean m1871b(View view, int i) {
        if (view == this.f726s && this.f710c == i) {
            return true;
        }
        if (view == null || !this.f725r.m1587a(view, i)) {
            return false;
        }
        this.f710c = i;
        m1862a(view, i);
        return true;
    }

    public boolean m1872b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View m1873c() {
        return this.f726s;
    }

    void m1874c(int i) {
        this.f728u.removeCallbacks(this.f729w);
        if (this.f708a != i) {
            this.f708a = i;
            this.f725r.m1583a(i);
            if (this.f708a == 0) {
                this.f726s = null;
            }
        }
    }

    public boolean m1875c(int i, int i2) {
        return m1872b(this.f726s, i, i2);
    }

    public int m1876d() {
        return this.f709b;
    }

    public View m1877d(int i, int i2) {
        for (int childCount = this.f728u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f728u.getChildAt(this.f725r.m1593c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean m1878d(int i) {
        int length = this.f711d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m1870b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void m1879e() {
        this.f710c = -1;
        m1855f();
        if (this.f719l != null) {
            this.f719l.recycle();
            this.f719l = null;
        }
    }
}
