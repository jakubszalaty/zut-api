package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p014a.C0396a.C0395c;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.view.C0483a;
import android.support.v7.widget.ah.C0541a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ao extends HorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator f1641j;
    Runnable f1642a;
    ah f1643b;
    int f1644c;
    int f1645d;
    private C0578b f1646e;
    private Spinner f1647f;
    private boolean f1648g;
    private int f1649h;
    private int f1650i;

    /* renamed from: android.support.v7.widget.ao.1 */
    class C05761 implements Runnable {
        final /* synthetic */ View f1631a;
        final /* synthetic */ ao f1632b;

        C05761(ao aoVar, View view) {
            this.f1632b = aoVar;
            this.f1631a = view;
        }

        public void run() {
            this.f1632b.smoothScrollTo(this.f1631a.getLeft() - ((this.f1632b.getWidth() - this.f1631a.getWidth()) / 2), 0);
            this.f1632b.f1642a = null;
        }
    }

    /* renamed from: android.support.v7.widget.ao.a */
    private class C0577a extends BaseAdapter {
        final /* synthetic */ ao f1633a;

        C0577a(ao aoVar) {
            this.f1633a = aoVar;
        }

        public int getCount() {
            return this.f1633a.f1643b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0579c) this.f1633a.f1643b.getChildAt(i)).m2905b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f1633a.m2910a((C0395c) getItem(i), true);
            }
            ((C0579c) view).m2904a((C0395c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ao.b */
    private class C0578b implements OnClickListener {
        final /* synthetic */ ao f1634a;

        C0578b(ao aoVar) {
            this.f1634a = aoVar;
        }

        public void onClick(View view) {
            ((C0579c) view).m2905b().m1884d();
            int childCount = this.f1634a.f1643b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1634a.f1643b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ao.c */
    private class C0579c extends ah implements OnLongClickListener {
        final /* synthetic */ ao f1635a;
        private final int[] f1636b;
        private C0395c f1637c;
        private TextView f1638d;
        private ImageView f1639e;
        private View f1640f;

        public C0579c(ao aoVar, Context context, C0395c c0395c, boolean z) {
            this.f1635a = aoVar;
            super(context, null, C0465a.actionBarTabStyle);
            this.f1636b = new int[]{16842964};
            this.f1637c = c0395c;
            av a = av.m2947a(context, null, this.f1636b, C0465a.actionBarTabStyle, 0);
            if (a.m2964g(0)) {
                setBackgroundDrawable(a.m2950a(0));
            }
            a.m2951a();
            if (z) {
                setGravity(8388627);
            }
            m2903a();
        }

        public void m2903a() {
            C0395c c0395c = this.f1637c;
            View c = c0395c.m1883c();
            if (c != null) {
                C0579c parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(c);
                    }
                    addView(c);
                }
                this.f1640f = c;
                if (this.f1638d != null) {
                    this.f1638d.setVisibility(8);
                }
                if (this.f1639e != null) {
                    this.f1639e.setVisibility(8);
                    this.f1639e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f1640f != null) {
                removeView(this.f1640f);
                this.f1640f = null;
            }
            Drawable a = c0395c.m1881a();
            CharSequence b = c0395c.m1882b();
            if (a != null) {
                if (this.f1639e == null) {
                    View c0589p = new C0589p(getContext());
                    LayoutParams c0541a = new C0541a(-2, -2);
                    c0541a.f1376h = 16;
                    c0589p.setLayoutParams(c0541a);
                    addView(c0589p, 0);
                    this.f1639e = c0589p;
                }
                this.f1639e.setImageDrawable(a);
                this.f1639e.setVisibility(0);
            } else if (this.f1639e != null) {
                this.f1639e.setVisibility(8);
                this.f1639e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f1638d == null) {
                    c0589p = new aa(getContext(), null, C0465a.actionBarTabTextStyle);
                    c0589p.setEllipsize(TruncateAt.END);
                    c0541a = new C0541a(-2, -2);
                    c0541a.f1376h = 16;
                    c0589p.setLayoutParams(c0541a);
                    addView(c0589p);
                    this.f1638d = c0589p;
                }
                this.f1638d.setText(b);
                this.f1638d.setVisibility(0);
            } else if (this.f1638d != null) {
                this.f1638d.setVisibility(8);
                this.f1638d.setText(null);
            }
            if (this.f1639e != null) {
                this.f1639e.setContentDescription(c0395c.m1885e());
            }
            if (z || TextUtils.isEmpty(c0395c.m1885e())) {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        public void m2904a(C0395c c0395c) {
            this.f1637c = c0395c;
            m2903a();
        }

        public C0395c m2905b() {
            return this.f1637c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0395c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(C0395c.class.getName());
            }
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.f1637c.m1885e(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f1635a.f1644c > 0 && getMeasuredWidth() > this.f1635a.f1644c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.f1635a.f1644c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        f1641j = new DecelerateInterpolator();
    }

    private boolean m2906a() {
        return this.f1647f != null && this.f1647f.getParent() == this;
    }

    private void m2907b() {
        if (!m2906a()) {
            if (this.f1647f == null) {
                this.f1647f = m2909d();
            }
            removeView(this.f1643b);
            addView(this.f1647f, new LayoutParams(-2, -1));
            if (this.f1647f.getAdapter() == null) {
                this.f1647f.setAdapter(new C0577a(this));
            }
            if (this.f1642a != null) {
                removeCallbacks(this.f1642a);
                this.f1642a = null;
            }
            this.f1647f.setSelection(this.f1650i);
        }
    }

    private boolean m2908c() {
        if (m2906a()) {
            removeView(this.f1647f);
            addView(this.f1643b, new LayoutParams(-2, -1));
            setTabSelected(this.f1647f.getSelectedItemPosition());
        }
        return false;
    }

    private Spinner m2909d() {
        Spinner c0628x = new C0628x(getContext(), null, C0465a.actionDropDownStyle);
        c0628x.setLayoutParams(new C0541a(-2, -1));
        c0628x.setOnItemSelectedListener(this);
        return c0628x;
    }

    C0579c m2910a(C0395c c0395c, boolean z) {
        C0579c c0579c = new C0579c(this, getContext(), c0395c, z);
        if (z) {
            c0579c.setBackgroundDrawable(null);
            c0579c.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1649h));
        } else {
            c0579c.setFocusable(true);
            if (this.f1646e == null) {
                this.f1646e = new C0578b(this);
            }
            c0579c.setOnClickListener(this.f1646e);
        }
        return c0579c;
    }

    public void m2911a(int i) {
        View childAt = this.f1643b.getChildAt(i);
        if (this.f1642a != null) {
            removeCallbacks(this.f1642a);
        }
        this.f1642a = new C05761(this, childAt);
        post(this.f1642a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1642a != null) {
            post(this.f1642a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0483a a = C0483a.m2256a(getContext());
        setContentHeight(a.m2261e());
        this.f1645d = a.m2263g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1642a != null) {
            removeCallbacks(this.f1642a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0579c) view).m2905b().m1884d();
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f1643b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1644c = -1;
        } else {
            if (childCount > 2) {
                this.f1644c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1644c = MeasureSpec.getSize(i) / 2;
            }
            this.f1644c = Math.min(this.f1644c, this.f1645d);
        }
        mode = MeasureSpec.makeMeasureSpec(this.f1649h, 1073741824);
        if (z || !this.f1648g) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.f1643b.measure(0, mode);
            if (this.f1643b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m2907b();
            } else {
                m2908c();
            }
        } else {
            m2908c();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            setTabSelected(this.f1650i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1648g = z;
    }

    public void setContentHeight(int i) {
        this.f1649h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1650i = i;
        int childCount = this.f1643b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1643b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m2911a(i);
            }
            i2++;
        }
        if (this.f1647f != null && i >= 0) {
            this.f1647f.setSelection(i);
        }
    }
}
