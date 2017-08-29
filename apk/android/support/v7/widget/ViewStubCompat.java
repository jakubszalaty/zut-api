package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    private int f1548a;
    private int f1549b;
    private WeakReference<View> f1550c;
    private LayoutInflater f1551d;
    private C0563a f1552e;

    /* renamed from: android.support.v7.widget.ViewStubCompat.a */
    public interface C0563a {
        void m2800a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1548a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ViewStubCompat, i, 0);
        this.f1549b = obtainStyledAttributes.getResourceId(C0474j.ViewStubCompat_android_inflatedId, -1);
        this.f1548a = obtainStyledAttributes.getResourceId(C0474j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0474j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View m2801a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1548a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f1551d != null ? this.f1551d : LayoutInflater.from(getContext())).inflate(this.f1548a, viewGroup, false);
            if (this.f1549b != -1) {
                inflate.setId(this.f1549b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1550c = new WeakReference(inflate);
            if (this.f1552e != null) {
                this.f1552e.m2800a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1549b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1551d;
    }

    public int getLayoutResource() {
        return this.f1548a;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1549b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1551d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1548a = i;
    }

    public void setOnInflateListener(C0563a c0563a) {
        this.f1552e = c0563a;
    }

    public void setVisibility(int i) {
        if (this.f1550c != null) {
            View view = (View) this.f1550c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m2801a();
        }
    }
}
