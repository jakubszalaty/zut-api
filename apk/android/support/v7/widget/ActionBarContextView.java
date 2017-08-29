package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p007g.au;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0461b;
import android.support.v7.view.menu.C0515h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends C0535a {
    private CharSequence f1332g;
    private CharSequence f1333h;
    private View f1334i;
    private View f1335j;
    private LinearLayout f1336k;
    private TextView f1337l;
    private TextView f1338m;
    private int f1339n;
    private int f1340o;
    private boolean f1341p;
    private int f1342q;

    /* renamed from: android.support.v7.widget.ActionBarContextView.1 */
    class C05341 implements OnClickListener {
        final /* synthetic */ C0461b f1322a;
        final /* synthetic */ ActionBarContextView f1323b;

        C05341(ActionBarContextView actionBarContextView, C0461b c0461b) {
            this.f1323b = actionBarContextView;
            this.f1322a = c0461b;
        }

        public void onClick(View view) {
            this.f1322a.m2170c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        av a = av.m2947a(context, attributeSet, C0474j.ActionMode, i, 0);
        setBackgroundDrawable(a.m2950a(C0474j.ActionMode_background));
        this.f1339n = a.m2963g(C0474j.ActionMode_titleTextStyle, 0);
        this.f1340o = a.m2963g(C0474j.ActionMode_subtitleTextStyle, 0);
        this.e = a.m2961f(C0474j.ActionMode_height, 0);
        this.f1342q = a.m2963g(C0474j.ActionMode_closeItemLayout, C0471g.abc_action_mode_close_item_material);
        a.m2951a();
    }

    private void m2608e() {
        int i = 8;
        Object obj = 1;
        if (this.f1336k == null) {
            LayoutInflater.from(getContext()).inflate(C0471g.abc_action_bar_title_item, this);
            this.f1336k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1337l = (TextView) this.f1336k.findViewById(C0470f.action_bar_title);
            this.f1338m = (TextView) this.f1336k.findViewById(C0470f.action_bar_subtitle);
            if (this.f1339n != 0) {
                this.f1337l.setTextAppearance(getContext(), this.f1339n);
            }
            if (this.f1340o != 0) {
                this.f1338m.setTextAppearance(getContext(), this.f1340o);
            }
        }
        this.f1337l.setText(this.f1332g);
        this.f1338m.setText(this.f1333h);
        Object obj2 = !TextUtils.isEmpty(this.f1332g) ? 1 : null;
        if (TextUtils.isEmpty(this.f1333h)) {
            obj = null;
        }
        this.f1338m.setVisibility(obj != null ? 0 : 8);
        LinearLayout linearLayout = this.f1336k;
        if (!(obj2 == null && obj == null)) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f1336k.getParent() == null) {
            addView(this.f1336k);
        }
    }

    public /* bridge */ /* synthetic */ au m2609a(int i, long j) {
        return super.m2606a(i, j);
    }

    public void m2610a(C0461b c0461b) {
        if (this.f1334i == null) {
            this.f1334i = LayoutInflater.from(getContext()).inflate(this.f1342q, this, false);
            addView(this.f1334i);
        } else if (this.f1334i.getParent() == null) {
            addView(this.f1334i);
        }
        this.f1334i.findViewById(C0470f.action_mode_close_button).setOnClickListener(new C05341(this, c0461b));
        C0515h c0515h = (C0515h) c0461b.m2167b();
        if (this.d != null) {
            this.d.m3054f();
        }
        this.d = new C0593d(getContext());
        this.d.m3050c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        c0515h.m2471a(this.d, this.b);
        this.c = (ActionMenuView) this.d.m3035a((ViewGroup) this);
        this.c.setBackgroundDrawable(null);
        addView(this.c, layoutParams);
    }

    public boolean m2611a() {
        return this.d != null ? this.d.m3052d() : false;
    }

    public void m2612b() {
        if (this.f1334i == null) {
            m2613c();
        }
    }

    public void m2613c() {
        removeAllViews();
        this.f1335j = null;
        this.c = null;
    }

    public boolean m2614d() {
        return this.f1341p;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1333h;
    }

    public CharSequence getTitle() {
        return this.f1332g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.m3053e();
            this.d.m3055g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT < 14) {
            return;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1332g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = ay.m3016a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f1334i == null || this.f1334i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1334i.getLayoutParams();
            i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            i5 = C0535a.m2601a(paddingRight, i5, a);
            i5 = C0535a.m2601a(m2605a(this.f1334i, i5, paddingTop, paddingTop2, a) + i5, i6, a);
        }
        if (!(this.f1336k == null || this.f1335j != null || this.f1336k.getVisibility() == 8)) {
            i5 += m2605a(this.f1336k, i5, paddingTop, paddingTop2, a);
        }
        if (this.f1335j != null) {
            int a2 = m2605a(this.f1335j, i5, paddingTop, paddingTop2, a) + i5;
        }
        i5 = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a2 = m2605a(this.c, i5, paddingTop, paddingTop2, !a) + i5;
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int i4 = 0;
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        } else {
            int a;
            int size = MeasureSpec.getSize(i);
            int size2 = this.e > 0 ? this.e : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = size2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            if (this.f1334i != null) {
                a = m2604a(this.f1334i, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1334i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = m2604a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f1336k != null && this.f1335j == null) {
                if (this.f1341p) {
                    this.f1336k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    a = this.f1336k.getMeasuredWidth();
                    makeMeasureSpec = a <= paddingLeft ? 1 : 0;
                    if (makeMeasureSpec != 0) {
                        paddingLeft -= a;
                    }
                    this.f1336k.setVisibility(makeMeasureSpec != 0 ? 0 : 8);
                } else {
                    paddingLeft = m2604a(this.f1336k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f1335j != null) {
                LayoutParams layoutParams = this.f1335j.getLayoutParams();
                makeMeasureSpec = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                this.f1335j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i5) : i5, i3));
            }
            if (this.e <= 0) {
                makeMeasureSpec = getChildCount();
                size2 = 0;
                while (i4 < makeMeasureSpec) {
                    paddingLeft = getChildAt(i4).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= size2) {
                        paddingLeft = size2;
                    }
                    i4++;
                    size2 = paddingLeft;
                }
                setMeasuredDimension(size, size2);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.f1335j != null) {
            removeView(this.f1335j);
        }
        this.f1335j = view;
        if (!(view == null || this.f1336k == null)) {
            removeView(this.f1336k);
            this.f1336k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1333h = charSequence;
        m2608e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1332g = charSequence;
        m2608e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1341p) {
            requestLayout();
        }
        this.f1341p = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
