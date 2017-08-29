package p000a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.p015b.C0475a.C0474j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p022b.C0631a;
import pl.edu.zut.mobile.AttendanceActivity;
import pl.edu.zut.mobile.UserProfileActivity;

/* renamed from: a.a */
public class C0003a extends BaseAdapter {
    private Context f7a;
    private C0007e f8b;
    private List<String> f9c;
    private List<C0631a> f10d;
    private HashMap f11e;
    private HashMap f12f;

    /* renamed from: a.a.1 */
    class C00001 implements OnClickListener {
        final /* synthetic */ int f0a;
        final /* synthetic */ C0003a f1b;

        C00001(C0003a c0003a, int i) {
            this.f1b = c0003a;
            this.f0a = i;
        }

        public void onClick(View view) {
            this.f1b.m3a(this.f0a);
        }
    }

    /* renamed from: a.a.2 */
    class C00012 implements OnClickListener {
        final /* synthetic */ int f2a;
        final /* synthetic */ C0003a f3b;

        C00012(C0003a c0003a, int i) {
            this.f3b = c0003a;
            this.f2a = i;
        }

        public void onClick(View view) {
            this.f3b.m3a(this.f2a);
        }
    }

    /* renamed from: a.a.3 */
    class C00023 implements OnItemSelectedListener {
        final /* synthetic */ Spinner f4a;
        final /* synthetic */ TextView f5b;
        final /* synthetic */ C0003a f6c;

        C00023(C0003a c0003a, Spinner spinner, TextView textView) {
            this.f6c = c0003a;
            this.f4a = spinner;
            this.f5b = textView;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2 = "BRAK";
            if (i == 1) {
                this.f4a.setBackgroundColor(Color.rgb(0, 140, 79));
                str = "O";
            } else if (i == 2) {
                this.f4a.setBackgroundColor(-65536);
                str = "N";
            } else if (i == 3) {
                this.f4a.setBackgroundColor(-256);
                str = "NU";
            } else {
                this.f4a.setBackgroundColor(-7829368);
                str = str2;
            }
            if (!this.f6c.f12f.get(this.f5b.getText()).equals(str)) {
                ((AttendanceActivity) this.f6c.f7a).m3219a((String) this.f6c.f11e.get(this.f5b.getText()), str);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public C0003a(Context context, List<C0631a> list) {
        this.f11e = new HashMap();
        this.f12f = new HashMap();
        this.f7a = context;
        this.f10d = list;
    }

    public void m3a(int i) {
        Intent intent = new Intent(this.f7a, UserProfileActivity.class);
        intent.putExtra("album", ((C0631a) this.f10d.get(i)).m3168a());
        intent.putExtra("userName", ((C0631a) this.f10d.get(i)).m3169b());
        intent.putExtra("imageUrl", ((C0631a) this.f10d.get(i)).m3171d());
        this.f7a.startActivity(intent);
    }

    public int getCount() {
        return this.f10d.size();
    }

    public Object getItem(int i) {
        return this.f10d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f7a.getSystemService("layout_inflater")).inflate(2130968621, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(2131427483);
        TextView textView2 = (TextView) view.findViewById(2131427465);
        Spinner spinner = (Spinner) view.findViewById(2131427484);
        this.f9c = new ArrayList();
        view.setBackgroundColor(0);
        spinner.setBackgroundColor(Color.rgb(115, 118, 122));
        this.f9c.add(this.f7a.getString(2131099745));
        textView.setOnClickListener(new C00001(this, i));
        textView2.setOnClickListener(new C00012(this, i));
        this.f9c.add(this.f7a.getString(2131099817));
        this.f9c.add(this.f7a.getString(2131099731));
        this.f9c.add(this.f7a.getString(2131099789));
        this.f8b = new C0007e(this.f7a, this.f9c);
        spinner.setAdapter(this.f8b);
        String c = ((C0631a) this.f10d.get(i)).m3170c();
        this.f11e.put(((C0631a) this.f10d.get(i)).m3168a(), ((C0631a) this.f10d.get(i)).m3172e());
        this.f12f.put(((C0631a) this.f10d.get(i)).m3168a(), c);
        boolean z = true;
        switch (c.hashCode()) {
            case C0474j.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                if (c.equals("0")) {
                    z = true;
                    break;
                }
                break;
            case C0474j.AppCompatTheme_textAppearanceListItemSmall /*78*/:
                if (c.equals("N")) {
                    z = true;
                    break;
                }
                break;
            case C0474j.AppCompatTheme_panelBackground /*79*/:
                if (c.equals("O")) {
                    z = false;
                    break;
                }
                break;
            case 2503:
                if (c.equals("NU")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case C0474j.View_android_theme /*0*/:
                spinner.setSelection(1);
                spinner.setBackgroundColor(Color.rgb(0, 140, 79));
                break;
            case C0474j.View_android_focusable /*1*/:
                spinner.setSelection(2);
                spinner.setBackgroundColor(-65536);
                break;
            case C0474j.View_paddingStart /*2*/:
                spinner.setSelection(3);
                spinner.setBackgroundColor(-256);
                break;
            case C0474j.View_paddingEnd /*3*/:
                spinner.setSelection(0);
                spinner.setBackgroundColor(Color.rgb(69, 187, 247));
                break;
            default:
                spinner.setSelection(0);
                break;
        }
        spinner.setOnItemSelectedListener(new C00023(this, spinner, textView));
        textView.setText(((C0631a) this.f10d.get(i)).m3168a());
        textView2.setText(((C0631a) this.f10d.get(i)).m3169b());
        return view;
    }
}
