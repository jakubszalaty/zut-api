package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.p005b.C0035a;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0317q;
import android.support.v4.p009d.p010a.C0147a;
import android.support.v7.p015b.C0475a.C0466b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0515h implements C0147a {
    private static final int[] f1213d;
    CharSequence f1214a;
    Drawable f1215b;
    View f1216c;
    private final Context f1217e;
    private final Resources f1218f;
    private boolean f1219g;
    private boolean f1220h;
    private C0425a f1221i;
    private ArrayList<C0518j> f1222j;
    private ArrayList<C0518j> f1223k;
    private boolean f1224l;
    private ArrayList<C0518j> f1225m;
    private ArrayList<C0518j> f1226n;
    private boolean f1227o;
    private int f1228p;
    private ContextMenuInfo f1229q;
    private boolean f1230r;
    private boolean f1231s;
    private boolean f1232t;
    private boolean f1233u;
    private ArrayList<C0518j> f1234v;
    private CopyOnWriteArrayList<WeakReference<C0501o>> f1235w;
    private C0518j f1236x;
    private boolean f1237y;

    /* renamed from: android.support.v7.view.menu.h.a */
    public interface C0425a {
        void m2010a(C0515h c0515h);

        boolean m2011a(C0515h c0515h, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h.b */
    public interface C0498b {
        boolean m2338a(C0518j c0518j);
    }

    static {
        f1213d = new int[]{1, 4, 5, 3, 2, 0};
    }

    public C0515h(Context context) {
        this.f1228p = 0;
        this.f1230r = false;
        this.f1231s = false;
        this.f1232t = false;
        this.f1233u = false;
        this.f1234v = new ArrayList();
        this.f1235w = new CopyOnWriteArrayList();
        this.f1217e = context;
        this.f1218f = context.getResources();
        this.f1222j = new ArrayList();
        this.f1223k = new ArrayList();
        this.f1224l = true;
        this.f1225m = new ArrayList();
        this.f1226n = new ArrayList();
        this.f1227o = true;
        m2457e(true);
    }

    private static int m2451a(ArrayList<C0518j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0518j) arrayList.get(size)).m2523c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private C0518j m2452a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0518j(this, i, i2, i3, i4, charSequence, i5);
    }

    private void m2453a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = m2488d();
        if (view != null) {
            this.f1216c = view;
            this.f1214a = null;
            this.f1215b = null;
        } else {
            if (i > 0) {
                this.f1214a = d.getText(i);
            } else if (charSequence != null) {
                this.f1214a = charSequence;
            }
            if (i2 > 0) {
                this.f1215b = C0035a.m73a(m2491e(), i2);
            } else if (drawable != null) {
                this.f1215b = drawable;
            }
            this.f1216c = null;
        }
        m2482b(false);
    }

    private void m2454a(int i, boolean z) {
        if (i >= 0 && i < this.f1222j.size()) {
            this.f1222j.remove(i);
            if (z) {
                m2482b(true);
            }
        }
    }

    private boolean m2455a(C0532u c0532u, C0501o c0501o) {
        boolean z = false;
        if (this.f1235w.isEmpty()) {
            return false;
        }
        if (c0501o != null) {
            z = c0501o.m2358a(c0532u);
        }
        Iterator it = this.f1235w.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0501o c0501o2 = (C0501o) weakReference.get();
            if (c0501o2 == null) {
                this.f1235w.remove(weakReference);
                z = z2;
            } else {
                z = !z2 ? c0501o2.m2358a(c0532u) : z2;
            }
            z2 = z;
        }
        return z2;
    }

    private void m2456d(boolean z) {
        if (!this.f1235w.isEmpty()) {
            m2494g();
            Iterator it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0501o c0501o = (C0501o) weakReference.get();
                if (c0501o == null) {
                    this.f1235w.remove(weakReference);
                } else {
                    c0501o.m2359b(z);
                }
            }
            m2495h();
        }
    }

    private void m2457e(boolean z) {
        boolean z2 = true;
        if (!(z && this.f1218f.getConfiguration().keyboard != 1 && this.f1218f.getBoolean(C0466b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {
            z2 = false;
        }
        this.f1220h = z2;
    }

    private static int m2458f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f1213d.length) {
            return (f1213d[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public int m2459a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (((C0518j) this.f1222j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public C0515h m2460a(int i) {
        this.f1228p = i;
        return this;
    }

    protected C0515h m2461a(Drawable drawable) {
        m2453a(0, null, 0, drawable, null);
        return this;
    }

    protected C0515h m2462a(View view) {
        m2453a(0, null, 0, null, view);
        return this;
    }

    protected C0515h m2463a(CharSequence charSequence) {
        m2453a(0, charSequence, 0, null, null);
        return this;
    }

    C0518j m2464a(int i, KeyEvent keyEvent) {
        List list = this.f1234v;
        list.clear();
        m2473a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0518j) list.get(0);
        }
        boolean b = m2483b();
        for (int i2 = 0; i2 < size; i2++) {
            C0518j c0518j = (C0518j) list.get(i2);
            char alphabeticShortcut = b ? c0518j.getAlphabeticShortcut() : c0518j.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0518j;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0518j;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return c0518j;
            }
        }
        return null;
    }

    protected MenuItem m2465a(int i, int i2, int i3, CharSequence charSequence) {
        int f = C0515h.m2458f(i3);
        MenuItem a = m2452a(i, i2, i3, f, charSequence, this.f1228p);
        if (this.f1229q != null) {
            a.m2518a(this.f1229q);
        }
        this.f1222j.add(C0515h.m2451a(this.f1222j, f), a);
        m2482b(true);
        return a;
    }

    protected String m2466a() {
        return "android:menu:actionviewstates";
    }

    public void m2467a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = C0317q.m1520a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (C0317q.m1524c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((C0532u) item.getSubMenu()).m2467a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m2466a(), sparseArray);
        }
    }

    public void m2468a(C0425a c0425a) {
        this.f1221i = c0425a;
    }

    void m2469a(C0518j c0518j) {
        this.f1224l = true;
        m2482b(true);
    }

    public void m2470a(C0501o c0501o) {
        m2471a(c0501o, this.f1217e);
    }

    public void m2471a(C0501o c0501o, Context context) {
        this.f1235w.add(new WeakReference(c0501o));
        c0501o.m2354a(context, this);
        this.f1227o = true;
    }

    void m2472a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1222j.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (C0518j) this.f1222j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.m2530g() && menuItem2.isCheckable()) {
                menuItem2.m2521b(menuItem2 == menuItem);
            }
        }
    }

    void m2473a(List<C0518j> list, int i, KeyEvent keyEvent) {
        boolean b = m2483b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1222j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0518j c0518j = (C0518j) this.f1222j.get(i2);
                if (c0518j.hasSubMenu()) {
                    ((C0515h) c0518j.getSubMenu()).m2473a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c0518j.getAlphabeticShortcut() : c0518j.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && c0518j.isEnabled())) {
                    list.add(c0518j);
                }
            }
        }
    }

    public final void m2474a(boolean z) {
        if (!this.f1233u) {
            this.f1233u = true;
            Iterator it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0501o c0501o = (C0501o) weakReference.get();
                if (c0501o == null) {
                    this.f1235w.remove(weakReference);
                } else {
                    c0501o.m2355a(this, z);
                }
            }
            this.f1233u = false;
        }
    }

    boolean m2475a(C0515h c0515h, MenuItem menuItem) {
        return this.f1221i != null && this.f1221i.m2011a(c0515h, menuItem);
    }

    public boolean m2476a(MenuItem menuItem, int i) {
        return m2477a(menuItem, null, i);
    }

    public boolean m2477a(MenuItem menuItem, C0501o c0501o, int i) {
        C0518j c0518j = (C0518j) menuItem;
        if (c0518j == null || !c0518j.isEnabled()) {
            return false;
        }
        boolean b = c0518j.m2522b();
        C0286e a = c0518j.m2515a();
        boolean z = a != null && a.m1461e();
        boolean expandActionView;
        if (c0518j.m2537n()) {
            expandActionView = c0518j.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m2474a(true);
            return expandActionView;
        } else if (c0518j.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m2474a(false);
            }
            if (!c0518j.hasSubMenu()) {
                c0518j.m2517a(new C0532u(m2491e(), this, c0518j));
            }
            C0532u c0532u = (C0532u) c0518j.getSubMenu();
            if (z) {
                a.m1456a((SubMenu) c0532u);
            }
            expandActionView = m2455a(c0532u, c0501o) | b;
            if (expandActionView) {
                return expandActionView;
            }
            m2474a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m2474a(true);
            }
            return b;
        }
    }

    public MenuItem add(int i) {
        return m2465a(0, 0, 0, this.f1218f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2465a(i, i2, i3, this.f1218f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2465a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m2465a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1217e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1218f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1218f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0518j c0518j = (C0518j) m2465a(i, i2, i3, charSequence);
        C0532u c0532u = new C0532u(this.f1217e, this, c0518j);
        c0518j.m2517a(c0532u);
        return c0532u;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int m2478b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0518j) this.f1222j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void m2479b(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(m2466a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = C0317q.m1520a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0532u) item.getSubMenu()).m2479b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    C0317q.m1523b(item);
                }
            }
        }
    }

    void m2480b(C0518j c0518j) {
        this.f1227o = true;
        m2482b(true);
    }

    public void m2481b(C0501o c0501o) {
        Iterator it = this.f1235w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0501o c0501o2 = (C0501o) weakReference.get();
            if (c0501o2 == null || c0501o2 == c0501o) {
                this.f1235w.remove(weakReference);
            }
        }
    }

    public void m2482b(boolean z) {
        if (this.f1230r) {
            this.f1231s = true;
            return;
        }
        if (z) {
            this.f1224l = true;
            this.f1227o = true;
        }
        m2456d(z);
    }

    boolean m2483b() {
        return this.f1219g;
    }

    public int m2484c(int i) {
        return m2459a(i, 0);
    }

    public void m2485c(boolean z) {
        this.f1237y = z;
    }

    public boolean m2486c() {
        return this.f1220h;
    }

    public boolean m2487c(C0518j c0518j) {
        boolean z = false;
        if (!this.f1235w.isEmpty()) {
            m2494g();
            Iterator it = this.f1235w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0501o c0501o = (C0501o) weakReference.get();
                if (c0501o == null) {
                    this.f1235w.remove(weakReference);
                    z = z2;
                } else {
                    z = c0501o.m2357a(this, c0518j);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m2495h();
            if (z) {
                this.f1236x = c0518j;
            }
        }
        return z;
    }

    public void clear() {
        if (this.f1236x != null) {
            m2490d(this.f1236x);
        }
        this.f1222j.clear();
        m2482b(true);
    }

    public void clearHeader() {
        this.f1215b = null;
        this.f1214a = null;
        this.f1216c = null;
        m2482b(false);
    }

    public void close() {
        m2474a(true);
    }

    Resources m2488d() {
        return this.f1218f;
    }

    protected C0515h m2489d(int i) {
        m2453a(i, null, 0, null, null);
        return this;
    }

    public boolean m2490d(C0518j c0518j) {
        boolean z = false;
        if (!this.f1235w.isEmpty() && this.f1236x == c0518j) {
            m2494g();
            Iterator it = this.f1235w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0501o c0501o = (C0501o) weakReference.get();
                if (c0501o == null) {
                    this.f1235w.remove(weakReference);
                    z = z2;
                } else {
                    z = c0501o.m2361b(this, c0518j);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m2495h();
            if (z) {
                this.f1236x = null;
            }
        }
        return z;
    }

    public Context m2491e() {
        return this.f1217e;
    }

    protected C0515h m2492e(int i) {
        m2453a(0, null, i, null, null);
        return this;
    }

    public void m2493f() {
        if (this.f1221i != null) {
            this.f1221i.m2010a(this);
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0518j c0518j = (C0518j) this.f1222j.get(i2);
            if (c0518j.getItemId() == i) {
                return c0518j;
            }
            if (c0518j.hasSubMenu()) {
                MenuItem findItem = c0518j.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public void m2494g() {
        if (!this.f1230r) {
            this.f1230r = true;
            this.f1231s = false;
        }
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f1222j.get(i);
    }

    public void m2495h() {
        this.f1230r = false;
        if (this.f1231s) {
            this.f1231s = false;
            m2482b(true);
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1237y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0518j) this.f1222j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<C0518j> m2496i() {
        if (!this.f1224l) {
            return this.f1223k;
        }
        this.f1223k.clear();
        int size = this.f1222j.size();
        for (int i = 0; i < size; i++) {
            C0518j c0518j = (C0518j) this.f1222j.get(i);
            if (c0518j.isVisible()) {
                this.f1223k.add(c0518j);
            }
        }
        this.f1224l = false;
        this.f1227o = true;
        return this.f1223k;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2464a(i, keyEvent) != null;
    }

    public void m2497j() {
        ArrayList i = m2496i();
        if (this.f1227o) {
            Iterator it = this.f1235w.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3;
                WeakReference weakReference = (WeakReference) it.next();
                C0501o c0501o = (C0501o) weakReference.get();
                if (c0501o == null) {
                    this.f1235w.remove(weakReference);
                    i3 = i2;
                } else {
                    i3 = c0501o.m2360b() | i2;
                }
                i2 = i3;
            }
            if (i2 != 0) {
                this.f1225m.clear();
                this.f1226n.clear();
                i2 = i.size();
                for (int i4 = 0; i4 < i2; i4++) {
                    C0518j c0518j = (C0518j) i.get(i4);
                    if (c0518j.m2533j()) {
                        this.f1225m.add(c0518j);
                    } else {
                        this.f1226n.add(c0518j);
                    }
                }
            } else {
                this.f1225m.clear();
                this.f1226n.clear();
                this.f1226n.addAll(m2496i());
            }
            this.f1227o = false;
        }
    }

    public ArrayList<C0518j> m2498k() {
        m2497j();
        return this.f1225m;
    }

    public ArrayList<C0518j> m2499l() {
        m2497j();
        return this.f1226n;
    }

    public CharSequence m2500m() {
        return this.f1214a;
    }

    public Drawable m2501n() {
        return this.f1215b;
    }

    public View m2502o() {
        return this.f1216c;
    }

    public C0515h m2503p() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m2476a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m2464a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m2476a(a, i2);
        }
        if ((i2 & 2) != 0) {
            m2474a(true);
        }
        return z;
    }

    boolean m2504q() {
        return this.f1232t;
    }

    public C0518j m2505r() {
        return this.f1236x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeGroup(int r6) {
        /*
        r5 = this;
        r1 = 0;
        r3 = r5.m2484c(r6);
        if (r3 < 0) goto L_0x002b;
    L_0x0007:
        r0 = r5.f1222j;
        r0 = r0.size();
        r4 = r0 - r3;
        r0 = r1;
    L_0x0010:
        r2 = r0 + 1;
        if (r0 >= r4) goto L_0x0027;
    L_0x0014:
        r0 = r5.f1222j;
        r0 = r0.get(r3);
        r0 = (android.support.v7.view.menu.C0518j) r0;
        r0 = r0.getGroupId();
        if (r0 != r6) goto L_0x0027;
    L_0x0022:
        r5.m2454a(r3, r1);
        r0 = r2;
        goto L_0x0010;
    L_0x0027:
        r0 = 1;
        r5.m2482b(r0);
    L_0x002b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.h.removeGroup(int):void");
    }

    public void removeItem(int i) {
        m2454a(m2478b(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1222j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0518j c0518j = (C0518j) this.f1222j.get(i2);
            if (c0518j.getGroupId() == i) {
                c0518j.m2519a(z2);
                c0518j.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1222j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0518j c0518j = (C0518j) this.f1222j.get(i2);
            if (c0518j.getGroupId() == i) {
                c0518j.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1222j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0518j c0518j = (C0518j) this.f1222j.get(i2);
            boolean z3 = (c0518j.getGroupId() == i && c0518j.m2524c(z)) ? true : z2;
            i2++;
            z2 = z3;
        }
        if (z2) {
            m2482b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1219g = z;
        m2482b(false);
    }

    public int size() {
        return this.f1222j.size();
    }
}
