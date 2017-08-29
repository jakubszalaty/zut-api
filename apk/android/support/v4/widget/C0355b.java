package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

/* renamed from: android.support.v4.widget.b */
public final class C0355b {
    private static final C0351c f678a;

    /* renamed from: android.support.v4.widget.b.c */
    interface C0351c {
        Drawable m1724a(CompoundButton compoundButton);

        void m1725a(CompoundButton compoundButton, ColorStateList colorStateList);

        void m1726a(CompoundButton compoundButton, Mode mode);
    }

    /* renamed from: android.support.v4.widget.b.b */
    static class C0352b implements C0351c {
        C0352b() {
        }

        public Drawable m1727a(CompoundButton compoundButton) {
            return C0357d.m1737a(compoundButton);
        }

        public void m1728a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C0357d.m1738a(compoundButton, colorStateList);
        }

        public void m1729a(CompoundButton compoundButton, Mode mode) {
            C0357d.m1739a(compoundButton, mode);
        }
    }

    /* renamed from: android.support.v4.widget.b.d */
    static class C0353d extends C0352b {
        C0353d() {
        }

        public void m1730a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C0358e.m1740a(compoundButton, colorStateList);
        }

        public void m1731a(CompoundButton compoundButton, Mode mode) {
            C0358e.m1741a(compoundButton, mode);
        }
    }

    /* renamed from: android.support.v4.widget.b.a */
    static class C0354a extends C0353d {
        C0354a() {
        }

        public Drawable m1732a(CompoundButton compoundButton) {
            return C0356c.m1736a(compoundButton);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f678a = new C0354a();
        } else if (i >= 21) {
            f678a = new C0353d();
        } else {
            f678a = new C0352b();
        }
    }

    public static Drawable m1733a(CompoundButton compoundButton) {
        return f678a.m1724a(compoundButton);
    }

    public static void m1734a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f678a.m1725a(compoundButton, colorStateList);
    }

    public static void m1735a(CompoundButton compoundButton, Mode mode) {
        f678a.m1726a(compoundButton, mode);
    }
}
