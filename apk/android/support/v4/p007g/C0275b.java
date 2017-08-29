package android.support.v4.p007g;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p007g.C0281c.C0267a;
import android.support.v4.p007g.C0283d.C0272a;
import android.support.v4.p007g.p013a.C0194b;
import android.support.v4.p007g.p013a.C0209i;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.g.b */
public class C0275b {
    private static final C0269b f539b;
    private static final Object f540c;
    final Object f541a;

    /* renamed from: android.support.v4.g.b.b */
    interface C0269b {
        C0209i m1348a(Object obj, View view);

        Object m1349a();

        Object m1350a(C0275b c0275b);

        void m1351a(Object obj, View view, int i);

        void m1352a(Object obj, View view, C0194b c0194b);

        boolean m1353a(Object obj, View view, int i, Bundle bundle);

        boolean m1354a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        boolean m1355a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void m1356b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void m1357c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void m1358d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.g.b.d */
    static class C0270d implements C0269b {
        C0270d() {
        }

        public C0209i m1359a(Object obj, View view) {
            return null;
        }

        public Object m1360a() {
            return null;
        }

        public Object m1361a(C0275b c0275b) {
            return null;
        }

        public void m1362a(Object obj, View view, int i) {
        }

        public void m1363a(Object obj, View view, C0194b c0194b) {
        }

        public boolean m1364a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean m1365a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        public boolean m1366a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        public void m1367b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public void m1368c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public void m1369d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    /* renamed from: android.support.v4.g.b.a */
    static class C0271a extends C0270d {

        /* renamed from: android.support.v4.g.b.a.1 */
        class C02681 implements C0267a {
            final /* synthetic */ C0275b f535a;
            final /* synthetic */ C0271a f536b;

            C02681(C0271a c0271a, C0275b c0275b) {
                this.f536b = c0271a;
                this.f535a = c0275b;
            }

            public void m1341a(View view, int i) {
                this.f535a.m1402a(view, i);
            }

            public void m1342a(View view, Object obj) {
                this.f535a.m1403a(view, new C0194b(obj));
            }

            public boolean m1343a(View view, AccessibilityEvent accessibilityEvent) {
                return this.f535a.m1407b(view, accessibilityEvent);
            }

            public boolean m1344a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.f535a.m1406a(viewGroup, view, accessibilityEvent);
            }

            public void m1345b(View view, AccessibilityEvent accessibilityEvent) {
                this.f535a.m1409d(view, accessibilityEvent);
            }

            public void m1346c(View view, AccessibilityEvent accessibilityEvent) {
                this.f535a.m1408c(view, accessibilityEvent);
            }

            public void m1347d(View view, AccessibilityEvent accessibilityEvent) {
                this.f535a.m1404a(view, accessibilityEvent);
            }
        }

        C0271a() {
        }

        public Object m1370a() {
            return C0281c.m1438a();
        }

        public Object m1371a(C0275b c0275b) {
            return C0281c.m1439a(new C02681(this, c0275b));
        }

        public void m1372a(Object obj, View view, int i) {
            C0281c.m1440a(obj, view, i);
        }

        public void m1373a(Object obj, View view, C0194b c0194b) {
            C0281c.m1441a(obj, view, c0194b.m841a());
        }

        public boolean m1374a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return C0281c.m1442a(obj, view, accessibilityEvent);
        }

        public boolean m1375a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0281c.m1443a(obj, viewGroup, view, accessibilityEvent);
        }

        public void m1376b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0281c.m1444b(obj, view, accessibilityEvent);
        }

        public void m1377c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0281c.m1445c(obj, view, accessibilityEvent);
        }

        public void m1378d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0281c.m1446d(obj, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.g.b.c */
    static class C0274c extends C0271a {

        /* renamed from: android.support.v4.g.b.c.1 */
        class C02731 implements C0272a {
            final /* synthetic */ C0275b f537a;
            final /* synthetic */ C0274c f538b;

            C02731(C0274c c0274c, C0275b c0275b) {
                this.f538b = c0274c;
                this.f537a = c0275b;
            }

            public Object m1388a(View view) {
                C0209i a = this.f537a.m1400a(view);
                return a != null ? a.m951a() : null;
            }

            public void m1389a(View view, int i) {
                this.f537a.m1402a(view, i);
            }

            public void m1390a(View view, Object obj) {
                this.f537a.m1403a(view, new C0194b(obj));
            }

            public boolean m1391a(View view, int i, Bundle bundle) {
                return this.f537a.m1405a(view, i, bundle);
            }

            public boolean m1392a(View view, AccessibilityEvent accessibilityEvent) {
                return this.f537a.m1407b(view, accessibilityEvent);
            }

            public boolean m1393a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.f537a.m1406a(viewGroup, view, accessibilityEvent);
            }

            public void m1394b(View view, AccessibilityEvent accessibilityEvent) {
                this.f537a.m1409d(view, accessibilityEvent);
            }

            public void m1395c(View view, AccessibilityEvent accessibilityEvent) {
                this.f537a.m1408c(view, accessibilityEvent);
            }

            public void m1396d(View view, AccessibilityEvent accessibilityEvent) {
                this.f537a.m1404a(view, accessibilityEvent);
            }
        }

        C0274c() {
        }

        public C0209i m1397a(Object obj, View view) {
            Object a = C0283d.m1448a(obj, view);
            return a != null ? new C0209i(a) : null;
        }

        public Object m1398a(C0275b c0275b) {
            return C0283d.m1447a(new C02731(this, c0275b));
        }

        public boolean m1399a(Object obj, View view, int i, Bundle bundle) {
            return C0283d.m1449a(obj, view, i, bundle);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f539b = new C0274c();
        } else if (VERSION.SDK_INT >= 14) {
            f539b = new C0271a();
        } else {
            f539b = new C0270d();
        }
        f540c = f539b.m1349a();
    }

    public C0275b() {
        this.f541a = f539b.m1350a(this);
    }

    public C0209i m1400a(View view) {
        return f539b.m1348a(f540c, view);
    }

    Object m1401a() {
        return this.f541a;
    }

    public void m1402a(View view, int i) {
        f539b.m1351a(f540c, view, i);
    }

    public void m1403a(View view, C0194b c0194b) {
        f539b.m1352a(f540c, view, c0194b);
    }

    public void m1404a(View view, AccessibilityEvent accessibilityEvent) {
        f539b.m1358d(f540c, view, accessibilityEvent);
    }

    public boolean m1405a(View view, int i, Bundle bundle) {
        return f539b.m1353a(f540c, view, i, bundle);
    }

    public boolean m1406a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f539b.m1355a(f540c, viewGroup, view, accessibilityEvent);
    }

    public boolean m1407b(View view, AccessibilityEvent accessibilityEvent) {
        return f539b.m1354a(f540c, view, accessibilityEvent);
    }

    public void m1408c(View view, AccessibilityEvent accessibilityEvent) {
        f539b.m1357c(f540c, view, accessibilityEvent);
    }

    public void m1409d(View view, AccessibilityEvent accessibilityEvent) {
        f539b.m1356b(f540c, view, accessibilityEvent);
    }
}
