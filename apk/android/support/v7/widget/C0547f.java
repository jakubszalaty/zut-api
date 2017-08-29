package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.f */
public class C0547f extends AutoCompleteTextView implements ab {
    private static final int[] f1439a;
    private C0601g f1440b;
    private C0629y f1441c;

    static {
        f1439a = new int[]{16843126};
    }

    public C0547f(Context context) {
        this(context, null);
    }

    public C0547f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.autoCompleteTextViewStyle);
    }

    public C0547f(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        av a = av.m2947a(getContext(), attributeSet, f1439a, i, 0);
        if (a.m2964g(0)) {
            setDropDownBackgroundDrawable(a.m2950a(0));
        }
        a.m2951a();
        this.f1440b = new C0601g(this);
        this.f1440b.m3084a(attributeSet, i);
        this.f1441c = C0629y.m3160a((TextView) this);
        this.f1441c.m3164a(attributeSet, i);
        this.f1441c.m3161a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1440b != null) {
            this.f1440b.m3087c();
        }
        if (this.f1441c != null) {
            this.f1441c.m3161a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1440b != null ? this.f1440b.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1440b != null ? this.f1440b.m3085b() : null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1440b != null) {
            this.f1440b.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1440b != null) {
            this.f1440b.m3080a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0478b.m2246b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1440b != null) {
            this.f1440b.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1440b != null) {
            this.f1440b.m3082a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1441c != null) {
            this.f1441c.m3162a(context, i);
        }
    }
}
