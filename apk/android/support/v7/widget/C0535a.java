package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.p007g.C0324t;
import android.support.v4.p007g.ae;
import android.support.v4.p007g.au;
import android.support.v4.p007g.ay;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0535a extends ViewGroup {
    protected final C0564a f1324a;
    protected final Context f1325b;
    protected ActionMenuView f1326c;
    protected C0593d f1327d;
    protected int f1328e;
    protected au f1329f;
    private boolean f1330g;
    private boolean f1331h;

    /* renamed from: android.support.v7.widget.a.a */
    protected class C0564a implements ay {
        int f1553a;
        final /* synthetic */ C0535a f1554b;
        private boolean f1555c;

        protected C0564a(C0535a c0535a) {
            this.f1554b = c0535a;
            this.f1555c = false;
        }

        public C0564a m2802a(au auVar, int i) {
            this.f1554b.f1329f = auVar;
            this.f1553a = i;
            return this;
        }

        public void m2803a(View view) {
            super.setVisibility(0);
            this.f1555c = false;
        }

        public void m2804b(View view) {
            if (!this.f1555c) {
                this.f1554b.f1329f = null;
                super.setVisibility(this.f1553a);
            }
        }

        public void m2805c(View view) {
            this.f1555c = true;
        }
    }

    C0535a(Context context) {
        this(context, null);
    }

    C0535a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0535a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1324a = new C0564a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0465a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1325b = context;
        } else {
            this.f1325b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int m2601a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int m2604a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int m2605a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public au m2606a(int i, long j) {
        if (this.f1329f != null) {
            this.f1329f.m1318b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                ae.m1141b((View) this, 0.0f);
            }
            au a = ae.m1154j(this).m1311a(1.0f);
            a.m1312a(j);
            a.m1313a(this.f1324a.m2802a(a, i));
            return a;
        }
        a = ae.m1154j(this).m1311a(0.0f);
        a.m1312a(j);
        a.m1313a(this.f1324a.m2802a(a, i));
        return a;
    }

    public boolean m2607a() {
        return this.f1327d != null ? this.f1327d.m3052d() : false;
    }

    public int getAnimatedVisibility() {
        return this.f1329f != null ? this.f1324a.f1553a : getVisibility();
    }

    public int getContentHeight() {
        return this.f1328e;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0474j.ActionBar, C0465a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0474j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f1327d != null) {
            this.f1327d.m3038a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = C0324t.m1535a(motionEvent);
        if (a == 9) {
            this.f1331h = false;
        }
        if (!this.f1331h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f1331h = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f1331h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0324t.m1535a(motionEvent);
        if (a == 0) {
            this.f1330g = false;
        }
        if (!this.f1330g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f1330g = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f1330g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1328e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f1329f != null) {
                this.f1329f.m1318b();
            }
            super.setVisibility(i);
        }
    }
}
