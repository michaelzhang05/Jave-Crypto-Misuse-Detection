package B5;

import M5.AbstractC1246t;
import R7.a;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import o.AbstractC3505a;
import o.AbstractC3506b;
import z5.C4027a;

/* loaded from: classes5.dex */
public final class h extends Q7.a implements a.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f1006q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f1007r = h.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f1008m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f1009n;

    /* renamed from: o, reason: collision with root package name */
    public l f1010o;

    /* renamed from: p, reason: collision with root package name */
    public R7.a f1011p;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(h this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(h this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        Integer num;
        Integer num2;
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        J7.c cVar = this$0.f8382j;
        if (cVar != null && (num2 = cVar.f5549g) != null) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
        J7.c cVar2 = this$0.f8382j;
        if (cVar2 != null && (num = cVar2.f5553k) != null) {
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
            if (textView4 != null) {
                textView4.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void m(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8374b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3889a));
        }
        l lVar = this$0.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.ALL_VENDORS);
        this$0.p();
    }

    public static final void n(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8374b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3897i));
        }
        l lVar = this$0.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.IAB_VENDORS);
        this$0.p();
    }

    public static final void o(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8374b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3901m));
        }
        l lVar = this$0.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.NON_IAB_VENDORS);
        this$0.p();
    }

    public static final void q(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8374b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3896h));
        }
        l lVar = this$0.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.GOOGLE_VENDORS);
        this$0.p();
    }

    @Override // R7.a.b
    public void b(R7.d item) {
        FragmentActivity fragmentActivity;
        String str;
        z5.f fVar;
        String str2;
        l lVar;
        String str3;
        String str4;
        B6.c cVar;
        String str5;
        String num;
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f8912a instanceof B6.l)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str6 = z5.f.f40451I;
            if (supportFragmentManager.findFragmentByTag(str6) == null) {
                B6.f fVar2 = item.f8912a;
                if (fVar2 instanceof B6.l) {
                    String str7 = fVar2.f1048b;
                    String str8 = ((B6.l) fVar2).f1053c;
                    l lVar2 = this.f1010o;
                    if (lVar2 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar2 = null;
                    }
                    String a8 = lVar2.a(((B6.l) item.f8912a).f1054d, B5.a.PURPOSE);
                    l lVar3 = this.f1010o;
                    if (lVar3 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar3 = null;
                    }
                    String a9 = lVar3.a(((B6.l) item.f8912a).f1057g, B5.a.SPECIAL_PURPOSE);
                    l lVar4 = this.f1010o;
                    if (lVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar4 = null;
                    }
                    String a10 = lVar4.a(((B6.l) item.f8912a).f1058h, B5.a.FEATURE);
                    l lVar5 = this.f1010o;
                    if (lVar5 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar5 = null;
                    }
                    String a11 = lVar5.a(((B6.l) item.f8912a).f1059i, B5.a.SPECIAL_FEATURE);
                    l lVar6 = this.f1010o;
                    if (lVar6 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar6 = null;
                    }
                    String a12 = lVar6.a(((B6.l) item.f8912a).f1064n, B5.a.DATA_DECLARATION);
                    String str9 = ((B6.l) item.f8912a).f1060j;
                    l lVar7 = this.f1010o;
                    if (lVar7 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar7 = null;
                    }
                    int i8 = ((B6.l) item.f8912a).f1062l;
                    lVar7.getClass();
                    if (i8 < 0) {
                        fragmentActivity = activity;
                        str = str6;
                        str2 = "";
                    } else {
                        str = str6;
                        float f8 = i8 / 86400.0f;
                        fragmentActivity = activity;
                        if (f8 >= 1.0f) {
                            str2 = Z5.a.d(f8) + ' ' + lVar7.f1020a.g().f5673i;
                        } else {
                            str2 = i8 + ' ' + lVar7.f1020a.g().f5674j;
                        }
                    }
                    l lVar8 = this.f1010o;
                    if (lVar8 == null) {
                        AbstractC3159y.y("viewModel");
                        lVar = null;
                    } else {
                        lVar = lVar8;
                    }
                    Boolean bool = ((B6.l) item.f8912a).f1063m;
                    lVar.getClass();
                    if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                        str4 = lVar.f1020a.g().f5677m;
                    } else if (!AbstractC3159y.d(bool, Boolean.FALSE)) {
                        str3 = "";
                        cVar = ((B6.l) item.f8912a).f1065o;
                        if (cVar == null || (num = Integer.valueOf(cVar.f1032a).toString()) == null) {
                            str5 = "";
                        } else {
                            str5 = num;
                        }
                        B6.f fVar3 = item.f8912a;
                        C4027a args = new C4027a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar3.f1047a, item.f8915d, ((B6.l) fVar3).f1066p, "Error: cannot load vendor file", 8);
                        AbstractC3159y.i(args, "args");
                        fVar = new z5.f();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("partner_detail_args", args);
                        fVar.setArguments(bundle);
                    } else {
                        str4 = lVar.f1020a.g().f5678n;
                    }
                    str3 = str4;
                    cVar = ((B6.l) item.f8912a).f1065o;
                    if (cVar == null) {
                        str5 = num;
                        B6.f fVar32 = item.f8912a;
                        C4027a args2 = new C4027a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar32.f1047a, item.f8915d, ((B6.l) fVar32).f1066p, "Error: cannot load vendor file", 8);
                        AbstractC3159y.i(args2, "args");
                        fVar = new z5.f();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("partner_detail_args", args2);
                        fVar.setArguments(bundle2);
                    }
                    str5 = "";
                    B6.f fVar322 = item.f8912a;
                    C4027a args22 = new C4027a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar322.f1047a, item.f8915d, ((B6.l) fVar322).f1066p, "Error: cannot load vendor file", 8);
                    AbstractC3159y.i(args22, "args");
                    fVar = new z5.f();
                    Bundle bundle22 = new Bundle();
                    bundle22.putParcelable("partner_detail_args", args22);
                    fVar.setArguments(bundle22);
                } else {
                    fragmentActivity = activity;
                    str = str6;
                    fVar = null;
                }
                if (fVar != null) {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(fVar, str).commit();
                }
            }
        }
    }

    @Override // R7.a.b
    public void d(R7.d item) {
        AbstractC3159y.i(item, "item");
        l lVar = this.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC3159y.i(item, "item");
        R7.e eVar = item.f8915d;
        R7.e eVar2 = R7.e.NON_IAB_VENDOR;
        if (eVar == eVar2) {
            Boolean bool = item.f8913b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3159y.d(bool, bool2)) {
                lVar.f1021b.f39925A.set(item.f8912a.f1047a);
                H7.m mVar = H7.m.f3657a;
                StringBuilder a8 = AbstractC3505a.a("Non IAB", '_');
                a8.append(item.f8912a.f1047a);
                AbstractC3506b.a(item.f8913b, bool2, mVar, a8.toString());
                return;
            }
        }
        if (item.f8915d == eVar2 && AbstractC3159y.d(item.f8913b, Boolean.FALSE)) {
            lVar.f1021b.f39925A.unset(item.f8912a.f1047a);
            H7.m mVar2 = H7.m.f3657a;
            StringBuilder a9 = AbstractC3505a.a("Non IAB", '_');
            a9.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, Boolean.TRUE, mVar2, a9.toString());
            return;
        }
        R7.e eVar3 = item.f8915d;
        R7.e eVar4 = R7.e.IAB_VENDOR;
        if (eVar3 == eVar4) {
            Boolean bool3 = item.f8913b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3159y.d(bool3, bool4)) {
                lVar.f1021b.f39957z.set(item.f8912a.f1047a);
                H7.m mVar3 = H7.m.f3657a;
                StringBuilder a10 = AbstractC3505a.a("Vendors", '_');
                a10.append(item.f8912a.f1047a);
                AbstractC3506b.a(item.f8913b, bool4, mVar3, a10.toString());
                return;
            }
        }
        if (item.f8915d == eVar4 && AbstractC3159y.d(item.f8913b, Boolean.FALSE)) {
            lVar.f1021b.f39957z.unset(item.f8912a.f1047a);
            H7.m mVar4 = H7.m.f3657a;
            StringBuilder a11 = AbstractC3505a.a("Vendors", '_');
            a11.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, Boolean.TRUE, mVar4, a11.toString());
            return;
        }
        R7.e eVar5 = item.f8915d;
        R7.e eVar6 = R7.e.GOOGLE_VENDOR;
        if (eVar5 == eVar6) {
            Boolean bool5 = item.f8913b;
            Boolean bool6 = Boolean.TRUE;
            if (AbstractC3159y.d(bool5, bool6)) {
                lVar.f1021b.f39926B.set(item.f8912a.f1047a);
                H7.m mVar5 = H7.m.f3657a;
                StringBuilder a12 = AbstractC3505a.a("Google", '_');
                a12.append(item.f8912a.f1047a);
                AbstractC3506b.a(item.f8913b, bool6, mVar5, a12.toString());
                return;
            }
        }
        if (item.f8915d == eVar6 && AbstractC3159y.d(item.f8913b, Boolean.FALSE)) {
            lVar.f1021b.f39926B.unset(item.f8912a.f1047a);
            H7.m mVar6 = H7.m.f3657a;
            StringBuilder a13 = AbstractC3505a.a("Google", '_');
            a13.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, Boolean.TRUE, mVar6, a13.toString());
            return;
        }
        R7.e eVar7 = item.f8915d;
        R7.e eVar8 = R7.e.PUBLISHER_VENDOR;
        if (eVar7 == eVar8) {
            Boolean bool7 = item.f8913b;
            Boolean bool8 = Boolean.TRUE;
            if (AbstractC3159y.d(bool7, bool8)) {
                lVar.f1021b.f39951t.set(item.f8912a.f1047a);
                lVar.f1021b.f39953v.setItems(AbstractC1246t.b1(((B6.l) item.f8912a).f1054d));
                H7.m mVar7 = H7.m.f3657a;
                StringBuilder a14 = AbstractC3505a.a("Vendors", '_');
                a14.append(item.f8912a.f1047a);
                AbstractC3506b.a(item.f8913b, bool8, mVar7, a14.toString());
                return;
            }
        }
        if (item.f8915d == eVar8 && AbstractC3159y.d(item.f8913b, Boolean.FALSE)) {
            lVar.f1021b.f39951t.unset(item.f8912a.f1047a);
            lVar.f1021b.f39953v.unset(AbstractC1246t.b1(((B6.l) item.f8912a).f1054d));
            H7.m mVar8 = H7.m.f3657a;
            StringBuilder a15 = AbstractC3505a.a("Vendors", '_');
            a15.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, Boolean.TRUE, mVar8, a15.toString());
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f1010o = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3870h, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…rtners, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        l lVar = this.f1010o;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        SearchView searchView = this.f8377e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        lVar.f1030k = hasFocus;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        SearchView searchView;
        Integer num5;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f1008m = (ConstraintLayout) view.findViewById(I1.b.f3763L);
        this.f1009n = (RecyclerView) view.findViewById(I1.b.f3777S);
        l lVar = this.f1010o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(lVar), C2812b0.b(), null, new k(lVar, null), 2, null);
        TextView textView = this.f8374b;
        if (textView != null) {
            l lVar3 = this.f1010o;
            if (lVar3 == null) {
                AbstractC3159y.y("viewModel");
                lVar3 = null;
            }
            textView.setText(I7.b.a(lVar3.f1020a.a().f5680a));
        }
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: B5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.k(h.this, view2);
                }
            });
            l lVar4 = this.f1010o;
            if (lVar4 == null) {
                AbstractC3159y.y("viewModel");
                lVar4 = null;
            }
            imageView.setContentDescription(lVar4.f1020a.a().f5686g);
        }
        r();
        SearchView searchView2 = this.f8377e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f8377e;
        if (searchView3 != null) {
            l lVar5 = this.f1010o;
            if (lVar5 == null) {
                AbstractC3159y.y("viewModel");
                lVar5 = null;
            }
            searchView3.setQueryHint(lVar5.f1020a.a().f5682c);
        }
        SearchView searchView4 = this.f8377e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new i(this));
        }
        l lVar6 = this.f1010o;
        if (lVar6 == null) {
            AbstractC3159y.y("viewModel");
            lVar6 = null;
        }
        List c8 = lVar6.c("");
        l lVar7 = this.f1010o;
        if (lVar7 == null) {
            AbstractC3159y.y("viewModel");
            lVar7 = null;
        }
        String str = lVar7.f1020a.a().f5681b;
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
        this.f1011p = new R7.a(c8, this, str, null, num, num2, num3, num4, this.f8383k, this.f8384l, 8);
        RecyclerView recyclerView = this.f1009n;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            R7.a aVar = this.f1011p;
            if (aVar == null) {
                AbstractC3159y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        J7.c cVar2 = this.f8382j;
        if (cVar2 != null && (num5 = cVar2.f5549g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f1008m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        l lVar8 = this.f1010o;
        if (lVar8 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            lVar2 = lVar8;
        }
        if (lVar2.f1030k && (searchView = this.f8377e) != null) {
            searchView.requestFocus();
        }
    }

    public final void p() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f8377e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            R7.a aVar = this.f1011p;
            l lVar = null;
            if (aVar == null) {
                AbstractC3159y.y("switchAdapter");
                aVar = null;
            }
            l lVar2 = this.f1010o;
            if (lVar2 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                lVar = lVar2;
            }
            List c8 = lVar.c(query.toString());
            if (query.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.b(c8, z8);
        }
    }

    public final void r() {
        ImageView imageView;
        l lVar = this.f1010o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        if (!((ArrayList) lVar.f()).isEmpty() || !((ArrayList) lVar.b()).isEmpty()) {
            Toolbar toolbar = this.f8373a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(I1.b.f3830m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(I1.c.f3884v, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(I1.b.f3849t);
            final TextView textView = (TextView) inflate.findViewById(I1.b.f3774Q0);
            final TextView textView2 = (TextView) inflate.findViewById(I1.b.f3778S0);
            final TextView textView3 = (TextView) inflate.findViewById(I1.b.f3780T0);
            final TextView textView4 = (TextView) inflate.findViewById(I1.b.f3776R0);
            l lVar3 = this.f1010o;
            if (lVar3 == null) {
                AbstractC3159y.y("viewModel");
                lVar3 = null;
            }
            if (((ArrayList) lVar3.f()).isEmpty()) {
                textView3.setVisibility(8);
            }
            l lVar4 = this.f1010o;
            if (lVar4 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                lVar2 = lVar4;
            }
            if (((ArrayList) lVar2.b()).isEmpty()) {
                textView4.setVisibility(8);
            }
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: B5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.m(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: B5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.n(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: B5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.o(popupWindow, this, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: B5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: B5.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        h.l(h.this, popupWindow, imageView2, cardView, textView, textView2, textView3, textView4, view);
                    }
                });
            }
        }
    }
}
