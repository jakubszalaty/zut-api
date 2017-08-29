package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.g */
class C0601g {
    private final View f1773a;
    private final C0610l f1774b;
    private int f1775c;
    private C0600a f1776d;
    private C0600a f1777e;
    private C0600a f1778f;

    /* renamed from: android.support.v7.widget.g.a */
    private static class C0600a extends at {
        public ColorStateList f1772a;

        C0600a() {
        }

        void m3076a() {
            super.m2944a();
            this.f1772a = null;
        }
    }

    C0601g(View view) {
        this.f1775c = -1;
        this.f1773a = view;
        this.f1774b = C0610l.m3109a();
    }

    private boolean m3077b(Drawable drawable) {
        if (this.f1778f == null) {
            this.f1778f = new C0600a();
        }
        at atVar = this.f1778f;
        atVar.m2944a();
        ColorStateList q = ae.m1161q(this.f1773a);
        if (q != null) {
            atVar.f1687e = true;
            atVar.f1684b = q;
        }
        Mode r = ae.m1162r(this.f1773a);
        if (r != null) {
            atVar.f1686d = true;
            atVar.f1685c = r;
        }
        if (!atVar.f1687e && !atVar.f1686d) {
            return false;
        }
        C0610l.m3111a(drawable, atVar, this.f1773a.getDrawableState());
        return true;
    }

    private boolean m3078d() {
        if (this.f1777e != null && this.f1777e.e) {
            if (this.f1775c >= 0) {
                ColorStateList a = this.f1774b.m3126a(this.f1773a.getContext(), this.f1775c, this.f1777e.f1772a);
                if (a != null) {
                    this.f1777e.b = a;
                    return true;
                }
            }
            if (this.f1777e.b != this.f1777e.f1772a) {
                this.f1777e.b = this.f1777e.f1772a;
                return true;
            }
        }
        return false;
    }

    ColorStateList m3079a() {
        return this.f1777e != null ? this.f1777e.b : null;
    }

    void m3080a(int i) {
        this.f1775c = i;
        m3086b(this.f1774b != null ? this.f1774b.m3131b(this.f1773a.getContext(), i) : null);
        if (m3078d()) {
            m3087c();
        }
    }

    void m3081a(ColorStateList colorStateList) {
        if (this.f1777e == null) {
            this.f1777e = new C0600a();
        }
        this.f1777e.f1772a = colorStateList;
        this.f1777e.b = null;
        this.f1777e.e = true;
        if (m3078d()) {
            m3087c();
        }
    }

    void m3082a(Mode mode) {
        if (this.f1777e == null) {
            this.f1777e = new C0600a();
        }
        this.f1777e.c = mode;
        this.f1777e.d = true;
        m3087c();
    }

    void m3083a(Drawable drawable) {
        this.f1775c = -1;
        m3086b(null);
        if (m3078d()) {
            m3087c();
        }
    }

    void m3084a(AttributeSet attributeSet, int i) {
        av a = av.m2947a(this.f1773a.getContext(), attributeSet, C0474j.ViewBackgroundHelper, i, 0);
        try {
            if (a.m2964g(C0474j.ViewBackgroundHelper_android_background)) {
                this.f1775c = a.m2963g(C0474j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1774b.m3131b(this.f1773a.getContext(), this.f1775c);
                if (b != null) {
                    m3086b(b);
                }
            }
            if (a.m2964g(C0474j.ViewBackgroundHelper_backgroundTint)) {
                ae.m1132a(this.f1773a, a.m2960e(C0474j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m2964g(C0474j.ViewBackgroundHelper_backgroundTintMode)) {
                ae.m1133a(this.f1773a, ad.m2837a(a.m2949a(C0474j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            a.m2951a();
        } catch (Throwable th) {
            a.m2951a();
        }
    }

    Mode m3085b() {
        return this.f1777e != null ? this.f1777e.c : null;
    }

    void m3086b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1776d == null) {
                this.f1776d = new C0600a();
            }
            this.f1776d.b = colorStateList;
            this.f1776d.e = true;
        } else {
            this.f1776d = null;
        }
        m3087c();
    }

    void m3087c() {
        Drawable background = this.f1773a.getBackground();
        if (background == null) {
            return;
        }
        if (VERSION.SDK_INT != 21 || !m3077b(background)) {
            if (this.f1777e != null) {
                C0610l.m3111a(background, this.f1777e, this.f1773a.getDrawableState());
            } else if (this.f1776d != null) {
                C0610l.m3111a(background, this.f1776d, this.f1773a.getDrawableState());
            }
        }
    }
}
