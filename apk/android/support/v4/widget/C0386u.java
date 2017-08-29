package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.u */
public abstract class C0386u extends C0362f {
    private int f701j;
    private int f702k;
    private LayoutInflater f703l;

    @Deprecated
    public C0386u(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f702k = i;
        this.f701j = i;
        this.f703l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View m1820a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f703l.inflate(this.f701j, viewGroup, false);
    }

    public View m1821b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f703l.inflate(this.f702k, viewGroup, false);
    }
}
