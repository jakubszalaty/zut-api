package android.support.v4.p003c.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.c.a.i */
class C0139i extends Drawable implements Callback, C0136h, C0020m {
    static final Mode f401a;
    C0137a f402b;
    Drawable f403c;
    private int f404d;
    private Mode f405e;
    private boolean f406f;
    private boolean f407g;

    /* renamed from: android.support.v4.c.a.i.a */
    protected static abstract class C0137a extends ConstantState {
        int f397a;
        ConstantState f398b;
        ColorStateList f399c;
        Mode f400d;

        C0137a(C0137a c0137a, Resources resources) {
            this.f399c = null;
            this.f400d = C0139i.f401a;
            if (c0137a != null) {
                this.f397a = c0137a.f397a;
                this.f398b = c0137a.f398b;
                this.f399c = c0137a.f399c;
                this.f400d = c0137a.f400d;
            }
        }

        boolean m578a() {
            return this.f398b != null;
        }

        public int getChangingConfigurations() {
            return (this.f398b != null ? this.f398b.getChangingConfigurations() : 0) | this.f397a;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.c.a.i.b */
    private static class C0138b extends C0137a {
        C0138b(C0137a c0137a, Resources resources) {
            super(c0137a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0139i(this, resources);
        }
    }

    static {
        f401a = Mode.SRC_IN;
    }

    C0139i(Drawable drawable) {
        this.f402b = m584b();
        m583a(drawable);
    }

    C0139i(C0137a c0137a, Resources resources) {
        this.f402b = c0137a;
        m579a(resources);
    }

    private void m579a(Resources resources) {
        if (this.f402b != null && this.f402b.f398b != null) {
            m583a(m582a(this.f402b.f398b, resources));
        }
    }

    private boolean m580a(int[] iArr) {
        if (!m585c()) {
            return false;
        }
        ColorStateList colorStateList = this.f402b.f399c;
        Mode mode = this.f402b.f400d;
        if (colorStateList == null || mode == null) {
            this.f406f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f406f && colorForState == this.f404d && mode == this.f405e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f404d = colorForState;
        this.f405e = mode;
        this.f406f = true;
        return true;
    }

    public final Drawable m581a() {
        return this.f403c;
    }

    protected Drawable m582a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public final void m583a(Drawable drawable) {
        if (this.f403c != null) {
            this.f403c.setCallback(null);
        }
        this.f403c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f402b != null) {
                this.f402b.f398b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    C0137a m584b() {
        return new C0138b(this.f402b, null);
    }

    protected boolean m585c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f403c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return ((this.f402b != null ? this.f402b.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.f403c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f402b == null || !this.f402b.m578a()) {
            return null;
        }
        this.f402b.f397a = getChangingConfigurations();
        return this.f402b;
    }

    public Drawable getCurrent() {
        return this.f403c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f403c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f403c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f403c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f403c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f403c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f403c.getPadding(rect);
    }

    public int[] getState() {
        return this.f403c.getState();
    }

    public Region getTransparentRegion() {
        return this.f403c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!m585c() || this.f402b == null) ? null : this.f402b.f399c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f403c.isStateful();
    }

    public Drawable mutate() {
        if (!this.f407g && super.mutate() == this) {
            this.f402b = m584b();
            if (this.f403c != null) {
                this.f403c.mutate();
            }
            if (this.f402b != null) {
                this.f402b.f398b = this.f403c != null ? this.f403c.getConstantState() : null;
            }
            this.f407g = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f403c != null) {
            this.f403c.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f403c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f403c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f403c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f403c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f403c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f403c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m580a(iArr) || this.f403c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f402b.f399c = colorStateList;
        m580a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f402b.f400d = mode;
        m580a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f403c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
