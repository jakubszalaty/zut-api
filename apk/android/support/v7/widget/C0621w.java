package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
class C0621w extends C0617s {
    private final SeekBar f1825a;
    private Drawable f1826b;
    private ColorStateList f1827c;
    private Mode f1828d;
    private boolean f1829e;
    private boolean f1830f;

    C0621w(SeekBar seekBar) {
        super(seekBar);
        this.f1827c = null;
        this.f1828d = null;
        this.f1829e = false;
        this.f1830f = false;
        this.f1825a = seekBar;
    }

    private void m3143d() {
        if (this.f1826b == null) {
            return;
        }
        if (this.f1829e || this.f1830f) {
            this.f1826b = C0129a.m549f(this.f1826b.mutate());
            if (this.f1829e) {
                C0129a.m539a(this.f1826b, this.f1827c);
            }
            if (this.f1830f) {
                C0129a.m542a(this.f1826b, this.f1828d);
            }
            if (this.f1826b.isStateful()) {
                this.f1826b.setState(this.f1825a.getDrawableState());
            }
        }
    }

    void m3144a(Canvas canvas) {
        int i = 1;
        if (this.f1826b != null) {
            int max = this.f1825a.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1826b.getIntrinsicWidth();
                int intrinsicHeight = this.f1826b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1826b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.f1825a.getWidth() - this.f1825a.getPaddingLeft()) - this.f1825a.getPaddingRight())) / ((float) max);
                intrinsicHeight = canvas.save();
                canvas.translate((float) this.f1825a.getPaddingLeft(), (float) (this.f1825a.getHeight() / 2));
                for (i = 0; i <= max; i++) {
                    this.f1826b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicHeight);
            }
        }
    }

    void m3145a(Drawable drawable) {
        if (this.f1826b != null) {
            this.f1826b.setCallback(null);
        }
        this.f1826b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1825a);
            C0129a.m545b(drawable, ae.m1147d(this.f1825a));
            if (drawable.isStateful()) {
                drawable.setState(this.f1825a.getDrawableState());
            }
            m3143d();
        }
        this.f1825a.invalidate();
    }

    void m3146a(AttributeSet attributeSet, int i) {
        super.m3142a(attributeSet, i);
        av a = av.m2947a(this.f1825a.getContext(), attributeSet, C0474j.AppCompatSeekBar, i, 0);
        Drawable b = a.m2954b(C0474j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f1825a.setThumb(b);
        }
        m3145a(a.m2950a(C0474j.AppCompatSeekBar_tickMark));
        if (a.m2964g(C0474j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1828d = ad.m2837a(a.m2949a(C0474j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1828d);
            this.f1830f = true;
        }
        if (a.m2964g(C0474j.AppCompatSeekBar_tickMarkTint)) {
            this.f1827c = a.m2960e(C0474j.AppCompatSeekBar_tickMarkTint);
            this.f1829e = true;
        }
        a.m2951a();
        m3143d();
    }

    void m3147b() {
        if (this.f1826b != null) {
            this.f1826b.jumpToCurrentState();
        }
    }

    void m3148c() {
        Drawable drawable = this.f1826b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1825a.getDrawableState())) {
            this.f1825a.invalidateDrawable(drawable);
        }
    }
}
