package q;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import U7.a;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import c.C1999g;
import c.C2001i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3802l extends T7.a implements a.b {

    /* renamed from: A, reason: collision with root package name */
    public static final a f38028A = new a();

    /* renamed from: B, reason: collision with root package name */
    public static final String f38029B = C3802l.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public TextView f38030m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f38031n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f38032o;

    /* renamed from: p, reason: collision with root package name */
    public Button f38033p;

    /* renamed from: q, reason: collision with root package name */
    public Button f38034q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f38035r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f38036s;

    /* renamed from: t, reason: collision with root package name */
    public RecyclerView f38037t;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f38038u;

    /* renamed from: v, reason: collision with root package name */
    public ConstraintLayout f38039v;

    /* renamed from: w, reason: collision with root package name */
    public View f38040w;

    /* renamed from: x, reason: collision with root package name */
    public View f38041x;

    /* renamed from: y, reason: collision with root package name */
    public View f38042y;

    /* renamed from: z, reason: collision with root package name */
    public C3803m f38043z;

    /* renamed from: q.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void l(C3802l this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(C3802l this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static final void n(final C3802l this$0, View view) {
        RecyclerView.Adapter adapter;
        U7.a aVar;
        ?? r32;
        RecyclerView.Adapter adapter2;
        U7.a aVar2;
        ?? r42;
        RecyclerView.Adapter adapter3;
        U7.a aVar3;
        K7.a aVar4;
        List list;
        List list2;
        List list3;
        C1999g c1999g;
        AbstractC3255y.i(this$0, "this$0");
        ArrayList arrayList = null;
        arrayList = null;
        if (C2001i.f15552b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15543h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            } else {
                c1999g = null;
            }
            if (c1999g != null) {
                c1999g.h();
            }
        }
        C3803m c3803m = this$0.f38043z;
        if (c3803m == null) {
            AbstractC3255y.y("viewModel");
            c3803m = null;
        }
        RecyclerView recyclerView = this$0.f38035r;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter instanceof U7.a) {
            aVar = (U7.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null || (list3 = aVar.f10500a) == null) {
            r32 = 0;
        } else {
            r32 = new ArrayList(AbstractC1378t.x(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                r32.add(((U7.d) it.next()).f10539b);
            }
        }
        RecyclerView recyclerView2 = this$0.f38036s;
        if (recyclerView2 == null) {
            adapter2 = null;
        } else {
            adapter2 = recyclerView2.getAdapter();
        }
        if (adapter2 instanceof U7.a) {
            aVar2 = (U7.a) adapter2;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null || (list2 = aVar2.f10500a) == null) {
            r42 = 0;
        } else {
            r42 = new ArrayList(AbstractC1378t.x(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r42.add(((U7.d) it2.next()).f10539b);
            }
        }
        RecyclerView recyclerView3 = this$0.f38037t;
        if (recyclerView3 == null) {
            adapter3 = null;
        } else {
            adapter3 = recyclerView3.getAdapter();
        }
        if (adapter3 instanceof U7.a) {
            aVar3 = (U7.a) adapter3;
        } else {
            aVar3 = null;
        }
        if (aVar3 != null && (list = aVar3.f10500a) != null) {
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((U7.d) it3.next()).f10539b);
            }
        }
        if (r32 == 0) {
            r32 = AbstractC1378t.m();
        }
        if (r42 == 0) {
            r42 = AbstractC1378t.m();
        }
        List G02 = AbstractC1378t.G0(r32, r42);
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = AbstractC1378t.m();
        }
        List purposeSwitchItemList = AbstractC1378t.G0(G02, collection);
        c3803m.getClass();
        AbstractC3255y.i(purposeSwitchItemList, "purposeSwitchItemList");
        List list4 = c3803m.f38044a.f2811d;
        if (list4 != null) {
            F6.d.f2830a.b(list4, true, new C3804n(c3803m));
        }
        boolean z8 = purposeSwitchItemList instanceof Collection;
        if (!z8 || !purposeSwitchItemList.isEmpty()) {
            Iterator it4 = purposeSwitchItemList.iterator();
            while (it4.hasNext()) {
                if (!AbstractC3255y.d((Boolean) it4.next(), Boolean.FALSE)) {
                    if (!z8 || !purposeSwitchItemList.isEmpty()) {
                        Iterator it5 = purposeSwitchItemList.iterator();
                        while (it5.hasNext()) {
                            if (!AbstractC3255y.d((Boolean) it5.next(), Boolean.TRUE)) {
                                aVar4 = K7.a.ACCEPT_PARTIAL;
                                break;
                            }
                        }
                    }
                    aVar4 = K7.a.REJECT;
                    K7.m.f5260a.a(K7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            C3802l.m(C3802l.this, (String) obj);
                        }
                    });
                }
            }
        }
        aVar4 = K7.a.ACCEPT_ALL;
        K7.m.f5260a.a(K7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3802l.m(C3802l.this, (String) obj);
            }
        });
    }

    public static final void o(C3802l this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void p(final C3802l this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3803m c3803m = this$0.f38043z;
        if (c3803m == null) {
            AbstractC3255y.y("viewModel");
            c3803m = null;
        }
        c3803m.a().observe(this$0, new Observer() { // from class: q.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3802l.o(C3802l.this, (String) obj);
            }
        });
    }

    @Override // U7.a.b
    public void c(U7.d item) {
        AbstractC3255y.i(item, "item");
    }

    @Override // U7.a.b
    public void d(U7.d itemData) {
        Object obj;
        List list;
        AbstractC3255y.i(itemData, "item");
        C3803m c3803m = this.f38043z;
        F6.e eVar = null;
        Object obj2 = null;
        r1 = null;
        r1 = null;
        F6.f fVar = null;
        Object obj3 = null;
        if (c3803m == null) {
            AbstractC3255y.y("viewModel");
            c3803m = null;
        }
        c3803m.getClass();
        AbstractC3255y.i(itemData, "itemData");
        int ordinal = itemData.f10541d.ordinal();
        if (ordinal != 10) {
            if (ordinal == 11) {
                List list2 = c3803m.f38044a.f2811d;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Integer num = ((F6.e) obj).f2839a;
                            int b02 = AbstractC1371l.b0(F6.i.f2862c);
                            if (num != null && num.intValue() == b02) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    F6.e eVar2 = (F6.e) obj;
                    if (eVar2 != null && (list = eVar2.f2845g) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            Integer num2 = ((F6.f) next).f2847b;
                            int i8 = itemData.f10538a.f2642a;
                            if (num2 != null && num2.intValue() == i8) {
                                obj2 = next;
                                break;
                            }
                        }
                        fVar = (F6.f) obj2;
                    }
                }
                if (fVar != null) {
                    fVar.f2849d = itemData.f10539b;
                    return;
                }
                return;
            }
            return;
        }
        List list3 = c3803m.f38044a.f2811d;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                Integer num3 = ((F6.e) next2).f2839a;
                int i9 = itemData.f10538a.f2642a;
                if (num3 != null && num3.intValue() == i9) {
                    obj3 = next2;
                    break;
                }
            }
            eVar = (F6.e) obj3;
        }
        if (eVar != null) {
            eVar.f2842d = itemData.f10539b;
        }
    }

    public final U7.a k(List list) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        M7.c cVar = this.f10179j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f7257i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f7253e;
        }
        if (cVar == null) {
            num3 = null;
        } else {
            num3 = cVar.f7254f;
        }
        if (cVar == null) {
            num4 = null;
        } else {
            num4 = cVar.f7249a;
        }
        return new U7.a(list, this, null, null, num, num2, num3, num4, null, this.f10181l, 268);
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            C3803m c3803m = (C3803m) new ViewModelProvider(viewModelStore, new C3806p()).get(C3803m.class);
            this.f38043z = c3803m;
            if (c3803m == null) {
                AbstractC3255y.y("viewModel");
                c3803m = null;
            }
            c3803m.b(F6.i.f2861b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5862e, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        boolean U8;
        Button button;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = this.f10171b;
        if (textView != null) {
            textView.setText(getString(L1.e.f5886c));
        }
        this.f38030m = (TextView) view.findViewById(L1.b.f5799d1);
        this.f38035r = (RecyclerView) view.findViewById(L1.b.f5778V);
        this.f38031n = (TextView) view.findViewById(L1.b.f5802e1);
        this.f38032o = (TextView) view.findViewById(L1.b.f5840r0);
        this.f38033p = (Button) view.findViewById(L1.b.f5821l);
        this.f38034q = (Button) view.findViewById(L1.b.f5794c);
        this.f38036s = (RecyclerView) view.findViewById(L1.b.f5780W);
        this.f38037t = (RecyclerView) view.findViewById(L1.b.f5766P);
        this.f38038u = (FrameLayout) view.findViewById(L1.b.f5856z);
        this.f38039v = (ConstraintLayout) view.findViewById(L1.b.f5754J);
        this.f38040w = view.findViewById(L1.b.f5764O);
        this.f38041x = view.findViewById(L1.b.f5801e0);
        this.f38042y = view.findViewById(L1.b.f5824m);
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3802l.l(C3802l.this, view2);
                }
            });
        }
        C3803m c3803m = this.f38043z;
        if (c3803m == null) {
            AbstractC3255y.y("viewModel");
            c3803m = null;
        }
        List b8 = c3803m.b(F6.i.f2861b);
        if (!((ArrayList) b8).isEmpty()) {
            RecyclerView recyclerView = this.f38035r;
            if (recyclerView != null) {
                recyclerView.setAdapter(k(b8));
            }
            TextView textView2 = this.f38030m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.f38035r;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
            View view2 = this.f38040w;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f38030m;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            RecyclerView recyclerView3 = this.f38035r;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            View view3 = this.f38040w;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        C3803m c3803m2 = this.f38043z;
        if (c3803m2 == null) {
            AbstractC3255y.y("viewModel");
            c3803m2 = null;
        }
        c3803m2.getClass();
        ArrayList arrayList2 = new ArrayList();
        List list = c3803m2.f38044a.f2811d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((F6.e) obj).f2839a;
                if (num == null) {
                    U8 = false;
                } else {
                    U8 = AbstractC1371l.U(F6.i.f2862c, num.intValue());
                }
                if (U8) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<F6.f> list2 = ((F6.e) it.next()).f2845g;
                if (list2 != null) {
                    for (F6.f fVar : list2) {
                        Integer num2 = fVar.f2847b;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            String str = fVar.f2850e;
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(new U7.d(new E6.f(intValue, str), fVar.f2849d, null, U7.e.MSPA_SENSITIVE_PURPOSE, false, null, null, 116));
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            RecyclerView recyclerView4 = this.f38036s;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(k(arrayList2));
            }
            TextView textView4 = this.f38031n;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            RecyclerView recyclerView5 = this.f38036s;
            if (recyclerView5 != null) {
                recyclerView5.setVisibility(0);
            }
            View view4 = this.f38041x;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else {
            TextView textView5 = this.f38031n;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            RecyclerView recyclerView6 = this.f38036s;
            if (recyclerView6 != null) {
                recyclerView6.setVisibility(8);
            }
            View view5 = this.f38041x;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        C3803m c3803m3 = this.f38043z;
        if (c3803m3 == null) {
            AbstractC3255y.y("viewModel");
            c3803m3 = null;
        }
        List b9 = c3803m3.b(F6.i.f2863d);
        if (!((ArrayList) b9).isEmpty()) {
            RecyclerView recyclerView7 = this.f38037t;
            if (recyclerView7 != null) {
                recyclerView7.setAdapter(k(b9));
            }
            TextView textView6 = this.f38032o;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            RecyclerView recyclerView8 = this.f38037t;
            if (recyclerView8 != null) {
                recyclerView8.setVisibility(0);
            }
            View view6 = this.f38042y;
            if (view6 != null) {
                view6.setVisibility(0);
            }
        } else {
            TextView textView7 = this.f38032o;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            RecyclerView recyclerView9 = this.f38037t;
            if (recyclerView9 != null) {
                recyclerView9.setVisibility(8);
            }
            View view7 = this.f38042y;
            if (view7 != null) {
                view7.setVisibility(8);
            }
        }
        if (C2001i.f15552b) {
            getChildFragmentManager().beginTransaction().add(L1.b.f5856z, new C1999g(), C1999g.f15543h).addToBackStack(null).commit();
            FrameLayout frameLayout = this.f38038u;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout2 = this.f38038u;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        q();
        M7.c cVar = this.f10179j;
        if (cVar != null) {
            Integer num3 = cVar.f7255g;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                ConstraintLayout constraintLayout = this.f38039v;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue2);
                }
            }
            Integer num4 = cVar.f7257i;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView8 = this.f38030m;
                if (textView8 != null) {
                    textView8.setTextColor(intValue3);
                }
                TextView textView9 = this.f38031n;
                if (textView9 != null) {
                    textView9.setTextColor(intValue3);
                }
                TextView textView10 = this.f38032o;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num5 = cVar.f7261m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button2 = this.f38033p;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar.f7263o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f38033p;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        Typeface typeface = this.f10180k;
        if (typeface != null) {
            TextView textView11 = this.f38030m;
            if (textView11 != null) {
                textView11.setTypeface(typeface);
            }
            TextView textView12 = this.f38031n;
            if (textView12 != null) {
                textView12.setTypeface(typeface);
            }
            TextView textView13 = this.f38032o;
            if (textView13 != null) {
                textView13.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f10181l;
        if (typeface2 != null && (button = this.f38033p) != null) {
            button.setTypeface(typeface2);
        }
        C3803m c3803m4 = this.f38043z;
        if (c3803m4 == null) {
            AbstractC3255y.y("viewModel");
            c3803m4 = null;
        }
        c3803m4.getClass();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(c3803m4), C3347b0.b(), null, new C3805o(c3803m4, null), 2, null);
    }

    public final void q() {
        Button button = this.f38033p;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3802l.n(C3802l.this, view);
                }
            });
        }
        Button button2 = this.f38034q;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3802l.p(C3802l.this, view);
                }
            });
        }
    }
}
