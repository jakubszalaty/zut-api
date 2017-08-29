package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.view.menu.C0499p.C0496a;
import android.support.v7.view.menu.C0501o.C0442a;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0513f implements C0501o, OnItemClickListener {
    Context f1198a;
    LayoutInflater f1199b;
    C0515h f1200c;
    ExpandedMenuView f1201d;
    int f1202e;
    int f1203f;
    int f1204g;
    C0512a f1205h;
    private C0442a f1206i;

    /* renamed from: android.support.v7.view.menu.f.a */
    private class C0512a extends BaseAdapter {
        final /* synthetic */ C0513f f1196a;
        private int f1197b;

        public C0512a(C0513f c0513f) {
            this.f1196a = c0513f;
            this.f1197b = -1;
            m2436a();
        }

        public C0518j m2435a(int i) {
            ArrayList l = this.f1196a.f1200c.m2499l();
            int i2 = this.f1196a.f1202e + i;
            if (this.f1197b >= 0 && i2 >= this.f1197b) {
                i2++;
            }
            return (C0518j) l.get(i2);
        }

        void m2436a() {
            C0518j r = this.f1196a.f1200c.m2505r();
            if (r != null) {
                ArrayList l = this.f1196a.f1200c.m2499l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((C0518j) l.get(i)) == r) {
                        this.f1197b = i;
                        return;
                    }
                }
            }
            this.f1197b = -1;
        }

        public int getCount() {
            int size = this.f1196a.f1200c.m2499l().size() - this.f1196a.f1202e;
            return this.f1197b < 0 ? size : size - 1;
        }

        public /* synthetic */ Object getItem(int i) {
            return m2435a(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? this.f1196a.f1199b.inflate(this.f1196a.f1204g, viewGroup, false) : view;
            ((C0496a) inflate).m2327a(m2435a(i), 0);
            return inflate;
        }

        public void notifyDataSetChanged() {
            m2436a();
            super.notifyDataSetChanged();
        }
    }

    public C0513f(int i, int i2) {
        this.f1204g = i;
        this.f1203f = i2;
    }

    public C0513f(Context context, int i) {
        this(i, 0);
        this.f1198a = context;
        this.f1199b = LayoutInflater.from(this.f1198a);
    }

    public C0499p m2437a(ViewGroup viewGroup) {
        if (this.f1201d == null) {
            this.f1201d = (ExpandedMenuView) this.f1199b.inflate(C0471g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1205h == null) {
                this.f1205h = new C0512a(this);
            }
            this.f1201d.setAdapter(this.f1205h);
            this.f1201d.setOnItemClickListener(this);
        }
        return this.f1201d;
    }

    public ListAdapter m2438a() {
        if (this.f1205h == null) {
            this.f1205h = new C0512a(this);
        }
        return this.f1205h;
    }

    public void m2439a(Context context, C0515h c0515h) {
        if (this.f1203f != 0) {
            this.f1198a = new ContextThemeWrapper(context, this.f1203f);
            this.f1199b = LayoutInflater.from(this.f1198a);
        } else if (this.f1198a != null) {
            this.f1198a = context;
            if (this.f1199b == null) {
                this.f1199b = LayoutInflater.from(this.f1198a);
            }
        }
        this.f1200c = c0515h;
        if (this.f1205h != null) {
            this.f1205h.notifyDataSetChanged();
        }
    }

    public void m2440a(C0515h c0515h, boolean z) {
        if (this.f1206i != null) {
            this.f1206i.m2102a(c0515h, z);
        }
    }

    public void m2441a(C0442a c0442a) {
        this.f1206i = c0442a;
    }

    public boolean m2442a(C0515h c0515h, C0518j c0518j) {
        return false;
    }

    public boolean m2443a(C0532u c0532u) {
        if (!c0532u.hasVisibleItems()) {
            return false;
        }
        new C0516i(c0532u).m2507a(null);
        if (this.f1206i != null) {
            this.f1206i.m2103a(c0532u);
        }
        return true;
    }

    public void m2444b(boolean z) {
        if (this.f1205h != null) {
            this.f1205h.notifyDataSetChanged();
        }
    }

    public boolean m2445b() {
        return false;
    }

    public boolean m2446b(C0515h c0515h, C0518j c0518j) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1200c.m2477a(this.f1205h.m2435a(i), (C0501o) this, 0);
    }
}
