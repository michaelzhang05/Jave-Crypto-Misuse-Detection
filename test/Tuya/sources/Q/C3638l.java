package q;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import R7.a;
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
import c.C1893g;
import c.C1895i;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3638l extends Q7.a implements a.b {

    /* renamed from: A, reason: collision with root package name */
    public static final a f37167A = new a();

    /* renamed from: B, reason: collision with root package name */
    public static final String f37168B = C3638l.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public TextView f37169m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f37170n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f37171o;

    /* renamed from: p, reason: collision with root package name */
    public Button f37172p;

    /* renamed from: q, reason: collision with root package name */
    public Button f37173q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f37174r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f37175s;

    /* renamed from: t, reason: collision with root package name */
    public RecyclerView f37176t;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f37177u;

    /* renamed from: v, reason: collision with root package name */
    public ConstraintLayout f37178v;

    /* renamed from: w, reason: collision with root package name */
    public View f37179w;

    /* renamed from: x, reason: collision with root package name */
    public View f37180x;

    /* renamed from: y, reason: collision with root package name */
    public View f37181y;

    /* renamed from: z, reason: collision with root package name */
    public C3639m f37182z;

    /* renamed from: q.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void l(C3638l this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(C3638l this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
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
    public static final void n(final C3638l this$0, View view) {
        RecyclerView.Adapter adapter;
        R7.a aVar;
        ?? r32;
        RecyclerView.Adapter adapter2;
        R7.a aVar2;
        ?? r42;
        RecyclerView.Adapter adapter3;
        R7.a aVar3;
        H7.a aVar4;
        List list;
        List list2;
        List list3;
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        ArrayList arrayList = null;
        arrayList = null;
        if (C1895i.f14840b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14831h);
            if (findFragmentByTag instanceof C1893g) {
                c1893g = (C1893g) findFragmentByTag;
            } else {
                c1893g = null;
            }
            if (c1893g != null) {
                c1893g.h();
            }
        }
        C3639m c3639m = this$0.f37182z;
        if (c3639m == null) {
            AbstractC3159y.y("viewModel");
            c3639m = null;
        }
        RecyclerView recyclerView = this$0.f37174r;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter instanceof R7.a) {
            aVar = (R7.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null || (list3 = aVar.f8874a) == null) {
            r32 = 0;
        } else {
            r32 = new ArrayList(AbstractC1246t.x(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                r32.add(((R7.d) it.next()).f8913b);
            }
        }
        RecyclerView recyclerView2 = this$0.f37175s;
        if (recyclerView2 == null) {
            adapter2 = null;
        } else {
            adapter2 = recyclerView2.getAdapter();
        }
        if (adapter2 instanceof R7.a) {
            aVar2 = (R7.a) adapter2;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null || (list2 = aVar2.f8874a) == null) {
            r42 = 0;
        } else {
            r42 = new ArrayList(AbstractC1246t.x(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r42.add(((R7.d) it2.next()).f8913b);
            }
        }
        RecyclerView recyclerView3 = this$0.f37176t;
        if (recyclerView3 == null) {
            adapter3 = null;
        } else {
            adapter3 = recyclerView3.getAdapter();
        }
        if (adapter3 instanceof R7.a) {
            aVar3 = (R7.a) adapter3;
        } else {
            aVar3 = null;
        }
        if (aVar3 != null && (list = aVar3.f8874a) != null) {
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((R7.d) it3.next()).f8913b);
            }
        }
        if (r32 == 0) {
            r32 = AbstractC1246t.m();
        }
        if (r42 == 0) {
            r42 = AbstractC1246t.m();
        }
        List G02 = AbstractC1246t.G0(r32, r42);
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = AbstractC1246t.m();
        }
        List purposeSwitchItemList = AbstractC1246t.G0(G02, collection);
        c3639m.getClass();
        AbstractC3159y.i(purposeSwitchItemList, "purposeSwitchItemList");
        List list4 = c3639m.f37183a.f1301d;
        if (list4 != null) {
            C6.d.f1320a.b(list4, true, new C3640n(c3639m));
        }
        boolean z8 = purposeSwitchItemList instanceof Collection;
        if (!z8 || !purposeSwitchItemList.isEmpty()) {
            Iterator it4 = purposeSwitchItemList.iterator();
            while (it4.hasNext()) {
                if (!AbstractC3159y.d((Boolean) it4.next(), Boolean.FALSE)) {
                    if (!z8 || !purposeSwitchItemList.isEmpty()) {
                        Iterator it5 = purposeSwitchItemList.iterator();
                        while (it5.hasNext()) {
                            if (!AbstractC3159y.d((Boolean) it5.next(), Boolean.TRUE)) {
                                aVar4 = H7.a.ACCEPT_PARTIAL;
                                break;
                            }
                        }
                    }
                    aVar4 = H7.a.REJECT;
                    H7.m.f3657a.a(H7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            C3638l.m(C3638l.this, (String) obj);
                        }
                    });
                }
            }
        }
        aVar4 = H7.a.ACCEPT_ALL;
        H7.m.f3657a.a(H7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3638l.m(C3638l.this, (String) obj);
            }
        });
    }

    public static final void o(C3638l this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void p(final C3638l this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3639m c3639m = this$0.f37182z;
        if (c3639m == null) {
            AbstractC3159y.y("viewModel");
            c3639m = null;
        }
        c3639m.a().observe(this$0, new Observer() { // from class: q.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3638l.o(C3638l.this, (String) obj);
            }
        });
    }

    @Override // R7.a.b
    public void b(R7.d item) {
        AbstractC3159y.i(item, "item");
    }

    @Override // R7.a.b
    public void d(R7.d itemData) {
        Object obj;
        List list;
        AbstractC3159y.i(itemData, "item");
        C3639m c3639m = this.f37182z;
        C6.e eVar = null;
        Object obj2 = null;
        r1 = null;
        r1 = null;
        C6.f fVar = null;
        Object obj3 = null;
        if (c3639m == null) {
            AbstractC3159y.y("viewModel");
            c3639m = null;
        }
        c3639m.getClass();
        AbstractC3159y.i(itemData, "itemData");
        int ordinal = itemData.f8915d.ordinal();
        if (ordinal != 10) {
            if (ordinal == 11) {
                List list2 = c3639m.f37183a.f1301d;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Integer num = ((C6.e) obj).f1329a;
                            int b02 = AbstractC1239l.b0(C6.i.f1352c);
                            if (num != null && num.intValue() == b02) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C6.e eVar2 = (C6.e) obj;
                    if (eVar2 != null && (list = eVar2.f1335g) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            Integer num2 = ((C6.f) next).f1337b;
                            int i8 = itemData.f8912a.f1047a;
                            if (num2 != null && num2.intValue() == i8) {
                                obj2 = next;
                                break;
                            }
                        }
                        fVar = (C6.f) obj2;
                    }
                }
                if (fVar != null) {
                    fVar.f1339d = itemData.f8913b;
                    return;
                }
                return;
            }
            return;
        }
        List list3 = c3639m.f37183a.f1301d;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                Integer num3 = ((C6.e) next2).f1329a;
                int i9 = itemData.f8912a.f1047a;
                if (num3 != null && num3.intValue() == i9) {
                    obj3 = next2;
                    break;
                }
            }
            eVar = (C6.e) obj3;
        }
        if (eVar != null) {
            eVar.f1332d = itemData.f8913b;
        }
    }

    public final R7.a k(List list) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        J7.c cVar = this.f8382j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f5551i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f5547e;
        }
        if (cVar == null) {
            num3 = null;
        } else {
            num3 = cVar.f5548f;
        }
        if (cVar == null) {
            num4 = null;
        } else {
            num4 = cVar.f5543a;
        }
        return new R7.a(list, this, null, null, num, num2, num3, num4, null, this.f8384l, 268);
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            C3639m c3639m = (C3639m) new ViewModelProvider(viewModelStore, new C3642p()).get(C3639m.class);
            this.f37182z = c3639m;
            if (c3639m == null) {
                AbstractC3159y.y("viewModel");
                c3639m = null;
            }
            c3639m.b(C6.i.f1351b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3867e, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        boolean U7;
        Button button;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = this.f8374b;
        if (textView != null) {
            textView.setText(getString(I1.e.f3891c));
        }
        this.f37169m = (TextView) view.findViewById(I1.b.f3804d1);
        this.f37174r = (RecyclerView) view.findViewById(I1.b.f3783V);
        this.f37170n = (TextView) view.findViewById(I1.b.f3807e1);
        this.f37171o = (TextView) view.findViewById(I1.b.f3845r0);
        this.f37172p = (Button) view.findViewById(I1.b.f3826l);
        this.f37173q = (Button) view.findViewById(I1.b.f3799c);
        this.f37175s = (RecyclerView) view.findViewById(I1.b.f3785W);
        this.f37176t = (RecyclerView) view.findViewById(I1.b.f3771P);
        this.f37177u = (FrameLayout) view.findViewById(I1.b.f3861z);
        this.f37178v = (ConstraintLayout) view.findViewById(I1.b.f3759J);
        this.f37179w = view.findViewById(I1.b.f3769O);
        this.f37180x = view.findViewById(I1.b.f3806e0);
        this.f37181y = view.findViewById(I1.b.f3829m);
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3638l.l(C3638l.this, view2);
                }
            });
        }
        C3639m c3639m = this.f37182z;
        if (c3639m == null) {
            AbstractC3159y.y("viewModel");
            c3639m = null;
        }
        List b8 = c3639m.b(C6.i.f1351b);
        if (!((ArrayList) b8).isEmpty()) {
            RecyclerView recyclerView = this.f37174r;
            if (recyclerView != null) {
                recyclerView.setAdapter(k(b8));
            }
            TextView textView2 = this.f37169m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.f37174r;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
            View view2 = this.f37179w;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f37169m;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            RecyclerView recyclerView3 = this.f37174r;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            View view3 = this.f37179w;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        C3639m c3639m2 = this.f37182z;
        if (c3639m2 == null) {
            AbstractC3159y.y("viewModel");
            c3639m2 = null;
        }
        c3639m2.getClass();
        ArrayList arrayList2 = new ArrayList();
        List list = c3639m2.f37183a.f1301d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((C6.e) obj).f1329a;
                if (num == null) {
                    U7 = false;
                } else {
                    U7 = AbstractC1239l.U(C6.i.f1352c, num.intValue());
                }
                if (U7) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<C6.f> list2 = ((C6.e) it.next()).f1335g;
                if (list2 != null) {
                    for (C6.f fVar : list2) {
                        Integer num2 = fVar.f1337b;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            String str = fVar.f1340e;
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(new R7.d(new B6.f(intValue, str), fVar.f1339d, null, R7.e.MSPA_SENSITIVE_PURPOSE, false, null, null, 116));
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            RecyclerView recyclerView4 = this.f37175s;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(k(arrayList2));
            }
            TextView textView4 = this.f37170n;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            RecyclerView recyclerView5 = this.f37175s;
            if (recyclerView5 != null) {
                recyclerView5.setVisibility(0);
            }
            View view4 = this.f37180x;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else {
            TextView textView5 = this.f37170n;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            RecyclerView recyclerView6 = this.f37175s;
            if (recyclerView6 != null) {
                recyclerView6.setVisibility(8);
            }
            View view5 = this.f37180x;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        C3639m c3639m3 = this.f37182z;
        if (c3639m3 == null) {
            AbstractC3159y.y("viewModel");
            c3639m3 = null;
        }
        List b9 = c3639m3.b(C6.i.f1353d);
        if (!((ArrayList) b9).isEmpty()) {
            RecyclerView recyclerView7 = this.f37176t;
            if (recyclerView7 != null) {
                recyclerView7.setAdapter(k(b9));
            }
            TextView textView6 = this.f37171o;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            RecyclerView recyclerView8 = this.f37176t;
            if (recyclerView8 != null) {
                recyclerView8.setVisibility(0);
            }
            View view6 = this.f37181y;
            if (view6 != null) {
                view6.setVisibility(0);
            }
        } else {
            TextView textView7 = this.f37171o;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            RecyclerView recyclerView9 = this.f37176t;
            if (recyclerView9 != null) {
                recyclerView9.setVisibility(8);
            }
            View view7 = this.f37181y;
            if (view7 != null) {
                view7.setVisibility(8);
            }
        }
        if (C1895i.f14840b) {
            getChildFragmentManager().beginTransaction().add(I1.b.f3861z, new C1893g(), C1893g.f14831h).addToBackStack(null).commit();
            FrameLayout frameLayout = this.f37177u;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout2 = this.f37177u;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        q();
        J7.c cVar = this.f8382j;
        if (cVar != null) {
            Integer num3 = cVar.f5549g;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                ConstraintLayout constraintLayout = this.f37178v;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue2);
                }
            }
            Integer num4 = cVar.f5551i;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView8 = this.f37169m;
                if (textView8 != null) {
                    textView8.setTextColor(intValue3);
                }
                TextView textView9 = this.f37170n;
                if (textView9 != null) {
                    textView9.setTextColor(intValue3);
                }
                TextView textView10 = this.f37171o;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num5 = cVar.f5555m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button2 = this.f37172p;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar.f5557o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f37172p;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        Typeface typeface = this.f8383k;
        if (typeface != null) {
            TextView textView11 = this.f37169m;
            if (textView11 != null) {
                textView11.setTypeface(typeface);
            }
            TextView textView12 = this.f37170n;
            if (textView12 != null) {
                textView12.setTypeface(typeface);
            }
            TextView textView13 = this.f37171o;
            if (textView13 != null) {
                textView13.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f8384l;
        if (typeface2 != null && (button = this.f37172p) != null) {
            button.setTypeface(typeface2);
        }
        C3639m c3639m4 = this.f37182z;
        if (c3639m4 == null) {
            AbstractC3159y.y("viewModel");
            c3639m4 = null;
        }
        c3639m4.getClass();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(c3639m4), C2812b0.b(), null, new C3641o(c3639m4, null), 2, null);
    }

    public final void q() {
        Button button = this.f37172p;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3638l.n(C3638l.this, view);
                }
            });
        }
        Button button2 = this.f37173q;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3638l.p(C3638l.this, view);
                }
            });
        }
    }
}
