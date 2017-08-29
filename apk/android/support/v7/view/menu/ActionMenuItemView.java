package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.p005b.p008a.C0105a;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0499p.C0496a;
import android.support.v7.view.menu.C0515h.C0498b;
import android.support.v7.widget.ActionMenuView.C0497a;
import android.support.v7.widget.aa;
import android.support.v7.widget.ag;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView extends aa implements C0496a, C0497a, OnClickListener, OnLongClickListener {
    C0518j f1104a;
    C0498b f1105b;
    C0495b f1106c;
    private CharSequence f1107d;
    private Drawable f1108e;
    private ag f1109f;
    private boolean f1110g;
    private boolean f1111h;
    private int f1112i;
    private int f1113j;
    private int f1114k;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView.a */
    private class C0494a extends ag {
        final /* synthetic */ ActionMenuItemView f1101a;

        public C0494a(ActionMenuItemView actionMenuItemView) {
            this.f1101a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public C0509s m2324a() {
            return this.f1101a.f1106c != null ? this.f1101a.f1106c.m2326a() : null;
        }

        protected boolean m2325b() {
            if (this.f1101a.f1105b == null || !this.f1101a.f1105b.m2338a(this.f1101a.f1104a)) {
                return false;
            }
            C0509s a = m2324a();
            return a != null && a.m2391d();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView.b */
    public static abstract class C0495b {
        public abstract C0509s m2326a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1110g = m2331e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.ActionMenuItemView, i, 0);
        this.f1112i = obtainStyledAttributes.getDimensionPixelSize(C0474j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1114k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f1113j = -1;
        setSaveEnabled(false);
    }

    private boolean m2331e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int b = C0105a.m449b(getResources());
        return b >= 480 || ((b >= 640 && C0105a.m448a(getResources()) >= 480) || configuration.orientation == 2);
    }

    private void m2332f() {
        int i = 0;
        int i2 = !TextUtils.isEmpty(this.f1107d) ? 1 : 0;
        if (this.f1108e == null || (this.f1104a.m2536m() && (this.f1110g || this.f1111h))) {
            i = 1;
        }
        setText((i2 & i) != 0 ? this.f1107d : null);
    }

    public void m2333a(C0518j c0518j, int i) {
        this.f1104a = c0518j;
        setIcon(c0518j.getIcon());
        setTitle(c0518j.m2516a((C0496a) this));
        setId(c0518j.getItemId());
        setVisibility(c0518j.isVisible() ? 0 : 8);
        setEnabled(c0518j.isEnabled());
        if (c0518j.hasSubMenu() && this.f1109f == null) {
            this.f1109f = new C0494a(this);
        }
    }

    public boolean m2334a() {
        return true;
    }

    public boolean m2335b() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean m2336c() {
        return m2335b() && this.f1104a.getIcon() == null;
    }

    public boolean m2337d() {
        return m2335b();
    }

    public C0518j getItemData() {
        return this.f1104a;
    }

    public void onClick(View view) {
        if (this.f1105b != null) {
            this.f1105b.m2338a(this.f1104a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1110g = m2331e();
        m2332f();
    }

    public boolean onLongClick(View view) {
        if (m2335b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        width = (width / 2) + iArr[0];
        if (ae.m1147d(view) == 0) {
            width = context.getResources().getDisplayMetrics().widthPixels - width;
        }
        Toast makeText = Toast.makeText(context, this.f1104a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, width, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m2335b();
        if (b && this.f1113j >= 0) {
            super.setPadding(this.f1113j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == Integer.MIN_VALUE ? Math.min(size, this.f1112i) : this.f1112i;
        if (mode != 1073741824 && this.f1112i > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!b && this.f1108e != null) {
            super.setPadding((getMeasuredWidth() - this.f1108e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f1104a.hasSubMenu() && this.f1109f != null && this.f1109f.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1111h != z) {
            this.f1111h = z;
            if (this.f1104a != null) {
                this.f1104a.m2531h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1108e = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f1114k) {
                f = ((float) this.f1114k) / ((float) intrinsicWidth);
                intrinsicWidth = this.f1114k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f1114k) {
                f = ((float) this.f1114k) / ((float) intrinsicHeight);
                intrinsicHeight = this.f1114k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2332f();
    }

    public void setItemInvoker(C0498b c0498b) {
        this.f1105b = c0498b;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1113j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0495b c0495b) {
        this.f1106c = c0495b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1107d = charSequence;
        setContentDescription(this.f1107d);
        m2332f();
    }
}
