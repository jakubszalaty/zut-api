package android.support.v4.p006a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.a.v */
class C0089v {

    /* renamed from: android.support.v4.a.v.b */
    public interface C0047b {
        View m98a();
    }

    /* renamed from: android.support.v4.a.v.1 */
    static class C00841 extends EpicenterCallback {
        final /* synthetic */ Rect f336a;

        C00841(Rect rect) {
            this.f336a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f336a;
        }
    }

    /* renamed from: android.support.v4.a.v.2 */
    static class C00852 implements OnPreDrawListener {
        final /* synthetic */ View f337a;
        final /* synthetic */ Transition f338b;
        final /* synthetic */ View f339c;
        final /* synthetic */ C0047b f340d;
        final /* synthetic */ Map f341e;
        final /* synthetic */ Map f342f;
        final /* synthetic */ ArrayList f343g;
        final /* synthetic */ Transition f344h;

        C00852(View view, Transition transition, View view2, C0047b c0047b, Map map, Map map2, ArrayList arrayList, Transition transition2) {
            this.f337a = view;
            this.f338b = transition;
            this.f339c = view2;
            this.f340d = c0047b;
            this.f341e = map;
            this.f342f = map2;
            this.f343g = arrayList;
            this.f344h = transition2;
        }

        public boolean onPreDraw() {
            this.f337a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f338b != null) {
                this.f338b.removeTarget(this.f339c);
            }
            if (this.f340d != null) {
                View a = this.f340d.m98a();
                if (a != null) {
                    if (!this.f341e.isEmpty()) {
                        C0089v.m384a(this.f342f, a);
                        this.f342f.keySet().retainAll(this.f341e.values());
                        for (Entry entry : this.f341e.entrySet()) {
                            View view = (View) this.f342f.get((String) entry.getValue());
                            if (view != null) {
                                view.setTransitionName((String) entry.getKey());
                            }
                        }
                    }
                    if (this.f338b != null) {
                        C0089v.m392b(this.f343g, a);
                        this.f343g.removeAll(this.f342f.values());
                        this.f343g.add(this.f339c);
                        C0089v.m391b(this.f338b, this.f343g);
                    }
                }
            }
            C0089v.m390b(this.f344h, this.f338b, this.f343g, true);
            return true;
        }
    }

    /* renamed from: android.support.v4.a.v.3 */
    static class C00863 extends EpicenterCallback {
        final /* synthetic */ C0088a f345a;
        private Rect f346b;

        C00863(C0088a c0088a) {
            this.f345a = c0088a;
        }

        public Rect onGetEpicenter(Transition transition) {
            if (this.f346b == null && this.f345a.f358a != null) {
                this.f346b = C0089v.m393c(this.f345a.f358a);
            }
            return this.f346b;
        }
    }

    /* renamed from: android.support.v4.a.v.4 */
    static class C00874 implements OnPreDrawListener {
        final /* synthetic */ View f347a;
        final /* synthetic */ Transition f348b;
        final /* synthetic */ ArrayList f349c;
        final /* synthetic */ Transition f350d;
        final /* synthetic */ ArrayList f351e;
        final /* synthetic */ Transition f352f;
        final /* synthetic */ ArrayList f353g;
        final /* synthetic */ Map f354h;
        final /* synthetic */ ArrayList f355i;
        final /* synthetic */ Transition f356j;
        final /* synthetic */ View f357k;

        C00874(View view, Transition transition, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4, View view2) {
            this.f347a = view;
            this.f348b = transition;
            this.f349c = arrayList;
            this.f350d = transition2;
            this.f351e = arrayList2;
            this.f352f = transition3;
            this.f353g = arrayList3;
            this.f354h = map;
            this.f355i = arrayList4;
            this.f356j = transition4;
            this.f357k = view2;
        }

        public boolean onPreDraw() {
            this.f347a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f348b != null) {
                C0089v.m381a(this.f348b, this.f349c);
                C0089v.m390b(this.f348b, this.f350d, this.f351e, false);
                C0089v.m390b(this.f348b, this.f352f, this.f353g, false);
            }
            if (this.f350d != null) {
                C0089v.m381a(this.f350d, this.f351e);
                C0089v.m390b(this.f350d, this.f348b, this.f349c, false);
                C0089v.m390b(this.f350d, this.f352f, this.f353g, false);
            }
            if (this.f352f != null) {
                C0089v.m381a(this.f352f, this.f353g);
            }
            for (Entry entry : this.f354h.entrySet()) {
                ((View) entry.getValue()).setTransitionName((String) entry.getKey());
            }
            int size = this.f355i.size();
            for (int i = 0; i < size; i++) {
                this.f356j.excludeTarget((View) this.f355i.get(i), false);
            }
            this.f356j.excludeTarget(this.f357k, false);
            return true;
        }
    }

    /* renamed from: android.support.v4.a.v.a */
    public static class C0088a {
        public View f358a;
    }

    public static Object m368a(Object obj) {
        return obj != null ? ((Transition) obj).clone() : obj;
    }

    public static Object m369a(Object obj, View view, ArrayList<View> arrayList, Map<String, View> map, View view2) {
        if (obj == null) {
            return obj;
        }
        C0089v.m392b((ArrayList) arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add(view2);
        C0089v.m391b((Transition) obj, (ArrayList) arrayList);
        return obj;
    }

    public static Object m370a(Object obj, Object obj2, Object obj3, boolean z) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null || transition2 == null) {
            z = true;
        }
        TransitionSet transitionSet;
        if (z) {
            transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 == null) {
                return transitionSet;
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 == null) {
            return transition4;
        }
        transitionSet = new TransitionSet();
        if (transition4 != null) {
            transitionSet.addTransition(transition4);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public static String m371a(View view) {
        return view.getTransitionName();
    }

    private static void m372a(Transition transition, C0088a c0088a) {
        if (transition != null) {
            transition.setEpicenterCallback(new C00863(c0088a));
        }
    }

    public static void m374a(View view, View view2, Object obj, ArrayList<View> arrayList, Object obj2, ArrayList<View> arrayList2, Object obj3, ArrayList<View> arrayList3, Object obj4, ArrayList<View> arrayList4, Map<String, View> map) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new C00874(view, transition, arrayList, transition2, arrayList2, transition3, arrayList3, map, arrayList4, transition4, view2));
        }
    }

    public static void m375a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void m376a(Object obj, View view) {
        ((Transition) obj).setEpicenterCallback(new C00841(C0089v.m393c(view)));
    }

    public static void m377a(Object obj, View view, Map<String, View> map, ArrayList<View> arrayList) {
        obj = (TransitionSet) obj;
        arrayList.clear();
        arrayList.addAll(map.values());
        List targets = obj.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0089v.m383a(targets, (View) arrayList.get(i));
        }
        arrayList.add(view);
        C0089v.m391b(obj, (ArrayList) arrayList);
    }

    public static void m378a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void m379a(Object obj, Object obj2, Object obj3, View view, C0047b c0047b, View view2, C0088a c0088a, Map<String, String> map, ArrayList<View> arrayList, ArrayList<View> arrayList2, Map<String, View> map2, Map<String, View> map3, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj3;
        Object obj4 = (Transition) obj2;
        C0089v.m390b(transition, transition2, arrayList2, true);
        if (obj != null || obj2 != null) {
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                C0089v.m377a(obj4, view2, (Map) map2, (ArrayList) arrayList3);
                C0089v.m390b(transition, obj4, arrayList3, true);
                C0089v.m390b(transition2, obj4, arrayList3, true);
            }
            view.getViewTreeObserver().addOnPreDrawListener(new C00852(view, transition, view2, c0047b, map, map3, arrayList, transition2));
            C0089v.m372a(transition, c0088a);
        }
    }

    public static void m380a(Object obj, Object obj2, Object obj3, ArrayList<View> arrayList, boolean z) {
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        C0089v.m390b((Transition) obj, transition2, arrayList, z);
        C0089v.m390b(transition, transition2, arrayList, z);
    }

    public static void m381a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                C0089v.m381a(transitionSet.getTransitionAt(i), (ArrayList) arrayList);
            }
        } else if (!C0089v.m385a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                for (transitionCount = arrayList.size() - 1; transitionCount >= 0; transitionCount--) {
                    transition.removeTarget((View) arrayList.get(transitionCount));
                }
            }
        }
    }

    private static void m383a(List<View> list, View view) {
        int size = list.size();
        if (!C0089v.m387a((List) list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!C0089v.m387a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void m384a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0089v.m384a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    private static boolean m385a(Transition transition) {
        return (C0089v.m386a(transition.getTargetIds()) && C0089v.m386a(transition.getTargetNames()) && C0089v.m386a(transition.getTargetTypes())) ? false : true;
    }

    private static boolean m386a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean m387a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static Object m389b(Object obj) {
        if (obj == null) {
            return null;
        }
        Transition transition = (Transition) obj;
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(transition);
        return transitionSet;
    }

    private static void m390b(Transition transition, Transition transition2, ArrayList<View> arrayList, boolean z) {
        if (transition != null) {
            int size = transition2 == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                transition.excludeTarget((View) arrayList.get(i), z);
            }
        }
    }

    public static void m391b(Object obj, ArrayList<View> arrayList) {
        int i = 0;
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                C0089v.m391b(transitionSet.getTransitionAt(i), (ArrayList) arrayList);
                i++;
            }
        } else if (!C0089v.m385a(transition) && C0089v.m386a(transition.getTargets())) {
            int size = arrayList.size();
            for (transitionCount = 0; transitionCount < size; transitionCount++) {
                transition.addTarget((View) arrayList.get(transitionCount));
            }
        }
    }

    private static void m392b(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0089v.m392b((ArrayList) arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    private static Rect m393c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }
}
