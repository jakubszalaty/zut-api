package android.support.v7.p018d.p019a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.p003c.p004a.C0129a;

/* renamed from: android.support.v7.d.a.a */
public class C0480a extends Drawable implements Callback {
    private Drawable f1029a;

    public C0480a(Drawable drawable) {
        m2254a(drawable);
    }

    public Drawable m2253a() {
        return this.f1029a;
    }

    public void m2254a(Drawable drawable) {
        if (this.f1029a != null) {
            this.f1029a.setCallback(null);
        }
        this.f1029a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f1029a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1029a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1029a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1029a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1029a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1029a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1029a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1029a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1029a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1029a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1029a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0129a.m544b(this.f1029a);
    }

    public boolean isStateful() {
        return this.f1029a.isStateful();
    }

    public void jumpToCurrentState() {
        C0129a.m535a(this.f1029a);
    }

    protected void onBoundsChange(Rect rect) {
        this.f1029a.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f1029a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1029a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0129a.m543a(this.f1029a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1029a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1029a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1029a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1029a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0129a.m536a(this.f1029a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0129a.m538a(this.f1029a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1029a.setState(iArr);
    }

    public void setTint(int i) {
        C0129a.m537a(this.f1029a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0129a.m539a(this.f1029a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0129a.m542a(this.f1029a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1029a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
