package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.widget.C0355b;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.k */
class C0605k {
    private final CompoundButton f1784a;
    private ColorStateList f1785b;
    private Mode f1786c;
    private boolean f1787d;
    private boolean f1788e;
    private boolean f1789f;

    C0605k(CompoundButton compoundButton) {
        this.f1785b = null;
        this.f1786c = null;
        this.f1787d = false;
        this.f1788e = false;
        this.f1784a = compoundButton;
    }

    int m3088a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0355b.m1733a(this.f1784a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    ColorStateList m3089a() {
        return this.f1785b;
    }

    void m3090a(ColorStateList colorStateList) {
        this.f1785b = colorStateList;
        this.f1787d = true;
        m3095d();
    }

    void m3091a(Mode mode) {
        this.f1786c = mode;
        this.f1788e = true;
        m3095d();
    }

    void m3092a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1784a.getContext().obtainStyledAttributes(attributeSet, C0474j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0474j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0474j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f1784a.setButtonDrawable(C0478b.m2246b(this.f1784a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0474j.CompoundButton_buttonTint)) {
                C0355b.m1734a(this.f1784a, obtainStyledAttributes.getColorStateList(C0474j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0474j.CompoundButton_buttonTintMode)) {
                C0355b.m1735a(this.f1784a, ad.m2837a(obtainStyledAttributes.getInt(C0474j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    Mode m3093b() {
        return this.f1786c;
    }

    void m3094c() {
        if (this.f1789f) {
            this.f1789f = false;
            return;
        }
        this.f1789f = true;
        m3095d();
    }

    void m3095d() {
        Drawable a = C0355b.m1733a(this.f1784a);
        if (a == null) {
            return;
        }
        if (this.f1787d || this.f1788e) {
            a = C0129a.m549f(a).mutate();
            if (this.f1787d) {
                C0129a.m539a(a, this.f1785b);
            }
            if (this.f1788e) {
                C0129a.m542a(a, this.f1786c);
            }
            if (a.isStateful()) {
                a.setState(this.f1784a.getDrawableState());
            }
            this.f1784a.setButtonDrawable(a);
        }
    }
}
