package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p005b.C0035a;
import android.support.v4.p007g.C0173a;
import android.support.v4.p007g.C0275b;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.aq;
import android.support.v4.p007g.p013a.C0194b;
import android.support.v4.p007g.p013a.C0194b.C0182a;
import android.support.v4.p011e.C0154d;
import android.support.v4.p011e.C0155e;
import android.support.v4.widget.C0392y.C0341a;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements C0343i {
    static final int[] f581a;
    static final boolean f582b;
    static final C0333c f583c;
    private static final boolean f584d;
    private float f585A;
    private Drawable f586B;
    private Drawable f587C;
    private Drawable f588D;
    private CharSequence f589E;
    private CharSequence f590F;
    private Object f591G;
    private boolean f592H;
    private Drawable f593I;
    private Drawable f594J;
    private Drawable f595K;
    private Drawable f596L;
    private final ArrayList<View> f597M;
    private final C0332b f598e;
    private float f599f;
    private int f600g;
    private int f601h;
    private float f602i;
    private Paint f603j;
    private final C0392y f604k;
    private final C0392y f605l;
    private final C0342i f606m;
    private final C0342i f607n;
    private int f608o;
    private boolean f609p;
    private boolean f610q;
    private int f611r;
    private int f612s;
    private int f613t;
    private int f614u;
    private boolean f615v;
    private boolean f616w;
    private C0336f f617x;
    private List<C0336f> f618y;
    private float f619z;

    /* renamed from: android.support.v4.widget.DrawerLayout.a */
    class C0331a extends C0275b {
        final /* synthetic */ DrawerLayout f564b;
        private final Rect f565c;

        C0331a(DrawerLayout drawerLayout) {
            this.f564b = drawerLayout;
            this.f565c = new Rect();
        }

        private void m1551a(C0194b c0194b, C0194b c0194b2) {
            Rect rect = this.f565c;
            c0194b2.m843a(rect);
            c0194b.m849b(rect);
            c0194b2.m853c(rect);
            c0194b.m858d(rect);
            c0194b.m856c(c0194b2.m866g());
            c0194b.m845a(c0194b2.m876o());
            c0194b.m851b(c0194b2.m877p());
            c0194b.m855c(c0194b2.m879r());
            c0194b.m867h(c0194b2.m873l());
            c0194b.m863f(c0194b2.m871j());
            c0194b.m846a(c0194b2.m862e());
            c0194b.m852b(c0194b2.m864f());
            c0194b.m859d(c0194b2.m868h());
            c0194b.m861e(c0194b2.m870i());
            c0194b.m865g(c0194b2.m872k());
            c0194b.m842a(c0194b2.m848b());
        }

        private void m1552a(C0194b c0194b, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m1618l(childAt)) {
                    c0194b.m850b(childAt);
                }
            }
        }

        public void m1553a(View view, C0194b c0194b) {
            if (DrawerLayout.f582b) {
                super.m1403a(view, c0194b);
            } else {
                C0194b a = C0194b.m838a(c0194b);
                super.m1403a(view, a);
                c0194b.m844a(view);
                ViewParent e = ae.m1149e(view);
                if (e instanceof View) {
                    c0194b.m854c((View) e);
                }
                m1551a(c0194b, a);
                a.m880s();
                m1552a(c0194b, (ViewGroup) view);
            }
            c0194b.m851b(DrawerLayout.class.getName());
            c0194b.m846a(false);
            c0194b.m852b(false);
            c0194b.m847a(C0182a.f465a);
            c0194b.m847a(C0182a.f466b);
        }

        public boolean m1554a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return (DrawerLayout.f582b || DrawerLayout.m1618l(view)) ? super.m1406a(viewGroup, view, accessibilityEvent) : false;
        }

        public boolean m1555b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.m1407b(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View c = this.f564b.m1639c();
            if (c != null) {
                CharSequence b = this.f564b.m1632b(this.f564b.m1645e(c));
                if (b != null) {
                    text.add(b);
                }
            }
            return true;
        }

        public void m1556d(View view, AccessibilityEvent accessibilityEvent) {
            super.m1409d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.b */
    final class C0332b extends C0275b {
        final /* synthetic */ DrawerLayout f566b;

        C0332b(DrawerLayout drawerLayout) {
            this.f566b = drawerLayout;
        }

        public void m1557a(View view, C0194b c0194b) {
            super.m1403a(view, c0194b);
            if (!DrawerLayout.m1618l(view)) {
                c0194b.m854c(null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.c */
    interface C0333c {
        int m1558a(Object obj);

        Drawable m1559a(Context context);

        void m1560a(View view);

        void m1561a(View view, Object obj, int i);

        void m1562a(MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.d */
    static class C0334d implements C0333c {
        C0334d() {
        }

        public int m1563a(Object obj) {
            return C0365h.m1756a(obj);
        }

        public Drawable m1564a(Context context) {
            return C0365h.m1757a(context);
        }

        public void m1565a(View view) {
            C0365h.m1758a(view);
        }

        public void m1566a(View view, Object obj, int i) {
            C0365h.m1759a(view, obj, i);
        }

        public void m1567a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
            C0365h.m1760a(marginLayoutParams, obj, i);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.e */
    static class C0335e implements C0333c {
        C0335e() {
        }

        public int m1568a(Object obj) {
            return 0;
        }

        public Drawable m1569a(Context context) {
            return null;
        }

        public void m1570a(View view) {
        }

        public void m1571a(View view, Object obj, int i) {
        }

        public void m1572a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.f */
    public interface C0336f {
        void m1573a(int i);

        void m1574a(View view);

        void m1575a(View view, float f);

        void m1576b(View view);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.g */
    public static class C0337g extends MarginLayoutParams {
        public int f567a;
        float f568b;
        boolean f569c;
        int f570d;

        public C0337g(int i, int i2) {
            super(i, i2);
            this.f567a = 0;
        }

        public C0337g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f567a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f581a);
            this.f567a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0337g(C0337g c0337g) {
            super(c0337g);
            this.f567a = 0;
            this.f567a = c0337g.f567a;
        }

        public C0337g(LayoutParams layoutParams) {
            super(layoutParams);
            this.f567a = 0;
        }

        public C0337g(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f567a = 0;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.h */
    protected static class C0339h extends C0173a {
        public static final Creator<C0339h> CREATOR;
        int f571b;
        int f572c;
        int f573d;
        int f574e;
        int f575f;

        /* renamed from: android.support.v4.widget.DrawerLayout.h.1 */
        static class C03381 implements C0155e<C0339h> {
            C03381() {
            }

            public /* synthetic */ Object m1577a(Parcel parcel, ClassLoader classLoader) {
                return m1579b(parcel, classLoader);
            }

            public /* synthetic */ Object[] m1578a(int i) {
                return m1580b(i);
            }

            public C0339h m1579b(Parcel parcel, ClassLoader classLoader) {
                return new C0339h(parcel, classLoader);
            }

            public C0339h[] m1580b(int i) {
                return new C0339h[i];
            }
        }

        static {
            CREATOR = C0154d.m600a(new C03381());
        }

        public C0339h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f571b = 0;
            this.f571b = parcel.readInt();
            this.f572c = parcel.readInt();
            this.f573d = parcel.readInt();
            this.f574e = parcel.readInt();
            this.f575f = parcel.readInt();
        }

        public C0339h(Parcelable parcelable) {
            super(parcelable);
            this.f571b = 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f571b);
            parcel.writeInt(this.f572c);
            parcel.writeInt(this.f573d);
            parcel.writeInt(this.f574e);
            parcel.writeInt(this.f575f);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout.i */
    private class C0342i extends C0341a {
        final /* synthetic */ DrawerLayout f577a;
        private final int f578b;
        private C0392y f579c;
        private final Runnable f580d;

        /* renamed from: android.support.v4.widget.DrawerLayout.i.1 */
        class C03401 implements Runnable {
            final /* synthetic */ C0342i f576a;

            C03401(C0342i c0342i) {
                this.f576a = c0342i;
            }

            public void run() {
                this.f576a.m1605b();
            }
        }

        C0342i(DrawerLayout drawerLayout, int i) {
            this.f577a = drawerLayout;
            this.f580d = new C03401(this);
            this.f578b = i;
        }

        private void m1594c() {
            int i = 3;
            if (this.f578b == 3) {
                i = 5;
            }
            View c = this.f577a.m1640c(i);
            if (c != null) {
                this.f577a.m1651i(c);
            }
        }

        public int m1595a(View view) {
            return this.f577a.m1649g(view) ? view.getWidth() : 0;
        }

        public int m1596a(View view, int i, int i2) {
            if (this.f577a.m1631a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = this.f577a.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public void m1597a() {
            this.f577a.removeCallbacks(this.f580d);
        }

        public void m1598a(int i) {
            this.f577a.m1624a(this.f578b, i, this.f579c.m1873c());
        }

        public void m1599a(int i, int i2) {
            this.f577a.postDelayed(this.f580d, 160);
        }

        public void m1600a(C0392y c0392y) {
            this.f579c = c0392y;
        }

        public void m1601a(View view, float f, float f2) {
            int i;
            float d = this.f577a.m1643d(view);
            int width = view.getWidth();
            if (this.f577a.m1631a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
            } else {
                i = this.f577a.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    i -= width;
                }
            }
            this.f579c.m1863a(i, view.getTop());
            this.f577a.invalidate();
        }

        public void m1602a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = this.f577a.m1631a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.f577a.getWidth() - i)) / ((float) width);
            this.f577a.m1637b(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            this.f577a.invalidate();
        }

        public boolean m1603a(View view, int i) {
            return this.f577a.m1649g(view) && this.f577a.m1631a(view, this.f578b) && this.f577a.m1621a(view) == 0;
        }

        public int m1604b(View view, int i, int i2) {
            return view.getTop();
        }

        void m1605b() {
            View view;
            int i;
            int i2 = 0;
            int b = this.f579c.m1867b();
            boolean z = this.f578b == 3;
            if (z) {
                View c = this.f577a.m1640c(3);
                if (c != null) {
                    i2 = -c.getWidth();
                }
                i2 += b;
                view = c;
                i = i2;
            } else {
                i2 = this.f577a.getWidth() - b;
                view = this.f577a.m1640c(5);
                i = i2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.f577a.m1621a(view) == 0) {
                C0337g c0337g = (C0337g) view.getLayoutParams();
                this.f579c.m1865a(view, i, view.getTop());
                c0337g.f569c = true;
                this.f577a.invalidate();
                m1594c();
                this.f577a.m1644d();
            }
        }

        public void m1606b(int i, int i2) {
            View c = (i & 1) == 1 ? this.f577a.m1640c(3) : this.f577a.m1640c(5);
            if (c != null && this.f577a.m1621a(c) == 0) {
                this.f579c.m1862a(c, i2);
            }
        }

        public void m1607b(View view, int i) {
            ((C0337g) view.getLayoutParams()).f569c = false;
            m1594c();
        }

        public boolean m1608b(int i) {
            return false;
        }
    }

    static {
        boolean z = true;
        f581a = new int[]{16842931};
        f582b = VERSION.SDK_INT >= 19;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f584d = z;
        if (VERSION.SDK_INT >= 21) {
            f583c = new C0334d();
        } else {
            f583c = new C0335e();
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f598e = new C0332b(this);
        this.f601h = -1728053248;
        this.f603j = new Paint();
        this.f610q = true;
        this.f611r = 3;
        this.f612s = 3;
        this.f613t = 3;
        this.f614u = 3;
        this.f593I = null;
        this.f594J = null;
        this.f595K = null;
        this.f596L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f600g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f606m = new C0342i(this, 3);
        this.f607n = new C0342i(this, 5);
        this.f604k = C0392y.m1841a((ViewGroup) this, 1.0f, this.f606m);
        this.f604k.m1861a(1);
        this.f604k.m1860a(f2);
        this.f606m.m1600a(this.f604k);
        this.f605l = C0392y.m1841a((ViewGroup) this, 1.0f, this.f607n);
        this.f605l.m1861a(2);
        this.f605l.m1860a(f2);
        this.f607n.m1600a(this.f605l);
        setFocusableInTouchMode(true);
        ae.m1142b((View) this, 1);
        ae.m1134a((View) this, new C0331a(this));
        aq.m1233a(this, false);
        if (ae.m1158n(this)) {
            f583c.m1560a((View) this);
            this.f586B = f583c.m1559a(context);
        }
        this.f599f = f * 10.0f;
        this.f597M = new ArrayList();
    }

    private boolean m1610a(Drawable drawable, int i) {
        if (drawable == null || !C0129a.m544b(drawable)) {
            return false;
        }
        C0129a.m545b(drawable, i);
        return true;
    }

    private void m1611c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m1649g(childAt)) && !(z && childAt == view)) {
                ae.m1142b(childAt, 4);
            } else {
                ae.m1142b(childAt, 1);
            }
        }
    }

    static String m1612d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private void m1613e() {
        if (!f584d) {
            this.f587C = m1614f();
            this.f588D = m1615g();
        }
    }

    private Drawable m1614f() {
        int d = ae.m1147d(this);
        if (d == 0) {
            if (this.f593I != null) {
                m1610a(this.f593I, d);
                return this.f593I;
            }
        } else if (this.f594J != null) {
            m1610a(this.f594J, d);
            return this.f594J;
        }
        return this.f595K;
    }

    private Drawable m1615g() {
        int d = ae.m1147d(this);
        if (d == 0) {
            if (this.f594J != null) {
                m1610a(this.f594J, d);
                return this.f594J;
            }
        } else if (this.f593I != null) {
            m1610a(this.f593I, d);
            return this.f593I;
        }
        return this.f596L;
    }

    private boolean m1616h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0337g) getChildAt(i).getLayoutParams()).f569c) {
                return true;
            }
        }
        return false;
    }

    private boolean m1617i() {
        return m1639c() != null;
    }

    static boolean m1618l(View view) {
        return (ae.m1140b(view) == 4 || ae.m1140b(view) == 2) ? false : true;
    }

    private static boolean m1619m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int m1620a(int i) {
        int d = ae.m1147d(this);
        switch (i) {
            case C0474j.View_paddingEnd /*3*/:
                if (this.f611r != 3) {
                    return this.f611r;
                }
                d = d == 0 ? this.f613t : this.f614u;
                if (d != 3) {
                    return d;
                }
                break;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                if (this.f612s != 3) {
                    return this.f612s;
                }
                d = d == 0 ? this.f614u : this.f613t;
                if (d != 3) {
                    return d;
                }
                break;
            case 8388611:
                if (this.f613t != 3) {
                    return this.f613t;
                }
                d = d == 0 ? this.f611r : this.f612s;
                if (d != 3) {
                    return d;
                }
                break;
            case 8388613:
                if (this.f614u != 3) {
                    return this.f614u;
                }
                d = d == 0 ? this.f612s : this.f611r;
                if (d != 3) {
                    return d;
                }
                break;
        }
        return 0;
    }

    public int m1621a(View view) {
        if (m1649g(view)) {
            return m1620a(((C0337g) view.getLayoutParams()).f567a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    View m1622a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0337g) childAt.getLayoutParams()).f570d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public void m1623a(int i, int i2) {
        int a = C0290f.m1466a(i2, ae.m1147d(this));
        switch (i2) {
            case C0474j.View_paddingEnd /*3*/:
                this.f611r = i;
                break;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                this.f612s = i;
                break;
            case 8388611:
                this.f613t = i;
                break;
            case 8388613:
                this.f614u = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.f604k : this.f605l).m1879e();
        }
        View c;
        switch (i) {
            case C0474j.View_android_focusable /*1*/:
                c = m1640c(a);
                if (c != null) {
                    m1651i(c);
                }
            case C0474j.View_paddingStart /*2*/:
                c = m1640c(a);
                if (c != null) {
                    m1650h(c);
                }
            default:
        }
    }

    void m1624a(int i, int i2, View view) {
        int a = this.f604k.m1859a();
        int a2 = this.f605l.m1859a();
        a = (a == 1 || a2 == 1) ? 1 : (a == 2 || a2 == 2) ? 2 : 0;
        if (view != null && i2 == 0) {
            C0337g c0337g = (C0337g) view.getLayoutParams();
            if (c0337g.f568b == 0.0f) {
                m1636b(view);
            } else if (c0337g.f568b == 1.0f) {
                m1641c(view);
            }
        }
        if (a != this.f608o) {
            this.f608o = a;
            if (this.f618y != null) {
                for (int size = this.f618y.size() - 1; size >= 0; size--) {
                    ((C0336f) this.f618y.get(size)).m1573a(a);
                }
            }
        }
    }

    public void m1625a(int i, boolean z) {
        View c = m1640c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1612d(i));
        }
        m1628a(c, z);
    }

    public void m1626a(C0336f c0336f) {
        if (c0336f != null) {
            if (this.f618y == null) {
                this.f618y = new ArrayList();
            }
            this.f618y.add(c0336f);
        }
    }

    void m1627a(View view, float f) {
        if (this.f618y != null) {
            for (int size = this.f618y.size() - 1; size >= 0; size--) {
                ((C0336f) this.f618y.get(size)).m1575a(view, f);
            }
        }
    }

    public void m1628a(View view, boolean z) {
        if (m1649g(view)) {
            C0337g c0337g = (C0337g) view.getLayoutParams();
            if (this.f610q) {
                c0337g.f568b = 1.0f;
                c0337g.f570d = 1;
                m1611c(view, true);
            } else if (z) {
                c0337g.f570d |= 2;
                if (m1631a(view, 3)) {
                    this.f604k.m1865a(view, 0, view.getTop());
                } else {
                    this.f605l.m1865a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m1642c(view, 1.0f);
                m1624a(c0337g.f567a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void m1629a(Object obj, boolean z) {
        this.f591G = obj;
        this.f592H = z;
        boolean z2 = !z && getBackground() == null;
        setWillNotDraw(z2);
        requestLayout();
    }

    void m1630a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0337g c0337g = (C0337g) childAt.getLayoutParams();
            if (m1649g(childAt) && (!z || c0337g.f569c)) {
                i = m1631a(childAt, 3) ? i | this.f604k.m1865a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.f605l.m1865a(childAt, getWidth(), childAt.getTop());
                c0337g.f569c = false;
            }
        }
        this.f606m.m1597a();
        this.f607n.m1597a();
        if (i != 0) {
            invalidate();
        }
    }

    boolean m1631a(View view, int i) {
        return (m1645e(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!m1649g(childAt)) {
                    this.f597M.add(childAt);
                } else if (m1652j(childAt)) {
                    i5 = 1;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (i5 == 0) {
                i4 = this.f597M.size();
                while (i3 < i4) {
                    View view = (View) this.f597M.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f597M.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m1622a() != null || m1649g(view)) {
            ae.m1142b(view, 4);
        } else {
            ae.m1142b(view, 1);
        }
        if (!f582b) {
            ae.m1134a(view, this.f598e);
        }
    }

    public CharSequence m1632b(int i) {
        int a = C0290f.m1466a(i, ae.m1147d(this));
        return a == 3 ? this.f589E : a == 5 ? this.f590F : null;
    }

    public void m1633b() {
        m1630a(false);
    }

    public void m1634b(int i, boolean z) {
        View c = m1640c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1612d(i));
        }
        m1638b(c, z);
    }

    public void m1635b(C0336f c0336f) {
        if (c0336f != null && this.f618y != null) {
            this.f618y.remove(c0336f);
        }
    }

    void m1636b(View view) {
        C0337g c0337g = (C0337g) view.getLayoutParams();
        if ((c0337g.f570d & 1) == 1) {
            c0337g.f570d = 0;
            if (this.f618y != null) {
                for (int size = this.f618y.size() - 1; size >= 0; size--) {
                    ((C0336f) this.f618y.get(size)).m1576b(view);
                }
            }
            m1611c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void m1637b(View view, float f) {
        C0337g c0337g = (C0337g) view.getLayoutParams();
        if (f != c0337g.f568b) {
            c0337g.f568b = f;
            m1627a(view, f);
        }
    }

    public void m1638b(View view, boolean z) {
        if (m1649g(view)) {
            C0337g c0337g = (C0337g) view.getLayoutParams();
            if (this.f610q) {
                c0337g.f568b = 0.0f;
                c0337g.f570d = 0;
            } else if (z) {
                c0337g.f570d |= 4;
                if (m1631a(view, 3)) {
                    this.f604k.m1865a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f605l.m1865a(view, getWidth(), view.getTop());
                }
            } else {
                m1642c(view, 0.0f);
                m1624a(c0337g.f567a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    View m1639c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1649g(childAt) && m1653k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    View m1640c(int i) {
        int a = C0290f.m1466a(i, ae.m1147d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m1645e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    void m1641c(View view) {
        C0337g c0337g = (C0337g) view.getLayoutParams();
        if ((c0337g.f570d & 1) == 0) {
            c0337g.f570d = 1;
            if (this.f618y != null) {
                for (int size = this.f618y.size() - 1; size >= 0; size--) {
                    ((C0336f) this.f618y.get(size)).m1574a(view);
                }
            }
            m1611c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    void m1642c(View view, float f) {
        float d = m1643d(view);
        int width = view.getWidth();
        int i = ((int) (((float) width) * f)) - ((int) (d * ((float) width)));
        if (!m1631a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m1637b(view, f);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0337g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0337g) getChildAt(i).getLayoutParams()).f568b);
        }
        this.f602i = f;
        if ((this.f604k.m1866a(true) | this.f605l.m1866a(true)) != 0) {
            ae.m1128a(this);
        }
    }

    float m1643d(View view) {
        return ((C0337g) view.getLayoutParams()).f568b;
    }

    void m1644d() {
        int i = 0;
        if (!this.f616w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.f616w = true;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = m1648f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m1619m(childAt) && m1649g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (m1631a(childAt, 3)) {
                        i = childAt.getRight();
                        if (i <= i2) {
                            i = i2;
                        }
                        i2 = i;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        i = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f602i > 0.0f && f) {
            this.f603j.setColor((((int) (((float) ((this.f601h & -16777216) >>> 24)) * this.f602i)) << 24) | (this.f601h & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f603j);
        } else if (this.f587C != null && m1631a(view, 3)) {
            i = this.f587C.getIntrinsicWidth();
            i2 = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i2) / ((float) this.f604k.m1867b()), 1.0f));
            this.f587C.setBounds(i2, view.getTop(), i + i2, view.getBottom());
            this.f587C.setAlpha((int) (255.0f * r2));
            this.f587C.draw(canvas);
        } else if (this.f588D != null && m1631a(view, 5)) {
            i = this.f588D.getIntrinsicWidth();
            i2 = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.f605l.m1867b()), 1.0f));
            this.f588D.setBounds(i2 - i, view.getTop(), i2, view.getBottom());
            this.f588D.setAlpha((int) (255.0f * r2));
            this.f588D.draw(canvas);
        }
        return drawChild;
    }

    int m1645e(View view) {
        return C0290f.m1466a(((C0337g) view.getLayoutParams()).f567a, ae.m1147d(this));
    }

    public void m1646e(int i) {
        m1625a(i, true);
    }

    public void m1647f(int i) {
        m1634b(i, true);
    }

    boolean m1648f(View view) {
        return ((C0337g) view.getLayoutParams()).f567a == 0;
    }

    boolean m1649g(View view) {
        int a = C0290f.m1466a(((C0337g) view.getLayoutParams()).f567a, ae.m1147d(view));
        return (a & 3) != 0 ? true : (a & 5) != 0;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0337g(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0337g(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0337g ? new C0337g((C0337g) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0337g((MarginLayoutParams) layoutParams) : new C0337g(layoutParams);
    }

    public float getDrawerElevation() {
        return f584d ? this.f599f : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f586B;
    }

    public void m1650h(View view) {
        m1628a(view, true);
    }

    public void m1651i(View view) {
        m1638b(view, true);
    }

    public boolean m1652j(View view) {
        if (m1649g(view)) {
            return (((C0337g) view.getLayoutParams()).f570d & 1) == 1;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public boolean m1653k(View view) {
        if (m1649g(view)) {
            return ((C0337g) view.getLayoutParams()).f568b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f610q = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f610q = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f592H && this.f586B != null) {
            int a = f583c.m1558a(this.f591G);
            if (a > 0) {
                this.f586B.setBounds(0, 0, getWidth(), a);
                this.f586B.draw(canvas);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.p007g.C0324t.m1535a(r8);
        r3 = r7.f604k;
        r3 = r3.m1864a(r8);
        r4 = r7.f605l;
        r4 = r4.m1864a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0027;
            case 1: goto L_0x0065;
            case 2: goto L_0x0050;
            case 3: goto L_0x0065;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0025;
    L_0x0019:
        if (r0 != 0) goto L_0x0025;
    L_0x001b:
        r0 = r7.m1616h();
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r0 = r7.f616w;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        r2 = r1;
    L_0x0026:
        return r2;
    L_0x0027:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.f619z = r0;
        r7.f585A = r4;
        r5 = r7.f602i;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006d;
    L_0x003a:
        r5 = r7.f604k;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.m1877d(r0, r4);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r7.m1648f(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        r7.f615v = r2;
        r7.f616w = r2;
        goto L_0x0017;
    L_0x0050:
        r0 = r7.f604k;
        r4 = 3;
        r0 = r0.m1878d(r4);
        if (r0 == 0) goto L_0x0016;
    L_0x0059:
        r0 = r7.f606m;
        r0.m1597a();
        r0 = r7.f607n;
        r0.m1597a();
        r0 = r2;
        goto L_0x0017;
    L_0x0065:
        r7.m1630a(r1);
        r7.f615v = r2;
        r7.f616w = r2;
        goto L_0x0016;
    L_0x006d:
        r0 = r2;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m1617i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = m1639c();
        if (c != null && m1621a(c) == 0) {
            m1633b();
        }
        return c != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f609p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0337g c0337g = (C0337g) childAt.getLayoutParams();
                if (m1648f(childAt)) {
                    childAt.layout(c0337g.leftMargin, c0337g.topMargin, c0337g.leftMargin + childAt.getMeasuredWidth(), c0337g.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1631a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * c0337g.f568b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * c0337g.f568b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != c0337g.f568b ? 1 : null;
                    int i8;
                    switch (c0337g.f567a & C0474j.AppCompatTheme_spinnerStyle) {
                        case C0474j.Toolbar_titleMarginEnd /*16*/:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < c0337g.topMargin) {
                                i8 = c0337g.topMargin;
                            } else if (i8 + measuredHeight > i9 - c0337g.bottomMargin) {
                                i8 = (i9 - c0337g.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case C0474j.AppCompatTheme_panelMenuListWidth /*80*/:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - c0337g.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - c0337g.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, c0337g.topMargin, measuredWidth + i7, measuredHeight + c0337g.topMargin);
                            break;
                    }
                    if (obj != null) {
                        m1637b(childAt, f);
                    }
                    int i10 = c0337g.f568b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f609p = false;
        this.f610q = false;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int d;
        Object obj2;
        Object obj3;
        int childCount;
        int i3;
        View childAt;
        MarginLayoutParams marginLayoutParams;
        int a;
        int e;
        Object obj4;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    mode = size;
                    size = size2;
                } else if (mode2 == 0) {
                    mode = size;
                    size = 300;
                }
                setMeasuredDimension(mode, size);
                obj = (this.f591G == null && ae.m1158n(this)) ? 1 : null;
                d = ae.m1147d(this);
                obj2 = null;
                obj3 = null;
                childCount = getChildCount();
                for (i3 = 0; i3 < childCount; i3++) {
                    childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 8) {
                        marginLayoutParams = (C0337g) childAt.getLayoutParams();
                        if (obj != null) {
                            a = C0290f.m1466a(marginLayoutParams.f567a, d);
                            if (ae.m1158n(childAt)) {
                                f583c.m1562a(marginLayoutParams, this.f591G, a);
                            } else {
                                f583c.m1561a(childAt, this.f591G, a);
                            }
                        }
                        if (m1648f(childAt)) {
                            childAt.measure(MeasureSpec.makeMeasureSpec((mode - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
                        } else if (m1649g(childAt)) {
                            throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                        } else {
                            if (f584d && ae.m1155k(childAt) != this.f599f) {
                                ae.m1145c(childAt, this.f599f);
                            }
                            e = m1645e(childAt) & 7;
                            obj4 = e != 3 ? 1 : null;
                            if ((obj4 != null || r5 == null) && (obj4 != null || r4 == null)) {
                                if (obj4 == null) {
                                    obj2 = 1;
                                } else {
                                    obj3 = 1;
                                }
                                childAt.measure(getChildMeasureSpec(i, (this.f600g + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
                            } else {
                                throw new IllegalStateException("Child drawer has absolute gravity " + m1612d(e) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        mode = size;
        size = size2;
        setMeasuredDimension(mode, size);
        if (this.f591G == null) {
        }
        d = ae.m1147d(this);
        obj2 = null;
        obj3 = null;
        childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                marginLayoutParams = (C0337g) childAt.getLayoutParams();
                if (obj != null) {
                    a = C0290f.m1466a(marginLayoutParams.f567a, d);
                    if (ae.m1158n(childAt)) {
                        f583c.m1562a(marginLayoutParams, this.f591G, a);
                    } else {
                        f583c.m1561a(childAt, this.f591G, a);
                    }
                }
                if (m1648f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
                } else if (m1649g(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    ae.m1145c(childAt, this.f599f);
                    e = m1645e(childAt) & 7;
                    if (e != 3) {
                    }
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                        obj3 = 1;
                    } else {
                        obj2 = 1;
                    }
                    childAt.measure(getChildMeasureSpec(i, (this.f600g + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
                }
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0339h) {
            C0339h c0339h = (C0339h) parcelable;
            super.onRestoreInstanceState(c0339h.m682a());
            if (c0339h.f571b != 0) {
                View c = m1640c(c0339h.f571b);
                if (c != null) {
                    m1650h(c);
                }
            }
            if (c0339h.f572c != 3) {
                m1623a(c0339h.f572c, 3);
            }
            if (c0339h.f573d != 3) {
                m1623a(c0339h.f573d, 5);
            }
            if (c0339h.f574e != 3) {
                m1623a(c0339h.f574e, 8388611);
            }
            if (c0339h.f575f != 3) {
                m1623a(c0339h.f575f, 8388613);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        m1613e();
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0339h = new C0339h(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0337g c0337g = (C0337g) getChildAt(i).getLayoutParams();
            Object obj = c0337g.f570d == 1 ? 1 : null;
            Object obj2 = c0337g.f570d == 2 ? 1 : null;
            if (obj != null || obj2 != null) {
                c0339h.f571b = c0337g.f567a;
                break;
            }
        }
        c0339h.f572c = this.f611r;
        c0339h.f573d = this.f612s;
        c0339h.f574e = this.f613t;
        c0339h.f575f = this.f614u;
        return c0339h;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f604k.m1868b(motionEvent);
        this.f605l.m1868b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case C0474j.View_android_theme /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f619z = x;
                this.f585A = y;
                this.f615v = false;
                this.f616w = false;
                break;
            case C0474j.View_android_focusable /*1*/:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View d = this.f604k.m1877d((int) x, (int) y);
                if (d != null && m1648f(d)) {
                    x -= this.f619z;
                    y -= this.f585A;
                    int d2 = this.f604k.m1876d();
                    if ((x * x) + (y * y) < ((float) (d2 * d2))) {
                        View a = m1622a();
                        if (a != null) {
                            z = m1621a(a) == 2;
                            m1630a(z);
                            this.f615v = false;
                            break;
                        }
                    }
                }
                z = true;
                m1630a(z);
                this.f615v = false;
            case C0474j.View_paddingEnd /*3*/:
                m1630a(true);
                this.f615v = false;
                this.f616w = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f615v = z;
        if (z) {
            m1630a(true);
        }
    }

    public void requestLayout() {
        if (!this.f609p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f599f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m1649g(childAt)) {
                ae.m1145c(childAt, this.f599f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0336f c0336f) {
        if (this.f617x != null) {
            m1635b(this.f617x);
        }
        if (c0336f != null) {
            m1626a(c0336f);
        }
        this.f617x = c0336f;
    }

    public void setDrawerLockMode(int i) {
        m1623a(i, 3);
        m1623a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f601h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f586B = i != 0 ? C0035a.m73a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f586B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f586B = new ColorDrawable(i);
        invalidate();
    }
}
