package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p005b.p008a.C0105a;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout {
    private boolean f1435a;
    private int f1436b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1436b = -1;
        boolean z = C0105a.m448a(getResources()) >= 320;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ButtonBarLayout);
        this.f1435a = obtainStyledAttributes.getBoolean(C0474j.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    private boolean m2708a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0470f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        boolean z2 = false;
        int size = MeasureSpec.getSize(i);
        if (this.f1435a) {
            if (size > this.f1436b && m2708a()) {
                setStacked(false);
            }
            this.f1436b = size;
        }
        if (m2708a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1435a && !m2708a()) {
            if (VERSION.SDK_INT < 11) {
                int i4 = 0;
                for (i3 = 0; i3 < getChildCount(); i3++) {
                    i4 += getChildAt(i3).getMeasuredWidth();
                }
                if ((getPaddingLeft() + i4) + getPaddingRight() > size) {
                    z2 = true;
                }
            } else if ((ae.m1150f(this) & -16777216) == 16777216) {
                z2 = true;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1435a != z) {
            this.f1435a = z;
            if (!this.f1435a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
