package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.C0515h.C0425a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0486e extends C0461b implements C0425a {
    private Context f1035a;
    private ActionBarContextView f1036b;
    private C0445a f1037c;
    private WeakReference<View> f1038d;
    private boolean f1039e;
    private boolean f1040f;
    private C0515h f1041g;

    public C0486e(Context context, ActionBarContextView actionBarContextView, C0445a c0445a, boolean z) {
        this.f1035a = context;
        this.f1036b = actionBarContextView;
        this.f1037c = c0445a;
        this.f1041g = new C0515h(actionBarContextView.getContext()).m2460a(1);
        this.f1041g.m2468a((C0425a) this);
        this.f1040f = z;
    }

    public MenuInflater m2269a() {
        return new C0491g(this.f1036b.getContext());
    }

    public void m2270a(int i) {
        m2278b(this.f1035a.getString(i));
    }

    public void m2271a(C0515h c0515h) {
        m2280d();
        this.f1036b.m2611a();
    }

    public void m2272a(View view) {
        this.f1036b.setCustomView(view);
        this.f1038d = view != null ? new WeakReference(view) : null;
    }

    public void m2273a(CharSequence charSequence) {
        this.f1036b.setSubtitle(charSequence);
    }

    public void m2274a(boolean z) {
        super.m2166a(z);
        this.f1036b.setTitleOptional(z);
    }

    public boolean m2275a(C0515h c0515h, MenuItem menuItem) {
        return this.f1037c.m2109a((C0461b) this, menuItem);
    }

    public Menu m2276b() {
        return this.f1041g;
    }

    public void m2277b(int i) {
        m2273a(this.f1035a.getString(i));
    }

    public void m2278b(CharSequence charSequence) {
        this.f1036b.setTitle(charSequence);
    }

    public void m2279c() {
        if (!this.f1039e) {
            this.f1039e = true;
            this.f1036b.sendAccessibilityEvent(32);
            this.f1037c.m2107a(this);
        }
    }

    public void m2280d() {
        this.f1037c.m2110b(this, this.f1041g);
    }

    public CharSequence m2281f() {
        return this.f1036b.getTitle();
    }

    public CharSequence m2282g() {
        return this.f1036b.getSubtitle();
    }

    public boolean m2283h() {
        return this.f1036b.m2614d();
    }

    public View m2284i() {
        return this.f1038d != null ? (View) this.f1038d.get() : null;
    }
}
