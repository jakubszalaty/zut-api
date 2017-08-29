package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: a.j */
public class C0012j extends BaseAdapter {
    private Context f30a;
    private List<String> f31b;
    private List<String> f32c;

    public C0012j(Context context, List<String> list, List<String> list2) {
        this.f30a = context;
        this.f31b = list;
        this.f32c = list2;
    }

    public int getCount() {
        return this.f31b.size();
    }

    public Object getItem(int i) {
        return this.f31b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f30a.getSystemService("layout_inflater")).inflate(2130968645, viewGroup, false);
        }
        ((TextView) view.findViewById(2131427511)).setText((CharSequence) this.f31b.get(i));
        TextView textView = (TextView) view.findViewById(2131427512);
        textView.setTag(this.f31b.get(i));
        if (((String) this.f31b.get(i)).equals("Email") || ((String) this.f31b.get(i)).equals("Phone")) {
            textView.setTextColor(-16776961);
        }
        textView.setText((CharSequence) this.f32c.get(i));
        return view;
    }
}
