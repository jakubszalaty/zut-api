package android.support.p001a.p002a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0020m;
import android.support.v4.p003c.p004a.C0129a;
import android.util.AttributeSet;

@TargetApi(21)
/* renamed from: android.support.a.a.e */
abstract class C0021e extends Drawable implements C0020m {
    Drawable f52b;

    C0021e() {
    }

    static TypedArray m4b(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void applyTheme(Theme theme) {
        if (this.f52b != null) {
            C0129a.m540a(this.f52b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f52b != null) {
            this.f52b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f52b != null ? C0129a.m548e(this.f52b) : null;
    }

    public Drawable getCurrent() {
        return this.f52b != null ? this.f52b.getCurrent() : super.getCurrent();
    }

    public int getLayoutDirection() {
        if (this.f52b != null) {
            C0129a.m550g(this.f52b);
        }
        return 0;
    }

    public int getMinimumHeight() {
        return this.f52b != null ? this.f52b.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f52b != null ? this.f52b.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f52b != null ? this.f52b.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f52b != null ? this.f52b.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f52b != null ? this.f52b.getTransparentRegion() : super.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        if (this.f52b != null) {
            C0129a.m544b(this.f52b);
        }
        return false;
    }

    public void jumpToCurrentState() {
        if (this.f52b != null) {
            C0129a.m535a(this.f52b);
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f52b != null) {
            this.f52b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f52b != null ? this.f52b.setLevel(i) : super.onLevelChange(i);
    }

    public void setAutoMirrored(boolean z) {
        if (this.f52b != null) {
            C0129a.m543a(this.f52b, z);
        }
    }

    public void setChangingConfigurations(int i) {
        if (this.f52b != null) {
            this.f52b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f52b != null) {
            this.f52b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f52b != null) {
            this.f52b.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f52b != null) {
            C0129a.m536a(this.f52b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f52b != null) {
            C0129a.m538a(this.f52b, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f52b != null ? this.f52b.setState(iArr) : super.setState(iArr);
    }
}
