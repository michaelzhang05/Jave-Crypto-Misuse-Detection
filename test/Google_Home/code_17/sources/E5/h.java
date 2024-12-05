package E5;

import P5.AbstractC1378t;
import U7.a;
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
import c6.AbstractC2055a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import o.AbstractC3491a;
import o.AbstractC3492b;

/* loaded from: classes5.dex */
public final class h extends T7.a implements a.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f2601q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f2602r = h.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f2603m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f2604n;

    /* renamed from: o, reason: collision with root package name */
    public l f2605o;

    /* renamed from: p, reason: collision with root package name */
    public U7.a f2606p;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(h this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(h this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
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
            if (textView4 != null) {
                textView4.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void m(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5884a));
        }
        l lVar = this$0.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.ALL_VENDORS);
        this$0.p();
    }

    public static final void n(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5892i));
        }
        l lVar = this$0.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.IAB_VENDORS);
        this$0.p();
    }

    public static final void o(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5896m));
        }
        l lVar = this$0.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.NON_IAB_VENDORS);
        this$0.p();
    }

    public static final void q(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3255y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3255y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f10171b;
        if (textView != null) {
            textView.setText(this$0.getString(L1.e.f5891h));
        }
        l lVar = this$0.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.GOOGLE_VENDORS);
        this$0.p();
    }

    @Override // U7.a.b
    public void c(U7.d item) {
        FragmentActivity fragmentActivity;
        String str;
        C5.f fVar;
        String str2;
        l lVar;
        String str3;
        String str4;
        E6.c cVar;
        String str5;
        String num;
        AbstractC3255y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f10538a instanceof E6.l)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str6 = C5.f.f1569I;
            if (supportFragmentManager.findFragmentByTag(str6) == null) {
                E6.f fVar2 = item.f10538a;
                if (fVar2 instanceof E6.l) {
                    String str7 = fVar2.f2643b;
                    String str8 = ((E6.l) fVar2).f2648c;
                    l lVar2 = this.f2605o;
                    if (lVar2 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar2 = null;
                    }
                    String a8 = lVar2.a(((E6.l) item.f10538a).f2649d, E5.a.PURPOSE);
                    l lVar3 = this.f2605o;
                    if (lVar3 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar3 = null;
                    }
                    String a9 = lVar3.a(((E6.l) item.f10538a).f2652g, E5.a.SPECIAL_PURPOSE);
                    l lVar4 = this.f2605o;
                    if (lVar4 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar4 = null;
                    }
                    String a10 = lVar4.a(((E6.l) item.f10538a).f2653h, E5.a.FEATURE);
                    l lVar5 = this.f2605o;
                    if (lVar5 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar5 = null;
                    }
                    String a11 = lVar5.a(((E6.l) item.f10538a).f2654i, E5.a.SPECIAL_FEATURE);
                    l lVar6 = this.f2605o;
                    if (lVar6 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar6 = null;
                    }
                    String a12 = lVar6.a(((E6.l) item.f10538a).f2659n, E5.a.DATA_DECLARATION);
                    String str9 = ((E6.l) item.f10538a).f2655j;
                    l lVar7 = this.f2605o;
                    if (lVar7 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar7 = null;
                    }
                    int i8 = ((E6.l) item.f10538a).f2657l;
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
                            str2 = AbstractC2055a.d(f8) + ' ' + lVar7.f2615a.g().f7379i;
                        } else {
                            str2 = i8 + ' ' + lVar7.f2615a.g().f7380j;
                        }
                    }
                    l lVar8 = this.f2605o;
                    if (lVar8 == null) {
                        AbstractC3255y.y("viewModel");
                        lVar = null;
                    } else {
                        lVar = lVar8;
                    }
                    Boolean bool = ((E6.l) item.f10538a).f2658m;
                    lVar.getClass();
                    if (AbstractC3255y.d(bool, Boolean.TRUE)) {
                        str4 = lVar.f2615a.g().f7383m;
                    } else if (!AbstractC3255y.d(bool, Boolean.FALSE)) {
                        str3 = "";
                        cVar = ((E6.l) item.f10538a).f2660o;
                        if (cVar == null || (num = Integer.valueOf(cVar.f2627a).toString()) == null) {
                            str5 = "";
                        } else {
                            str5 = num;
                        }
                        E6.f fVar3 = item.f10538a;
                        C5.a args = new C5.a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar3.f2642a, item.f10541d, ((E6.l) fVar3).f2661p, "Error: cannot load vendor file", 8);
                        AbstractC3255y.i(args, "args");
                        fVar = new C5.f();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("partner_detail_args", args);
                        fVar.setArguments(bundle);
                    } else {
                        str4 = lVar.f2615a.g().f7384n;
                    }
                    str3 = str4;
                    cVar = ((E6.l) item.f10538a).f2660o;
                    if (cVar == null) {
                        str5 = num;
                        E6.f fVar32 = item.f10538a;
                        C5.a args2 = new C5.a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar32.f2642a, item.f10541d, ((E6.l) fVar32).f2661p, "Error: cannot load vendor file", 8);
                        AbstractC3255y.i(args2, "args");
                        fVar = new C5.f();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("partner_detail_args", args2);
                        fVar.setArguments(bundle2);
                    }
                    str5 = "";
                    E6.f fVar322 = item.f10538a;
                    C5.a args22 = new C5.a(str7, str8, a8, null, a9, a10, a11, a12, str9, str2, str3, str5, fVar322.f2642a, item.f10541d, ((E6.l) fVar322).f2661p, "Error: cannot load vendor file", 8);
                    AbstractC3255y.i(args22, "args");
                    fVar = new C5.f();
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

    @Override // U7.a.b
    public void d(U7.d item) {
        AbstractC3255y.i(item, "item");
        l lVar = this.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC3255y.i(item, "item");
        U7.e eVar = item.f10541d;
        U7.e eVar2 = U7.e.NON_IAB_VENDOR;
        if (eVar == eVar2) {
            Boolean bool = item.f10539b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3255y.d(bool, bool2)) {
                lVar.f2616b.f969A.set(item.f10538a.f2642a);
                K7.m mVar = K7.m.f5260a;
                StringBuilder a8 = AbstractC3491a.a("Non IAB", '_');
                a8.append(item.f10538a.f2642a);
                AbstractC3492b.a(item.f10539b, bool2, mVar, a8.toString());
                return;
            }
        }
        if (item.f10541d == eVar2 && AbstractC3255y.d(item.f10539b, Boolean.FALSE)) {
            lVar.f2616b.f969A.unset(item.f10538a.f2642a);
            K7.m mVar2 = K7.m.f5260a;
            StringBuilder a9 = AbstractC3491a.a("Non IAB", '_');
            a9.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, Boolean.TRUE, mVar2, a9.toString());
            return;
        }
        U7.e eVar3 = item.f10541d;
        U7.e eVar4 = U7.e.IAB_VENDOR;
        if (eVar3 == eVar4) {
            Boolean bool3 = item.f10539b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3255y.d(bool3, bool4)) {
                lVar.f2616b.f1001z.set(item.f10538a.f2642a);
                K7.m mVar3 = K7.m.f5260a;
                StringBuilder a10 = AbstractC3491a.a("Vendors", '_');
                a10.append(item.f10538a.f2642a);
                AbstractC3492b.a(item.f10539b, bool4, mVar3, a10.toString());
                return;
            }
        }
        if (item.f10541d == eVar4 && AbstractC3255y.d(item.f10539b, Boolean.FALSE)) {
            lVar.f2616b.f1001z.unset(item.f10538a.f2642a);
            K7.m mVar4 = K7.m.f5260a;
            StringBuilder a11 = AbstractC3491a.a("Vendors", '_');
            a11.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, Boolean.TRUE, mVar4, a11.toString());
            return;
        }
        U7.e eVar5 = item.f10541d;
        U7.e eVar6 = U7.e.GOOGLE_VENDOR;
        if (eVar5 == eVar6) {
            Boolean bool5 = item.f10539b;
            Boolean bool6 = Boolean.TRUE;
            if (AbstractC3255y.d(bool5, bool6)) {
                lVar.f2616b.f970B.set(item.f10538a.f2642a);
                K7.m mVar5 = K7.m.f5260a;
                StringBuilder a12 = AbstractC3491a.a("Google", '_');
                a12.append(item.f10538a.f2642a);
                AbstractC3492b.a(item.f10539b, bool6, mVar5, a12.toString());
                return;
            }
        }
        if (item.f10541d == eVar6 && AbstractC3255y.d(item.f10539b, Boolean.FALSE)) {
            lVar.f2616b.f970B.unset(item.f10538a.f2642a);
            K7.m mVar6 = K7.m.f5260a;
            StringBuilder a13 = AbstractC3491a.a("Google", '_');
            a13.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, Boolean.TRUE, mVar6, a13.toString());
            return;
        }
        U7.e eVar7 = item.f10541d;
        U7.e eVar8 = U7.e.PUBLISHER_VENDOR;
        if (eVar7 == eVar8) {
            Boolean bool7 = item.f10539b;
            Boolean bool8 = Boolean.TRUE;
            if (AbstractC3255y.d(bool7, bool8)) {
                lVar.f2616b.f995t.set(item.f10538a.f2642a);
                lVar.f2616b.f997v.setItems(AbstractC1378t.b1(((E6.l) item.f10538a).f2649d));
                K7.m mVar7 = K7.m.f5260a;
                StringBuilder a14 = AbstractC3491a.a("Vendors", '_');
                a14.append(item.f10538a.f2642a);
                AbstractC3492b.a(item.f10539b, bool8, mVar7, a14.toString());
                return;
            }
        }
        if (item.f10541d == eVar8 && AbstractC3255y.d(item.f10539b, Boolean.FALSE)) {
            lVar.f2616b.f995t.unset(item.f10538a.f2642a);
            lVar.f2616b.f997v.unset(AbstractC1378t.b1(((E6.l) item.f10538a).f2649d));
            K7.m mVar8 = K7.m.f5260a;
            StringBuilder a15 = AbstractC3491a.a("Vendors", '_');
            a15.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, Boolean.TRUE, mVar8, a15.toString());
        }
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f2605o = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5865h, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…rtners, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        l lVar = this.f2605o;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        SearchView searchView = this.f10174e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        lVar.f2625k = hasFocus;
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
        this.f2603m = (ConstraintLayout) view.findViewById(L1.b.f5758L);
        this.f2604n = (RecyclerView) view.findViewById(L1.b.f5772S);
        l lVar = this.f2605o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(lVar), C3347b0.b(), null, new k(lVar, null), 2, null);
        TextView textView = this.f10171b;
        if (textView != null) {
            l lVar3 = this.f2605o;
            if (lVar3 == null) {
                AbstractC3255y.y("viewModel");
                lVar3 = null;
            }
            textView.setText(L7.b.a(lVar3.f2615a.a().f7386a));
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: E5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.k(h.this, view2);
                }
            });
            l lVar4 = this.f2605o;
            if (lVar4 == null) {
                AbstractC3255y.y("viewModel");
                lVar4 = null;
            }
            imageView.setContentDescription(lVar4.f2615a.a().f7392g);
        }
        r();
        SearchView searchView2 = this.f10174e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f10174e;
        if (searchView3 != null) {
            l lVar5 = this.f2605o;
            if (lVar5 == null) {
                AbstractC3255y.y("viewModel");
                lVar5 = null;
            }
            searchView3.setQueryHint(lVar5.f2615a.a().f7388c);
        }
        SearchView searchView4 = this.f10174e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new i(this));
        }
        l lVar6 = this.f2605o;
        if (lVar6 == null) {
            AbstractC3255y.y("viewModel");
            lVar6 = null;
        }
        List c8 = lVar6.c("");
        l lVar7 = this.f2605o;
        if (lVar7 == null) {
            AbstractC3255y.y("viewModel");
            lVar7 = null;
        }
        String str = lVar7.f2615a.a().f7387b;
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
        this.f2606p = new U7.a(c8, this, str, null, num, num2, num3, num4, this.f10180k, this.f10181l, 8);
        RecyclerView recyclerView = this.f2604n;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            U7.a aVar = this.f2606p;
            if (aVar == null) {
                AbstractC3255y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        M7.c cVar2 = this.f10179j;
        if (cVar2 != null && (num5 = cVar2.f7255g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f2603m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        l lVar8 = this.f2605o;
        if (lVar8 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            lVar2 = lVar8;
        }
        if (lVar2.f2625k && (searchView = this.f10174e) != null) {
            searchView.requestFocus();
        }
    }

    public final void p() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f10174e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            U7.a aVar = this.f2606p;
            l lVar = null;
            if (aVar == null) {
                AbstractC3255y.y("switchAdapter");
                aVar = null;
            }
            l lVar2 = this.f2605o;
            if (lVar2 == null) {
                AbstractC3255y.y("viewModel");
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
        l lVar = this.f2605o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3255y.y("viewModel");
            lVar = null;
        }
        if (!((ArrayList) lVar.f()).isEmpty() || !((ArrayList) lVar.b()).isEmpty()) {
            Toolbar toolbar = this.f10170a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(L1.b.f5825m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(L1.c.f5879v, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(L1.b.f5844t);
            final TextView textView = (TextView) inflate.findViewById(L1.b.f5769Q0);
            final TextView textView2 = (TextView) inflate.findViewById(L1.b.f5773S0);
            final TextView textView3 = (TextView) inflate.findViewById(L1.b.f5775T0);
            final TextView textView4 = (TextView) inflate.findViewById(L1.b.f5771R0);
            l lVar3 = this.f2605o;
            if (lVar3 == null) {
                AbstractC3255y.y("viewModel");
                lVar3 = null;
            }
            if (((ArrayList) lVar3.f()).isEmpty()) {
                textView3.setVisibility(8);
            }
            l lVar4 = this.f2605o;
            if (lVar4 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                lVar2 = lVar4;
            }
            if (((ArrayList) lVar2.b()).isEmpty()) {
                textView4.setVisibility(8);
            }
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: E5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.m(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: E5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.n(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: E5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.o(popupWindow, this, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: E5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: E5.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        h.l(h.this, popupWindow, imageView2, cardView, textView, textView2, textView3, textView4, view);
                    }
                });
            }
        }
    }
}
