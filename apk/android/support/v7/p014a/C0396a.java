package android.support.v7.p014a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.a.a */
public abstract class C0396a {

    /* renamed from: android.support.v7.a.a.a */
    public static class C0393a extends MarginLayoutParams {
        public int f730a;

        public C0393a(int i, int i2) {
            super(i, i2);
            this.f730a = 0;
            this.f730a = 8388627;
        }

        public C0393a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f730a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ActionBarLayout);
            this.f730a = obtainStyledAttributes.getInt(C0474j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0393a(C0393a c0393a) {
            super(c0393a);
            this.f730a = 0;
            this.f730a = c0393a.f730a;
        }

        public C0393a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f730a = 0;
        }
    }

    /* renamed from: android.support.v7.a.a.b */
    public interface C0394b {
        void m1880a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.a.a.c */
    public static abstract class C0395c {
        public abstract Drawable m1881a();

        public abstract CharSequence m1882b();

        public abstract View m1883c();

        public abstract void m1884d();

        public abstract CharSequence m1885e();
    }

    public abstract int m1886a();

    public C0461b m1887a(C0445a c0445a) {
        return null;
    }

    public void m1888a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void m1889a(Configuration configuration) {
    }

    public void m1890a(CharSequence charSequence) {
    }

    public void m1891a(boolean z) {
    }

    public boolean m1892a(int i, KeyEvent keyEvent) {
        return false;
    }

    public void m1893b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public abstract boolean m1894b();

    public Context m1895c() {
        return null;
    }

    public void m1896c(boolean z) {
    }

    public int m1897d() {
        return 0;
    }

    public void m1898d(boolean z) {
    }

    public void m1899e(boolean z) {
    }

    public boolean m1900e() {
        return false;
    }

    public boolean m1901f() {
        return false;
    }

    boolean m1902g() {
        return false;
    }

    void m1903h() {
    }
}
