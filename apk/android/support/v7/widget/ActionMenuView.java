package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0499p;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.view.menu.C0515h.C0498b;
import android.support.v7.view.menu.C0518j;
import android.support.v7.widget.ah.C0541a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends ah implements C0498b, C0499p {
    C0425a f1399a;
    C0544e f1400b;
    private C0515h f1401c;
    private Context f1402d;
    private int f1403e;
    private boolean f1404f;
    private C0593d f1405g;
    private C0442a f1406h;
    private boolean f1407i;
    private int f1408j;
    private int f1409k;
    private int f1410l;

    /* renamed from: android.support.v7.widget.ActionMenuView.a */
    public interface C0497a {
        boolean m2329c();

        boolean m2330d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView.b */
    private class C0540b implements C0442a {
        final /* synthetic */ ActionMenuView f1374a;

        C0540b(ActionMenuView actionMenuView) {
            this.f1374a = actionMenuView;
        }

        public void m2648a(C0515h c0515h, boolean z) {
        }

        public boolean m2649a(C0515h c0515h) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView.c */
    public static class C0542c extends C0541a {
        @ExportedProperty
        public boolean f1377a;
        @ExportedProperty
        public int f1378b;
        @ExportedProperty
        public int f1379c;
        @ExportedProperty
        public boolean f1380d;
        @ExportedProperty
        public boolean f1381e;
        boolean f1382f;

        public C0542c(int i, int i2) {
            super(i, i2);
            this.f1377a = false;
        }

        public C0542c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0542c(C0542c c0542c) {
            super(c0542c);
            this.f1377a = c0542c.f1377a;
        }

        public C0542c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView.d */
    private class C0543d implements C0425a {
        final /* synthetic */ ActionMenuView f1383a;

        C0543d(ActionMenuView actionMenuView) {
            this.f1383a = actionMenuView;
        }

        public void m2650a(C0515h c0515h) {
            if (this.f1383a.f1399a != null) {
                this.f1383a.f1399a.m2010a(c0515h);
            }
        }

        public boolean m2651a(C0515h c0515h, MenuItem menuItem) {
            return this.f1383a.f1400b != null && this.f1383a.f1400b.m2652a(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView.e */
    public interface C0544e {
        boolean m2652a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1409k = (int) (56.0f * f);
        this.f1410l = (int) (f * 4.0f);
        this.f1402d = context;
        this.f1403e = 0;
    }

    static int m2674a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        C0542c c0542c = (C0542c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m2335b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && r1 < 2) {
                i5 = 2;
            }
        }
        if (!c0542c.f1377a && z2) {
            z = true;
        }
        c0542c.f1380d = z;
        c0542c.f1378b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    private void m2675c(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i3 = size - paddingLeft;
        int i4 = i3 / this.f1409k;
        size = i3 % this.f1409k;
        if (i4 == 0) {
            setMeasuredDimension(i3, 0);
            return;
        }
        int i5;
        Object obj;
        int i6 = this.f1409k + (size / i4);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        paddingLeft = 0;
        Object obj2 = null;
        long j = 0;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11;
            long j2;
            int i12;
            int i13;
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i11 = paddingLeft;
                j2 = j;
                i12 = i7;
                i13 = i4;
                i4 = i8;
            } else {
                boolean z = childAt instanceof ActionMenuItemView;
                i5 = paddingLeft + 1;
                if (z) {
                    childAt.setPadding(this.f1410l, 0, this.f1410l, 0);
                }
                C0542c c0542c = (C0542c) childAt.getLayoutParams();
                c0542c.f1382f = false;
                c0542c.f1379c = 0;
                c0542c.f1378b = 0;
                c0542c.f1380d = false;
                c0542c.leftMargin = 0;
                c0542c.rightMargin = 0;
                boolean z2 = z && ((ActionMenuItemView) childAt).m2335b();
                c0542c.f1381e = z2;
                int a = m2674a(childAt, i6, c0542c.f1377a ? 1 : i4, childMeasureSpec, paddingTop);
                i8 = Math.max(i8, a);
                paddingLeft = c0542c.f1380d ? i9 + 1 : i9;
                obj = c0542c.f1377a ? 1 : obj2;
                int i14 = i4 - a;
                i9 = Math.max(i7, childAt.getMeasuredHeight());
                if (a == 1) {
                    long j3 = ((long) (1 << i10)) | j;
                    i12 = i9;
                    i13 = i14;
                    i9 = paddingLeft;
                    obj2 = obj;
                    j2 = j3;
                    i4 = i8;
                    i11 = i5;
                } else {
                    i11 = i5;
                    i4 = i8;
                    long j4 = j;
                    i12 = i9;
                    i13 = i14;
                    obj2 = obj;
                    i9 = paddingLeft;
                    j2 = j4;
                }
            }
            i10++;
            i8 = i4;
            i7 = i12;
            i4 = i13;
            j = j2;
            paddingLeft = i11;
        }
        Object obj3 = (obj2 == null || paddingLeft != 2) ? null : 1;
        Object obj4 = null;
        long j5 = j;
        paddingTop = i4;
        while (i9 > 0 && paddingTop > 0) {
            i5 = Integer.MAX_VALUE;
            j = 0;
            i4 = 0;
            int i15 = 0;
            while (i15 < childCount) {
                c0542c = (C0542c) getChildAt(i15).getLayoutParams();
                if (c0542c.f1380d) {
                    int i16 = c0542c.f1378b;
                    if (r0 < i5) {
                        i4 = c0542c.f1378b;
                        j = (long) (1 << i15);
                        size = 1;
                    } else if (c0542c.f1378b == i5) {
                        j |= (long) (1 << i15);
                        size = i4 + 1;
                        i4 = i5;
                    } else {
                        size = i4;
                        i4 = i5;
                    }
                } else {
                    size = i4;
                    i4 = i5;
                }
                i15++;
                i5 = i4;
                i4 = size;
            }
            j5 |= j;
            if (i4 > paddingTop) {
                j = j5;
                break;
            }
            i15 = i5 + 1;
            i5 = 0;
            i4 = paddingTop;
            long j6 = j5;
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                c0542c = (C0542c) childAt2.getLayoutParams();
                if ((((long) (1 << i5)) & j) != 0) {
                    if (obj3 != null && c0542c.f1381e && i4 == 1) {
                        childAt2.setPadding(this.f1410l + i6, 0, this.f1410l, 0);
                    }
                    c0542c.f1378b++;
                    c0542c.f1382f = true;
                    size = i4 - 1;
                } else if (c0542c.f1378b == i15) {
                    j6 |= (long) (1 << i5);
                    size = i4;
                } else {
                    size = i4;
                }
                i5++;
                i4 = size;
            }
            j5 = j6;
            i10 = 1;
            paddingTop = i4;
        }
        j = j5;
        obj = (obj2 == null && paddingLeft == 1) ? 1 : null;
        if (paddingTop <= 0 || j == 0 || (paddingTop >= paddingLeft - 1 && obj == null && i8 <= 1)) {
            obj3 = obj4;
        } else {
            float f;
            View childAt3;
            float bitCount = (float) Long.bitCount(j);
            if (obj == null) {
                if (!((1 & j) == 0 || ((C0542c) getChildAt(0).getLayoutParams()).f1381e)) {
                    bitCount -= 0.5f;
                }
                if (!((((long) (1 << (childCount - 1))) & j) == 0 || ((C0542c) getChildAt(childCount - 1).getLayoutParams()).f1381e)) {
                    f = bitCount - 0.5f;
                    paddingLeft = f <= 0.0f ? (int) (((float) (paddingTop * i6)) / f) : 0;
                    i4 = 0;
                    obj3 = obj4;
                    while (i4 < childCount) {
                        if ((((long) (1 << i4)) & j) != 0) {
                            obj = obj3;
                        } else {
                            childAt3 = getChildAt(i4);
                            c0542c = (C0542c) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                c0542c.f1379c = paddingLeft;
                                c0542c.f1382f = true;
                                if (i4 == 0 && !c0542c.f1381e) {
                                    c0542c.leftMargin = (-paddingLeft) / 2;
                                }
                                obj = 1;
                            } else if (c0542c.f1377a) {
                                if (i4 != 0) {
                                    c0542c.leftMargin = paddingLeft / 2;
                                }
                                if (i4 != childCount - 1) {
                                    c0542c.rightMargin = paddingLeft / 2;
                                }
                                obj = obj3;
                            } else {
                                c0542c.f1379c = paddingLeft;
                                c0542c.f1382f = true;
                                c0542c.rightMargin = (-paddingLeft) / 2;
                                obj = 1;
                            }
                        }
                        i4++;
                        obj3 = obj;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
            }
            i4 = 0;
            obj3 = obj4;
            while (i4 < childCount) {
                if ((((long) (1 << i4)) & j) != 0) {
                    childAt3 = getChildAt(i4);
                    c0542c = (C0542c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0542c.f1379c = paddingLeft;
                        c0542c.f1382f = true;
                        c0542c.leftMargin = (-paddingLeft) / 2;
                        obj = 1;
                    } else if (c0542c.f1377a) {
                        if (i4 != 0) {
                            c0542c.leftMargin = paddingLeft / 2;
                        }
                        if (i4 != childCount - 1) {
                            c0542c.rightMargin = paddingLeft / 2;
                        }
                        obj = obj3;
                    } else {
                        c0542c.f1379c = paddingLeft;
                        c0542c.f1382f = true;
                        c0542c.rightMargin = (-paddingLeft) / 2;
                        obj = 1;
                    }
                } else {
                    obj = obj3;
                }
                i4++;
                obj3 = obj;
            }
        }
        if (obj3 != null) {
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                childAt = getChildAt(paddingLeft);
                c0542c = (C0542c) childAt.getLayoutParams();
                if (c0542c.f1382f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(c0542c.f1379c + (c0542c.f1378b * i6), 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i7 = size2;
        }
        setMeasuredDimension(i3, i7);
    }

    public C0542c m2676a(AttributeSet attributeSet) {
        return new C0542c(getContext(), attributeSet);
    }

    protected C0542c m2677a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m2683b();
        }
        C0542c c0542c = layoutParams instanceof C0542c ? new C0542c((C0542c) layoutParams) : new C0542c(layoutParams);
        if (c0542c.h > 0) {
            return c0542c;
        }
        c0542c.h = 16;
        return c0542c;
    }

    public void m2678a(C0515h c0515h) {
        this.f1401c = c0515h;
    }

    public void m2679a(C0442a c0442a, C0425a c0425a) {
        this.f1406h = c0442a;
        this.f1399a = c0425a;
    }

    public boolean m2680a() {
        return this.f1404f;
    }

    protected boolean m2681a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0497a)) {
            z = 0 | ((C0497a) childAt).m2330d();
        }
        return (i <= 0 || !(childAt2 instanceof C0497a)) ? z : ((C0497a) childAt2).m2329c() | z;
    }

    public boolean m2682a(C0518j c0518j) {
        return this.f1401c.m2476a((MenuItem) c0518j, 0);
    }

    protected C0542c m2683b() {
        C0542c c0542c = new C0542c(-2, -2);
        c0542c.h = 16;
        return c0542c;
    }

    public /* synthetic */ C0541a m2684b(AttributeSet attributeSet) {
        return m2676a(attributeSet);
    }

    protected /* synthetic */ C0541a m2685b(LayoutParams layoutParams) {
        return m2677a(layoutParams);
    }

    public C0542c m2686c() {
        C0542c b = m2683b();
        b.f1377a = true;
        return b;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0542c);
    }

    public C0515h m2687d() {
        return this.f1401c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean m2688e() {
        return this.f1405g != null && this.f1405g.m3052d();
    }

    public boolean m2689f() {
        return this.f1405g != null && this.f1405g.m3053e();
    }

    public boolean m2690g() {
        return this.f1405g != null && this.f1405g.m3056h();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2683b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2676a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m2677a(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1401c == null) {
            Context context = getContext();
            this.f1401c = new C0515h(context);
            this.f1401c.m2468a(new C0543d(this));
            this.f1405g = new C0593d(context);
            this.f1405g.m3050c(true);
            this.f1405g.m2369a(this.f1406h != null ? this.f1406h : new C0540b(this));
            this.f1401c.m2471a(this.f1405g, this.f1402d);
            this.f1405g.m3042a(this);
        }
        return this.f1401c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1405g.m3049c();
    }

    public int getPopupTheme() {
        return this.f1403e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean m2691h() {
        return this.f1405g != null && this.f1405g.m3057i();
    }

    public void m2692i() {
        if (this.f1405g != null) {
            this.f1405g.m3054f();
        }
    }

    protected /* synthetic */ C0541a m2693j() {
        return m2683b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1405g != null) {
            this.f1405g.m3047b(false);
            if (this.f1405g.m3056h()) {
                this.f1405g.m3053e();
                this.f1405g.m3052d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2692i();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1407i) {
            int i5;
            int i6;
            C0542c c0542c;
            int paddingLeft;
            int childCount = getChildCount();
            int i7 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i8 = 0;
            int i9 = 0;
            int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
            Object obj = null;
            boolean a = ay.m3016a(this);
            int i10 = 0;
            while (i10 < childCount) {
                Object obj2;
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 8) {
                    obj2 = obj;
                    i5 = i9;
                    i6 = paddingRight;
                    paddingRight = i8;
                } else {
                    c0542c = (C0542c) childAt.getLayoutParams();
                    if (c0542c.f1377a) {
                        i6 = childAt.getMeasuredWidth();
                        if (m2681a(i10)) {
                            i6 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = c0542c.leftMargin + getPaddingLeft();
                            i5 = paddingLeft + i6;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - c0542c.rightMargin;
                            paddingLeft = i5 - i6;
                        }
                        int i11 = i7 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i11, i5, measuredHeight + i11);
                        i6 = paddingRight - i6;
                        obj2 = 1;
                        i5 = i9;
                        paddingRight = i8;
                    } else {
                        i5 = (childAt.getMeasuredWidth() + c0542c.leftMargin) + c0542c.rightMargin;
                        paddingLeft = i8 + i5;
                        i5 = paddingRight - i5;
                        if (m2681a(i10)) {
                            paddingLeft += dividerWidth;
                        }
                        Object obj3 = obj;
                        i6 = i5;
                        i5 = i9 + 1;
                        paddingRight = paddingLeft;
                        obj2 = obj3;
                    }
                }
                i10++;
                i8 = paddingRight;
                paddingRight = i6;
                i9 = i5;
                obj = obj2;
            }
            if (childCount == 1 && obj == null) {
                View childAt2 = getChildAt(0);
                i6 = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                paddingRight = ((i3 - i) / 2) - (i6 / 2);
                i9 = i7 - (i5 / 2);
                childAt2.layout(paddingRight, i9, i6 + paddingRight, i5 + i9);
                return;
            }
            paddingLeft = i9 - (obj != null ? 0 : 1);
            paddingRight = Math.max(0, paddingLeft > 0 ? paddingRight / paddingLeft : 0);
            View childAt3;
            if (a) {
                i6 = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    c0542c = (C0542c) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8) {
                        paddingLeft = i6;
                    } else if (c0542c.f1377a) {
                        paddingLeft = i6;
                    } else {
                        i6 -= c0542c.rightMargin;
                        i8 = childAt3.getMeasuredWidth();
                        i10 = childAt3.getMeasuredHeight();
                        dividerWidth = i7 - (i10 / 2);
                        childAt3.layout(i6 - i8, dividerWidth, i6, i10 + dividerWidth);
                        paddingLeft = i6 - ((c0542c.leftMargin + i8) + paddingRight);
                    }
                    i5++;
                    i6 = paddingLeft;
                }
                return;
            }
            i6 = getPaddingLeft();
            i5 = 0;
            while (i5 < childCount) {
                childAt3 = getChildAt(i5);
                c0542c = (C0542c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    paddingLeft = i6;
                } else if (c0542c.f1377a) {
                    paddingLeft = i6;
                } else {
                    i6 += c0542c.leftMargin;
                    i8 = childAt3.getMeasuredWidth();
                    i10 = childAt3.getMeasuredHeight();
                    dividerWidth = i7 - (i10 / 2);
                    childAt3.layout(i6, dividerWidth, i6 + i8, i10 + dividerWidth);
                    paddingLeft = ((c0542c.rightMargin + i8) + paddingRight) + i6;
                }
                i5++;
                i6 = paddingLeft;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.f1407i;
        this.f1407i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1407i) {
            this.f1408j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f1407i || this.f1401c == null || size == this.f1408j)) {
            this.f1408j = size;
            this.f1401c.m2482b(true);
        }
        int childCount = getChildCount();
        if (!this.f1407i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0542c c0542c = (C0542c) getChildAt(i3).getLayoutParams();
                c0542c.rightMargin = 0;
                c0542c.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2675c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1405g.m3051d(z);
    }

    public void setOnMenuItemClickListener(C0544e c0544e) {
        this.f1400b = c0544e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1405g.m3039a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1404f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1403e != i) {
            this.f1403e = i;
            if (i == 0) {
                this.f1402d = getContext();
            } else {
                this.f1402d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0593d c0593d) {
        this.f1405g = c0593d;
        this.f1405g.m3042a(this);
    }
}
