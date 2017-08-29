package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.p007g.ae;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    private TypedValue f917a;
    private TypedValue f918b;
    private TypedValue f919c;
    private TypedValue f920d;
    private TypedValue f921e;
    private TypedValue f922f;
    private final Rect f923g;
    private C0437a f924h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout.a */
    public interface C0437a {
        void m2094a();

        void m2095b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f923g = new Rect();
    }

    public void m2115a(int i, int i2, int i3, int i4) {
        this.f923g.set(i, i2, i3, i4);
        if (ae.m1164t(this)) {
            requestLayout();
        }
    }

    public void m2116a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f921e == null) {
            this.f921e = new TypedValue();
        }
        return this.f921e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f922f == null) {
            this.f922f = new TypedValue();
        }
        return this.f922f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f919c == null) {
            this.f919c = new TypedValue();
        }
        return this.f919c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f920d == null) {
            this.f920d = new TypedValue();
        }
        return this.f920d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f917a == null) {
            this.f917a = new TypedValue();
        }
        return this.f917a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f918b == null) {
            this.f918b = new TypedValue();
        }
        return this.f918b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f924h != null) {
            this.f924h.m2094a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f924h != null) {
            this.f924h.m2095b();
        }
    }

    protected void onMeasure(int i, int i2) {
        TypedValue typedValue;
        int dimension;
        Object obj;
        TypedValue typedValue2;
        int dimension2;
        Object obj2 = null;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Object obj3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            typedValue = obj3 != null ? this.f920d : this.f919c;
            if (!(typedValue == null || typedValue.type == 0)) {
                dimension = typedValue.type == 5 ? (int) typedValue.getDimension(displayMetrics) : typedValue.type == 6 ? (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                if (dimension > 0) {
                    i = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f923g.left + this.f923g.right), MeasureSpec.getSize(i)), 1073741824);
                    obj = 1;
                    if (mode2 == Integer.MIN_VALUE) {
                        typedValue = obj3 == null ? this.f921e : this.f922f;
                        if (!(typedValue == null || typedValue.type == 0)) {
                            dimension = typedValue.type != 5 ? (int) typedValue.getDimension(displayMetrics) : typedValue.type != 6 ? (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels) : 0;
                            if (dimension > 0) {
                                i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f923g.top + this.f923g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                    mode2 = getMeasuredWidth();
                    dimension = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                    if (obj == null && mode == Integer.MIN_VALUE) {
                        typedValue2 = obj3 == null ? this.f918b : this.f917a;
                        if (!(typedValue2 == null || typedValue2.type == 0)) {
                            dimension2 = typedValue2.type != 5 ? (int) typedValue2.getDimension(displayMetrics) : typedValue2.type != 6 ? (int) typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                            if (dimension2 > 0) {
                                dimension2 -= this.f923g.left + this.f923g.right;
                            }
                            if (mode2 < dimension2) {
                                dimension2 = MeasureSpec.makeMeasureSpec(dimension2, 1073741824);
                                obj2 = 1;
                                if (obj2 == null) {
                                    super.onMeasure(dimension2, i2);
                                }
                            }
                        }
                    }
                    dimension2 = dimension;
                    if (obj2 == null) {
                        super.onMeasure(dimension2, i2);
                    }
                }
            }
        }
        obj = null;
        if (mode2 == Integer.MIN_VALUE) {
            if (obj3 == null) {
            }
            if (typedValue.type != 5) {
                if (typedValue.type != 6) {
                }
            }
            if (dimension > 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f923g.top + this.f923g.bottom), MeasureSpec.getSize(i2)), 1073741824);
            }
        }
        super.onMeasure(i, i2);
        mode2 = getMeasuredWidth();
        dimension = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
        if (obj3 == null) {
        }
        if (typedValue2.type != 5) {
            if (typedValue2.type != 6) {
            }
        }
        if (dimension2 > 0) {
            dimension2 -= this.f923g.left + this.f923g.right;
        }
        if (mode2 < dimension2) {
            dimension2 = MeasureSpec.makeMeasureSpec(dimension2, 1073741824);
            obj2 = 1;
            if (obj2 == null) {
                super.onMeasure(dimension2, i2);
            }
        }
        dimension2 = dimension;
        if (obj2 == null) {
            super.onMeasure(dimension2, i2);
        }
    }

    public void setAttachListener(C0437a c0437a) {
        this.f924h = c0437a;
    }
}
