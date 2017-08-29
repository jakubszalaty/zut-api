package android.support.v7.view.menu;

import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.view.menu.C0499p.C0496a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0514g extends BaseAdapter {
    static final int f1207a;
    C0515h f1208b;
    private int f1209c;
    private boolean f1210d;
    private final boolean f1211e;
    private final LayoutInflater f1212f;

    static {
        f1207a = C0471g.abc_popup_menu_item_layout;
    }

    public C0514g(C0515h c0515h, LayoutInflater layoutInflater, boolean z) {
        this.f1209c = -1;
        this.f1211e = z;
        this.f1212f = layoutInflater;
        this.f1208b = c0515h;
        m2450b();
    }

    public C0515h m2447a() {
        return this.f1208b;
    }

    public C0518j m2448a(int i) {
        ArrayList l = this.f1211e ? this.f1208b.m2499l() : this.f1208b.m2496i();
        if (this.f1209c >= 0 && i >= this.f1209c) {
            i++;
        }
        return (C0518j) l.get(i);
    }

    public void m2449a(boolean z) {
        this.f1210d = z;
    }

    void m2450b() {
        C0518j r = this.f1208b.m2505r();
        if (r != null) {
            ArrayList l = this.f1208b.m2499l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (((C0518j) l.get(i)) == r) {
                    this.f1209c = i;
                    return;
                }
            }
        }
        this.f1209c = -1;
    }

    public int getCount() {
        ArrayList l = this.f1211e ? this.f1208b.m2499l() : this.f1208b.m2496i();
        return this.f1209c < 0 ? l.size() : l.size() - 1;
    }

    public /* synthetic */ Object getItem(int i) {
        return m2448a(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f1212f.inflate(f1207a, viewGroup, false) : view;
        C0496a c0496a = (C0496a) inflate;
        if (this.f1210d) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        c0496a.m2327a(m2448a(i), 0);
        return inflate;
    }

    public void notifyDataSetChanged() {
        m2450b();
        super.notifyDataSetChanged();
    }
}
