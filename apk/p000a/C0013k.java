package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import p022b.C0642j;

/* renamed from: a.k */
public class C0013k extends BaseAdapter {
    private Context f33a;
    private List<C0642j> f34b;

    public C0013k(Context context, List<C0642j> list) {
        this.f33a = context;
        this.f34b = list;
    }

    public int getCount() {
        return this.f34b.size();
    }

    public Object getItem(int i) {
        return this.f34b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f33a.getSystemService("layout_inflater")).inflate(2130968633, viewGroup, false);
        }
        ((TextView) view.findViewById(2131427428)).setText(((C0642j) this.f34b.get(i)).m3209b());
        if (((C0642j) this.f34b.get(i)).m3211d() != null) {
            ((ImageView) view.findViewById(2131427477)).setImageBitmap(((C0642j) this.f34b.get(i)).m3211d());
        }
        return view;
    }
}
