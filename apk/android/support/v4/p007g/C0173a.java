package android.support.v4.p007g;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p011e.C0154d;
import android.support.v4.p011e.C0155e;

/* renamed from: android.support.v4.g.a */
public abstract class C0173a implements Parcelable {
    public static final Creator<C0173a> CREATOR;
    public static final C0173a f458a;
    private final Parcelable f459b;

    /* renamed from: android.support.v4.g.a.1 */
    static class C01741 extends C0173a {
        C01741() {
            super();
        }
    }

    /* renamed from: android.support.v4.g.a.2 */
    static class C01752 implements C0155e<C0173a> {
        C01752() {
        }

        public /* synthetic */ Object m683a(Parcel parcel, ClassLoader classLoader) {
            return m685b(parcel, classLoader);
        }

        public /* synthetic */ Object[] m684a(int i) {
            return m686b(i);
        }

        public C0173a m685b(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0173a.f458a;
            }
            throw new IllegalStateException("superState must be null");
        }

        public C0173a[] m686b(int i) {
            return new C0173a[i];
        }
    }

    static {
        f458a = new C01741();
        CREATOR = C0154d.m600a(new C01752());
    }

    private C0173a() {
        this.f459b = null;
    }

    protected C0173a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f458a;
        }
        this.f459b = readParcelable;
    }

    protected C0173a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f458a) {
            parcelable = null;
        }
        this.f459b = parcelable;
    }

    public final Parcelable m682a() {
        return this.f459b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f459b, i);
    }
}
