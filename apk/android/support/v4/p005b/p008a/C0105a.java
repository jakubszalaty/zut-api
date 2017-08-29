package android.support.v4.p005b.p008a;

import android.content.res.Resources;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.b.a.a */
public final class C0105a {
    private static final C0101a f382a;

    /* renamed from: android.support.v4.b.a.a.a */
    private interface C0101a {
        int m439a(Resources resources);

        int m440b(Resources resources);

        int m441c(Resources resources);
    }

    /* renamed from: android.support.v4.b.a.a.b */
    private static class C0102b implements C0101a {
        C0102b() {
        }

        public int m442a(Resources resources) {
            return C0106b.m451a(resources);
        }

        public int m443b(Resources resources) {
            return C0106b.m452b(resources);
        }

        public int m444c(Resources resources) {
            return C0106b.m453c(resources);
        }
    }

    /* renamed from: android.support.v4.b.a.a.c */
    private static class C0103c extends C0102b {
        C0103c() {
        }

        public int m445a(Resources resources) {
            return C0107c.m454a(resources);
        }

        public int m446b(Resources resources) {
            return C0107c.m455b(resources);
        }

        public int m447c(Resources resources) {
            return C0107c.m456c(resources);
        }
    }

    /* renamed from: android.support.v4.b.a.a.d */
    private static class C0104d extends C0103c {
        C0104d() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f382a = new C0104d();
        } else if (i >= 13) {
            f382a = new C0103c();
        } else {
            f382a = new C0102b();
        }
    }

    public static int m448a(Resources resources) {
        return f382a.m439a(resources);
    }

    public static int m449b(Resources resources) {
        return f382a.m440b(resources);
    }

    public static int m450c(Resources resources) {
        return f382a.m441c(resources);
    }
}
