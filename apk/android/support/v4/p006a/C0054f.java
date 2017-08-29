package android.support.v4.p006a;

import android.os.Build.VERSION;
import android.support.v4.p006a.C0089v.C0047b;
import android.support.v4.p006a.C0089v.C0088a;
import android.support.v4.p012f.C0161a;
import android.support.v4.p012f.C0164d;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: android.support.v4.a.f */
final class C0054f extends C0053u implements Runnable {
    static final boolean f167a;
    final C0078q f168b;
    C0051a f169c;
    C0051a f170d;
    int f171e;
    int f172f;
    int f173g;
    int f174h;
    int f175i;
    int f176j;
    int f177k;
    boolean f178l;
    boolean f179m;
    String f180n;
    boolean f181o;
    int f182p;
    int f183q;
    CharSequence f184r;
    int f185s;
    CharSequence f186t;
    ArrayList<String> f187u;
    ArrayList<String> f188v;

    /* renamed from: android.support.v4.a.f.1 */
    class C00481 implements C0047b {
        final /* synthetic */ C0063k f136a;
        final /* synthetic */ C0054f f137b;

        C00481(C0054f c0054f, C0063k c0063k) {
            this.f137b = c0054f;
            this.f136a = c0063k;
        }

        public View m99a() {
            return this.f136a.m191g();
        }
    }

    /* renamed from: android.support.v4.a.f.2 */
    class C00492 implements OnPreDrawListener {
        final /* synthetic */ View f138a;
        final /* synthetic */ Object f139b;
        final /* synthetic */ ArrayList f140c;
        final /* synthetic */ C0052b f141d;
        final /* synthetic */ Object f142e;
        final /* synthetic */ Object f143f;
        final /* synthetic */ boolean f144g;
        final /* synthetic */ C0063k f145h;
        final /* synthetic */ C0063k f146i;
        final /* synthetic */ C0054f f147j;

        C00492(C0054f c0054f, View view, Object obj, ArrayList arrayList, C0052b c0052b, Object obj2, Object obj3, boolean z, C0063k c0063k, C0063k c0063k2) {
            this.f147j = c0054f;
            this.f138a = view;
            this.f139b = obj;
            this.f140c = arrayList;
            this.f141d = c0052b;
            this.f142e = obj2;
            this.f143f = obj3;
            this.f144g = z;
            this.f145h = c0063k;
            this.f146i = c0063k2;
        }

        public boolean onPreDraw() {
            this.f138a.getViewTreeObserver().removeOnPreDrawListener(this);
            C0089v.m381a(this.f139b, this.f140c);
            this.f140c.remove(this.f141d.f165d);
            C0089v.m380a(this.f142e, this.f143f, this.f139b, this.f140c, false);
            this.f140c.clear();
            C0161a a = this.f147j.m119a(this.f141d, this.f144g, this.f145h);
            C0089v.m377a(this.f139b, this.f141d.f165d, (Map) a, this.f140c);
            this.f147j.m125a(a, this.f141d);
            this.f147j.m124a(this.f141d, this.f145h, this.f146i, this.f144g, a);
            C0089v.m380a(this.f142e, this.f143f, this.f139b, this.f140c, true);
            return true;
        }
    }

    /* renamed from: android.support.v4.a.f.3 */
    class C00503 implements OnPreDrawListener {
        final /* synthetic */ View f148a;
        final /* synthetic */ C0052b f149b;
        final /* synthetic */ int f150c;
        final /* synthetic */ Object f151d;
        final /* synthetic */ C0054f f152e;

        C00503(C0054f c0054f, View view, C0052b c0052b, int i, Object obj) {
            this.f152e = c0054f;
            this.f148a = view;
            this.f149b = c0052b;
            this.f150c = i;
            this.f151d = obj;
        }

        public boolean onPreDraw() {
            this.f148a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f152e.m123a(this.f149b, this.f150c, this.f151d);
            return true;
        }
    }

    /* renamed from: android.support.v4.a.f.a */
    static final class C0051a {
        C0051a f153a;
        C0051a f154b;
        int f155c;
        C0063k f156d;
        int f157e;
        int f158f;
        int f159g;
        int f160h;
        ArrayList<C0063k> f161i;

        C0051a() {
        }
    }

    /* renamed from: android.support.v4.a.f.b */
    public class C0052b {
        public C0161a<String, String> f162a;
        public ArrayList<View> f163b;
        public C0088a f164c;
        public View f165d;
        final /* synthetic */ C0054f f166e;

        public C0052b(C0054f c0054f) {
            this.f166e = c0054f;
            this.f162a = new C0161a();
            this.f163b = new ArrayList();
            this.f164c = new C0088a();
        }
    }

    static {
        f167a = VERSION.SDK_INT >= 21;
    }

    public C0054f(C0078q c0078q) {
        this.f179m = true;
        this.f182p = -1;
        this.f168b = c0078q;
    }

    private C0052b m100a(SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2, boolean z) {
        int i = 0;
        C0052b c0052b = new C0052b(this);
        c0052b.f165d = new View(this.f168b.f308o.m230g());
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            int i4 = m112a(sparseArray.keyAt(i2), c0052b, z, (SparseArray) sparseArray, (SparseArray) sparseArray2) ? 1 : i3;
            i2++;
            i3 = i4;
        }
        while (i < sparseArray2.size()) {
            i4 = sparseArray2.keyAt(i);
            if (sparseArray.get(i4) == null && m112a(i4, c0052b, z, (SparseArray) sparseArray, (SparseArray) sparseArray2)) {
                i3 = 1;
            }
            i++;
        }
        return i3 == 0 ? null : c0052b;
    }

    private C0161a<String, View> m101a(C0052b c0052b, C0063k c0063k, boolean z) {
        C0161a c0161a = new C0161a();
        if (this.f187u != null) {
            C0089v.m384a((Map) c0161a, c0063k.m191g());
            if (z) {
                c0161a.m643a(this.f188v);
            } else {
                c0161a = C0054f.m102a(this.f187u, this.f188v, c0161a);
            }
        }
        if (z) {
            if (c0063k.f228Y != null) {
                c0063k.f228Y.m79a(this.f188v, c0161a);
            }
            m106a(c0052b, c0161a, false);
        } else {
            if (c0063k.f229Z != null) {
                c0063k.f229Z.m79a(this.f188v, c0161a);
            }
            m115b(c0052b, c0161a, false);
        }
        return c0161a;
    }

    private static C0161a<String, View> m102a(ArrayList<String> arrayList, ArrayList<String> arrayList2, C0161a<String, View> c0161a) {
        if (c0161a.isEmpty()) {
            return c0161a;
        }
        C0161a<String, View> c0161a2 = new C0161a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) c0161a.get(arrayList.get(i));
            if (view != null) {
                c0161a2.put(arrayList2.get(i), view);
            }
        }
        return c0161a2;
    }

    private static Object m103a(C0063k c0063k, C0063k c0063k2, boolean z) {
        if (c0063k == null || c0063k2 == null) {
            return null;
        }
        return C0089v.m389b(z ? c0063k2.m210v() : c0063k.m209u());
    }

    private static Object m104a(C0063k c0063k, boolean z) {
        if (c0063k == null) {
            return null;
        }
        return C0089v.m368a(z ? c0063k.m208t() : c0063k.m205q());
    }

    private static Object m105a(Object obj, C0063k c0063k, ArrayList<View> arrayList, C0161a<String, View> c0161a, View view) {
        return obj != null ? C0089v.m369a(obj, c0063k.m191g(), (ArrayList) arrayList, (Map) c0161a, view) : obj;
    }

    private void m106a(C0052b c0052b, C0161a<String, View> c0161a, boolean z) {
        int size = this.f188v == null ? 0 : this.f188v.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f187u.get(i);
            View view = (View) c0161a.get((String) this.f188v.get(i));
            if (view != null) {
                String a = C0089v.m371a(view);
                if (z) {
                    C0054f.m109a(c0052b.f162a, str, a);
                } else {
                    C0054f.m109a(c0052b.f162a, a, str);
                }
            }
        }
    }

    private void m107a(C0052b c0052b, View view, Object obj, C0063k c0063k, C0063k c0063k2, boolean z, ArrayList<View> arrayList, Object obj2, Object obj3) {
        if (obj != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new C00492(this, view, obj, arrayList, c0052b, obj2, obj3, z, c0063k, c0063k2));
        }
    }

    private static void m108a(C0052b c0052b, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0054f.m109a(c0052b.f162a, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    private static void m109a(C0161a<String, String> c0161a, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < c0161a.size(); i++) {
                if (str.equals(c0161a.m640c(i))) {
                    c0161a.m636a(i, (Object) str2);
                    return;
                }
            }
            c0161a.put(str, str2);
        }
    }

    private static void m110a(SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2, C0063k c0063k) {
        if (c0063k != null) {
            int i = c0063k.f253y;
            if (i != 0 && !c0063k.m190f()) {
                if (c0063k.m188e() && c0063k.m191g() != null && sparseArray.get(i) == null) {
                    sparseArray.put(i, c0063k);
                }
                if (sparseArray2.get(i) == c0063k) {
                    sparseArray2.remove(i);
                }
            }
        }
    }

    private void m111a(View view, C0052b c0052b, int i, Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new C00503(this, view, c0052b, i, obj));
    }

    private boolean m112a(int i, C0052b c0052b, boolean z, SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2) {
        View view = (ViewGroup) this.f168b.f309p.m134a(i);
        if (view == null) {
            return false;
        }
        Object obj;
        ArrayList arrayList;
        Object a;
        View view2;
        C0047b c00481;
        ArrayList arrayList2;
        Map c0161a;
        boolean z2;
        Object a2;
        C0063k c0063k = (C0063k) sparseArray2.get(i);
        C0063k c0063k2 = (C0063k) sparseArray.get(i);
        Object a3 = C0054f.m104a(c0063k, z);
        Object a4 = C0054f.m103a(c0063k, c0063k2, z);
        Object b = C0054f.m114b(c0063k2, z);
        Map map = null;
        ArrayList arrayList3 = new ArrayList();
        if (a4 != null) {
            map = m101a(c0052b, c0063k2, z);
            if (map.isEmpty()) {
                map = null;
                obj = null;
                if (a3 != null && obj == null && b == null) {
                    return false;
                }
                arrayList = new ArrayList();
                a = C0054f.m105a(b, c0063k2, arrayList, (C0161a) map, c0052b.f165d);
                if (!(this.f188v == null || map == null)) {
                    view2 = (View) map.get(this.f188v.get(0));
                    if (view2 != null) {
                        if (a != null) {
                            C0089v.m376a(a, view2);
                        }
                        if (obj != null) {
                            C0089v.m376a(obj, view2);
                        }
                    }
                }
                c00481 = new C00481(this, c0063k);
                arrayList2 = new ArrayList();
                c0161a = new C0161a();
                z2 = true;
                if (c0063k != null) {
                    z2 = z ? c0063k.m212x() : c0063k.m211w();
                }
                a2 = C0089v.m370a(a3, a, obj, z2);
                if (a2 != null) {
                    C0089v.m379a(a3, obj, a, view, c00481, c0052b.f165d, c0052b.f164c, c0052b.f162a, arrayList2, arrayList, map, c0161a, arrayList3);
                    m111a(view, c0052b, i, a2);
                    C0089v.m378a(a2, c0052b.f165d, true);
                    m123a(c0052b, i, a2);
                    C0089v.m375a((ViewGroup) view, a2);
                    C0089v.m374a(view, c0052b.f165d, a3, arrayList2, a, arrayList, obj, arrayList3, a2, c0052b.f163b, c0161a);
                }
                return a2 == null;
            } else {
                ab abVar = z ? c0063k2.f228Y : c0063k.f228Y;
                if (abVar != null) {
                    abVar.m78a(new ArrayList(map.keySet()), new ArrayList(map.values()), null);
                }
                m107a(c0052b, view, a4, c0063k, c0063k2, z, arrayList3, a3, b);
            }
        }
        obj = a4;
        if (a3 != null) {
        }
        arrayList = new ArrayList();
        a = C0054f.m105a(b, c0063k2, arrayList, (C0161a) map, c0052b.f165d);
        view2 = (View) map.get(this.f188v.get(0));
        if (view2 != null) {
            if (a != null) {
                C0089v.m376a(a, view2);
            }
            if (obj != null) {
                C0089v.m376a(obj, view2);
            }
        }
        c00481 = new C00481(this, c0063k);
        arrayList2 = new ArrayList();
        c0161a = new C0161a();
        z2 = true;
        if (c0063k != null) {
            if (z) {
            }
        }
        a2 = C0089v.m370a(a3, a, obj, z2);
        if (a2 != null) {
            C0089v.m379a(a3, obj, a, view, c00481, c0052b.f165d, c0052b.f164c, c0052b.f162a, arrayList2, arrayList, map, c0161a, arrayList3);
            m111a(view, c0052b, i, a2);
            C0089v.m378a(a2, c0052b.f165d, true);
            m123a(c0052b, i, a2);
            C0089v.m375a((ViewGroup) view, a2);
            C0089v.m374a(view, c0052b.f165d, a3, arrayList2, a, arrayList, obj, arrayList3, a2, c0052b.f163b, c0161a);
        }
        if (a2 == null) {
        }
    }

    private C0161a<String, View> m113b(C0052b c0052b, C0063k c0063k, boolean z) {
        C0161a c0161a = new C0161a();
        View g = c0063k.m191g();
        if (g == null || this.f187u == null) {
            return c0161a;
        }
        C0089v.m384a((Map) c0161a, g);
        if (z) {
            return C0054f.m102a(this.f187u, this.f188v, c0161a);
        }
        c0161a.m643a(this.f188v);
        return c0161a;
    }

    private static Object m114b(C0063k c0063k, boolean z) {
        if (c0063k == null) {
            return null;
        }
        return C0089v.m368a(z ? c0063k.m206r() : c0063k.m207s());
    }

    private void m115b(C0052b c0052b, C0161a<String, View> c0161a, boolean z) {
        int size = c0161a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c0161a.m639b(i);
            String a = C0089v.m371a((View) c0161a.m640c(i));
            if (z) {
                C0054f.m109a(c0052b.f162a, str, a);
            } else {
                C0054f.m109a(c0052b.f162a, a, str);
            }
        }
    }

    private void m116b(SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2) {
        if (this.f168b.f309p.m135a()) {
            for (C0051a c0051a = this.f169c; c0051a != null; c0051a = c0051a.f153a) {
                switch (c0051a.f155c) {
                    case C0474j.View_android_focusable /*1*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_paddingStart /*2*/:
                        C0063k c0063k = c0051a.f156d;
                        if (this.f168b.f300g != null) {
                            C0063k c0063k2 = c0063k;
                            for (int i = 0; i < this.f168b.f300g.size(); i++) {
                                C0063k c0063k3 = (C0063k) this.f168b.f300g.get(i);
                                if (c0063k2 == null || c0063k3.f253y == c0063k2.f253y) {
                                    if (c0063k3 == c0063k2) {
                                        c0063k2 = null;
                                        sparseArray2.remove(c0063k3.f253y);
                                    } else {
                                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0063k3);
                                    }
                                }
                            }
                        }
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_paddingEnd /*3*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_theme /*4*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetStart /*5*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetEnd /*6*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetLeft /*7*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void m117b(SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2, C0063k c0063k) {
        if (c0063k != null) {
            int i = c0063k.f253y;
            if (i != 0) {
                if (!c0063k.m188e()) {
                    sparseArray2.put(i, c0063k);
                }
                if (sparseArray.get(i) == c0063k) {
                    sparseArray.remove(i);
                }
            }
            if (c0063k.f230b < 1 && this.f168b.f307n >= 1) {
                this.f168b.m337c(c0063k);
                this.f168b.m316a(c0063k, 1, 0, 0, false);
            }
        }
    }

    public C0052b m118a(boolean z, C0052b c0052b, SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2) {
        if (C0078q.f293a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m127a("  ", null, new PrintWriter(new C0164d("FragmentManager")), null);
        }
        if (f167a && this.f168b.f307n >= 1) {
            if (c0052b == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    c0052b = m100a((SparseArray) sparseArray, (SparseArray) sparseArray2, true);
                }
            } else if (!z) {
                C0054f.m108a(c0052b, this.f188v, this.f187u);
            }
        }
        m121a(-1);
        int i = c0052b != null ? 0 : this.f177k;
        int i2 = c0052b != null ? 0 : this.f176j;
        C0051a c0051a = this.f170d;
        while (c0051a != null) {
            int i3 = c0052b != null ? 0 : c0051a.f159g;
            int i4 = c0052b != null ? 0 : c0051a.f160h;
            C0063k c0063k;
            C0063k c0063k2;
            switch (c0051a.f155c) {
                case C0474j.View_android_focusable /*1*/:
                    c0063k = c0051a.f156d;
                    c0063k.f211H = i4;
                    this.f168b.m315a(c0063k, C0078q.m301d(i2), i);
                    break;
                case C0474j.View_paddingStart /*2*/:
                    c0063k = c0051a.f156d;
                    if (c0063k != null) {
                        c0063k.f211H = i4;
                        this.f168b.m315a(c0063k, C0078q.m301d(i2), i);
                    }
                    if (c0051a.f161i == null) {
                        break;
                    }
                    for (int i5 = 0; i5 < c0051a.f161i.size(); i5++) {
                        c0063k2 = (C0063k) c0051a.f161i.get(i5);
                        c0063k2.f211H = i3;
                        this.f168b.m317a(c0063k2, false);
                    }
                    break;
                case C0474j.View_paddingEnd /*3*/:
                    c0063k2 = c0051a.f156d;
                    c0063k2.f211H = i3;
                    this.f168b.m317a(c0063k2, false);
                    break;
                case C0474j.View_theme /*4*/:
                    c0063k2 = c0051a.f156d;
                    c0063k2.f211H = i3;
                    this.f168b.m338c(c0063k2, C0078q.m301d(i2), i);
                    break;
                case C0474j.Toolbar_contentInsetStart /*5*/:
                    c0063k = c0051a.f156d;
                    c0063k.f211H = i4;
                    this.f168b.m330b(c0063k, C0078q.m301d(i2), i);
                    break;
                case C0474j.Toolbar_contentInsetEnd /*6*/:
                    c0063k2 = c0051a.f156d;
                    c0063k2.f211H = i3;
                    this.f168b.m344e(c0063k2, C0078q.m301d(i2), i);
                    break;
                case C0474j.Toolbar_contentInsetLeft /*7*/:
                    c0063k2 = c0051a.f156d;
                    c0063k2.f211H = i3;
                    this.f168b.m340d(c0063k2, C0078q.m301d(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0051a.f155c);
            }
            c0051a = c0051a.f154b;
        }
        if (z) {
            this.f168b.m307a(this.f168b.f307n, C0078q.m301d(i2), i, true);
            c0052b = null;
        }
        if (this.f182p >= 0) {
            this.f168b.m336c(this.f182p);
            this.f182p = -1;
        }
        return c0052b;
    }

    C0161a<String, View> m119a(C0052b c0052b, boolean z, C0063k c0063k) {
        C0161a b = m113b(c0052b, c0063k, z);
        if (z) {
            if (c0063k.f229Z != null) {
                c0063k.f229Z.m79a(this.f188v, b);
            }
            m106a(c0052b, b, true);
        } else {
            if (c0063k.f228Y != null) {
                c0063k.f228Y.m79a(this.f188v, b);
            }
            m115b(c0052b, b, true);
        }
        return b;
    }

    public String m120a() {
        return this.f180n;
    }

    void m121a(int i) {
        if (this.f178l) {
            if (C0078q.f293a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0051a c0051a = this.f169c; c0051a != null; c0051a = c0051a.f153a) {
                C0063k c0063k;
                if (c0051a.f156d != null) {
                    c0063k = c0051a.f156d;
                    c0063k.f246r += i;
                    if (C0078q.f293a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0051a.f156d + " to " + c0051a.f156d.f246r);
                    }
                }
                if (c0051a.f161i != null) {
                    for (int size = c0051a.f161i.size() - 1; size >= 0; size--) {
                        c0063k = (C0063k) c0051a.f161i.get(size);
                        c0063k.f246r += i;
                        if (C0078q.f293a) {
                            Log.v("FragmentManager", "Bump nesting of " + c0063k + " to " + c0063k.f246r);
                        }
                    }
                }
            }
        }
    }

    void m122a(C0051a c0051a) {
        if (this.f169c == null) {
            this.f170d = c0051a;
            this.f169c = c0051a;
        } else {
            c0051a.f154b = this.f170d;
            this.f170d.f153a = c0051a;
            this.f170d = c0051a;
        }
        c0051a.f157e = this.f172f;
        c0051a.f158f = this.f173g;
        c0051a.f159g = this.f174h;
        c0051a.f160h = this.f175i;
        this.f171e++;
    }

    void m123a(C0052b c0052b, int i, Object obj) {
        if (this.f168b.f300g != null) {
            for (int i2 = 0; i2 < this.f168b.f300g.size(); i2++) {
                C0063k c0063k = (C0063k) this.f168b.f300g.get(i2);
                if (!(c0063k.f213J == null || c0063k.f212I == null || c0063k.f253y != i)) {
                    if (!c0063k.f204A) {
                        C0089v.m378a(obj, c0063k.f213J, false);
                        c0052b.f163b.remove(c0063k.f213J);
                    } else if (!c0052b.f163b.contains(c0063k.f213J)) {
                        C0089v.m378a(obj, c0063k.f213J, true);
                        c0052b.f163b.add(c0063k.f213J);
                    }
                }
            }
        }
    }

    void m124a(C0052b c0052b, C0063k c0063k, C0063k c0063k2, boolean z, C0161a<String, View> c0161a) {
        ab abVar = z ? c0063k2.f228Y : c0063k.f228Y;
        if (abVar != null) {
            abVar.m80b(new ArrayList(c0161a.keySet()), new ArrayList(c0161a.values()), null);
        }
    }

    void m125a(C0161a<String, View> c0161a, C0052b c0052b) {
        if (this.f188v != null && !c0161a.isEmpty()) {
            View view = (View) c0161a.get(this.f188v.get(0));
            if (view != null) {
                c0052b.f164c.f358a = view;
            }
        }
    }

    public void m126a(SparseArray<C0063k> sparseArray, SparseArray<C0063k> sparseArray2) {
        if (this.f168b.f309p.m135a()) {
            for (C0051a c0051a = this.f170d; c0051a != null; c0051a = c0051a.f154b) {
                switch (c0051a.f155c) {
                    case C0474j.View_android_focusable /*1*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_paddingStart /*2*/:
                        if (c0051a.f161i != null) {
                            for (int size = c0051a.f161i.size() - 1; size >= 0; size--) {
                                m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, (C0063k) c0051a.f161i.get(size));
                            }
                        }
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_paddingEnd /*3*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.View_theme /*4*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetStart /*5*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetEnd /*6*/:
                        m117b((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    case C0474j.Toolbar_contentInsetLeft /*7*/:
                        C0054f.m110a((SparseArray) sparseArray, (SparseArray) sparseArray2, c0051a.f156d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void m127a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m128a(str, printWriter, true);
    }

    public void m128a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f180n);
            printWriter.print(" mIndex=");
            printWriter.print(this.f182p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f181o);
            if (this.f176j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f176j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f177k));
            }
            if (!(this.f172f == 0 && this.f173g == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f172f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f173g));
            }
            if (!(this.f174h == 0 && this.f175i == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f174h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f175i));
            }
            if (!(this.f183q == 0 && this.f184r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f183q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f184r);
            }
            if (!(this.f185s == 0 && this.f186t == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f185s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f186t);
            }
        }
        if (this.f169c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            C0051a c0051a = this.f169c;
            while (c0051a != null) {
                String str3;
                switch (c0051a.f155c) {
                    case C0474j.View_android_theme /*0*/:
                        str3 = "NULL";
                        break;
                    case C0474j.View_android_focusable /*1*/:
                        str3 = "ADD";
                        break;
                    case C0474j.View_paddingStart /*2*/:
                        str3 = "REPLACE";
                        break;
                    case C0474j.View_paddingEnd /*3*/:
                        str3 = "REMOVE";
                        break;
                    case C0474j.View_theme /*4*/:
                        str3 = "HIDE";
                        break;
                    case C0474j.Toolbar_contentInsetStart /*5*/:
                        str3 = "SHOW";
                        break;
                    case C0474j.Toolbar_contentInsetEnd /*6*/:
                        str3 = "DETACH";
                        break;
                    case C0474j.Toolbar_contentInsetLeft /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + c0051a.f155c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(c0051a.f156d);
                if (z) {
                    if (!(c0051a.f157e == 0 && c0051a.f158f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0051a.f157e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0051a.f158f));
                    }
                    if (!(c0051a.f159g == 0 && c0051a.f160h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0051a.f159g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0051a.f160h));
                    }
                }
                if (c0051a.f161i != null && c0051a.f161i.size() > 0) {
                    for (int i2 = 0; i2 < c0051a.f161i.size(); i2++) {
                        printWriter.print(str2);
                        if (c0051a.f161i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0051a.f161i.get(i2));
                    }
                }
                c0051a = c0051a.f153a;
                i++;
            }
        }
    }

    public void run() {
        if (C0078q.f293a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.f178l || this.f182p >= 0) {
            C0052b c0052b;
            m121a(1);
            if (!f167a || this.f168b.f307n < 1) {
                c0052b = null;
            } else {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                m116b(sparseArray, sparseArray2);
                c0052b = m100a(sparseArray, sparseArray2, false);
            }
            int i = c0052b != null ? 0 : this.f177k;
            int i2 = c0052b != null ? 0 : this.f176j;
            C0051a c0051a = this.f169c;
            while (c0051a != null) {
                int i3 = c0052b != null ? 0 : c0051a.f157e;
                int i4 = c0052b != null ? 0 : c0051a.f158f;
                C0063k c0063k;
                switch (c0051a.f155c) {
                    case C0474j.View_android_focusable /*1*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i3;
                        this.f168b.m317a(c0063k, false);
                        break;
                    case C0474j.View_paddingStart /*2*/:
                        C0063k c0063k2 = c0051a.f156d;
                        int i5 = c0063k2.f253y;
                        if (this.f168b.f300g != null) {
                            int size = this.f168b.f300g.size() - 1;
                            while (size >= 0) {
                                c0063k = (C0063k) this.f168b.f300g.get(size);
                                if (C0078q.f293a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + c0063k2 + " old=" + c0063k);
                                }
                                if (c0063k.f253y == i5) {
                                    if (c0063k == c0063k2) {
                                        c0063k = null;
                                        c0051a.f156d = null;
                                        size--;
                                        c0063k2 = c0063k;
                                    } else {
                                        if (c0051a.f161i == null) {
                                            c0051a.f161i = new ArrayList();
                                        }
                                        c0051a.f161i.add(c0063k);
                                        c0063k.f211H = i4;
                                        if (this.f178l) {
                                            c0063k.f246r++;
                                            if (C0078q.f293a) {
                                                Log.v("FragmentManager", "Bump nesting of " + c0063k + " to " + c0063k.f246r);
                                            }
                                        }
                                        this.f168b.m315a(c0063k, i2, i);
                                    }
                                }
                                c0063k = c0063k2;
                                size--;
                                c0063k2 = c0063k;
                            }
                        }
                        if (c0063k2 == null) {
                            break;
                        }
                        c0063k2.f211H = i3;
                        this.f168b.m317a(c0063k2, false);
                        break;
                    case C0474j.View_paddingEnd /*3*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i4;
                        this.f168b.m315a(c0063k, i2, i);
                        break;
                    case C0474j.View_theme /*4*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i4;
                        this.f168b.m330b(c0063k, i2, i);
                        break;
                    case C0474j.Toolbar_contentInsetStart /*5*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i3;
                        this.f168b.m338c(c0063k, i2, i);
                        break;
                    case C0474j.Toolbar_contentInsetEnd /*6*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i4;
                        this.f168b.m340d(c0063k, i2, i);
                        break;
                    case C0474j.Toolbar_contentInsetLeft /*7*/:
                        c0063k = c0051a.f156d;
                        c0063k.f211H = i3;
                        this.f168b.m344e(c0063k, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0051a.f155c);
                }
                c0051a = c0051a.f153a;
            }
            this.f168b.m307a(this.f168b.f307n, i2, i, true);
            if (this.f178l) {
                this.f168b.m313a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f182p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f182p);
        }
        if (this.f180n != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f180n);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
