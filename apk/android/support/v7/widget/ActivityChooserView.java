package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p015b.C0475a.C0472h;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

public class ActivityChooserView extends ViewGroup {
    final C0545a f1419a;
    final FrameLayout f1420b;
    final FrameLayout f1421c;
    C0286e f1422d;
    final DataSetObserver f1423e;
    OnDismissListener f1424f;
    boolean f1425g;
    int f1426h;
    private final C0546b f1427i;
    private final ah f1428j;
    private final ImageView f1429k;
    private final int f1430l;
    private final OnGlobalLayoutListener f1431m;
    private ai f1432n;
    private boolean f1433o;
    private int f1434p;

    public static class InnerLayout extends ah {
        private static final int[] f1411a;

        static {
            f1411a = new int[]{16842964};
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            av a = av.m2946a(context, attributeSet, f1411a);
            setBackgroundDrawable(a.m2950a(0));
            a.m2951a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView.a */
    private class C0545a extends BaseAdapter {
        final /* synthetic */ ActivityChooserView f1412a;
        private C0599e f1413b;
        private int f1414c;
        private boolean f1415d;
        private boolean f1416e;
        private boolean f1417f;

        public int m2694a() {
            int i = 0;
            int i2 = this.f1414c;
            this.f1414c = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            while (i < count) {
                view = getView(i, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
                i++;
            }
            this.f1414c = i2;
            return i3;
        }

        public void m2695a(int i) {
            if (this.f1414c != i) {
                this.f1414c = i;
                notifyDataSetChanged();
            }
        }

        public void m2696a(C0599e c0599e) {
            C0599e d = this.f1412a.f1419a.m2701d();
            if (d != null && this.f1412a.isShown()) {
                d.unregisterObserver(this.f1412a.f1423e);
            }
            this.f1413b = c0599e;
            if (c0599e != null && this.f1412a.isShown()) {
                c0599e.registerObserver(this.f1412a.f1423e);
            }
            notifyDataSetChanged();
        }

        public void m2697a(boolean z) {
            if (this.f1417f != z) {
                this.f1417f = z;
                notifyDataSetChanged();
            }
        }

        public void m2698a(boolean z, boolean z2) {
            if (this.f1415d != z || this.f1416e != z2) {
                this.f1415d = z;
                this.f1416e = z2;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo m2699b() {
            return this.f1413b.m3074b();
        }

        public int m2700c() {
            return this.f1413b.m3070a();
        }

        public C0599e m2701d() {
            return this.f1413b;
        }

        public boolean m2702e() {
            return this.f1415d;
        }

        public int getCount() {
            int a = this.f1413b.m3070a();
            if (!(this.f1415d || this.f1413b.m3074b() == null)) {
                a--;
            }
            a = Math.min(a, this.f1414c);
            return this.f1417f ? a + 1 : a;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case C0474j.View_android_theme /*0*/:
                    if (!(this.f1415d || this.f1413b.m3074b() == null)) {
                        i++;
                    }
                    return this.f1413b.m3072a(i);
                case C0474j.View_android_focusable /*1*/:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (this.f1417f && i == getCount() - 1) ? 1 : 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case C0474j.View_android_theme /*0*/:
                    if (view == null || view.getId() != C0470f.list_item) {
                        view = LayoutInflater.from(this.f1412a.getContext()).inflate(C0471g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f1412a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0470f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0470f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f1415d && i == 0 && this.f1416e) {
                        ae.m1143b(view, true);
                        return view;
                    }
                    ae.m1143b(view, false);
                    return view;
                case C0474j.View_android_focusable /*1*/:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    view = LayoutInflater.from(this.f1412a.getContext()).inflate(C0471g.abc_activity_chooser_view_list_item, viewGroup, false);
                    view.setId(1);
                    ((TextView) view.findViewById(C0470f.title)).setText(this.f1412a.getContext().getString(C0472h.abc_activity_chooser_view_see_all));
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView.b */
    private class C0546b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        final /* synthetic */ ActivityChooserView f1418a;

        private void m2703a() {
            if (this.f1418a.f1424f != null) {
                this.f1418a.f1424f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f1418a.f1421c) {
                this.f1418a.m2706b();
                Intent b = this.f1418a.f1419a.m2701d().m3073b(this.f1418a.f1419a.m2701d().m3071a(this.f1418a.f1419a.m2699b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f1418a.getContext().startActivity(b);
                }
            } else if (view == this.f1418a.f1420b) {
                this.f1418a.f1425g = false;
                this.f1418a.m2704a(this.f1418a.f1426h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m2703a();
            if (this.f1418a.f1422d != null) {
                this.f1418a.f1422d.m1457a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0545a) adapterView.getAdapter()).getItemViewType(i)) {
                case C0474j.View_android_theme /*0*/:
                    this.f1418a.m2706b();
                    if (!this.f1418a.f1425g) {
                        if (!this.f1418a.f1419a.m2702e()) {
                            i++;
                        }
                        Intent b = this.f1418a.f1419a.m2701d().m3073b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f1418a.getContext().startActivity(b);
                        }
                    } else if (i > 0) {
                        this.f1418a.f1419a.m2701d().m3075c(i);
                    }
                case C0474j.View_android_focusable /*1*/:
                    this.f1418a.m2704a(Integer.MAX_VALUE);
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f1418a.f1421c) {
                if (this.f1418a.f1419a.getCount() > 0) {
                    this.f1418a.f1425g = true;
                    this.f1418a.m2704a(this.f1418a.f1426h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    void m2704a(int i) {
        if (this.f1419a.m2701d() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1431m);
        boolean z = this.f1421c.getVisibility() == 0;
        int c = this.f1419a.m2700c();
        int i2 = z ? 1 : 0;
        if (i == Integer.MAX_VALUE || c <= i2 + i) {
            this.f1419a.m2697a(false);
            this.f1419a.m2695a(i);
        } else {
            this.f1419a.m2697a(true);
            this.f1419a.m2695a(i - 1);
        }
        ai listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.m2872d()) {
            if (this.f1425g || !z) {
                this.f1419a.m2698a(true, z);
            } else {
                this.f1419a.m2698a(false, false);
            }
            listPopupWindow.m2876g(Math.min(this.f1419a.m2694a(), this.f1430l));
            listPopupWindow.m2859a();
            if (this.f1422d != null) {
                this.f1422d.m1457a(true);
            }
            listPopupWindow.m2873e().setContentDescription(getContext().getString(C0472h.abc_activitychooserview_choose_application));
        }
    }

    public boolean m2705a() {
        if (m2707c() || !this.f1433o) {
            return false;
        }
        this.f1425g = false;
        m2704a(this.f1426h);
        return true;
    }

    public boolean m2706b() {
        if (m2707c()) {
            getListPopupWindow().m2869c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1431m);
            }
        }
        return true;
    }

    public boolean m2707c() {
        return getListPopupWindow().m2872d();
    }

    public C0599e getDataModel() {
        return this.f1419a.m2701d();
    }

    ai getListPopupWindow() {
        if (this.f1432n == null) {
            this.f1432n = new ai(getContext());
            this.f1432n.m2864a(this.f1419a);
            this.f1432n.m2868b((View) this);
            this.f1432n.m2866a(true);
            this.f1432n.m2863a(this.f1427i);
            this.f1432n.m2865a(this.f1427i);
        }
        return this.f1432n;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0599e d = this.f1419a.m2701d();
        if (d != null) {
            d.registerObserver(this.f1423e);
        }
        this.f1433o = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0599e d = this.f1419a.m2701d();
        if (d != null) {
            d.unregisterObserver(this.f1423e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1431m);
        }
        if (m2707c()) {
            m2706b();
        }
        this.f1433o = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1428j.layout(0, 0, i3 - i, i4 - i2);
        if (!m2707c()) {
            m2706b();
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f1428j;
        if (this.f1421c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0599e c0599e) {
        this.f1419a.m2696a(c0599e);
        if (m2707c()) {
            m2706b();
            m2705a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1434p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1429k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1429k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1426h = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f1424f = onDismissListener;
    }

    public void setProvider(C0286e c0286e) {
        this.f1422d = c0286e;
    }
}
