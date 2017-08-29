package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {
    Drawable f1312a;
    Drawable f1313b;
    Drawable f1314c;
    boolean f1315d;
    boolean f1316e;
    private boolean f1317f;
    private View f1318g;
    private View f1319h;
    private View f1320i;
    private int f1321j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(VERSION.SDK_INT >= 21 ? new C0584c(this) : new C0583b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ActionBar);
        this.f1312a = obtainStyledAttributes.getDrawable(C0474j.ActionBar_background);
        this.f1313b = obtainStyledAttributes.getDrawable(C0474j.ActionBar_backgroundStacked);
        this.f1321j = obtainStyledAttributes.getDimensionPixelSize(C0474j.ActionBar_height, -1);
        if (getId() == C0470f.split_action_bar) {
            this.f1315d = true;
            this.f1314c = obtainStyledAttributes.getDrawable(C0474j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.f1315d ? this.f1314c == null : this.f1312a == null && this.f1313b == null;
        setWillNotDraw(z);
    }

    private boolean m2599a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int m2600b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1312a != null && this.f1312a.isStateful()) {
            this.f1312a.setState(getDrawableState());
        }
        if (this.f1313b != null && this.f1313b.isStateful()) {
            this.f1313b.setState(getDrawableState());
        }
        if (this.f1314c != null && this.f1314c.isStateful()) {
            this.f1314c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1318g;
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f1312a != null) {
                this.f1312a.jumpToCurrentState();
            }
            if (this.f1313b != null) {
                this.f1313b.jumpToCurrentState();
            }
            if (this.f1314c != null) {
                this.f1314c.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1319h = findViewById(C0470f.action_bar);
        this.f1320i = findViewById(C0470f.action_context_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1317f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 1;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1318g;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f1315d) {
            int i6;
            if (this.f1312a != null) {
                if (this.f1319h.getVisibility() == 0) {
                    this.f1312a.setBounds(this.f1319h.getLeft(), this.f1319h.getTop(), this.f1319h.getRight(), this.f1319h.getBottom());
                } else if (this.f1320i == null || this.f1320i.getVisibility() != 0) {
                    this.f1312a.setBounds(0, 0, 0, 0);
                } else {
                    this.f1312a.setBounds(this.f1320i.getLeft(), this.f1320i.getTop(), this.f1320i.getRight(), this.f1320i.getBottom());
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f1316e = z2;
            if (!z2 || this.f1313b == null) {
                i5 = i6;
            } else {
                this.f1313b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f1314c != null) {
            this.f1314c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f1319h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f1321j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f1321j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1319h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (this.f1318g != null && this.f1318g.getVisibility() != 8 && mode != 1073741824) {
                int b = !m2599a(this.f1319h) ? m2600b(this.f1319h) : !m2599a(this.f1320i) ? m2600b(this.f1320i) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + m2600b(this.f1318g), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1312a != null) {
            this.f1312a.setCallback(null);
            unscheduleDrawable(this.f1312a);
        }
        this.f1312a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1319h != null) {
                this.f1312a.setBounds(this.f1319h.getLeft(), this.f1319h.getTop(), this.f1319h.getRight(), this.f1319h.getBottom());
            }
        }
        if (this.f1315d) {
            if (this.f1314c != null) {
                z = false;
            }
        } else if (!(this.f1312a == null && this.f1313b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1314c != null) {
            this.f1314c.setCallback(null);
            unscheduleDrawable(this.f1314c);
        }
        this.f1314c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1315d && this.f1314c != null) {
                this.f1314c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f1315d) {
            if (this.f1314c != null) {
                z = false;
            }
        } else if (!(this.f1312a == null && this.f1313b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1313b != null) {
            this.f1313b.setCallback(null);
            unscheduleDrawable(this.f1313b);
        }
        this.f1313b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1316e && this.f1313b != null) {
                this.f1313b.setBounds(this.f1318g.getLeft(), this.f1318g.getTop(), this.f1318g.getRight(), this.f1318g.getBottom());
            }
        }
        if (this.f1315d) {
            if (this.f1314c != null) {
                z = false;
            }
        } else if (!(this.f1312a == null && this.f1313b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(ao aoVar) {
        if (this.f1318g != null) {
            removeView(this.f1318g);
        }
        this.f1318g = aoVar;
        if (aoVar != null) {
            addView(aoVar);
            ViewGroup.LayoutParams layoutParams = aoVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            aoVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1317f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f1312a != null) {
            this.f1312a.setVisible(z, false);
        }
        if (this.f1313b != null) {
            this.f1313b.setVisible(z, false);
        }
        if (this.f1314c != null) {
            this.f1314c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1312a && !this.f1315d) || ((drawable == this.f1313b && this.f1316e) || ((drawable == this.f1314c && this.f1315d) || super.verifyDrawable(drawable)));
    }
}
