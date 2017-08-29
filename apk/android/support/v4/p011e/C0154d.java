package android.support.v4.p011e;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.e.d */
public final class C0154d {

    /* renamed from: android.support.v4.e.d.a */
    static class C0153a<T> implements Creator<T> {
        final C0155e<T> f409a;

        public C0153a(C0155e<T> c0155e) {
            this.f409a = c0155e;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f409a.m601a(parcel, null);
        }

        public T[] newArray(int i) {
            return this.f409a.m602a(i);
        }
    }

    public static <T> Creator<T> m600a(C0155e<T> c0155e) {
        return VERSION.SDK_INT >= 13 ? C0157g.m603a(c0155e) : new C0153a(c0155e);
    }
}
