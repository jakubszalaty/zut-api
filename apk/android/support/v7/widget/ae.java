package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.au;
import android.support.v4.widget.C0373m;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0474j;
import android.view.MotionEvent;
import android.view.View;

class ae extends aj {
    private boolean f1567g;
    private boolean f1568h;
    private boolean f1569i;
    private au f1570j;
    private C0373m f1571k;

    public ae(Context context, boolean z) {
        super(context, null, C0465a.dropDownListViewStyle);
        this.f1568h = z;
        setCacheColorHint(0);
    }

    private void m2849a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void m2850a(View view, int i, float f, float f2) {
        this.f1569i = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f != -1) {
            View childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2843a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void m2851d() {
        this.f1569i = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f1570j != null) {
            this.f1570j.m1318b();
            this.f1570j = null;
        }
    }

    protected boolean m2852a() {
        return this.f1569i || super.m2845a();
    }

    public boolean m2853a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int a = C0324t.m1535a(motionEvent);
        switch (a) {
            case C0474j.View_android_focusable /*1*/:
                z = false;
                break;
            case C0474j.View_paddingStart /*2*/:
                z = true;
                break;
            case C0474j.View_paddingEnd /*3*/:
                z = false;
                z2 = false;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            findPointerIndex = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, findPointerIndex);
            if (pointToPosition == -1) {
                z2 = z;
                z = true;
            } else {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m2850a(childAt, pointToPosition, (float) x, (float) findPointerIndex);
                if (a == 1) {
                    m2849a(childAt, pointToPosition);
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || r0) {
            m2851d();
        }
        if (z2) {
            if (this.f1571k == null) {
                this.f1571k = new C0373m(this);
            }
            this.f1571k.m1711a(true);
            this.f1571k.onTouch(this, motionEvent);
        } else if (this.f1571k != null) {
            this.f1571k.m1711a(false);
        }
        return z2;
    }

    public boolean hasFocus() {
        return this.f1568h || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1568h || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1568h || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1568h && this.f1567g) || super.isInTouchMode();
    }

    void setListSelectionHidden(boolean z) {
        this.f1567g = z;
    }
}
