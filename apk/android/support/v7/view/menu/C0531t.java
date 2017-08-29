package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.p015b.C0475a.C0468d;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.widget.al;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0531t extends C0510m implements C0501o, OnKeyListener, OnItemClickListener, OnDismissListener {
    final al f1291a;
    View f1292b;
    private final Context f1293c;
    private final C0515h f1294d;
    private final C0514g f1295e;
    private final boolean f1296f;
    private final int f1297g;
    private final int f1298h;
    private final int f1299i;
    private final OnGlobalLayoutListener f1300j;
    private OnDismissListener f1301k;
    private View f1302l;
    private C0442a f1303m;
    private ViewTreeObserver f1304n;
    private boolean f1305o;
    private boolean f1306p;
    private int f1307q;
    private int f1308r;
    private boolean f1309s;

    /* renamed from: android.support.v7.view.menu.t.1 */
    class C05301 implements OnGlobalLayoutListener {
        final /* synthetic */ C0531t f1290a;

        C05301(C0531t c0531t) {
            this.f1290a = c0531t;
        }

        public void onGlobalLayout() {
            if (this.f1290a.m2587d() && !this.f1290a.f1291a.m2877g()) {
                View view = this.f1290a.f1292b;
                if (view == null || !view.isShown()) {
                    this.f1290a.m2584c();
                } else {
                    this.f1290a.f1291a.m2859a();
                }
            }
        }
    }

    public C0531t(Context context, C0515h c0515h, View view, int i, int i2, boolean z) {
        this.f1300j = new C05301(this);
        this.f1308r = 0;
        this.f1293c = context;
        this.f1294d = c0515h;
        this.f1296f = z;
        this.f1295e = new C0514g(c0515h, LayoutInflater.from(context), this.f1296f);
        this.f1298h = i;
        this.f1299i = i2;
        Resources resources = context.getResources();
        this.f1297g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0468d.abc_config_prefDialogWidth));
        this.f1302l = view;
        this.f1291a = new al(this.f1293c, null, this.f1298h, this.f1299i);
        c0515h.m2471a((C0501o) this, context);
    }

    private boolean m2571h() {
        if (m2587d()) {
            return true;
        }
        if (this.f1305o || this.f1302l == null) {
            return false;
        }
        this.f1292b = this.f1302l;
        this.f1291a.m2865a((OnDismissListener) this);
        this.f1291a.m2863a((OnItemClickListener) this);
        this.f1291a.m2866a(true);
        View view = this.f1292b;
        boolean z = this.f1304n == null;
        this.f1304n = view.getViewTreeObserver();
        if (z) {
            this.f1304n.addOnGlobalLayoutListener(this.f1300j);
        }
        this.f1291a.m2868b(view);
        this.f1291a.m2874e(this.f1308r);
        if (!this.f1306p) {
            this.f1307q = C0510m.m2393a(this.f1295e, null, this.f1293c, this.f1297g);
            this.f1306p = true;
        }
        this.f1291a.m2876g(this.f1307q);
        this.f1291a.m2879h(2);
        this.f1291a.m2861a(m2409g());
        this.f1291a.m2859a();
        ViewGroup e = this.f1291a.m2873e();
        e.setOnKeyListener(this);
        if (this.f1309s && this.f1294d.m2500m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1293c).inflate(C0471g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1294d.m2500m());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, null, false);
        }
        this.f1291a.m2864a(this.f1295e);
        this.f1291a.m2859a();
        return true;
    }

    public void m2572a() {
        if (!m2571h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void m2573a(int i) {
        this.f1308r = i;
    }

    public void m2574a(C0515h c0515h) {
    }

    public void m2575a(C0515h c0515h, boolean z) {
        if (c0515h == this.f1294d) {
            m2584c();
            if (this.f1303m != null) {
                this.f1303m.m2102a(c0515h, z);
            }
        }
    }

    public void m2576a(C0442a c0442a) {
        this.f1303m = c0442a;
    }

    public void m2577a(View view) {
        this.f1302l = view;
    }

    public void m2578a(OnDismissListener onDismissListener) {
        this.f1301k = onDismissListener;
    }

    public void m2579a(boolean z) {
        this.f1295e.m2449a(z);
    }

    public boolean m2580a(C0532u c0532u) {
        if (c0532u.hasVisibleItems()) {
            C0527n c0527n = new C0527n(this.f1293c, c0532u, this.f1292b, this.f1296f, this.f1298h, this.f1299i);
            c0527n.m2558a(this.f1303m);
            c0527n.m2561a(C0510m.m2395b((C0515h) c0532u));
            c0527n.m2560a(this.f1301k);
            this.f1301k = null;
            this.f1294d.m2474a(false);
            if (c0527n.m2562a(this.f1291a.m2882j(), this.f1291a.m2883k())) {
                if (this.f1303m != null) {
                    this.f1303m.m2103a(c0532u);
                }
                return true;
            }
        }
        return false;
    }

    public void m2581b(int i) {
        this.f1291a.m2870c(i);
    }

    public void m2582b(boolean z) {
        this.f1306p = false;
        if (this.f1295e != null) {
            this.f1295e.notifyDataSetChanged();
        }
    }

    public boolean m2583b() {
        return false;
    }

    public void m2584c() {
        if (m2587d()) {
            this.f1291a.m2869c();
        }
    }

    public void m2585c(int i) {
        this.f1291a.m2871d(i);
    }

    public void m2586c(boolean z) {
        this.f1309s = z;
    }

    public boolean m2587d() {
        return !this.f1305o && this.f1291a.m2872d();
    }

    public ListView m2588e() {
        return this.f1291a.m2873e();
    }

    public void onDismiss() {
        this.f1305o = true;
        this.f1294d.close();
        if (this.f1304n != null) {
            if (!this.f1304n.isAlive()) {
                this.f1304n = this.f1292b.getViewTreeObserver();
            }
            this.f1304n.removeGlobalOnLayoutListener(this.f1300j);
            this.f1304n = null;
        }
        if (this.f1301k != null) {
            this.f1301k.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m2584c();
        return true;
    }
}
