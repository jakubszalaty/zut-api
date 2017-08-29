package android.support.v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.a.s */
final class C0081s implements Parcelable {
    public static final Creator<C0081s> CREATOR;
    C0083t[] f321a;
    int[] f322b;
    C0056g[] f323c;

    /* renamed from: android.support.v4.a.s.1 */
    static class C00801 implements Creator<C0081s> {
        C00801() {
        }

        public C0081s m363a(Parcel parcel) {
            return new C0081s(parcel);
        }

        public C0081s[] m364a(int i) {
            return new C0081s[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m363a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m364a(i);
        }
    }

    static {
        CREATOR = new C00801();
    }

    public C0081s(Parcel parcel) {
        this.f321a = (C0083t[]) parcel.createTypedArray(C0083t.CREATOR);
        this.f322b = parcel.createIntArray();
        this.f323c = (C0056g[]) parcel.createTypedArray(C0056g.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f321a, i);
        parcel.writeIntArray(this.f322b);
        parcel.writeTypedArray(this.f323c, i);
    }
}
