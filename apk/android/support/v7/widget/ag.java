package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.p007g.C0324t;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0509s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ag implements OnTouchListener {
    private final float f1092a;
    private final int f1093b;
    final View f1094c;
    private final int f1095d;
    private Runnable f1096e;
    private Runnable f1097f;
    private boolean f1098g;
    private int f1099h;
    private final int[] f1100i;

    /* renamed from: android.support.v7.widget.ag.a */
    private class C0565a implements Runnable {
        final /* synthetic */ ag f1572a;

        C0565a(ag agVar) {
            this.f1572a = agVar;
        }

        public void run() {
            ViewParent parent = this.f1572a.f1094c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ag.b */
    private class C0566b implements Runnable {
        final /* synthetic */ ag f1573a;

        C0566b(ag agVar) {
            this.f1573a = agVar;
        }

        public void run() {
            this.f1573a.m2323d();
        }
    }

    public ag(View view) {
        this.f1100i = new int[2];
        this.f1094c = view;
        this.f1092a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1093b = ViewConfiguration.getTapTimeout();
        this.f1095d = (this.f1093b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean m2314a(MotionEvent motionEvent) {
        View view = this.f1094c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (C0324t.m1535a(motionEvent)) {
            case C0474j.View_android_theme /*0*/:
                this.f1099h = motionEvent.getPointerId(0);
                if (this.f1096e == null) {
                    this.f1096e = new C0565a(this);
                }
                view.postDelayed(this.f1096e, (long) this.f1093b);
                if (this.f1097f == null) {
                    this.f1097f = new C0566b(this);
                }
                view.postDelayed(this.f1097f, (long) this.f1095d);
                return false;
            case C0474j.View_android_focusable /*1*/:
            case C0474j.View_paddingEnd /*3*/:
                m2319e();
                return false;
            case C0474j.View_paddingStart /*2*/:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1099h);
                if (findPointerIndex < 0 || m2315a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f1092a)) {
                    return false;
                }
                m2319e();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    private static boolean m2315a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean m2316a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1100i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private boolean m2317b(MotionEvent motionEvent) {
        View view = this.f1094c;
        C0509s a = m2320a();
        if (a == null || !a.m2391d()) {
            return false;
        }
        ae aeVar = (ae) a.m2392e();
        if (aeVar == null || !aeVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2318b(view, obtainNoHistory);
        m2316a(aeVar, obtainNoHistory);
        boolean a2 = aeVar.m2853a(obtainNoHistory, this.f1099h);
        obtainNoHistory.recycle();
        int a3 = C0324t.m1535a(motionEvent);
        boolean z = (a3 == 1 || a3 == 3) ? false : true;
        z = a2 && z;
        return z;
    }

    private boolean m2318b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1100i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private void m2319e() {
        if (this.f1097f != null) {
            this.f1094c.removeCallbacks(this.f1097f);
        }
        if (this.f1096e != null) {
            this.f1094c.removeCallbacks(this.f1096e);
        }
    }

    public abstract C0509s m2320a();

    protected boolean m2321b() {
        C0509s a = m2320a();
        if (!(a == null || a.m2391d())) {
            a.m2389a();
        }
        return true;
    }

    protected boolean m2322c() {
        C0509s a = m2320a();
        if (a != null && a.m2391d()) {
            a.m2390c();
        }
        return true;
    }

    void m2323d() {
        m2319e();
        View view = this.f1094c;
        if (view.isEnabled() && !view.isLongClickable() && m2321b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1098g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1098g;
        if (z2) {
            z = m2317b(motionEvent) || !m2322c();
        } else {
            boolean z3 = m2314a(motionEvent) && m2321b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1094c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.f1098g = z;
        return z || z2;
    }
}
