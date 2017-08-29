package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p022b.C0636f;

/* renamed from: a.h */
public class C0010h extends BaseAdapter {
    private List<C0636f> f26a;
    private Context f27b;

    public C0010h(Context context, List<C0636f> list) {
        this.f27b = context;
        this.f26a = list;
    }

    public int getCount() {
        return this.f26a.size();
    }

    public Object getItem(int i) {
        return this.f26a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f27b.getSystemService("layout_inflater")).inflate(2130968642, viewGroup, false);
        }
        view.setBackgroundColor(0);
        ((TextView) view.findViewById(2131427485)).setText(((C0636f) this.f26a.get(i)).m3193a());
        ((TextView) view.findViewById(2131427486)).setText(((C0636f) this.f26a.get(i)).m3194b());
        ((TextView) view.findViewById(2131427487)).setText(((C0636f) this.f26a.get(i)).m3195c());
        ((TextView) view.findViewById(2131427488)).setText(((C0636f) this.f26a.get(i)).m3196d());
        return view;
    }
}
