package android.support.v7.p014a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.au;
import android.support.v4.p007g.ay;
import android.support.v4.p007g.az;
import android.support.v4.p007g.ba;
import android.support.v7.p014a.C0396a.C0394b;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.C0483a;
import android.support.v7.view.C0491g;
import android.support.v7.view.C0493h;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.C0463a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ac;
import android.support.v7.widget.ao;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.a.s */
public class C0464s extends C0396a implements C0463a {
    static final /* synthetic */ boolean f988s;
    private static final Interpolator f989t;
    private static final Interpolator f990u;
    private static final boolean f991v;
    private int f992A;
    private boolean f993B;
    private boolean f994C;
    private ArrayList<C0394b> f995D;
    private boolean f996E;
    private int f997F;
    private boolean f998G;
    private boolean f999H;
    private boolean f1000I;
    Context f1001a;
    ActionBarOverlayLayout f1002b;
    ActionBarContainer f1003c;
    ac f1004d;
    ActionBarContextView f1005e;
    View f1006f;
    ao f1007g;
    C0462a f1008h;
    C0461b f1009i;
    C0445a f1010j;
    boolean f1011k;
    boolean f1012l;
    boolean f1013m;
    C0493h f1014n;
    boolean f1015o;
    final ay f1016p;
    final ay f1017q;
    final ba f1018r;
    private Context f1019w;
    private Activity f1020x;
    private Dialog f1021y;
    private ArrayList<Object> f1022z;

    /* renamed from: android.support.v7.a.s.1 */
    class C04581 extends az {
        final /* synthetic */ C0464s f978a;

        C04581(C0464s c0464s) {
            this.f978a = c0464s;
        }

        public void m2158b(View view) {
            if (this.f978a.f1011k && this.f978a.f1006f != null) {
                ae.m1129a(this.f978a.f1006f, 0.0f);
                ae.m1129a(this.f978a.f1003c, 0.0f);
            }
            this.f978a.f1003c.setVisibility(8);
            this.f978a.f1003c.setTransitioning(false);
            this.f978a.f1014n = null;
            this.f978a.m2229i();
            if (this.f978a.f1002b != null) {
                ae.m1157m(this.f978a.f1002b);
            }
        }
    }

    /* renamed from: android.support.v7.a.s.2 */
    class C04592 extends az {
        final /* synthetic */ C0464s f979a;

        C04592(C0464s c0464s) {
            this.f979a = c0464s;
        }

        public void m2159b(View view) {
            this.f979a.f1014n = null;
            this.f979a.f1003c.requestLayout();
        }
    }

    /* renamed from: android.support.v7.a.s.3 */
    class C04603 implements ba {
        final /* synthetic */ C0464s f980a;

        C04603(C0464s c0464s) {
            this.f980a = c0464s;
        }

        public void m2160a(View view) {
            ((View) this.f980a.f1003c.getParent()).invalidate();
        }
    }

    /* renamed from: android.support.v7.a.s.a */
    public class C0462a extends C0461b implements C0425a {
        final /* synthetic */ C0464s f983a;
        private final Context f984b;
        private final C0515h f985c;
        private C0445a f986d;
        private WeakReference<View> f987e;

        public C0462a(C0464s c0464s, Context context, C0445a c0445a) {
            this.f983a = c0464s;
            this.f984b = context;
            this.f986d = c0445a;
            this.f985c = new C0515h(context).m2460a(1);
            this.f985c.m2468a((C0425a) this);
        }

        public MenuInflater m2178a() {
            return new C0491g(this.f984b);
        }

        public void m2179a(int i) {
            m2187b(this.f983a.f1001a.getResources().getString(i));
        }

        public void m2180a(C0515h c0515h) {
            if (this.f986d != null) {
                m2189d();
                this.f983a.f1005e.m2611a();
            }
        }

        public void m2181a(View view) {
            this.f983a.f1005e.setCustomView(view);
            this.f987e = new WeakReference(view);
        }

        public void m2182a(CharSequence charSequence) {
            this.f983a.f1005e.setSubtitle(charSequence);
        }

        public void m2183a(boolean z) {
            super.m2166a(z);
            this.f983a.f1005e.setTitleOptional(z);
        }

        public boolean m2184a(C0515h c0515h, MenuItem menuItem) {
            return this.f986d != null ? this.f986d.m2109a((C0461b) this, menuItem) : false;
        }

        public Menu m2185b() {
            return this.f985c;
        }

        public void m2186b(int i) {
            m2182a(this.f983a.f1001a.getResources().getString(i));
        }

        public void m2187b(CharSequence charSequence) {
            this.f983a.f1005e.setTitle(charSequence);
        }

        public void m2188c() {
            if (this.f983a.f1008h == this) {
                if (C0464s.m2202a(this.f983a.f1012l, this.f983a.f1013m, false)) {
                    this.f986d.m2107a(this);
                } else {
                    this.f983a.f1009i = this;
                    this.f983a.f1010j = this.f986d;
                }
                this.f986d = null;
                this.f983a.m2232j(false);
                this.f983a.f1005e.m2612b();
                this.f983a.f1004d.m2807a().sendAccessibilityEvent(32);
                this.f983a.f1002b.setHideOnContentScrollEnabled(this.f983a.f1015o);
                this.f983a.f1008h = null;
            }
        }

        public void m2189d() {
            if (this.f983a.f1008h == this) {
                this.f985c.m2494g();
                try {
                    this.f986d.m2110b(this, this.f985c);
                } finally {
                    this.f985c.m2495h();
                }
            }
        }

        public boolean m2190e() {
            this.f985c.m2494g();
            try {
                boolean a = this.f986d.m2108a((C0461b) this, this.f985c);
                return a;
            } finally {
                this.f985c.m2495h();
            }
        }

        public CharSequence m2191f() {
            return this.f983a.f1005e.getTitle();
        }

        public CharSequence m2192g() {
            return this.f983a.f1005e.getSubtitle();
        }

        public boolean m2193h() {
            return this.f983a.f1005e.m2614d();
        }

        public View m2194i() {
            return this.f987e != null ? (View) this.f987e.get() : null;
        }
    }

    static {
        boolean z = true;
        f988s = !C0464s.class.desiredAssertionStatus();
        f989t = new AccelerateInterpolator();
        f990u = new DecelerateInterpolator();
        if (VERSION.SDK_INT < 14) {
            z = false;
        }
        f991v = z;
    }

    public C0464s(Activity activity, boolean z) {
        this.f1022z = new ArrayList();
        this.f992A = -1;
        this.f995D = new ArrayList();
        this.f997F = 0;
        this.f1011k = true;
        this.f999H = true;
        this.f1016p = new C04581(this);
        this.f1017q = new C04592(this);
        this.f1018r = new C04603(this);
        this.f1020x = activity;
        View decorView = activity.getWindow().getDecorView();
        m2201a(decorView);
        if (!z) {
            this.f1006f = decorView.findViewById(16908290);
        }
    }

    public C0464s(Dialog dialog) {
        this.f1022z = new ArrayList();
        this.f992A = -1;
        this.f995D = new ArrayList();
        this.f997F = 0;
        this.f1011k = true;
        this.f999H = true;
        this.f1016p = new C04581(this);
        this.f1017q = new C04592(this);
        this.f1018r = new C04603(this);
        this.f1021y = dialog;
        m2201a(dialog.getWindow().getDecorView());
    }

    private void m2201a(View view) {
        this.f1002b = (ActionBarOverlayLayout) view.findViewById(C0470f.decor_content_parent);
        if (this.f1002b != null) {
            this.f1002b.setActionBarVisibilityCallback(this);
        }
        this.f1004d = m2203b(view.findViewById(C0470f.action_bar));
        this.f1005e = (ActionBarContextView) view.findViewById(C0470f.action_context_bar);
        this.f1003c = (ActionBarContainer) view.findViewById(C0470f.action_bar_container);
        if (this.f1004d == null || this.f1005e == null || this.f1003c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f1001a = this.f1004d.m2816b();
        boolean z = (this.f1004d.m2833o() & 4) != 0;
        if (z) {
            this.f993B = true;
        }
        C0483a a = C0483a.m2256a(this.f1001a);
        z = a.m2262f() || z;
        m2216a(z);
        m2204k(a.m2260d());
        TypedArray obtainStyledAttributes = this.f1001a.obtainStyledAttributes(null, C0474j.ActionBar, C0465a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0474j.ActionBar_hideOnContentScroll, false)) {
            m2217b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0474j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m2211a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    static boolean m2202a(boolean z, boolean z2, boolean z3) {
        return z3 ? true : (z || z2) ? false : true;
    }

    private ac m2203b(View view) {
        if (view instanceof ac) {
            return (ac) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    private void m2204k(boolean z) {
        boolean z2 = true;
        this.f996E = z;
        if (this.f996E) {
            this.f1003c.setTabContainer(null);
            this.f1004d.m2811a(this.f1007g);
        } else {
            this.f1004d.m2811a(null);
            this.f1003c.setTabContainer(this.f1007g);
        }
        boolean z3 = m2231j() == 2;
        if (this.f1007g != null) {
            if (z3) {
                this.f1007g.setVisibility(0);
                if (this.f1002b != null) {
                    ae.m1157m(this.f1002b);
                }
            } else {
                this.f1007g.setVisibility(8);
            }
        }
        ac acVar = this.f1004d;
        boolean z4 = !this.f996E && z3;
        acVar.m2815a(z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1002b;
        if (this.f996E || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    private void m2205l(boolean z) {
        if (C0464s.m2202a(this.f1012l, this.f1013m, this.f998G)) {
            if (!this.f999H) {
                this.f999H = true;
                m2228h(z);
            }
        } else if (this.f999H) {
            this.f999H = false;
            m2230i(z);
        }
    }

    private void m2206p() {
        if (!this.f998G) {
            this.f998G = true;
            if (this.f1002b != null) {
                this.f1002b.setShowingForActionMode(true);
            }
            m2205l(false);
        }
    }

    private void m2207q() {
        if (this.f998G) {
            this.f998G = false;
            if (this.f1002b != null) {
                this.f1002b.setShowingForActionMode(false);
            }
            m2205l(false);
        }
    }

    private boolean m2208r() {
        return ae.m1164t(this.f1003c);
    }

    public int m2209a() {
        return this.f1004d.m2833o();
    }

    public C0461b m2210a(C0445a c0445a) {
        if (this.f1008h != null) {
            this.f1008h.m2188c();
        }
        this.f1002b.setHideOnContentScrollEnabled(false);
        this.f1005e.m2613c();
        C0461b c0462a = new C0462a(this, this.f1005e.getContext(), c0445a);
        if (!c0462a.m2190e()) {
            return null;
        }
        this.f1008h = c0462a;
        c0462a.m2189d();
        this.f1005e.m2610a(c0462a);
        m2232j(true);
        this.f1005e.sendAccessibilityEvent(32);
        return c0462a;
    }

    public void m2211a(float f) {
        ae.m1145c(this.f1003c, f);
    }

    public void m2212a(int i) {
        this.f997F = i;
    }

    public void m2213a(int i, int i2) {
        int o = this.f1004d.m2833o();
        if ((i2 & 4) != 0) {
            this.f993B = true;
        }
        this.f1004d.m2819c((o & (i2 ^ -1)) | (i & i2));
    }

    public void m2214a(Configuration configuration) {
        m2204k(C0483a.m2256a(this.f1001a).m2260d());
    }

    public void m2215a(CharSequence charSequence) {
        this.f1004d.m2814a(charSequence);
    }

    public void m2216a(boolean z) {
        this.f1004d.m2818b(z);
    }

    public void m2217b(boolean z) {
        if (!z || this.f1002b.m2637a()) {
            this.f1015o = z;
            this.f1002b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public boolean m2218b() {
        int k = m2233k();
        return this.f999H && (k == 0 || m2221d() < k);
    }

    public Context m2219c() {
        if (this.f1019w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1001a.getTheme().resolveAttribute(C0465a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1019w = new ContextThemeWrapper(this.f1001a, i);
            } else {
                this.f1019w = this.f1001a;
            }
        }
        return this.f1019w;
    }

    public void m2220c(boolean z) {
        if (!this.f993B) {
            m2224f(z);
        }
    }

    public int m2221d() {
        return this.f1002b.getActionBarHideOffset();
    }

    public void m2222d(boolean z) {
        this.f1000I = z;
        if (!z && this.f1014n != null) {
            this.f1014n.m2313c();
        }
    }

    public void m2223e(boolean z) {
        if (z != this.f994C) {
            this.f994C = z;
            int size = this.f995D.size();
            for (int i = 0; i < size; i++) {
                ((C0394b) this.f995D.get(i)).m1880a(z);
            }
        }
    }

    public void m2224f(boolean z) {
        m2213a(z ? 4 : 0, 4);
    }

    public boolean m2225f() {
        if (this.f1004d == null || !this.f1004d.m2820c()) {
            return false;
        }
        this.f1004d.m2821d();
        return true;
    }

    public void m2226g(boolean z) {
        this.f1011k = z;
    }

    public boolean m2227g() {
        ViewGroup a = this.f1004d.m2807a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    public void m2228h(boolean z) {
        if (this.f1014n != null) {
            this.f1014n.m2313c();
        }
        this.f1003c.setVisibility(0);
        if (this.f997F == 0 && f991v && (this.f1000I || z)) {
            ae.m1129a(this.f1003c, 0.0f);
            float f = (float) (-this.f1003c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f1003c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            ae.m1129a(this.f1003c, f);
            C0493h c0493h = new C0493h();
            au b = ae.m1154j(this.f1003c).m1316b(0.0f);
            b.m1314a(this.f1018r);
            c0493h.m2307a(b);
            if (this.f1011k && this.f1006f != null) {
                ae.m1129a(this.f1006f, f);
                c0493h.m2307a(ae.m1154j(this.f1006f).m1316b(0.0f));
            }
            c0493h.m2310a(f990u);
            c0493h.m2306a(250);
            c0493h.m2309a(this.f1017q);
            this.f1014n = c0493h;
            c0493h.m2311a();
        } else {
            ae.m1141b(this.f1003c, 1.0f);
            ae.m1129a(this.f1003c, 0.0f);
            if (this.f1011k && this.f1006f != null) {
                ae.m1129a(this.f1006f, 0.0f);
            }
            this.f1017q.m1294b(null);
        }
        if (this.f1002b != null) {
            ae.m1157m(this.f1002b);
        }
    }

    void m2229i() {
        if (this.f1010j != null) {
            this.f1010j.m2107a(this.f1009i);
            this.f1009i = null;
            this.f1010j = null;
        }
    }

    public void m2230i(boolean z) {
        if (this.f1014n != null) {
            this.f1014n.m2313c();
        }
        if (this.f997F == 0 && f991v && (this.f1000I || z)) {
            ae.m1141b(this.f1003c, 1.0f);
            this.f1003c.setTransitioning(true);
            C0493h c0493h = new C0493h();
            float f = (float) (-this.f1003c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f1003c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            au b = ae.m1154j(this.f1003c).m1316b(f);
            b.m1314a(this.f1018r);
            c0493h.m2307a(b);
            if (this.f1011k && this.f1006f != null) {
                c0493h.m2307a(ae.m1154j(this.f1006f).m1316b(f));
            }
            c0493h.m2310a(f989t);
            c0493h.m2306a(250);
            c0493h.m2309a(this.f1016p);
            this.f1014n = c0493h;
            c0493h.m2311a();
            return;
        }
        this.f1016p.m1294b(null);
    }

    public int m2231j() {
        return this.f1004d.m2834p();
    }

    public void m2232j(boolean z) {
        if (z) {
            m2206p();
        } else {
            m2207q();
        }
        if (m2208r()) {
            au a;
            au a2;
            if (z) {
                a = this.f1004d.m2806a(4, 100);
                a2 = this.f1005e.m2609a(0, 200);
            } else {
                a2 = this.f1004d.m2806a(0, 200);
                a = this.f1005e.m2609a(8, 100);
            }
            C0493h c0493h = new C0493h();
            c0493h.m2308a(a, a2);
            c0493h.m2311a();
        } else if (z) {
            this.f1004d.m2822d(4);
            this.f1005e.setVisibility(0);
        } else {
            this.f1004d.m2822d(0);
            this.f1005e.setVisibility(8);
        }
    }

    public int m2233k() {
        return this.f1003c.getHeight();
    }

    public void m2234l() {
        if (this.f1013m) {
            this.f1013m = false;
            m2205l(true);
        }
    }

    public void m2235m() {
        if (!this.f1013m) {
            this.f1013m = true;
            m2205l(true);
        }
    }

    public void m2236n() {
        if (this.f1014n != null) {
            this.f1014n.m2313c();
            this.f1014n = null;
        }
    }

    public void m2237o() {
    }
}
