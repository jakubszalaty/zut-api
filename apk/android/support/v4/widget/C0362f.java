package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0363g.C0361a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.f */
public abstract class C0362f extends BaseAdapter implements C0361a, Filterable {
    protected boolean f683a;
    protected boolean f684b;
    protected Cursor f685c;
    protected Context f686d;
    protected int f687e;
    protected C0359a f688f;
    protected DataSetObserver f689g;
    protected C0363g f690h;
    protected FilterQueryProvider f691i;

    /* renamed from: android.support.v4.widget.f.a */
    private class C0359a extends ContentObserver {
        final /* synthetic */ C0362f f681a;

        C0359a(C0362f c0362f) {
            this.f681a = c0362f;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            this.f681a.m1754b();
        }
    }

    /* renamed from: android.support.v4.widget.f.b */
    private class C0360b extends DataSetObserver {
        final /* synthetic */ C0362f f682a;

        C0360b(C0362f c0362f) {
            this.f682a = c0362f;
        }

        public void onChanged() {
            this.f682a.f683a = true;
            this.f682a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f682a.f683a = false;
            this.f682a.notifyDataSetInvalidated();
        }
    }

    public C0362f(Context context, Cursor cursor, boolean z) {
        m1749a(context, cursor, z ? 1 : 2);
    }

    public Cursor m1746a() {
        return this.f685c;
    }

    public Cursor m1747a(CharSequence charSequence) {
        return this.f691i != null ? this.f691i.runQuery(charSequence) : this.f685c;
    }

    public abstract View m1748a(Context context, Cursor cursor, ViewGroup viewGroup);

    void m1749a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f684b = true;
        } else {
            this.f684b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f685c = cursor;
        this.f683a = z;
        this.f686d = context;
        this.f687e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f688f = new C0359a(this);
            this.f689g = new C0360b(this);
        } else {
            this.f688f = null;
            this.f689g = null;
        }
        if (z) {
            if (this.f688f != null) {
                cursor.registerContentObserver(this.f688f);
            }
            if (this.f689g != null) {
                cursor.registerDataSetObserver(this.f689g);
            }
        }
    }

    public void m1750a(Cursor cursor) {
        Cursor b = m1752b(cursor);
        if (b != null) {
            b.close();
        }
    }

    public abstract void m1751a(View view, Context context, Cursor cursor);

    public Cursor m1752b(Cursor cursor) {
        if (cursor == this.f685c) {
            return null;
        }
        Cursor cursor2 = this.f685c;
        if (cursor2 != null) {
            if (this.f688f != null) {
                cursor2.unregisterContentObserver(this.f688f);
            }
            if (this.f689g != null) {
                cursor2.unregisterDataSetObserver(this.f689g);
            }
        }
        this.f685c = cursor;
        if (cursor != null) {
            if (this.f688f != null) {
                cursor.registerContentObserver(this.f688f);
            }
            if (this.f689g != null) {
                cursor.registerDataSetObserver(this.f689g);
            }
            this.f687e = cursor.getColumnIndexOrThrow("_id");
            this.f683a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f687e = -1;
        this.f683a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public View m1753b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return m1748a(context, cursor, viewGroup);
    }

    protected void m1754b() {
        if (this.f684b && this.f685c != null && !this.f685c.isClosed()) {
            this.f683a = this.f685c.requery();
        }
    }

    public CharSequence m1755c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        return (!this.f683a || this.f685c == null) ? 0 : this.f685c.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f683a) {
            return null;
        }
        this.f685c.moveToPosition(i);
        if (view == null) {
            view = m1753b(this.f686d, this.f685c, viewGroup);
        }
        m1751a(view, this.f686d, this.f685c);
        return view;
    }

    public Filter getFilter() {
        if (this.f690h == null) {
            this.f690h = new C0363g(this);
        }
        return this.f690h;
    }

    public Object getItem(int i) {
        if (!this.f683a || this.f685c == null) {
            return null;
        }
        this.f685c.moveToPosition(i);
        return this.f685c;
    }

    public long getItemId(int i) {
        return (this.f683a && this.f685c != null && this.f685c.moveToPosition(i)) ? this.f685c.getLong(this.f687e) : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f683a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f685c.moveToPosition(i)) {
            if (view == null) {
                view = m1748a(this.f686d, this.f685c, viewGroup);
            }
            m1751a(view, this.f686d, this.f685c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
