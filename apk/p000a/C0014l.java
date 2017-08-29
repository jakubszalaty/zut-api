package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: a.l */
public class C0014l extends BaseAdapter {
    private List<String> f35a;
    private List<String> f36b;
    private Context f37c;

    public C0014l(Context context, List<String> list, List<String> list2) {
        this.f37c = context;
        this.f35a = list;
        this.f36b = list2;
    }

    public int getCount() {
        return this.f35a.size();
    }

    public Object getItem(int i) {
        return this.f35a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f37c.getSystemService("layout_inflater")).inflate(2130968645, viewGroup, false);
        }
        ((TextView) view.findViewById(2131427511)).setText((CharSequence) this.f35a.get(i));
        TextView textView = (TextView) view.findViewById(2131427512);
        textView.setTag(this.f35a.get(i));
        if (((String) this.f35a.get(i)).equals("Email") || ((String) this.f35a.get(i)).equals("Phone")) {
            textView.setTextColor(-16776961);
        }
        textView.setText((CharSequence) this.f36b.get(i));
        return view;
    }
}
