package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.au;
import android.support.v4.p007g.az;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0469e;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0472h;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.support.v7.view.menu.C0500a;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.widget.Toolbar.C0559b;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class aw implements ac {
    Toolbar f1696a;
    CharSequence f1697b;
    Callback f1698c;
    boolean f1699d;
    private int f1700e;
    private View f1701f;
    private View f1702g;
    private Drawable f1703h;
    private Drawable f1704i;
    private Drawable f1705j;
    private boolean f1706k;
    private CharSequence f1707l;
    private CharSequence f1708m;
    private C0593d f1709n;
    private int f1710o;
    private int f1711p;
    private Drawable f1712q;

    /* renamed from: android.support.v7.widget.aw.1 */
    class C05811 implements OnClickListener {
        final C0500a f1691a;
        final /* synthetic */ aw f1692b;

        C05811(aw awVar) {
            this.f1692b = awVar;
            this.f1691a = new C0500a(this.f1692b.f1696a.getContext(), 0, 16908332, 0, 0, this.f1692b.f1697b);
        }

        public void onClick(View view) {
            if (this.f1692b.f1698c != null && this.f1692b.f1699d) {
                this.f1692b.f1698c.onMenuItemSelected(0, this.f1691a);
            }
        }
    }

    /* renamed from: android.support.v7.widget.aw.2 */
    class C05822 extends az {
        final /* synthetic */ int f1693a;
        final /* synthetic */ aw f1694b;
        private boolean f1695c;

        C05822(aw awVar, int i) {
            this.f1694b = awVar;
            this.f1693a = i;
            this.f1695c = false;
        }

        public void m2965a(View view) {
            this.f1694b.f1696a.setVisibility(0);
        }

        public void m2966b(View view) {
            if (!this.f1695c) {
                this.f1694b.f1696a.setVisibility(this.f1693a);
            }
        }

        public void m2967c(View view) {
            this.f1695c = true;
        }
    }

    public aw(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0472h.abc_action_bar_up_description, C0469e.abc_ic_ab_back_material);
    }

    public aw(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1710o = 0;
        this.f1711p = 0;
        this.f1696a = toolbar;
        this.f1697b = toolbar.getTitle();
        this.f1707l = toolbar.getSubtitle();
        this.f1706k = this.f1697b != null;
        this.f1705j = toolbar.getNavigationIcon();
        av a = av.m2947a(toolbar.getContext(), null, C0474j.ActionBar, C0465a.actionBarStyle, 0);
        this.f1712q = a.m2950a(C0474j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.m2956c(C0474j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                m2987b(c);
            }
            c = a.m2956c(C0474j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                m2991c(c);
            }
            Drawable a2 = a.m2950a(C0474j.ActionBar_logo);
            if (a2 != null) {
                m2986b(a2);
            }
            a2 = a.m2950a(C0474j.ActionBar_icon);
            if (a2 != null) {
                m2976a(a2);
            }
            if (this.f1705j == null && this.f1712q != null) {
                m2990c(this.f1712q);
            }
            m2989c(a.m2949a(C0474j.ActionBar_displayOptions, 0));
            int g = a.m2963g(C0474j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                m2980a(LayoutInflater.from(this.f1696a.getContext()).inflate(g, this.f1696a, false));
                m2989c(this.f1700e | 16);
            }
            g = a.m2961f(C0474j.ActionBar_height, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.f1696a.getLayoutParams();
                layoutParams.height = g;
                this.f1696a.setLayoutParams(layoutParams);
            }
            g = a.m2957d(C0474j.ActionBar_contentInsetStart, -1);
            int d = a.m2957d(C0474j.ActionBar_contentInsetEnd, -1);
            if (g >= 0 || d >= 0) {
                this.f1696a.m2783a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.m2963g(C0474j.ActionBar_titleTextStyle, 0);
            if (g != 0) {
                this.f1696a.m2784a(this.f1696a.getContext(), g);
            }
            g = a.m2963g(C0474j.ActionBar_subtitleTextStyle, 0);
            if (g != 0) {
                this.f1696a.m2788b(this.f1696a.getContext(), g);
            }
            int g2 = a.m2963g(C0474j.ActionBar_popupTheme, 0);
            if (g2 != 0) {
                this.f1696a.setPopupTheme(g2);
            }
        } else {
            this.f1700e = m2969s();
        }
        a.m2951a();
        m2997e(i);
        this.f1708m = this.f1696a.getNavigationContentDescription();
        this.f1696a.setNavigationOnClickListener(new C05811(this));
    }

    private void m2968e(CharSequence charSequence) {
        this.f1697b = charSequence;
        if ((this.f1700e & 8) != 0) {
            this.f1696a.setTitle(charSequence);
        }
    }

    private int m2969s() {
        if (this.f1696a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1712q = this.f1696a.getNavigationIcon();
        return 15;
    }

    private void m2970t() {
        Drawable drawable = null;
        if ((this.f1700e & 2) != 0) {
            drawable = (this.f1700e & 1) != 0 ? this.f1704i != null ? this.f1704i : this.f1703h : this.f1703h;
        }
        this.f1696a.setLogo(drawable);
    }

    private void m2971u() {
        if ((this.f1700e & 4) != 0) {
            this.f1696a.setNavigationIcon(this.f1705j != null ? this.f1705j : this.f1712q);
        } else {
            this.f1696a.setNavigationIcon(null);
        }
    }

    private void m2972v() {
        if ((this.f1700e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1708m)) {
            this.f1696a.setNavigationContentDescription(this.f1711p);
        } else {
            this.f1696a.setNavigationContentDescription(this.f1708m);
        }
    }

    public au m2973a(int i, long j) {
        return ae.m1154j(this.f1696a).m1311a(i == 0 ? 1.0f : 0.0f).m1312a(j).m1313a(new C05822(this, i));
    }

    public ViewGroup m2974a() {
        return this.f1696a;
    }

    public void m2975a(int i) {
        m2976a(i != 0 ? C0478b.m2246b(m2984b(), i) : null);
    }

    public void m2976a(Drawable drawable) {
        this.f1703h = drawable;
        m2970t();
    }

    public void m2977a(C0442a c0442a, C0425a c0425a) {
        this.f1696a.m2786a(c0442a, c0425a);
    }

    public void m2978a(ao aoVar) {
        if (this.f1701f != null && this.f1701f.getParent() == this.f1696a) {
            this.f1696a.removeView(this.f1701f);
        }
        this.f1701f = aoVar;
        if (aoVar != null && this.f1710o == 2) {
            this.f1696a.addView(this.f1701f, 0);
            C0559b c0559b = (C0559b) this.f1701f.getLayoutParams();
            c0559b.width = -2;
            c0559b.height = -2;
            c0559b.a = 8388691;
            aoVar.setAllowCollapse(true);
        }
    }

    public void m2979a(Menu menu, C0442a c0442a) {
        if (this.f1709n == null) {
            this.f1709n = new C0593d(this.f1696a.getContext());
            this.f1709n.m2365a(C0470f.action_menu_presenter);
        }
        this.f1709n.m2369a(c0442a);
        this.f1696a.m2785a((C0515h) menu, this.f1709n);
    }

    public void m2980a(View view) {
        if (!(this.f1702g == null || (this.f1700e & 16) == 0)) {
            this.f1696a.removeView(this.f1702g);
        }
        this.f1702g = view;
        if (view != null && (this.f1700e & 16) != 0) {
            this.f1696a.addView(this.f1702g);
        }
    }

    public void m2981a(Callback callback) {
        this.f1698c = callback;
    }

    public void m2982a(CharSequence charSequence) {
        if (!this.f1706k) {
            m2968e(charSequence);
        }
    }

    public void m2983a(boolean z) {
        this.f1696a.setCollapsible(z);
    }

    public Context m2984b() {
        return this.f1696a.getContext();
    }

    public void m2985b(int i) {
        m2986b(i != 0 ? C0478b.m2246b(m2984b(), i) : null);
    }

    public void m2986b(Drawable drawable) {
        this.f1704i = drawable;
        m2970t();
    }

    public void m2987b(CharSequence charSequence) {
        this.f1706k = true;
        m2968e(charSequence);
    }

    public void m2988b(boolean z) {
    }

    public void m2989c(int i) {
        int i2 = this.f1700e ^ i;
        this.f1700e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2972v();
                }
                m2971u();
            }
            if ((i2 & 3) != 0) {
                m2970t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1696a.setTitle(this.f1697b);
                    this.f1696a.setSubtitle(this.f1707l);
                } else {
                    this.f1696a.setTitle(null);
                    this.f1696a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.f1702g != null) {
                if ((i & 16) != 0) {
                    this.f1696a.addView(this.f1702g);
                } else {
                    this.f1696a.removeView(this.f1702g);
                }
            }
        }
    }

    public void m2990c(Drawable drawable) {
        this.f1705j = drawable;
        m2971u();
    }

    public void m2991c(CharSequence charSequence) {
        this.f1707l = charSequence;
        if ((this.f1700e & 8) != 0) {
            this.f1696a.setSubtitle(charSequence);
        }
    }

    public boolean m2992c() {
        return this.f1696a.m2794g();
    }

    public void m2993d() {
        this.f1696a.m2795h();
    }

    public void m2994d(int i) {
        this.f1696a.setVisibility(i);
    }

    public void m2995d(CharSequence charSequence) {
        this.f1708m = charSequence;
        m2972v();
    }

    public CharSequence m2996e() {
        return this.f1696a.getTitle();
    }

    public void m2997e(int i) {
        if (i != this.f1711p) {
            this.f1711p = i;
            if (TextUtils.isEmpty(this.f1696a.getNavigationContentDescription())) {
                m2999f(this.f1711p);
            }
        }
    }

    public void m2998f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void m2999f(int i) {
        m2995d(i == 0 ? null : m2984b().getString(i));
    }

    public void m3000g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean m3001h() {
        return this.f1696a.m2787a();
    }

    public boolean m3002i() {
        return this.f1696a.m2789b();
    }

    public boolean m3003j() {
        return this.f1696a.m2790c();
    }

    public boolean m3004k() {
        return this.f1696a.m2791d();
    }

    public boolean m3005l() {
        return this.f1696a.m2792e();
    }

    public void m3006m() {
        this.f1699d = true;
    }

    public void m3007n() {
        this.f1696a.m2793f();
    }

    public int m3008o() {
        return this.f1700e;
    }

    public int m3009p() {
        return this.f1710o;
    }

    public int m3010q() {
        return this.f1696a.getVisibility();
    }

    public Menu m3011r() {
        return this.f1696a.getMenu();
    }
}
