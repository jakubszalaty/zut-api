package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.as */
public final class as {
    static final C0250b f516a;

    /* renamed from: android.support.v4.g.as.b */
    interface C0250b {
        void m1235a(ViewParent viewParent, View view);

        void m1236a(ViewParent viewParent, View view, int i, int i2, int i3, int i4);

        void m1237a(ViewParent viewParent, View view, int i, int i2, int[] iArr);

        boolean m1238a(ViewParent viewParent, View view, float f, float f2);

        boolean m1239a(ViewParent viewParent, View view, float f, float f2, boolean z);

        boolean m1240a(ViewParent viewParent, View view, View view2, int i);

        void m1241b(ViewParent viewParent, View view, View view2, int i);
    }

    /* renamed from: android.support.v4.g.as.e */
    static class C0251e implements C0250b {
        C0251e() {
        }

        public void m1242a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0328x) {
                ((C0328x) viewParent).onStopNestedScroll(view);
            }
        }

        public void m1243a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0328x) {
                ((C0328x) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void m1244a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0328x) {
                ((C0328x) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean m1245a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof C0328x ? ((C0328x) viewParent).onNestedPreFling(view, f, f2) : false;
        }

        public boolean m1246a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof C0328x ? ((C0328x) viewParent).onNestedFling(view, f, f2, z) : false;
        }

        public boolean m1247a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof C0328x ? ((C0328x) viewParent).onStartNestedScroll(view, view2, i) : false;
        }

        public void m1248b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0328x) {
                ((C0328x) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: android.support.v4.g.as.a */
    static class C0252a extends C0251e {
        C0252a() {
        }
    }

    /* renamed from: android.support.v4.g.as.c */
    static class C0253c extends C0252a {
        C0253c() {
        }
    }

    /* renamed from: android.support.v4.g.as.d */
    static class C0254d extends C0253c {
        C0254d() {
        }

        public void m1249a(ViewParent viewParent, View view) {
            at.m1263a(viewParent, view);
        }

        public void m1250a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            at.m1264a(viewParent, view, i, i2, i3, i4);
        }

        public void m1251a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            at.m1265a(viewParent, view, i, i2, iArr);
        }

        public boolean m1252a(ViewParent viewParent, View view, float f, float f2) {
            return at.m1266a(viewParent, view, f, f2);
        }

        public boolean m1253a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return at.m1267a(viewParent, view, f, f2, z);
        }

        public boolean m1254a(ViewParent viewParent, View view, View view2, int i) {
            return at.m1268a(viewParent, view, view2, i);
        }

        public void m1255b(ViewParent viewParent, View view, View view2, int i) {
            at.m1269b(viewParent, view, view2, i);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f516a = new C0254d();
        } else if (i >= 19) {
            f516a = new C0253c();
        } else if (i >= 14) {
            f516a = new C0252a();
        } else {
            f516a = new C0251e();
        }
    }

    public static void m1256a(ViewParent viewParent, View view) {
        f516a.m1235a(viewParent, view);
    }

    public static void m1257a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        f516a.m1236a(viewParent, view, i, i2, i3, i4);
    }

    public static void m1258a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f516a.m1237a(viewParent, view, i, i2, iArr);
    }

    public static boolean m1259a(ViewParent viewParent, View view, float f, float f2) {
        return f516a.m1238a(viewParent, view, f, f2);
    }

    public static boolean m1260a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f516a.m1239a(viewParent, view, f, f2, z);
    }

    public static boolean m1261a(ViewParent viewParent, View view, View view2, int i) {
        return f516a.m1240a(viewParent, view, view2, i);
    }

    public static void m1262b(ViewParent viewParent, View view, View view2, int i) {
        f516a.m1241b(viewParent, view, view2, i);
    }
}
