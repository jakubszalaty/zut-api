package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.ab;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.h */
public class C0602h extends Button implements ab {
    private final C0601g f1779a;
    private final C0629y f1780b;

    public C0602h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.buttonStyle);
    }

    public C0602h(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1779a = new C0601g(this);
        this.f1779a.m3084a(attributeSet, i);
        this.f1780b = C0629y.m3160a((TextView) this);
        this.f1780b.m3164a(attributeSet, i);
        this.f1780b.m3161a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1779a != null) {
            this.f1779a.m3087c();
        }
        if (this.f1780b != null) {
            this.f1780b.m3161a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1779a != null ? this.f1779a.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1779a != null ? this.f1779a.m3085b() : null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1779a != null) {
            this.f1779a.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1779a != null) {
            this.f1779a.m3080a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f1780b != null) {
            this.f1780b.m3165a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1779a != null) {
            this.f1779a.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1779a != null) {
            this.f1779a.m3082a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1780b != null) {
            this.f1780b.m3162a(context, i);
        }
    }
}
