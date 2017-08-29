package android.support.v4.p006a;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p007g.C0301j;
import android.support.v4.p012f.C0160h;
import android.support.v4.p012f.C0163c;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.k */
public class C0063k implements ComponentCallbacks, OnCreateContextMenuListener {
    static final Object f203a;
    private static final C0160h<String, Class<?>> aa;
    boolean f204A;
    boolean f205B;
    boolean f206C;
    boolean f207D;
    boolean f208E;
    boolean f209F;
    boolean f210G;
    int f211H;
    ViewGroup f212I;
    View f213J;
    View f214K;
    boolean f215L;
    boolean f216M;
    C0095x f217N;
    boolean f218O;
    boolean f219P;
    Object f220Q;
    Object f221R;
    Object f222S;
    Object f223T;
    Object f224U;
    Object f225V;
    Boolean f226W;
    Boolean f227X;
    ab f228Y;
    ab f229Z;
    int f230b;
    View f231c;
    int f232d;
    Bundle f233e;
    SparseArray<Parcelable> f234f;
    int f235g;
    String f236h;
    Bundle f237i;
    C0063k f238j;
    int f239k;
    int f240l;
    boolean f241m;
    boolean f242n;
    boolean f243o;
    boolean f244p;
    boolean f245q;
    int f246r;
    C0078q f247s;
    C0065o f248t;
    C0078q f249u;
    C0079r f250v;
    C0063k f251w;
    int f252x;
    int f253y;
    String f254z;

    /* renamed from: android.support.v4.a.k.1 */
    class C00611 extends C0060m {
        final /* synthetic */ C0063k f202a;

        C00611(C0063k c0063k) {
            this.f202a = c0063k;
        }

        public View m136a(int i) {
            if (this.f202a.f213J != null) {
                return this.f202a.f213J.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public boolean m137a() {
            return this.f202a.f213J != null;
        }
    }

    /* renamed from: android.support.v4.a.k.a */
    public static class C0062a extends RuntimeException {
        public C0062a(String str, Exception exception) {
            super(str, exception);
        }
    }

    static {
        aa = new C0160h();
        f203a = new Object();
    }

    public C0063k() {
        this.f230b = 0;
        this.f235g = -1;
        this.f239k = -1;
        this.f209F = true;
        this.f216M = true;
        this.f220Q = null;
        this.f221R = f203a;
        this.f222S = null;
        this.f223T = f203a;
        this.f224U = null;
        this.f225V = f203a;
        this.f228Y = null;
        this.f229Z = null;
    }

    public static C0063k m138a(Context context, String str) {
        return C0063k.m139a(context, str, null);
    }

    public static C0063k m139a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) aa.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                aa.put(str, cls);
            }
            C0063k c0063k = (C0063k) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(c0063k.getClass().getClassLoader());
                c0063k.f237i = bundle;
            }
            return c0063k;
        } catch (Exception e) {
            throw new C0062a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (Exception e2) {
            throw new C0062a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new C0062a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e22);
        }
    }

    static boolean m140b(Context context, String str) {
        try {
            Class cls = (Class) aa.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                aa.put(str, cls);
            }
            return C0063k.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    void m141A() {
        if (this.f249u != null) {
            this.f249u.m349i();
            this.f249u.m341d();
        }
        this.f230b = 5;
        this.f210G = false;
        m195i();
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f249u != null) {
            this.f249u.m353m();
            this.f249u.m341d();
        }
    }

    void m142B() {
        onLowMemory();
        if (this.f249u != null) {
            this.f249u.m359s();
        }
    }

    void m143C() {
        if (this.f249u != null) {
            this.f249u.m354n();
        }
        this.f230b = 4;
        this.f210G = false;
        m197j();
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void m144D() {
        if (this.f249u != null) {
            this.f249u.m355o();
        }
        this.f230b = 3;
        this.f210G = false;
        m199k();
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m145E() {
        if (this.f249u != null) {
            this.f249u.m356p();
        }
        this.f230b = 2;
        if (this.f218O) {
            this.f218O = false;
            if (!this.f219P) {
                this.f219P = true;
                this.f217N = this.f248t.m215a(this.f236h, this.f218O, false);
            }
            if (this.f217N == null) {
                return;
            }
            if (this.f248t.m233j()) {
                this.f217N.m411d();
            } else {
                this.f217N.m410c();
            }
        }
    }

    void m146F() {
        if (this.f249u != null) {
            this.f249u.m357q();
        }
        this.f230b = 1;
        this.f210G = false;
        m200l();
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f217N != null) {
            this.f217N.m413f();
        }
    }

    void m147G() {
        if (this.f249u != null) {
            this.f249u.m358r();
        }
        this.f230b = 0;
        this.f210G = false;
        m201m();
        if (this.f210G) {
            this.f249u = null;
            return;
        }
        throw new ac("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void m148H() {
        this.f210G = false;
        m203o();
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.f249u == null) {
        } else {
            if (this.f207D) {
                this.f249u.m358r();
                this.f249u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
    }

    C0063k m149a(String str) {
        return str.equals(this.f236h) ? this : this.f249u != null ? this.f249u.m328b(str) : null;
    }

    public View m150a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation m151a(int i, boolean z, int i2) {
        return null;
    }

    public void m152a(int i, int i2, Intent intent) {
    }

    final void m153a(int i, C0063k c0063k) {
        this.f235g = i;
        if (c0063k != null) {
            this.f236h = c0063k.f236h + ":" + this.f235g;
        } else {
            this.f236h = "android:fragment:" + this.f235g;
        }
    }

    public void m154a(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public void m155a(Activity activity) {
        this.f210G = true;
    }

    @Deprecated
    public void m156a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f210G = true;
    }

    public void m157a(Context context) {
        this.f210G = true;
        Activity f = this.f248t == null ? null : this.f248t.m229f();
        if (f != null) {
            this.f210G = false;
            m155a(f);
        }
    }

    public void m158a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f210G = true;
        Activity f = this.f248t == null ? null : this.f248t.m229f();
        if (f != null) {
            this.f210G = false;
            m156a(f, attributeSet, bundle);
        }
    }

    void m159a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f249u != null) {
            this.f249u.m310a(configuration);
        }
    }

    final void m160a(Bundle bundle) {
        if (this.f234f != null) {
            this.f214K.restoreHierarchyState(this.f234f);
            this.f234f = null;
        }
        this.f210G = false;
        m189f(bundle);
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void m161a(C0063k c0063k) {
    }

    public void m162a(Menu menu) {
    }

    public void m163a(Menu menu, MenuInflater menuInflater) {
    }

    public void m164a(View view, Bundle bundle) {
    }

    public void m165a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f252x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f253y));
        printWriter.print(" mTag=");
        printWriter.println(this.f254z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f230b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f235g);
        printWriter.print(" mWho=");
        printWriter.print(this.f236h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f246r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f241m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f242n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f243o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f244p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f204A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f205B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f209F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f208E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f206C);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f207D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f216M);
        if (this.f247s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f247s);
        }
        if (this.f248t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f248t);
        }
        if (this.f251w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f251w);
        }
        if (this.f237i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f237i);
        }
        if (this.f233e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f233e);
        }
        if (this.f234f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f234f);
        }
        if (this.f238j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f238j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f240l);
        }
        if (this.f211H != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f211H);
        }
        if (this.f212I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f212I);
        }
        if (this.f213J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f213J);
        }
        if (this.f214K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f213J);
        }
        if (this.f231c != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f231c);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f232d);
        }
        if (this.f217N != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f217N.m407a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f249u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f249u + ":");
            this.f249u.m319a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void m166a(boolean z) {
    }

    final boolean m167a() {
        return this.f246r > 0;
    }

    public boolean m168a(MenuItem menuItem) {
        return false;
    }

    public final C0068l m169b() {
        return this.f248t == null ? null : (C0068l) this.f248t.m229f();
    }

    public LayoutInflater m170b(Bundle bundle) {
        LayoutInflater b = this.f248t.m223b();
        m181d();
        C0301j.m1480a(b, this.f249u.m360t());
        return b;
    }

    View m171b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f249u != null) {
            this.f249u.m349i();
        }
        return m150a(layoutInflater, viewGroup, bundle);
    }

    public void m172b(Menu menu) {
    }

    public void m173b(boolean z) {
    }

    boolean m174b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f204A) {
            return false;
        }
        if (this.f208E && this.f209F) {
            z = true;
            m163a(menu, menuInflater);
        }
        return this.f249u != null ? z | this.f249u.m325a(menu, menuInflater) : z;
    }

    public boolean m175b(MenuItem menuItem) {
        return false;
    }

    public final Resources m176c() {
        if (this.f248t != null) {
            return this.f248t.m230g().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void m177c(Bundle bundle) {
        this.f210G = true;
        m182d(bundle);
        if (this.f249u != null && !this.f249u.m322a(1)) {
            this.f249u.m350j();
        }
    }

    public void m178c(boolean z) {
    }

    boolean m179c(Menu menu) {
        boolean z = false;
        if (this.f204A) {
            return false;
        }
        if (this.f208E && this.f209F) {
            z = true;
            m162a(menu);
        }
        return this.f249u != null ? z | this.f249u.m324a(menu) : z;
    }

    boolean m180c(MenuItem menuItem) {
        if (!this.f204A) {
            if (this.f208E && this.f209F && m168a(menuItem)) {
                return true;
            }
            if (this.f249u != null && this.f249u.m326a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final C0071p m181d() {
        if (this.f249u == null) {
            m213y();
            if (this.f230b >= 5) {
                this.f249u.m353m();
            } else if (this.f230b >= 4) {
                this.f249u.m352l();
            } else if (this.f230b >= 2) {
                this.f249u.m351k();
            } else if (this.f230b >= 1) {
                this.f249u.m350j();
            }
        }
        return this.f249u;
    }

    void m182d(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f249u == null) {
                    m213y();
                }
                this.f249u.m312a(parcelable, this.f250v);
                this.f250v = null;
                this.f249u.m350j();
            }
        }
    }

    void m183d(Menu menu) {
        if (!this.f204A) {
            if (this.f208E && this.f209F) {
                m172b(menu);
            }
            if (this.f249u != null) {
                this.f249u.m331b(menu);
            }
        }
    }

    void m184d(boolean z) {
        m173b(z);
        if (this.f249u != null) {
            this.f249u.m320a(z);
        }
    }

    boolean m185d(MenuItem menuItem) {
        if (!this.f204A) {
            if (m175b(menuItem)) {
                return true;
            }
            if (this.f249u != null && this.f249u.m334b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m186e(Bundle bundle) {
        this.f210G = true;
    }

    void m187e(boolean z) {
        m178c(z);
        if (this.f249u != null) {
            this.f249u.m332b(z);
        }
    }

    public final boolean m188e() {
        return this.f248t != null && this.f241m;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void m189f(Bundle bundle) {
        this.f210G = true;
    }

    public final boolean m190f() {
        return this.f204A;
    }

    public View m191g() {
        return this.f213J;
    }

    public void m192g(Bundle bundle) {
    }

    public void m193h() {
        this.f210G = true;
        if (!this.f218O) {
            this.f218O = true;
            if (!this.f219P) {
                this.f219P = true;
                this.f217N = this.f248t.m215a(this.f236h, this.f218O, false);
            }
            if (this.f217N != null) {
                this.f217N.m409b();
            }
        }
    }

    void m194h(Bundle bundle) {
        if (this.f249u != null) {
            this.f249u.m349i();
        }
        this.f230b = 1;
        this.f210G = false;
        m177c(bundle);
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onCreate()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void m195i() {
        this.f210G = true;
    }

    void m196i(Bundle bundle) {
        if (this.f249u != null) {
            this.f249u.m349i();
        }
        this.f230b = 2;
        this.f210G = false;
        m186e(bundle);
        if (!this.f210G) {
            throw new ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f249u != null) {
            this.f249u.m351k();
        }
    }

    public void m197j() {
        this.f210G = true;
    }

    void m198j(Bundle bundle) {
        m192g(bundle);
        if (this.f249u != null) {
            Parcelable h = this.f249u.m348h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    public void m199k() {
        this.f210G = true;
    }

    public void m200l() {
        this.f210G = true;
    }

    public void m201m() {
        this.f210G = true;
        if (!this.f219P) {
            this.f219P = true;
            this.f217N = this.f248t.m215a(this.f236h, this.f218O, false);
        }
        if (this.f217N != null) {
            this.f217N.m415h();
        }
    }

    void m202n() {
        this.f235g = -1;
        this.f236h = null;
        this.f241m = false;
        this.f242n = false;
        this.f243o = false;
        this.f244p = false;
        this.f245q = false;
        this.f246r = 0;
        this.f247s = null;
        this.f249u = null;
        this.f248t = null;
        this.f252x = 0;
        this.f253y = 0;
        this.f254z = null;
        this.f204A = false;
        this.f205B = false;
        this.f207D = false;
        this.f217N = null;
        this.f218O = false;
        this.f219P = false;
    }

    public void m203o() {
        this.f210G = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f210G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m169b().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f210G = true;
    }

    public void m204p() {
    }

    public Object m205q() {
        return this.f220Q;
    }

    public Object m206r() {
        return this.f221R == f203a ? m205q() : this.f221R;
    }

    public Object m207s() {
        return this.f222S;
    }

    public Object m208t() {
        return this.f223T == f203a ? m207s() : this.f223T;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0163c.m650a(this, stringBuilder);
        if (this.f235g >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f235g);
        }
        if (this.f252x != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f252x));
        }
        if (this.f254z != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f254z);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Object m209u() {
        return this.f224U;
    }

    public Object m210v() {
        return this.f225V == f203a ? m209u() : this.f225V;
    }

    public boolean m211w() {
        return this.f227X == null ? true : this.f227X.booleanValue();
    }

    public boolean m212x() {
        return this.f226W == null ? true : this.f226W.booleanValue();
    }

    void m213y() {
        this.f249u = new C0078q();
        this.f249u.m318a(this.f248t, new C00611(this), this);
    }

    void m214z() {
        if (this.f249u != null) {
            this.f249u.m349i();
            this.f249u.m341d();
        }
        this.f230b = 4;
        this.f210G = false;
        m193h();
        if (this.f210G) {
            if (this.f249u != null) {
                this.f249u.m352l();
            }
            if (this.f217N != null) {
                this.f217N.m414g();
                return;
            }
            return;
        }
        throw new ac("Fragment " + this + " did not call through to super.onStart()");
    }
}
