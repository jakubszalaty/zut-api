package android.support.v4.p006a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.p012f.C0160h;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.o */
public abstract class C0065o<E> extends C0060m {
    private final Activity f256a;
    final Context f257b;
    final int f258c;
    final C0078q f259d;
    private final Handler f260e;
    private C0160h<String, C0091w> f261f;
    private boolean f262g;
    private C0095x f263h;
    private boolean f264i;
    private boolean f265j;

    C0065o(Activity activity, Context context, Handler handler, int i) {
        this.f259d = new C0078q();
        this.f256a = activity;
        this.f257b = context;
        this.f260e = handler;
        this.f258c = i;
    }

    C0065o(C0068l c0068l) {
        this(c0068l, c0068l, c0068l.f270c, 0);
    }

    C0095x m215a(String str, boolean z, boolean z2) {
        if (this.f261f == null) {
            this.f261f = new C0160h();
        }
        C0095x c0095x = (C0095x) this.f261f.get(str);
        if (c0095x != null) {
            c0095x.m406a(this);
            return c0095x;
        } else if (!z2) {
            return c0095x;
        } else {
            c0095x = new C0095x(str, this, z);
            this.f261f.put(str, c0095x);
            return c0095x;
        }
    }

    public View m216a(int i) {
        return null;
    }

    void m217a(C0160h<String, C0091w> c0160h) {
        this.f261f = c0160h;
    }

    void m218a(String str) {
        if (this.f261f != null) {
            C0095x c0095x = (C0095x) this.f261f.get(str);
            if (c0095x != null && !c0095x.f379f) {
                c0095x.m415h();
                this.f261f.remove(str);
            }
        }
    }

    public void m219a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    void m220a(boolean z) {
        this.f262g = z;
        if (this.f263h != null && this.f265j) {
            this.f265j = false;
            if (z) {
                this.f263h.m411d();
            } else {
                this.f263h.m410c();
            }
        }
    }

    public boolean m221a() {
        return true;
    }

    public boolean m222a(C0063k c0063k) {
        return true;
    }

    public LayoutInflater m223b() {
        return (LayoutInflater) this.f257b.getSystemService("layout_inflater");
    }

    void m224b(C0063k c0063k) {
    }

    void m225b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f265j);
        if (this.f263h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f263h)));
            printWriter.println(":");
            this.f263h.m407a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void m226c() {
    }

    public boolean m227d() {
        return true;
    }

    public int m228e() {
        return this.f258c;
    }

    Activity m229f() {
        return this.f256a;
    }

    Context m230g() {
        return this.f257b;
    }

    Handler m231h() {
        return this.f260e;
    }

    C0078q m232i() {
        return this.f259d;
    }

    boolean m233j() {
        return this.f262g;
    }

    void m234k() {
        if (!this.f265j) {
            this.f265j = true;
            if (this.f263h != null) {
                this.f263h.m409b();
            } else if (!this.f264i) {
                this.f263h = m215a("(root)", this.f265j, false);
                if (!(this.f263h == null || this.f263h.f378e)) {
                    this.f263h.m409b();
                }
            }
            this.f264i = true;
        }
    }

    void m235l() {
        if (this.f263h != null) {
            this.f263h.m415h();
        }
    }

    void m236m() {
        if (this.f261f != null) {
            int size = this.f261f.size();
            C0095x[] c0095xArr = new C0095x[size];
            for (int i = size - 1; i >= 0; i--) {
                c0095xArr[i] = (C0095x) this.f261f.m640c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0095x c0095x = c0095xArr[i2];
                c0095x.m412e();
                c0095x.m414g();
            }
        }
    }

    C0160h<String, C0091w> m237n() {
        int i;
        int i2 = 0;
        if (this.f261f != null) {
            int size = this.f261f.size();
            C0095x[] c0095xArr = new C0095x[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                c0095xArr[i3] = (C0095x) this.f261f.m640c(i3);
            }
            boolean j = m233j();
            i = 0;
            while (i2 < size) {
                C0095x c0095x = c0095xArr[i2];
                if (!c0095x.f379f && j) {
                    if (!c0095x.f378e) {
                        c0095x.m409b();
                    }
                    c0095x.m411d();
                }
                if (c0095x.f379f) {
                    i = 1;
                } else {
                    c0095x.m415h();
                    this.f261f.remove(c0095x.f377d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        return i != 0 ? this.f261f : null;
    }
}
