package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
class C0363g extends Filter {
    C0361a f692a;

    /* renamed from: android.support.v4.widget.g.a */
    interface C0361a {
        Cursor m1742a();

        Cursor m1743a(CharSequence charSequence);

        void m1744a(Cursor cursor);

        CharSequence m1745c(Cursor cursor);
    }

    C0363g(C0361a c0361a) {
        this.f692a = c0361a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f692a.m1745c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f692a.m1743a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f692a.m1742a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f692a.m1744a((Cursor) filterResults.values);
        }
    }
}
