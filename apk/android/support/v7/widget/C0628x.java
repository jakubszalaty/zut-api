package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p007g.ab;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.support.v7.view.C0485d;
import android.support.v7.view.menu.C0509s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.x */
public class C0628x extends Spinner implements ab {
    static final boolean f1844a;
    private static final boolean f1845e;
    private static final int[] f1846f;
    C0627b f1847b;
    int f1848c;
    final Rect f1849d;
    private C0601g f1850g;
    private Context f1851h;
    private ag f1852i;
    private SpinnerAdapter f1853j;
    private boolean f1854k;

    /* renamed from: android.support.v7.widget.x.1 */
    class C06221 extends ag {
        final /* synthetic */ C0627b f1831a;
        final /* synthetic */ C0628x f1832b;

        C06221(C0628x c0628x, View view, C0627b c0627b) {
            this.f1832b = c0628x;
            this.f1831a = c0627b;
            super(view);
        }

        public C0509s m3149a() {
            return this.f1831a;
        }

        public boolean m3150b() {
            if (!this.f1832b.f1847b.m2872d()) {
                this.f1832b.f1847b.m3152a();
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.x.a */
    private static class C0623a implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter f1833a;
        private ListAdapter f1834b;

        public C0623a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1833a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1834b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (C0628x.f1844a && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ar) {
                ar arVar = (ar) spinnerAdapter;
                if (arVar.m2940a() == null) {
                    arVar.m2941a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1834b;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public int getCount() {
            return this.f1833a == null ? 0 : this.f1833a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return this.f1833a == null ? null : this.f1833a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            return this.f1833a == null ? null : this.f1833a.getItem(i);
        }

        public long getItemId(int i) {
            return this.f1833a == null ? -1 : this.f1833a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f1833a != null && this.f1833a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1834b;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1833a != null) {
                this.f1833a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1833a != null) {
                this.f1833a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.x.b */
    private class C0627b extends ai {
        ListAdapter f1840a;
        final /* synthetic */ C0628x f1841b;
        private CharSequence f1842h;
        private final Rect f1843i;

        /* renamed from: android.support.v7.widget.x.b.1 */
        class C06241 implements OnItemClickListener {
            final /* synthetic */ C0628x f1835a;
            final /* synthetic */ C0627b f1836b;

            C06241(C0627b c0627b, C0628x c0628x) {
                this.f1836b = c0627b;
                this.f1835a = c0628x;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f1836b.f1841b.setSelection(i);
                if (this.f1836b.f1841b.getOnItemClickListener() != null) {
                    this.f1836b.f1841b.performItemClick(view, i, this.f1836b.f1840a.getItemId(i));
                }
                this.f1836b.m2869c();
            }
        }

        /* renamed from: android.support.v7.widget.x.b.2 */
        class C06252 implements OnGlobalLayoutListener {
            final /* synthetic */ C0627b f1837a;

            C06252(C0627b c0627b) {
                this.f1837a = c0627b;
            }

            public void onGlobalLayout() {
                if (this.f1837a.m3155a(this.f1837a.f1841b)) {
                    this.f1837a.m3157f();
                    super.m2859a();
                    return;
                }
                this.f1837a.m2869c();
            }
        }

        /* renamed from: android.support.v7.widget.x.b.3 */
        class C06263 implements OnDismissListener {
            final /* synthetic */ OnGlobalLayoutListener f1838a;
            final /* synthetic */ C0627b f1839b;

            C06263(C0627b c0627b, OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1839b = c0627b;
                this.f1838a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = this.f1839b.f1841b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1838a);
                }
            }
        }

        public C0627b(C0628x c0628x, Context context, AttributeSet attributeSet, int i) {
            this.f1841b = c0628x;
            super(context, attributeSet, i);
            this.f1843i = new Rect();
            m2868b((View) c0628x);
            m2866a(true);
            m2860a(0);
            m2863a(new C06241(this, c0628x));
        }

        public void m3152a() {
            boolean d = m2872d();
            m3157f();
            m2879h(2);
            super.m2859a();
            m2873e().setChoiceMode(1);
            m2881i(this.f1841b.getSelectedItemPosition());
            if (!d) {
                ViewTreeObserver viewTreeObserver = this.f1841b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    OnGlobalLayoutListener c06252 = new C06252(this);
                    viewTreeObserver.addOnGlobalLayoutListener(c06252);
                    m2865a(new C06263(this, c06252));
                }
            }
        }

        public void m3153a(ListAdapter listAdapter) {
            super.m2864a(listAdapter);
            this.f1840a = listAdapter;
        }

        public void m3154a(CharSequence charSequence) {
            this.f1842h = charSequence;
        }

        boolean m3155a(View view) {
            return ae.m1165u(view) && view.getGlobalVisibleRect(this.f1843i);
        }

        public CharSequence m3156b() {
            return this.f1842h;
        }

        void m3157f() {
            int i;
            Drawable h = m2878h();
            if (h != null) {
                h.getPadding(this.f1841b.f1849d);
                i = ay.m3016a(this.f1841b) ? this.f1841b.f1849d.right : -this.f1841b.f1849d.left;
            } else {
                Rect rect = this.f1841b.f1849d;
                this.f1841b.f1849d.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = this.f1841b.getPaddingLeft();
            int paddingRight = this.f1841b.getPaddingRight();
            int width = this.f1841b.getWidth();
            if (this.f1841b.f1848c == -2) {
                int a = this.f1841b.m3158a((SpinnerAdapter) this.f1840a, m2878h());
                int i2 = (this.f1841b.getContext().getResources().getDisplayMetrics().widthPixels - this.f1841b.f1849d.left) - this.f1841b.f1849d.right;
                if (a <= i2) {
                    i2 = a;
                }
                m2876g(Math.max(i2, (width - paddingLeft) - paddingRight));
            } else if (this.f1841b.f1848c == -1) {
                m2876g((width - paddingLeft) - paddingRight);
            } else {
                m2876g(this.f1841b.f1848c);
            }
            m2870c(ay.m3016a(this.f1841b) ? ((width - paddingRight) - m2884l()) + i : i + paddingLeft);
        }
    }

    static {
        f1844a = VERSION.SDK_INT >= 23;
        f1845e = VERSION.SDK_INT >= 16;
        f1846f = new int[]{16843505};
    }

    public C0628x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.spinnerStyle);
    }

    public C0628x(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0628x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public C0628x(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        TypedArray obtainStyledAttributes;
        Throwable e;
        C0627b c0627b;
        av a;
        CharSequence[] f;
        SpinnerAdapter arrayAdapter;
        super(context, attributeSet, i);
        this.f1849d = new Rect();
        av a2 = av.m2947a(context, attributeSet, C0474j.Spinner, i, 0);
        this.f1850g = new C0601g(this);
        if (theme != null) {
            this.f1851h = new C0485d(context, theme);
        } else {
            int g = a2.m2963g(C0474j.Spinner_popupTheme, 0);
            if (g != 0) {
                this.f1851h = new C0485d(context, g);
            } else {
                this.f1851h = !f1844a ? context : null;
            }
        }
        if (this.f1851h != null) {
            if (i2 == -1) {
                if (VERSION.SDK_INT >= 11) {
                    try {
                        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1846f, i, 0);
                        try {
                            if (obtainStyledAttributes.hasValue(0)) {
                                i2 = obtainStyledAttributes.getInt(0, 0);
                            }
                            if (obtainStyledAttributes != null) {
                                obtainStyledAttributes.recycle();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                                if (obtainStyledAttributes != null) {
                                    obtainStyledAttributes.recycle();
                                }
                                if (i2 == 1) {
                                    c0627b = new C0627b(this, this.f1851h, attributeSet, i);
                                    a = av.m2947a(this.f1851h, attributeSet, C0474j.Spinner, i, 0);
                                    this.f1848c = a.m2961f(C0474j.Spinner_android_dropDownWidth, -2);
                                    c0627b.m2862a(a.m2950a(C0474j.Spinner_android_popupBackground));
                                    c0627b.m3154a(a2.m2958d(C0474j.Spinner_android_prompt));
                                    a.m2951a();
                                    this.f1847b = c0627b;
                                    this.f1852i = new C06221(this, this, c0627b);
                                }
                                f = a2.m2962f(C0474j.Spinner_android_entries);
                                if (f != null) {
                                    arrayAdapter = new ArrayAdapter(context, 17367048, f);
                                    arrayAdapter.setDropDownViewResource(C0471g.support_simple_spinner_dropdown_item);
                                    setAdapter(arrayAdapter);
                                }
                                a2.m2951a();
                                this.f1854k = true;
                                if (this.f1853j != null) {
                                    setAdapter(this.f1853j);
                                    this.f1853j = null;
                                }
                                this.f1850g.m3084a(attributeSet, i);
                            } catch (Throwable th) {
                                e = th;
                                if (obtainStyledAttributes != null) {
                                    obtainStyledAttributes.recycle();
                                }
                                throw e;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        obtainStyledAttributes = null;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        if (obtainStyledAttributes != null) {
                            obtainStyledAttributes.recycle();
                        }
                        if (i2 == 1) {
                            c0627b = new C0627b(this, this.f1851h, attributeSet, i);
                            a = av.m2947a(this.f1851h, attributeSet, C0474j.Spinner, i, 0);
                            this.f1848c = a.m2961f(C0474j.Spinner_android_dropDownWidth, -2);
                            c0627b.m2862a(a.m2950a(C0474j.Spinner_android_popupBackground));
                            c0627b.m3154a(a2.m2958d(C0474j.Spinner_android_prompt));
                            a.m2951a();
                            this.f1847b = c0627b;
                            this.f1852i = new C06221(this, this, c0627b);
                        }
                        f = a2.m2962f(C0474j.Spinner_android_entries);
                        if (f != null) {
                            arrayAdapter = new ArrayAdapter(context, 17367048, f);
                            arrayAdapter.setDropDownViewResource(C0471g.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        a2.m2951a();
                        this.f1854k = true;
                        if (this.f1853j != null) {
                            setAdapter(this.f1853j);
                            this.f1853j = null;
                        }
                        this.f1850g.m3084a(attributeSet, i);
                    } catch (Throwable th2) {
                        e = th2;
                        obtainStyledAttributes = null;
                        if (obtainStyledAttributes != null) {
                            obtainStyledAttributes.recycle();
                        }
                        throw e;
                    }
                }
                i2 = 1;
            }
            if (i2 == 1) {
                c0627b = new C0627b(this, this.f1851h, attributeSet, i);
                a = av.m2947a(this.f1851h, attributeSet, C0474j.Spinner, i, 0);
                this.f1848c = a.m2961f(C0474j.Spinner_android_dropDownWidth, -2);
                c0627b.m2862a(a.m2950a(C0474j.Spinner_android_popupBackground));
                c0627b.m3154a(a2.m2958d(C0474j.Spinner_android_prompt));
                a.m2951a();
                this.f1847b = c0627b;
                this.f1852i = new C06221(this, this, c0627b);
            }
        }
        f = a2.m2962f(C0474j.Spinner_android_entries);
        if (f != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, f);
            arrayAdapter.setDropDownViewResource(C0471g.support_simple_spinner_dropdown_item);
            setAdapter(arrayAdapter);
        }
        a2.m2951a();
        this.f1854k = true;
        if (this.f1853j != null) {
            setAdapter(this.f1853j);
            this.f1853j = null;
        }
        this.f1850g.m3084a(attributeSet, i);
    }

    int m3158a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            view = spinnerAdapter.getView(max2, view2, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
            max2++;
            max = itemViewType;
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.f1849d);
        return (this.f1849d.left + this.f1849d.right) + i;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1850g != null) {
            this.f1850g.m3087c();
        }
    }

    public int getDropDownHorizontalOffset() {
        return this.f1847b != null ? this.f1847b.m2882j() : f1845e ? super.getDropDownHorizontalOffset() : 0;
    }

    public int getDropDownVerticalOffset() {
        return this.f1847b != null ? this.f1847b.m2883k() : f1845e ? super.getDropDownVerticalOffset() : 0;
    }

    public int getDropDownWidth() {
        return this.f1847b != null ? this.f1848c : f1845e ? super.getDropDownWidth() : 0;
    }

    public Drawable getPopupBackground() {
        return this.f1847b != null ? this.f1847b.m2878h() : f1845e ? super.getPopupBackground() : null;
    }

    public Context getPopupContext() {
        return this.f1847b != null ? this.f1851h : f1844a ? super.getPopupContext() : null;
    }

    public CharSequence getPrompt() {
        return this.f1847b != null ? this.f1847b.m3156b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1850g != null ? this.f1850g.m3079a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1850g != null ? this.f1850g.m3085b() : null;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1847b != null && this.f1847b.m2872d()) {
            this.f1847b.m2869c();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1847b != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m3158a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f1852i == null || !this.f1852i.onTouch(this, motionEvent)) ? super.onTouchEvent(motionEvent) : true;
    }

    public boolean performClick() {
        if (this.f1847b == null) {
            return super.performClick();
        }
        if (!this.f1847b.m2872d()) {
            this.f1847b.m3152a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f1854k) {
            super.setAdapter(spinnerAdapter);
            if (this.f1847b != null) {
                this.f1847b.m3153a(new C0623a(spinnerAdapter, (this.f1851h == null ? getContext() : this.f1851h).getTheme()));
                return;
            }
            return;
        }
        this.f1853j = spinnerAdapter;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1850g != null) {
            this.f1850g.m3083a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1850g != null) {
            this.f1850g.m3080a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f1847b != null) {
            this.f1847b.m2870c(i);
        } else if (f1845e) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f1847b != null) {
            this.f1847b.m2871d(i);
        } else if (f1845e) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1847b != null) {
            this.f1848c = i;
        } else if (f1845e) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f1847b != null) {
            this.f1847b.m2862a(drawable);
        } else if (f1845e) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0478b.m2246b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f1847b != null) {
            this.f1847b.m3154a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1850g != null) {
            this.f1850g.m3081a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1850g != null) {
            this.f1850g.m3082a(mode);
        }
    }
}
