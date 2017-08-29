package android.support.v4.p003c.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.c.a.a */
public final class C0129a {
    static final C0122b f392a;

    /* renamed from: android.support.v4.c.a.a.b */
    interface C0122b {
        void m482a(Drawable drawable);

        void m483a(Drawable drawable, float f, float f2);

        void m484a(Drawable drawable, int i);

        void m485a(Drawable drawable, int i, int i2, int i3, int i4);

        void m486a(Drawable drawable, ColorStateList colorStateList);

        void m487a(Drawable drawable, Theme theme);

        void m488a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);

        void m489a(Drawable drawable, Mode mode);

        void m490a(Drawable drawable, boolean z);

        boolean m491b(Drawable drawable);

        boolean m492b(Drawable drawable, int i);

        Drawable m493c(Drawable drawable);

        int m494d(Drawable drawable);

        int m495e(Drawable drawable);

        boolean m496f(Drawable drawable);

        ColorFilter m497g(Drawable drawable);
    }

    /* renamed from: android.support.v4.c.a.a.a */
    static class C0123a implements C0122b {
        C0123a() {
        }

        public void m498a(Drawable drawable) {
        }

        public void m499a(Drawable drawable, float f, float f2) {
        }

        public void m500a(Drawable drawable, int i) {
            C0131c.m554a(drawable, i);
        }

        public void m501a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public void m502a(Drawable drawable, ColorStateList colorStateList) {
            C0131c.m555a(drawable, colorStateList);
        }

        public void m503a(Drawable drawable, Theme theme) {
        }

        public void m504a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            C0131c.m556a(drawable, resources, xmlPullParser, attributeSet, theme);
        }

        public void m505a(Drawable drawable, Mode mode) {
            C0131c.m557a(drawable, mode);
        }

        public void m506a(Drawable drawable, boolean z) {
        }

        public boolean m507b(Drawable drawable) {
            return false;
        }

        public boolean m508b(Drawable drawable, int i) {
            return false;
        }

        public Drawable m509c(Drawable drawable) {
            return C0131c.m553a(drawable);
        }

        public int m510d(Drawable drawable) {
            return 0;
        }

        public int m511e(Drawable drawable) {
            return 0;
        }

        public boolean m512f(Drawable drawable) {
            return false;
        }

        public ColorFilter m513g(Drawable drawable) {
            return null;
        }
    }

    /* renamed from: android.support.v4.c.a.a.c */
    static class C0124c extends C0123a {
        C0124c() {
        }

        public void m514a(Drawable drawable) {
            C0132d.m558a(drawable);
        }

        public Drawable m515c(Drawable drawable) {
            return C0132d.m559b(drawable);
        }
    }

    /* renamed from: android.support.v4.c.a.a.d */
    static class C0125d extends C0124c {
        C0125d() {
        }

        public boolean m516b(Drawable drawable, int i) {
            return C0133e.m561a(drawable, i);
        }

        public int m517d(Drawable drawable) {
            int a = C0133e.m560a(drawable);
            return a >= 0 ? a : 0;
        }
    }

    /* renamed from: android.support.v4.c.a.a.e */
    static class C0126e extends C0125d {
        C0126e() {
        }

        public void m518a(Drawable drawable, boolean z) {
            C0134f.m562a(drawable, z);
        }

        public boolean m519b(Drawable drawable) {
            return C0134f.m563a(drawable);
        }

        public Drawable m520c(Drawable drawable) {
            return C0134f.m564b(drawable);
        }

        public int m521e(Drawable drawable) {
            return C0134f.m565c(drawable);
        }
    }

    /* renamed from: android.support.v4.c.a.a.f */
    static class C0127f extends C0126e {
        C0127f() {
        }

        public void m522a(Drawable drawable, float f, float f2) {
            C0135g.m567a(drawable, f, f2);
        }

        public void m523a(Drawable drawable, int i) {
            C0135g.m568a(drawable, i);
        }

        public void m524a(Drawable drawable, int i, int i2, int i3, int i4) {
            C0135g.m569a(drawable, i, i2, i3, i4);
        }

        public void m525a(Drawable drawable, ColorStateList colorStateList) {
            C0135g.m570a(drawable, colorStateList);
        }

        public void m526a(Drawable drawable, Theme theme) {
            C0135g.m571a(drawable, theme);
        }

        public void m527a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            C0135g.m572a(drawable, resources, xmlPullParser, attributeSet, theme);
        }

        public void m528a(Drawable drawable, Mode mode) {
            C0135g.m573a(drawable, mode);
        }

        public Drawable m529c(Drawable drawable) {
            return C0135g.m566a(drawable);
        }

        public boolean m530f(Drawable drawable) {
            return C0135g.m574b(drawable);
        }

        public ColorFilter m531g(Drawable drawable) {
            return C0135g.m575c(drawable);
        }
    }

    /* renamed from: android.support.v4.c.a.a.g */
    static class C0128g extends C0127f {
        C0128g() {
        }

        public boolean m532b(Drawable drawable, int i) {
            return C0130b.m552a(drawable, i);
        }

        public Drawable m533c(Drawable drawable) {
            return drawable;
        }

        public int m534d(Drawable drawable) {
            return C0130b.m551a(drawable);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f392a = new C0128g();
        } else if (i >= 21) {
            f392a = new C0127f();
        } else if (i >= 19) {
            f392a = new C0126e();
        } else if (i >= 17) {
            f392a = new C0125d();
        } else if (i >= 11) {
            f392a = new C0124c();
        } else {
            f392a = new C0123a();
        }
    }

    public static void m535a(Drawable drawable) {
        f392a.m482a(drawable);
    }

    public static void m536a(Drawable drawable, float f, float f2) {
        f392a.m483a(drawable, f, f2);
    }

    public static void m537a(Drawable drawable, int i) {
        f392a.m484a(drawable, i);
    }

    public static void m538a(Drawable drawable, int i, int i2, int i3, int i4) {
        f392a.m485a(drawable, i, i2, i3, i4);
    }

    public static void m539a(Drawable drawable, ColorStateList colorStateList) {
        f392a.m486a(drawable, colorStateList);
    }

    public static void m540a(Drawable drawable, Theme theme) {
        f392a.m487a(drawable, theme);
    }

    public static void m541a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        f392a.m488a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static void m542a(Drawable drawable, Mode mode) {
        f392a.m489a(drawable, mode);
    }

    public static void m543a(Drawable drawable, boolean z) {
        f392a.m490a(drawable, z);
    }

    public static boolean m544b(Drawable drawable) {
        return f392a.m491b(drawable);
    }

    public static boolean m545b(Drawable drawable, int i) {
        return f392a.m492b(drawable, i);
    }

    public static int m546c(Drawable drawable) {
        return f392a.m495e(drawable);
    }

    public static boolean m547d(Drawable drawable) {
        return f392a.m496f(drawable);
    }

    public static ColorFilter m548e(Drawable drawable) {
        return f392a.m497g(drawable);
    }

    public static Drawable m549f(Drawable drawable) {
        return f392a.m493c(drawable);
    }

    public static int m550g(Drawable drawable) {
        return f392a.m494d(drawable);
    }
}
