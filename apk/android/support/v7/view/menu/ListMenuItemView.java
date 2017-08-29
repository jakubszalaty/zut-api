package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0470f;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0499p.C0496a;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0496a {
    private C0518j f1118a;
    private ImageView f1119b;
    private RadioButton f1120c;
    private TextView f1121d;
    private CheckBox f1122e;
    private TextView f1123f;
    private ImageView f1124g;
    private Drawable f1125h;
    private int f1126i;
    private Context f1127j;
    private boolean f1128k;
    private Drawable f1129l;
    private int f1130m;
    private LayoutInflater f1131n;
    private boolean f1132o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        av a = av.m2947a(getContext(), attributeSet, C0474j.MenuView, i, 0);
        this.f1125h = a.m2950a(C0474j.MenuView_android_itemBackground);
        this.f1126i = a.m2963g(C0474j.MenuView_android_itemTextAppearance, -1);
        this.f1128k = a.m2952a(C0474j.MenuView_preserveIconSpacing, false);
        this.f1127j = context;
        this.f1129l = a.m2950a(C0474j.MenuView_subMenuArrow);
        a.m2951a();
    }

    private void m2342b() {
        this.f1119b = (ImageView) getInflater().inflate(C0471g.abc_list_menu_item_icon, this, false);
        addView(this.f1119b, 0);
    }

    private void m2343c() {
        this.f1120c = (RadioButton) getInflater().inflate(C0471g.abc_list_menu_item_radio, this, false);
        addView(this.f1120c);
    }

    private void m2344d() {
        this.f1122e = (CheckBox) getInflater().inflate(C0471g.abc_list_menu_item_checkbox, this, false);
        addView(this.f1122e);
    }

    private LayoutInflater getInflater() {
        if (this.f1131n == null) {
            this.f1131n = LayoutInflater.from(getContext());
        }
        return this.f1131n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f1124g != null) {
            this.f1124g.setVisibility(z ? 0 : 8);
        }
    }

    public void m2345a(C0518j c0518j, int i) {
        this.f1118a = c0518j;
        this.f1130m = i;
        setVisibility(c0518j.isVisible() ? 0 : 8);
        setTitle(c0518j.m2516a((C0496a) this));
        setCheckable(c0518j.isCheckable());
        m2346a(c0518j.m2529f(), c0518j.m2525d());
        setIcon(c0518j.getIcon());
        setEnabled(c0518j.isEnabled());
        setSubMenuArrowVisible(c0518j.hasSubMenu());
    }

    public void m2346a(boolean z, char c) {
        int i = (z && this.f1118a.m2529f()) ? 0 : 8;
        if (i == 0) {
            this.f1123f.setText(this.f1118a.m2527e());
        }
        if (this.f1123f.getVisibility() != i) {
            this.f1123f.setVisibility(i);
        }
    }

    public boolean m2347a() {
        return false;
    }

    public C0518j getItemData() {
        return this.f1118a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.f1125h);
        this.f1121d = (TextView) findViewById(C0470f.title);
        if (this.f1126i != -1) {
            this.f1121d.setTextAppearance(this.f1127j, this.f1126i);
        }
        this.f1123f = (TextView) findViewById(C0470f.shortcut);
        this.f1124g = (ImageView) findViewById(C0470f.submenuarrow);
        if (this.f1124g != null) {
            this.f1124g.setImageDrawable(this.f1129l);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f1119b != null && this.f1128k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1119b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        if (z || this.f1120c != null || this.f1122e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f1118a.m2530g()) {
                if (this.f1120c == null) {
                    m2343c();
                }
                compoundButton = this.f1120c;
                compoundButton2 = this.f1122e;
            } else {
                if (this.f1122e == null) {
                    m2344d();
                }
                compoundButton = this.f1122e;
                compoundButton2 = this.f1120c;
            }
            if (z) {
                compoundButton.setChecked(this.f1118a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f1122e != null) {
                this.f1122e.setVisibility(8);
            }
            if (this.f1120c != null) {
                this.f1120c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1118a.m2530g()) {
            if (this.f1120c == null) {
                m2343c();
            }
            compoundButton = this.f1120c;
        } else {
            if (this.f1122e == null) {
                m2344d();
            }
            compoundButton = this.f1122e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1132o = z;
        this.f1128k = z;
    }

    public void setIcon(Drawable drawable) {
        int i = (this.f1118a.m2532i() || this.f1132o) ? 1 : 0;
        if (i == 0 && !this.f1128k) {
            return;
        }
        if (this.f1119b != null || drawable != null || this.f1128k) {
            if (this.f1119b == null) {
                m2342b();
            }
            if (drawable != null || this.f1128k) {
                ImageView imageView = this.f1119b;
                if (i == 0) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1119b.getVisibility() != 0) {
                    this.f1119b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1119b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1121d.setText(charSequence);
            if (this.f1121d.getVisibility() != 0) {
                this.f1121d.setVisibility(0);
            }
        } else if (this.f1121d.getVisibility() != 8) {
            this.f1121d.setVisibility(8);
        }
    }
}
