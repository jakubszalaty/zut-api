package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0286e.C0284a;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p021f.C0482a;
import android.support.v7.view.C0483a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.C0495b;
import android.support.v7.view.menu.C0499p;
import android.support.v7.view.menu.C0499p.C0496a;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0502b;
import android.support.v7.view.menu.C0509s;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0518j;
import android.support.v7.view.menu.C0527n;
import android.support.v7.view.menu.C0532u;
import android.support.v7.widget.ActionMenuView.C0497a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.d */
class C0593d extends C0502b implements C0284a {
    private C0586b f1728A;
    C0590d f1729g;
    C0591e f1730h;
    C0585a f1731i;
    C0587c f1732j;
    final C0592f f1733k;
    int f1734l;
    private Drawable f1735m;
    private boolean f1736n;
    private boolean f1737o;
    private boolean f1738p;
    private int f1739q;
    private int f1740r;
    private int f1741s;
    private boolean f1742t;
    private boolean f1743u;
    private boolean f1744v;
    private boolean f1745w;
    private int f1746x;
    private final SparseBooleanArray f1747y;
    private View f1748z;

    /* renamed from: android.support.v7.widget.d.a */
    private class C0585a extends C0527n {
        final /* synthetic */ C0593d f1716a;

        public C0585a(C0593d c0593d, Context context, C0532u c0532u, View view) {
            this.f1716a = c0593d;
            super(context, c0532u, view, false, C0465a.actionOverflowMenuStyle);
            if (!((C0518j) c0532u.getItem()).m2533j()) {
                m2559a(c0593d.f1729g == null ? (View) c0593d.f : c0593d.f1729g);
            }
            m2558a(c0593d.f1733k);
        }

        protected void m3018e() {
            this.f1716a.f1731i = null;
            this.f1716a.f1734l = 0;
            super.m2566e();
        }
    }

    /* renamed from: android.support.v7.widget.d.b */
    private class C0586b extends C0495b {
        final /* synthetic */ C0593d f1717a;

        C0586b(C0593d c0593d) {
            this.f1717a = c0593d;
        }

        public C0509s m3019a() {
            return this.f1717a.f1731i != null ? this.f1717a.f1731i.m2563b() : null;
        }
    }

    /* renamed from: android.support.v7.widget.d.c */
    private class C0587c implements Runnable {
        final /* synthetic */ C0593d f1718a;
        private C0591e f1719b;

        public C0587c(C0593d c0593d, C0591e c0591e) {
            this.f1718a = c0593d;
            this.f1719b = c0591e;
        }

        public void run() {
            if (this.f1718a.c != null) {
                this.f1718a.c.m2493f();
            }
            View view = (View) this.f1718a.f;
            if (!(view == null || view.getWindowToken() == null || !this.f1719b.m2564c())) {
                this.f1718a.f1730h = this.f1719b;
            }
            this.f1718a.f1732j = null;
        }
    }

    /* renamed from: android.support.v7.widget.d.d */
    private class C0590d extends C0589p implements C0497a {
        final /* synthetic */ C0593d f1724a;
        private final float[] f1725b;

        /* renamed from: android.support.v7.widget.d.d.1 */
        class C05881 extends ag {
            final /* synthetic */ C0593d f1720a;
            final /* synthetic */ C0590d f1721b;

            C05881(C0590d c0590d, View view, C0593d c0593d) {
                this.f1721b = c0590d;
                this.f1720a = c0593d;
                super(view);
            }

            public C0509s m3020a() {
                return this.f1721b.f1724a.f1730h == null ? null : this.f1721b.f1724a.f1730h.m2563b();
            }

            public boolean m3021b() {
                this.f1721b.f1724a.m3052d();
                return true;
            }

            public boolean m3022c() {
                if (this.f1721b.f1724a.f1732j != null) {
                    return false;
                }
                this.f1721b.f1724a.m3053e();
                return true;
            }
        }

        public C0590d(C0593d c0593d, Context context) {
            this.f1724a = c0593d;
            super(context, null, C0465a.actionOverflowButtonStyle);
            this.f1725b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new C05881(this, this, c0593d));
        }

        public boolean m3023c() {
            return false;
        }

        public boolean m3024d() {
            return false;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                this.f1724a.m3052d();
            }
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0129a.m538a(background, width - max, height - max, width + max, height + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.d.e */
    private class C0591e extends C0527n {
        final /* synthetic */ C0593d f1726a;

        public C0591e(C0593d c0593d, Context context, C0515h c0515h, View view, boolean z) {
            this.f1726a = c0593d;
            super(context, c0515h, view, z, C0465a.actionOverflowMenuStyle);
            m2557a(8388613);
            m2558a(c0593d.f1733k);
        }

        protected void m3025e() {
            if (this.f1726a.c != null) {
                this.f1726a.c.close();
            }
            this.f1726a.f1730h = null;
            super.m2566e();
        }
    }

    /* renamed from: android.support.v7.widget.d.f */
    private class C0592f implements C0442a {
        final /* synthetic */ C0593d f1727a;

        C0592f(C0593d c0593d) {
            this.f1727a = c0593d;
        }

        public void m3026a(C0515h c0515h, boolean z) {
            if (c0515h instanceof C0532u) {
                c0515h.m2503p().m2474a(false);
            }
            C0442a a = this.f1727a.m2362a();
            if (a != null) {
                a.m2102a(c0515h, z);
            }
        }

        public boolean m3027a(C0515h c0515h) {
            if (c0515h == null) {
                return false;
            }
            this.f1727a.f1734l = ((C0532u) c0515h).getItem().getItemId();
            C0442a a = this.f1727a.m2362a();
            return a != null ? a.m2103a(c0515h) : false;
        }
    }

    public C0593d(Context context) {
        super(context, C0471g.abc_action_menu_layout, C0471g.abc_action_menu_item_layout);
        this.f1747y = new SparseBooleanArray();
        this.f1733k = new C0592f(this);
    }

    private View m3029a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0496a) && ((C0496a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public C0499p m3035a(ViewGroup viewGroup) {
        C0499p c0499p = this.f;
        C0499p a = super.m2363a(viewGroup);
        if (c0499p != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public View m3036a(C0518j c0518j, View view, ViewGroup viewGroup) {
        View actionView = c0518j.getActionView();
        if (actionView == null || c0518j.m2537n()) {
            actionView = super.m2364a(c0518j, view, viewGroup);
        }
        actionView.setVisibility(c0518j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m2677a(layoutParams));
        }
        return actionView;
    }

    public void m3037a(Context context, C0515h c0515h) {
        super.m2366a(context, c0515h);
        Resources resources = context.getResources();
        C0483a a = C0483a.m2256a(context);
        if (!this.f1738p) {
            this.f1737o = a.m2258b();
        }
        if (!this.f1744v) {
            this.f1739q = a.m2259c();
        }
        if (!this.f1742t) {
            this.f1741s = a.m2257a();
        }
        int i = this.f1739q;
        if (this.f1737o) {
            if (this.f1729g == null) {
                this.f1729g = new C0590d(this, this.a);
                if (this.f1736n) {
                    this.f1729g.setImageDrawable(this.f1735m);
                    this.f1735m = null;
                    this.f1736n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f1729g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1729g.getMeasuredWidth();
        } else {
            this.f1729g = null;
        }
        this.f1740r = i;
        this.f1746x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f1748z = null;
    }

    public void m3038a(Configuration configuration) {
        if (!this.f1742t) {
            this.f1741s = C0483a.m2256a(this.b).m2257a();
        }
        if (this.c != null) {
            this.c.m2482b(true);
        }
    }

    public void m3039a(Drawable drawable) {
        if (this.f1729g != null) {
            this.f1729g.setImageDrawable(drawable);
            return;
        }
        this.f1736n = true;
        this.f1735m = drawable;
    }

    public void m3040a(C0515h c0515h, boolean z) {
        m3054f();
        super.m2367a(c0515h, z);
    }

    public void m3041a(C0518j c0518j, C0496a c0496a) {
        c0496a.m2327a(c0518j, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0496a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.f1728A == null) {
            this.f1728A = new C0586b(this);
        }
        actionMenuItemView.setPopupCallback(this.f1728A);
    }

    public void m3042a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.m2678a(this.c);
    }

    public void m3043a(boolean z) {
        if (z) {
            super.m2373a(null);
        } else if (this.c != null) {
            this.c.m2474a(false);
        }
    }

    public boolean m3044a(int i, C0518j c0518j) {
        return c0518j.m2533j();
    }

    public boolean m3045a(C0532u c0532u) {
        if (!c0532u.hasVisibleItems()) {
            return false;
        }
        C0532u c0532u2 = c0532u;
        while (c0532u2.m2597s() != this.c) {
            c0532u2 = (C0532u) c0532u2.m2597s();
        }
        View a = m3029a(c0532u2.getItem());
        if (a == null) {
            return false;
        }
        boolean z;
        this.f1734l = c0532u.getItem().getItemId();
        int size = c0532u.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0532u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.f1731i = new C0585a(this, this.b, c0532u, a);
        this.f1731i.m2561a(z);
        this.f1731i.m2556a();
        super.m2373a(c0532u);
        return true;
    }

    public boolean m3046a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.f1729g ? false : super.m2374a(viewGroup, i);
    }

    public void m3047b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f).getParent();
        if (viewGroup != null) {
            C0482a.m2255a(viewGroup);
        }
        super.m2376b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList k = this.c.m2498k();
            int size = k.size();
            for (i = 0; i < size; i++) {
                C0286e a = ((C0518j) k.get(i)).m2515a();
                if (a != null) {
                    a.m1454a((C0284a) this);
                }
            }
        }
        ArrayList l = this.c != null ? this.c.m2499l() : null;
        if (this.f1737o && l != null) {
            i = l.size();
            if (i == 1) {
                i3 = !((C0518j) l.get(0)).isActionViewExpanded() ? 1 : 0;
            } else {
                if (i <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        if (i3 != 0) {
            if (this.f1729g == null) {
                this.f1729g = new C0590d(this, this.a);
            }
            viewGroup = (ViewGroup) this.f1729g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1729g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.f1729g, actionMenuView.m2686c());
            }
        } else if (this.f1729g != null && this.f1729g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.f1729g);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.f1737o);
    }

    public boolean m3048b() {
        int size;
        ArrayList arrayList;
        int i;
        if (this.c != null) {
            ArrayList i2 = this.c.m2496i();
            size = i2.size();
            arrayList = i2;
        } else {
            size = 0;
            arrayList = null;
        }
        int i3 = this.f1741s;
        int i4 = this.f1740r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i5 = 0;
        int i6 = 0;
        Object obj = null;
        int i7 = 0;
        while (i7 < size) {
            C0518j c0518j = (C0518j) arrayList.get(i7);
            if (c0518j.m2535l()) {
                i5++;
            } else if (c0518j.m2534k()) {
                i6++;
            } else {
                obj = 1;
            }
            i = (this.f1745w && c0518j.isActionViewExpanded()) ? 0 : i3;
            i7++;
            i3 = i;
        }
        if (this.f1737o && (r4 != null || i5 + i6 > i3)) {
            i3--;
        }
        i7 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = this.f1747y;
        sparseBooleanArray.clear();
        i = 0;
        if (this.f1743u) {
            i = i4 / this.f1746x;
            i6 = ((i4 % this.f1746x) / i) + this.f1746x;
        } else {
            i6 = 0;
        }
        int i8 = 0;
        i3 = 0;
        int i9 = i;
        while (i8 < size) {
            c0518j = (C0518j) arrayList.get(i8);
            int i10;
            if (c0518j.m2535l()) {
                View a = m3036a(c0518j, this.f1748z, viewGroup);
                if (this.f1748z == null) {
                    this.f1748z = a;
                }
                if (this.f1743u) {
                    i9 -= ActionMenuView.m2674a(a, i6, i9, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i5 = a.getMeasuredWidth();
                i10 = i4 - i5;
                if (i3 != 0) {
                    i5 = i3;
                }
                i3 = c0518j.getGroupId();
                if (i3 != 0) {
                    sparseBooleanArray.put(i3, true);
                }
                c0518j.m2526d(true);
                i = i10;
                i3 = i7;
            } else if (c0518j.m2534k()) {
                boolean z;
                int groupId = c0518j.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i7 > 0 || z2) && i4 > 0 && (!this.f1743u || i9 > 0);
                if (z3) {
                    View a2 = m3036a(c0518j, this.f1748z, viewGroup);
                    if (this.f1748z == null) {
                        this.f1748z = a2;
                    }
                    boolean z4;
                    if (this.f1743u) {
                        int a3 = ActionMenuView.m2674a(a2, i6, i9, makeMeasureSpec, 0);
                        i10 = i9 - a3;
                        if (a3 == 0) {
                            i9 = 0;
                        } else {
                            z4 = z3;
                        }
                        i5 = i10;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i5 = i9;
                        z4 = z5;
                    }
                    i10 = a2.getMeasuredWidth();
                    i4 -= i10;
                    if (i3 == 0) {
                        i3 = i10;
                    }
                    if (this.f1743u) {
                        z = i9 & (i4 >= 0 ? 1 : 0);
                        i10 = i3;
                        i3 = i5;
                    } else {
                        z = i9 & (i4 + i3 > 0 ? 1 : 0);
                        i10 = i3;
                        i3 = i5;
                    }
                } else {
                    z = z3;
                    i10 = i3;
                    i3 = i9;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i9 = i7;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i5 = i7;
                    for (i7 = 0; i7 < i8; i7++) {
                        C0518j c0518j2 = (C0518j) arrayList.get(i7);
                        if (c0518j2.getGroupId() == groupId) {
                            if (c0518j2.m2533j()) {
                                i5++;
                            }
                            c0518j2.m2526d(false);
                        }
                    }
                    i9 = i5;
                } else {
                    i9 = i7;
                }
                if (z) {
                    i9--;
                }
                c0518j.m2526d(z);
                i5 = i10;
                i = i4;
                int i11 = i3;
                i3 = i9;
                i9 = i11;
            } else {
                c0518j.m2526d(false);
                i5 = i3;
                i = i4;
                i3 = i7;
            }
            i8++;
            i4 = i;
            i7 = i3;
            i3 = i5;
        }
        return true;
    }

    public Drawable m3049c() {
        return this.f1729g != null ? this.f1729g.getDrawable() : this.f1736n ? this.f1735m : null;
    }

    public void m3050c(boolean z) {
        this.f1737o = z;
        this.f1738p = true;
    }

    public void m3051d(boolean z) {
        this.f1745w = z;
    }

    public boolean m3052d() {
        if (!this.f1737o || m3056h() || this.c == null || this.f == null || this.f1732j != null || this.c.m2499l().isEmpty()) {
            return false;
        }
        this.f1732j = new C0587c(this, new C0591e(this, this.b, this.c, this.f1729g, true));
        ((View) this.f).post(this.f1732j);
        super.m2373a(null);
        return true;
    }

    public boolean m3053e() {
        if (this.f1732j == null || this.f == null) {
            C0527n c0527n = this.f1730h;
            if (c0527n == null) {
                return false;
            }
            c0527n.m2565d();
            return true;
        }
        ((View) this.f).removeCallbacks(this.f1732j);
        this.f1732j = null;
        return true;
    }

    public boolean m3054f() {
        return m3053e() | m3055g();
    }

    public boolean m3055g() {
        if (this.f1731i == null) {
            return false;
        }
        this.f1731i.m2565d();
        return true;
    }

    public boolean m3056h() {
        return this.f1730h != null && this.f1730h.m2567f();
    }

    public boolean m3057i() {
        return this.f1732j != null || m3056h();
    }
}
