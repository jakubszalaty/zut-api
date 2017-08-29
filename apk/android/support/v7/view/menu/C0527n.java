package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0468d;
import android.support.v7.view.menu.C0501o.C0442a;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.n */
public class C0527n {
    private final Context f1278a;
    private final C0515h f1279b;
    private final boolean f1280c;
    private final int f1281d;
    private final int f1282e;
    private View f1283f;
    private int f1284g;
    private boolean f1285h;
    private C0442a f1286i;
    private C0510m f1287j;
    private OnDismissListener f1288k;
    private final OnDismissListener f1289l;

    /* renamed from: android.support.v7.view.menu.n.1 */
    class C05261 implements OnDismissListener {
        final /* synthetic */ C0527n f1277a;

        C05261(C0527n c0527n) {
            this.f1277a = c0527n;
        }

        public void onDismiss() {
            this.f1277a.m2566e();
        }
    }

    public C0527n(Context context, C0515h c0515h, View view, boolean z, int i) {
        this(context, c0515h, view, z, i, 0);
    }

    public C0527n(Context context, C0515h c0515h, View view, boolean z, int i, int i2) {
        this.f1284g = 8388611;
        this.f1289l = new C05261(this);
        this.f1278a = context;
        this.f1279b = c0515h;
        this.f1283f = view;
        this.f1280c = z;
        this.f1281d = i;
        this.f1282e = i2;
    }

    private void m2554a(int i, int i2, boolean z, boolean z2) {
        C0510m b = m2563b();
        b.m2407c(z2);
        if (z) {
            if ((C0290f.m1466a(this.f1284g, ae.m1147d(this.f1283f)) & 7) == 5) {
                i -= this.f1283f.getWidth();
            }
            b.m2404b(i);
            b.m2406c(i2);
            int i3 = (int) ((this.f1278a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.m2398a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        b.m2389a();
    }

    private C0510m m2555g() {
        Display defaultDisplay = ((WindowManager) this.f1278a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else if (VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        C0510m c0511e = (Math.min(point.x, point.y) >= this.f1278a.getResources().getDimensionPixelSize(C0468d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null ? new C0511e(this.f1278a, this.f1283f, this.f1281d, this.f1282e, this.f1280c) : new C0531t(this.f1278a, this.f1279b, this.f1283f, this.f1281d, this.f1282e, this.f1280c);
        c0511e.m2399a(this.f1279b);
        c0511e.m2401a(this.f1289l);
        c0511e.m2400a(this.f1283f);
        c0511e.m2356a(this.f1286i);
        c0511e.m2402a(this.f1285h);
        c0511e.m2396a(this.f1284g);
        return c0511e;
    }

    public void m2556a() {
        if (!m2564c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m2557a(int i) {
        this.f1284g = i;
    }

    public void m2558a(C0442a c0442a) {
        this.f1286i = c0442a;
        if (this.f1287j != null) {
            this.f1287j.m2356a(c0442a);
        }
    }

    public void m2559a(View view) {
        this.f1283f = view;
    }

    public void m2560a(OnDismissListener onDismissListener) {
        this.f1288k = onDismissListener;
    }

    public void m2561a(boolean z) {
        this.f1285h = z;
        if (this.f1287j != null) {
            this.f1287j.m2402a(z);
        }
    }

    public boolean m2562a(int i, int i2) {
        if (m2567f()) {
            return true;
        }
        if (this.f1283f == null) {
            return false;
        }
        m2554a(i, i2, true, true);
        return true;
    }

    public C0510m m2563b() {
        if (this.f1287j == null) {
            this.f1287j = m2555g();
        }
        return this.f1287j;
    }

    public boolean m2564c() {
        if (m2567f()) {
            return true;
        }
        if (this.f1283f == null) {
            return false;
        }
        m2554a(0, 0, false, false);
        return true;
    }

    public void m2565d() {
        if (m2567f()) {
            this.f1287j.m2390c();
        }
    }

    protected void m2566e() {
        this.f1287j = null;
        if (this.f1288k != null) {
            this.f1288k.onDismiss();
        }
    }

    public boolean m2567f() {
        return this.f1287j != null && this.f1287j.m2391d();
    }
}
