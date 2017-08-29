package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0510m implements C0501o, C0509s, OnItemClickListener {
    private Rect f1170a;

    C0510m() {
    }

    protected static int m2393a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            ViewGroup frameLayout = viewGroup2 == null ? new FrameLayout(context) : viewGroup2;
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    protected static C0514g m2394a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0514g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0514g) listAdapter;
    }

    protected static boolean m2395b(C0515h c0515h) {
        int size = c0515h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0515h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void m2396a(int i);

    public void m2397a(Context context, C0515h c0515h) {
    }

    public void m2398a(Rect rect) {
        this.f1170a = rect;
    }

    public abstract void m2399a(C0515h c0515h);

    public abstract void m2400a(View view);

    public abstract void m2401a(OnDismissListener onDismissListener);

    public abstract void m2402a(boolean z);

    public boolean m2403a(C0515h c0515h, C0518j c0518j) {
        return false;
    }

    public abstract void m2404b(int i);

    public boolean m2405b(C0515h c0515h, C0518j c0518j) {
        return false;
    }

    public abstract void m2406c(int i);

    public abstract void m2407c(boolean z);

    protected boolean m2408f() {
        return true;
    }

    public Rect m2409g() {
        return this.f1170a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0510m.m2394a(listAdapter).f1208b.m2477a((MenuItem) listAdapter.getItem(i), (C0501o) this, m2408f() ? 0 : 4);
    }
}
