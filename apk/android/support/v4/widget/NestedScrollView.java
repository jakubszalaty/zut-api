package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p007g.C0275b;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.C0326v;
import android.support.v4.p007g.C0327w;
import android.support.v4.p007g.C0328x;
import android.support.v4.p007g.C0329y;
import android.support.v4.p007g.aa;
import android.support.v4.p007g.ac;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.p013a.C0181a;
import android.support.v4.p007g.p013a.C0194b;
import android.support.v4.p007g.p013a.C0219l;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.List;

public class NestedScrollView extends FrameLayout implements aa, C0326v, C0328x {
    private static final C0344a f621v;
    private static final int[] f622w;
    private C0345b f623A;
    private long f624a;
    private final Rect f625b;
    private C0387v f626c;
    private C0370j f627d;
    private C0370j f628e;
    private int f629f;
    private boolean f630g;
    private boolean f631h;
    private View f632i;
    private boolean f633j;
    private VelocityTracker f634k;
    private boolean f635l;
    private boolean f636m;
    private int f637n;
    private int f638o;
    private int f639p;
    private int f640q;
    private final int[] f641r;
    private final int[] f642s;
    private int f643t;
    private C0347c f644u;
    private final C0329y f645x;
    private final C0327w f646y;
    private float f647z;

    /* renamed from: android.support.v4.widget.NestedScrollView.a */
    static class C0344a extends C0275b {
        C0344a() {
        }

        public void m1654a(View view, C0194b c0194b) {
            super.m1403a(view, c0194b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0194b.m851b(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0194b.m869i(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0194b.m842a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0194b.m842a(4096);
                    }
                }
            }
        }

        public boolean m1655a(View view, int i, Bundle bundle) {
            if (super.m1405a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int min;
            switch (i) {
                case 4096:
                    min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.getScrollRange());
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1684b(0, min);
                    return true;
                case 8192:
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1684b(0, min);
                    return true;
                default:
                    return false;
            }
        }

        public void m1656d(View view, AccessibilityEvent accessibilityEvent) {
            super.m1409d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            C0219l a = C0181a.m687a(accessibilityEvent);
            a.m973a(nestedScrollView.getScrollRange() > 0);
            a.m972a(nestedScrollView.getScrollX());
            a.m974b(nestedScrollView.getScrollY());
            a.m975c(nestedScrollView.getScrollX());
            a.m976d(nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView.b */
    public interface C0345b {
        void m1657a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView.c */
    static class C0347c extends BaseSavedState {
        public static final Creator<C0347c> CREATOR;
        public int f620a;

        /* renamed from: android.support.v4.widget.NestedScrollView.c.1 */
        static class C03461 implements Creator<C0347c> {
            C03461() {
            }

            public C0347c m1658a(Parcel parcel) {
                return new C0347c(parcel);
            }

            public C0347c[] m1659a(int i) {
                return new C0347c[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1658a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1659a(i);
            }
        }

        static {
            CREATOR = new C03461();
        }

        C0347c(Parcel parcel) {
            super(parcel);
            this.f620a = parcel.readInt();
        }

        C0347c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f620a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f620a);
        }
    }

    static {
        f621v = new C0344a();
        f622w = new int[]{16843130};
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f625b = new Rect();
        this.f630g = true;
        this.f631h = false;
        this.f632i = null;
        this.f633j = false;
        this.f636m = true;
        this.f640q = -1;
        this.f641r = new int[2];
        this.f642s = new int[2];
        m1661a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f622w, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f645x = new C0329y(this);
        this.f646y = new C0327w(this);
        setNestedScrollingEnabled(true);
        ae.m1134a((View) this, f621v);
    }

    private View m1660a(boolean z, int i, int i2) {
        List focusables = getFocusables(2);
        View view = null;
        Object obj = null;
        int size = focusables.size();
        int i3 = 0;
        while (i3 < size) {
            View view2;
            Object obj2;
            View view3 = (View) focusables.get(i3);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i < bottom && top < i2) {
                Object obj3 = (i >= top || bottom >= i2) ? null : 1;
                if (view == null) {
                    Object obj4 = obj3;
                    view2 = view3;
                    obj2 = obj4;
                } else {
                    Object obj5 = ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) ? null : 1;
                    if (obj != null) {
                        if (!(obj3 == null || obj5 == null)) {
                            view2 = view3;
                            obj2 = obj;
                        }
                    } else if (obj3 != null) {
                        view2 = view3;
                        int i4 = 1;
                    } else if (obj5 != null) {
                        view2 = view3;
                        obj2 = obj;
                    }
                }
                i3++;
                view = view2;
                obj = obj2;
            }
            obj2 = obj;
            view2 = view;
            i3++;
            view = view2;
            obj = obj2;
        }
        return view;
    }

    private void m1661a() {
        this.f626c = C0387v.m1823a(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f637n = viewConfiguration.getScaledTouchSlop();
        this.f638o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f639p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void m1662a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f640q) {
            action = action == 0 ? 1 : 0;
            this.f629f = (int) motionEvent.getY(action);
            this.f640q = motionEvent.getPointerId(action);
            if (this.f634k != null) {
                this.f634k.clear();
            }
        }
    }

    private boolean m1663a(int i, int i2, int i3) {
        boolean z = false;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z2 = i == 33;
        View a = m1660a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1675e(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    private boolean m1664a(Rect rect, boolean z) {
        int a = m1679a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m1680a(0, a);
            }
        }
        return z2;
    }

    private boolean m1665a(View view) {
        return !m1666a(view, 0, getHeight());
    }

    private boolean m1666a(View view, int i, int i2) {
        view.getDrawingRect(this.f625b);
        offsetDescendantRectToMyCoords(view, this.f625b);
        return this.f625b.bottom + i >= getScrollY() && this.f625b.top - i <= getScrollY() + i2;
    }

    private static boolean m1667a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        boolean z = (parent instanceof ViewGroup) && m1667a((View) parent, view2);
        return z;
    }

    private static int m1668b(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    private void m1669b(View view) {
        view.getDrawingRect(this.f625b);
        offsetDescendantRectToMyCoords(view, this.f625b);
        int a = m1679a(this.f625b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private boolean m1670b() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    private void m1671c() {
        if (this.f634k == null) {
            this.f634k = VelocityTracker.obtain();
        } else {
            this.f634k.clear();
        }
    }

    private boolean m1672c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    private void m1673d() {
        if (this.f634k == null) {
            this.f634k = VelocityTracker.obtain();
        }
    }

    private void m1674e() {
        if (this.f634k != null) {
            this.f634k.recycle();
            this.f634k = null;
        }
    }

    private void m1675e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f636m) {
            m1680a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private void m1676f() {
        this.f633j = false;
        m1674e();
        stopNestedScroll();
        if (this.f627d != null) {
            this.f627d.m1788b();
            this.f628e.m1788b();
        }
    }

    private void m1677f(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (z) {
                m1687d(i);
            }
        }
    }

    private void m1678g() {
        if (getOverScrollMode() == 2) {
            this.f627d = null;
            this.f628e = null;
        } else if (this.f627d == null) {
            Context context = getContext();
            this.f627d = new C0370j(context);
            this.f628e = new C0370j(context);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f647z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f647z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f647z;
    }

    protected int m1679a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            scrollY = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            scrollY = 0;
        } else {
            scrollY = Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return scrollY;
    }

    public final void m1680a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f624a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f626c.m1824a(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                ae.m1128a(this);
            } else {
                if (!this.f626c.m1828a()) {
                    this.f626c.m1836h();
                }
                scrollBy(i, i2);
            }
            this.f624a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public boolean m1681a(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        if (i2 != 0) {
            this.f625b.top = getScrollY() + height;
            i2 = getChildCount();
            if (i2 > 0) {
                View childAt = getChildAt(i2 - 1);
                if (this.f625b.top + height > childAt.getBottom()) {
                    this.f625b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f625b.top = getScrollY() - height;
            if (this.f625b.top < 0) {
                this.f625b.top = 0;
            }
        }
        this.f625b.bottom = this.f625b.top + height;
        return m1663a(i, this.f625b.top, this.f625b.bottom);
    }

    boolean m1682a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        Object obj = computeHorizontalScrollRange() > computeHorizontalScrollExtent() ? 1 : null;
        Object obj2 = computeVerticalScrollRange() > computeVerticalScrollExtent() ? 1 : null;
        Object obj3 = (overScrollMode == 0 || (overScrollMode == 1 && obj != null)) ? 1 : null;
        obj = (overScrollMode == 0 || (overScrollMode == 1 && obj2 != null)) ? 1 : null;
        int i9 = i3 + i;
        if (obj3 == null) {
            i7 = 0;
        }
        int i10 = i4 + i2;
        if (obj == null) {
            i8 = 0;
        }
        int i11 = -i7;
        int i12 = i7 + i5;
        overScrollMode = -i8;
        int i13 = i8 + i6;
        if (i9 > i12) {
            z2 = true;
        } else if (i9 < i11) {
            z2 = true;
            i12 = i11;
        } else {
            z2 = false;
            i12 = i9;
        }
        if (i10 > i13) {
            z3 = true;
        } else if (i10 < overScrollMode) {
            z3 = true;
            i13 = overScrollMode;
        } else {
            z3 = false;
            i13 = i10;
        }
        if (z3) {
            this.f626c.m1829a(i12, i13, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i13, z2, z3);
        return z2 || z3;
    }

    public boolean m1683a(KeyEvent keyEvent) {
        int i = 33;
        this.f625b.setEmpty();
        if (m1670b()) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case C0474j.Toolbar_titleMargins /*19*/:
                    return !keyEvent.isAltPressed() ? m1686c(33) : m1685b(33);
                case C0474j.Toolbar_maxButtonHeight /*20*/:
                    return !keyEvent.isAltPressed() ? m1686c(130) : m1685b(130);
                case C0474j.AppCompatTheme_popupWindowStyle /*62*/:
                    if (!keyEvent.isShiftPressed()) {
                        i = 130;
                    }
                    m1681a(i);
                    return false;
                default:
                    return false;
            }
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            boolean z = (findFocus == null || findFocus == this || !findFocus.requestFocus(130)) ? false : true;
            return z;
        }
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final void m1684b(int i, int i2) {
        m1680a(i - getScrollX(), i2 - getScrollY());
    }

    public boolean m1685b(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.f625b.top = 0;
        this.f625b.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                this.f625b.bottom = getChildAt(i2 - 1).getBottom() + getPaddingBottom();
                this.f625b.top = this.f625b.bottom - height;
            }
        }
        return m1663a(i, this.f625b.top, this.f625b.bottom);
    }

    public boolean m1686c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1666a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1675e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f625b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f625b);
            m1675e(m1679a(this.f625b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m1665a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.f626c.m1835g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int b = this.f626c.m1830b();
            int c = this.f626c.m1831c();
            if (scrollX != b || scrollY != c) {
                int scrollRange = getScrollRange();
                int overScrollMode = getOverScrollMode();
                int i = (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) ? 1 : 0;
                m1682a(b - scrollX, c - scrollY, scrollX, scrollY, 0, scrollRange, 0, 0, false);
                if (i != 0) {
                    m1678g();
                    if (c <= 0 && scrollY > 0) {
                        this.f627d.m1786a((int) this.f626c.m1834f());
                    } else if (c >= scrollRange && scrollY < scrollRange) {
                        this.f628e.m1786a((int) this.f626c.m1834f());
                    }
                }
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > height ? bottom + (scrollY - height) : bottom;
    }

    public void m1687d(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int height2 = getChildAt(0).getHeight();
            this.f626c.m1827a(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, height2 - height), 0, height / 2);
            ae.m1128a(this);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1683a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f646y.m1541a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f646y.m1540a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f646y.m1544a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f646y.m1543a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f627d != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.f627d.m1784a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f627d.m1783a(width, getHeight());
                if (this.f627d.m1787a(canvas)) {
                    ae.m1128a(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f628e.m1784a()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f628e.m1783a(width, height);
                if (this.f628e.m1787a(canvas)) {
                    ae.m1128a(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public int getNestedScrollAxes() {
        return this.f645x.m1547a();
    }

    int getScrollRange() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f646y.m1545b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f646y.m1539a();
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f631h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case C0474j.Toolbar_contentInsetRight /*8*/:
                if (this.f633j) {
                    return false;
                }
                float a = C0324t.m1534a(motionEvent, 9);
                if (a == 0.0f) {
                    return false;
                }
                int verticalScrollFactorCompat = (int) (a * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange == scrollY) {
                    return false;
                }
                super.scrollTo(getScrollX(), scrollRange);
                return true;
            default:
                return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int action = motionEvent.getAction();
        if (action == 2 && this.f633j) {
            return true;
        }
        switch (action & 255) {
            case C0474j.View_android_theme /*0*/:
                action = (int) motionEvent.getY();
                if (!m1672c((int) motionEvent.getX(), action)) {
                    this.f633j = false;
                    m1674e();
                    break;
                }
                this.f629f = action;
                this.f640q = motionEvent.getPointerId(0);
                m1671c();
                this.f634k.addMovement(motionEvent);
                this.f626c.m1835g();
                if (!this.f626c.m1828a()) {
                    z = true;
                }
                this.f633j = z;
                startNestedScroll(2);
                break;
            case C0474j.View_android_focusable /*1*/:
            case C0474j.View_paddingEnd /*3*/:
                this.f633j = false;
                this.f640q = -1;
                m1674e();
                if (this.f626c.m1829a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ae.m1128a(this);
                }
                stopNestedScroll();
                break;
            case C0474j.View_paddingStart /*2*/:
                action = this.f640q;
                if (action != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(action);
                    if (findPointerIndex != -1) {
                        action = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(action - this.f629f) > this.f637n && (getNestedScrollAxes() & 2) == 0) {
                            this.f633j = true;
                            this.f629f = action;
                            m1673d();
                            this.f634k.addMovement(motionEvent);
                            this.f643t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    Log.e("NestedScrollView", "Invalid pointerId=" + action + " in onInterceptTouchEvent");
                    break;
                }
                break;
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                m1662a(motionEvent);
                break;
        }
        return this.f633j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f630g = false;
        if (this.f632i != null && m1667a(this.f632i, (View) this)) {
            m1669b(this.f632i);
        }
        this.f632i = null;
        if (!this.f631h) {
            if (this.f644u != null) {
                scrollTo(getScrollX(), this.f644u.f620a);
                this.f644u = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f631h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f635l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1677f((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f645x.m1549a(view, view2, i);
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return (findNextFocus == null || m1665a(findNextFocus)) ? false : findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0347c) {
            C0347c c0347c = (C0347c) parcelable;
            super.onRestoreInstanceState(c0347c.getSuperState());
            this.f644u = c0347c;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0347c = new C0347c(super.onSaveInstanceState());
        c0347c.f620a = getScrollY();
        return c0347c;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f623A != null) {
            this.f623A.m1657a(this, i, i2, i3, i4);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1666a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f625b);
            offsetDescendantRectToMyCoords(findFocus, this.f625b);
            m1675e(m1679a(this.f625b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f645x.m1548a(view);
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m1673d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = C0324t.m1535a(motionEvent);
        if (a == 0) {
            this.f643t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f643t);
        switch (a) {
            case C0474j.View_android_theme /*0*/:
                if (getChildCount() != 0) {
                    boolean z = !this.f626c.m1828a();
                    this.f633j = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f626c.m1828a()) {
                        this.f626c.m1836h();
                    }
                    this.f629f = (int) motionEvent.getY();
                    this.f640q = motionEvent.getPointerId(0);
                    startNestedScroll(2);
                    break;
                }
                return false;
            case C0474j.View_android_focusable /*1*/:
                if (this.f633j) {
                    VelocityTracker velocityTracker = this.f634k;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f639p);
                    a = (int) ac.m989b(velocityTracker, this.f640q);
                    if (Math.abs(a) > this.f638o) {
                        m1677f(-a);
                    } else if (this.f626c.m1829a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ae.m1128a(this);
                    }
                }
                this.f640q = -1;
                m1676f();
                break;
            case C0474j.View_paddingStart /*2*/:
                int findPointerIndex = motionEvent.findPointerIndex(this.f640q);
                if (findPointerIndex != -1) {
                    int i;
                    int y = (int) motionEvent.getY(findPointerIndex);
                    a = this.f629f - y;
                    if (dispatchNestedPreScroll(0, a, this.f642s, this.f641r)) {
                        a -= this.f642s[1];
                        obtain.offsetLocation(0.0f, (float) this.f641r[1]);
                        this.f643t += this.f641r[1];
                    }
                    if (this.f633j || Math.abs(a) <= this.f637n) {
                        i = a;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f633j = true;
                        i = a > 0 ? a - this.f637n : a + this.f637n;
                    }
                    if (this.f633j) {
                        this.f629f = y - this.f641r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        a = getOverScrollMode();
                        Object obj = (a == 0 || (a == 1 && scrollRange > 0)) ? 1 : null;
                        if (m1682a(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent()) {
                            this.f634k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.f641r)) {
                            if (obj != null) {
                                m1678g();
                                a = scrollY + i;
                                if (a < 0) {
                                    this.f627d.m1785a(((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f628e.m1784a()) {
                                        this.f628e.m1788b();
                                    }
                                } else if (a > scrollRange) {
                                    this.f628e.m1785a(((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f627d.m1784a()) {
                                        this.f627d.m1788b();
                                    }
                                }
                                if (!(this.f627d == null || (this.f627d.m1784a() && this.f628e.m1784a()))) {
                                    ae.m1128a(this);
                                    break;
                                }
                            }
                        }
                        this.f629f -= this.f641r[1];
                        obtain.offsetLocation(0.0f, (float) this.f641r[1]);
                        this.f643t += this.f641r[1];
                        break;
                    }
                }
                Log.e("NestedScrollView", "Invalid pointerId=" + this.f640q + " in onTouchEvent");
                break;
                break;
            case C0474j.View_paddingEnd /*3*/:
                if (this.f633j && getChildCount() > 0 && this.f626c.m1829a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ae.m1128a(this);
                }
                this.f640q = -1;
                m1676f();
                break;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                a = C0324t.m1536b(motionEvent);
                this.f629f = (int) motionEvent.getY(a);
                this.f640q = motionEvent.getPointerId(a);
                break;
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                m1662a(motionEvent);
                this.f629f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f640q));
                break;
        }
        if (this.f634k != null) {
            this.f634k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f630g) {
            this.f632i = view2;
        } else {
            m1669b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1664a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1674e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f630g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m1668b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m1668b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f635l) {
            this.f635l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f646y.m1538a(z);
    }

    public void setOnScrollChangeListener(C0345b c0345b) {
        this.f623A = c0345b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f636m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f646y.m1542a(i);
    }

    public void stopNestedScroll() {
        this.f646y.m1546c();
    }
}
