package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.C0382q;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.r */
class C0616r extends PopupWindow {
    private static final boolean f1817a;
    private boolean f1818b;

    /* renamed from: android.support.v7.widget.r.1 */
    static class C06151 implements OnScrollChangedListener {
        final /* synthetic */ Field f1814a;
        final /* synthetic */ PopupWindow f1815b;
        final /* synthetic */ OnScrollChangedListener f1816c;

        C06151(Field field, PopupWindow popupWindow, OnScrollChangedListener onScrollChangedListener) {
            this.f1814a = field;
            this.f1815b = popupWindow;
            this.f1816c = onScrollChangedListener;
        }

        public void onScrollChanged() {
            try {
                WeakReference weakReference = (WeakReference) this.f1814a.get(this.f1815b);
                if (weakReference != null && weakReference.get() != null) {
                    this.f1816c.onScrollChanged();
                }
            } catch (IllegalAccessException e) {
            }
        }
    }

    static {
        f1817a = VERSION.SDK_INT < 21;
    }

    public C0616r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3135a(context, attributeSet, i, 0);
    }

    @TargetApi(11)
    public C0616r(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3135a(context, attributeSet, i, i2);
    }

    private void m3135a(Context context, AttributeSet attributeSet, int i, int i2) {
        av a = av.m2947a(context, attributeSet, C0474j.PopupWindow, i, i2);
        if (a.m2964g(C0474j.PopupWindow_overlapAnchor)) {
            m3137a(a.m2952a(C0474j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.m2950a(C0474j.PopupWindow_android_popupBackground));
        int i3 = VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a.m2964g(C0474j.PopupWindow_android_popupAnimationStyle)) {
            setAnimationStyle(a.m2963g(C0474j.PopupWindow_android_popupAnimationStyle, -1));
        }
        a.m2951a();
        if (VERSION.SDK_INT < 14) {
            C0616r.m3136a((PopupWindow) this);
        }
    }

    private static void m3136a(PopupWindow popupWindow) {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            declaredField2.set(popupWindow, new C06151(declaredField, popupWindow, (OnScrollChangedListener) declaredField2.get(popupWindow)));
        } catch (Throwable e) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    public void m3137a(boolean z) {
        if (f1817a) {
            this.f1818b = z;
        } else {
            C0382q.m1815a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1817a && this.f1818b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1817a && this.f1818b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        int height = (f1817a && this.f1818b) ? i2 - view.getHeight() : i2;
        super.update(view, i, height, i3, i4);
    }
}
