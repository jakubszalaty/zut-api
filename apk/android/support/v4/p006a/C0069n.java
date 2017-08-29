package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.p012f.C0160h;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.n */
public class C0069n {
    private final C0065o<?> f280a;

    private C0069n(C0065o<?> c0065o) {
        this.f280a = c0065o;
    }

    public static final C0069n m256a(C0065o<?> c0065o) {
        return new C0069n(c0065o);
    }

    public C0063k m257a(String str) {
        return this.f280a.f259d.m328b(str);
    }

    public C0071p m258a() {
        return this.f280a.m232i();
    }

    public View m259a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f280a.f259d.m305a(view, str, context, attributeSet);
    }

    public void m260a(Configuration configuration) {
        this.f280a.f259d.m310a(configuration);
    }

    public void m261a(Parcelable parcelable, C0079r c0079r) {
        this.f280a.f259d.m312a(parcelable, c0079r);
    }

    public void m262a(C0063k c0063k) {
        this.f280a.f259d.m318a(this.f280a, this.f280a, c0063k);
    }

    public void m263a(C0160h<String, C0091w> c0160h) {
        this.f280a.m217a((C0160h) c0160h);
    }

    public void m264a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f280a.m225b(str, fileDescriptor, printWriter, strArr);
    }

    public void m265a(boolean z) {
        this.f280a.f259d.m320a(z);
    }

    public boolean m266a(Menu menu) {
        return this.f280a.f259d.m324a(menu);
    }

    public boolean m267a(Menu menu, MenuInflater menuInflater) {
        return this.f280a.f259d.m325a(menu, menuInflater);
    }

    public boolean m268a(MenuItem menuItem) {
        return this.f280a.f259d.m326a(menuItem);
    }

    public void m269b() {
        this.f280a.f259d.m349i();
    }

    public void m270b(Menu menu) {
        this.f280a.f259d.m331b(menu);
    }

    public void m271b(boolean z) {
        this.f280a.f259d.m332b(z);
    }

    public boolean m272b(MenuItem menuItem) {
        return this.f280a.f259d.m334b(menuItem);
    }

    public Parcelable m273c() {
        return this.f280a.f259d.m348h();
    }

    public void m274c(boolean z) {
        this.f280a.m220a(z);
    }

    public C0079r m275d() {
        return this.f280a.f259d.m347g();
    }

    public void m276e() {
        this.f280a.f259d.m350j();
    }

    public void m277f() {
        this.f280a.f259d.m351k();
    }

    public void m278g() {
        this.f280a.f259d.m352l();
    }

    public void m279h() {
        this.f280a.f259d.m353m();
    }

    public void m280i() {
        this.f280a.f259d.m354n();
    }

    public void m281j() {
        this.f280a.f259d.m355o();
    }

    public void m282k() {
        this.f280a.f259d.m356p();
    }

    public void m283l() {
        this.f280a.f259d.m358r();
    }

    public void m284m() {
        this.f280a.f259d.m359s();
    }

    public boolean m285n() {
        return this.f280a.f259d.m341d();
    }

    public void m286o() {
        this.f280a.m234k();
    }

    public void m287p() {
        this.f280a.m235l();
    }

    public void m288q() {
        this.f280a.m236m();
    }

    public C0160h<String, C0091w> m289r() {
        return this.f280a.m237n();
    }
}
