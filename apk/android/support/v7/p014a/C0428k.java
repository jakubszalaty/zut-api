package android.support.v7.p014a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.p014a.C0421h.C0420a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.C0488f.C0487a;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

/* renamed from: android.support.v7.a.k */
class C0428k extends C0427j {
    private int f895t;
    private boolean f896u;
    private boolean f897v;
    private C0432b f898w;

    /* renamed from: android.support.v7.a.k.a */
    class C0422a extends C0420a {
        final /* synthetic */ C0428k f867c;

        C0422a(C0428k c0428k, Callback callback) {
            this.f867c = c0428k;
            super(c0428k, callback);
        }

        final ActionMode m2009a(ActionMode.Callback callback) {
            Object c0487a = new C0487a(this.f867c.a, callback);
            C0461b b = this.f867c.m2045b((C0445a) c0487a);
            return b != null ? c0487a.m2289b(b) : null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f867c.m2083o() ? m2009a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* renamed from: android.support.v7.a.k.b */
    final class C0432b {
        final /* synthetic */ C0428k f901a;
        private C0457r f902b;
        private boolean f903c;
        private BroadcastReceiver f904d;
        private IntentFilter f905e;

        /* renamed from: android.support.v7.a.k.b.1 */
        class C04311 extends BroadcastReceiver {
            final /* synthetic */ C0432b f900a;

            C04311(C0432b c0432b) {
                this.f900a = c0432b;
            }

            public void onReceive(Context context, Intent intent) {
                this.f900a.m2088b();
            }
        }

        C0432b(C0428k c0428k, C0457r c0457r) {
            this.f901a = c0428k;
            this.f902b = c0457r;
            this.f903c = c0457r.m2157a();
        }

        final int m2087a() {
            return this.f903c ? 2 : 1;
        }

        final void m2088b() {
            boolean a = this.f902b.m2157a();
            if (a != this.f903c) {
                this.f903c = a;
                this.f901a.m2082i();
            }
        }

        final void m2089c() {
            m2090d();
            if (this.f904d == null) {
                this.f904d = new C04311(this);
            }
            if (this.f905e == null) {
                this.f905e = new IntentFilter();
                this.f905e.addAction("android.intent.action.TIME_SET");
                this.f905e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f905e.addAction("android.intent.action.TIME_TICK");
            }
            this.f901a.a.registerReceiver(this.f904d, this.f905e);
        }

        final void m2090d() {
            if (this.f904d != null) {
                this.f901a.a.unregisterReceiver(this.f904d);
                this.f904d = null;
            }
        }
    }

    C0428k(Context context, Window window, C0397f c0397f) {
        super(context, window, c0397f);
        this.f895t = -100;
        this.f897v = true;
    }

    private boolean m2071h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2074y()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, null);
        }
        return true;
    }

    private int m2072w() {
        return this.f895t != -100 ? this.f895t : C0417g.m1964j();
    }

    private void m2073x() {
        if (this.f898w == null) {
            this.f898w = new C0432b(this, C0457r.m2153a(this.a));
        }
    }

    private boolean m2074y() {
        if (!this.f896u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            return (this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & 512) == 0;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    Callback m2075a(Callback callback) {
        return new C0422a(this, callback);
    }

    public void m2076a(Bundle bundle) {
        super.m2036a(bundle);
        if (bundle != null && this.f895t == -100) {
            this.f895t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public void m2077c() {
        super.m1997c();
        m2082i();
    }

    public void m2078c(Bundle bundle) {
        super.m1998c(bundle);
        if (this.f895t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f895t);
        }
    }

    int m2079d(int i) {
        switch (i) {
            case -100:
                return -1;
            case C0474j.View_android_theme /*0*/:
                m2073x();
                return this.f898w.m2087a();
            default:
                return i;
        }
    }

    public void m2080d() {
        super.m2057d();
        if (this.f898w != null) {
            this.f898w.m2090d();
        }
    }

    public void m2081g() {
        super.m2063g();
        if (this.f898w != null) {
            this.f898w.m2090d();
        }
    }

    public boolean m2082i() {
        boolean z = false;
        int w = m2072w();
        int d = m2079d(w);
        if (d != -1) {
            z = m2071h(d);
        }
        if (w == 0) {
            m2073x();
            this.f898w.m2089c();
        }
        this.f896u = true;
        return z;
    }

    public boolean m2083o() {
        return this.f897v;
    }
}
