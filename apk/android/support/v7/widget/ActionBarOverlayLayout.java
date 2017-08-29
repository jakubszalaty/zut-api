package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p007g.C0328x;
import android.support.v4.p007g.C0329y;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.au;
import android.support.v4.p007g.ay;
import android.support.v4.p007g.az;
import android.support.v4.widget.C0387v;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0501o.C0442a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout extends ViewGroup implements C0328x, ab {
    static final int[] f1346e;
    private final Runnable f1347A;
    private final C0329y f1348B;
    ActionBarContainer f1349a;
    boolean f1350b;
    au f1351c;
    final ay f1352d;
    private int f1353f;
    private int f1354g;
    private ContentFrameLayout f1355h;
    private ac f1356i;
    private Drawable f1357j;
    private boolean f1358k;
    private boolean f1359l;
    private boolean f1360m;
    private boolean f1361n;
    private int f1362o;
    private int f1363p;
    private final Rect f1364q;
    private final Rect f1365r;
    private final Rect f1366s;
    private final Rect f1367t;
    private final Rect f1368u;
    private final Rect f1369v;
    private C0463a f1370w;
    private final int f1371x;
    private C0387v f1372y;
    private final Runnable f1373z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout.a */
    public interface C0463a {
        void m2195a(int i);

        void m2196g(boolean z);

        void m2197l();

        void m2198m();

        void m2199n();

        void m2200o();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout.1 */
    class C05361 extends az {
        final /* synthetic */ ActionBarOverlayLayout f1343a;

        C05361(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1343a = actionBarOverlayLayout;
        }

        public void m2615b(View view) {
            this.f1343a.f1351c = null;
            this.f1343a.f1350b = false;
        }

        public void m2616c(View view) {
            this.f1343a.f1351c = null;
            this.f1343a.f1350b = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout.2 */
    class C05372 implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout f1344a;

        C05372(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1344a = actionBarOverlayLayout;
        }

        public void run() {
            this.f1344a.m2640d();
            this.f1344a.f1351c = ae.m1154j(this.f1344a.f1349a).m1316b(0.0f).m1313a(this.f1344a.f1352d);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout.3 */
    class C05383 implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout f1345a;

        C05383(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1345a = actionBarOverlayLayout;
        }

        public void run() {
            this.f1345a.m2640d();
            this.f1345a.f1351c = ae.m1154j(this.f1345a.f1349a).m1316b((float) (-this.f1345a.f1349a.getHeight())).m1313a(this.f1345a.f1352d);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout.b */
    public static class C0539b extends MarginLayoutParams {
        public C0539b(int i, int i2) {
            super(i, i2);
        }

        public C0539b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0539b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static {
        f1346e = new int[]{C0465a.actionBarSize, 16842841};
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1354g = 0;
        this.f1364q = new Rect();
        this.f1365r = new Rect();
        this.f1366s = new Rect();
        this.f1367t = new Rect();
        this.f1368u = new Rect();
        this.f1369v = new Rect();
        this.f1371x = 600;
        this.f1352d = new C05361(this);
        this.f1373z = new C05372(this);
        this.f1347A = new C05383(this);
        m2627a(context);
        this.f1348B = new C0329y(this);
    }

    private ac m2626a(View view) {
        if (view instanceof ac) {
            return (ac) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void m2627a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1346e);
        this.f1353f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1357j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1357j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.f1358k = z;
        this.f1372y = C0387v.m1822a(context);
    }

    private boolean m2628a(float f, float f2) {
        this.f1372y.m1826a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1372y.m1833e() > this.f1349a.getHeight();
    }

    private boolean m2629a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C0539b c0539b = (C0539b) view.getLayoutParams();
        if (z && c0539b.leftMargin != rect.left) {
            c0539b.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && c0539b.topMargin != rect.top) {
            c0539b.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && c0539b.rightMargin != rect.right) {
            c0539b.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || c0539b.bottomMargin == rect.bottom) {
            return z5;
        }
        c0539b.bottomMargin = rect.bottom;
        return true;
    }

    private void m2630l() {
        m2640d();
        postDelayed(this.f1373z, 600);
    }

    private void m2631m() {
        m2640d();
        postDelayed(this.f1347A, 600);
    }

    private void m2632n() {
        m2640d();
        this.f1373z.run();
    }

    private void m2633o() {
        m2640d();
        this.f1347A.run();
    }

    public C0539b m2634a(AttributeSet attributeSet) {
        return new C0539b(getContext(), attributeSet);
    }

    public void m2635a(int i) {
        m2639c();
        switch (i) {
            case C0474j.View_paddingStart /*2*/:
                this.f1356i.m2824f();
            case C0474j.Toolbar_contentInsetStart /*5*/:
                this.f1356i.m2825g();
            case C0474j.AppCompatTheme_ratingBarStyleIndicator /*109*/:
                setOverlayMode(true);
            default:
        }
    }

    public void m2636a(Menu menu, C0442a c0442a) {
        m2639c();
        this.f1356i.m2812a(menu, c0442a);
    }

    public boolean m2637a() {
        return this.f1359l;
    }

    protected C0539b m2638b() {
        return new C0539b(-1, -1);
    }

    void m2639c() {
        if (this.f1355h == null) {
            this.f1355h = (ContentFrameLayout) findViewById(C0470f.action_bar_activity_content);
            this.f1349a = (ActionBarContainer) findViewById(C0470f.action_bar_container);
            this.f1356i = m2626a(findViewById(C0470f.action_bar));
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0539b;
    }

    void m2640d() {
        removeCallbacks(this.f1373z);
        removeCallbacks(this.f1347A);
        if (this.f1351c != null) {
            this.f1351c.m1318b();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1357j != null && !this.f1358k) {
            int bottom = this.f1349a.getVisibility() == 0 ? (int) ((((float) this.f1349a.getBottom()) + ae.m1152h(this.f1349a)) + 0.5f) : 0;
            this.f1357j.setBounds(0, bottom, getWidth(), this.f1357j.getIntrinsicHeight() + bottom);
            this.f1357j.draw(canvas);
        }
    }

    public boolean m2641e() {
        m2639c();
        return this.f1356i.m2826h();
    }

    public boolean m2642f() {
        m2639c();
        return this.f1356i.m2827i();
    }

    protected boolean fitSystemWindows(Rect rect) {
        boolean a;
        m2639c();
        if ((ae.m1156l(this) & 256) != 0) {
            a = m2629a(this.f1349a, rect, true, true, false, true);
            this.f1367t.set(rect);
            ay.m3015a(this, this.f1367t, this.f1364q);
        } else {
            a = m2629a(this.f1349a, rect, true, true, false, true);
            this.f1367t.set(rect);
            ay.m3015a(this, this.f1367t, this.f1364q);
        }
        if (!this.f1365r.equals(this.f1364q)) {
            this.f1365r.set(this.f1364q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public boolean m2643g() {
        m2639c();
        return this.f1356i.m2828j();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2638b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2634a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0539b(layoutParams);
    }

    public int getActionBarHideOffset() {
        return this.f1349a != null ? -((int) ae.m1152h(this.f1349a)) : 0;
    }

    public int getNestedScrollAxes() {
        return this.f1348B.m1547a();
    }

    public CharSequence getTitle() {
        m2639c();
        return this.f1356i.m2823e();
    }

    public boolean m2644h() {
        m2639c();
        return this.f1356i.m2829k();
    }

    public boolean m2645i() {
        m2639c();
        return this.f1356i.m2830l();
    }

    public void m2646j() {
        m2639c();
        this.f1356i.m2831m();
    }

    public void m2647k() {
        m2639c();
        this.f1356i.m2832n();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2627a(getContext());
        ae.m1157m(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2640d();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        paddingRight = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0539b c0539b = (C0539b) childAt.getLayoutParams();
                int i6 = c0539b.leftMargin + paddingLeft;
                paddingRight = c0539b.topMargin + paddingTop;
                childAt.layout(i6, paddingRight, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + paddingRight);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m2639c();
        measureChildWithMargins(this.f1349a, i, 0, i2, 0);
        C0539b c0539b = (C0539b) this.f1349a.getLayoutParams();
        int max = Math.max(0, (this.f1349a.getMeasuredWidth() + c0539b.leftMargin) + c0539b.rightMargin);
        int max2 = Math.max(0, c0539b.bottomMargin + (this.f1349a.getMeasuredHeight() + c0539b.topMargin));
        int a = ay.m3014a(0, ae.m1151g(this.f1349a));
        Object obj = (ae.m1156l(this) & 256) != 0 ? 1 : null;
        if (obj != null) {
            i3 = this.f1353f;
            if (this.f1360m && this.f1349a.getTabContainer() != null) {
                i3 += this.f1353f;
            }
        } else {
            i3 = this.f1349a.getVisibility() != 8 ? this.f1349a.getMeasuredHeight() : 0;
        }
        this.f1366s.set(this.f1364q);
        this.f1368u.set(this.f1367t);
        Rect rect;
        Rect rect2;
        if (this.f1359l || obj != null) {
            rect = this.f1368u;
            rect.top = i3 + rect.top;
            rect2 = this.f1368u;
            rect2.bottom += 0;
        } else {
            rect = this.f1366s;
            rect.top = i3 + rect.top;
            rect2 = this.f1366s;
            rect2.bottom += 0;
        }
        m2629a(this.f1355h, this.f1366s, true, true, true, true);
        if (!this.f1369v.equals(this.f1368u)) {
            this.f1369v.set(this.f1368u);
            this.f1355h.m2116a(this.f1368u);
        }
        measureChildWithMargins(this.f1355h, i, 0, i2, 0);
        c0539b = (C0539b) this.f1355h.getLayoutParams();
        int max3 = Math.max(max, (this.f1355h.getMeasuredWidth() + c0539b.leftMargin) + c0539b.rightMargin);
        i3 = Math.max(max2, c0539b.bottomMargin + (this.f1355h.getMeasuredHeight() + c0539b.topMargin));
        int a2 = ay.m3014a(a, ae.m1151g(this.f1355h));
        setMeasuredDimension(ae.m1126a(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, a2), ae.m1126a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, a2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1361n || !z) {
            return false;
        }
        if (m2628a(f, f2)) {
            m2633o();
        } else {
            m2632n();
        }
        this.f1350b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1362o += i2;
        setActionBarHideOffset(this.f1362o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1348B.m1549a(view, view2, i);
        this.f1362o = getActionBarHideOffset();
        m2640d();
        if (this.f1370w != null) {
            this.f1370w.m2199n();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return ((i & 2) == 0 || this.f1349a.getVisibility() != 0) ? false : this.f1361n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1361n && !this.f1350b) {
            if (this.f1362o <= this.f1349a.getHeight()) {
                m2630l();
            } else {
                m2631m();
            }
        }
        if (this.f1370w != null) {
            this.f1370w.m2200o();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m2639c();
        int i2 = this.f1363p ^ i;
        this.f1363p = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        if (this.f1370w != null) {
            C0463a c0463a = this.f1370w;
            if (z3) {
                z = false;
            }
            c0463a.m2196g(z);
            if (z2 || !z3) {
                this.f1370w.m2197l();
            } else {
                this.f1370w.m2198m();
            }
        }
        if ((i2 & 256) != 0 && this.f1370w != null) {
            ae.m1157m(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1354g = i;
        if (this.f1370w != null) {
            this.f1370w.m2195a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m2640d();
        ae.m1129a(this.f1349a, (float) (-Math.max(0, Math.min(i, this.f1349a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0463a c0463a) {
        this.f1370w = c0463a;
        if (getWindowToken() != null) {
            this.f1370w.m2195a(this.f1354g);
            if (this.f1363p != 0) {
                onWindowSystemUiVisibilityChanged(this.f1363p);
                ae.m1157m(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1360m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1361n) {
            this.f1361n = z;
            if (!z) {
                m2640d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m2639c();
        this.f1356i.m2808a(i);
    }

    public void setIcon(Drawable drawable) {
        m2639c();
        this.f1356i.m2809a(drawable);
    }

    public void setLogo(int i) {
        m2639c();
        this.f1356i.m2817b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1359l = z;
        boolean z2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.f1358k = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        m2639c();
        this.f1356i.m2813a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m2639c();
        this.f1356i.m2814a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
