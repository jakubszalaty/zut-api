package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.v7.widget.n */
public class C0612n extends ImageButton implements ab {
    private C0601g f1808a;
    private C0613o f1809b;

    public C0612n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.imageButtonStyle);
    }

    public C0612n(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1808a = new C0601g(this);
        this.f1808a.m3084a(attributeSet, i);
        this.f1809b = new C0613o(this);
        this.f1809b.m3133a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1808a != null) {
            this.f1808a.m3087c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1808a != null ? this.f1808a.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1808a != null ? this.f1808a.m3085b() : null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1809b.m3134a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1808a != null) {
            this.f1808a.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1808a != null) {
            this.f1808a.m3080a(i);
        }
    }

    public void setImageResource(int i) {
        this.f1809b.m3132a(i);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1808a != null) {
            this.f1808a.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1808a != null) {
            this.f1808a.m3082a(mode);
        }
    }
}
