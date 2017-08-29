package android.support.v4.p012f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.f.g */
abstract class C0158g<K, V> {
    C0168b f411b;
    C0169c f412c;
    C0171e f413d;

    /* renamed from: android.support.v4.f.g.a */
    final class C0167a<T> implements Iterator<T> {
        final int f441a;
        int f442b;
        int f443c;
        boolean f444d;
        final /* synthetic */ C0158g f445e;

        C0167a(C0158g c0158g, int i) {
            this.f445e = c0158g;
            this.f444d = false;
            this.f441a = i;
            this.f442b = c0158g.m608a();
        }

        public boolean hasNext() {
            return this.f443c < this.f442b;
        }

        public T next() {
            T a = this.f445e.m610a(this.f443c, this.f441a);
            this.f443c++;
            this.f444d = true;
            return a;
        }

        public void remove() {
            if (this.f444d) {
                this.f443c--;
                this.f442b--;
                this.f444d = false;
                this.f445e.m612a(this.f443c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.f.g.b */
    final class C0168b implements Set<Entry<K, V>> {
        final /* synthetic */ C0158g f446a;

        C0168b(C0158g c0158g) {
            this.f446a = c0158g;
        }

        public boolean m669a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ boolean add(Object obj) {
            return m669a((Entry) obj);
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f446a.m608a();
            for (Entry entry : collection) {
                this.f446a.m613a(entry.getKey(), entry.getValue());
            }
            return a != this.f446a.m608a();
        }

        public void clear() {
            this.f446a.m618c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f446a.m609a(entry.getKey());
            return a >= 0 ? C0162b.m647a(this.f446a.m610a(a, 1), entry.getValue()) : false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0158g.m605a((Set) this, obj);
        }

        public int hashCode() {
            int a = this.f446a.m608a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = this.f446a.m610a(a, 0);
                Object a3 = this.f446a.m610a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f446a.m608a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0170d(this.f446a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f446a.m608a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.f.g.c */
    final class C0169c implements Set<K> {
        final /* synthetic */ C0158g f447a;

        C0169c(C0158g c0158g) {
            this.f447a = c0158g;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f447a.m618c();
        }

        public boolean contains(Object obj) {
            return this.f447a.m609a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0158g.m604a(this.f447a.m616b(), (Collection) collection);
        }

        public boolean equals(Object obj) {
            return C0158g.m605a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f447a.m608a() - 1; a >= 0; a--) {
                Object a2 = this.f447a.m610a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f447a.m608a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0167a(this.f447a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f447a.m609a(obj);
            if (a < 0) {
                return false;
            }
            this.f447a.m612a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0158g.m606b(this.f447a.m616b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0158g.m607c(this.f447a.m616b(), collection);
        }

        public int size() {
            return this.f447a.m608a();
        }

        public Object[] toArray() {
            return this.f447a.m617b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f447a.m614a((Object[]) tArr, 0);
        }
    }

    /* renamed from: android.support.v4.f.g.d */
    final class C0170d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int f448a;
        int f449b;
        boolean f450c;
        final /* synthetic */ C0158g f451d;

        C0170d(C0158g c0158g) {
            this.f451d = c0158g;
            this.f450c = false;
            this.f448a = c0158g.m608a() - 1;
            this.f449b = -1;
        }

        public Entry<K, V> m670a() {
            this.f449b++;
            this.f450c = true;
            return this;
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f450c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!(C0162b.m647a(entry.getKey(), this.f451d.m610a(this.f449b, 0)) && C0162b.m647a(entry.getValue(), this.f451d.m610a(this.f449b, 1)))) {
                    z = false;
                }
                return z;
            }
        }

        public K getKey() {
            if (this.f450c) {
                return this.f451d.m610a(this.f449b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f450c) {
                return this.f451d.m610a(this.f449b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f449b < this.f448a;
        }

        public final int hashCode() {
            int i = 0;
            if (this.f450c) {
                Object a = this.f451d.m610a(this.f449b, 0);
                Object a2 = this.f451d.m610a(this.f449b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* synthetic */ Object next() {
            return m670a();
        }

        public void remove() {
            if (this.f450c) {
                this.f451d.m612a(this.f449b);
                this.f449b--;
                this.f448a--;
                this.f450c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f450c) {
                return this.f451d.m611a(this.f449b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.f.g.e */
    final class C0171e implements Collection<V> {
        final /* synthetic */ C0158g f452a;

        C0171e(C0158g c0158g) {
            this.f452a = c0158g;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f452a.m618c();
        }

        public boolean contains(Object obj) {
            return this.f452a.m615b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f452a.m608a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0167a(this.f452a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f452a.m615b(obj);
            if (b < 0) {
                return false;
            }
            this.f452a.m612a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = this.f452a.m608a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f452a.m610a(i, 1))) {
                    this.f452a.m612a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = this.f452a.m608a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f452a.m610a(i, 1))) {
                    this.f452a.m612a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f452a.m608a();
        }

        public Object[] toArray() {
            return this.f452a.m617b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f452a.m614a((Object[]) tArr, 1);
        }
    }

    C0158g() {
    }

    public static <K, V> boolean m604a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean m605a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static <K, V> boolean m606b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean m607c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int m608a();

    protected abstract int m609a(Object obj);

    protected abstract Object m610a(int i, int i2);

    protected abstract V m611a(int i, V v);

    protected abstract void m612a(int i);

    protected abstract void m613a(K k, V v);

    public <T> T[] m614a(T[] tArr, int i) {
        int a = m608a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = m610a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    protected abstract int m615b(Object obj);

    protected abstract Map<K, V> m616b();

    public Object[] m617b(int i) {
        int a = m608a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = m610a(i2, i);
        }
        return objArr;
    }

    protected abstract void m618c();

    public Set<Entry<K, V>> m619d() {
        if (this.f411b == null) {
            this.f411b = new C0168b(this);
        }
        return this.f411b;
    }

    public Set<K> m620e() {
        if (this.f412c == null) {
            this.f412c = new C0169c(this);
        }
        return this.f412c;
    }

    public Collection<V> m621f() {
        if (this.f413d == null) {
            this.f413d = new C0171e(this);
        }
        return this.f413d;
    }
}
