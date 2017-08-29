package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.z */
class C0630z extends C0629y {
    private at f1860b;
    private at f1861c;

    C0630z(TextView textView) {
        super(textView);
    }

    void m3166a() {
        super.m3161a();
        if (this.f1860b != null || this.f1861c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m3163a(compoundDrawablesRelative[0], this.f1860b);
            m3163a(compoundDrawablesRelative[2], this.f1861c);
        }
    }

    void m3167a(AttributeSet attributeSet, int i) {
        super.m3164a(attributeSet, i);
        Context context = this.a.getContext();
        C0610l a = C0610l.m3109a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTextHelper_android_drawableStart)) {
            this.f1860b = C0629y.m3159a(context, a, obtainStyledAttributes.getResourceId(C0474j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0474j.AppCompatTextHelper_android_drawableEnd)) {
            this.f1861c = C0629y.m3159a(context, a, obtainStyledAttributes.getResourceId(C0474j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
