package android.support.v4.p007g;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.g.bb */
public class bb {
    private static final C0276d f542a;
    private final Object f543b;

    /* renamed from: android.support.v4.g.bb.d */
    private interface C0276d {
        int m1411a(Object obj);

        bb m1412a(Object obj, int i, int i2, int i3, int i4);

        int m1413b(Object obj);

        int m1414c(Object obj);

        int m1415d(Object obj);
    }

    /* renamed from: android.support.v4.g.bb.c */
    private static class C0277c implements C0276d {
        C0277c() {
        }

        public int m1416a(Object obj) {
            return 0;
        }

        public bb m1417a(Object obj, int i, int i2, int i3, int i4) {
            return null;
        }

        public int m1418b(Object obj) {
            return 0;
        }

        public int m1419c(Object obj) {
            return 0;
        }

        public int m1420d(Object obj) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.g.bb.a */
    private static class C0278a extends C0277c {
        C0278a() {
        }

        public int m1421a(Object obj) {
            return bc.m1433a(obj);
        }

        public bb m1422a(Object obj, int i, int i2, int i3, int i4) {
            return new bb(bc.m1434a(obj, i, i2, i3, i4));
        }

        public int m1423b(Object obj) {
            return bc.m1435b(obj);
        }

        public int m1424c(Object obj) {
            return bc.m1436c(obj);
        }

        public int m1425d(Object obj) {
            return bc.m1437d(obj);
        }
    }

    /* renamed from: android.support.v4.g.bb.b */
    private static class C0279b extends C0278a {
        C0279b() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f542a = new C0279b();
        } else if (i >= 20) {
            f542a = new C0278a();
        } else {
            f542a = new C0277c();
        }
    }

    bb(Object obj) {
        this.f543b = obj;
    }

    static bb m1426a(Object obj) {
        return obj == null ? null : new bb(obj);
    }

    static Object m1427a(bb bbVar) {
        return bbVar == null ? null : bbVar.f543b;
    }

    public int m1428a() {
        return f542a.m1413b(this.f543b);
    }

    public bb m1429a(int i, int i2, int i3, int i4) {
        return f542a.m1412a(this.f543b, i, i2, i3, i4);
    }

    public int m1430b() {
        return f542a.m1415d(this.f543b);
    }

    public int m1431c() {
        return f542a.m1414c(this.f543b);
    }

    public int m1432d() {
        return f542a.m1411a(this.f543b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f543b == null ? bbVar.f543b == null : this.f543b.equals(bbVar.f543b);
    }

    public int hashCode() {
        return this.f543b == null ? 0 : this.f543b.hashCode();
    }
}
