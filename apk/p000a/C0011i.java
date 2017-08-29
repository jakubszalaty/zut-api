package p000a;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0637g;

/* renamed from: a.i */
public class C0011i extends BaseAdapter {
    private List<C0637g> f28a;
    private Context f29b;

    public C0011i(Context context, List<C0637g> list) {
        this.f29b = context;
        this.f28a = list;
    }

    public int getCount() {
        return this.f28a.size();
    }

    public Object getItem(int i) {
        return this.f28a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f29b.getSystemService("layout_inflater")).inflate(2130968643, viewGroup, false);
        }
        if (i == 0) {
            view.setBackgroundColor(Color.rgb(231, 231, 239));
        } else {
            view.setBackgroundColor(0);
        }
        ((TextView) view.findViewById(2131427485)).setText(((C0637g) this.f28a.get(i)).m3197a());
        ((TextView) view.findViewById(2131427486)).setText(((C0637g) this.f28a.get(i)).m3198b());
        ((TextView) view.findViewById(2131427487)).setText(((C0637g) this.f28a.get(i)).m3199c());
        ((TextView) view.findViewById(2131427488)).setText(((C0637g) this.f28a.get(i)).m3200d());
        if (((C0637g) this.f28a.get(i)).m3201e() != null) {
            ((TextView) view.findViewById(2131427489)).setText(((C0637g) this.f28a.get(i)).m3201e());
        }
        if (((C0637g) this.f28a.get(i)).m3202f() != null) {
            ((TextView) view.findViewById(2131427505)).setText(((C0637g) this.f28a.get(i)).m3202f());
        }
        if (((C0637g) this.f28a.get(i)).m3203g() != null) {
            ((TextView) view.findViewById(2131427506)).setText(((C0637g) this.f28a.get(i)).m3203g());
        }
        return view;
    }
}
