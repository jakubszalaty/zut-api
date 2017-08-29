package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v4.p009d.p010a.C0149c;
import android.support.v4.p012f.C0161a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0504c<T> extends C0503d<T> {
    final Context f1158a;
    private Map<C0148b, MenuItem> f1159c;
    private Map<C0149c, SubMenu> f1160d;

    C0504c(Context context, T t) {
        super(t);
        this.f1158a = context;
    }

    final MenuItem m2379a(MenuItem menuItem) {
        if (!(menuItem instanceof C0148b)) {
            return menuItem;
        }
        C0148b c0148b = (C0148b) menuItem;
        if (this.f1159c == null) {
            this.f1159c = new C0161a();
        }
        MenuItem menuItem2 = (MenuItem) this.f1159c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = C0528q.m2569a(this.f1158a, c0148b);
        this.f1159c.put(c0148b, menuItem2);
        return menuItem2;
    }

    final SubMenu m2380a(SubMenu subMenu) {
        if (!(subMenu instanceof C0149c)) {
            return subMenu;
        }
        C0149c c0149c = (C0149c) subMenu;
        if (this.f1160d == null) {
            this.f1160d = new C0161a();
        }
        SubMenu subMenu2 = (SubMenu) this.f1160d.get(c0149c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = C0528q.m2570a(this.f1158a, c0149c);
        this.f1160d.put(c0149c, subMenu2);
        return subMenu2;
    }

    final void m2381a() {
        if (this.f1159c != null) {
            this.f1159c.clear();
        }
        if (this.f1160d != null) {
            this.f1160d.clear();
        }
    }

    final void m2382a(int i) {
        if (this.f1159c != null) {
            Iterator it = this.f1159c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    final void m2383b(int i) {
        if (this.f1159c != null) {
            Iterator it = this.f1159c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
