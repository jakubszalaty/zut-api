package android.support.v4.p006a;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.a.d */
public final class C0045d {
    private static final C0043b f135a;

    /* renamed from: android.support.v4.a.d.b */
    private static class C0043b {
        C0043b() {
        }

        public int m90a(Context context, String str, String str2) {
            return 1;
        }

        public String m91a(String str) {
            return null;
        }
    }

    /* renamed from: android.support.v4.a.d.a */
    private static class C0044a extends C0043b {
        C0044a() {
        }

        public int m92a(Context context, String str, String str2) {
            return C0046e.m96a(context, str, str2);
        }

        public String m93a(String str) {
            return C0046e.m97a(str);
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f135a = new C0044a();
        } else {
            f135a = new C0043b();
        }
    }

    public static int m94a(Context context, String str, String str2) {
        return f135a.m90a(context, str, str2);
    }

    public static String m95a(String str) {
        return f135a.m91a(str);
    }
}
