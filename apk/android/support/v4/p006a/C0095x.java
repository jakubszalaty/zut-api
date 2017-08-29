package android.support.v4.p006a;

import android.os.Bundle;
import android.support.v4.p005b.C0120h;
import android.support.v4.p005b.C0120h.C0092a;
import android.support.v4.p005b.C0120h.C0093b;
import android.support.v4.p006a.C0091w.C0090a;
import android.support.v4.p012f.C0163c;
import android.support.v4.p012f.C0172i;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.a.x */
class C0095x extends C0091w {
    static boolean f374a;
    final C0172i<C0094a> f375b;
    final C0172i<C0094a> f376c;
    final String f377d;
    boolean f378e;
    boolean f379f;
    C0065o f380g;

    /* renamed from: android.support.v4.a.x.a */
    final class C0094a implements C0092a<Object>, C0093b<Object> {
        final int f359a;
        final Bundle f360b;
        C0090a<Object> f361c;
        C0120h<Object> f362d;
        boolean f363e;
        boolean f364f;
        Object f365g;
        boolean f366h;
        boolean f367i;
        boolean f368j;
        boolean f369k;
        boolean f370l;
        boolean f371m;
        C0094a f372n;
        final /* synthetic */ C0095x f373o;

        void m398a() {
            if (this.f367i && this.f368j) {
                this.f366h = true;
            } else if (!this.f366h) {
                this.f366h = true;
                if (C0095x.f374a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.f362d == null && this.f361c != null) {
                    this.f362d = this.f361c.m394a(this.f359a, this.f360b);
                }
                if (this.f362d == null) {
                    return;
                }
                if (!this.f362d.getClass().isMemberClass() || Modifier.isStatic(this.f362d.getClass().getModifiers())) {
                    if (!this.f371m) {
                        this.f362d.m470a(this.f359a, this);
                        this.f362d.m471a((C0092a) this);
                        this.f371m = true;
                    }
                    this.f362d.m469a();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f362d);
            }
        }

        void m399a(C0120h<Object> c0120h, Object obj) {
            String str;
            if (this.f361c != null) {
                if (this.f373o.f380g != null) {
                    String str2 = this.f373o.f380g.f259d.f314v;
                    this.f373o.f380g.f259d.f314v = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0095x.f374a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + c0120h + ": " + c0120h.m468a(obj));
                    }
                    this.f361c.m396a((C0120h) c0120h, obj);
                    this.f364f = true;
                } finally {
                    if (this.f373o.f380g != null) {
                        this.f373o.f380g.f259d.f314v = str;
                    }
                }
            }
        }

        public void m400a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f359a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f360b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f361c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f362d);
            if (this.f362d != null) {
                this.f362d.m473a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f363e || this.f364f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f363e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f364f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f365g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f366h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f369k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f370l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f367i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f368j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f371m);
            if (this.f372n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f372n);
                printWriter.println(":");
                this.f372n.m400a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }

        void m401b() {
            if (C0095x.f374a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f367i = true;
            this.f368j = this.f366h;
            this.f366h = false;
            this.f361c = null;
        }

        void m402c() {
            if (this.f367i) {
                if (C0095x.f374a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f367i = false;
                if (!(this.f366h == this.f368j || this.f366h)) {
                    m404e();
                }
            }
            if (this.f366h && this.f363e && !this.f369k) {
                m399a(this.f362d, this.f365g);
            }
        }

        void m403d() {
            if (this.f366h && this.f369k) {
                this.f369k = false;
                if (this.f363e && !this.f367i) {
                    m399a(this.f362d, this.f365g);
                }
            }
        }

        void m404e() {
            if (C0095x.f374a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f366h = false;
            if (!this.f367i && this.f362d != null && this.f371m) {
                this.f371m = false;
                this.f362d.m472a((C0093b) this);
                this.f362d.m475b(this);
                this.f362d.m476c();
            }
        }

        void m405f() {
            String str;
            C0090a c0090a = null;
            if (C0095x.f374a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f370l = true;
            boolean z = this.f364f;
            this.f364f = false;
            if (this.f361c != null && this.f362d != null && this.f363e && z) {
                if (C0095x.f374a) {
                    Log.v("LoaderManager", "  Resetting: " + this);
                }
                if (this.f373o.f380g != null) {
                    String str2 = this.f373o.f380g.f259d.f314v;
                    this.f373o.f380g.f259d.f314v = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f361c.m395a(this.f362d);
                } finally {
                    c0090a = this.f373o.f380g;
                    if (c0090a != null) {
                        c0090a = this.f373o.f380g.f259d;
                        c0090a.f314v = str;
                    }
                }
            }
            this.f361c = c0090a;
            this.f365g = c0090a;
            this.f363e = false;
            if (this.f362d != null) {
                if (this.f371m) {
                    this.f371m = false;
                    this.f362d.m472a((C0093b) this);
                    this.f362d.m475b(this);
                }
                this.f362d.m478e();
            }
            if (this.f372n != null) {
                this.f372n.m405f();
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f359a);
            stringBuilder.append(" : ");
            C0163c.m650a(this.f362d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    static {
        f374a = false;
    }

    C0095x(String str, C0065o c0065o, boolean z) {
        this.f375b = new C0172i();
        this.f376c = new C0172i();
        this.f377d = str;
        this.f380g = c0065o;
        this.f378e = z;
    }

    void m406a(C0065o c0065o) {
        this.f380g = c0065o;
    }

    public void m407a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f375b.m675b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f375b.m675b(); i2++) {
                C0094a c0094a = (C0094a) this.f375b.m681e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f375b.m680d(i2));
                printWriter.print(": ");
                printWriter.println(c0094a.toString());
                c0094a.m400a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f376c.m675b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f376c.m675b()) {
                c0094a = (C0094a) this.f376c.m681e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f376c.m680d(i));
                printWriter.print(": ");
                printWriter.println(c0094a.toString());
                c0094a.m400a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean m408a() {
        int b = this.f375b.m675b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            C0094a c0094a = (C0094a) this.f375b.m681e(i);
            int i2 = (!c0094a.f366h || c0094a.f364f) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    void m409b() {
        if (f374a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f378e) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f378e = true;
        for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
            ((C0094a) this.f375b.m681e(b)).m398a();
        }
    }

    void m410c() {
        if (f374a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f378e) {
            for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
                ((C0094a) this.f375b.m681e(b)).m404e();
            }
            this.f378e = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    void m411d() {
        if (f374a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f378e) {
            this.f379f = true;
            this.f378e = false;
            for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
                ((C0094a) this.f375b.m681e(b)).m401b();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    void m412e() {
        if (this.f379f) {
            if (f374a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f379f = false;
            for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
                ((C0094a) this.f375b.m681e(b)).m402c();
            }
        }
    }

    void m413f() {
        for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
            ((C0094a) this.f375b.m681e(b)).f369k = true;
        }
    }

    void m414g() {
        for (int b = this.f375b.m675b() - 1; b >= 0; b--) {
            ((C0094a) this.f375b.m681e(b)).m403d();
        }
    }

    void m415h() {
        int b;
        if (!this.f379f) {
            if (f374a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.f375b.m675b() - 1; b >= 0; b--) {
                ((C0094a) this.f375b.m681e(b)).m405f();
            }
            this.f375b.m678c();
        }
        if (f374a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.f376c.m675b() - 1; b >= 0; b--) {
            ((C0094a) this.f376c.m681e(b)).m405f();
        }
        this.f376c.m678c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0163c.m650a(this.f380g, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
