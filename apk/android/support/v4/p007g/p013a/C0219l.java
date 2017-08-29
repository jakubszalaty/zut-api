package android.support.v4.p007g.p013a;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.g.a.l */
public class C0219l {
    private static final C0214c f502a;
    private final Object f503b;

    /* renamed from: android.support.v4.g.a.l.c */
    interface C0214c {
        void m957a(Object obj, int i);

        void m958a(Object obj, boolean z);

        void m959b(Object obj, int i);

        void m960c(Object obj, int i);

        void m961d(Object obj, int i);
    }

    /* renamed from: android.support.v4.g.a.l.e */
    static class C0215e implements C0214c {
        C0215e() {
        }

        public void m962a(Object obj, int i) {
        }

        public void m963a(Object obj, boolean z) {
        }

        public void m964b(Object obj, int i) {
        }

        public void m965c(Object obj, int i) {
        }

        public void m966d(Object obj, int i) {
        }
    }

    /* renamed from: android.support.v4.g.a.l.a */
    static class C0216a extends C0215e {
        C0216a() {
        }

        public void m967a(Object obj, int i) {
            C0220m.m977a(obj, i);
        }

        public void m968a(Object obj, boolean z) {
            C0220m.m978a(obj, z);
        }

        public void m969b(Object obj, int i) {
            C0220m.m979b(obj, i);
        }
    }

    /* renamed from: android.support.v4.g.a.l.b */
    static class C0217b extends C0216a {
        C0217b() {
        }

        public void m970c(Object obj, int i) {
            C0221n.m980a(obj, i);
        }

        public void m971d(Object obj, int i) {
            C0221n.m981b(obj, i);
        }
    }

    /* renamed from: android.support.v4.g.a.l.d */
    static class C0218d extends C0217b {
        C0218d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f502a = new C0218d();
        } else if (VERSION.SDK_INT >= 15) {
            f502a = new C0217b();
        } else if (VERSION.SDK_INT >= 14) {
            f502a = new C0216a();
        } else {
            f502a = new C0215e();
        }
    }

    @Deprecated
    public C0219l(Object obj) {
        this.f503b = obj;
    }

    public void m972a(int i) {
        f502a.m957a(this.f503b, i);
    }

    public void m973a(boolean z) {
        f502a.m958a(this.f503b, z);
    }

    public void m974b(int i) {
        f502a.m959b(this.f503b, i);
    }

    public void m975c(int i) {
        f502a.m960c(this.f503b, i);
    }

    public void m976d(int i) {
        f502a.m961d(this.f503b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0219l c0219l = (C0219l) obj;
        return this.f503b == null ? c0219l.f503b == null : this.f503b.equals(c0219l.f503b);
    }

    public int hashCode() {
        return this.f503b == null ? 0 : this.f503b.hashCode();
    }
}
