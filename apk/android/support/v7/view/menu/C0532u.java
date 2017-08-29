package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0515h.C0425a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0532u extends C0515h implements SubMenu {
    private C0515h f1310d;
    private C0518j f1311e;

    public C0532u(Context context, C0515h c0515h, C0518j c0518j) {
        super(context);
        this.f1310d = c0515h;
        this.f1311e = c0518j;
    }

    public String m2589a() {
        int itemId = this.f1311e != null ? this.f1311e.getItemId() : 0;
        return itemId == 0 ? null : super.m2466a() + ":" + itemId;
    }

    public void m2590a(C0425a c0425a) {
        this.f1310d.m2468a(c0425a);
    }

    boolean m2591a(C0515h c0515h, MenuItem menuItem) {
        return super.m2475a(c0515h, menuItem) || this.f1310d.m2475a(c0515h, menuItem);
    }

    public boolean m2592b() {
        return this.f1310d.m2483b();
    }

    public boolean m2593c() {
        return this.f1310d.m2486c();
    }

    public boolean m2594c(C0518j c0518j) {
        return this.f1310d.m2487c(c0518j);
    }

    public boolean m2595d(C0518j c0518j) {
        return this.f1310d.m2490d(c0518j);
    }

    public MenuItem getItem() {
        return this.f1311e;
    }

    public C0515h m2596p() {
        return this.f1310d.m2503p();
    }

    public Menu m2597s() {
        return this.f1310d;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m2492e(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m2461a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m2489d(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m2463a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m2462a(view);
    }

    public SubMenu setIcon(int i) {
        this.f1311e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1311e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1310d.setQwertyMode(z);
    }
}
