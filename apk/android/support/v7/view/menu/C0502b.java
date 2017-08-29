package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p007g.ae;
import android.support.v7.view.menu.C0499p.C0496a;
import android.support.v7.view.menu.C0501o.C0442a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0502b implements C0501o {
    protected Context f1147a;
    protected Context f1148b;
    protected C0515h f1149c;
    protected LayoutInflater f1150d;
    protected LayoutInflater f1151e;
    protected C0499p f1152f;
    private C0442a f1153g;
    private int f1154h;
    private int f1155i;
    private int f1156j;

    public C0502b(Context context, int i, int i2) {
        this.f1147a = context;
        this.f1150d = LayoutInflater.from(context);
        this.f1154h = i;
        this.f1155i = i2;
    }

    public C0442a m2362a() {
        return this.f1153g;
    }

    public C0499p m2363a(ViewGroup viewGroup) {
        if (this.f1152f == null) {
            this.f1152f = (C0499p) this.f1150d.inflate(this.f1154h, viewGroup, false);
            this.f1152f.m2339a(this.f1149c);
            m2376b(true);
        }
        return this.f1152f;
    }

    public View m2364a(C0518j c0518j, View view, ViewGroup viewGroup) {
        C0496a b = view instanceof C0496a ? (C0496a) view : m2375b(viewGroup);
        m2368a(c0518j, b);
        return (View) b;
    }

    public void m2365a(int i) {
        this.f1156j = i;
    }

    public void m2366a(Context context, C0515h c0515h) {
        this.f1148b = context;
        this.f1151e = LayoutInflater.from(this.f1148b);
        this.f1149c = c0515h;
    }

    public void m2367a(C0515h c0515h, boolean z) {
        if (this.f1153g != null) {
            this.f1153g.m2102a(c0515h, z);
        }
    }

    public abstract void m2368a(C0518j c0518j, C0496a c0496a);

    public void m2369a(C0442a c0442a) {
        this.f1153g = c0442a;
    }

    protected void m2370a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1152f).addView(view, i);
    }

    public boolean m2371a(int i, C0518j c0518j) {
        return true;
    }

    public boolean m2372a(C0515h c0515h, C0518j c0518j) {
        return false;
    }

    public boolean m2373a(C0532u c0532u) {
        return this.f1153g != null ? this.f1153g.m2103a(c0532u) : false;
    }

    protected boolean m2374a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public C0496a m2375b(ViewGroup viewGroup) {
        return (C0496a) this.f1150d.inflate(this.f1155i, viewGroup, false);
    }

    public void m2376b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1152f;
        if (viewGroup != null) {
            int i;
            if (this.f1149c != null) {
                this.f1149c.m2497j();
                ArrayList i2 = this.f1149c.m2496i();
                int size = i2.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    int i4;
                    C0518j c0518j = (C0518j) i2.get(i3);
                    if (m2371a(i, c0518j)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0518j itemData = childAt instanceof C0496a ? ((C0496a) childAt).getItemData() : null;
                        View a = m2364a(c0518j, childAt, viewGroup);
                        if (c0518j != itemData) {
                            a.setPressed(false);
                            ae.m1159o(a);
                        }
                        if (a != childAt) {
                            m2370a(a, i);
                        }
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!m2374a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean m2377b() {
        return false;
    }

    public boolean m2378b(C0515h c0515h, C0518j c0518j) {
        return false;
    }
}
