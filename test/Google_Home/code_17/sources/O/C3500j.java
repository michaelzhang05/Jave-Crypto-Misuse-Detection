package o;

import T7.i;
import U7.a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.AbstractC2055a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3500j extends T7.a implements a.b {

    /* renamed from: t, reason: collision with root package name */
    public static final a f35755t = new a();

    /* renamed from: u, reason: collision with root package name */
    public static final String f35756u = C3500j.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f35757m;

    /* renamed from: n, reason: collision with root package name */
    public Button f35758n;

    /* renamed from: o, reason: collision with root package name */
    public Button f35759o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f35760p;

    /* renamed from: q, reason: collision with root package name */
    public C3503m f35761q;

    /* renamed from: r, reason: collision with root package name */
    public v5.k f35762r;

    /* renamed from: s, reason: collision with root package name */
    public U7.a f35763s;

    /* renamed from: o.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void k(PopupWindow mypopupWindow, C3500j this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5893j));
        }
        C3503m c3503m = this$0.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        c3503m.e(E5.j.ALL_VENDORS);
        this$0.v();
    }

    public static final void m(C3500j this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void n(C3500j this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, View view) {
        Integer num;
        Integer num2;
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        M7.c cVar = this$0.f10179j;
        if (cVar != null && (num2 = cVar.f7255g) != null) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
        M7.c cVar2 = this$0.f10179j;
        if (cVar2 != null && (num = cVar2.f7259k) != null) {
            int intValue = num.intValue();
            if (textView != null) {
                textView.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView2 != null) {
                textView2.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView3 != null) {
                textView3.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void o(PopupWindow mypopupWindow, C3500j this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5894k));
        }
        C3503m c3503m = this$0.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        c3503m.e(E5.j.IAB_VENDORS);
        this$0.v();
    }

    public static final void p(C3500j this$0, View view) {
        E6.f fVar;
        Map map;
        AbstractC3255y.i(this$0, "this$0");
        C3503m c3503m = this$0.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        E6.e eVar = c3503m.f35767a.f976a;
        if (eVar != null && (map = eVar.f2638i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((E6.l) entry.getValue()).f2650e.isEmpty()) {
                    c3503m.f35767a.f971C.unset(((E6.l) entry.getValue()).f2642a);
                }
            }
        }
        for (H6.d dVar : c3503m.f35769c.f3921a) {
            if (!dVar.f3920g.isEmpty()) {
                c3503m.f35767a.f972D.unset(dVar.f3914a);
            }
        }
        Map i8 = c3503m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3503m.f35767a.f994s.unset(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        U7.d h8 = c3503m.h();
        if (h8 != null && (fVar = h8.f10538a) != null) {
            c3503m.f35767a.f996u.unset(fVar.f2642a);
        }
        K7.m mVar = K7.m.f5260a;
        K7.n navigationTag = K7.n.OBJECT_ALL_LEGITIMATE;
        AbstractC3255y.i(navigationTag, "navigationTag");
        R7.d.f9662a.n().getClass();
        K7.m.f5262c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    public static final void q(PopupWindow mypopupWindow, C3500j this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5895l));
        }
        C3503m c3503m = this$0.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        c3503m.e(E5.j.NON_IAB_VENDORS);
        this$0.v();
    }

    public static final void r(C3500j this$0, View view) {
        E6.f fVar;
        Map map;
        AbstractC3255y.i(this$0, "this$0");
        C3503m c3503m = this$0.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        E6.e eVar = c3503m.f35767a.f976a;
        if (eVar != null && (map = eVar.f2638i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((E6.l) entry.getValue()).f2650e.isEmpty()) {
                    c3503m.f35767a.f971C.set(((E6.l) entry.getValue()).f2642a);
                }
            }
        }
        for (H6.d dVar : c3503m.f35769c.f3921a) {
            if (!dVar.f3920g.isEmpty()) {
                c3503m.f35767a.f972D.set(dVar.f3914a);
            }
        }
        Map i8 = c3503m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3503m.f35767a.f994s.set(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        U7.d h8 = c3503m.h();
        if (h8 != null && (fVar = h8.f10538a) != null) {
            c3503m.f35767a.f996u.set(fVar.f2642a);
        }
        K7.m mVar = K7.m.f5260a;
        K7.n navigationTag = K7.n.ACCEPT_ALL_LEGITIMATE;
        AbstractC3255y.i(navigationTag, "navigationTag");
        R7.d.f9662a.n().getClass();
        K7.m.f5262c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U7.a.b
    public void c(U7.d item) {
        String str;
        C5.f fVar;
        String str2;
        String str3;
        String str4;
        E6.c cVar;
        String str5;
        String num;
        AbstractC3255y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            E6.f fVar2 = item.f10538a;
            if (fVar2 instanceof E6.l) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str6 = C5.f.f1569I;
                if (supportFragmentManager.findFragmentByTag(str6) == null) {
                    E6.f fVar3 = item.f10538a;
                    if (fVar3 instanceof E6.l) {
                        String str7 = fVar3.f2643b;
                        String str8 = ((E6.l) fVar3).f2648c;
                        C3503m c3503m = this.f35761q;
                        if (c3503m == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m = null;
                        }
                        String a8 = c3503m.a(((E6.l) item.f10538a).f2650e, E5.a.PURPOSE);
                        C3503m c3503m2 = this.f35761q;
                        if (c3503m2 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m2 = null;
                        }
                        String a9 = c3503m2.a(((E6.l) item.f10538a).f2652g, E5.a.SPECIAL_PURPOSE);
                        C3503m c3503m3 = this.f35761q;
                        if (c3503m3 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m3 = null;
                        }
                        String a10 = c3503m3.a(((E6.l) item.f10538a).f2653h, E5.a.FEATURE);
                        C3503m c3503m4 = this.f35761q;
                        if (c3503m4 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m4 = null;
                        }
                        String a11 = c3503m4.a(((E6.l) item.f10538a).f2654i, E5.a.SPECIAL_FEATURE);
                        C3503m c3503m5 = this.f35761q;
                        if (c3503m5 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m5 = null;
                        }
                        String a12 = c3503m5.a(((E6.l) item.f10538a).f2659n, E5.a.DATA_DECLARATION);
                        String str9 = ((E6.l) item.f10538a).f2655j;
                        C3503m c3503m6 = this.f35761q;
                        if (c3503m6 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m6 = null;
                        }
                        int i8 = ((E6.l) item.f10538a).f2657l;
                        c3503m6.getClass();
                        if (i8 < 0) {
                            str = str6;
                            str2 = "";
                        } else {
                            float f8 = i8 / 86400.0f;
                            str = str6;
                            if (f8 >= 1.0f) {
                                str2 = AbstractC2055a.d(f8) + ' ' + c3503m6.f35770d.g().f7379i;
                            } else {
                                str2 = i8 + ' ' + c3503m6.f35770d.g().f7380j;
                            }
                        }
                        C3503m c3503m7 = this.f35761q;
                        if (c3503m7 == null) {
                            AbstractC3255y.y("viewModel");
                            c3503m7 = null;
                        }
                        Boolean bool = ((E6.l) item.f10538a).f2658m;
                        c3503m7.getClass();
                        if (AbstractC3255y.d(bool, Boolean.TRUE)) {
                            str4 = c3503m7.f35770d.g().f7383m;
                        } else if (!AbstractC3255y.d(bool, Boolean.FALSE)) {
                            str3 = "";
                            cVar = ((E6.l) item.f10538a).f2660o;
                            if (cVar == null || (num = Integer.valueOf(cVar.f2627a).toString()) == null) {
                                str5 = "";
                            } else {
                                str5 = num;
                            }
                            E6.f fVar4 = item.f10538a;
                            C5.a args = new C5.a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar4.f2642a, item.f10541d, ((E6.l) fVar4).f2661p, "Error: cannot load vendor file", 4);
                            AbstractC3255y.i(args, "args");
                            fVar = new C5.f();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("partner_detail_args", args);
                            fVar.setArguments(bundle);
                        } else {
                            str4 = c3503m7.f35770d.g().f7384n;
                        }
                        str3 = str4;
                        cVar = ((E6.l) item.f10538a).f2660o;
                        if (cVar == null) {
                            str5 = num;
                            E6.f fVar42 = item.f10538a;
                            C5.a args2 = new C5.a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar42.f2642a, item.f10541d, ((E6.l) fVar42).f2661p, "Error: cannot load vendor file", 4);
                            AbstractC3255y.i(args2, "args");
                            fVar = new C5.f();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("partner_detail_args", args2);
                            fVar.setArguments(bundle2);
                        }
                        str5 = "";
                        E6.f fVar422 = item.f10538a;
                        C5.a args22 = new C5.a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar422.f2642a, item.f10541d, ((E6.l) fVar422).f2661p, "Error: cannot load vendor file", 4);
                        AbstractC3255y.i(args22, "args");
                        fVar = new C5.f();
                        Bundle bundle22 = new Bundle();
                        bundle22.putParcelable("partner_detail_args", args22);
                        fVar.setArguments(bundle22);
                    } else {
                        str = str6;
                        fVar = null;
                    }
                    if (fVar != null) {
                        activity.getSupportFragmentManager().beginTransaction().add(fVar, str).commit();
                        return;
                    }
                    return;
                }
                return;
            }
            if (fVar2 instanceof E6.g) {
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                i.a aVar = T7.i.f10207y;
                String str10 = T7.i.f10208z;
                if (supportFragmentManager2.findFragmentByTag(str10) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    E6.f fVar5 = item.f10538a;
                    String str11 = fVar5.f2643b;
                    String a13 = ((E6.g) fVar5).a();
                    String b8 = ((E6.g) item.f10538a).b();
                    v5.k kVar = this.f35762r;
                    if (kVar == null) {
                        AbstractC3255y.y("optionsViewModel");
                        kVar = null;
                    }
                    String str12 = kVar.f40295f.f().f7363i;
                    v5.k kVar2 = this.f35762r;
                    if (kVar2 == null) {
                        AbstractC3255y.y("optionsViewModel");
                        kVar2 = null;
                    }
                    String str13 = kVar2.f40295f.f().f7368n;
                    int i9 = item.f10538a.f2642a;
                    U7.e eVar = item.f10541d;
                    C3503m c3503m8 = this.f35761q;
                    if (c3503m8 == null) {
                        AbstractC3255y.y("viewModel");
                        c3503m8 = null;
                    }
                    beginTransaction.add(aVar.b(str11, a13, b8, str12, str13, i9, eVar, true, c3503m8.f35776j), str10).commit();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01de  */
    @Override // U7.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(U7.d r9) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3500j.d(U7.d):void");
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f35759o;
        boolean z9 = false;
        if (button != null) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z8 = true;
                        break;
                    }
                }
            }
            z8 = false;
            button.setEnabled(z8);
        }
        Button button2 = this.f35758n;
        if (button2 != null) {
            if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
            }
            button2.setEnabled(z9);
        }
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f35761q = (C3503m) new ViewModelProvider(viewModelStore, new n()).get(C3503m.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore2, "it.viewModelStore");
            this.f35762r = (v5.k) new ViewModelProvider(viewModelStore2, new v5.l()).get(v5.k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5860c, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…terest, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        C3503m c3503m = this.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        SearchView searchView = this.f10174e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        c3503m.f35777k = hasFocus;
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        SearchView searchView;
        Integer num5;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f35757m = (ConstraintLayout) view.findViewById(L1.b.f5746F);
        this.f35758n = (Button) view.findViewById(L1.b.f5818k);
        this.f35759o = (Button) view.findViewById(L1.b.f5812i);
        this.f35760p = (RecyclerView) view.findViewById(L1.b.f5789a0);
        C3503m c3503m = this.f35761q;
        C3503m c3503m2 = null;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        c3503m.getClass();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(c3503m), C3347b0.b(), null, new C3502l(c3503m, null), 2, null);
        TextView textView = this.f10171b;
        if (textView != null) {
            C3503m c3503m3 = this.f35761q;
            if (c3503m3 == null) {
                AbstractC3255y.y("viewModel");
                c3503m3 = null;
            }
            textView.setText(c3503m3.f35770d.e().f7329a);
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3500j.m(C3500j.this, view2);
                }
            });
            C3503m c3503m4 = this.f35761q;
            if (c3503m4 == null) {
                AbstractC3255y.y("viewModel");
                c3503m4 = null;
            }
            imageView.setContentDescription(c3503m4.f35770d.e().f7339k);
        }
        x();
        SearchView searchView2 = this.f10174e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f10174e;
        if (searchView3 != null) {
            C3503m c3503m5 = this.f35761q;
            if (c3503m5 == null) {
                AbstractC3255y.y("viewModel");
                c3503m5 = null;
            }
            searchView3.setQueryHint(c3503m5.f35770d.e().f7334f);
        }
        SearchView searchView4 = this.f10174e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new C3501k(this));
        }
        C3503m c3503m6 = this.f35761q;
        if (c3503m6 == null) {
            AbstractC3255y.y("viewModel");
            c3503m6 = null;
        }
        List c8 = C3503m.c(c3503m6, null, 1);
        C3503m c3503m7 = this.f35761q;
        if (c3503m7 == null) {
            AbstractC3255y.y("viewModel");
            c3503m7 = null;
        }
        String str = c3503m7.f35770d.e().f7330b;
        C3503m c3503m8 = this.f35761q;
        if (c3503m8 == null) {
            AbstractC3255y.y("viewModel");
            c3503m8 = null;
        }
        String str2 = c3503m8.f35770d.e().f7331c;
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
        this.f35763s = new U7.a(c8, this, str, str2, num, num2, num3, num4, this.f10180k, this.f10181l);
        RecyclerView recyclerView = this.f35760p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            U7.a aVar = this.f35763s;
            if (aVar == null) {
                AbstractC3255y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        w();
        M7.c cVar2 = this.f10179j;
        if (cVar2 != null && (num5 = cVar2.f7255g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f35757m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        Button button = this.f35759o;
        if (button != null) {
            ColorStateList t8 = t();
            if (t8 != null) {
                button.setTextColor(t8);
            }
            ColorStateList s8 = s();
            if (s8 != null) {
                button.setBackgroundTintList(s8);
            }
        }
        Button button2 = this.f35758n;
        if (button2 != null) {
            ColorStateList t9 = t();
            if (t9 != null) {
                button2.setTextColor(t9);
            }
            ColorStateList s9 = s();
            if (s9 != null) {
                button2.setBackgroundTintList(s9);
            }
        }
        Typeface typeface = this.f10181l;
        if (typeface != null) {
            Button button3 = this.f35759o;
            if (button3 != null) {
                button3.setTypeface(typeface);
            }
            Button button4 = this.f35758n;
            if (button4 != null) {
                button4.setTypeface(typeface);
            }
        }
        C3503m c3503m9 = this.f35761q;
        if (c3503m9 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c3503m2 = c3503m9;
        }
        if (c3503m2.f35777k && (searchView = this.f10174e) != null) {
            searchView.requestFocus();
        }
    }

    public final ColorStateList s() {
        Integer num;
        M7.c cVar = this.f10179j;
        if (cVar == null || (num = cVar.f7263o) == null || cVar.f7264p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f7264p.intValue()});
    }

    public final ColorStateList t() {
        Integer num;
        M7.c cVar = this.f10179j;
        if (cVar == null || (num = cVar.f7261m) == null || cVar.f7262n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f7262n.intValue()});
    }

    public final void u() {
        U7.a aVar = this.f35763s;
        C3503m c3503m = null;
        if (aVar == null) {
            AbstractC3255y.y("switchAdapter");
            aVar = null;
        }
        C3503m c3503m2 = this.f35761q;
        if (c3503m2 == null) {
            AbstractC3255y.y("viewModel");
            c3503m2 = null;
        }
        aVar.b(C3503m.c(c3503m2, null, 1), false);
        SearchView searchView = this.f10174e;
        if (searchView != null) {
            searchView.setQuery("", false);
        }
        C3503m c3503m3 = this.f35761q;
        if (c3503m3 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c3503m = c3503m3;
        }
        l(c3503m.d());
    }

    public final void v() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f10174e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            U7.a aVar = this.f35763s;
            C3503m c3503m = null;
            if (aVar == null) {
                AbstractC3255y.y("switchAdapter");
                aVar = null;
            }
            C3503m c3503m2 = this.f35761q;
            if (c3503m2 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                c3503m = c3503m2;
            }
            List b8 = c3503m.b(query.toString());
            if (query.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.b(b8, z8);
        }
    }

    public final void w() {
        Button button = this.f35759o;
        C3503m c3503m = null;
        if (button != null) {
            C3503m c3503m2 = this.f35761q;
            if (c3503m2 == null) {
                AbstractC3255y.y("viewModel");
                c3503m2 = null;
            }
            button.setText(c3503m2.f35770d.e().f7333e);
        }
        C3503m c3503m3 = this.f35761q;
        if (c3503m3 == null) {
            AbstractC3255y.y("viewModel");
            c3503m3 = null;
        }
        l(c3503m3.d());
        Button button2 = this.f35759o;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: o.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3500j.p(C3500j.this, view);
                }
            });
        }
        Button button3 = this.f35758n;
        if (button3 != null) {
            C3503m c3503m4 = this.f35761q;
            if (c3503m4 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                c3503m = c3503m4;
            }
            button3.setText(c3503m.f35770d.e().f7332d);
        }
        Button button4 = this.f35758n;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: o.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3500j.r(C3500j.this, view);
                }
            });
        }
    }

    public final void x() {
        ImageView imageView;
        C3503m c3503m = this.f35761q;
        if (c3503m == null) {
            AbstractC3255y.y("viewModel");
            c3503m = null;
        }
        if (!c3503m.f35769c.f3921a.isEmpty()) {
            Toolbar toolbar = this.f10170a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(L1.b.f5825m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(L1.c.f5878u, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(L1.b.f5844t);
            final TextView textView = (TextView) inflate.findViewById(L1.b.f5769Q0);
            final TextView textView2 = (TextView) inflate.findViewById(L1.b.f5773S0);
            final TextView textView3 = (TextView) inflate.findViewById(L1.b.f5775T0);
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3500j.k(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3500j.o(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3500j.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3500j.n(C3500j.this, popupWindow, imageView2, cardView, textView, textView2, textView3, view);
                    }
                });
            }
        }
    }
}
