package android.support.v4.p012f;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.f.a */
public class C0161a<K, V> extends C0160h<K, V> implements Map<K, V> {
    C0158g<K, V> f422a;

    /* renamed from: android.support.v4.f.a.1 */
    class C01591 extends C0158g<K, V> {
        final /* synthetic */ C0161a f414a;

        C01591(C0161a c0161a) {
            this.f414a = c0161a;
        }

        protected int m622a() {
            return this.f414a.h;
        }

        protected int m623a(Object obj) {
            return this.f414a.m634a(obj);
        }

        protected Object m624a(int i, int i2) {
            return this.f414a.g[(i << 1) + i2];
        }

        protected V m625a(int i, V v) {
            return this.f414a.m636a(i, (Object) v);
        }

        protected void m626a(int i) {
            this.f414a.m641d(i);
        }

        protected void m627a(K k, V v) {
            this.f414a.put(k, v);
        }

        protected int m628b(Object obj) {
            return this.f414a.m638b(obj);
        }

        protected Map<K, V> m629b() {
            return this.f414a;
        }

        protected void m630c() {
            this.f414a.clear();
        }
    }

    public C0161a(int i) {
        super(i);
    }

    private C0158g<K, V> m642b() {
        if (this.f422a == null) {
            this.f422a = new C01591(this);
        }
        return this.f422a;
    }

    public boolean m643a(Collection<?> collection) {
        return C0158g.m607c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m642b().m619d();
    }

    public Set<K> keySet() {
        return m642b().m620e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m637a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m642b().m621f();
    }
}
