package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class ah extends ViewGroup {
    private boolean f1384a;
    private int f1385b;
    private int f1386c;
    private int f1387d;
    private int f1388e;
    private int f1389f;
    private float f1390g;
    private boolean f1391h;
    private int[] f1392i;
    private int[] f1393j;
    private Drawable f1394k;
    private int f1395l;
    private int f1396m;
    private int f1397n;
    private int f1398o;

    /* renamed from: android.support.v7.widget.ah.a */
    public static class C0541a extends MarginLayoutParams {
        public float f1375g;
        public int f1376h;

        public C0541a(int i, int i2) {
            super(i, i2);
            this.f1376h = -1;
            this.f1375g = 0.0f;
        }

        public C0541a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1376h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.LinearLayoutCompat_Layout);
            this.f1375g = obtainStyledAttributes.getFloat(C0474j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1376h = obtainStyledAttributes.getInt(C0474j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0541a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1376h = -1;
        }
    }

    public ah(Context context) {
        this(context, null);
    }

    public ah(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ah(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1384a = true;
        this.f1385b = -1;
        this.f1386c = 0;
        this.f1388e = 8388659;
        av a = av.m2947a(context, attributeSet, C0474j.LinearLayoutCompat, i, 0);
        int a2 = a.m2949a(C0474j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        a2 = a.m2949a(C0474j.LinearLayoutCompat_android_gravity, -1);
        if (a2 >= 0) {
            setGravity(a2);
        }
        boolean a3 = a.m2952a(C0474j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.f1390g = a.m2948a(C0474j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1385b = a.m2949a(C0474j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1391h = a.m2952a(C0474j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m2950a(C0474j.LinearLayoutCompat_divider));
        this.f1397n = a.m2949a(C0474j.LinearLayoutCompat_showDividers, 0);
        this.f1398o = a.m2959e(C0474j.LinearLayoutCompat_dividerPadding, 0);
        a.m2951a();
    }

    private void m2653a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    private void m2654c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m2666b(i3);
            if (b.getVisibility() != 8) {
                C0541a c0541a = (C0541a) b.getLayoutParams();
                if (c0541a.width == -1) {
                    int i4 = c0541a.height;
                    c0541a.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    c0541a.height = i4;
                }
            }
        }
    }

    private void m2655d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m2666b(i3);
            if (b.getVisibility() != 8) {
                C0541a c0541a = (C0541a) b.getLayoutParams();
                if (c0541a.height == -1) {
                    int i4 = c0541a.width;
                    c0541a.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    c0541a.width = i4;
                }
            }
        }
    }

    int m2656a(View view) {
        return 0;
    }

    int m2657a(View view, int i) {
        return 0;
    }

    void m2658a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        View b;
        this.f1389f = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        int i10 = this.f1385b;
        boolean z = this.f1391h;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < virtualChildCount) {
            Object obj4;
            Object obj5;
            int i13;
            View b2 = m2666b(i12);
            if (b2 == null) {
                this.f1389f += m2672d(i12);
                i3 = i11;
                obj4 = obj3;
                obj5 = obj;
                i4 = i7;
                i13 = i6;
            } else if (b2.getVisibility() == 8) {
                i12 += m2657a(b2, i12);
                i3 = i11;
                obj4 = obj3;
                obj5 = obj;
                i4 = i7;
                i13 = i6;
            } else {
                if (m2671c(i12)) {
                    this.f1389f += this.f1396m;
                }
                C0541a c0541a = (C0541a) b2.getLayoutParams();
                float f2 = f + c0541a.f1375g;
                if (mode2 == 1073741824 && c0541a.height == 0 && c0541a.f1375g > 0.0f) {
                    i3 = this.f1389f;
                    this.f1389f = Math.max(i3, (c0541a.topMargin + i3) + c0541a.bottomMargin);
                    obj3 = 1;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (c0541a.height == 0 && c0541a.f1375g > 0.0f) {
                        i3 = 0;
                        c0541a.height = -2;
                    }
                    int i14 = i3;
                    m2662a(b2, i12, i, 0, i2, f2 == 0.0f ? this.f1389f : 0);
                    if (i14 != Integer.MIN_VALUE) {
                        c0541a.height = i14;
                    }
                    i3 = b2.getMeasuredHeight();
                    int i15 = this.f1389f;
                    this.f1389f = Math.max(i15, (((i15 + i3) + c0541a.topMargin) + c0541a.bottomMargin) + m2663b(b2));
                    if (z) {
                        i11 = Math.max(i3, i11);
                    }
                }
                if (i10 >= 0 && i10 == i12 + 1) {
                    this.f1386c = this.f1389f;
                }
                if (i12 >= i10 || c0541a.f1375g <= 0.0f) {
                    Object obj6;
                    Object obj7 = null;
                    if (mode == 1073741824 || c0541a.width != -1) {
                        obj6 = obj2;
                    } else {
                        obj6 = 1;
                        obj7 = 1;
                    }
                    i4 = c0541a.rightMargin + c0541a.leftMargin;
                    i13 = b2.getMeasuredWidth() + i4;
                    i6 = Math.max(i6, i13);
                    int a = ay.m3014a(i7, ae.m1151g(b2));
                    obj5 = (obj == null || c0541a.width != -1) ? null : 1;
                    if (c0541a.f1375g > 0.0f) {
                        i3 = Math.max(i9, obj7 != null ? i4 : i13);
                        i4 = i8;
                    } else {
                        if (obj7 == null) {
                            i4 = i13;
                        }
                        i4 = Math.max(i8, i4);
                        i3 = i9;
                    }
                    i12 += m2657a(b2, i12);
                    obj4 = obj3;
                    i9 = i3;
                    i8 = i4;
                    i13 = i6;
                    i3 = i11;
                    i4 = a;
                    obj2 = obj6;
                    f = f2;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i12++;
            i11 = i3;
            obj3 = obj4;
            obj = obj5;
            i7 = i4;
            i6 = i13;
        }
        if (this.f1389f > 0 && m2671c(virtualChildCount)) {
            this.f1389f += this.f1396m;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f1389f = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                b = m2666b(i5);
                if (b == null) {
                    this.f1389f += m2672d(i5);
                    i3 = i5;
                } else if (b.getVisibility() == 8) {
                    i3 = m2657a(b, i5) + i5;
                } else {
                    C0541a c0541a2 = (C0541a) b.getLayoutParams();
                    int i16 = this.f1389f;
                    this.f1389f = Math.max(i16, (c0541a2.bottomMargin + ((i16 + i11) + c0541a2.topMargin)) + m2663b(b));
                    i3 = i5;
                }
                i5 = i3 + 1;
            }
        }
        this.f1389f += getPaddingTop() + getPaddingBottom();
        int a2 = ae.m1126a(Math.max(this.f1389f, getSuggestedMinimumHeight()), i2, 0);
        i5 = (16777215 & a2) - this.f1389f;
        int i17;
        if (obj3 != null || (i5 != 0 && f > 0.0f)) {
            if (this.f1390g > 0.0f) {
                f = this.f1390g;
            }
            this.f1389f = 0;
            i11 = 0;
            float f3 = f;
            Object obj8 = obj;
            i17 = i8;
            i16 = i7;
            i9 = i6;
            i15 = i5;
            while (i11 < virtualChildCount) {
                View b3 = m2666b(i11);
                if (b3.getVisibility() == 8) {
                    i3 = i17;
                    i5 = i16;
                    i4 = i9;
                    obj5 = obj8;
                } else {
                    float f4;
                    float f5;
                    c0541a2 = (C0541a) b3.getLayoutParams();
                    float f6 = c0541a2.f1375g;
                    if (f6 > 0.0f) {
                        i5 = (int) ((((float) i15) * f6) / f3);
                        f3 -= f6;
                        i15 -= i5;
                        i4 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + c0541a2.leftMargin) + c0541a2.rightMargin, c0541a2.width);
                        if (c0541a2.height == 0 && mode2 == 1073741824) {
                            if (i5 <= 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        } else {
                            i5 += b3.getMeasuredHeight();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        }
                        f4 = f3;
                        i12 = i15;
                        i15 = ay.m3014a(i16, ae.m1151g(b3) & -256);
                        f5 = f4;
                    } else {
                        f5 = f3;
                        i12 = i15;
                        i15 = i16;
                    }
                    i16 = c0541a2.leftMargin + c0541a2.rightMargin;
                    i4 = b3.getMeasuredWidth() + i16;
                    i9 = Math.max(i9, i4);
                    Object obj9 = (mode == 1073741824 || c0541a2.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i16 = i4;
                    }
                    i4 = Math.max(i17, i16);
                    obj5 = (obj8 == null || c0541a2.width != -1) ? null : 1;
                    i13 = this.f1389f;
                    this.f1389f = Math.max(i13, (c0541a2.bottomMargin + ((b3.getMeasuredHeight() + i13) + c0541a2.topMargin)) + m2663b(b3));
                    i3 = i4;
                    i4 = i9;
                    f4 = f5;
                    i5 = i15;
                    i15 = i12;
                    f3 = f4;
                }
                i11++;
                i17 = i3;
                i9 = i4;
                obj8 = obj5;
                i16 = i5;
            }
            this.f1389f += getPaddingTop() + getPaddingBottom();
            obj = obj8;
            i3 = i17;
            i7 = i16;
            i5 = i9;
        } else {
            i17 = Math.max(i8, i9);
            if (z && mode2 != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    b = m2666b(i5);
                    if (!(b == null || b.getVisibility() == 8 || ((C0541a) b.getLayoutParams()).f1375g <= 0.0f)) {
                        b.measure(MeasureSpec.makeMeasureSpec(b.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                }
            }
            i3 = i17;
            i5 = i6;
        }
        if (obj != null || mode == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension(ae.m1126a(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i7), a2);
        if (obj2 != null) {
            m2654c(virtualChildCount, i2);
        }
    }

    void m2659a(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.f1388e & 8388615;
        switch (this.f1388e & C0474j.AppCompatTheme_spinnerStyle) {
            case C0474j.Toolbar_titleMarginEnd /*16*/:
                i5 = getPaddingTop() + (((i4 - i2) - this.f1389f) / 2);
                break;
            case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                i5 = ((getPaddingTop() + i4) - i2) - this.f1389f;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View b = m2666b(i7);
            if (b == null) {
                i8 += m2672d(i7);
                i5 = i7;
            } else if (b.getVisibility() != 8) {
                int i9;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0541a c0541a = (C0541a) b.getLayoutParams();
                i5 = c0541a.f1376h;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (C0290f.m1466a(i5, ae.m1147d(this)) & 7) {
                    case C0474j.View_android_focusable /*1*/:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + c0541a.leftMargin) - c0541a.rightMargin;
                        break;
                    case C0474j.Toolbar_contentInsetStart /*5*/:
                        i9 = (paddingRight - measuredWidth) - c0541a.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + c0541a.leftMargin;
                        break;
                }
                int i10 = (m2671c(i7) ? this.f1396m + i8 : i8) + c0541a.topMargin;
                m2653a(b, i9, i10 + m2656a(b), measuredWidth, measuredHeight);
                i8 = i10 + ((c0541a.bottomMargin + measuredHeight) + m2663b(b));
                i5 = m2657a(b, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    void m2660a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View b = m2666b(i);
            if (!(b == null || b.getVisibility() == 8 || !m2671c(i))) {
                m2661a(canvas, (b.getTop() - ((C0541a) b.getLayoutParams()).topMargin) - this.f1396m);
            }
            i++;
        }
        if (m2671c(virtualChildCount)) {
            int height;
            View b2 = m2666b(virtualChildCount - 1);
            if (b2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.f1396m;
            } else {
                C0541a c0541a = (C0541a) b2.getLayoutParams();
                height = c0541a.bottomMargin + b2.getBottom();
            }
            m2661a(canvas, height);
        }
    }

    void m2661a(Canvas canvas, int i) {
        this.f1394k.setBounds(getPaddingLeft() + this.f1398o, i, (getWidth() - getPaddingRight()) - this.f1398o, this.f1396m + i);
        this.f1394k.draw(canvas);
    }

    void m2662a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int m2663b(View view) {
        return 0;
    }

    public C0541a m2664b(AttributeSet attributeSet) {
        return new C0541a(getContext(), attributeSet);
    }

    protected C0541a m2665b(LayoutParams layoutParams) {
        return new C0541a(layoutParams);
    }

    View m2666b(int i) {
        return getChildAt(i);
    }

    void m2667b(int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        C0541a c0541a;
        this.f1389f = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj2 = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        if (this.f1392i == null || this.f1393j == null) {
            this.f1392i = new int[4];
            this.f1393j = new int[4];
        }
        int[] iArr = this.f1392i;
        int[] iArr2 = this.f1393j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.f1384a;
        boolean z2 = this.f1391h;
        Object obj5 = mode == 1073741824 ? 1 : null;
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        while (i11 < virtualChildCount) {
            Object obj6;
            int i12;
            View b = m2666b(i11);
            if (b == null) {
                this.f1389f += m2672d(i11);
                i3 = i10;
                obj = obj4;
                obj6 = obj2;
                i4 = i7;
                i12 = i6;
            } else if (b.getVisibility() == 8) {
                i11 += m2657a(b, i11);
                i3 = i10;
                obj = obj4;
                obj6 = obj2;
                i4 = i7;
                i12 = i6;
            } else {
                Object obj7;
                if (m2671c(i11)) {
                    this.f1389f += this.f1395l;
                }
                C0541a c0541a2 = (C0541a) b.getLayoutParams();
                float f2 = f + c0541a2.f1375g;
                if (mode == 1073741824 && c0541a2.width == 0 && c0541a2.f1375g > 0.0f) {
                    if (obj5 != null) {
                        this.f1389f += c0541a2.leftMargin + c0541a2.rightMargin;
                    } else {
                        i3 = this.f1389f;
                        this.f1389f = Math.max(i3, (c0541a2.leftMargin + i3) + c0541a2.rightMargin);
                    }
                    if (z) {
                        i3 = MeasureSpec.makeMeasureSpec(0, 0);
                        b.measure(i3, i3);
                    } else {
                        obj4 = 1;
                    }
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (c0541a2.width == 0 && c0541a2.f1375g > 0.0f) {
                        i3 = 0;
                        c0541a2.width = -2;
                    }
                    int i13 = i3;
                    m2662a(b, i11, i, f2 == 0.0f ? this.f1389f : 0, i2, 0);
                    if (i13 != Integer.MIN_VALUE) {
                        c0541a2.width = i13;
                    }
                    i3 = b.getMeasuredWidth();
                    if (obj5 != null) {
                        this.f1389f += ((c0541a2.leftMargin + i3) + c0541a2.rightMargin) + m2663b(b);
                    } else {
                        int i14 = this.f1389f;
                        this.f1389f = Math.max(i14, (((i14 + i3) + c0541a2.leftMargin) + c0541a2.rightMargin) + m2663b(b));
                    }
                    if (z2) {
                        i10 = Math.max(i3, i10);
                    }
                }
                Object obj8 = null;
                if (mode2 == 1073741824 || c0541a2.height != -1) {
                    obj7 = obj3;
                } else {
                    obj7 = 1;
                    obj8 = 1;
                }
                i4 = c0541a2.bottomMargin + c0541a2.topMargin;
                i12 = b.getMeasuredHeight() + i4;
                int a = ay.m3014a(i7, ae.m1151g(b));
                if (z) {
                    i7 = b.getBaseline();
                    if (i7 != -1) {
                        int i15 = ((((c0541a2.f1376h < 0 ? this.f1388e : c0541a2.f1376h) & C0474j.AppCompatTheme_spinnerStyle) >> 4) & -2) >> 1;
                        iArr[i15] = Math.max(iArr[i15], i7);
                        iArr2[i15] = Math.max(iArr2[i15], i12 - i7);
                    }
                }
                i7 = Math.max(i6, i12);
                obj6 = (obj2 == null || c0541a2.height != -1) ? null : 1;
                if (c0541a2.f1375g > 0.0f) {
                    i3 = Math.max(i9, obj8 != null ? i4 : i12);
                    i4 = i8;
                } else {
                    if (obj8 == null) {
                        i4 = i12;
                    }
                    i4 = Math.max(i8, i4);
                    i3 = i9;
                }
                i11 += m2657a(b, i11);
                obj = obj4;
                i9 = i3;
                i8 = i4;
                i12 = i7;
                i3 = i10;
                i4 = a;
                obj3 = obj7;
                f = f2;
            }
            i11++;
            i10 = i3;
            obj4 = obj;
            obj2 = obj6;
            i7 = i4;
            i6 = i12;
        }
        if (this.f1389f > 0 && m2671c(virtualChildCount)) {
            this.f1389f += this.f1395l;
        }
        i11 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i6 : Math.max(i6, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f1389f = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                View b2 = m2666b(i5);
                if (b2 == null) {
                    this.f1389f += m2672d(i5);
                    i3 = i5;
                } else if (b2.getVisibility() == 8) {
                    i3 = m2657a(b2, i5) + i5;
                } else {
                    c0541a = (C0541a) b2.getLayoutParams();
                    if (obj5 != null) {
                        this.f1389f = ((c0541a.rightMargin + (c0541a.leftMargin + i10)) + m2663b(b2)) + this.f1389f;
                        i3 = i5;
                    } else {
                        i4 = this.f1389f;
                        this.f1389f = Math.max(i4, (c0541a.rightMargin + ((i4 + i10) + c0541a.leftMargin)) + m2663b(b2));
                        i3 = i5;
                    }
                }
                i5 = i3 + 1;
            }
        }
        this.f1389f += getPaddingLeft() + getPaddingRight();
        int a2 = ae.m1126a(Math.max(this.f1389f, getSuggestedMinimumWidth()), i, 0);
        i5 = (16777215 & a2) - this.f1389f;
        int i16;
        if (obj4 != null || (i5 != 0 && f > 0.0f)) {
            if (this.f1390g > 0.0f) {
                f = this.f1390g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1389f = 0;
            i10 = 0;
            float f3 = f;
            Object obj9 = obj2;
            i16 = i8;
            i15 = i7;
            i14 = i5;
            i8 = -1;
            while (i10 < virtualChildCount) {
                float f4;
                Object obj10;
                View b3 = m2666b(i10);
                if (b3 == null) {
                    f4 = f3;
                    i5 = i14;
                    i4 = i8;
                    i14 = i16;
                    obj10 = obj9;
                } else if (b3.getVisibility() == 8) {
                    f4 = f3;
                    i5 = i14;
                    i4 = i8;
                    i14 = i16;
                    obj10 = obj9;
                } else {
                    float f5;
                    c0541a = (C0541a) b3.getLayoutParams();
                    float f6 = c0541a.f1375g;
                    if (f6 > 0.0f) {
                        i5 = (int) ((((float) i14) * f6) / f3);
                        f3 -= f6;
                        i4 = i14 - i5;
                        i14 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + c0541a.topMargin) + c0541a.bottomMargin, c0541a.height);
                        if (c0541a.width == 0 && mode == 1073741824) {
                            if (i5 <= 0) {
                                i5 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), i14);
                        } else {
                            i5 += b3.getMeasuredWidth();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), i14);
                        }
                        i9 = ay.m3014a(i15, ae.m1151g(b3) & -16777216);
                        f5 = f3;
                    } else {
                        i4 = i14;
                        i9 = i15;
                        f5 = f3;
                    }
                    if (obj5 != null) {
                        this.f1389f += ((b3.getMeasuredWidth() + c0541a.leftMargin) + c0541a.rightMargin) + m2663b(b3);
                    } else {
                        i5 = this.f1389f;
                        this.f1389f = Math.max(i5, (((b3.getMeasuredWidth() + i5) + c0541a.leftMargin) + c0541a.rightMargin) + m2663b(b3));
                    }
                    obj = (mode2 == 1073741824 || c0541a.height != -1) ? null : 1;
                    i11 = c0541a.topMargin + c0541a.bottomMargin;
                    i14 = b3.getMeasuredHeight() + i11;
                    i8 = Math.max(i8, i14);
                    i11 = Math.max(i16, obj != null ? i11 : i14);
                    obj = (obj9 == null || c0541a.height != -1) ? null : 1;
                    if (z) {
                        i12 = b3.getBaseline();
                        if (i12 != -1) {
                            i3 = ((((c0541a.f1376h < 0 ? this.f1388e : c0541a.f1376h) & C0474j.AppCompatTheme_spinnerStyle) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i12);
                            iArr2[i3] = Math.max(iArr2[i3], i14 - i12);
                        }
                    }
                    f4 = f5;
                    i14 = i11;
                    obj10 = obj;
                    i15 = i9;
                    i5 = i4;
                    i4 = i8;
                }
                i10++;
                i16 = i14;
                i8 = i4;
                obj9 = obj10;
                i14 = i5;
                f3 = f4;
            }
            this.f1389f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i8 = Math.max(i8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj2 = obj9;
            i3 = i16;
            i7 = i15;
            i5 = i8;
        } else {
            i16 = Math.max(i8, i9);
            if (z2 && mode != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    View b4 = m2666b(i5);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C0541a) b4.getLayoutParams()).f1375g <= 0.0f)) {
                        b4.measure(MeasureSpec.makeMeasureSpec(i10, 1073741824), MeasureSpec.makeMeasureSpec(b4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = i16;
            i5 = i11;
        }
        if (obj2 != null || mode2 == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension((-16777216 & i7) | a2, ae.m1126a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i7 << 16));
        if (obj3 != null) {
            m2655d(virtualChildCount, i);
        }
    }

    void m2668b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = ay.m3016a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.f1388e & 8388615;
        int i8 = this.f1388e & C0474j.AppCompatTheme_spinnerStyle;
        boolean z = this.f1384a;
        int[] iArr = this.f1392i;
        int[] iArr2 = this.f1393j;
        switch (C0290f.m1466a(i7, ae.m1147d(this))) {
            case C0474j.View_android_focusable /*1*/:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1389f) / 2);
                break;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f1389f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View b = m2666b(i10);
            if (b == null) {
                paddingLeft += m2672d(i10);
                i7 = i9;
            } else if (b.getVisibility() != 8) {
                int i11;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0541a c0541a = (C0541a) b.getLayoutParams();
                i7 = (!z || c0541a.height == -1) ? -1 : b.getBaseline();
                int i12 = c0541a.f1376h;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & C0474j.AppCompatTheme_spinnerStyle) {
                    case C0474j.Toolbar_titleMarginEnd /*16*/:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + c0541a.topMargin) - c0541a.bottomMargin;
                        break;
                    case C0474j.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                        i11 = paddingTop + c0541a.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[1] - i7;
                            break;
                        }
                        break;
                    case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                        i11 = (paddingBottom - measuredHeight) - c0541a.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[2] - (b.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                paddingLeft = (m2671c(i10) ? this.f1395l + paddingLeft : paddingLeft) + c0541a.leftMargin;
                m2653a(b, paddingLeft + m2656a(b), i11, measuredWidth, measuredHeight);
                paddingLeft += (c0541a.rightMargin + measuredWidth) + m2663b(b);
                i7 = m2657a(b, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    void m2669b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean a = ay.m3016a(this);
        int i = 0;
        while (i < virtualChildCount) {
            View b = m2666b(i);
            if (!(b == null || b.getVisibility() == 8 || !m2671c(i))) {
                C0541a c0541a = (C0541a) b.getLayoutParams();
                m2670b(canvas, a ? c0541a.rightMargin + b.getRight() : (b.getLeft() - c0541a.leftMargin) - this.f1395l);
            }
            i++;
        }
        if (m2671c(virtualChildCount)) {
            int paddingLeft;
            View b2 = m2666b(virtualChildCount - 1);
            if (b2 == null) {
                paddingLeft = a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f1395l;
            } else {
                c0541a = (C0541a) b2.getLayoutParams();
                paddingLeft = a ? (b2.getLeft() - c0541a.leftMargin) - this.f1395l : c0541a.rightMargin + b2.getRight();
            }
            m2670b(canvas, paddingLeft);
        }
    }

    void m2670b(Canvas canvas, int i) {
        this.f1394k.setBounds(i, getPaddingTop() + this.f1398o, this.f1395l + i, (getHeight() - getPaddingBottom()) - this.f1398o);
        this.f1394k.draw(canvas);
    }

    protected boolean m2671c(int i) {
        if (i == 0) {
            return (this.f1397n & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.f1397n & 4) != 0;
            } else {
                if ((this.f1397n & 2) == 0) {
                    return false;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0541a;
    }

    int m2672d(int i) {
        return 0;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2673j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2664b(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m2665b(layoutParams);
    }

    public int getBaseline() {
        if (this.f1385b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f1385b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f1385b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.f1386c;
            if (this.f1387d == 1) {
                i = this.f1388e & C0474j.AppCompatTheme_spinnerStyle;
                if (i != 48) {
                    switch (i) {
                        case C0474j.Toolbar_titleMarginEnd /*16*/:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1389f) / 2);
                            break;
                        case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1389f;
                            break;
                    }
                }
            }
            i = i2;
            return (((C0541a) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.f1385b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1385b;
    }

    public Drawable getDividerDrawable() {
        return this.f1394k;
    }

    public int getDividerPadding() {
        return this.f1398o;
    }

    public int getDividerWidth() {
        return this.f1395l;
    }

    public int getOrientation() {
        return this.f1387d;
    }

    public int getShowDividers() {
        return this.f1397n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1390g;
    }

    protected C0541a m2673j() {
        return this.f1387d == 0 ? new C0541a(-2, -2) : this.f1387d == 1 ? new C0541a(-1, -2) : null;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f1394k != null) {
            if (this.f1387d == 1) {
                m2660a(canvas);
            } else {
                m2669b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ah.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ah.class.getName());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1387d == 1) {
            m2659a(i, i2, i3, i4);
        } else {
            m2668b(i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f1387d == 1) {
            m2658a(i, i2);
        } else {
            m2667b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1384a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1385b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f1394k) {
            this.f1394k = drawable;
            if (drawable != null) {
                this.f1395l = drawable.getIntrinsicWidth();
                this.f1396m = drawable.getIntrinsicHeight();
            } else {
                this.f1395l = 0;
                this.f1396m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1398o = i;
    }

    public void setGravity(int i) {
        if (this.f1388e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & C0474j.AppCompatTheme_spinnerStyle) == 0) {
                i2 |= 48;
            }
            this.f1388e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.f1388e & 8388615) != i2) {
            this.f1388e = i2 | (this.f1388e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1391h = z;
    }

    public void setOrientation(int i) {
        if (this.f1387d != i) {
            this.f1387d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1397n) {
            requestLayout();
        }
        this.f1397n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0474j.AppCompatTheme_spinnerStyle;
        if ((this.f1388e & C0474j.AppCompatTheme_spinnerStyle) != i2) {
            this.f1388e = i2 | (this.f1388e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1390g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
