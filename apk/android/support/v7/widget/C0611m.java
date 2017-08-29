package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.m */
public class C0611m extends EditText implements ab {
    private C0601g f1806a;
    private C0629y f1807b;

    public C0611m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.editTextStyle);
    }

    public C0611m(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1806a = new C0601g(this);
        this.f1806a.m3084a(attributeSet, i);
        this.f1807b = C0629y.m3160a((TextView) this);
        this.f1807b.m3164a(attributeSet, i);
        this.f1807b.m3161a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1806a != null) {
            this.f1806a.m3087c();
        }
        if (this.f1807b != null) {
            this.f1807b.m3161a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1806a != null ? this.f1806a.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1806a != null ? this.f1806a.m3085b() : null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1806a != null) {
            this.f1806a.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1806a != null) {
            this.f1806a.m3080a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1806a != null) {
            this.f1806a.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1806a != null) {
            this.f1806a.m3082a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1807b != null) {
            this.f1807b.m3162a(context, i);
        }
    }
}
