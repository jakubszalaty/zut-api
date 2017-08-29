package android.support.v4.p011e;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: android.support.v4.e.f */
class C0156f<T> implements ClassLoaderCreator<T> {
    private final C0155e<T> f410a;

    public C0156f(C0155e<T> c0155e) {
        this.f410a = c0155e;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f410a.m601a(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f410a.m601a(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.f410a.m602a(i);
    }
}
