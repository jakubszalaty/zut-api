package p000a;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0635e;

/* renamed from: a.g */
public class C0009g extends BaseAdapter {
    private List<C0635e> f24a;
    private Context f25b;

    public C0009g(Context context, List<C0635e> list) {
        this.f25b = context;
        this.f24a = list;
    }

    public int getCount() {
        return this.f24a.size();
    }

    public Object getItem(int i) {
        return this.f24a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f25b.getSystemService("layout_inflater")).inflate(2130968640, viewGroup, false);
        }
        if (i == 0) {
            view.setBackgroundColor(Color.rgb(231, 231, 239));
        } else {
            view.setBackgroundColor(0);
        }
        ((TextView) view.findViewById(2131427485)).setText(((C0635e) this.f24a.get(i)).m3186a());
        ((TextView) view.findViewById(2131427486)).setText(((C0635e) this.f24a.get(i)).m3187b());
        ((TextView) view.findViewById(2131427487)).setText(((C0635e) this.f24a.get(i)).m3188c());
        ((TextView) view.findViewById(2131427488)).setText(((C0635e) this.f24a.get(i)).m3189d());
        if (((C0635e) this.f24a.get(i)).m3190e() != null) {
            ((TextView) view.findViewById(2131427489)).setText(((C0635e) this.f24a.get(i)).m3190e());
        }
        if (((C0635e) this.f24a.get(i)).m3191f() != null) {
            ((TextView) view.findViewById(2131427505)).setText(((C0635e) this.f24a.get(i)).m3191f());
        }
        if (((C0635e) this.f24a.get(i)).m3192g() != null) {
            ((TextView) view.findViewById(2131427506)).setText(((C0635e) this.f24a.get(i)).m3192g());
        }
        return view;
    }
}
