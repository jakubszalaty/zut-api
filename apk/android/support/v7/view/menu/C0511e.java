package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p007g.C0290f;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0468d;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.view.menu.C0501o.C0442a;
import android.support.v7.widget.ak;
import android.support.v7.widget.al;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0511e extends C0510m implements C0501o, OnKeyListener, OnDismissListener {
    final Handler f1171a;
    final List<C0508a> f1172b;
    View f1173c;
    boolean f1174d;
    private final Context f1175e;
    private final int f1176f;
    private final int f1177g;
    private final int f1178h;
    private final boolean f1179i;
    private final List<C0515h> f1180j;
    private final OnGlobalLayoutListener f1181k;
    private final ak f1182l;
    private int f1183m;
    private int f1184n;
    private View f1185o;
    private int f1186p;
    private boolean f1187q;
    private boolean f1188r;
    private int f1189s;
    private int f1190t;
    private boolean f1191u;
    private boolean f1192v;
    private C0442a f1193w;
    private ViewTreeObserver f1194x;
    private OnDismissListener f1195y;

    /* renamed from: android.support.v7.view.menu.e.1 */
    class C05051 implements OnGlobalLayoutListener {
        final /* synthetic */ C0511e f1161a;

        C05051(C0511e c0511e) {
            this.f1161a = c0511e;
        }

        public void onGlobalLayout() {
            if (this.f1161a.m2432d() && this.f1161a.f1172b.size() > 0 && !((C0508a) this.f1161a.f1172b.get(0)).f1167a.m2877g()) {
                View view = this.f1161a.f1173c;
                if (view == null || !view.isShown()) {
                    this.f1161a.m2429c();
                    return;
                }
                for (C0508a c0508a : this.f1161a.f1172b) {
                    c0508a.f1167a.m2859a();
                }
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e.2 */
    class C05072 implements ak {
        final /* synthetic */ C0511e f1166a;

        /* renamed from: android.support.v7.view.menu.e.2.1 */
        class C05061 implements Runnable {
            final /* synthetic */ C0508a f1162a;
            final /* synthetic */ MenuItem f1163b;
            final /* synthetic */ C0515h f1164c;
            final /* synthetic */ C05072 f1165d;

            C05061(C05072 c05072, C0508a c0508a, MenuItem menuItem, C0515h c0515h) {
                this.f1165d = c05072;
                this.f1162a = c0508a;
                this.f1163b = menuItem;
                this.f1164c = c0515h;
            }

            public void run() {
                if (this.f1162a != null) {
                    this.f1165d.f1166a.f1174d = true;
                    this.f1162a.f1168b.m2474a(false);
                    this.f1165d.f1166a.f1174d = false;
                }
                if (this.f1163b.isEnabled() && this.f1163b.hasSubMenu()) {
                    this.f1164c.m2476a(this.f1163b, 0);
                }
            }
        }

        C05072(C0511e c0511e) {
            this.f1166a = c0511e;
        }

        public void m2386a(C0515h c0515h, MenuItem menuItem) {
            this.f1166a.f1171a.removeCallbacksAndMessages(c0515h);
        }

        public void m2387b(C0515h c0515h, MenuItem menuItem) {
            int i;
            this.f1166a.f1171a.removeCallbacksAndMessages(null);
            int size = this.f1166a.f1172b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (c0515h == ((C0508a) this.f1166a.f1172b.get(i2)).f1168b) {
                    i = i2;
                    break;
                }
            }
            i = -1;
            if (i != -1) {
                i++;
                this.f1166a.f1171a.postAtTime(new C05061(this, i < this.f1166a.f1172b.size() ? (C0508a) this.f1166a.f1172b.get(i) : null, menuItem, c0515h), c0515h, SystemClock.uptimeMillis() + 200);
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e.a */
    private static class C0508a {
        public final al f1167a;
        public final C0515h f1168b;
        public final int f1169c;

        public C0508a(al alVar, C0515h c0515h, int i) {
            this.f1167a = alVar;
            this.f1168b = c0515h;
            this.f1169c = i;
        }

        public ListView m2388a() {
            return this.f1167a.m2873e();
        }
    }

    public C0511e(Context context, View view, int i, int i2, boolean z) {
        this.f1180j = new LinkedList();
        this.f1172b = new ArrayList();
        this.f1181k = new C05051(this);
        this.f1182l = new C05072(this);
        this.f1183m = 0;
        this.f1184n = 0;
        this.f1175e = context;
        this.f1185o = view;
        this.f1177g = i;
        this.f1178h = i2;
        this.f1179i = z;
        this.f1191u = false;
        this.f1186p = m2416i();
        Resources resources = context.getResources();
        this.f1176f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0468d.abc_config_prefDialogWidth));
        this.f1171a = new Handler();
    }

    private MenuItem m2410a(C0515h c0515h, C0515h c0515h2) {
        int size = c0515h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0515h.getItem(i);
            if (item.hasSubMenu() && c0515h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View m2411a(C0508a c0508a, C0515h c0515h) {
        int i = 0;
        MenuItem a = m2410a(c0508a.f1168b, c0515h);
        if (a == null) {
            return null;
        }
        int headersCount;
        C0514g c0514g;
        int i2;
        ListView a2 = c0508a.m2388a();
        ListAdapter adapter = a2.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0514g = (C0514g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0514g = (C0514g) adapter;
            headersCount = 0;
        }
        int count = c0514g.getCount();
        while (i < count) {
            if (a == c0514g.m2448a(i)) {
                i2 = i;
                break;
            }
            i++;
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        i2 = (i2 + headersCount) - a2.getFirstVisiblePosition();
        return (i2 < 0 || i2 >= a2.getChildCount()) ? null : a2.getChildAt(i2);
    }

    private void m2412c(C0515h c0515h) {
        View a;
        C0508a c0508a;
        LayoutInflater from = LayoutInflater.from(this.f1175e);
        Object c0514g = new C0514g(c0515h, from, this.f1179i);
        if (!m2432d() && this.f1191u) {
            c0514g.m2449a(true);
        } else if (m2432d()) {
            c0514g.m2449a(C0510m.m2395b(c0515h));
        }
        int a2 = C0510m.m2393a(c0514g, null, this.f1175e, this.f1176f);
        al h = m2415h();
        h.m2864a((ListAdapter) c0514g);
        h.m2876g(a2);
        h.m2874e(this.f1184n);
        if (this.f1172b.size() > 0) {
            C0508a c0508a2 = (C0508a) this.f1172b.get(this.f1172b.size() - 1);
            a = m2411a(c0508a2, c0515h);
            c0508a = c0508a2;
        } else {
            a = null;
            c0508a = null;
        }
        if (a != null) {
            h.m2895b(false);
            h.m2892a(null);
            int d = m2413d(a2);
            boolean z = d == 1;
            this.f1186p = d;
            int[] iArr = new int[2];
            a.getLocationInWindow(iArr);
            int j = c0508a.f1167a.m2882j() + iArr[0];
            int k = iArr[1] + c0508a.f1167a.m2883k();
            int width = (this.f1184n & 5) == 5 ? z ? j + a2 : j - a.getWidth() : z ? a.getWidth() + j : j - a2;
            h.m2870c(width);
            h.m2871d(k);
        } else {
            if (this.f1187q) {
                h.m2870c(this.f1189s);
            }
            if (this.f1188r) {
                h.m2871d(this.f1190t);
            }
            h.m2861a(m2409g());
        }
        this.f1172b.add(new C0508a(h, c0515h, this.f1186p));
        h.m2859a();
        if (c0508a == null && this.f1192v && c0515h.m2500m() != null) {
            ViewGroup e = h.m2873e();
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0471g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c0515h.m2500m());
            e.addHeaderView(frameLayout, null, false);
            h.m2859a();
        }
    }

    private int m2413d(int i) {
        ListView a = ((C0508a) this.f1172b.get(this.f1172b.size() - 1)).m2388a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1173c.getWindowVisibleDisplayFrame(rect);
        if (this.f1186p != 1) {
            return iArr[0] - i < 0 ? 1 : 0;
        } else {
            return (a.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
    }

    private int m2414d(C0515h c0515h) {
        int size = this.f1172b.size();
        for (int i = 0; i < size; i++) {
            if (c0515h == ((C0508a) this.f1172b.get(i)).f1168b) {
                return i;
            }
        }
        return -1;
    }

    private al m2415h() {
        al alVar = new al(this.f1175e, null, this.f1177g, this.f1178h);
        alVar.m2891a(this.f1182l);
        alVar.m2863a((OnItemClickListener) this);
        alVar.m2865a((OnDismissListener) this);
        alVar.m2868b(this.f1185o);
        alVar.m2874e(this.f1184n);
        alVar.m2866a(true);
        return alVar;
    }

    private int m2416i() {
        return ae.m1147d(this.f1185o) == 1 ? 0 : 1;
    }

    public void m2417a() {
        if (!m2432d()) {
            for (C0515h c : this.f1180j) {
                m2412c(c);
            }
            this.f1180j.clear();
            this.f1173c = this.f1185o;
            if (this.f1173c != null) {
                Object obj = this.f1194x == null ? 1 : null;
                this.f1194x = this.f1173c.getViewTreeObserver();
                if (obj != null) {
                    this.f1194x.addOnGlobalLayoutListener(this.f1181k);
                }
            }
        }
    }

    public void m2418a(int i) {
        if (this.f1183m != i) {
            this.f1183m = i;
            this.f1184n = C0290f.m1466a(i, ae.m1147d(this.f1185o));
        }
    }

    public void m2419a(C0515h c0515h) {
        c0515h.m2471a((C0501o) this, this.f1175e);
        if (m2432d()) {
            m2412c(c0515h);
        } else {
            this.f1180j.add(c0515h);
        }
    }

    public void m2420a(C0515h c0515h, boolean z) {
        int d = m2414d(c0515h);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f1172b.size()) {
                ((C0508a) this.f1172b.get(i)).f1168b.m2474a(false);
            }
            C0508a c0508a = (C0508a) this.f1172b.remove(d);
            c0508a.f1168b.m2481b((C0501o) this);
            if (this.f1174d) {
                c0508a.f1167a.m2894b(null);
                c0508a.f1167a.m2867b(0);
            }
            c0508a.f1167a.m2869c();
            d = this.f1172b.size();
            if (d > 0) {
                this.f1186p = ((C0508a) this.f1172b.get(d - 1)).f1169c;
            } else {
                this.f1186p = m2416i();
            }
            if (d == 0) {
                m2429c();
                if (this.f1193w != null) {
                    this.f1193w.m2102a(c0515h, true);
                }
                if (this.f1194x != null) {
                    if (this.f1194x.isAlive()) {
                        this.f1194x.removeGlobalOnLayoutListener(this.f1181k);
                    }
                    this.f1194x = null;
                }
                this.f1195y.onDismiss();
            } else if (z) {
                ((C0508a) this.f1172b.get(0)).f1168b.m2474a(false);
            }
        }
    }

    public void m2421a(C0442a c0442a) {
        this.f1193w = c0442a;
    }

    public void m2422a(View view) {
        if (this.f1185o != view) {
            this.f1185o = view;
            this.f1184n = C0290f.m1466a(this.f1183m, ae.m1147d(this.f1185o));
        }
    }

    public void m2423a(OnDismissListener onDismissListener) {
        this.f1195y = onDismissListener;
    }

    public void m2424a(boolean z) {
        this.f1191u = z;
    }

    public boolean m2425a(C0532u c0532u) {
        for (C0508a c0508a : this.f1172b) {
            if (c0532u == c0508a.f1168b) {
                c0508a.m2388a().requestFocus();
                return true;
            }
        }
        if (!c0532u.hasVisibleItems()) {
            return false;
        }
        m2419a((C0515h) c0532u);
        if (this.f1193w != null) {
            this.f1193w.m2103a(c0532u);
        }
        return true;
    }

    public void m2426b(int i) {
        this.f1187q = true;
        this.f1189s = i;
    }

    public void m2427b(boolean z) {
        for (C0508a a : this.f1172b) {
            C0510m.m2394a(a.m2388a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean m2428b() {
        return false;
    }

    public void m2429c() {
        int size = this.f1172b.size();
        if (size > 0) {
            C0508a[] c0508aArr = (C0508a[]) this.f1172b.toArray(new C0508a[size]);
            for (size--; size >= 0; size--) {
                C0508a c0508a = c0508aArr[size];
                if (c0508a.f1167a.m2872d()) {
                    c0508a.f1167a.m2869c();
                }
            }
        }
    }

    public void m2430c(int i) {
        this.f1188r = true;
        this.f1190t = i;
    }

    public void m2431c(boolean z) {
        this.f1192v = z;
    }

    public boolean m2432d() {
        return this.f1172b.size() > 0 && ((C0508a) this.f1172b.get(0)).f1167a.m2872d();
    }

    public ListView m2433e() {
        return this.f1172b.isEmpty() ? null : ((C0508a) this.f1172b.get(this.f1172b.size() - 1)).m2388a();
    }

    protected boolean m2434f() {
        return false;
    }

    public void onDismiss() {
        C0508a c0508a;
        int size = this.f1172b.size();
        for (int i = 0; i < size; i++) {
            c0508a = (C0508a) this.f1172b.get(i);
            if (!c0508a.f1167a.m2872d()) {
                break;
            }
        }
        c0508a = null;
        if (c0508a != null) {
            c0508a.f1168b.m2474a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m2429c();
        return true;
    }
}
