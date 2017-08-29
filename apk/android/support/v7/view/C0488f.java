package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.p009d.p010a.C0147a;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v4.p012f.C0160h;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.menu.C0528q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
/* renamed from: android.support.v7.view.f */
public class C0488f extends ActionMode {
    final Context f1046a;
    final C0461b f1047b;

    /* renamed from: android.support.v7.view.f.a */
    public static class C0487a implements C0445a {
        final Callback f1042a;
        final Context f1043b;
        final ArrayList<C0488f> f1044c;
        final C0160h<Menu, Menu> f1045d;

        public C0487a(Context context, Callback callback) {
            this.f1043b = context;
            this.f1042a = callback;
            this.f1044c = new ArrayList();
            this.f1045d = new C0160h();
        }

        private Menu m2285a(Menu menu) {
            Menu menu2 = (Menu) this.f1045d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = C0528q.m2568a(this.f1043b, (C0147a) menu);
            this.f1045d.put(menu, menu2);
            return menu2;
        }

        public void m2286a(C0461b c0461b) {
            this.f1042a.onDestroyActionMode(m2289b(c0461b));
        }

        public boolean m2287a(C0461b c0461b, Menu menu) {
            return this.f1042a.onCreateActionMode(m2289b(c0461b), m2285a(menu));
        }

        public boolean m2288a(C0461b c0461b, MenuItem menuItem) {
            return this.f1042a.onActionItemClicked(m2289b(c0461b), C0528q.m2569a(this.f1043b, (C0148b) menuItem));
        }

        public ActionMode m2289b(C0461b c0461b) {
            int size = this.f1044c.size();
            for (int i = 0; i < size; i++) {
                C0488f c0488f = (C0488f) this.f1044c.get(i);
                if (c0488f != null && c0488f.f1047b == c0461b) {
                    return c0488f;
                }
            }
            ActionMode c0488f2 = new C0488f(this.f1043b, c0461b);
            this.f1044c.add(c0488f2);
            return c0488f2;
        }

        public boolean m2290b(C0461b c0461b, Menu menu) {
            return this.f1042a.onPrepareActionMode(m2289b(c0461b), m2285a(menu));
        }
    }

    public C0488f(Context context, C0461b c0461b) {
        this.f1046a = context;
        this.f1047b = c0461b;
    }

    public void finish() {
        this.f1047b.m2170c();
    }

    public View getCustomView() {
        return this.f1047b.m2175i();
    }

    public Menu getMenu() {
        return C0528q.m2568a(this.f1046a, (C0147a) this.f1047b.m2167b());
    }

    public MenuInflater getMenuInflater() {
        return this.f1047b.m2161a();
    }

    public CharSequence getSubtitle() {
        return this.f1047b.m2173g();
    }

    public Object getTag() {
        return this.f1047b.m2176j();
    }

    public CharSequence getTitle() {
        return this.f1047b.m2172f();
    }

    public boolean getTitleOptionalHint() {
        return this.f1047b.m2177k();
    }

    public void invalidate() {
        this.f1047b.m2171d();
    }

    public boolean isTitleOptional() {
        return this.f1047b.m2174h();
    }

    public void setCustomView(View view) {
        this.f1047b.m2163a(view);
    }

    public void setSubtitle(int i) {
        this.f1047b.m2168b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1047b.m2164a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1047b.m2165a(obj);
    }

    public void setTitle(int i) {
        this.f1047b.m2162a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1047b.m2169b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1047b.m2166a(z);
    }
}
