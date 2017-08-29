package android.support.v4.p012f;

import java.util.LinkedHashMap;

/* renamed from: android.support.v4.f.f */
public class C0166f<K, V> {
    private final LinkedHashMap<K, V> f433a;
    private int f434b;
    private int f435c;
    private int f436d;
    private int f437e;
    private int f438f;
    private int f439g;
    private int f440h;

    public C0166f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f435c = i;
        this.f433a = new LinkedHashMap(0, 0.75f, true);
    }

    private int m662c(K k, V v) {
        int b = m667b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final V m663a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f433a.get(k);
            if (v != null) {
                this.f439g++;
                return v;
            }
            this.f440h++;
            V b = m668b(k);
            if (b == null) {
                return null;
            }
            synchronized (this) {
                this.f437e++;
                v = this.f433a.put(k, b);
                if (v != null) {
                    this.f433a.put(k, v);
                } else {
                    this.f434b += m662c(k, b);
                }
            }
            if (v != null) {
                m666a(false, k, b, v);
                return v;
            }
            m665a(this.f435c);
            return b;
        }
    }

    public final V m664a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V put;
        synchronized (this) {
            this.f436d++;
            this.f434b += m662c(k, v);
            put = this.f433a.put(k, v);
            if (put != null) {
                this.f434b -= m662c(k, put);
            }
        }
        if (put != null) {
            m666a(false, k, put, v);
        }
        m665a(this.f435c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m665a(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f434b;	 Catch:{ all -> 0x0032 }
        if (r0 < 0) goto L_0x0011;
    L_0x0005:
        r0 = r4.f433a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x000d:
        r0 = r4.f434b;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x0011:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = r4.getClass();	 Catch:{ all -> 0x0032 }
        r2 = r2.getName();	 Catch:{ all -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r2 = ".sizeOf() is reporting inconsistent results!";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r1 = r1.toString();	 Catch:{ all -> 0x0032 }
        r0.<init>(r1);	 Catch:{ all -> 0x0032 }
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        throw r0;
    L_0x0035:
        r0 = r4.f434b;	 Catch:{ all -> 0x0032 }
        if (r0 <= r5) goto L_0x0041;
    L_0x0039:
        r0 = r4.f433a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0043;
    L_0x0041:
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0043:
        r0 = r4.f433a;	 Catch:{ all -> 0x0032 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0032 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0032 }
        r0 = r0.next();	 Catch:{ all -> 0x0032 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0032 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0032 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0032 }
        r2 = r4.f433a;	 Catch:{ all -> 0x0032 }
        r2.remove(r1);	 Catch:{ all -> 0x0032 }
        r2 = r4.f434b;	 Catch:{ all -> 0x0032 }
        r3 = r4.m662c(r1, r0);	 Catch:{ all -> 0x0032 }
        r2 = r2 - r3;
        r4.f434b = r2;	 Catch:{ all -> 0x0032 }
        r2 = r4.f438f;	 Catch:{ all -> 0x0032 }
        r2 = r2 + 1;
        r4.f438f = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r3 = 0;
        r4.m666a(r2, r1, r0, r3);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.f.a(int):void");
    }

    protected void m666a(boolean z, K k, V v, V v2) {
    }

    protected int m667b(K k, V v) {
        return 1;
    }

    protected V m668b(K k) {
        return null;
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f439g + this.f440h;
            if (i2 != 0) {
                i = (this.f439g * 100) / i2;
            }
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f435c), Integer.valueOf(this.f439g), Integer.valueOf(this.f440h), Integer.valueOf(i)});
        }
        return format;
    }
}
