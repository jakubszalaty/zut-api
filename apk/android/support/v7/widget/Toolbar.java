package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p007g.C0173a;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.C0310o;
import android.support.v4.p007g.C0317q;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.ae;
import android.support.v4.p011e.C0154d;
import android.support.v4.p011e.C0155e;
import android.support.v7.p014a.C0396a.C0393a;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.support.v7.view.C0484c;
import android.support.v7.view.C0491g;
import android.support.v7.view.menu.C0501o;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.view.menu.C0518j;
import android.support.v7.view.menu.C0532u;
import android.support.v7.widget.ActionMenuView.C0544e;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int f1507A;
    private int f1508B;
    private boolean f1509C;
    private boolean f1510D;
    private final ArrayList<View> f1511E;
    private final ArrayList<View> f1512F;
    private final int[] f1513G;
    private final C0544e f1514H;
    private aw f1515I;
    private C0593d f1516J;
    private C0558a f1517K;
    private C0442a f1518L;
    private C0425a f1519M;
    private boolean f1520N;
    private final Runnable f1521O;
    ImageButton f1522a;
    View f1523b;
    int f1524c;
    C0560c f1525d;
    private ActionMenuView f1526e;
    private TextView f1527f;
    private TextView f1528g;
    private ImageButton f1529h;
    private ImageView f1530i;
    private Drawable f1531j;
    private CharSequence f1532k;
    private Context f1533l;
    private int f1534m;
    private int f1535n;
    private int f1536o;
    private int f1537p;
    private int f1538q;
    private int f1539r;
    private int f1540s;
    private int f1541t;
    private an f1542u;
    private int f1543v;
    private int f1544w;
    private int f1545x;
    private CharSequence f1546y;
    private CharSequence f1547z;

    /* renamed from: android.support.v7.widget.Toolbar.1 */
    class C05551 implements C0544e {
        final /* synthetic */ Toolbar f1498a;

        C05551(Toolbar toolbar) {
            this.f1498a = toolbar;
        }

        public boolean m2745a(MenuItem menuItem) {
            return this.f1498a.f1525d != null ? this.f1498a.f1525d.m2755a(menuItem) : false;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar.2 */
    class C05562 implements Runnable {
        final /* synthetic */ Toolbar f1499a;

        C05562(Toolbar toolbar) {
            this.f1499a = toolbar;
        }

        public void run() {
            this.f1499a.m2791d();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar.3 */
    class C05573 implements OnClickListener {
        final /* synthetic */ Toolbar f1500a;

        C05573(Toolbar toolbar) {
            this.f1500a = toolbar;
        }

        public void onClick(View view) {
            this.f1500a.m2795h();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar.a */
    private class C0558a implements C0501o {
        C0515h f1501a;
        C0518j f1502b;
        final /* synthetic */ Toolbar f1503c;

        C0558a(Toolbar toolbar) {
            this.f1503c = toolbar;
        }

        public void m2746a(Context context, C0515h c0515h) {
            if (!(this.f1501a == null || this.f1502b == null)) {
                this.f1501a.m2490d(this.f1502b);
            }
            this.f1501a = c0515h;
        }

        public void m2747a(C0515h c0515h, boolean z) {
        }

        public void m2748a(C0442a c0442a) {
        }

        public boolean m2749a(C0515h c0515h, C0518j c0518j) {
            this.f1503c.m2796i();
            if (this.f1503c.f1522a.getParent() != this.f1503c) {
                this.f1503c.addView(this.f1503c.f1522a);
            }
            this.f1503c.f1523b = c0518j.getActionView();
            this.f1502b = c0518j;
            if (this.f1503c.f1523b.getParent() != this.f1503c) {
                LayoutParams j = this.f1503c.m2797j();
                j.a = 8388611 | (this.f1503c.f1524c & C0474j.AppCompatTheme_spinnerStyle);
                j.f1504b = 2;
                this.f1503c.f1523b.setLayoutParams(j);
                this.f1503c.addView(this.f1503c.f1523b);
            }
            this.f1503c.m2798k();
            this.f1503c.requestLayout();
            c0518j.m2528e(true);
            if (this.f1503c.f1523b instanceof C0484c) {
                ((C0484c) this.f1503c.f1523b).m2264a();
            }
            return true;
        }

        public boolean m2750a(C0532u c0532u) {
            return false;
        }

        public void m2751b(boolean z) {
            Object obj = null;
            if (this.f1502b != null) {
                if (this.f1501a != null) {
                    int size = this.f1501a.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1501a.getItem(i) == this.f1502b) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    m2753b(this.f1501a, this.f1502b);
                }
            }
        }

        public boolean m2752b() {
            return false;
        }

        public boolean m2753b(C0515h c0515h, C0518j c0518j) {
            if (this.f1503c.f1523b instanceof C0484c) {
                ((C0484c) this.f1503c.f1523b).m2265b();
            }
            this.f1503c.removeView(this.f1503c.f1523b);
            this.f1503c.removeView(this.f1503c.f1522a);
            this.f1503c.f1523b = null;
            this.f1503c.m2799l();
            this.f1502b = null;
            this.f1503c.requestLayout();
            c0518j.m2528e(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar.b */
    public static class C0559b extends C0393a {
        int f1504b;

        public C0559b(int i, int i2) {
            super(i, i2);
            this.f1504b = 0;
            this.a = 8388627;
        }

        public C0559b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1504b = 0;
        }

        public C0559b(C0393a c0393a) {
            super(c0393a);
            this.f1504b = 0;
        }

        public C0559b(C0559b c0559b) {
            super((C0393a) c0559b);
            this.f1504b = 0;
            this.f1504b = c0559b.f1504b;
        }

        public C0559b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1504b = 0;
        }

        public C0559b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f1504b = 0;
            m2754a(marginLayoutParams);
        }

        void m2754a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar.c */
    public interface C0560c {
        boolean m2755a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar.d */
    public static class C0562d extends C0173a {
        public static final Creator<C0562d> CREATOR;
        int f1505b;
        boolean f1506c;

        /* renamed from: android.support.v7.widget.Toolbar.d.1 */
        static class C05611 implements C0155e<C0562d> {
            C05611() {
            }

            public /* synthetic */ Object m2756a(Parcel parcel, ClassLoader classLoader) {
                return m2758b(parcel, classLoader);
            }

            public /* synthetic */ Object[] m2757a(int i) {
                return m2759b(i);
            }

            public C0562d m2758b(Parcel parcel, ClassLoader classLoader) {
                return new C0562d(parcel, classLoader);
            }

            public C0562d[] m2759b(int i) {
                return new C0562d[i];
            }
        }

        static {
            CREATOR = C0154d.m600a(new C05611());
        }

        public C0562d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1505b = parcel.readInt();
            this.f1506c = parcel.readInt() != 0;
        }

        public C0562d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1505b);
            parcel.writeInt(this.f1506c ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1545x = 8388627;
        this.f1511E = new ArrayList();
        this.f1512F = new ArrayList();
        this.f1513G = new int[2];
        this.f1514H = new C05551(this);
        this.f1521O = new C05562(this);
        av a = av.m2947a(getContext(), attributeSet, C0474j.Toolbar, i, 0);
        this.f1535n = a.m2963g(C0474j.Toolbar_titleTextAppearance, 0);
        this.f1536o = a.m2963g(C0474j.Toolbar_subtitleTextAppearance, 0);
        this.f1545x = a.m2955c(C0474j.Toolbar_android_gravity, this.f1545x);
        this.f1524c = a.m2955c(C0474j.Toolbar_buttonGravity, 48);
        int d = a.m2957d(C0474j.Toolbar_titleMargin, 0);
        if (a.m2964g(C0474j.Toolbar_titleMargins)) {
            d = a.m2957d(C0474j.Toolbar_titleMargins, d);
        }
        this.f1541t = d;
        this.f1540s = d;
        this.f1539r = d;
        this.f1538q = d;
        d = a.m2957d(C0474j.Toolbar_titleMarginStart, -1);
        if (d >= 0) {
            this.f1538q = d;
        }
        d = a.m2957d(C0474j.Toolbar_titleMarginEnd, -1);
        if (d >= 0) {
            this.f1539r = d;
        }
        d = a.m2957d(C0474j.Toolbar_titleMarginTop, -1);
        if (d >= 0) {
            this.f1540s = d;
        }
        d = a.m2957d(C0474j.Toolbar_titleMarginBottom, -1);
        if (d >= 0) {
            this.f1541t = d;
        }
        this.f1537p = a.m2959e(C0474j.Toolbar_maxButtonHeight, -1);
        d = a.m2957d(C0474j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d2 = a.m2957d(C0474j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.m2959e(C0474j.Toolbar_contentInsetLeft, 0);
        int e2 = a.m2959e(C0474j.Toolbar_contentInsetRight, 0);
        m2780s();
        this.f1542u.m2900b(e, e2);
        if (!(d == Integer.MIN_VALUE && d2 == Integer.MIN_VALUE)) {
            this.f1542u.m2897a(d, d2);
        }
        this.f1543v = a.m2957d(C0474j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1544w = a.m2957d(C0474j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1531j = a.m2950a(C0474j.Toolbar_collapseIcon);
        this.f1532k = a.m2956c(C0474j.Toolbar_collapseContentDescription);
        CharSequence c = a.m2956c(C0474j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        c = a.m2956c(C0474j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c)) {
            setSubtitle(c);
        }
        this.f1533l = getContext();
        setPopupTheme(a.m2963g(C0474j.Toolbar_popupTheme, 0));
        Drawable a2 = a.m2950a(C0474j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        c = a.m2956c(C0474j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c)) {
            setNavigationContentDescription(c);
        }
        a2 = a.m2950a(C0474j.Toolbar_logo);
        if (a2 != null) {
            setLogo(a2);
        }
        c = a.m2956c(C0474j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c)) {
            setLogoDescription(c);
        }
        if (a.m2964g(C0474j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.m2953b(C0474j.Toolbar_titleTextColor, -1));
        }
        if (a.m2964g(C0474j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m2953b(C0474j.Toolbar_subtitleTextColor, -1));
        }
        a.m2951a();
    }

    private int m2760a(int i) {
        int i2 = i & C0474j.AppCompatTheme_spinnerStyle;
        switch (i2) {
            case C0474j.Toolbar_titleMarginEnd /*16*/:
            case C0474j.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
            case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                return i2;
            default:
                return this.f1545x & C0474j.AppCompatTheme_spinnerStyle;
        }
    }

    private int m2761a(View view, int i) {
        C0559b c0559b = (C0559b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m2760a(c0559b.a)) {
            case C0474j.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                return getPaddingTop() - i2;
            case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0559b.bottomMargin) - i2;
            default:
                int i3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i2 < c0559b.topMargin) {
                    i3 = c0559b.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - paddingTop;
                    i3 = measuredHeight < c0559b.bottomMargin ? Math.max(0, i2 - (c0559b.bottomMargin - measuredHeight)) : i2;
                }
                return i3 + paddingTop;
        }
    }

    private int m2762a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int m2763a(View view, int i, int[] iArr, int i2) {
        C0559b c0559b = (C0559b) view.getLayoutParams();
        int i3 = c0559b.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = m2761a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (c0559b.rightMargin + measuredWidth) + max;
    }

    private int m2764a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C0559b c0559b = (C0559b) view.getLayoutParams();
            i6 = c0559b.leftMargin - i6;
            i = c0559b.rightMargin - i5;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i);
            i6 = Math.max(0, -i6);
            i5 = Math.max(0, -i);
            i3++;
            i4 += (view.getMeasuredWidth() + max) + max2;
        }
        return i4;
    }

    private void m2765a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void m2766a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = m2797j();
        } else if (checkLayoutParams(layoutParams)) {
            C0559b c0559b = (C0559b) layoutParams;
        } else {
            layoutParams = m2782a(layoutParams);
        }
        layoutParams.f1504b = 1;
        if (!z || this.f1523b == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1512F.add(view);
    }

    private void m2767a(List<View> list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (ae.m1147d(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = C0290f.m1466a(i, ae.m1147d(this));
        list.clear();
        C0559b c0559b;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                c0559b = (C0559b) childAt.getLayoutParams();
                if (c0559b.f1504b == 0 && m2768a(childAt) && m2769b(c0559b.a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            c0559b = (C0559b) childAt2.getLayoutParams();
            if (c0559b.f1504b == 0 && m2768a(childAt2) && m2769b(c0559b.a) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private boolean m2768a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int m2769b(int i) {
        int d = ae.m1147d(this);
        int a = C0290f.m1466a(i, d) & 7;
        switch (a) {
            case C0474j.View_android_focusable /*1*/:
            case C0474j.View_paddingEnd /*3*/:
            case C0474j.Toolbar_contentInsetStart /*5*/:
                return a;
            default:
                return d == 1 ? 5 : 3;
        }
    }

    private int m2770b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0310o.m1493b(marginLayoutParams) + C0310o.m1492a(marginLayoutParams);
    }

    private int m2771b(View view, int i, int[] iArr, int i2) {
        C0559b c0559b = (C0559b) view.getLayoutParams();
        int i3 = c0559b.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = m2761a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (c0559b.leftMargin + measuredWidth);
    }

    private int m2772c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private boolean m2773d(View view) {
        return view.getParent() == this || this.f1512F.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0491g(getContext());
    }

    private void m2774m() {
        if (this.f1530i == null) {
            this.f1530i = new C0589p(getContext());
        }
    }

    private void m2775n() {
        m2776o();
        if (this.f1526e.m2687d() == null) {
            C0515h c0515h = (C0515h) this.f1526e.getMenu();
            if (this.f1517K == null) {
                this.f1517K = new C0558a(this);
            }
            this.f1526e.setExpandedActionViewsExclusive(true);
            c0515h.m2471a(this.f1517K, this.f1533l);
        }
    }

    private void m2776o() {
        if (this.f1526e == null) {
            this.f1526e = new ActionMenuView(getContext());
            this.f1526e.setPopupTheme(this.f1534m);
            this.f1526e.setOnMenuItemClickListener(this.f1514H);
            this.f1526e.m2679a(this.f1518L, this.f1519M);
            LayoutParams j = m2797j();
            j.a = 8388613 | (this.f1524c & C0474j.AppCompatTheme_spinnerStyle);
            this.f1526e.setLayoutParams(j);
            m2766a(this.f1526e, false);
        }
    }

    private void m2777p() {
        if (this.f1529h == null) {
            this.f1529h = new C0612n(getContext(), null, C0465a.toolbarNavigationButtonStyle);
            LayoutParams j = m2797j();
            j.a = 8388611 | (this.f1524c & C0474j.AppCompatTheme_spinnerStyle);
            this.f1529h.setLayoutParams(j);
        }
    }

    private void m2778q() {
        removeCallbacks(this.f1521O);
        post(this.f1521O);
    }

    private boolean m2779r() {
        if (!this.f1520N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2768a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void m2780s() {
        if (this.f1542u == null) {
            this.f1542u = new an();
        }
    }

    public C0559b m2781a(AttributeSet attributeSet) {
        return new C0559b(getContext(), attributeSet);
    }

    protected C0559b m2782a(LayoutParams layoutParams) {
        return layoutParams instanceof C0559b ? new C0559b((C0559b) layoutParams) : layoutParams instanceof C0393a ? new C0559b((C0393a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0559b((MarginLayoutParams) layoutParams) : new C0559b(layoutParams);
    }

    public void m2783a(int i, int i2) {
        m2780s();
        this.f1542u.m2897a(i, i2);
    }

    public void m2784a(Context context, int i) {
        this.f1535n = i;
        if (this.f1527f != null) {
            this.f1527f.setTextAppearance(context, i);
        }
    }

    public void m2785a(C0515h c0515h, C0593d c0593d) {
        if (c0515h != null || this.f1526e != null) {
            m2776o();
            C0515h d = this.f1526e.m2687d();
            if (d != c0515h) {
                if (d != null) {
                    d.m2481b(this.f1516J);
                    d.m2481b(this.f1517K);
                }
                if (this.f1517K == null) {
                    this.f1517K = new C0558a(this);
                }
                c0593d.m3051d(true);
                if (c0515h != null) {
                    c0515h.m2471a((C0501o) c0593d, this.f1533l);
                    c0515h.m2471a(this.f1517K, this.f1533l);
                } else {
                    c0593d.m3037a(this.f1533l, null);
                    this.f1517K.m2746a(this.f1533l, null);
                    c0593d.m3047b(true);
                    this.f1517K.m2751b(true);
                }
                this.f1526e.setPopupTheme(this.f1534m);
                this.f1526e.setPresenter(c0593d);
                this.f1516J = c0593d;
            }
        }
    }

    public void m2786a(C0442a c0442a, C0425a c0425a) {
        this.f1518L = c0442a;
        this.f1519M = c0425a;
        if (this.f1526e != null) {
            this.f1526e.m2679a(c0442a, c0425a);
        }
    }

    public boolean m2787a() {
        return getVisibility() == 0 && this.f1526e != null && this.f1526e.m2680a();
    }

    public void m2788b(Context context, int i) {
        this.f1536o = i;
        if (this.f1528g != null) {
            this.f1528g.setTextAppearance(context, i);
        }
    }

    public boolean m2789b() {
        return this.f1526e != null && this.f1526e.m2690g();
    }

    public boolean m2790c() {
        return this.f1526e != null && this.f1526e.m2691h();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0559b);
    }

    public boolean m2791d() {
        return this.f1526e != null && this.f1526e.m2688e();
    }

    public boolean m2792e() {
        return this.f1526e != null && this.f1526e.m2689f();
    }

    public void m2793f() {
        if (this.f1526e != null) {
            this.f1526e.m2692i();
        }
    }

    public boolean m2794g() {
        return (this.f1517K == null || this.f1517K.f1502b == null) ? false : true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2797j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2781a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m2782a(layoutParams);
    }

    public int getContentInsetEnd() {
        return this.f1542u != null ? this.f1542u.m2902d() : 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f1544w != Integer.MIN_VALUE ? this.f1544w : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        return this.f1542u != null ? this.f1542u.m2896a() : 0;
    }

    public int getContentInsetRight() {
        return this.f1542u != null ? this.f1542u.m2899b() : 0;
    }

    public int getContentInsetStart() {
        return this.f1542u != null ? this.f1542u.m2901c() : 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f1543v != Integer.MIN_VALUE ? this.f1543v : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        int i;
        if (this.f1526e != null) {
            C0515h d = this.f1526e.m2687d();
            i = (d == null || !d.hasVisibleItems()) ? 0 : 1;
        } else {
            i = 0;
        }
        return i != 0 ? Math.max(getContentInsetEnd(), Math.max(this.f1544w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return ae.m1147d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return ae.m1147d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1543v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        return this.f1530i != null ? this.f1530i.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        return this.f1530i != null ? this.f1530i.getContentDescription() : null;
    }

    public Menu getMenu() {
        m2775n();
        return this.f1526e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        return this.f1529h != null ? this.f1529h.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        return this.f1529h != null ? this.f1529h.getDrawable() : null;
    }

    public Drawable getOverflowIcon() {
        m2775n();
        return this.f1526e.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.f1534m;
    }

    public CharSequence getSubtitle() {
        return this.f1547z;
    }

    public CharSequence getTitle() {
        return this.f1546y;
    }

    public int getTitleMarginBottom() {
        return this.f1541t;
    }

    public int getTitleMarginEnd() {
        return this.f1539r;
    }

    public int getTitleMarginStart() {
        return this.f1538q;
    }

    public int getTitleMarginTop() {
        return this.f1540s;
    }

    public ac getWrapper() {
        if (this.f1515I == null) {
            this.f1515I = new aw(this, true);
        }
        return this.f1515I;
    }

    public void m2795h() {
        C0518j c0518j = this.f1517K == null ? null : this.f1517K.f1502b;
        if (c0518j != null) {
            c0518j.collapseActionView();
        }
    }

    void m2796i() {
        if (this.f1522a == null) {
            this.f1522a = new C0612n(getContext(), null, C0465a.toolbarNavigationButtonStyle);
            this.f1522a.setImageDrawable(this.f1531j);
            this.f1522a.setContentDescription(this.f1532k);
            LayoutParams j = m2797j();
            j.a = 8388611 | (this.f1524c & C0474j.AppCompatTheme_spinnerStyle);
            j.f1504b = 2;
            this.f1522a.setLayoutParams(j);
            this.f1522a.setOnClickListener(new C05573(this));
        }
    }

    protected C0559b m2797j() {
        return new C0559b(-2, -2);
    }

    void m2798k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0559b) childAt.getLayoutParams()).f1504b == 2 || childAt == this.f1526e)) {
                removeViewAt(childCount);
                this.f1512F.add(childAt);
            }
        }
    }

    void m2799l() {
        for (int size = this.f1512F.size() - 1; size >= 0; size--) {
            addView((View) this.f1512F.get(size));
        }
        this.f1512F.clear();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1521O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = C0324t.m1535a(motionEvent);
        if (a == 9) {
            this.f1510D = false;
        }
        if (!this.f1510D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f1510D = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f1510D = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int measuredWidth;
        Object obj = ae.m1147d(this) == 1 ? 1 : null;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i5 = width - paddingRight;
        int[] iArr = this.f1513G;
        iArr[1] = 0;
        iArr[0] = 0;
        int i6 = ae.m1153i(this);
        int min = i6 >= 0 ? Math.min(i6, i4 - i2) : 0;
        if (!m2768a(this.f1529h)) {
            i6 = i5;
            i5 = paddingLeft;
        } else if (obj != null) {
            i6 = m2771b(this.f1529h, i5, iArr, min);
            i5 = paddingLeft;
        } else {
            int i7 = i5;
            i5 = m2763a(this.f1529h, paddingLeft, iArr, min);
            i6 = i7;
        }
        if (m2768a(this.f1522a)) {
            if (obj != null) {
                i6 = m2771b(this.f1522a, i6, iArr, min);
            } else {
                i5 = m2763a(this.f1522a, i5, iArr, min);
            }
        }
        if (m2768a(this.f1526e)) {
            if (obj != null) {
                i5 = m2763a(this.f1526e, i5, iArr, min);
            } else {
                i6 = m2771b(this.f1526e, i6, iArr, min);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i5);
        iArr[1] = Math.max(0, currentContentInsetRight - ((width - paddingRight) - i6));
        i5 = Math.max(i5, currentContentInsetLeft);
        i6 = Math.min(i6, (width - paddingRight) - currentContentInsetRight);
        if (m2768a(this.f1523b)) {
            if (obj != null) {
                i6 = m2771b(this.f1523b, i6, iArr, min);
            } else {
                i5 = m2763a(this.f1523b, i5, iArr, min);
            }
        }
        if (!m2768a(this.f1530i)) {
            currentContentInsetLeft = i6;
            currentContentInsetRight = i5;
        } else if (obj != null) {
            currentContentInsetLeft = m2771b(this.f1530i, i6, iArr, min);
            currentContentInsetRight = i5;
        } else {
            currentContentInsetLeft = i6;
            currentContentInsetRight = m2763a(this.f1530i, i5, iArr, min);
        }
        boolean a = m2768a(this.f1527f);
        boolean a2 = m2768a(this.f1528g);
        i5 = 0;
        if (a) {
            C0559b c0559b = (C0559b) this.f1527f.getLayoutParams();
            i5 = 0 + (c0559b.bottomMargin + (c0559b.topMargin + this.f1527f.getMeasuredHeight()));
        }
        if (a2) {
            c0559b = (C0559b) this.f1528g.getLayoutParams();
            measuredHeight = (c0559b.bottomMargin + (c0559b.topMargin + this.f1528g.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (a || a2) {
            int paddingTop2;
            c0559b = (C0559b) (a ? this.f1527f : this.f1528g).getLayoutParams();
            C0559b c0559b2 = (C0559b) (a2 ? this.f1528g : this.f1527f).getLayoutParams();
            Object obj2 = ((!a || this.f1527f.getMeasuredWidth() <= 0) && (!a2 || this.f1528g.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.f1545x & C0474j.AppCompatTheme_spinnerStyle) {
                case C0474j.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                    paddingTop2 = (c0559b.topMargin + getPaddingTop()) + this.f1540s;
                    break;
                case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                    paddingTop2 = (((height - paddingBottom) - c0559b2.bottomMargin) - this.f1541t) - measuredHeight;
                    break;
                default:
                    paddingTop2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop2 < c0559b.topMargin + this.f1540s) {
                        i6 = c0559b.topMargin + this.f1540s;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop2) - paddingTop;
                        i6 = measuredHeight < c0559b.bottomMargin + this.f1541t ? Math.max(0, paddingTop2 - ((c0559b2.bottomMargin + this.f1541t) - measuredHeight)) : paddingTop2;
                    }
                    paddingTop2 = paddingTop + i6;
                    break;
            }
            if (obj != null) {
                i6 = (obj2 != null ? this.f1538q : 0) - iArr[1];
                i5 = currentContentInsetLeft - Math.max(0, i6);
                iArr[1] = Math.max(0, -i6);
                if (a) {
                    c0559b = (C0559b) this.f1527f.getLayoutParams();
                    measuredWidth = i5 - this.f1527f.getMeasuredWidth();
                    currentContentInsetLeft = this.f1527f.getMeasuredHeight() + paddingTop2;
                    this.f1527f.layout(measuredWidth, paddingTop2, i5, currentContentInsetLeft);
                    paddingTop2 = currentContentInsetLeft + c0559b.bottomMargin;
                    currentContentInsetLeft = measuredWidth - this.f1539r;
                } else {
                    currentContentInsetLeft = i5;
                }
                if (a2) {
                    c0559b = (C0559b) this.f1528g.getLayoutParams();
                    measuredWidth = c0559b.topMargin + paddingTop2;
                    measuredHeight = this.f1528g.getMeasuredHeight() + measuredWidth;
                    this.f1528g.layout(i5 - this.f1528g.getMeasuredWidth(), measuredWidth, i5, measuredHeight);
                    i6 = c0559b.bottomMargin + measuredHeight;
                    i6 = i5 - this.f1539r;
                } else {
                    i6 = i5;
                }
                currentContentInsetLeft = obj2 != null ? Math.min(currentContentInsetLeft, i6) : i5;
            } else {
                i6 = (obj2 != null ? this.f1538q : 0) - iArr[0];
                currentContentInsetRight += Math.max(0, i6);
                iArr[0] = Math.max(0, -i6);
                if (a) {
                    c0559b = (C0559b) this.f1527f.getLayoutParams();
                    i5 = this.f1527f.getMeasuredWidth() + currentContentInsetRight;
                    measuredWidth = this.f1527f.getMeasuredHeight() + paddingTop2;
                    this.f1527f.layout(currentContentInsetRight, paddingTop2, i5, measuredWidth);
                    i6 = c0559b.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.f1539r;
                    i5 = i6;
                } else {
                    measuredWidth = currentContentInsetRight;
                    i5 = paddingTop2;
                }
                if (a2) {
                    c0559b = (C0559b) this.f1528g.getLayoutParams();
                    i5 += c0559b.topMargin;
                    paddingTop2 = this.f1528g.getMeasuredWidth() + currentContentInsetRight;
                    measuredHeight = this.f1528g.getMeasuredHeight() + i5;
                    this.f1528g.layout(currentContentInsetRight, i5, paddingTop2, measuredHeight);
                    i6 = c0559b.bottomMargin + measuredHeight;
                    i6 = this.f1539r + paddingTop2;
                } else {
                    i6 = currentContentInsetRight;
                }
                if (obj2 != null) {
                    currentContentInsetRight = Math.max(measuredWidth, i6);
                }
            }
        }
        m2767a(this.f1511E, 3);
        int size = this.f1511E.size();
        i5 = currentContentInsetRight;
        for (measuredWidth = 0; measuredWidth < size; measuredWidth++) {
            i5 = m2763a((View) this.f1511E.get(measuredWidth), i5, iArr, min);
        }
        m2767a(this.f1511E, 5);
        currentContentInsetRight = this.f1511E.size();
        for (measuredWidth = 0; measuredWidth < currentContentInsetRight; measuredWidth++) {
            currentContentInsetLeft = m2771b((View) this.f1511E.get(measuredWidth), currentContentInsetLeft, iArr, min);
        }
        m2767a(this.f1511E, 1);
        measuredWidth = m2764a(this.f1511E, iArr);
        i6 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        measuredWidth += i6;
        if (i6 < i5) {
            i6 = i5;
        } else if (measuredWidth > currentContentInsetLeft) {
            i6 -= measuredWidth - currentContentInsetLeft;
        }
        paddingLeft = this.f1511E.size();
        measuredWidth = i6;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = m2763a((View) this.f1511E.get(i5), measuredWidth, iArr, min);
        }
        this.f1511E.clear();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.f1513G;
        if (ay.m3016a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i7 = 0;
        if (m2768a(this.f1529h)) {
            m2765a(this.f1529h, i, 0, i2, 0, this.f1537p);
            i7 = this.f1529h.getMeasuredWidth() + m2770b(this.f1529h);
            max = Math.max(0, this.f1529h.getMeasuredHeight() + m2772c(this.f1529h));
            i6 = ay.m3014a(0, ae.m1151g(this.f1529h));
            i5 = max;
        }
        if (m2768a(this.f1522a)) {
            m2765a(this.f1522a, i, 0, i2, 0, this.f1537p);
            i7 = this.f1522a.getMeasuredWidth() + m2770b(this.f1522a);
            i5 = Math.max(i5, this.f1522a.getMeasuredHeight() + m2772c(this.f1522a));
            i6 = ay.m3014a(i6, ae.m1151g(this.f1522a));
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = 0 + Math.max(currentContentInsetStart, i7);
        iArr[i4] = Math.max(0, currentContentInsetStart - i7);
        i7 = 0;
        if (m2768a(this.f1526e)) {
            m2765a(this.f1526e, i, max2, i2, 0, this.f1537p);
            i7 = this.f1526e.getMeasuredWidth() + m2770b(this.f1526e);
            i5 = Math.max(i5, this.f1526e.getMeasuredHeight() + m2772c(this.f1526e));
            i6 = ay.m3014a(i6, ae.m1151g(this.f1526e));
        }
        currentContentInsetStart = getCurrentContentInsetEnd();
        max2 += Math.max(currentContentInsetStart, i7);
        iArr[i3] = Math.max(0, currentContentInsetStart - i7);
        if (m2768a(this.f1523b)) {
            max2 += m2762a(this.f1523b, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f1523b.getMeasuredHeight() + m2772c(this.f1523b));
            i6 = ay.m3014a(i6, ae.m1151g(this.f1523b));
        }
        if (m2768a(this.f1530i)) {
            max2 += m2762a(this.f1530i, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f1530i.getMeasuredHeight() + m2772c(this.f1530i));
            i6 = ay.m3014a(i6, ae.m1151g(this.f1530i));
        }
        i4 = getChildCount();
        i3 = 0;
        int i8 = i5;
        i5 = i6;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((C0559b) childAt.getLayoutParams()).f1504b != 0) {
                i7 = i5;
                currentContentInsetStart = i8;
            } else if (m2768a(childAt)) {
                max2 += m2762a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i8, childAt.getMeasuredHeight() + m2772c(childAt));
                i7 = ay.m3014a(i5, ae.m1151g(childAt));
                currentContentInsetStart = max;
            } else {
                i7 = i5;
                currentContentInsetStart = i8;
            }
            i3++;
            i5 = i7;
            i8 = currentContentInsetStart;
        }
        currentContentInsetStart = 0;
        i7 = 0;
        i6 = this.f1540s + this.f1541t;
        max = this.f1538q + this.f1539r;
        if (m2768a(this.f1527f)) {
            m2762a(this.f1527f, i, max2 + max, i2, i6, iArr);
            currentContentInsetStart = m2770b(this.f1527f) + this.f1527f.getMeasuredWidth();
            i7 = this.f1527f.getMeasuredHeight() + m2772c(this.f1527f);
            i5 = ay.m3014a(i5, ae.m1151g(this.f1527f));
        }
        if (m2768a(this.f1528g)) {
            currentContentInsetStart = Math.max(currentContentInsetStart, m2762a(this.f1528g, i, max2 + max, i2, i6 + i7, iArr));
            i7 += this.f1528g.getMeasuredHeight() + m2772c(this.f1528g);
            i5 = ay.m3014a(i5, ae.m1151g(this.f1528g));
        }
        currentContentInsetStart += max2;
        i7 = Math.max(i8, i7) + (getPaddingTop() + getPaddingBottom());
        currentContentInsetStart = ae.m1126a(Math.max(currentContentInsetStart + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, -16777216 & i5);
        i7 = ae.m1126a(Math.max(i7, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (m2779r()) {
            i7 = 0;
        }
        setMeasuredDimension(currentContentInsetStart, i7);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0562d) {
            C0562d c0562d = (C0562d) parcelable;
            super.onRestoreInstanceState(c0562d.m682a());
            Menu d = this.f1526e != null ? this.f1526e.m2687d() : null;
            if (!(c0562d.f1505b == 0 || this.f1517K == null || d == null)) {
                MenuItem findItem = d.findItem(c0562d.f1505b);
                if (findItem != null) {
                    C0317q.m1523b(findItem);
                }
            }
            if (c0562d.f1506c) {
                m2778q();
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2780s();
        an anVar = this.f1542u;
        if (i != 1) {
            z = false;
        }
        anVar.m2898a(z);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0562d = new C0562d(super.onSaveInstanceState());
        if (!(this.f1517K == null || this.f1517K.f1502b == null)) {
            c0562d.f1505b = this.f1517K.f1502b.getItemId();
        }
        c0562d.f1506c = m2789b();
        return c0562d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0324t.m1535a(motionEvent);
        if (a == 0) {
            this.f1509C = false;
        }
        if (!this.f1509C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f1509C = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f1509C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f1520N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1544w) {
            this.f1544w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1543v) {
            this.f1543v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0478b.m2246b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2774m();
            if (!m2773d(this.f1530i)) {
                m2766a(this.f1530i, true);
            }
        } else if (this.f1530i != null && m2773d(this.f1530i)) {
            removeView(this.f1530i);
            this.f1512F.remove(this.f1530i);
        }
        if (this.f1530i != null) {
            this.f1530i.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2774m();
        }
        if (this.f1530i != null) {
            this.f1530i.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2777p();
        }
        if (this.f1529h != null) {
            this.f1529h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0478b.m2246b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2777p();
            if (!m2773d(this.f1529h)) {
                m2766a(this.f1529h, true);
            }
        } else if (this.f1529h != null && m2773d(this.f1529h)) {
            removeView(this.f1529h);
            this.f1512F.remove(this.f1529h);
        }
        if (this.f1529h != null) {
            this.f1529h.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m2777p();
        this.f1529h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0560c c0560c) {
        this.f1525d = c0560c;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2775n();
        this.f1526e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1534m != i) {
            this.f1534m = i;
            if (i == 0) {
                this.f1533l = getContext();
            } else {
                this.f1533l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1528g == null) {
                Context context = getContext();
                this.f1528g = new aa(context);
                this.f1528g.setSingleLine();
                this.f1528g.setEllipsize(TruncateAt.END);
                if (this.f1536o != 0) {
                    this.f1528g.setTextAppearance(context, this.f1536o);
                }
                if (this.f1508B != 0) {
                    this.f1528g.setTextColor(this.f1508B);
                }
            }
            if (!m2773d(this.f1528g)) {
                m2766a(this.f1528g, true);
            }
        } else if (this.f1528g != null && m2773d(this.f1528g)) {
            removeView(this.f1528g);
            this.f1512F.remove(this.f1528g);
        }
        if (this.f1528g != null) {
            this.f1528g.setText(charSequence);
        }
        this.f1547z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1508B = i;
        if (this.f1528g != null) {
            this.f1528g.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1527f == null) {
                Context context = getContext();
                this.f1527f = new aa(context);
                this.f1527f.setSingleLine();
                this.f1527f.setEllipsize(TruncateAt.END);
                if (this.f1535n != 0) {
                    this.f1527f.setTextAppearance(context, this.f1535n);
                }
                if (this.f1507A != 0) {
                    this.f1527f.setTextColor(this.f1507A);
                }
            }
            if (!m2773d(this.f1527f)) {
                m2766a(this.f1527f, true);
            }
        } else if (this.f1527f != null && m2773d(this.f1527f)) {
            removeView(this.f1527f);
            this.f1512F.remove(this.f1527f);
        }
        if (this.f1527f != null) {
            this.f1527f.setText(charSequence);
        }
        this.f1546y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1541t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1539r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1538q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1540s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f1507A = i;
        if (this.f1527f != null) {
            this.f1527f.setTextColor(i);
        }
    }
}
