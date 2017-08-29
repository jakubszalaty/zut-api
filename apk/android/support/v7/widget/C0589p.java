package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.p */
public class C0589p extends ImageView implements ab {
    private C0601g f1722a;
    private C0613o f1723b;

    public C0589p(Context context) {
        this(context, null);
    }

    public C0589p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0589p(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1722a = new C0601g(this);
        this.f1722a.m3084a(attributeSet, i);
        this.f1723b = new C0613o(this);
        this.f1723b.m3133a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1722a != null) {
            this.f1722a.m3087c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1722a != null ? this.f1722a.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1722a != null ? this.f1722a.m3085b() : null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1723b.m3134a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1722a != null) {
            this.f1722a.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1722a != null) {
            this.f1722a.m3080a(i);
        }
    }

    public void setImageResource(int i) {
        this.f1723b.m3132a(i);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1722a != null) {
            this.f1722a.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1722a != null) {
            this.f1722a.m3082a(mode);
        }
    }
}
