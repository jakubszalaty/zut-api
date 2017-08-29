package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.g.au */
public final class au {
    static final C0256g f524d;
    Runnable f525a;
    Runnable f526b;
    int f527c;
    private WeakReference<View> f528e;

    /* renamed from: android.support.v4.g.au.g */
    interface C0256g {
        long m1270a(au auVar, View view);

        void m1271a(au auVar, View view, float f);

        void m1272a(au auVar, View view, long j);

        void m1273a(au auVar, View view, ay ayVar);

        void m1274a(au auVar, View view, ba baVar);

        void m1275a(au auVar, View view, Interpolator interpolator);

        void m1276b(au auVar, View view);

        void m1277b(au auVar, View view, float f);

        void m1278b(au auVar, View view, long j);

        void m1279c(au auVar, View view);
    }

    /* renamed from: android.support.v4.g.au.a */
    static class C0257a implements C0256g {
        WeakHashMap<View, Runnable> f520a;

        /* renamed from: android.support.v4.g.au.a.a */
        class C0255a implements Runnable {
            WeakReference<View> f517a;
            au f518b;
            final /* synthetic */ C0257a f519c;

            C0255a(C0257a c0257a, au auVar, View view) {
                this.f519c = c0257a;
                this.f517a = new WeakReference(view);
                this.f518b = auVar;
            }

            public void run() {
                View view = (View) this.f517a.get();
                if (view != null) {
                    this.f519c.m1292d(this.f518b, view);
                }
            }
        }

        C0257a() {
            this.f520a = null;
        }

        private void m1280a(View view) {
            if (this.f520a != null) {
                Runnable runnable = (Runnable) this.f520a.get(view);
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }

        private void m1281e(au auVar, View view) {
            Runnable runnable = null;
            if (this.f520a != null) {
                runnable = (Runnable) this.f520a.get(view);
            }
            if (runnable == null) {
                runnable = new C0255a(this, auVar, view);
                if (this.f520a == null) {
                    this.f520a = new WeakHashMap();
                }
                this.f520a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }

        public long m1282a(au auVar, View view) {
            return 0;
        }

        public void m1283a(au auVar, View view, float f) {
            m1281e(auVar, view);
        }

        public void m1284a(au auVar, View view, long j) {
        }

        public void m1285a(au auVar, View view, ay ayVar) {
            view.setTag(2113929216, ayVar);
        }

        public void m1286a(au auVar, View view, ba baVar) {
        }

        public void m1287a(au auVar, View view, Interpolator interpolator) {
        }

        public void m1288b(au auVar, View view) {
            m1281e(auVar, view);
        }

        public void m1289b(au auVar, View view, float f) {
            m1281e(auVar, view);
        }

        public void m1290b(au auVar, View view, long j) {
        }

        public void m1291c(au auVar, View view) {
            m1280a(view);
            m1292d(auVar, view);
        }

        void m1292d(au auVar, View view) {
            Object tag = view.getTag(2113929216);
            ay ayVar = tag instanceof ay ? (ay) tag : null;
            Runnable runnable = auVar.f525a;
            Runnable runnable2 = auVar.f526b;
            auVar.f525a = null;
            auVar.f526b = null;
            if (runnable != null) {
                runnable.run();
            }
            if (ayVar != null) {
                ayVar.m1293a(view);
                ayVar.m1294b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f520a != null) {
                this.f520a.remove(view);
            }
        }
    }

    /* renamed from: android.support.v4.g.au.b */
    static class C0259b extends C0257a {
        WeakHashMap<View, Integer> f523b;

        /* renamed from: android.support.v4.g.au.b.a */
        static class C0258a implements ay {
            au f521a;
            boolean f522b;

            C0258a(au auVar) {
                this.f521a = auVar;
            }

            public void m1296a(View view) {
                this.f522b = false;
                if (this.f521a.f527c >= 0) {
                    ae.m1131a(view, 2, null);
                }
                if (this.f521a.f525a != null) {
                    Runnable runnable = this.f521a.f525a;
                    this.f521a.f525a = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                ay ayVar = tag instanceof ay ? (ay) tag : null;
                if (ayVar != null) {
                    ayVar.m1293a(view);
                }
            }

            public void m1297b(View view) {
                if (this.f521a.f527c >= 0) {
                    ae.m1131a(view, this.f521a.f527c, null);
                    this.f521a.f527c = -1;
                }
                if (VERSION.SDK_INT >= 16 || !this.f522b) {
                    if (this.f521a.f526b != null) {
                        Runnable runnable = this.f521a.f526b;
                        this.f521a.f526b = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(2113929216);
                    ay ayVar = tag instanceof ay ? (ay) tag : null;
                    if (ayVar != null) {
                        ayVar.m1294b(view);
                    }
                    this.f522b = true;
                }
            }

            public void m1298c(View view) {
                Object tag = view.getTag(2113929216);
                ay ayVar = tag instanceof ay ? (ay) tag : null;
                if (ayVar != null) {
                    ayVar.m1295c(view);
                }
            }
        }

        C0259b() {
            this.f523b = null;
        }

        public long m1299a(au auVar, View view) {
            return av.m1320a(view);
        }

        public void m1300a(au auVar, View view, float f) {
            av.m1321a(view, f);
        }

        public void m1301a(au auVar, View view, long j) {
            av.m1322a(view, j);
        }

        public void m1302a(au auVar, View view, ay ayVar) {
            view.setTag(2113929216, ayVar);
            av.m1323a(view, new C0258a(auVar));
        }

        public void m1303a(au auVar, View view, Interpolator interpolator) {
            av.m1324a(view, interpolator);
        }

        public void m1304b(au auVar, View view) {
            av.m1325b(view);
        }

        public void m1305b(au auVar, View view, float f) {
            av.m1326b(view, f);
        }

        public void m1306b(au auVar, View view, long j) {
            av.m1327b(view, j);
        }

        public void m1307c(au auVar, View view) {
            av.m1328c(view);
        }
    }

    /* renamed from: android.support.v4.g.au.d */
    static class C0260d extends C0259b {
        C0260d() {
        }

        public void m1308a(au auVar, View view, ay ayVar) {
            aw.m1329a(view, ayVar);
        }
    }

    /* renamed from: android.support.v4.g.au.c */
    static class C0261c extends C0260d {
        C0261c() {
        }
    }

    /* renamed from: android.support.v4.g.au.e */
    static class C0262e extends C0261c {
        C0262e() {
        }

        public void m1309a(au auVar, View view, ba baVar) {
            ax.m1330a(view, baVar);
        }
    }

    /* renamed from: android.support.v4.g.au.f */
    static class C0263f extends C0262e {
        C0263f() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f524d = new C0263f();
        } else if (i >= 19) {
            f524d = new C0262e();
        } else if (i >= 18) {
            f524d = new C0261c();
        } else if (i >= 16) {
            f524d = new C0260d();
        } else if (i >= 14) {
            f524d = new C0259b();
        } else {
            f524d = new C0257a();
        }
    }

    au(View view) {
        this.f525a = null;
        this.f526b = null;
        this.f527c = -1;
        this.f528e = new WeakReference(view);
    }

    public long m1310a() {
        View view = (View) this.f528e.get();
        return view != null ? f524d.m1270a(this, view) : 0;
    }

    public au m1311a(float f) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1271a(this, view, f);
        }
        return this;
    }

    public au m1312a(long j) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1272a(this, view, j);
        }
        return this;
    }

    public au m1313a(ay ayVar) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1273a(this, view, ayVar);
        }
        return this;
    }

    public au m1314a(ba baVar) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1274a(this, view, baVar);
        }
        return this;
    }

    public au m1315a(Interpolator interpolator) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1275a(this, view, interpolator);
        }
        return this;
    }

    public au m1316b(float f) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1277b(this, view, f);
        }
        return this;
    }

    public au m1317b(long j) {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1278b(this, view, j);
        }
        return this;
    }

    public void m1318b() {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1276b(this, view);
        }
    }

    public void m1319c() {
        View view = (View) this.f528e.get();
        if (view != null) {
            f524d.m1279c(this, view);
        }
    }
}
