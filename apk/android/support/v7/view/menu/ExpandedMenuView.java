package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0515h.C0498b;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0498b, C0499p, OnItemClickListener {
    private static final int[] f1115a;
    private C0515h f1116b;
    private int f1117c;

    static {
        f1115a = new int[]{16842964, 16843049};
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        av a = av.m2947a(context, attributeSet, f1115a, i, 0);
        if (a.m2964g(0)) {
            setBackgroundDrawable(a.m2950a(0));
        }
        if (a.m2964g(1)) {
            setDivider(a.m2950a(1));
        }
        a.m2951a();
    }

    public void m2340a(C0515h c0515h) {
        this.f1116b = c0515h;
    }

    public boolean m2341a(C0518j c0518j) {
        return this.f1116b.m2476a((MenuItem) c0518j, 0);
    }

    public int getWindowAnimations() {
        return this.f1117c;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m2341a((C0518j) getAdapter().getItem(i));
    }
}
