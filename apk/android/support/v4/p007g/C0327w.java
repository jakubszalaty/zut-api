package android.support.v4.p007g;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.w */
public class C0327w {
    private final View f558a;
    private ViewParent f559b;
    private boolean f560c;
    private int[] f561d;

    public C0327w(View view) {
        this.f558a = view;
    }

    public void m1538a(boolean z) {
        if (this.f560c) {
            ae.m1163s(this.f558a);
        }
        this.f560c = z;
    }

    public boolean m1539a() {
        return this.f560c;
    }

    public boolean m1540a(float f, float f2) {
        return (!m1539a() || this.f559b == null) ? false : as.m1259a(this.f559b, this.f558a, f, f2);
    }

    public boolean m1541a(float f, float f2, boolean z) {
        return (!m1539a() || this.f559b == null) ? false : as.m1260a(this.f559b, this.f558a, f, f2, z);
    }

    public boolean m1542a(int i) {
        if (m1545b()) {
            return true;
        }
        if (m1539a()) {
            View view = this.f558a;
            for (ViewParent parent = this.f558a.getParent(); parent != null; parent = parent.getParent()) {
                if (as.m1261a(parent, view, this.f558a, i)) {
                    this.f559b = parent;
                    as.m1262b(parent, view, this.f558a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public boolean m1543a(int i, int i2, int i3, int i4, int[] iArr) {
        if (!m1539a() || this.f559b == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int i5;
            int i6;
            if (iArr != null) {
                this.f558a.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            as.m1257a(this.f559b, this.f558a, i, i2, i3, i4);
            if (iArr != null) {
                this.f558a.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
    }

    public boolean m1544a(int i, int i2, int[] iArr, int[] iArr2) {
        if (!m1539a() || this.f559b == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            int i3;
            int i4;
            if (iArr2 != null) {
                this.f558a.getLocationInWindow(iArr2);
                i3 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (iArr == null) {
                if (this.f561d == null) {
                    this.f561d = new int[2];
                }
                iArr = this.f561d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            as.m1258a(this.f559b, this.f558a, i, i2, iArr);
            if (iArr2 != null) {
                this.f558a.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i3;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean m1545b() {
        return this.f559b != null;
    }

    public void m1546c() {
        if (this.f559b != null) {
            as.m1256a(this.f559b, this.f558a);
            this.f559b = null;
        }
    }
}
