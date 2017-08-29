package android.support.v4.p012f;

import java.util.Map;

/* renamed from: android.support.v4.f.h */
public class C0160h<K, V> {
    static Object[] f415b;
    static int f416c;
    static Object[] f417d;
    static int f418e;
    int[] f419f;
    Object[] f420g;
    int f421h;

    public C0160h() {
        this.f419f = C0162b.f423a;
        this.f420g = C0162b.f425c;
        this.f421h = 0;
    }

    public C0160h(int i) {
        if (i == 0) {
            this.f419f = C0162b.f423a;
            this.f420g = C0162b.f425c;
        } else {
            m632e(i);
        }
        this.f421h = 0;
    }

    private static void m631a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0161a.class) {
                if (f418e < 10) {
                    objArr[0] = f417d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f417d = objArr;
                    f418e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0161a.class) {
                if (f416c < 10) {
                    objArr[0] = f415b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f415b = objArr;
                    f416c++;
                }
            }
        }
    }

    private void m632e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0161a.class) {
                if (f417d != null) {
                    objArr = f417d;
                    this.f420g = objArr;
                    f417d = (Object[]) objArr[0];
                    this.f419f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f418e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0161a.class) {
                if (f415b != null) {
                    objArr = f415b;
                    this.f420g = objArr;
                    f415b = (Object[]) objArr[0];
                    this.f419f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f416c--;
                    return;
                }
            }
        }
        this.f419f = new int[i];
        this.f420g = new Object[(i << 1)];
    }

    int m633a() {
        int i = this.f421h;
        if (i == 0) {
            return -1;
        }
        int a = C0162b.m645a(this.f419f, i, 0);
        if (a < 0 || this.f420g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f419f[i2] == 0) {
            if (this.f420g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f419f[a] == 0) {
            if (this.f420g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    public int m634a(Object obj) {
        return obj == null ? m633a() : m635a(obj, obj.hashCode());
    }

    int m635a(Object obj, int i) {
        int i2 = this.f421h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0162b.m645a(this.f419f, i2, i);
        if (a < 0 || obj.equals(this.f420g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f419f[i3] == i) {
            if (obj.equals(this.f420g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f419f[a] == i) {
            if (obj.equals(this.f420g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    public V m636a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f420g[i2];
        this.f420g[i2] = v;
        return v2;
    }

    public void m637a(int i) {
        if (this.f419f.length < i) {
            Object obj = this.f419f;
            Object obj2 = this.f420g;
            m632e(i);
            if (this.f421h > 0) {
                System.arraycopy(obj, 0, this.f419f, 0, this.f421h);
                System.arraycopy(obj2, 0, this.f420g, 0, this.f421h << 1);
            }
            C0160h.m631a(obj, obj2, this.f421h);
        }
    }

    int m638b(Object obj) {
        int i = 1;
        int i2 = this.f421h * 2;
        Object[] objArr = this.f420g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public K m639b(int i) {
        return this.f420g[i << 1];
    }

    public V m640c(int i) {
        return this.f420g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f421h != 0) {
            C0160h.m631a(this.f419f, this.f420g, this.f421h);
            this.f419f = C0162b.f423a;
            this.f420g = C0162b.f425c;
            this.f421h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return m634a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m638b(obj) >= 0;
    }

    public V m641d(int i) {
        int i2 = 8;
        V v = this.f420g[(i << 1) + 1];
        if (this.f421h <= 1) {
            C0160h.m631a(this.f419f, this.f420g, this.f421h);
            this.f419f = C0162b.f423a;
            this.f420g = C0162b.f425c;
            this.f421h = 0;
        } else if (this.f419f.length <= 8 || this.f421h >= this.f419f.length / 3) {
            this.f421h--;
            if (i < this.f421h) {
                System.arraycopy(this.f419f, i + 1, this.f419f, i, this.f421h - i);
                System.arraycopy(this.f420g, (i + 1) << 1, this.f420g, i << 1, (this.f421h - i) << 1);
            }
            this.f420g[this.f421h << 1] = null;
            this.f420g[(this.f421h << 1) + 1] = null;
        } else {
            if (this.f421h > 8) {
                i2 = this.f421h + (this.f421h >> 1);
            }
            Object obj = this.f419f;
            Object obj2 = this.f420g;
            m632e(i2);
            this.f421h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f419f, 0, i);
                System.arraycopy(obj2, 0, this.f420g, 0, i << 1);
            }
            if (i < this.f421h) {
                System.arraycopy(obj, i + 1, this.f419f, i, this.f421h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f420g, i << 1, (this.f421h - i) << 1);
            }
        }
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof C0160h) {
            C0160h c0160h = (C0160h) obj;
            if (size() != c0160h.size()) {
                return false;
            }
            i = 0;
            while (i < this.f421h) {
                try {
                    b = m639b(i);
                    c = m640c(i);
                    obj2 = c0160h.get(b);
                    if (c == null) {
                        if (obj2 != null || !c0160h.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f421h) {
                try {
                    b = m639b(i);
                    c = m640c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public V get(Object obj) {
        int a = m634a(obj);
        return a >= 0 ? this.f420g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f419f;
        Object[] objArr = this.f420g;
        int i = this.f421h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f421h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m633a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m635a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f420g[i3];
            this.f420g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f421h >= this.f419f.length) {
            if (this.f421h >= 8) {
                i2 = this.f421h + (this.f421h >> 1);
            } else if (this.f421h < 4) {
                i2 = 4;
            }
            Object obj = this.f419f;
            Object obj2 = this.f420g;
            m632e(i2);
            if (this.f419f.length > 0) {
                System.arraycopy(obj, 0, this.f419f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f420g, 0, obj2.length);
            }
            C0160h.m631a(obj, obj2, this.f421h);
        }
        if (a < this.f421h) {
            System.arraycopy(this.f419f, a, this.f419f, a + 1, this.f421h - a);
            System.arraycopy(this.f420g, a << 1, this.f420g, (a + 1) << 1, (this.f421h - a) << 1);
        }
        this.f419f[a] = i;
        this.f420g[a << 1] = k;
        this.f420g[(a << 1) + 1] = v;
        this.f421h++;
        return null;
    }

    public V remove(Object obj) {
        int a = m634a(obj);
        return a >= 0 ? m641d(a) : null;
    }

    public int size() {
        return this.f421h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f421h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f421h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0160h b = m639b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m640c(i);
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
