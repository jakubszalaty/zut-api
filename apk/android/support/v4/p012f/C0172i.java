package android.support.v4.p012f;

/* renamed from: android.support.v4.f.i */
public class C0172i<E> implements Cloneable {
    private static final Object f453a;
    private boolean f454b;
    private int[] f455c;
    private Object[] f456d;
    private int f457e;

    static {
        f453a = new Object();
    }

    public C0172i() {
        this(10);
    }

    public C0172i(int i) {
        this.f454b = false;
        if (i == 0) {
            this.f455c = C0162b.f423a;
            this.f456d = C0162b.f425c;
        } else {
            int a = C0162b.m644a(i);
            this.f455c = new int[a];
            this.f456d = new Object[a];
        }
        this.f457e = 0;
    }

    private void m671d() {
        int i = this.f457e;
        int[] iArr = this.f455c;
        Object[] objArr = this.f456d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f453a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f454b = false;
        this.f457e = i2;
    }

    public C0172i<E> m672a() {
        try {
            C0172i<E> c0172i = (C0172i) super.clone();
            try {
                c0172i.f455c = (int[]) this.f455c.clone();
                c0172i.f456d = (Object[]) this.f456d.clone();
                return c0172i;
            } catch (CloneNotSupportedException e) {
                return c0172i;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E m673a(int i) {
        return m674a(i, null);
    }

    public E m674a(int i, E e) {
        int a = C0162b.m645a(this.f455c, this.f457e, i);
        return (a < 0 || this.f456d[a] == f453a) ? e : this.f456d[a];
    }

    public int m675b() {
        if (this.f454b) {
            m671d();
        }
        return this.f457e;
    }

    public void m676b(int i) {
        int a = C0162b.m645a(this.f455c, this.f457e, i);
        if (a >= 0 && this.f456d[a] != f453a) {
            this.f456d[a] = f453a;
            this.f454b = true;
        }
    }

    public void m677b(int i, E e) {
        int a = C0162b.m645a(this.f455c, this.f457e, i);
        if (a >= 0) {
            this.f456d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f457e || this.f456d[a] != f453a) {
            if (this.f454b && this.f457e >= this.f455c.length) {
                m671d();
                a = C0162b.m645a(this.f455c, this.f457e, i) ^ -1;
            }
            if (this.f457e >= this.f455c.length) {
                int a2 = C0162b.m644a(this.f457e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f455c, 0, obj, 0, this.f455c.length);
                System.arraycopy(this.f456d, 0, obj2, 0, this.f456d.length);
                this.f455c = obj;
                this.f456d = obj2;
            }
            if (this.f457e - a != 0) {
                System.arraycopy(this.f455c, a, this.f455c, a + 1, this.f457e - a);
                System.arraycopy(this.f456d, a, this.f456d, a + 1, this.f457e - a);
            }
            this.f455c[a] = i;
            this.f456d[a] = e;
            this.f457e++;
            return;
        }
        this.f455c[a] = i;
        this.f456d[a] = e;
    }

    public void m678c() {
        int i = this.f457e;
        Object[] objArr = this.f456d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f457e = 0;
        this.f454b = false;
    }

    public void m679c(int i) {
        m676b(i);
    }

    public /* synthetic */ Object clone() {
        return m672a();
    }

    public int m680d(int i) {
        if (this.f454b) {
            m671d();
        }
        return this.f455c[i];
    }

    public E m681e(int i) {
        if (this.f454b) {
            m671d();
        }
        return this.f456d[i];
    }

    public String toString() {
        if (m675b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f457e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f457e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m680d(i));
            stringBuilder.append('=');
            C0172i e = m681e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
