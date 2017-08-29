package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.ae;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.q */
public final class C0382q {
    static final C0377e f699a;

    /* renamed from: android.support.v4.widget.q.e */
    interface C0377e {
        void m1803a(PopupWindow popupWindow, int i);

        void m1804a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        void m1805a(PopupWindow popupWindow, boolean z);
    }

    /* renamed from: android.support.v4.widget.q.c */
    static class C0378c implements C0377e {
        private static Method f697a;
        private static boolean f698b;

        C0378c() {
        }

        public void m1806a(PopupWindow popupWindow, int i) {
            if (!f698b) {
                try {
                    f697a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f697a.setAccessible(true);
                } catch (Exception e) {
                }
                f698b = true;
            }
            if (f697a != null) {
                try {
                    f697a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                }
            }
        }

        public void m1807a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0290f.m1466a(i3, ae.m1147d(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        public void m1808a(PopupWindow popupWindow, boolean z) {
        }
    }

    /* renamed from: android.support.v4.widget.q.d */
    static class C0379d extends C0378c {
        C0379d() {
        }

        public void m1809a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            C0385t.m1819a(popupWindow, view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.q.a */
    static class C0380a extends C0379d {
        C0380a() {
        }

        public void m1810a(PopupWindow popupWindow, boolean z) {
            C0383r.m1816a(popupWindow, z);
        }
    }

    /* renamed from: android.support.v4.widget.q.b */
    static class C0381b extends C0380a {
        C0381b() {
        }

        public void m1811a(PopupWindow popupWindow, int i) {
            C0384s.m1817a(popupWindow, i);
        }

        public void m1812a(PopupWindow popupWindow, boolean z) {
            C0384s.m1818a(popupWindow, z);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f699a = new C0381b();
        } else if (i >= 21) {
            f699a = new C0380a();
        } else if (i >= 19) {
            f699a = new C0379d();
        } else {
            f699a = new C0378c();
        }
    }

    public static void m1813a(PopupWindow popupWindow, int i) {
        f699a.m1803a(popupWindow, i);
    }

    public static void m1814a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f699a.m1804a(popupWindow, view, i, i2, i3);
    }

    public static void m1815a(PopupWindow popupWindow, boolean z) {
        f699a.m1805a(popupWindow, z);
    }
}
