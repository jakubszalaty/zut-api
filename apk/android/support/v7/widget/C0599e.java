package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.p011e.C0150a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: android.support.v7.widget.e */
class C0599e extends DataSetObservable {
    static final String f1756a;
    private static final Object f1757e;
    private static final Map<String, C0599e> f1758f;
    final Context f1759b;
    final String f1760c;
    boolean f1761d;
    private final Object f1762g;
    private final List<C0594a> f1763h;
    private final List<C0596c> f1764i;
    private Intent f1765j;
    private C0595b f1766k;
    private int f1767l;
    private boolean f1768m;
    private boolean f1769n;
    private boolean f1770o;
    private C0597d f1771p;

    /* renamed from: android.support.v7.widget.e.a */
    public final class C0594a implements Comparable<C0594a> {
        public final ResolveInfo f1749a;
        public float f1750b;
        final /* synthetic */ C0599e f1751c;

        public C0594a(C0599e c0599e, ResolveInfo resolveInfo) {
            this.f1751c = c0599e;
            this.f1749a = resolveInfo;
        }

        public int m3058a(C0594a c0594a) {
            return Float.floatToIntBits(c0594a.f1750b) - Float.floatToIntBits(this.f1750b);
        }

        public /* synthetic */ int compareTo(Object obj) {
            return m3058a((C0594a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f1750b) == Float.floatToIntBits(((C0594a) obj).f1750b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1750b) + 31;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:").append(this.f1749a.toString());
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f1750b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e.b */
    public interface C0595b {
        void m3059a(Intent intent, List<C0594a> list, List<C0596c> list2);
    }

    /* renamed from: android.support.v7.widget.e.c */
    public static final class C0596c {
        public final ComponentName f1752a;
        public final long f1753b;
        public final float f1754c;

        public C0596c(ComponentName componentName, long j, float f) {
            this.f1752a = componentName;
            this.f1753b = j;
            this.f1754c = f;
        }

        public C0596c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C0596c c0596c = (C0596c) obj;
            if (this.f1752a == null) {
                if (c0596c.f1752a != null) {
                    return false;
                }
            } else if (!this.f1752a.equals(c0596c.f1752a)) {
                return false;
            }
            return this.f1753b != c0596c.f1753b ? false : Float.floatToIntBits(this.f1754c) == Float.floatToIntBits(c0596c.f1754c);
        }

        public int hashCode() {
            return (((((this.f1752a == null ? 0 : this.f1752a.hashCode()) + 31) * 31) + ((int) (this.f1753b ^ (this.f1753b >>> 32)))) * 31) + Float.floatToIntBits(this.f1754c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:").append(this.f1752a);
            stringBuilder.append("; time:").append(this.f1753b);
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f1754c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e.d */
    public interface C0597d {
        boolean m3060a(C0599e c0599e, Intent intent);
    }

    /* renamed from: android.support.v7.widget.e.e */
    private final class C0598e extends AsyncTask<Object, Void, Void> {
        final /* synthetic */ C0599e f1755a;

        C0598e(C0599e c0599e) {
            this.f1755a = c0599e;
        }

        public Void m3061a(Object... objArr) {
            int i = 0;
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                OutputStream openFileOutput = this.f1755a.f1759b.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                    newSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    while (i < size) {
                        C0596c c0596c = (C0596c) list.remove(0);
                        newSerializer.startTag(null, "historical-record");
                        newSerializer.attribute(null, "activity", c0596c.f1752a.flattenToString());
                        newSerializer.attribute(null, "time", String.valueOf(c0596c.f1753b));
                        newSerializer.attribute(null, "weight", String.valueOf(c0596c.f1754c));
                        newSerializer.endTag(null, "historical-record");
                        i++;
                    }
                    newSerializer.endTag(null, "historical-records");
                    newSerializer.endDocument();
                    this.f1755a.f1761d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable e2) {
                    Log.e(C0599e.f1756a, "Error writing historical record file: " + this.f1755a.f1760c, e2);
                    this.f1755a.f1761d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable e22) {
                    Log.e(C0599e.f1756a, "Error writing historical record file: " + this.f1755a.f1760c, e22);
                    this.f1755a.f1761d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (Throwable e222) {
                    Log.e(C0599e.f1756a, "Error writing historical record file: " + this.f1755a.f1760c, e222);
                    this.f1755a.f1761d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th) {
                    this.f1755a.f1761d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (Throwable e2222) {
                Log.e(C0599e.f1756a, "Error writing historical record file: " + str, e2222);
            }
            return null;
        }

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            return m3061a(objArr);
        }
    }

    static {
        f1756a = C0599e.class.getSimpleName();
        f1757e = new Object();
        f1758f = new HashMap();
    }

    private boolean m3062a(C0596c c0596c) {
        boolean add = this.f1764i.add(c0596c);
        if (add) {
            this.f1769n = true;
            m3068h();
            m3063c();
            m3065e();
            notifyChanged();
        }
        return add;
    }

    private void m3063c() {
        if (!this.f1768m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1769n) {
            this.f1769n = false;
            if (!TextUtils.isEmpty(this.f1760c)) {
                C0150a.m597a(new C0598e(this), new ArrayList(this.f1764i), this.f1760c);
            }
        }
    }

    private void m3064d() {
        int f = m3066f() | m3067g();
        m3068h();
        if (f != 0) {
            m3065e();
            notifyChanged();
        }
    }

    private boolean m3065e() {
        if (this.f1766k == null || this.f1765j == null || this.f1763h.isEmpty() || this.f1764i.isEmpty()) {
            return false;
        }
        this.f1766k.m3059a(this.f1765j, this.f1763h, Collections.unmodifiableList(this.f1764i));
        return true;
    }

    private boolean m3066f() {
        if (!this.f1770o || this.f1765j == null) {
            return false;
        }
        this.f1770o = false;
        this.f1763h.clear();
        List queryIntentActivities = this.f1759b.getPackageManager().queryIntentActivities(this.f1765j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1763h.add(new C0594a(this, (ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean m3067g() {
        if (!this.f1761d || !this.f1769n || TextUtils.isEmpty(this.f1760c)) {
            return false;
        }
        this.f1761d = false;
        this.f1768m = true;
        m3069i();
        return true;
    }

    private void m3068h() {
        int size = this.f1764i.size() - this.f1767l;
        if (size > 0) {
            this.f1769n = true;
            for (int i = 0; i < size; i++) {
                C0596c c0596c = (C0596c) this.f1764i.remove(0);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3069i() {
        /*
        r9 = this;
        r8 = 1;
        r0 = r9.f1759b;	 Catch:{ FileNotFoundException -> 0x00d3 }
        r1 = r9.f1760c;	 Catch:{ FileNotFoundException -> 0x00d3 }
        r1 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x00d3 }
        r2 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r0 = "UTF-8";
        r2.setInput(r1, r0);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r0 = 0;
    L_0x0013:
        if (r0 == r8) goto L_0x001d;
    L_0x0015:
        r3 = 2;
        if (r0 == r3) goto L_0x001d;
    L_0x0018:
        r0 = r2.next();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        goto L_0x0013;
    L_0x001d:
        r0 = "historical-records";
        r3 = r2.getName();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r0 = r0.equals(r3);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        if (r0 != 0) goto L_0x0052;
    L_0x0029:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r2 = "Share records file does not start with historical-records tag.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
    L_0x0031:
        r0 = move-exception;
        r2 = f1756a;	 Catch:{ all -> 0x00c8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c8 }
        r3.<init>();	 Catch:{ all -> 0x00c8 }
        r4 = "Error reading historical recrod file: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x00c8 }
        r4 = r9.f1760c;	 Catch:{ all -> 0x00c8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00c8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00c8 }
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x00c8 }
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();	 Catch:{ IOException -> 0x00cf }
    L_0x0051:
        return;
    L_0x0052:
        r0 = r9.f1764i;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r0.clear();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
    L_0x0057:
        r3 = r2.next();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        if (r3 != r8) goto L_0x0065;
    L_0x005d:
        if (r1 == 0) goto L_0x0051;
    L_0x005f:
        r1.close();	 Catch:{ IOException -> 0x0063 }
        goto L_0x0051;
    L_0x0063:
        r0 = move-exception;
        goto L_0x0051;
    L_0x0065:
        r4 = 3;
        if (r3 == r4) goto L_0x0057;
    L_0x0068:
        r4 = 4;
        if (r3 == r4) goto L_0x0057;
    L_0x006b:
        r3 = r2.getName();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r4 = "historical-record";
        r3 = r4.equals(r3);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        if (r3 != 0) goto L_0x00a2;
    L_0x0077:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r2 = "Share records file not well-formed.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        r2 = f1756a;	 Catch:{ all -> 0x00c8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c8 }
        r3.<init>();	 Catch:{ all -> 0x00c8 }
        r4 = "Error reading historical recrod file: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x00c8 }
        r4 = r9.f1760c;	 Catch:{ all -> 0x00c8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00c8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00c8 }
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x00c8 }
        if (r1 == 0) goto L_0x0051;
    L_0x009c:
        r1.close();	 Catch:{ IOException -> 0x00a0 }
        goto L_0x0051;
    L_0x00a0:
        r0 = move-exception;
        goto L_0x0051;
    L_0x00a2:
        r3 = 0;
        r4 = "activity";
        r3 = r2.getAttributeValue(r3, r4);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r4 = 0;
        r5 = "time";
        r4 = r2.getAttributeValue(r4, r5);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r6 = 0;
        r7 = "weight";
        r6 = r2.getAttributeValue(r6, r7);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r6 = java.lang.Float.parseFloat(r6);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r7 = new android.support.v7.widget.e$c;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r7.<init>(r3, r4, r6);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        r0.add(r7);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x007f }
        goto L_0x0057;
    L_0x00c8:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00ce;
    L_0x00cb:
        r1.close();	 Catch:{ IOException -> 0x00d1 }
    L_0x00ce:
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        goto L_0x0051;
    L_0x00d1:
        r1 = move-exception;
        goto L_0x00ce;
    L_0x00d3:
        r0 = move-exception;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.e.i():void");
    }

    public int m3070a() {
        int size;
        synchronized (this.f1762g) {
            m3064d();
            size = this.f1763h.size();
        }
        return size;
    }

    public int m3071a(ResolveInfo resolveInfo) {
        synchronized (this.f1762g) {
            m3064d();
            List list = this.f1763h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0594a) list.get(i)).f1749a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public ResolveInfo m3072a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1762g) {
            m3064d();
            resolveInfo = ((C0594a) this.f1763h.get(i)).f1749a;
        }
        return resolveInfo;
    }

    public Intent m3073b(int i) {
        synchronized (this.f1762g) {
            if (this.f1765j == null) {
                return null;
            }
            m3064d();
            C0594a c0594a = (C0594a) this.f1763h.get(i);
            ComponentName componentName = new ComponentName(c0594a.f1749a.activityInfo.packageName, c0594a.f1749a.activityInfo.name);
            Intent intent = new Intent(this.f1765j);
            intent.setComponent(componentName);
            if (this.f1771p != null) {
                if (this.f1771p.m3060a(this, new Intent(intent))) {
                    return null;
                }
            }
            m3062a(new C0596c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo m3074b() {
        synchronized (this.f1762g) {
            m3064d();
            if (this.f1763h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0594a) this.f1763h.get(0)).f1749a;
            return resolveInfo;
        }
    }

    public void m3075c(int i) {
        synchronized (this.f1762g) {
            m3064d();
            C0594a c0594a = (C0594a) this.f1763h.get(i);
            C0594a c0594a2 = (C0594a) this.f1763h.get(0);
            m3062a(new C0596c(new ComponentName(c0594a.f1749a.activityInfo.packageName, c0594a.f1749a.activityInfo.name), System.currentTimeMillis(), c0594a2 != null ? (c0594a2.f1750b - c0594a.f1750b) + 5.0f : 1.0f));
        }
    }
}
