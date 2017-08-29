package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0389x;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.i */
public class C0603i extends CheckBox implements C0389x {
    private C0605k f1781a;

    public C0603i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.checkboxStyle);
    }

    public C0603i(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1781a = new C0605k(this);
        this.f1781a.m3092a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f1781a != null ? this.f1781a.m3088a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        return this.f1781a != null ? this.f1781a.m3089a() : null;
    }

    public Mode getSupportButtonTintMode() {
        return this.f1781a != null ? this.f1781a.m3093b() : null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0478b.m2246b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f1781a != null) {
            this.f1781a.m3094c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f1781a != null) {
            this.f1781a.m3090a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f1781a != null) {
            this.f1781a.m3091a(mode);
        }
    }
}
