package android.support.v4.p012f;

/* renamed from: android.support.v4.f.e */
public class C0165e<E> implements Cloneable {
    private static final Object f428a;
    private boolean f429b;
    private long[] f430c;
    private Object[] f431d;
    private int f432e;

    static {
        f428a = new Object();
    }

    public C0165e() {
        this(10);
    }

    public C0165e(int i) {
        this.f429b = false;
        if (i == 0) {
            this.f430c = C0162b.f424b;
            this.f431d = C0162b.f425c;
        } else {
            int b = C0162b.m648b(i);
            this.f430c = new long[b];
            this.f431d = new Object[b];
        }
        this.f432e = 0;
    }

    private void m652d() {
        int i = this.f432e;
        long[] jArr = this.f430c;
        Object[] objArr = this.f431d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f428a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f429b = false;
        this.f432e = i2;
    }

    public long m653a(int i) {
        if (this.f429b) {
            m652d();
        }
        return this.f430c[i];
    }

    public C0165e<E> m654a() {
        try {
            C0165e<E> c0165e = (C0165e) super.clone();
            try {
                c0165e.f430c = (long[]) this.f430c.clone();
                c0165e.f431d = (Object[]) this.f431d.clone();
                return c0165e;
            } catch (CloneNotSupportedException e) {
                return c0165e;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E m655a(long j) {
        return m656a(j, null);
    }

    public E m656a(long j, E e) {
        int a = C0162b.m646a(this.f430c, this.f432e, j);
        return (a < 0 || this.f431d[a] == f428a) ? e : this.f431d[a];
    }

    public int m657b() {
        if (this.f429b) {
            m652d();
        }
        return this.f432e;
    }

    public E m658b(int i) {
        if (this.f429b) {
            m652d();
        }
        return this.f431d[i];
    }

    public void m659b(long j) {
        int a = C0162b.m646a(this.f430c, this.f432e, j);
        if (a >= 0 && this.f431d[a] != f428a) {
            this.f431d[a] = f428a;
            this.f429b = true;
        }
    }

    public void m660b(long j, E e) {
        int a = C0162b.m646a(this.f430c, this.f432e, j);
        if (a >= 0) {
            this.f431d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f432e || this.f431d[a] != f428a) {
            if (this.f429b && this.f432e >= this.f430c.length) {
                m652d();
                a = C0162b.m646a(this.f430c, this.f432e, j) ^ -1;
            }
            if (this.f432e >= this.f430c.length) {
                int b = C0162b.m648b(this.f432e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f430c, 0, obj, 0, this.f430c.length);
                System.arraycopy(this.f431d, 0, obj2, 0, this.f431d.length);
                this.f430c = obj;
                this.f431d = obj2;
            }
            if (this.f432e - a != 0) {
                System.arraycopy(this.f430c, a, this.f430c, a + 1, this.f432e - a);
                System.arraycopy(this.f431d, a, this.f431d, a + 1, this.f432e - a);
            }
            this.f430c[a] = j;
            this.f431d[a] = e;
            this.f432e++;
            return;
        }
        this.f430c[a] = j;
        this.f431d[a] = e;
    }

    public void m661c() {
        int i = this.f432e;
        Object[] objArr = this.f431d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f432e = 0;
        this.f429b = false;
    }

    public /* synthetic */ Object clone() {
        return m654a();
    }

    public String toString() {
        if (m657b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f432e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f432e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m653a(i));
            stringBuilder.append('=');
            C0165e b = m658b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
