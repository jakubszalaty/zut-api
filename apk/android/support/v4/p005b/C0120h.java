package android.support.v4.p005b;

import android.support.v4.p012f.C0163c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.b.h */
public class C0120h<D> {
    int f384a;
    C0093b<D> f385b;
    C0092a<D> f386c;
    boolean f387d;
    boolean f388e;
    boolean f389f;
    boolean f390g;
    boolean f391h;

    /* renamed from: android.support.v4.b.h.a */
    public interface C0092a<D> {
    }

    /* renamed from: android.support.v4.b.h.b */
    public interface C0093b<D> {
    }

    public String m468a(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0163c.m650a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m469a() {
        this.f387d = true;
        this.f389f = false;
        this.f388e = false;
        m474b();
    }

    public void m470a(int i, C0093b<D> c0093b) {
        if (this.f385b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f385b = c0093b;
        this.f384a = i;
    }

    public void m471a(C0092a<D> c0092a) {
        if (this.f386c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f386c = c0092a;
    }

    public void m472a(C0093b<D> c0093b) {
        if (this.f385b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f385b != c0093b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f385b = null;
        }
    }

    public void m473a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f384a);
        printWriter.print(" mListener=");
        printWriter.println(this.f385b);
        if (this.f387d || this.f390g || this.f391h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f387d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f390g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f391h);
        }
        if (this.f388e || this.f389f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f388e);
            printWriter.print(" mReset=");
            printWriter.println(this.f389f);
        }
    }

    protected void m474b() {
    }

    public void m475b(C0092a<D> c0092a) {
        if (this.f386c == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f386c != c0092a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f386c = null;
        }
    }

    public void m476c() {
        this.f387d = false;
        m477d();
    }

    protected void m477d() {
    }

    public void m478e() {
        m479f();
        this.f389f = true;
        this.f387d = false;
        this.f388e = false;
        this.f390g = false;
        this.f391h = false;
    }

    protected void m479f() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0163c.m650a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f384a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
