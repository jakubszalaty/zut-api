package android.support.v7.view;

import android.support.v4.p007g.au;
import android.support.v4.p007g.ay;
import android.support.v4.p007g.az;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0493h {
    final ArrayList<au> f1086a;
    ay f1087b;
    private long f1088c;
    private Interpolator f1089d;
    private boolean f1090e;
    private final az f1091f;

    /* renamed from: android.support.v7.view.h.1 */
    class C04921 extends az {
        final /* synthetic */ C0493h f1083a;
        private boolean f1084b;
        private int f1085c;

        C04921(C0493h c0493h) {
            this.f1083a = c0493h;
            this.f1084b = false;
            this.f1085c = 0;
        }

        void m2303a() {
            this.f1085c = 0;
            this.f1084b = false;
            this.f1083a.m2312b();
        }

        public void m2304a(View view) {
            if (!this.f1084b) {
                this.f1084b = true;
                if (this.f1083a.f1087b != null) {
                    this.f1083a.f1087b.m1293a(null);
                }
            }
        }

        public void m2305b(View view) {
            int i = this.f1085c + 1;
            this.f1085c = i;
            if (i == this.f1083a.f1086a.size()) {
                if (this.f1083a.f1087b != null) {
                    this.f1083a.f1087b.m1294b(null);
                }
                m2303a();
            }
        }
    }

    public C0493h() {
        this.f1088c = -1;
        this.f1091f = new C04921(this);
        this.f1086a = new ArrayList();
    }

    public C0493h m2306a(long j) {
        if (!this.f1090e) {
            this.f1088c = j;
        }
        return this;
    }

    public C0493h m2307a(au auVar) {
        if (!this.f1090e) {
            this.f1086a.add(auVar);
        }
        return this;
    }

    public C0493h m2308a(au auVar, au auVar2) {
        this.f1086a.add(auVar);
        auVar2.m1317b(auVar.m1310a());
        this.f1086a.add(auVar2);
        return this;
    }

    public C0493h m2309a(ay ayVar) {
        if (!this.f1090e) {
            this.f1087b = ayVar;
        }
        return this;
    }

    public C0493h m2310a(Interpolator interpolator) {
        if (!this.f1090e) {
            this.f1089d = interpolator;
        }
        return this;
    }

    public void m2311a() {
        if (!this.f1090e) {
            Iterator it = this.f1086a.iterator();
            while (it.hasNext()) {
                au auVar = (au) it.next();
                if (this.f1088c >= 0) {
                    auVar.m1312a(this.f1088c);
                }
                if (this.f1089d != null) {
                    auVar.m1315a(this.f1089d);
                }
                if (this.f1087b != null) {
                    auVar.m1313a(this.f1091f);
                }
                auVar.m1319c();
            }
            this.f1090e = true;
        }
    }

    void m2312b() {
        this.f1090e = false;
    }

    public void m2313c() {
        if (this.f1090e) {
            Iterator it = this.f1086a.iterator();
            while (it.hasNext()) {
                ((au) it.next()).m1318b();
            }
            this.f1090e = false;
        }
    }
}
