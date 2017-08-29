package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.p007g.ae;
import android.support.v4.widget.C0382q;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0509s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ai implements C0509s {
    private static Method f1581a;
    private static Method f1582b;
    private static Method f1583h;
    private OnItemSelectedListener f1584A;
    private final C0572d f1585B;
    private final C0571c f1586C;
    private final C0569a f1587D;
    private Runnable f1588E;
    private final Rect f1589F;
    private Rect f1590G;
    private boolean f1591H;
    ae f1592c;
    int f1593d;
    final C0573e f1594e;
    final Handler f1595f;
    PopupWindow f1596g;
    private Context f1597i;
    private ListAdapter f1598j;
    private int f1599k;
    private int f1600l;
    private int f1601m;
    private int f1602n;
    private int f1603o;
    private boolean f1604p;
    private boolean f1605q;
    private int f1606r;
    private boolean f1607s;
    private boolean f1608t;
    private View f1609u;
    private int f1610v;
    private DataSetObserver f1611w;
    private View f1612x;
    private Drawable f1613y;
    private OnItemClickListener f1614z;

    /* renamed from: android.support.v7.widget.ai.1 */
    class C05671 implements Runnable {
        final /* synthetic */ ai f1574a;

        C05671(ai aiVar) {
            this.f1574a = aiVar;
        }

        public void run() {
            View i = this.f1574a.m2880i();
            if (i != null && i.getWindowToken() != null) {
                this.f1574a.m2859a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai.2 */
    class C05682 implements OnItemSelectedListener {
        final /* synthetic */ ai f1575a;

        C05682(ai aiVar) {
            this.f1575a = aiVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                ae aeVar = this.f1575a.f1592c;
                if (aeVar != null) {
                    aeVar.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: android.support.v7.widget.ai.a */
    private class C0569a implements Runnable {
        final /* synthetic */ ai f1576a;

        C0569a(ai aiVar) {
            this.f1576a = aiVar;
        }

        public void run() {
            this.f1576a.m2885m();
        }
    }

    /* renamed from: android.support.v7.widget.ai.b */
    private class C0570b extends DataSetObserver {
        final /* synthetic */ ai f1577a;

        C0570b(ai aiVar) {
            this.f1577a = aiVar;
        }

        public void onChanged() {
            if (this.f1577a.m2872d()) {
                this.f1577a.m2859a();
            }
        }

        public void onInvalidated() {
            this.f1577a.m2869c();
        }
    }

    /* renamed from: android.support.v7.widget.ai.c */
    private class C0571c implements OnScrollListener {
        final /* synthetic */ ai f1578a;

        C0571c(ai aiVar) {
            this.f1578a = aiVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.f1578a.m2886n() && this.f1578a.f1596g.getContentView() != null) {
                this.f1578a.f1595f.removeCallbacks(this.f1578a.f1594e);
                this.f1578a.f1594e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai.d */
    private class C0572d implements OnTouchListener {
        final /* synthetic */ ai f1579a;

        C0572d(ai aiVar) {
            this.f1579a = aiVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && this.f1579a.f1596g != null && this.f1579a.f1596g.isShowing() && x >= 0 && x < this.f1579a.f1596g.getWidth() && y >= 0 && y < this.f1579a.f1596g.getHeight()) {
                this.f1579a.f1595f.postDelayed(this.f1579a.f1594e, 250);
            } else if (action == 1) {
                this.f1579a.f1595f.removeCallbacks(this.f1579a.f1594e);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ai.e */
    private class C0573e implements Runnable {
        final /* synthetic */ ai f1580a;

        C0573e(ai aiVar) {
            this.f1580a = aiVar;
        }

        public void run() {
            if (this.f1580a.f1592c != null && ae.m1165u(this.f1580a.f1592c) && this.f1580a.f1592c.getCount() > this.f1580a.f1592c.getChildCount() && this.f1580a.f1592c.getChildCount() <= this.f1580a.f1593d) {
                this.f1580a.f1596g.setInputMethodMode(2);
                this.f1580a.m2859a();
            }
        }
    }

    static {
        try {
            f1581a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f1582b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f1583h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ai(Context context) {
        this(context, null, C0465a.listPopupWindowStyle);
    }

    public ai(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ai(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1599k = -2;
        this.f1600l = -2;
        this.f1603o = 1002;
        this.f1605q = true;
        this.f1606r = 0;
        this.f1607s = false;
        this.f1608t = false;
        this.f1593d = Integer.MAX_VALUE;
        this.f1610v = 0;
        this.f1594e = new C0573e(this);
        this.f1585B = new C0572d(this);
        this.f1586C = new C0571c(this);
        this.f1587D = new C0569a(this);
        this.f1589F = new Rect();
        this.f1597i = context;
        this.f1595f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ListPopupWindow, i, i2);
        this.f1601m = obtainStyledAttributes.getDimensionPixelOffset(C0474j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1602n = obtainStyledAttributes.getDimensionPixelOffset(C0474j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1602n != 0) {
            this.f1604p = true;
        }
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 11) {
            this.f1596g = new C0616r(context, attributeSet, i, i2);
        } else {
            this.f1596g = new C0616r(context, attributeSet, i);
        }
        this.f1596g.setInputMethodMode(1);
    }

    private int m2854a(View view, int i, boolean z) {
        if (f1582b != null) {
            try {
                return ((Integer) f1582b.invoke(this.f1596g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1596g.getMaxAvailableHeight(view, i);
    }

    private void m2855b() {
        if (this.f1609u != null) {
            ViewParent parent = this.f1609u.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1609u);
            }
        }
    }

    private void m2856b(boolean z) {
        if (f1581a != null) {
            try {
                f1581a.invoke(this.f1596g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int m2857f() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        LayoutParams layoutParams;
        View view;
        if (this.f1592c == null) {
            Context context = this.f1597i;
            this.f1588E = new C05671(this);
            this.f1592c = m2858a(context, !this.f1591H);
            if (this.f1613y != null) {
                this.f1592c.setSelector(this.f1613y);
            }
            this.f1592c.setAdapter(this.f1598j);
            this.f1592c.setOnItemClickListener(this.f1614z);
            this.f1592c.setFocusable(true);
            this.f1592c.setFocusableInTouchMode(true);
            this.f1592c.setOnItemSelectedListener(new C05682(this));
            this.f1592c.setOnScrollListener(this.f1586C);
            if (this.f1584A != null) {
                this.f1592c.setOnItemSelectedListener(this.f1584A);
            }
            View view2 = this.f1592c;
            View view3 = this.f1609u;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.f1610v) {
                    case C0474j.View_android_theme /*0*/:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case C0474j.View_android_focusable /*1*/:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f1610v);
                        break;
                }
                if (this.f1600l >= 0) {
                    i = this.f1600l;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = 0;
                    i = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                layoutParams = (LayoutParams) view3.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view3.getMeasuredHeight() + layoutParams.topMargin);
                view = linearLayout;
            } else {
                view = view2;
                i2 = 0;
            }
            this.f1596g.setContentView(view);
            i3 = i2;
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1596g.getContentView();
            view = this.f1609u;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i3 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i3 = 0;
            }
        }
        Drawable background = this.f1596g.getBackground();
        if (background != null) {
            background.getPadding(this.f1589F);
            i2 = this.f1589F.top + this.f1589F.bottom;
            if (this.f1604p) {
                i4 = i2;
            } else {
                this.f1602n = -this.f1589F.top;
                i4 = i2;
            }
        } else {
            this.f1589F.setEmpty();
            i4 = 0;
        }
        if (this.f1596g.getInputMethodMode() != 2) {
            z = false;
        }
        i = m2854a(m2880i(), this.f1602n, z);
        if (this.f1607s || this.f1599k == -1) {
            return i + i4;
        }
        int makeMeasureSpec;
        switch (this.f1600l) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1597i.getResources().getDisplayMetrics().widthPixels - (this.f1589F.left + this.f1589F.right), Integer.MIN_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1597i.getResources().getDisplayMetrics().widthPixels - (this.f1589F.left + this.f1589F.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1600l, 1073741824);
                break;
        }
        i2 = this.f1592c.m2841a(makeMeasureSpec, 0, -1, i - i3, -1);
        if (i2 > 0) {
            i3 += (this.f1592c.getPaddingTop() + this.f1592c.getPaddingBottom()) + i4;
        }
        return i2 + i3;
    }

    ae m2858a(Context context, boolean z) {
        return new ae(context, z);
    }

    public void m2859a() {
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        int f = m2857f();
        boolean n = m2886n();
        C0382q.m1813a(this.f1596g, this.f1603o);
        if (this.f1596g.isShowing()) {
            int i2;
            int width = this.f1600l == -1 ? -1 : this.f1600l == -2 ? m2880i().getWidth() : this.f1600l;
            if (this.f1599k == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.f1596g.setWidth(this.f1600l == -1 ? -1 : 0);
                    this.f1596g.setHeight(0);
                    i2 = f;
                } else {
                    this.f1596g.setWidth(this.f1600l == -1 ? -1 : 0);
                    this.f1596g.setHeight(-1);
                    i2 = f;
                }
            } else {
                i2 = this.f1599k == -2 ? f : this.f1599k;
            }
            PopupWindow popupWindow = this.f1596g;
            if (!(this.f1608t || this.f1607s)) {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            popupWindow = this.f1596g;
            View i3 = m2880i();
            f = this.f1601m;
            int i4 = this.f1602n;
            if (width < 0) {
                width = -1;
            }
            if (i2 >= 0) {
                i = i2;
            }
            popupWindow.update(i3, f, i4, width, i);
            return;
        }
        int width2 = this.f1600l == -1 ? -1 : this.f1600l == -2 ? m2880i().getWidth() : this.f1600l;
        if (this.f1599k == -1) {
            f = -1;
        } else if (this.f1599k != -2) {
            f = this.f1599k;
        }
        this.f1596g.setWidth(width2);
        this.f1596g.setHeight(f);
        m2856b(true);
        popupWindow = this.f1596g;
        if (this.f1608t || this.f1607s) {
            z = false;
        }
        popupWindow.setOutsideTouchable(z);
        this.f1596g.setTouchInterceptor(this.f1585B);
        if (f1583h != null) {
            try {
                f1583h.invoke(this.f1596g, new Object[]{this.f1590G});
            } catch (Throwable e) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
            }
        }
        C0382q.m1814a(this.f1596g, m2880i(), this.f1601m, this.f1602n, this.f1606r);
        this.f1592c.setSelection(-1);
        if (!this.f1591H || this.f1592c.isInTouchMode()) {
            m2885m();
        }
        if (!this.f1591H) {
            this.f1595f.post(this.f1587D);
        }
    }

    public void m2860a(int i) {
        this.f1610v = i;
    }

    public void m2861a(Rect rect) {
        this.f1590G = rect;
    }

    public void m2862a(Drawable drawable) {
        this.f1596g.setBackgroundDrawable(drawable);
    }

    public void m2863a(OnItemClickListener onItemClickListener) {
        this.f1614z = onItemClickListener;
    }

    public void m2864a(ListAdapter listAdapter) {
        if (this.f1611w == null) {
            this.f1611w = new C0570b(this);
        } else if (this.f1598j != null) {
            this.f1598j.unregisterDataSetObserver(this.f1611w);
        }
        this.f1598j = listAdapter;
        if (this.f1598j != null) {
            listAdapter.registerDataSetObserver(this.f1611w);
        }
        if (this.f1592c != null) {
            this.f1592c.setAdapter(this.f1598j);
        }
    }

    public void m2865a(OnDismissListener onDismissListener) {
        this.f1596g.setOnDismissListener(onDismissListener);
    }

    public void m2866a(boolean z) {
        this.f1591H = z;
        this.f1596g.setFocusable(z);
    }

    public void m2867b(int i) {
        this.f1596g.setAnimationStyle(i);
    }

    public void m2868b(View view) {
        this.f1612x = view;
    }

    public void m2869c() {
        this.f1596g.dismiss();
        m2855b();
        this.f1596g.setContentView(null);
        this.f1592c = null;
        this.f1595f.removeCallbacks(this.f1594e);
    }

    public void m2870c(int i) {
        this.f1601m = i;
    }

    public void m2871d(int i) {
        this.f1602n = i;
        this.f1604p = true;
    }

    public boolean m2872d() {
        return this.f1596g.isShowing();
    }

    public ListView m2873e() {
        return this.f1592c;
    }

    public void m2874e(int i) {
        this.f1606r = i;
    }

    public void m2875f(int i) {
        this.f1600l = i;
    }

    public void m2876g(int i) {
        Drawable background = this.f1596g.getBackground();
        if (background != null) {
            background.getPadding(this.f1589F);
            this.f1600l = (this.f1589F.left + this.f1589F.right) + i;
            return;
        }
        m2875f(i);
    }

    public boolean m2877g() {
        return this.f1591H;
    }

    public Drawable m2878h() {
        return this.f1596g.getBackground();
    }

    public void m2879h(int i) {
        this.f1596g.setInputMethodMode(i);
    }

    public View m2880i() {
        return this.f1612x;
    }

    public void m2881i(int i) {
        ae aeVar = this.f1592c;
        if (m2872d() && aeVar != null) {
            aeVar.setListSelectionHidden(false);
            aeVar.setSelection(i);
            if (VERSION.SDK_INT >= 11 && aeVar.getChoiceMode() != 0) {
                aeVar.setItemChecked(i, true);
            }
        }
    }

    public int m2882j() {
        return this.f1601m;
    }

    public int m2883k() {
        return !this.f1604p ? 0 : this.f1602n;
    }

    public int m2884l() {
        return this.f1600l;
    }

    public void m2885m() {
        ae aeVar = this.f1592c;
        if (aeVar != null) {
            aeVar.setListSelectionHidden(true);
            aeVar.requestLayout();
        }
    }

    public boolean m2886n() {
        return this.f1596g.getInputMethodMode() == 2;
    }
}
