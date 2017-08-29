package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.util.AttributeSet;
import android.widget.TextView;

public class aa extends TextView implements ab {
    private C0601g f1102a;
    private C0629y f1103b;

    public aa(Context context) {
        this(context, null);
    }

    public aa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public aa(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1102a = new C0601g(this);
        this.f1102a.m3084a(attributeSet, i);
        this.f1103b = C0629y.m3160a((TextView) this);
        this.f1103b.m3164a(attributeSet, i);
        this.f1103b.m3161a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1102a != null) {
            this.f1102a.m3087c();
        }
        if (this.f1103b != null) {
            this.f1103b.m3161a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1102a != null ? this.f1102a.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1102a != null ? this.f1102a.m3085b() : null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1102a != null) {
            this.f1102a.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1102a != null) {
            this.f1102a.m3080a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1102a != null) {
            this.f1102a.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1102a != null) {
            this.f1102a.m3082a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1103b != null) {
            this.f1103b.m3162a(context, i);
        }
    }
}
