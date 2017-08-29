package android.support.v7.p014a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.p007g.ae;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0345b;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0474j;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.a.c */
class C0413c {
    private boolean f800A;
    private CharSequence f801B;
    private CharSequence f802C;
    private CharSequence f803D;
    private int f804E;
    private Drawable f805F;
    private ImageView f806G;
    private TextView f807H;
    private TextView f808I;
    private View f809J;
    private int f810K;
    private int f811L;
    private int f812M;
    private final OnClickListener f813N;
    final C0415n f814a;
    ListView f815b;
    Button f816c;
    Message f817d;
    Button f818e;
    Message f819f;
    Button f820g;
    Message f821h;
    NestedScrollView f822i;
    ListAdapter f823j;
    int f824k;
    int f825l;
    int f826m;
    int f827n;
    int f828o;
    Handler f829p;
    private final Context f830q;
    private final Window f831r;
    private CharSequence f832s;
    private CharSequence f833t;
    private View f834u;
    private int f835v;
    private int f836w;
    private int f837x;
    private int f838y;
    private int f839z;

    /* renamed from: android.support.v7.a.c.1 */
    class C04001 implements OnClickListener {
        final /* synthetic */ C0413c f735a;

        C04001(C0413c c0413c) {
            this.f735a = c0413c;
        }

        public void onClick(View view) {
            Message obtain = (view != this.f735a.f816c || this.f735a.f817d == null) ? (view != this.f735a.f818e || this.f735a.f819f == null) ? (view != this.f735a.f820g || this.f735a.f821h == null) ? null : Message.obtain(this.f735a.f821h) : Message.obtain(this.f735a.f819f) : Message.obtain(this.f735a.f817d);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            this.f735a.f829p.obtainMessage(1, this.f735a.f814a).sendToTarget();
        }
    }

    /* renamed from: android.support.v7.a.c.2 */
    class C04012 implements C0345b {
        final /* synthetic */ View f736a;
        final /* synthetic */ View f737b;
        final /* synthetic */ C0413c f738c;

        C04012(C0413c c0413c, View view, View view2) {
            this.f738c = c0413c;
            this.f736a = view;
            this.f737b = view2;
        }

        public void m1920a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            C0413c.m1925a(nestedScrollView, this.f736a, this.f737b);
        }
    }

    /* renamed from: android.support.v7.a.c.3 */
    class C04023 implements Runnable {
        final /* synthetic */ View f739a;
        final /* synthetic */ View f740b;
        final /* synthetic */ C0413c f741c;

        C04023(C0413c c0413c, View view, View view2) {
            this.f741c = c0413c;
            this.f739a = view;
            this.f740b = view2;
        }

        public void run() {
            C0413c.m1925a(this.f741c.f822i, this.f739a, this.f740b);
        }
    }

    /* renamed from: android.support.v7.a.c.4 */
    class C04034 implements OnScrollListener {
        final /* synthetic */ View f742a;
        final /* synthetic */ View f743b;
        final /* synthetic */ C0413c f744c;

        C04034(C0413c c0413c, View view, View view2) {
            this.f744c = c0413c;
            this.f742a = view;
            this.f743b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            C0413c.m1925a(absListView, this.f742a, this.f743b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: android.support.v7.a.c.5 */
    class C04045 implements Runnable {
        final /* synthetic */ View f745a;
        final /* synthetic */ View f746b;
        final /* synthetic */ C0413c f747c;

        C04045(C0413c c0413c, View view, View view2) {
            this.f747c = c0413c;
            this.f745a = view;
            this.f746b = view2;
        }

        public void run() {
            C0413c.m1925a(this.f747c.f815b, this.f745a, this.f746b);
        }
    }

    /* renamed from: android.support.v7.a.c.a */
    public static class C0410a {
        public int f760A;
        public boolean f761B;
        public boolean[] f762C;
        public boolean f763D;
        public boolean f764E;
        public int f765F;
        public OnMultiChoiceClickListener f766G;
        public Cursor f767H;
        public String f768I;
        public String f769J;
        public OnItemSelectedListener f770K;
        public C0409a f771L;
        public boolean f772M;
        public final Context f773a;
        public final LayoutInflater f774b;
        public int f775c;
        public Drawable f776d;
        public int f777e;
        public CharSequence f778f;
        public View f779g;
        public CharSequence f780h;
        public CharSequence f781i;
        public DialogInterface.OnClickListener f782j;
        public CharSequence f783k;
        public DialogInterface.OnClickListener f784l;
        public CharSequence f785m;
        public DialogInterface.OnClickListener f786n;
        public boolean f787o;
        public OnCancelListener f788p;
        public OnDismissListener f789q;
        public OnKeyListener f790r;
        public CharSequence[] f791s;
        public ListAdapter f792t;
        public DialogInterface.OnClickListener f793u;
        public int f794v;
        public View f795w;
        public int f796x;
        public int f797y;
        public int f798z;

        /* renamed from: android.support.v7.a.c.a.1 */
        class C04051 extends ArrayAdapter<CharSequence> {
            final /* synthetic */ ListView f748a;
            final /* synthetic */ C0410a f749b;

            C04051(C0410a c0410a, Context context, int i, int i2, CharSequence[] charSequenceArr, ListView listView) {
                this.f749b = c0410a;
                this.f748a = listView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                if (this.f749b.f762C != null && this.f749b.f762C[i]) {
                    this.f748a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: android.support.v7.a.c.a.2 */
        class C04062 extends CursorAdapter {
            final /* synthetic */ ListView f750a;
            final /* synthetic */ C0413c f751b;
            final /* synthetic */ C0410a f752c;
            private final int f753d;
            private final int f754e;

            C04062(C0410a c0410a, Context context, Cursor cursor, boolean z, ListView listView, C0413c c0413c) {
                this.f752c = c0410a;
                this.f750a = listView;
                this.f751b = c0413c;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f753d = cursor2.getColumnIndexOrThrow(this.f752c.f768I);
                this.f754e = cursor2.getColumnIndexOrThrow(this.f752c.f769J);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f753d));
                this.f750a.setItemChecked(cursor.getPosition(), cursor.getInt(this.f754e) == 1);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.f752c.f774b.inflate(this.f751b.f826m, viewGroup, false);
            }
        }

        /* renamed from: android.support.v7.a.c.a.3 */
        class C04073 implements OnItemClickListener {
            final /* synthetic */ C0413c f755a;
            final /* synthetic */ C0410a f756b;

            C04073(C0410a c0410a, C0413c c0413c) {
                this.f756b = c0410a;
                this.f755a = c0413c;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f756b.f793u.onClick(this.f755a.f814a, i);
                if (!this.f756b.f764E) {
                    this.f755a.f814a.dismiss();
                }
            }
        }

        /* renamed from: android.support.v7.a.c.a.4 */
        class C04084 implements OnItemClickListener {
            final /* synthetic */ ListView f757a;
            final /* synthetic */ C0413c f758b;
            final /* synthetic */ C0410a f759c;

            C04084(C0410a c0410a, ListView listView, C0413c c0413c) {
                this.f759c = c0410a;
                this.f757a = listView;
                this.f758b = c0413c;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (this.f759c.f762C != null) {
                    this.f759c.f762C[i] = this.f757a.isItemChecked(i);
                }
                this.f759c.f766G.onClick(this.f758b.f814a, i, this.f757a.isItemChecked(i));
            }
        }

        /* renamed from: android.support.v7.a.c.a.a */
        public interface C0409a {
            void m1921a(ListView listView);
        }

        public C0410a(Context context) {
            this.f775c = 0;
            this.f777e = 0;
            this.f761B = false;
            this.f765F = -1;
            this.f772M = true;
            this.f773a = context;
            this.f787o = true;
            this.f774b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void m1922b(C0413c c0413c) {
            ListAdapter simpleCursorAdapter;
            ListView listView = (ListView) this.f774b.inflate(c0413c.f825l, null);
            if (!this.f763D) {
                int i = this.f764E ? c0413c.f827n : c0413c.f828o;
                simpleCursorAdapter = this.f767H != null ? new SimpleCursorAdapter(this.f773a, i, this.f767H, new String[]{this.f768I}, new int[]{16908308}) : this.f792t != null ? this.f792t : new C0412c(this.f773a, i, 16908308, this.f791s);
            } else if (this.f767H == null) {
                simpleCursorAdapter = new C04051(this, this.f773a, c0413c.f826m, 16908308, this.f791s, listView);
            } else {
                Object c04062 = new C04062(this, this.f773a, this.f767H, false, listView, c0413c);
            }
            if (this.f771L != null) {
                this.f771L.m1921a(listView);
            }
            c0413c.f823j = simpleCursorAdapter;
            c0413c.f824k = this.f765F;
            if (this.f793u != null) {
                listView.setOnItemClickListener(new C04073(this, c0413c));
            } else if (this.f766G != null) {
                listView.setOnItemClickListener(new C04084(this, listView, c0413c));
            }
            if (this.f770K != null) {
                listView.setOnItemSelectedListener(this.f770K);
            }
            if (this.f764E) {
                listView.setChoiceMode(1);
            } else if (this.f763D) {
                listView.setChoiceMode(2);
            }
            c0413c.f815b = listView;
        }

        public void m1923a(C0413c c0413c) {
            if (this.f779g != null) {
                c0413c.m1942b(this.f779g);
            } else {
                if (this.f778f != null) {
                    c0413c.m1939a(this.f778f);
                }
                if (this.f776d != null) {
                    c0413c.m1937a(this.f776d);
                }
                if (this.f775c != 0) {
                    c0413c.m1941b(this.f775c);
                }
                if (this.f777e != 0) {
                    c0413c.m1941b(c0413c.m1945c(this.f777e));
                }
            }
            if (this.f780h != null) {
                c0413c.m1943b(this.f780h);
            }
            if (this.f781i != null) {
                c0413c.m1936a(-1, this.f781i, this.f782j, null);
            }
            if (this.f783k != null) {
                c0413c.m1936a(-2, this.f783k, this.f784l, null);
            }
            if (this.f785m != null) {
                c0413c.m1936a(-3, this.f785m, this.f786n, null);
            }
            if (!(this.f791s == null && this.f767H == null && this.f792t == null)) {
                m1922b(c0413c);
            }
            if (this.f795w != null) {
                if (this.f761B) {
                    c0413c.m1938a(this.f795w, this.f796x, this.f797y, this.f798z, this.f760A);
                    return;
                }
                c0413c.m1946c(this.f795w);
            } else if (this.f794v != 0) {
                c0413c.m1935a(this.f794v);
            }
        }
    }

    /* renamed from: android.support.v7.a.c.b */
    private static final class C0411b extends Handler {
        private WeakReference<DialogInterface> f799a;

        public C0411b(DialogInterface dialogInterface) {
            this.f799a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f799a.get(), message.what);
                case C0474j.View_android_focusable /*1*/:
                    ((DialogInterface) message.obj).dismiss();
                default:
            }
        }
    }

    /* renamed from: android.support.v7.a.c.c */
    private static class C0412c extends ArrayAdapter<CharSequence> {
        public C0412c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public C0413c(Context context, C0415n c0415n, Window window) {
        this.f800A = false;
        this.f804E = 0;
        this.f824k = -1;
        this.f812M = 0;
        this.f813N = new C04001(this);
        this.f830q = context;
        this.f814a = c0415n;
        this.f831r = window;
        this.f829p = new C0411b(c0415n);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0474j.AlertDialog, C0465a.alertDialogStyle, 0);
        this.f810K = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_android_layout, 0);
        this.f811L = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_buttonPanelSideLayout, 0);
        this.f825l = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_listLayout, 0);
        this.f826m = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_multiChoiceItemLayout, 0);
        this.f827n = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_singleChoiceItemLayout, 0);
        this.f828o = obtainStyledAttributes.getResourceId(C0474j.AlertDialog_listItemLayout, 0);
        obtainStyledAttributes.recycle();
        c0415n.m1958a(1);
    }

    private ViewGroup m1924a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    static void m1925a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(ae.m1139a(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!ae.m1139a(view, 1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    private void m1926a(ViewGroup viewGroup) {
        boolean z = false;
        View inflate = this.f834u != null ? this.f834u : this.f835v != 0 ? LayoutInflater.from(this.f830q).inflate(this.f835v, viewGroup, false) : null;
        if (inflate != null) {
            z = true;
        }
        if (!(z && C0413c.m1928a(inflate))) {
            this.f831r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f831r.findViewById(C0470f.custom);
            frameLayout.addView(inflate, new LayoutParams(-1, -1));
            if (this.f800A) {
                frameLayout.setPadding(this.f836w, this.f837x, this.f838y, this.f839z);
            }
            if (this.f815b != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void m1927a(ViewGroup viewGroup, View view, int i, int i2) {
        View view2 = null;
        View findViewById = this.f831r.findViewById(C0470f.scrollIndicatorUp);
        View findViewById2 = this.f831r.findViewById(C0470f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            ae.m1130a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f833t != null) {
                this.f822i.setOnScrollChangeListener(new C04012(this, findViewById, view2));
                this.f822i.post(new C04023(this, findViewById, view2));
            } else if (this.f815b != null) {
                this.f815b.setOnScrollListener(new C04034(this, findViewById, view2));
                this.f815b.post(new C04045(this, findViewById, view2));
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    static boolean m1928a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (C0413c.m1928a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private int m1929b() {
        return this.f811L == 0 ? this.f810K : this.f812M == 1 ? this.f811L : this.f810K;
    }

    private void m1930b(ViewGroup viewGroup) {
        if (this.f809J != null) {
            viewGroup.addView(this.f809J, 0, new LayoutParams(-1, -2));
            this.f831r.findViewById(C0470f.title_template).setVisibility(8);
            return;
        }
        this.f806G = (ImageView) this.f831r.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f832s) ? 1 : 0) != 0) {
            this.f807H = (TextView) this.f831r.findViewById(C0470f.alertTitle);
            this.f807H.setText(this.f832s);
            if (this.f804E != 0) {
                this.f806G.setImageResource(this.f804E);
                return;
            } else if (this.f805F != null) {
                this.f806G.setImageDrawable(this.f805F);
                return;
            } else {
                this.f807H.setPadding(this.f806G.getPaddingLeft(), this.f806G.getPaddingTop(), this.f806G.getPaddingRight(), this.f806G.getPaddingBottom());
                this.f806G.setVisibility(8);
                return;
            }
        }
        this.f831r.findViewById(C0470f.title_template).setVisibility(8);
        this.f806G.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private void m1931c() {
        View findViewById = this.f831r.findViewById(C0470f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0470f.topPanel);
        View findViewById3 = findViewById.findViewById(C0470f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0470f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0470f.customPanel);
        m1926a(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0470f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0470f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0470f.buttonPanel);
        ViewGroup a = m1924a(findViewById5, findViewById2);
        ViewGroup a2 = m1924a(findViewById6, findViewById3);
        ViewGroup a3 = m1924a(findViewById7, findViewById4);
        m1932c(a2);
        m1933d(a3);
        m1930b(a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null)) {
            findViewById3 = a2.findViewById(C0470f.textSpacerNoButtons);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
        }
        if (z2 && this.f822i != null) {
            this.f822i.setClipToPadding(true);
        }
        if (!z) {
            findViewById3 = this.f815b != null ? this.f815b : this.f822i;
            if (findViewById3 != null) {
                m1927a(a2, findViewById3, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView = this.f815b;
        if (listView != null && this.f823j != null) {
            listView.setAdapter(this.f823j);
            int i = this.f824k;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    private void m1932c(ViewGroup viewGroup) {
        this.f822i = (NestedScrollView) this.f831r.findViewById(C0470f.scrollView);
        this.f822i.setFocusable(false);
        this.f822i.setNestedScrollingEnabled(false);
        this.f808I = (TextView) viewGroup.findViewById(16908299);
        if (this.f808I != null) {
            if (this.f833t != null) {
                this.f808I.setText(this.f833t);
                return;
            }
            this.f808I.setVisibility(8);
            this.f822i.removeView(this.f808I);
            if (this.f815b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f822i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f822i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f815b, indexOfChild, new LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void m1933d(ViewGroup viewGroup) {
        int i;
        int i2 = 1;
        this.f816c = (Button) viewGroup.findViewById(16908313);
        this.f816c.setOnClickListener(this.f813N);
        if (TextUtils.isEmpty(this.f801B)) {
            this.f816c.setVisibility(8);
            i = 0;
        } else {
            this.f816c.setText(this.f801B);
            this.f816c.setVisibility(0);
            i = 1;
        }
        this.f818e = (Button) viewGroup.findViewById(16908314);
        this.f818e.setOnClickListener(this.f813N);
        if (TextUtils.isEmpty(this.f802C)) {
            this.f818e.setVisibility(8);
        } else {
            this.f818e.setText(this.f802C);
            this.f818e.setVisibility(0);
            i |= 2;
        }
        this.f820g = (Button) viewGroup.findViewById(16908315);
        this.f820g.setOnClickListener(this.f813N);
        if (TextUtils.isEmpty(this.f803D)) {
            this.f820g.setVisibility(8);
        } else {
            this.f820g.setText(this.f803D);
            this.f820g.setVisibility(0);
            i |= 4;
        }
        if (i == 0) {
            i2 = 0;
        }
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public void m1934a() {
        this.f814a.setContentView(m1929b());
        m1931c();
    }

    public void m1935a(int i) {
        this.f834u = null;
        this.f835v = i;
        this.f800A = false;
    }

    public void m1936a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f829p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f803D = charSequence;
                this.f821h = message;
            case -2:
                this.f802C = charSequence;
                this.f819f = message;
            case -1:
                this.f801B = charSequence;
                this.f817d = message;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m1937a(Drawable drawable) {
        this.f805F = drawable;
        this.f804E = 0;
        if (this.f806G == null) {
            return;
        }
        if (drawable != null) {
            this.f806G.setVisibility(0);
            this.f806G.setImageDrawable(drawable);
            return;
        }
        this.f806G.setVisibility(8);
    }

    public void m1938a(View view, int i, int i2, int i3, int i4) {
        this.f834u = view;
        this.f835v = 0;
        this.f800A = true;
        this.f836w = i;
        this.f837x = i2;
        this.f838y = i3;
        this.f839z = i4;
    }

    public void m1939a(CharSequence charSequence) {
        this.f832s = charSequence;
        if (this.f807H != null) {
            this.f807H.setText(charSequence);
        }
    }

    public boolean m1940a(int i, KeyEvent keyEvent) {
        return this.f822i != null && this.f822i.m1683a(keyEvent);
    }

    public void m1941b(int i) {
        this.f805F = null;
        this.f804E = i;
        if (this.f806G == null) {
            return;
        }
        if (i != 0) {
            this.f806G.setVisibility(0);
            this.f806G.setImageResource(this.f804E);
            return;
        }
        this.f806G.setVisibility(8);
    }

    public void m1942b(View view) {
        this.f809J = view;
    }

    public void m1943b(CharSequence charSequence) {
        this.f833t = charSequence;
        if (this.f808I != null) {
            this.f808I.setText(charSequence);
        }
    }

    public boolean m1944b(int i, KeyEvent keyEvent) {
        return this.f822i != null && this.f822i.m1683a(keyEvent);
    }

    public int m1945c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f830q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public void m1946c(View view) {
        this.f834u = view;
        this.f835v = 0;
        this.f800A = false;
    }
}
