package android.support.v4.p003c.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0139i.C0137a;

/* renamed from: android.support.v4.c.a.l */
class C0145l extends C0143k {

    /* renamed from: android.support.v4.c.a.l.a */
    private static class C0144a extends C0137a {
        C0144a(C0137a c0137a, Resources resources) {
            super(c0137a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0145l(this, resources);
        }
    }

    C0145l(Drawable drawable) {
        super(drawable);
    }

    C0145l(C0137a c0137a, Resources resources) {
        super(c0137a, resources);
    }

    C0137a m588b() {
        return new C0144a(this.b, null);
    }

    protected boolean m589c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (m589c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (m589c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (m589c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}
