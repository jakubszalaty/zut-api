package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p018d.p019a.C0480a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class aj extends ListView {
    private static final int[] f1558g;
    final Rect f1559a;
    int f1560b;
    int f1561c;
    int f1562d;
    int f1563e;
    protected int f1564f;
    private Field f1565h;
    private C0574a f1566i;

    /* renamed from: android.support.v7.widget.aj.a */
    private static class C0574a extends C0480a {
        private boolean f1615a;

        public C0574a(Drawable drawable) {
            super(drawable);
            this.f1615a = true;
        }

        void m2887a(boolean z) {
            this.f1615a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1615a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1615a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1615a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            return this.f1615a ? super.setState(iArr) : false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            return this.f1615a ? super.setVisible(z, z2) : false;
        }
    }

    static {
        f1558g = new int[]{0};
    }

    public aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1559a = new Rect();
        this.f1560b = 0;
        this.f1561c = 0;
        this.f1562d = 0;
        this.f1563e = 0;
        try {
            this.f1565h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1565h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public int m2841a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingBottom += listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i6 = 0;
        View view = null;
        int i7 = 0;
        int count = adapter.getCount();
        int i8 = 0;
        while (i8 < count) {
            View view2;
            listPaddingTop = adapter.getItemViewType(i8);
            if (listPaddingTop != i7) {
                int i9 = listPaddingTop;
                view2 = null;
                i7 = i9;
            } else {
                view2 = view;
            }
            view = adapter.getView(i8, view2, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            listPaddingTop = (i8 > 0 ? listPaddingBottom + dividerHeight : listPaddingBottom) + view.getMeasuredHeight();
            if (listPaddingTop >= i4) {
                return (i5 < 0 || i8 <= i5 || i6 <= 0 || listPaddingTop == i4) ? i4 : i6;
            } else {
                if (i5 >= 0 && i8 >= i5) {
                    i6 = listPaddingTop;
                }
                i8++;
                listPaddingBottom = listPaddingTop;
            }
        }
        return listPaddingBottom;
    }

    protected void m2842a(int i, View view) {
        boolean z = true;
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2847b(i, view);
        if (z2) {
            Rect rect = this.f1559a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0129a.m536a(selector, exactCenterX, exactCenterY);
        }
    }

    protected void m2843a(int i, View view, float f, float f2) {
        m2842a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0129a.m536a(selector, f, f2);
        }
    }

    protected void m2844a(Canvas canvas) {
        if (!this.f1559a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1559a);
                selector.draw(canvas);
            }
        }
    }

    protected boolean m2845a() {
        return false;
    }

    protected void m2846b() {
        Drawable selector = getSelector();
        if (selector != null && m2848c()) {
            selector.setState(getDrawableState());
        }
    }

    protected void m2847b(int i, View view) {
        Rect rect = this.f1559a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1560b;
        rect.top -= this.f1561c;
        rect.right += this.f1562d;
        rect.bottom += this.f1563e;
        try {
            boolean z = this.f1565h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1565h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    protected boolean m2848c() {
        return m2845a() && isPressed();
    }

    protected void dispatchDraw(Canvas canvas) {
        m2844a(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m2846b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case C0474j.View_android_theme /*0*/:
                this.f1564f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        this.f1566i = drawable != null ? new C0574a(drawable) : null;
        super.setSelector(this.f1566i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1560b = rect.left;
        this.f1561c = rect.top;
        this.f1562d = rect.right;
        this.f1563e = rect.bottom;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.f1566i != null) {
            this.f1566i.m2887a(z);
        }
    }
}
