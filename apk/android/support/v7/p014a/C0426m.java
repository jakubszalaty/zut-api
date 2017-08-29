package android.support.v7.p014a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p006a.C0099y;
import android.support.v4.p007g.C0077n;
import android.support.v4.p007g.C0301j;
import android.support.v4.p007g.C0330z;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.ao;
import android.support.v4.p007g.au;
import android.support.v4.p007g.az;
import android.support.v4.p007g.bb;
import android.support.v4.widget.C0382q;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0467c;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p015b.C0475a.C0473i;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.C0485d;
import android.support.v7.view.C0486e;
import android.support.v7.view.menu.C0499p;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0513f;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.C0610l;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.C0437a;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ab;
import android.support.v7.widget.af;
import android.support.v7.widget.af.C0435a;
import android.support.v7.widget.ax;
import android.support.v7.widget.ay;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.a.m */
class C0426m extends C0421h implements C0077n, C0425a {
    private boolean f870A;
    private boolean f871B;
    private boolean f872C;
    private C0448d[] f873D;
    private C0448d f874E;
    private boolean f875F;
    private final Runnable f876G;
    private boolean f877H;
    private Rect f878I;
    private Rect f879J;
    private C0451o f880K;
    C0461b f881m;
    ActionBarContextView f882n;
    PopupWindow f883o;
    Runnable f884p;
    au f885q;
    boolean f886r;
    int f887s;
    private ab f888t;
    private C0443a f889u;
    private C0449e f890v;
    private boolean f891w;
    private ViewGroup f892x;
    private TextView f893y;
    private View f894z;

    /* renamed from: android.support.v7.a.m.1 */
    class C04331 implements Runnable {
        final /* synthetic */ C0426m f906a;

        C04331(C0426m c0426m) {
            this.f906a = c0426m;
        }

        public void run() {
            if ((this.f906a.f887s & 1) != 0) {
                this.f906a.m2061f(0);
            }
            if ((this.f906a.f887s & 4096) != 0) {
                this.f906a.m2061f(C0474j.AppCompatTheme_ratingBarStyle);
            }
            this.f906a.f886r = false;
            this.f906a.f887s = 0;
        }
    }

    /* renamed from: android.support.v7.a.m.2 */
    class C04342 implements C0330z {
        final /* synthetic */ C0426m f907a;

        C04342(C0426m c0426m) {
            this.f907a = c0426m;
        }

        public bb m2091a(View view, bb bbVar) {
            int b = bbVar.m1430b();
            int g = this.f907a.m2062g(b);
            if (b != g) {
                bbVar = bbVar.m1429a(bbVar.m1428a(), g, bbVar.m1431c(), bbVar.m1432d());
            }
            return ae.m1127a(view, bbVar);
        }
    }

    /* renamed from: android.support.v7.a.m.3 */
    class C04363 implements C0435a {
        final /* synthetic */ C0426m f908a;

        C04363(C0426m c0426m) {
            this.f908a = c0426m;
        }

        public void m2093a(Rect rect) {
            rect.top = this.f908a.m2062g(rect.top);
        }
    }

    /* renamed from: android.support.v7.a.m.4 */
    class C04384 implements C0437a {
        final /* synthetic */ C0426m f909a;

        C04384(C0426m c0426m) {
            this.f909a = c0426m;
        }

        public void m2096a() {
        }

        public void m2097b() {
            this.f909a.m2069v();
        }
    }

    /* renamed from: android.support.v7.a.m.5 */
    class C04405 implements Runnable {
        final /* synthetic */ C0426m f911a;

        /* renamed from: android.support.v7.a.m.5.1 */
        class C04391 extends az {
            final /* synthetic */ C04405 f910a;

            C04391(C04405 c04405) {
                this.f910a = c04405;
            }

            public void m2098a(View view) {
                this.f910a.f911a.f882n.setVisibility(0);
            }

            public void m2099b(View view) {
                ae.m1141b(this.f910a.f911a.f882n, 1.0f);
                this.f910a.f911a.f885q.m1313a(null);
                this.f910a.f911a.f885q = null;
            }
        }

        C04405(C0426m c0426m) {
            this.f911a = c0426m;
        }

        public void run() {
            this.f911a.f883o.showAtLocation(this.f911a.f882n, 55, 0, 0);
            this.f911a.m2067t();
            if (this.f911a.m2066s()) {
                ae.m1141b(this.f911a.f882n, 0.0f);
                this.f911a.f885q = ae.m1154j(this.f911a.f882n).m1311a(1.0f);
                this.f911a.f885q.m1313a(new C04391(this));
                return;
            }
            ae.m1141b(this.f911a.f882n, 1.0f);
            this.f911a.f882n.setVisibility(0);
        }
    }

    /* renamed from: android.support.v7.a.m.6 */
    class C04416 extends az {
        final /* synthetic */ C0426m f912a;

        C04416(C0426m c0426m) {
            this.f912a = c0426m;
        }

        public void m2100a(View view) {
            this.f912a.f882n.setVisibility(0);
            this.f912a.f882n.sendAccessibilityEvent(32);
            if (this.f912a.f882n.getParent() != null) {
                ae.m1157m((View) this.f912a.f882n.getParent());
            }
        }

        public void m2101b(View view) {
            ae.m1141b(this.f912a.f882n, 1.0f);
            this.f912a.f885q.m1313a(null);
            this.f912a.f885q = null;
        }
    }

    /* renamed from: android.support.v7.a.m.a */
    private final class C0443a implements C0442a {
        final /* synthetic */ C0426m f913a;

        C0443a(C0426m c0426m) {
            this.f913a = c0426m;
        }

        public void m2104a(C0515h c0515h, boolean z) {
            this.f913a.m2049b(c0515h);
        }

        public boolean m2105a(C0515h c0515h) {
            Callback q = this.f913a.m2007q();
            if (q != null) {
                q.onMenuOpened(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.a.m.b */
    class C0446b implements C0445a {
        final /* synthetic */ C0426m f915a;
        private C0445a f916b;

        /* renamed from: android.support.v7.a.m.b.1 */
        class C04441 extends az {
            final /* synthetic */ C0446b f914a;

            C04441(C0446b c0446b) {
                this.f914a = c0446b;
            }

            public void m2106b(View view) {
                this.f914a.f915a.f882n.setVisibility(8);
                if (this.f914a.f915a.f883o != null) {
                    this.f914a.f915a.f883o.dismiss();
                } else if (this.f914a.f915a.f882n.getParent() instanceof View) {
                    ae.m1157m((View) this.f914a.f915a.f882n.getParent());
                }
                this.f914a.f915a.f882n.removeAllViews();
                this.f914a.f915a.f885q.m1313a(null);
                this.f914a.f915a.f885q = null;
            }
        }

        public C0446b(C0426m c0426m, C0445a c0445a) {
            this.f915a = c0426m;
            this.f916b = c0445a;
        }

        public void m2111a(C0461b c0461b) {
            this.f916b.m2107a(c0461b);
            if (this.f915a.f883o != null) {
                this.f915a.b.getDecorView().removeCallbacks(this.f915a.f884p);
            }
            if (this.f915a.f882n != null) {
                this.f915a.m2067t();
                this.f915a.f885q = ae.m1154j(this.f915a.f882n).m1311a(0.0f);
                this.f915a.f885q.m1313a(new C04441(this));
            }
            if (this.f915a.e != null) {
                this.f915a.e.m1906b(this.f915a.f881m);
            }
            this.f915a.f881m = null;
        }

        public boolean m2112a(C0461b c0461b, Menu menu) {
            return this.f916b.m2108a(c0461b, menu);
        }

        public boolean m2113a(C0461b c0461b, MenuItem menuItem) {
            return this.f916b.m2109a(c0461b, menuItem);
        }

        public boolean m2114b(C0461b c0461b, Menu menu) {
            return this.f916b.m2110b(c0461b, menu);
        }
    }

    /* renamed from: android.support.v7.a.m.c */
    private class C0447c extends ContentFrameLayout {
        final /* synthetic */ C0426m f925a;

        public C0447c(C0426m c0426m, Context context) {
            this.f925a = c0426m;
            super(context);
        }

        private boolean m2117a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f925a.m2044a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2117a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f925a.m2059e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0478b.m2246b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.a.m.d */
    protected static final class C0448d {
        int f926a;
        int f927b;
        int f928c;
        int f929d;
        int f930e;
        int f931f;
        ViewGroup f932g;
        View f933h;
        View f934i;
        C0515h f935j;
        C0513f f936k;
        Context f937l;
        boolean f938m;
        boolean f939n;
        boolean f940o;
        public boolean f941p;
        boolean f942q;
        boolean f943r;
        Bundle f944s;

        C0448d(int i) {
            this.f926a = i;
            this.f942q = false;
        }

        C0499p m2118a(C0442a c0442a) {
            if (this.f935j == null) {
                return null;
            }
            if (this.f936k == null) {
                this.f936k = new C0513f(this.f937l, C0471g.abc_list_menu_item_layout);
                this.f936k.m2441a(c0442a);
                this.f935j.m2470a(this.f936k);
            }
            return this.f936k.m2437a(this.f932g);
        }

        void m2119a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0465a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0465a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0473i.Theme_AppCompat_CompactMenu, true);
            }
            Context c0485d = new C0485d(context, 0);
            c0485d.getTheme().setTo(newTheme);
            this.f937l = c0485d;
            TypedArray obtainStyledAttributes = c0485d.obtainStyledAttributes(C0474j.AppCompatTheme);
            this.f927b = obtainStyledAttributes.getResourceId(C0474j.AppCompatTheme_panelBackground, 0);
            this.f931f = obtainStyledAttributes.getResourceId(C0474j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        void m2120a(C0515h c0515h) {
            if (c0515h != this.f935j) {
                if (this.f935j != null) {
                    this.f935j.m2481b(this.f936k);
                }
                this.f935j = c0515h;
                if (c0515h != null && this.f936k != null) {
                    c0515h.m2470a(this.f936k);
                }
            }
        }

        public boolean m2121a() {
            return this.f933h == null ? false : this.f934i != null || this.f936k.m2438a().getCount() > 0;
        }
    }

    /* renamed from: android.support.v7.a.m.e */
    private final class C0449e implements C0442a {
        final /* synthetic */ C0426m f945a;

        C0449e(C0426m c0426m) {
            this.f945a = c0426m;
        }

        public void m2122a(C0515h c0515h, boolean z) {
            Menu menu;
            Menu p = c0515h.m2503p();
            boolean z2 = p != c0515h;
            C0426m c0426m = this.f945a;
            if (z2) {
                menu = p;
            }
            C0448d a = c0426m.m2029a(menu);
            if (a == null) {
                return;
            }
            if (z2) {
                this.f945a.m2033a(a.f926a, a, p);
                this.f945a.m2037a(a, true);
                return;
            }
            this.f945a.m2037a(a, z);
        }

        public boolean m2123a(C0515h c0515h) {
            if (c0515h == null && this.f945a.h) {
                Callback q = this.f945a.m2007q();
                if (!(q == null || this.f945a.m2006p())) {
                    q.onMenuOpened(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
                }
            }
            return true;
        }
    }

    C0426m(Context context, Window window, C0397f c0397f) {
        super(context, window, c0397f);
        this.f885q = null;
        this.f876G = new C04331(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2012a(android.support.v7.p014a.C0426m.C0448d r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r3 = 0;
        r9 = 1;
        r2 = -2;
        r0 = r11.f940o;
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r10.m2006p();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r0 = r11.f926a;
        if (r0 != 0) goto L_0x0034;
    L_0x0013:
        r4 = r10.a;
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r5 = 4;
        if (r0 != r5) goto L_0x0048;
    L_0x0024:
        r0 = r9;
    L_0x0025:
        r4 = r4.getApplicationInfo();
        r4 = r4.targetSdkVersion;
        r5 = 11;
        if (r4 < r5) goto L_0x004a;
    L_0x002f:
        r4 = r9;
    L_0x0030:
        if (r0 == 0) goto L_0x0034;
    L_0x0032:
        if (r4 != 0) goto L_0x000e;
    L_0x0034:
        r0 = r10.m2007q();
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r11.f926a;
        r5 = r11.f935j;
        r0 = r0.onMenuOpened(r4, r5);
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r10.m2037a(r11, r9);
        goto L_0x000e;
    L_0x0048:
        r0 = r3;
        goto L_0x0025;
    L_0x004a:
        r4 = r3;
        goto L_0x0030;
    L_0x004c:
        r0 = r10.a;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000e;
    L_0x0059:
        r0 = r10.m2018b(r11, r12);
        if (r0 == 0) goto L_0x000e;
    L_0x005f:
        r0 = r11.f932g;
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r11.f942q;
        if (r0 == 0) goto L_0x00f1;
    L_0x0067:
        r0 = r11.f932g;
        if (r0 != 0) goto L_0x00df;
    L_0x006b:
        r0 = r10.m2014a(r11);
        if (r0 == 0) goto L_0x000e;
    L_0x0071:
        r0 = r11.f932g;
        if (r0 == 0) goto L_0x000e;
    L_0x0075:
        r0 = r10.m2019c(r11);
        if (r0 == 0) goto L_0x000e;
    L_0x007b:
        r0 = r11.m2121a();
        if (r0 == 0) goto L_0x000e;
    L_0x0081:
        r0 = r11.f933h;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x0103;
    L_0x0089:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x008f:
        r0 = r11.f927b;
        r4 = r11.f932g;
        r4.setBackgroundResource(r0);
        r0 = r11.f933h;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x00a9;
    L_0x009e:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x00a9;
    L_0x00a2:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.f933h;
        r0.removeView(r4);
    L_0x00a9:
        r0 = r11.f932g;
        r4 = r11.f933h;
        r0.addView(r4, r1);
        r0 = r11.f933h;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x00bd;
    L_0x00b8:
        r0 = r11.f933h;
        r0.requestFocus();
    L_0x00bd:
        r1 = r2;
    L_0x00be:
        r11.f939n = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.f929d;
        r4 = r11.f930e;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.f928c;
        r0.gravity = r1;
        r1 = r11.f931f;
        r0.windowAnimations = r1;
        r1 = r11.f932g;
        r8.addView(r1, r0);
        r11.f940o = r9;
        goto L_0x000e;
    L_0x00df:
        r0 = r11.f942q;
        if (r0 == 0) goto L_0x0075;
    L_0x00e3:
        r0 = r11.f932g;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x0075;
    L_0x00eb:
        r0 = r11.f932g;
        r0.removeAllViews();
        goto L_0x0075;
    L_0x00f1:
        r0 = r11.f934i;
        if (r0 == 0) goto L_0x0101;
    L_0x00f5:
        r0 = r11.f934i;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x0101;
    L_0x00fd:
        r0 = r0.width;
        if (r0 == r1) goto L_0x00be;
    L_0x0101:
        r1 = r2;
        goto L_0x00be;
    L_0x0103:
        r1 = r0;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.a.m.a(android.support.v7.a.m$d, android.view.KeyEvent):void");
    }

    private void m2013a(C0515h c0515h, boolean z) {
        if (this.f888t == null || !this.f888t.m2619e() || (ao.m1228a(ViewConfiguration.get(this.a)) && !this.f888t.m2621g())) {
            C0448d a = m2028a(0, true);
            a.f942q = true;
            m2037a(a, false);
            m2012a(a, null);
            return;
        }
        Callback q = m2007q();
        if (this.f888t.m2620f() && z) {
            this.f888t.m2623i();
            if (!m2006p()) {
                q.onPanelClosed(C0474j.AppCompatTheme_ratingBarStyle, m2028a(0, true).f935j);
            }
        } else if (q != null && !m2006p()) {
            if (this.f886r && (this.f887s & 1) != 0) {
                this.b.getDecorView().removeCallbacks(this.f876G);
                this.f876G.run();
            }
            C0448d a2 = m2028a(0, true);
            if (a2.f935j != null && !a2.f943r && q.onPreparePanel(0, a2.f934i, a2.f935j)) {
                q.onMenuOpened(C0474j.AppCompatTheme_ratingBarStyle, a2.f935j);
                this.f888t.m2622h();
            }
        }
    }

    private boolean m2014a(C0448d c0448d) {
        c0448d.m2119a(m2004n());
        c0448d.f932g = new C0447c(this, c0448d.f937l);
        c0448d.f928c = 81;
        return true;
    }

    private boolean m2015a(C0448d c0448d, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((c0448d.f938m || m2018b(c0448d, keyEvent)) && c0448d.f935j != null) {
                z = c0448d.f935j.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.f888t == null) {
                m2037a(c0448d, true);
            }
        }
        return z;
    }

    private boolean m2016a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent decorView = this.b.getDecorView();
        ViewParent viewParent2 = viewParent;
        while (viewParent2 != null) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || ae.m1165u((View) viewParent2)) {
                return false;
            }
            viewParent2 = viewParent2.getParent();
        }
        return true;
    }

    private boolean m2017b(C0448d c0448d) {
        Context c0485d;
        C0515h c0515h;
        Context context = this.a;
        if ((c0448d.f926a == 0 || c0448d.f926a == C0474j.AppCompatTheme_ratingBarStyle) && this.f888t != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0465a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0465a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0465a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Theme theme3 = theme2;
            if (theme3 != null) {
                c0485d = new C0485d(context, 0);
                c0485d.getTheme().setTo(theme3);
                c0515h = new C0515h(c0485d);
                c0515h.m2468a((C0425a) this);
                c0448d.m2120a(c0515h);
                return true;
            }
        }
        c0485d = context;
        c0515h = new C0515h(c0485d);
        c0515h.m2468a((C0425a) this);
        c0448d.m2120a(c0515h);
        return true;
    }

    private boolean m2018b(C0448d c0448d, KeyEvent keyEvent) {
        if (m2006p()) {
            return false;
        }
        if (c0448d.f938m) {
            return true;
        }
        if (!(this.f874E == null || this.f874E == c0448d)) {
            m2037a(this.f874E, false);
        }
        Callback q = m2007q();
        if (q != null) {
            c0448d.f934i = q.onCreatePanelView(c0448d.f926a);
        }
        boolean z = c0448d.f926a == 0 || c0448d.f926a == C0474j.AppCompatTheme_ratingBarStyle;
        if (z && this.f888t != null) {
            this.f888t.m2624j();
        }
        if (c0448d.f934i == null && !(z && (m2003m() instanceof C0454p))) {
            if (c0448d.f935j == null || c0448d.f943r) {
                if (c0448d.f935j == null && (!m2017b(c0448d) || c0448d.f935j == null)) {
                    return false;
                }
                if (z && this.f888t != null) {
                    if (this.f889u == null) {
                        this.f889u = new C0443a(this);
                    }
                    this.f888t.m2618a(c0448d.f935j, this.f889u);
                }
                c0448d.f935j.m2494g();
                if (q.onCreatePanelMenu(c0448d.f926a, c0448d.f935j)) {
                    c0448d.f943r = false;
                } else {
                    c0448d.m2120a(null);
                    if (!z || this.f888t == null) {
                        return false;
                    }
                    this.f888t.m2618a(null, this.f889u);
                    return false;
                }
            }
            c0448d.f935j.m2494g();
            if (c0448d.f944s != null) {
                c0448d.f935j.m2479b(c0448d.f944s);
                c0448d.f944s = null;
            }
            if (q.onPreparePanel(0, c0448d.f934i, c0448d.f935j)) {
                c0448d.f941p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
                c0448d.f935j.setQwertyMode(c0448d.f941p);
                c0448d.f935j.m2495h();
            } else {
                if (z && this.f888t != null) {
                    this.f888t.m2618a(null, this.f889u);
                }
                c0448d.f935j.m2495h();
                return false;
            }
        }
        c0448d.f938m = true;
        c0448d.f939n = false;
        this.f874E = c0448d;
        return true;
    }

    private boolean m2019c(C0448d c0448d) {
        if (c0448d.f934i != null) {
            c0448d.f933h = c0448d.f934i;
            return true;
        } else if (c0448d.f935j == null) {
            return false;
        } else {
            if (this.f890v == null) {
                this.f890v = new C0449e(this);
            }
            c0448d.f933h = (View) c0448d.m2118a(this.f890v);
            return c0448d.f933h != null;
        }
    }

    private void m2020d(int i) {
        this.f887s |= 1 << i;
        if (!this.f886r) {
            ae.m1136a(this.b.getDecorView(), this.f876G);
            this.f886r = true;
        }
    }

    private boolean m2021d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0448d a = m2028a(i, true);
            if (!a.f940o) {
                return m2018b(a, keyEvent);
            }
        }
        return false;
    }

    private boolean m2022e(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (this.f881m != null) {
            return false;
        }
        C0448d a = m2028a(i, true);
        if (i != 0 || this.f888t == null || !this.f888t.m2619e() || ao.m1228a(ViewConfiguration.get(this.a))) {
            boolean z2;
            if (a.f940o || a.f939n) {
                z2 = a.f940o;
                m2037a(a, true);
                z = z2;
            } else {
                if (a.f938m) {
                    if (a.f943r) {
                        a.f938m = false;
                        z2 = m2018b(a, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        m2012a(a, keyEvent);
                    }
                }
                z = false;
            }
        } else if (this.f888t.m2620f()) {
            z = this.f888t.m2623i();
        } else {
            if (!m2006p() && m2018b(a, keyEvent)) {
                z = this.f888t.m2622h();
            }
            z = false;
        }
        if (z) {
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z;
    }

    private int m2023h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0474j.AppCompatTheme_ratingBarStyle;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return C0474j.AppCompatTheme_ratingBarStyleIndicator;
        }
    }

    private void m2024w() {
        if (!this.f891w) {
            this.f892x = m2025x();
            CharSequence r = m2008r();
            if (!TextUtils.isEmpty(r)) {
                m2051b(r);
            }
            m2026y();
            m2041a(this.f892x);
            this.f891w = true;
            C0448d a = m2028a(0, false);
            if (!m2006p()) {
                if (a == null || a.f935j == null) {
                    m2020d(C0474j.AppCompatTheme_ratingBarStyle);
                }
            }
        }
    }

    private ViewGroup m2025x() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0474j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTheme_windowActionBar)) {
            View view;
            if (obtainStyledAttributes.getBoolean(C0474j.AppCompatTheme_windowNoTitle, false)) {
                m2055c(1);
            } else if (obtainStyledAttributes.getBoolean(C0474j.AppCompatTheme_windowActionBar, false)) {
                m2055c((int) C0474j.AppCompatTheme_ratingBarStyle);
            }
            if (obtainStyledAttributes.getBoolean(C0474j.AppCompatTheme_windowActionBarOverlay, false)) {
                m2055c((int) C0474j.AppCompatTheme_ratingBarStyleIndicator);
            }
            if (obtainStyledAttributes.getBoolean(C0474j.AppCompatTheme_windowActionModeOverlay, false)) {
                m2055c(10);
            }
            this.k = obtainStyledAttributes.getBoolean(C0474j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.a);
            if (this.l) {
                View view2 = this.j ? (ViewGroup) from.inflate(C0471g.abc_screen_simple_overlay_action_mode, null) : (ViewGroup) from.inflate(C0471g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    ae.m1135a(view2, new C04342(this));
                    view = view2;
                } else {
                    ((af) view2).setOnFitSystemWindowsListener(new C04363(this));
                    view = view2;
                }
            } else if (this.k) {
                r0 = (ViewGroup) from.inflate(C0471g.abc_dialog_title_material, null);
                this.i = false;
                this.h = false;
                view = r0;
            } else if (this.h) {
                TypedValue typedValue = new TypedValue();
                this.a.getTheme().resolveAttribute(C0465a.actionBarTheme, typedValue, true);
                r0 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0485d(this.a, typedValue.resourceId) : this.a).inflate(C0471g.abc_screen_toolbar, null);
                this.f888t = (ab) r0.findViewById(C0470f.decor_content_parent);
                this.f888t.setWindowCallback(m2007q());
                if (this.i) {
                    this.f888t.m2617a(C0474j.AppCompatTheme_ratingBarStyleIndicator);
                }
                if (this.f870A) {
                    this.f888t.m2617a(2);
                }
                if (this.f871B) {
                    this.f888t.m2617a(5);
                }
                view = r0;
            } else {
                view = null;
            }
            if (view == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
            }
            if (this.f888t == null) {
                this.f893y = (TextView) view.findViewById(C0470f.title);
            }
            ay.m3017b(view);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C0470f.action_bar_activity_content);
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
            if (viewGroup != null) {
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup instanceof FrameLayout) {
                    ((FrameLayout) viewGroup).setForeground(null);
                }
            }
            this.b.setContentView(view);
            contentFrameLayout.setAttachListener(new C04384(this));
            return view;
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void m2026y() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f892x.findViewById(16908290);
        View decorView = this.b.getDecorView();
        contentFrameLayout.m2115a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0474j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0474j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void m2027z() {
        if (this.f891w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    protected C0448d m2028a(int i, boolean z) {
        Object obj = this.f873D;
        if (obj == null || obj.length <= i) {
            Object obj2 = new C0448d[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f873D = obj2;
            obj = obj2;
        }
        C0448d c0448d = obj[i];
        if (c0448d != null) {
            return c0448d;
        }
        c0448d = new C0448d(i);
        obj[i] = c0448d;
        return c0448d;
    }

    C0448d m2029a(Menu menu) {
        C0448d[] c0448dArr = this.f873D;
        int length = c0448dArr != null ? c0448dArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0448d c0448d = c0448dArr[i];
            if (c0448d != null && c0448d.f935j == menu) {
                return c0448d;
            }
        }
        return null;
    }

    C0461b m2030a(C0445a c0445a) {
        C0461b c0461b;
        m2067t();
        if (this.f881m != null) {
            this.f881m.m2170c();
        }
        if (!(c0445a instanceof C0446b)) {
            c0445a = new C0446b(this, c0445a);
        }
        if (this.e == null || m2006p()) {
            c0461b = null;
        } else {
            try {
                c0461b = this.e.m1904a(c0445a);
            } catch (AbstractMethodError e) {
                c0461b = null;
            }
        }
        if (c0461b != null) {
            this.f881m = c0461b;
        } else {
            if (this.f882n == null) {
                if (this.k) {
                    Context c0485d;
                    TypedValue typedValue = new TypedValue();
                    Theme theme = this.a.getTheme();
                    theme.resolveAttribute(C0465a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Theme newTheme = this.a.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        c0485d = new C0485d(this.a, 0);
                        c0485d.getTheme().setTo(newTheme);
                    } else {
                        c0485d = this.a;
                    }
                    this.f882n = new ActionBarContextView(c0485d);
                    this.f883o = new PopupWindow(c0485d, null, C0465a.actionModePopupWindowStyle);
                    C0382q.m1813a(this.f883o, 2);
                    this.f883o.setContentView(this.f882n);
                    this.f883o.setWidth(-1);
                    c0485d.getTheme().resolveAttribute(C0465a.actionBarSize, typedValue, true);
                    this.f882n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0485d.getResources().getDisplayMetrics()));
                    this.f883o.setHeight(-2);
                    this.f884p = new C04405(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f892x.findViewById(C0470f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m2004n()));
                        this.f882n = (ActionBarContextView) viewStubCompat.m2801a();
                    }
                }
            }
            if (this.f882n != null) {
                m2067t();
                this.f882n.m2613c();
                C0461b c0486e = new C0486e(this.f882n.getContext(), this.f882n, c0445a, this.f883o == null);
                if (c0445a.m2108a(c0486e, c0486e.m2167b())) {
                    c0486e.m2171d();
                    this.f882n.m2610a(c0486e);
                    this.f881m = c0486e;
                    if (m2066s()) {
                        ae.m1141b(this.f882n, 0.0f);
                        this.f885q = ae.m1154j(this.f882n).m1311a(1.0f);
                        this.f885q.m1313a(new C04416(this));
                    } else {
                        ae.m1141b(this.f882n, 1.0f);
                        this.f882n.setVisibility(0);
                        this.f882n.sendAccessibilityEvent(32);
                        if (this.f882n.getParent() != null) {
                            ae.m1157m((View) this.f882n.getParent());
                        }
                    }
                    if (this.f883o != null) {
                        this.b.getDecorView().post(this.f884p);
                    }
                } else {
                    this.f881m = null;
                }
            }
        }
        if (!(this.f881m == null || this.e == null)) {
            this.e.m1905a(this.f881m);
        }
        return this.f881m;
    }

    public View m2031a(int i) {
        m2024w();
        return this.b.findViewById(i);
    }

    public final View m2032a(View view, String str, Context context, AttributeSet attributeSet) {
        View b = m2046b(view, str, context, attributeSet);
        return b != null ? b : m2054c(view, str, context, attributeSet);
    }

    void m2033a(int i, C0448d c0448d, Menu menu) {
        if (menu == null) {
            if (c0448d == null && i >= 0 && i < this.f873D.length) {
                c0448d = this.f873D[i];
            }
            if (c0448d != null) {
                menu = c0448d.f935j;
            }
        }
        if ((c0448d == null || c0448d.f940o) && !m2006p()) {
            this.c.onPanelClosed(i, menu);
        }
    }

    void m2034a(int i, Menu menu) {
        if (i == C0474j.AppCompatTheme_ratingBarStyle) {
            C0396a a = m1987a();
            if (a != null) {
                a.m1899e(false);
            }
        } else if (i == 0) {
            C0448d a2 = m2028a(i, true);
            if (a2.f940o) {
                m2037a(a2, false);
            }
        }
    }

    public void m2035a(Configuration configuration) {
        if (this.h && this.f891w) {
            C0396a a = m1987a();
            if (a != null) {
                a.m1889a(configuration);
            }
        }
        C0610l.m3109a().m3130a(this.a);
        m2001i();
    }

    public void m2036a(Bundle bundle) {
        if ((this.c instanceof Activity) && C0099y.m432b((Activity) this.c) != null) {
            C0396a m = m2003m();
            if (m == null) {
                this.f877H = true;
            } else {
                m.m1896c(true);
            }
        }
    }

    void m2037a(C0448d c0448d, boolean z) {
        if (z && c0448d.f926a == 0 && this.f888t != null && this.f888t.m2620f()) {
            m2049b(c0448d.f935j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (!(windowManager == null || !c0448d.f940o || c0448d.f932g == null)) {
            windowManager.removeView(c0448d.f932g);
            if (z) {
                m2033a(c0448d.f926a, c0448d, null);
            }
        }
        c0448d.f938m = false;
        c0448d.f939n = false;
        c0448d.f940o = false;
        c0448d.f933h = null;
        c0448d.f942q = true;
        if (this.f874E == c0448d) {
            this.f874E = null;
        }
    }

    public void m2038a(C0515h c0515h) {
        m2013a(c0515h, true);
    }

    public void m2039a(View view) {
        m2024w();
        ViewGroup viewGroup = (ViewGroup) this.f892x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    public void m2040a(View view, LayoutParams layoutParams) {
        m2024w();
        ViewGroup viewGroup = (ViewGroup) this.f892x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    void m2041a(ViewGroup viewGroup) {
    }

    boolean m2042a(int i, KeyEvent keyEvent) {
        C0396a a = m1987a();
        if (a != null && a.m1892a(i, keyEvent)) {
            return true;
        }
        if (this.f874E == null || !m2015a(this.f874E, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f874E == null) {
                C0448d a2 = m2028a(0, true);
                m2018b(a2, keyEvent);
                boolean a3 = m2015a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f938m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        } else if (this.f874E == null) {
            return true;
        } else {
            this.f874E.f939n = true;
            return true;
        }
    }

    public boolean m2043a(C0515h c0515h, MenuItem menuItem) {
        Callback q = m2007q();
        if (!(q == null || m2006p())) {
            C0448d a = m2029a(c0515h.m2503p());
            if (a != null) {
                return q.onMenuItemSelected(a.f926a, menuItem);
            }
        }
        return false;
    }

    boolean m2044a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m2056c(keyCode, keyEvent) : m2052b(keyCode, keyEvent);
    }

    public C0461b m2045b(C0445a c0445a) {
        if (c0445a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f881m != null) {
            this.f881m.m2170c();
        }
        C0445a c0446b = new C0446b(this, c0445a);
        C0396a a = m1987a();
        if (a != null) {
            this.f881m = a.m1887a(c0446b);
            if (!(this.f881m == null || this.e == null)) {
                this.e.m1905a(this.f881m);
            }
        }
        if (this.f881m == null) {
            this.f881m = m2030a(c0446b);
        }
        return this.f881m;
    }

    View m2046b(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.c instanceof Factory) {
            View onCreateView = ((Factory) this.c).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    public void m2047b(int i) {
        m2024w();
        ViewGroup viewGroup = (ViewGroup) this.f892x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    public void m2048b(Bundle bundle) {
        m2024w();
    }

    void m2049b(C0515h c0515h) {
        if (!this.f872C) {
            this.f872C = true;
            this.f888t.m2625k();
            Callback q = m2007q();
            if (!(q == null || m2006p())) {
                q.onPanelClosed(C0474j.AppCompatTheme_ratingBarStyle, c0515h);
            }
            this.f872C = false;
        }
    }

    public void m2050b(View view, LayoutParams layoutParams) {
        m2024w();
        ((ViewGroup) this.f892x.findViewById(16908290)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    void m2051b(CharSequence charSequence) {
        if (this.f888t != null) {
            this.f888t.setWindowTitle(charSequence);
        } else if (m2003m() != null) {
            m2003m().m1890a(charSequence);
        } else if (this.f893y != null) {
            this.f893y.setText(charSequence);
        }
    }

    boolean m2052b(int i, KeyEvent keyEvent) {
        switch (i) {
            case C0474j.View_theme /*4*/:
                boolean z = this.f875F;
                this.f875F = false;
                C0448d a = m2028a(0, false);
                if (a == null || !a.f940o) {
                    if (m2068u()) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    m2037a(a, true);
                    return true;
                }
                break;
            case C0474j.AppCompatTheme_listChoiceBackgroundIndicator /*82*/:
                m2022e(0, keyEvent);
                return true;
        }
        return false;
    }

    boolean m2053b(int i, Menu menu) {
        if (i != C0474j.AppCompatTheme_ratingBarStyle) {
            return false;
        }
        C0396a a = m1987a();
        if (a == null) {
            return true;
        }
        a.m1899e(true);
        return true;
    }

    public View m2054c(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z = VERSION.SDK_INT < 21;
        if (this.f880K == null) {
            this.f880K = new C0451o();
        }
        boolean z2 = z && m2016a((ViewParent) view);
        return this.f880K.m2129a(view, str, context, attributeSet, z2, z, true, ax.m3012a());
    }

    public boolean m2055c(int i) {
        int h = m2023h(i);
        if (this.l && h == C0474j.AppCompatTheme_ratingBarStyle) {
            return false;
        }
        if (this.h && h == 1) {
            this.h = false;
        }
        switch (h) {
            case C0474j.View_android_focusable /*1*/:
                m2027z();
                this.l = true;
                return true;
            case C0474j.View_paddingStart /*2*/:
                m2027z();
                this.f870A = true;
                return true;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                m2027z();
                this.f871B = true;
                return true;
            case C0474j.Toolbar_contentInsetEndWithActions /*10*/:
                m2027z();
                this.j = true;
                return true;
            case C0474j.AppCompatTheme_ratingBarStyle /*108*/:
                m2027z();
                this.h = true;
                return true;
            case C0474j.AppCompatTheme_ratingBarStyleIndicator /*109*/:
                m2027z();
                this.i = true;
                return true;
            default:
                return this.b.requestFeature(h);
        }
    }

    boolean m2056c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case C0474j.View_theme /*4*/:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f875F = z;
                break;
            case C0474j.AppCompatTheme_listChoiceBackgroundIndicator /*82*/:
                m2021d(0, keyEvent);
                return true;
        }
        if (VERSION.SDK_INT < 11) {
            m2042a(i, keyEvent);
        }
        return false;
    }

    public void m2057d() {
        C0396a a = m1987a();
        if (a != null) {
            a.m1898d(false);
        }
    }

    public void m2058e() {
        C0396a a = m1987a();
        if (a != null) {
            a.m1898d(true);
        }
    }

    void m2059e(int i) {
        m2037a(m2028a(i, true), true);
    }

    public void m2060f() {
        C0396a a = m1987a();
        if (a == null || !a.m1900e()) {
            m2020d(0);
        }
    }

    void m2061f(int i) {
        C0448d a = m2028a(i, true);
        if (a.f935j != null) {
            Bundle bundle = new Bundle();
            a.f935j.m2467a(bundle);
            if (bundle.size() > 0) {
                a.f944s = bundle;
            }
            a.f935j.m2494g();
            a.f935j.clear();
        }
        a.f943r = true;
        a.f942q = true;
        if ((i == C0474j.AppCompatTheme_ratingBarStyle || i == 0) && this.f888t != null) {
            a = m2028a(0, false);
            if (a != null) {
                a.f938m = false;
                m2018b(a, null);
            }
        }
    }

    int m2062g(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.f882n == null || !(this.f882n.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f882n.getLayoutParams();
            if (this.f882n.isShown()) {
                if (this.f878I == null) {
                    this.f878I = new Rect();
                    this.f879J = new Rect();
                }
                Rect rect = this.f878I;
                Rect rect2 = this.f879J;
                rect.set(0, i, 0, 0);
                ay.m3015a(this.f892x, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f894z == null) {
                        this.f894z = new View(this.a);
                        this.f894z.setBackgroundColor(this.a.getResources().getColor(C0467c.abc_input_method_navigation_guard));
                        this.f892x.addView(this.f894z, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.f894z.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f894z.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.f894z == null) {
                    i3 = 0;
                }
                if (!(this.j || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f882n.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.f894z != null) {
            View view = this.f894z;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    public void m2063g() {
        super.m2000g();
        if (this.f != null) {
            this.f.m1903h();
        }
    }

    public void m2064h() {
        LayoutInflater from = LayoutInflater.from(this.a);
        if (from.getFactory() == null) {
            C0301j.m1480a(from, this);
        } else if (!(C0301j.m1479a(from) instanceof C0426m)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void m2065l() {
        m2024w();
        if (this.h && this.f == null) {
            if (this.c instanceof Activity) {
                this.f = new C0464s((Activity) this.c, this.i);
            } else if (this.c instanceof Dialog) {
                this.f = new C0464s((Dialog) this.c);
            }
            if (this.f != null) {
                this.f.m1896c(this.f877H);
            }
        }
    }

    final boolean m2066s() {
        return this.f891w && this.f892x != null && ae.m1164t(this.f892x);
    }

    void m2067t() {
        if (this.f885q != null) {
            this.f885q.m1318b();
        }
    }

    boolean m2068u() {
        if (this.f881m != null) {
            this.f881m.m2170c();
            return true;
        }
        C0396a a = m1987a();
        return a != null && a.m1901f();
    }

    void m2069v() {
        if (this.f888t != null) {
            this.f888t.m2625k();
        }
        if (this.f883o != null) {
            this.b.getDecorView().removeCallbacks(this.f884p);
            if (this.f883o.isShowing()) {
                try {
                    this.f883o.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f883o = null;
        }
        m2067t();
        C0448d a = m2028a(0, false);
        if (a != null && a.f935j != null) {
            a.f935j.close();
        }
    }
}
