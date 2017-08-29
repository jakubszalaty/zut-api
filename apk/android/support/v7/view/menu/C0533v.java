package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p009d.p010a.C0149c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0533v extends C0529r implements SubMenu {
    C0533v(Context context, C0149c c0149c) {
        super(context, c0149c);
    }

    public C0149c m2598b() {
        return (C0149c) this.b;
    }

    public void clearHeader() {
        m2598b().clearHeader();
    }

    public MenuItem getItem() {
        return m2379a(m2598b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        m2598b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m2598b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        m2598b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m2598b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m2598b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        m2598b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m2598b().setIcon(drawable);
        return this;
    }
}
