package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0286e.C0285b;
import android.support.v4.p007g.C0317q.C0316e;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.support.v7.view.menu.C0499p.C0496a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0518j implements C0148b {
    private static String f1243w;
    private static String f1244x;
    private static String f1245y;
    private static String f1246z;
    C0515h f1247a;
    private final int f1248b;
    private final int f1249c;
    private final int f1250d;
    private final int f1251e;
    private CharSequence f1252f;
    private CharSequence f1253g;
    private Intent f1254h;
    private char f1255i;
    private char f1256j;
    private Drawable f1257k;
    private int f1258l;
    private C0532u f1259m;
    private Runnable f1260n;
    private OnMenuItemClickListener f1261o;
    private int f1262p;
    private int f1263q;
    private View f1264r;
    private C0286e f1265s;
    private C0316e f1266t;
    private boolean f1267u;
    private ContextMenuInfo f1268v;

    /* renamed from: android.support.v7.view.menu.j.1 */
    class C05171 implements C0285b {
        final /* synthetic */ C0518j f1242a;

        C05171(C0518j c0518j) {
            this.f1242a = c0518j;
        }

        public void m2510a(boolean z) {
            this.f1242a.f1247a.m2469a(this.f1242a);
        }
    }

    C0518j(C0515h c0515h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1258l = 0;
        this.f1262p = 16;
        this.f1263q = 0;
        this.f1267u = false;
        this.f1247a = c0515h;
        this.f1248b = i2;
        this.f1249c = i;
        this.f1250d = i3;
        this.f1251e = i4;
        this.f1252f = charSequence;
        this.f1263q = i5;
    }

    public C0148b m2511a(int i) {
        Context e = this.f1247a.m2491e();
        m2514a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C0148b m2512a(C0286e c0286e) {
        if (this.f1265s != null) {
            this.f1265s.m1462f();
        }
        this.f1264r = null;
        this.f1265s = c0286e;
        this.f1247a.m2482b(true);
        if (this.f1265s != null) {
            this.f1265s.m1455a(new C05171(this));
        }
        return this;
    }

    public C0148b m2513a(C0316e c0316e) {
        this.f1266t = c0316e;
        return this;
    }

    public C0148b m2514a(View view) {
        this.f1264r = view;
        this.f1265s = null;
        if (view != null && view.getId() == -1 && this.f1248b > 0) {
            view.setId(this.f1248b);
        }
        this.f1247a.m2480b(this);
        return this;
    }

    public C0286e m2515a() {
        return this.f1265s;
    }

    CharSequence m2516a(C0496a c0496a) {
        return (c0496a == null || !c0496a.m2328a()) ? getTitle() : getTitleCondensed();
    }

    public void m2517a(C0532u c0532u) {
        this.f1259m = c0532u;
        c0532u.setHeaderTitle(getTitle());
    }

    void m2518a(ContextMenuInfo contextMenuInfo) {
        this.f1268v = contextMenuInfo;
    }

    public void m2519a(boolean z) {
        this.f1262p = (z ? 4 : 0) | (this.f1262p & -5);
    }

    public C0148b m2520b(int i) {
        setShowAsAction(i);
        return this;
    }

    void m2521b(boolean z) {
        int i = this.f1262p;
        this.f1262p = (z ? 2 : 0) | (this.f1262p & -3);
        if (i != this.f1262p) {
            this.f1247a.m2482b(false);
        }
    }

    public boolean m2522b() {
        if ((this.f1261o != null && this.f1261o.onMenuItemClick(this)) || this.f1247a.m2475a(this.f1247a.m2503p(), (MenuItem) this)) {
            return true;
        }
        if (this.f1260n != null) {
            this.f1260n.run();
            return true;
        }
        if (this.f1254h != null) {
            try {
                this.f1247a.m2491e().startActivity(this.f1254h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f1265s != null && this.f1265s.m1460d();
    }

    public int m2523c() {
        return this.f1251e;
    }

    boolean m2524c(boolean z) {
        int i = this.f1262p;
        this.f1262p = (z ? 0 : 8) | (this.f1262p & -9);
        return i != this.f1262p;
    }

    public boolean collapseActionView() {
        return (this.f1263q & 8) == 0 ? false : this.f1264r == null ? true : (this.f1266t == null || this.f1266t.m1517b(this)) ? this.f1247a.m2490d(this) : false;
    }

    char m2525d() {
        return this.f1247a.m2483b() ? this.f1256j : this.f1255i;
    }

    public void m2526d(boolean z) {
        if (z) {
            this.f1262p |= 32;
        } else {
            this.f1262p &= -33;
        }
    }

    String m2527e() {
        char d = m2525d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(f1243w);
        switch (d) {
            case C0474j.Toolbar_contentInsetRight /*8*/:
                stringBuilder.append(f1245y);
                break;
            case C0474j.Toolbar_contentInsetEndWithActions /*10*/:
                stringBuilder.append(f1244x);
                break;
            case C0474j.AppCompatTheme_actionModeCutDrawable /*32*/:
                stringBuilder.append(f1246z);
                break;
            default:
                stringBuilder.append(d);
                break;
        }
        return stringBuilder.toString();
    }

    public void m2528e(boolean z) {
        this.f1267u = z;
        this.f1247a.m2482b(false);
    }

    public boolean expandActionView() {
        return !m2537n() ? false : (this.f1266t == null || this.f1266t.m1516a(this)) ? this.f1247a.m2487c(this) : false;
    }

    boolean m2529f() {
        return this.f1247a.m2486c() && m2525d() != '\u0000';
    }

    public boolean m2530g() {
        return (this.f1262p & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f1264r != null) {
            return this.f1264r;
        }
        if (this.f1265s == null) {
            return null;
        }
        this.f1264r = this.f1265s.m1453a((MenuItem) this);
        return this.f1264r;
    }

    public char getAlphabeticShortcut() {
        return this.f1256j;
    }

    public int getGroupId() {
        return this.f1249c;
    }

    public Drawable getIcon() {
        if (this.f1257k != null) {
            return this.f1257k;
        }
        if (this.f1258l == 0) {
            return null;
        }
        Drawable b = C0478b.m2246b(this.f1247a.m2491e(), this.f1258l);
        this.f1258l = 0;
        this.f1257k = b;
        return b;
    }

    public Intent getIntent() {
        return this.f1254h;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f1248b;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f1268v;
    }

    public char getNumericShortcut() {
        return this.f1255i;
    }

    public int getOrder() {
        return this.f1250d;
    }

    public SubMenu getSubMenu() {
        return this.f1259m;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1252f;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1253g != null ? this.f1253g : this.f1252f;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public void m2531h() {
        this.f1247a.m2480b(this);
    }

    public boolean hasSubMenu() {
        return this.f1259m != null;
    }

    public boolean m2532i() {
        return this.f1247a.m2504q();
    }

    public boolean isActionViewExpanded() {
        return this.f1267u;
    }

    public boolean isCheckable() {
        return (this.f1262p & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1262p & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1262p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1265s == null || !this.f1265s.m1458b()) ? (this.f1262p & 8) == 0 : (this.f1262p & 8) == 0 && this.f1265s.m1459c();
    }

    public boolean m2533j() {
        return (this.f1262p & 32) == 32;
    }

    public boolean m2534k() {
        return (this.f1263q & 1) == 1;
    }

    public boolean m2535l() {
        return (this.f1263q & 2) == 2;
    }

    public boolean m2536m() {
        return (this.f1263q & 4) == 4;
    }

    public boolean m2537n() {
        if ((this.f1263q & 8) == 0) {
            return false;
        }
        if (this.f1264r == null && this.f1265s != null) {
            this.f1264r = this.f1265s.m1453a((MenuItem) this);
        }
        return this.f1264r != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m2511a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m2514a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1256j != c) {
            this.f1256j = Character.toLowerCase(c);
            this.f1247a.m2482b(false);
        }
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1262p;
        this.f1262p = (z ? 1 : 0) | (this.f1262p & -2);
        if (i != this.f1262p) {
            this.f1247a.m2482b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1262p & 4) != 0) {
            this.f1247a.m2472a((MenuItem) this);
        } else {
            m2521b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1262p |= 16;
        } else {
            this.f1262p &= -17;
        }
        this.f1247a.m2482b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1257k = null;
        this.f1258l = i;
        this.f1247a.m2482b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1258l = 0;
        this.f1257k = drawable;
        this.f1247a.m2482b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1254h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1255i != c) {
            this.f1255i = c;
            this.f1247a.m2482b(false);
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1261o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1255i = c;
        this.f1256j = Character.toLowerCase(c2);
        this.f1247a.m2482b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case C0474j.View_android_theme /*0*/:
            case C0474j.View_android_focusable /*1*/:
            case C0474j.View_paddingStart /*2*/:
                this.f1263q = i;
                this.f1247a.m2480b(this);
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m2520b(i);
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f1247a.m2491e().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1252f = charSequence;
        this.f1247a.m2482b(false);
        if (this.f1259m != null) {
            this.f1259m.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1253g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1252f;
        }
        this.f1247a.m2482b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (m2524c(z)) {
            this.f1247a.m2469a(this);
        }
        return this;
    }

    public String toString() {
        return this.f1252f != null ? this.f1252f.toString() : null;
    }
}
