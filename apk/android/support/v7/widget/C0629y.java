package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p020e.C0481a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.y */
class C0629y {
    final TextView f1855a;
    private at f1856b;
    private at f1857c;
    private at f1858d;
    private at f1859e;

    C0629y(TextView textView) {
        this.f1855a = textView;
    }

    protected static at m3159a(Context context, C0610l c0610l, int i) {
        ColorStateList b = c0610l.m3131b(context, i);
        if (b == null) {
            return null;
        }
        at atVar = new at();
        atVar.f1687e = true;
        atVar.f1684b = b;
        return atVar;
    }

    static C0629y m3160a(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new C0630z(textView) : new C0629y(textView);
    }

    void m3161a() {
        if (this.f1856b != null || this.f1857c != null || this.f1858d != null || this.f1859e != null) {
            Drawable[] compoundDrawables = this.f1855a.getCompoundDrawables();
            m3163a(compoundDrawables[0], this.f1856b);
            m3163a(compoundDrawables[1], this.f1857c);
            m3163a(compoundDrawables[2], this.f1858d);
            m3163a(compoundDrawables[3], this.f1859e);
        }
    }

    void m3162a(Context context, int i) {
        av a = av.m2945a(context, i, C0474j.TextAppearance);
        if (a.m2964g(C0474j.TextAppearance_textAllCaps)) {
            m3165a(a.m2952a(C0474j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.m2964g(C0474j.TextAppearance_android_textColor)) {
            ColorStateList e = a.m2960e(C0474j.TextAppearance_android_textColor);
            if (e != null) {
                this.f1855a.setTextColor(e);
            }
        }
        a.m2951a();
    }

    final void m3163a(Drawable drawable, at atVar) {
        if (drawable != null && atVar != null) {
            C0610l.m3111a(drawable, atVar, this.f1855a.getDrawableState());
        }
    }

    void m3164a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        Context context = this.f1855a.getContext();
        C0610l a = C0610l.m3109a();
        av a2 = av.m2947a(context, attributeSet, C0474j.AppCompatTextHelper, i, 0);
        int g = a2.m2963g(C0474j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.m2964g(C0474j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1856b = C0629y.m3159a(context, a, a2.m2963g(C0474j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.m2964g(C0474j.AppCompatTextHelper_android_drawableTop)) {
            this.f1857c = C0629y.m3159a(context, a, a2.m2963g(C0474j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.m2964g(C0474j.AppCompatTextHelper_android_drawableRight)) {
            this.f1858d = C0629y.m3159a(context, a, a2.m2963g(C0474j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.m2964g(C0474j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1859e = C0629y.m3159a(context, a, a2.m2963g(C0474j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.m2951a();
        boolean z3 = this.f1855a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        if (g != -1) {
            av a3 = av.m2945a(context, g, C0474j.TextAppearance);
            if (z3 || !a3.m2964g(C0474j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.m2952a(C0474j.TextAppearance_textAllCaps, false);
                z = true;
            }
            if (VERSION.SDK_INT < 23 && a3.m2964g(C0474j.TextAppearance_android_textColor)) {
                colorStateList = a3.m2960e(C0474j.TextAppearance_android_textColor);
            }
            a3.m2951a();
        } else {
            z = false;
            z2 = false;
        }
        av a4 = av.m2947a(context, attributeSet, C0474j.TextAppearance, i, 0);
        if (!z3 && a4.m2964g(C0474j.TextAppearance_textAllCaps)) {
            z2 = a4.m2952a(C0474j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23 && a4.m2964g(C0474j.TextAppearance_android_textColor)) {
            colorStateList = a4.m2960e(C0474j.TextAppearance_android_textColor);
        }
        a4.m2951a();
        if (colorStateList != null) {
            this.f1855a.setTextColor(colorStateList);
        }
        if (!z3 && r0) {
            m3165a(z2);
        }
    }

    void m3165a(boolean z) {
        this.f1855a.setTransformationMethod(z ? new C0481a(this.f1855a.getContext()) : null);
    }
}
