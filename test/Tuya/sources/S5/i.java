package s5;

import H7.n;
import J7.p;
import M5.AbstractC1246t;
import Q7.i;
import Q7.m;
import R7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.AbstractC1832c;
import c.C1890d;
import c.C1891e;
import c.C1893g;
import c.C1895i;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import o.AbstractC3505a;
import o.AbstractC3506b;
import o.C3514j;

/* loaded from: classes5.dex */
public final class i extends Q7.a implements a.b, m.a {

    /* renamed from: E, reason: collision with root package name */
    public static final a f37995E = new a();

    /* renamed from: F, reason: collision with root package name */
    public static final String f37996F = i.class.getName();

    /* renamed from: A, reason: collision with root package name */
    public TextView f37997A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f37998B;

    /* renamed from: C, reason: collision with root package name */
    public k f37999C;

    /* renamed from: D, reason: collision with root package name */
    public m f38000D;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f38001m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f38002n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f38003o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f38004p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f38005q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f38006r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f38007s;

    /* renamed from: t, reason: collision with root package name */
    public Button f38008t;

    /* renamed from: u, reason: collision with root package name */
    public Button f38009u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f38010v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f38011w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f38012x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f38013y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f38014z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(i this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(i this$0, Boolean bool) {
        AbstractC3159y.i(this$0, "this$0");
        m mVar = this$0.f38000D;
        k kVar = null;
        if (mVar == null) {
            AbstractC3159y.y("stacksAdapter");
            mVar = null;
        }
        k kVar2 = this$0.f37999C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        List items = kVar.d();
        mVar.getClass();
        AbstractC3159y.i(items, "items");
        mVar.f8433a = items;
        mVar.notifyDataSetChanged();
    }

    public static final void m(i this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void n(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new B5.h(), B5.h.f1007r)) != null) {
            add.commit();
        }
    }

    public static final void o(i this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void p(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3514j(), C3514j.f36321u)) != null) {
            add.commit();
        }
    }

    public static final void r(final i this$0, View view) {
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        C1895i c1895i = C1895i.f14839a;
        k kVar = null;
        if (C1895i.f14840b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14831h);
            if (findFragmentByTag instanceof C1893g) {
                c1893g = (C1893g) findFragmentByTag;
            } else {
                c1893g = null;
            }
            if (c1893g != null) {
                C1891e c1891e = c1893g.f14834c;
                if (c1891e == null) {
                    AbstractC3159y.y("viewModel");
                    c1891e = null;
                }
                c1891e.getClass();
                if (C1895i.f14840b) {
                    C1895i.f14841c.setAllOwnedItems();
                    SharedStorage sharedStorage = c1891e.f14826a;
                    N7.a aVar = N7.a.GBC_CONSENT_STRING;
                    sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14841c));
                    ChoiceCmpCallback choiceCmpCallback = c1891e.f14827b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
                    }
                    AbstractC2829k.d(C2842q0.f31799a, C2812b0.b(), null, new C1890d(null), 2, null);
                }
            }
        }
        k kVar2 = this$0.f37999C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.f38017a.x();
        kVar.e();
        H7.m.f3657a.b(n.ACCEPT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: s5.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.m(i.this, (String) obj);
            }
        });
    }

    public static final void t(final i this$0, View view) {
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        k kVar = null;
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
        k kVar2 = this$0.f37999C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.e();
        H7.m.f3657a.b(n.SAVE_AND_EXIT, H7.f.GDPR).observe(this$0, new Observer() { // from class: s5.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.o(i.this, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R7.a.b
    public void b(R7.d item) {
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f8912a instanceof B6.g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = Q7.i.f8410y;
            String str = Q7.i.f8411z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                B6.f fVar = item.f8912a;
                String str2 = fVar.f1048b;
                String a8 = ((B6.g) fVar).a();
                String b8 = ((B6.g) item.f8912a).b();
                k kVar = this.f37999C;
                k kVar2 = null;
                if (kVar == null) {
                    AbstractC3159y.y("viewModel");
                    kVar = null;
                }
                String str3 = kVar.f38022f.f().f5657i;
                k kVar3 = this.f37999C;
                if (kVar3 == null) {
                    AbstractC3159y.y("viewModel");
                } else {
                    kVar2 = kVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a8, b8, str3, kVar2.f38022f.f().f5662n, item.f8912a.f1047a, item.f8915d, false, null, 384), str).commit();
            }
        }
    }

    @Override // Q7.m.a
    public void c(p item) {
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str = F5.d.f2672w;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                int i8 = item.f5701a;
                F5.d dVar = new F5.d();
                Bundle bundle = new Bundle();
                bundle.putInt("stack_id", i8);
                dVar.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().add(dVar, str).commit();
            }
        }
    }

    @Override // R7.a.b
    public void d(R7.d item) {
        AbstractC3159y.i(item, "item");
        k kVar = this.f37999C;
        if (kVar == null) {
            AbstractC3159y.y("viewModel");
            kVar = null;
        }
        kVar.getClass();
        AbstractC3159y.i(item, "item");
        B6.f fVar = item.f8912a;
        if (fVar instanceof B6.i) {
            Boolean bool = item.f8913b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3159y.d(bool, bool2)) {
                kVar.f38017a.f39949r.set(item.f8912a.f1047a);
            } else {
                kVar.f38017a.f39949r.unset(item.f8912a.f1047a);
            }
            H7.m mVar = H7.m.f3657a;
            StringBuilder a8 = AbstractC3505a.a("Purposes", '_');
            a8.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, bool2, mVar, a8.toString());
            return;
        }
        if (fVar instanceof B6.d) {
            Boolean bool3 = item.f8913b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3159y.d(bool3, bool4)) {
                kVar.f38017a.f39948q.set(item.f8912a.f1047a);
            } else {
                kVar.f38017a.f39948q.unset(item.f8912a.f1047a);
            }
            H7.m mVar2 = H7.m.f3657a;
            StringBuilder a9 = AbstractC3505a.a("Special Features", '_');
            a9.append(item.f8912a.f1047a);
            AbstractC3506b.a(item.f8913b, bool4, mVar2, a9.toString());
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "it.viewModelStore");
            k kVar = (k) new ViewModelProvider(viewModelStore, new l()).get(k.class);
            this.f37999C = kVar;
            if (kVar == null) {
                AbstractC3159y.y("viewModel");
                kVar = null;
            }
            kVar.f38031o.observe(this, new Observer() { // from class: s5.a
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    i.l(i.this, (Boolean) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3869g, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentActivity activity;
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == 16908332 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        Integer num;
        k kVar;
        String str;
        Map map;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f38001m = (RecyclerView) view.findViewById(I1.b.f3779T);
        this.f38002n = (RecyclerView) view.findViewById(I1.b.f3787X);
        this.f38003o = (RecyclerView) view.findViewById(I1.b.f3783V);
        this.f38004p = (RecyclerView) view.findViewById(I1.b.f3789Y);
        this.f38005q = (ConstraintLayout) view.findViewById(I1.b.f3761K);
        this.f38006r = (LinearLayout) view.findViewById(I1.b.f3800c0);
        this.f38007s = (LinearLayout) view.findViewById(I1.b.f3803d0);
        this.f38009u = (Button) view.findViewById(I1.b.f3799c);
        this.f38008t = (Button) view.findViewById(I1.b.f3826l);
        this.f38010v = (TextView) view.findViewById(I1.b.f3790Y0);
        this.f38011w = (TextView) view.findViewById(I1.b.f3822j1);
        this.f38012x = (TextView) view.findViewById(I1.b.f3801c1);
        this.f38013y = (TextView) view.findViewById(I1.b.f3768N0);
        this.f38014z = (TextView) view.findViewById(I1.b.f3788X0);
        this.f37997A = (TextView) view.findViewById(I1.b.f3786W0);
        int i9 = I1.b.f3861z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i9);
        this.f37998B = frameLayout;
        if (C1895i.f14840b) {
            getChildFragmentManager().beginTransaction().add(i9, new C1893g(), C1893g.f14831h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        k kVar2 = this.f37999C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
            kVar2 = null;
        }
        kVar2.getClass();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(kVar2), C2812b0.b(), null, new j(kVar2, null), 2, null);
        k kVar3 = this.f37999C;
        if (kVar3 == null) {
            AbstractC3159y.y("viewModel");
            kVar3 = null;
        }
        B6.e eVar = kVar3.f38017a.f39932a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((B6.l) entry.getValue()).f1061k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = kVar3.f38018b.f2376c.f2371a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1246t.b1(((E6.d) obj).f2369f);
            List list2 = kVar3.f38018b.f2375b.f2340h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1832c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        String valueOf = String.valueOf(kVar3.f38019c.f39889a.size() + arrayList.size() + i8 + (kVar3.f38020d == null ? 0 : 1));
        k kVar4 = this.f37999C;
        if (kVar4 == null) {
            AbstractC3159y.y("viewModel");
            kVar4 = null;
        }
        String str2 = kVar4.f38022f.f().f5650b;
        TextView textView = this.f37997A;
        if (textView != null) {
            textView.setText(g6.n.y(str2, "${partners}", valueOf, true));
        }
        TextView textView2 = this.f37997A;
        if (textView2 != null) {
            k kVar5 = this.f37999C;
            if (kVar5 == null) {
                AbstractC3159y.y("viewModel");
                kVar5 = null;
            }
            kVar5.getClass();
            if (C1895i.f14840b) {
                str = kVar5.f38027k.f3216b.f3211c;
            } else {
                str = "";
            }
            textView2.append(str);
        }
        TextView textView3 = this.f38014z;
        if (textView3 != null) {
            k kVar6 = this.f37999C;
            if (kVar6 == null) {
                AbstractC3159y.y("viewModel");
                kVar6 = null;
            }
            textView3.setText(I7.b.a(kVar6.f38022f.f().f5653e));
        }
        TextView textView4 = this.f38013y;
        if (textView4 != null) {
            k kVar7 = this.f37999C;
            if (kVar7 == null) {
                AbstractC3159y.y("viewModel");
                kVar7 = null;
            }
            textView4.setText(I7.b.a(kVar7.f38022f.f().f5651c));
        }
        TextView textView5 = this.f38012x;
        if (textView5 != null) {
            k kVar8 = this.f37999C;
            if (kVar8 == null) {
                AbstractC3159y.y("viewModel");
                kVar8 = null;
            }
            textView5.setText(kVar8.f38022f.f().f5652d);
        }
        TextView textView6 = this.f38011w;
        if (textView6 != null) {
            k kVar9 = this.f37999C;
            if (kVar9 == null) {
                AbstractC3159y.y("viewModel");
                kVar9 = null;
            }
            textView6.setText(kVar9.f38022f.f().f5654f);
        }
        TextView textView7 = this.f38010v;
        if (textView7 != null) {
            k kVar10 = this.f37999C;
            if (kVar10 == null) {
                AbstractC3159y.y("viewModel");
                kVar10 = null;
            }
            textView7.setText(kVar10.f38022f.f().f5658j);
        }
        TextView textView8 = this.f8374b;
        if (textView8 != null) {
            k kVar11 = this.f37999C;
            if (kVar11 == null) {
                AbstractC3159y.y("viewModel");
                kVar11 = null;
            }
            textView8.setText(kVar11.f38022f.f().f5649a);
        }
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: s5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
            k kVar12 = this.f37999C;
            if (kVar12 == null) {
                AbstractC3159y.y("viewModel");
                kVar12 = null;
            }
            imageView.setContentDescription(kVar12.f38022f.f().f5663o);
        }
        k kVar13 = this.f37999C;
        if (kVar13 == null) {
            AbstractC3159y.y("viewModel");
            kVar13 = null;
        }
        List d8 = kVar13.d();
        J7.c cVar = this.f8382j;
        this.f38000D = new m(d8, this, cVar == null ? null : cVar.f5551i, cVar == null ? null : cVar.f5543a, this.f8384l);
        RecyclerView recyclerView = this.f38004p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            m mVar = this.f38000D;
            if (mVar == null) {
                AbstractC3159y.y("stacksAdapter");
                mVar = null;
            }
            recyclerView.setAdapter(mVar);
        }
        RecyclerView recyclerView2 = this.f38003o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            k kVar14 = this.f37999C;
            if (kVar14 == null) {
                AbstractC3159y.y("viewModel");
                kVar14 = null;
            }
            List b8 = kVar14.b();
            J7.c cVar2 = this.f8382j;
            recyclerView2.setAdapter(new R7.a(b8, this, null, null, cVar2 == null ? null : cVar2.f5551i, cVar2 == null ? null : cVar2.f5547e, cVar2 == null ? null : cVar2.f5548f, cVar2 == null ? null : cVar2.f5543a, null, this.f8384l, 268));
        }
        RecyclerView recyclerView3 = this.f38002n;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            k kVar15 = this.f37999C;
            if (kVar15 == null) {
                AbstractC3159y.y("viewModel");
                kVar15 = null;
            }
            List c8 = kVar15.c();
            J7.c cVar3 = this.f8382j;
            recyclerView3.setAdapter(new R7.a(c8, this, null, null, cVar3 == null ? null : cVar3.f5551i, cVar3 == null ? null : cVar3.f5547e, cVar3 == null ? null : cVar3.f5548f, cVar3 == null ? null : cVar3.f5543a, null, this.f8384l, 268));
        }
        RecyclerView recyclerView4 = this.f38001m;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
            k kVar16 = this.f37999C;
            if (kVar16 == null) {
                AbstractC3159y.y("viewModel");
                kVar16 = null;
            }
            List list3 = kVar16.f38023g;
            Context context = recyclerView4.getContext();
            AbstractC3159y.h(context, "context");
            J7.c cVar4 = this.f8382j;
            recyclerView4.setAdapter(new Q7.l(list3, context, cVar4 == null ? null : cVar4.f5554l, this.f8384l));
        }
        s();
        TextView textView9 = this.f38012x;
        if (textView9 != null) {
            k kVar17 = this.f37999C;
            if (kVar17 == null) {
                AbstractC3159y.y("viewModel");
                kVar17 = null;
            }
            k kVar18 = this.f37999C;
            if (kVar18 == null) {
                AbstractC3159y.y("viewModel");
                kVar18 = null;
            }
            List itemsList = kVar18.b();
            kVar17.getClass();
            AbstractC3159y.i(itemsList, "itemsList");
            textView9.setVisibility(((ArrayList) itemsList).isEmpty() ^ true ? 0 : 8);
        }
        TextView textView10 = this.f38011w;
        if (textView10 != null) {
            k kVar19 = this.f37999C;
            if (kVar19 == null) {
                AbstractC3159y.y("viewModel");
                kVar19 = null;
            }
            k kVar20 = this.f37999C;
            if (kVar20 == null) {
                AbstractC3159y.y("viewModel");
                kVar = null;
            } else {
                kVar = kVar20;
            }
            List itemsList2 = kVar.c();
            kVar19.getClass();
            AbstractC3159y.i(itemsList2, "itemsList");
            textView10.setVisibility(((ArrayList) itemsList2).isEmpty() ^ true ? 0 : 8);
        }
        J7.c cVar5 = this.f8382j;
        if (cVar5 != null) {
            Integer num2 = cVar5.f5549g;
            if (num2 != null) {
                int intValue = num2.intValue();
                ConstraintLayout constraintLayout = this.f38005q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num3 = cVar5.f5551i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView11 = this.f38012x;
                if (textView11 != null) {
                    textView11.setTextColor(intValue2);
                }
                TextView textView12 = this.f38011w;
                if (textView12 != null) {
                    textView12.setTextColor(intValue2);
                }
                TextView textView13 = this.f38010v;
                if (textView13 != null) {
                    textView13.setTextColor(intValue2);
                }
                TextView textView14 = this.f38014z;
                if (textView14 != null) {
                    textView14.setTextColor(intValue2);
                }
                TextView textView15 = this.f38013y;
                if (textView15 != null) {
                    textView15.setTextColor(intValue2);
                }
                TextView textView16 = this.f37997A;
                if (textView16 != null) {
                    textView16.setTextColor(intValue2);
                }
            }
            Integer num4 = cVar5.f5543a;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView17 = this.f37997A;
                if (textView17 != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue3);
                    textView17.setBackground(gradientDrawable);
                }
            }
            Integer num5 = cVar5.f5555m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button = this.f38009u;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f38008t;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar5.f5557o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f38009u;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
                Button button4 = this.f38008t;
                if (button4 != null) {
                    button4.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        J7.c cVar6 = this.f8382j;
        if (cVar6 != null && (num = cVar6.f5543a) != null) {
            int intValue6 = num.intValue();
            View findViewById = view.findViewById(I1.b.f3769O);
            if (findViewById != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById2 = view.findViewById(I1.b.f3809f0);
            if (findViewById2 != null) {
                findViewById2.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById3 = view.findViewById(I1.b.f3765M);
            if (findViewById3 != null) {
                findViewById3.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById4 = view.findViewById(I1.b.f3838p);
            if (findViewById4 != null) {
                findViewById4.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById5 = view.findViewById(I1.b.f3753G);
            if (findViewById5 != null) {
                findViewById5.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
        }
        Typeface typeface = this.f8383k;
        if (typeface != null) {
            TextView textView18 = this.f38012x;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            TextView textView19 = this.f38011w;
            if (textView19 != null) {
                textView19.setTypeface(typeface);
            }
            TextView textView20 = this.f38010v;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f8384l;
        if (typeface2 == null) {
            return;
        }
        TextView textView21 = this.f37997A;
        if (textView21 != null) {
            textView21.setTypeface(typeface2);
        }
        TextView textView22 = this.f38014z;
        if (textView22 != null) {
            textView22.setTypeface(typeface2);
        }
        TextView textView23 = this.f38013y;
        if (textView23 != null) {
            textView23.setTypeface(typeface2);
        }
        Button button5 = this.f38009u;
        if (button5 != null) {
            button5.setTypeface(typeface2);
        }
        Button button6 = this.f38008t;
        if (button6 == null) {
            return;
        }
        button6.setTypeface(typeface2);
    }

    public final void q() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager.findFragmentByTag(D5.f.f1842m);
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) fragment;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismiss();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void s() {
        Button button = this.f38009u;
        k kVar = null;
        if (button != null) {
            k kVar2 = this.f37999C;
            if (kVar2 == null) {
                AbstractC3159y.y("viewModel");
                kVar2 = null;
            }
            button.setText(kVar2.f38022f.f().f5655g);
            button.setOnClickListener(new View.OnClickListener() { // from class: s5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.r(i.this, view);
                }
            });
        }
        Button button2 = this.f38008t;
        if (button2 != null) {
            k kVar3 = this.f37999C;
            if (kVar3 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                kVar = kVar3;
            }
            button2.setText(kVar.f38022f.f().f5656h);
            button2.setOnClickListener(new View.OnClickListener() { // from class: s5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.t(i.this, view);
                }
            });
        }
        LinearLayout linearLayout = this.f38007s;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: s5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.n(i.this, view);
                }
            });
        }
        LinearLayout linearLayout2 = this.f38006r;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: s5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.p(i.this, view);
                }
            });
        }
    }
}
