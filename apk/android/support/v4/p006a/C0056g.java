package android.support.v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p006a.C0054f.C0051a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.a.g */
final class C0056g implements Parcelable {
    public static final Creator<C0056g> CREATOR;
    final int[] f189a;
    final int f190b;
    final int f191c;
    final String f192d;
    final int f193e;
    final int f194f;
    final CharSequence f195g;
    final int f196h;
    final CharSequence f197i;
    final ArrayList<String> f198j;
    final ArrayList<String> f199k;

    /* renamed from: android.support.v4.a.g.1 */
    static class C00551 implements Creator<C0056g> {
        C00551() {
        }

        public C0056g m129a(Parcel parcel) {
            return new C0056g(parcel);
        }

        public C0056g[] m130a(int i) {
            return new C0056g[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m129a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m130a(i);
        }
    }

    static {
        CREATOR = new C00551();
    }

    public C0056g(Parcel parcel) {
        this.f189a = parcel.createIntArray();
        this.f190b = parcel.readInt();
        this.f191c = parcel.readInt();
        this.f192d = parcel.readString();
        this.f193e = parcel.readInt();
        this.f194f = parcel.readInt();
        this.f195g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f196h = parcel.readInt();
        this.f197i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f198j = parcel.createStringArrayList();
        this.f199k = parcel.createStringArrayList();
    }

    public C0056g(C0054f c0054f) {
        int i = 0;
        for (C0051a c0051a = c0054f.f169c; c0051a != null; c0051a = c0051a.f153a) {
            if (c0051a.f161i != null) {
                i += c0051a.f161i.size();
            }
        }
        this.f189a = new int[(i + (c0054f.f171e * 7))];
        if (c0054f.f178l) {
            i = 0;
            for (C0051a c0051a2 = c0054f.f169c; c0051a2 != null; c0051a2 = c0051a2.f153a) {
                int i2 = i + 1;
                this.f189a[i] = c0051a2.f155c;
                int i3 = i2 + 1;
                this.f189a[i2] = c0051a2.f156d != null ? c0051a2.f156d.f235g : -1;
                int i4 = i3 + 1;
                this.f189a[i3] = c0051a2.f157e;
                i2 = i4 + 1;
                this.f189a[i4] = c0051a2.f158f;
                i4 = i2 + 1;
                this.f189a[i2] = c0051a2.f159g;
                i2 = i4 + 1;
                this.f189a[i4] = c0051a2.f160h;
                if (c0051a2.f161i != null) {
                    int size = c0051a2.f161i.size();
                    i4 = i2 + 1;
                    this.f189a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.f189a[i4] = ((C0063k) c0051a2.f161i.get(i2)).f235g;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.f189a[i2] = 0;
                }
            }
            this.f190b = c0054f.f176j;
            this.f191c = c0054f.f177k;
            this.f192d = c0054f.f180n;
            this.f193e = c0054f.f182p;
            this.f194f = c0054f.f183q;
            this.f195g = c0054f.f184r;
            this.f196h = c0054f.f185s;
            this.f197i = c0054f.f186t;
            this.f198j = c0054f.f187u;
            this.f199k = c0054f.f188v;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0054f m131a(C0078q c0078q) {
        C0054f c0054f = new C0054f(c0078q);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f189a.length) {
            C0051a c0051a = new C0051a();
            int i3 = i2 + 1;
            c0051a.f155c = this.f189a[i2];
            if (C0078q.f293a) {
                Log.v("FragmentManager", "Instantiate " + c0054f + " op #" + i + " base fragment #" + this.f189a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.f189a[i3];
            if (i2 >= 0) {
                c0051a.f156d = (C0063k) c0078q.f299f.get(i2);
            } else {
                c0051a.f156d = null;
            }
            i3 = i4 + 1;
            c0051a.f157e = this.f189a[i4];
            i4 = i3 + 1;
            c0051a.f158f = this.f189a[i3];
            i3 = i4 + 1;
            c0051a.f159g = this.f189a[i4];
            int i5 = i3 + 1;
            c0051a.f160h = this.f189a[i3];
            i4 = i5 + 1;
            int i6 = this.f189a[i5];
            if (i6 > 0) {
                c0051a.f161i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (C0078q.f293a) {
                        Log.v("FragmentManager", "Instantiate " + c0054f + " set remove fragment #" + this.f189a[i4]);
                    }
                    i5 = i4 + 1;
                    c0051a.f161i.add((C0063k) c0078q.f299f.get(this.f189a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            c0054f.f172f = c0051a.f157e;
            c0054f.f173g = c0051a.f158f;
            c0054f.f174h = c0051a.f159g;
            c0054f.f175i = c0051a.f160h;
            c0054f.m122a(c0051a);
            i++;
            i2 = i4;
        }
        c0054f.f176j = this.f190b;
        c0054f.f177k = this.f191c;
        c0054f.f180n = this.f192d;
        c0054f.f182p = this.f193e;
        c0054f.f178l = true;
        c0054f.f183q = this.f194f;
        c0054f.f184r = this.f195g;
        c0054f.f185s = this.f196h;
        c0054f.f186t = this.f197i;
        c0054f.f187u = this.f198j;
        c0054f.f188v = this.f199k;
        c0054f.m121a(1);
        return c0054f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f189a);
        parcel.writeInt(this.f190b);
        parcel.writeInt(this.f191c);
        parcel.writeString(this.f192d);
        parcel.writeInt(this.f193e);
        parcel.writeInt(this.f194f);
        TextUtils.writeToParcel(this.f195g, parcel, 0);
        parcel.writeInt(this.f196h);
        TextUtils.writeToParcel(this.f197i, parcel, 0);
        parcel.writeStringList(this.f198j);
        parcel.writeStringList(this.f199k);
    }
}
