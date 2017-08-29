package android.support.v4.p005b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.b.f */
public final class C0118f {
    private static final C0114a f383a;

    /* renamed from: android.support.v4.b.f.a */
    interface C0114a {
        Intent m463a(ComponentName componentName);
    }

    /* renamed from: android.support.v4.b.f.b */
    static class C0115b implements C0114a {
        C0115b() {
        }

        public Intent m464a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }
    }

    /* renamed from: android.support.v4.b.f.c */
    static class C0116c extends C0115b {
        C0116c() {
        }

        public Intent m465a(ComponentName componentName) {
            return C0119g.m467a(componentName);
        }
    }

    /* renamed from: android.support.v4.b.f.d */
    static class C0117d extends C0116c {
        C0117d() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            f383a = new C0117d();
        } else if (i >= 11) {
            f383a = new C0116c();
        } else {
            f383a = new C0115b();
        }
    }

    public static Intent m466a(ComponentName componentName) {
        return f383a.m463a(componentName);
    }
}
