package android.support.v4.p006a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: android.support.v4.a.t */
final class C0083t implements Parcelable {
    public static final Creator<C0083t> CREATOR;
    final String f324a;
    final int f325b;
    final boolean f326c;
    final int f327d;
    final int f328e;
    final String f329f;
    final boolean f330g;
    final boolean f331h;
    final Bundle f332i;
    final boolean f333j;
    Bundle f334k;
    C0063k f335l;

    /* renamed from: android.support.v4.a.t.1 */
    static class C00821 implements Creator<C0083t> {
        C00821() {
        }

        public C0083t m365a(Parcel parcel) {
            return new C0083t(parcel);
        }

        public C0083t[] m366a(int i) {
            return new C0083t[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m365a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m366a(i);
        }
    }

    static {
        CREATOR = new C00821();
    }

    public C0083t(Parcel parcel) {
        boolean z = true;
        this.f324a = parcel.readString();
        this.f325b = parcel.readInt();
        this.f326c = parcel.readInt() != 0;
        this.f327d = parcel.readInt();
        this.f328e = parcel.readInt();
        this.f329f = parcel.readString();
        this.f330g = parcel.readInt() != 0;
        this.f331h = parcel.readInt() != 0;
        this.f332i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f333j = z;
        this.f334k = parcel.readBundle();
    }

    public C0083t(C0063k c0063k) {
        this.f324a = c0063k.getClass().getName();
        this.f325b = c0063k.f235g;
        this.f326c = c0063k.f243o;
        this.f327d = c0063k.f252x;
        this.f328e = c0063k.f253y;
        this.f329f = c0063k.f254z;
        this.f330g = c0063k.f206C;
        this.f331h = c0063k.f205B;
        this.f332i = c0063k.f237i;
        this.f333j = c0063k.f204A;
    }

    public C0063k m367a(C0065o c0065o, C0063k c0063k, C0079r c0079r) {
        if (this.f335l == null) {
            Context g = c0065o.m230g();
            if (this.f332i != null) {
                this.f332i.setClassLoader(g.getClassLoader());
            }
            this.f335l = C0063k.m139a(g, this.f324a, this.f332i);
            if (this.f334k != null) {
                this.f334k.setClassLoader(g.getClassLoader());
                this.f335l.f233e = this.f334k;
            }
            this.f335l.m153a(this.f325b, c0063k);
            this.f335l.f243o = this.f326c;
            this.f335l.f245q = true;
            this.f335l.f252x = this.f327d;
            this.f335l.f253y = this.f328e;
            this.f335l.f254z = this.f329f;
            this.f335l.f206C = this.f330g;
            this.f335l.f205B = this.f331h;
            this.f335l.f204A = this.f333j;
            this.f335l.f247s = c0065o.f259d;
            if (C0078q.f293a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f335l);
            }
        }
        this.f335l.f250v = c0079r;
        return this.f335l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f324a);
        parcel.writeInt(this.f325b);
        parcel.writeInt(this.f326c ? 1 : 0);
        parcel.writeInt(this.f327d);
        parcel.writeInt(this.f328e);
        parcel.writeString(this.f329f);
        parcel.writeInt(this.f330g ? 1 : 0);
        parcel.writeInt(this.f331h ? 1 : 0);
        parcel.writeBundle(this.f332i);
        if (!this.f333j) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f334k);
    }
}
