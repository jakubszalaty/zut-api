package android.support.v4.p007g.p013a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p007g.p013a.C0211j.C0202a;
import android.support.v4.p007g.p013a.C0213k.C0206a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.g.a.i */
public class C0209i {
    private static final C0201a f498a;
    private final Object f499b;

    /* renamed from: android.support.v4.g.a.i.a */
    interface C0201a {
        Object m932a(C0209i c0209i);
    }

    /* renamed from: android.support.v4.g.a.i.d */
    static class C0204d implements C0201a {
        C0204d() {
        }

        public Object m939a(C0209i c0209i) {
            return null;
        }
    }

    /* renamed from: android.support.v4.g.a.i.b */
    private static class C0205b extends C0204d {

        /* renamed from: android.support.v4.g.a.i.b.1 */
        class C02031 implements C0202a {
            final /* synthetic */ C0209i f494a;
            final /* synthetic */ C0205b f495b;

            C02031(C0205b c0205b, C0209i c0209i) {
                this.f495b = c0205b;
                this.f494a = c0209i;
            }

            public Object m936a(int i) {
                C0194b a = this.f494a.m950a(i);
                return a == null ? null : a.m841a();
            }

            public List<Object> m937a(String str, int i) {
                List a = this.f494a.m952a(str, i);
                if (a == null) {
                    return null;
                }
                List<Object> arrayList = new ArrayList();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((C0194b) a.get(i2)).m841a());
                }
                return arrayList;
            }

            public boolean m938a(int i, int i2, Bundle bundle) {
                return this.f494a.m953a(i, i2, bundle);
            }
        }

        C0205b() {
        }

        public Object m940a(C0209i c0209i) {
            return C0211j.m955a(new C02031(this, c0209i));
        }
    }

    /* renamed from: android.support.v4.g.a.i.c */
    private static class C0208c extends C0204d {

        /* renamed from: android.support.v4.g.a.i.c.1 */
        class C02071 implements C0206a {
            final /* synthetic */ C0209i f496a;
            final /* synthetic */ C0208c f497b;

            C02071(C0208c c0208c, C0209i c0209i) {
                this.f497b = c0208c;
                this.f496a = c0209i;
            }

            public Object m945a(int i) {
                C0194b a = this.f496a.m950a(i);
                return a == null ? null : a.m841a();
            }

            public List<Object> m946a(String str, int i) {
                List a = this.f496a.m952a(str, i);
                if (a == null) {
                    return null;
                }
                List<Object> arrayList = new ArrayList();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((C0194b) a.get(i2)).m841a());
                }
                return arrayList;
            }

            public boolean m947a(int i, int i2, Bundle bundle) {
                return this.f496a.m953a(i, i2, bundle);
            }

            public Object m948b(int i) {
                C0194b b = this.f496a.m954b(i);
                return b == null ? null : b.m841a();
            }
        }

        C0208c() {
        }

        public Object m949a(C0209i c0209i) {
            return C0213k.m956a(new C02071(this, c0209i));
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f498a = new C0208c();
        } else if (VERSION.SDK_INT >= 16) {
            f498a = new C0205b();
        } else {
            f498a = new C0204d();
        }
    }

    public C0209i() {
        this.f499b = f498a.m932a(this);
    }

    public C0209i(Object obj) {
        this.f499b = obj;
    }

    public C0194b m950a(int i) {
        return null;
    }

    public Object m951a() {
        return this.f499b;
    }

    public List<C0194b> m952a(String str, int i) {
        return null;
    }

    public boolean m953a(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0194b m954b(int i) {
        return null;
    }
}
