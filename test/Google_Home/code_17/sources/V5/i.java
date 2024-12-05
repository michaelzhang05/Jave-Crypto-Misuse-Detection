package v5;

import K7.n;
import M7.p;
import P5.AbstractC1378t;
import T7.i;
import T7.m;
import U7.a;
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
import b.AbstractC1941c;
import c.C1996d;
import c.C1997e;
import c.C1999g;
import c.C2001i;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.C3377q0;
import o.AbstractC3491a;
import o.AbstractC3492b;
import o.C3500j;

/* loaded from: classes5.dex */
public final class i extends T7.a implements a.b, m.a {

    /* renamed from: E, reason: collision with root package name */
    public static final a f40268E = new a();

    /* renamed from: F, reason: collision with root package name */
    public static final String f40269F = i.class.getName();

    /* renamed from: A, reason: collision with root package name */
    public TextView f40270A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f40271B;

    /* renamed from: C, reason: collision with root package name */
    public k f40272C;

    /* renamed from: D, reason: collision with root package name */
    public m f40273D;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f40274m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f40275n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f40276o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f40277p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f40278q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f40279r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f40280s;

    /* renamed from: t, reason: collision with root package name */
    public Button f40281t;

    /* renamed from: u, reason: collision with root package name */
    public Button f40282u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f40283v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f40284w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f40285x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f40286y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f40287z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(i this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(i this$0, Boolean bool) {
        AbstractC3255y.i(this$0, "this$0");
        m mVar = this$0.f40273D;
        k kVar = null;
        if (mVar == null) {
            AbstractC3255y.y("stacksAdapter");
            mVar = null;
        }
        k kVar2 = this$0.f40272C;
        if (kVar2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        List items = kVar.d();
        mVar.getClass();
        AbstractC3255y.i(items, "items");
        mVar.f10230a = items;
        mVar.notifyDataSetChanged();
    }

    public static final void m(i this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void n(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new E5.h(), E5.h.f2602r)) != null) {
            add.commit();
        }
    }

    public static final void o(i this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void p(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3500j(), C3500j.f35756u)) != null) {
            add.commit();
        }
    }

    public static final void r(final i this$0, View view) {
        C1999g c1999g;
        AbstractC3255y.i(this$0, "this$0");
        C2001i c2001i = C2001i.f15551a;
        k kVar = null;
        if (C2001i.f15552b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15543h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            } else {
                c1999g = null;
            }
            if (c1999g != null) {
                C1997e c1997e = c1999g.f15546c;
                if (c1997e == null) {
                    AbstractC3255y.y("viewModel");
                    c1997e = null;
                }
                c1997e.getClass();
                if (C2001i.f15552b) {
                    C2001i.f15553c.setAllOwnedItems();
                    SharedStorage sharedStorage = c1997e.f15538a;
                    Q7.a aVar = Q7.a.GBC_CONSENT_STRING;
                    sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15553c));
                    ChoiceCmpCallback choiceCmpCallback = c1997e.f15539b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
                    }
                    AbstractC3364k.d(C3377q0.f34651a, C3347b0.b(), null, new C1996d(null), 2, null);
                }
            }
        }
        k kVar2 = this$0.f40272C;
        if (kVar2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.f40290a.x();
        kVar.e();
        K7.m.f5260a.b(n.ACCEPT_ALL, K7.f.GDPR).observe(this$0, new Observer() { // from class: v5.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.m(i.this, (String) obj);
            }
        });
    }

    public static final void t(final i this$0, View view) {
        C1999g c1999g;
        AbstractC3255y.i(this$0, "this$0");
        k kVar = null;
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
        k kVar2 = this$0.f40272C;
        if (kVar2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.e();
        K7.m.f5260a.b(n.SAVE_AND_EXIT, K7.f.GDPR).observe(this$0, new Observer() { // from class: v5.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.o(i.this, (String) obj);
            }
        });
    }

    @Override // T7.m.a
    public void a(p item) {
        AbstractC3255y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str = I5.d.f4212w;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                int i8 = item.f7407a;
                I5.d dVar = new I5.d();
                Bundle bundle = new Bundle();
                bundle.putInt("stack_id", i8);
                dVar.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().add(dVar, str).commit();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U7.a.b
    public void c(U7.d item) {
        AbstractC3255y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f10538a instanceof E6.g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = T7.i.f10207y;
            String str = T7.i.f10208z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                E6.f fVar = item.f10538a;
                String str2 = fVar.f2643b;
                String a8 = ((E6.g) fVar).a();
                String b8 = ((E6.g) item.f10538a).b();
                k kVar = this.f40272C;
                k kVar2 = null;
                if (kVar == null) {
                    AbstractC3255y.y("viewModel");
                    kVar = null;
                }
                String str3 = kVar.f40295f.f().f7363i;
                k kVar3 = this.f40272C;
                if (kVar3 == null) {
                    AbstractC3255y.y("viewModel");
                } else {
                    kVar2 = kVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a8, b8, str3, kVar2.f40295f.f().f7368n, item.f10538a.f2642a, item.f10541d, false, null, 384), str).commit();
            }
        }
    }

    @Override // U7.a.b
    public void d(U7.d item) {
        AbstractC3255y.i(item, "item");
        k kVar = this.f40272C;
        if (kVar == null) {
            AbstractC3255y.y("viewModel");
            kVar = null;
        }
        kVar.getClass();
        AbstractC3255y.i(item, "item");
        E6.f fVar = item.f10538a;
        if (fVar instanceof E6.i) {
            Boolean bool = item.f10539b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3255y.d(bool, bool2)) {
                kVar.f40290a.f993r.set(item.f10538a.f2642a);
            } else {
                kVar.f40290a.f993r.unset(item.f10538a.f2642a);
            }
            K7.m mVar = K7.m.f5260a;
            StringBuilder a8 = AbstractC3491a.a("Purposes", '_');
            a8.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, bool2, mVar, a8.toString());
            return;
        }
        if (fVar instanceof E6.d) {
            Boolean bool3 = item.f10539b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3255y.d(bool3, bool4)) {
                kVar.f40290a.f992q.set(item.f10538a.f2642a);
            } else {
                kVar.f40290a.f992q.unset(item.f10538a.f2642a);
            }
            K7.m mVar2 = K7.m.f5260a;
            StringBuilder a9 = AbstractC3491a.a("Special Features", '_');
            a9.append(item.f10538a.f2642a);
            AbstractC3492b.a(item.f10539b, bool4, mVar2, a9.toString());
        }
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore, "it.viewModelStore");
            k kVar = (k) new ViewModelProvider(viewModelStore, new l()).get(k.class);
            this.f40272C = kVar;
            if (kVar == null) {
                AbstractC3255y.y("viewModel");
                kVar = null;
            }
            kVar.f40304o.observe(this, new Observer() { // from class: v5.a
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    i.l(i.this, (Boolean) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5864g, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentActivity activity;
        AbstractC3255y.i(item, "item");
        if (item.getItemId() == 16908332 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        Integer num;
        k kVar;
        String str;
        Map map;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f40274m = (RecyclerView) view.findViewById(L1.b.f5774T);
        this.f40275n = (RecyclerView) view.findViewById(L1.b.f5782X);
        this.f40276o = (RecyclerView) view.findViewById(L1.b.f5778V);
        this.f40277p = (RecyclerView) view.findViewById(L1.b.f5784Y);
        this.f40278q = (ConstraintLayout) view.findViewById(L1.b.f5756K);
        this.f40279r = (LinearLayout) view.findViewById(L1.b.f5795c0);
        this.f40280s = (LinearLayout) view.findViewById(L1.b.f5798d0);
        this.f40282u = (Button) view.findViewById(L1.b.f5794c);
        this.f40281t = (Button) view.findViewById(L1.b.f5821l);
        this.f40283v = (TextView) view.findViewById(L1.b.f5785Y0);
        this.f40284w = (TextView) view.findViewById(L1.b.f5817j1);
        this.f40285x = (TextView) view.findViewById(L1.b.f5796c1);
        this.f40286y = (TextView) view.findViewById(L1.b.f5763N0);
        this.f40287z = (TextView) view.findViewById(L1.b.f5783X0);
        this.f40270A = (TextView) view.findViewById(L1.b.f5781W0);
        int i9 = L1.b.f5856z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i9);
        this.f40271B = frameLayout;
        if (C2001i.f15552b) {
            getChildFragmentManager().beginTransaction().add(i9, new C1999g(), C1999g.f15543h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        k kVar2 = this.f40272C;
        if (kVar2 == null) {
            AbstractC3255y.y("viewModel");
            kVar2 = null;
        }
        kVar2.getClass();
        AbstractC3364k.d(ViewModelKt.getViewModelScope(kVar2), C3347b0.b(), null, new j(kVar2, null), 2, null);
        k kVar3 = this.f40272C;
        if (kVar3 == null) {
            AbstractC3255y.y("viewModel");
            kVar3 = null;
        }
        E6.e eVar = kVar3.f40290a.f976a;
        if (eVar == null || (map = eVar.f2638i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((E6.l) entry.getValue()).f2656k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = kVar3.f40291b.f3926c.f3921a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1378t.b1(((H6.d) obj).f3919f);
            List list2 = kVar3.f40291b.f3925b.f3890h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1941c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        String valueOf = String.valueOf(kVar3.f40292c.f933a.size() + arrayList.size() + i8 + (kVar3.f40293d == null ? 0 : 1));
        k kVar4 = this.f40272C;
        if (kVar4 == null) {
            AbstractC3255y.y("viewModel");
            kVar4 = null;
        }
        String str2 = kVar4.f40295f.f().f7356b;
        TextView textView = this.f40270A;
        if (textView != null) {
            textView.setText(j6.n.y(str2, "${partners}", valueOf, true));
        }
        TextView textView2 = this.f40270A;
        if (textView2 != null) {
            k kVar5 = this.f40272C;
            if (kVar5 == null) {
                AbstractC3255y.y("viewModel");
                kVar5 = null;
            }
            kVar5.getClass();
            if (C2001i.f15552b) {
                str = kVar5.f40300k.f4935b.f4930c;
            } else {
                str = "";
            }
            textView2.append(str);
        }
        TextView textView3 = this.f40287z;
        if (textView3 != null) {
            k kVar6 = this.f40272C;
            if (kVar6 == null) {
                AbstractC3255y.y("viewModel");
                kVar6 = null;
            }
            textView3.setText(L7.b.a(kVar6.f40295f.f().f7359e));
        }
        TextView textView4 = this.f40286y;
        if (textView4 != null) {
            k kVar7 = this.f40272C;
            if (kVar7 == null) {
                AbstractC3255y.y("viewModel");
                kVar7 = null;
            }
            textView4.setText(L7.b.a(kVar7.f40295f.f().f7357c));
        }
        TextView textView5 = this.f40285x;
        if (textView5 != null) {
            k kVar8 = this.f40272C;
            if (kVar8 == null) {
                AbstractC3255y.y("viewModel");
                kVar8 = null;
            }
            textView5.setText(kVar8.f40295f.f().f7358d);
        }
        TextView textView6 = this.f40284w;
        if (textView6 != null) {
            k kVar9 = this.f40272C;
            if (kVar9 == null) {
                AbstractC3255y.y("viewModel");
                kVar9 = null;
            }
            textView6.setText(kVar9.f40295f.f().f7360f);
        }
        TextView textView7 = this.f40283v;
        if (textView7 != null) {
            k kVar10 = this.f40272C;
            if (kVar10 == null) {
                AbstractC3255y.y("viewModel");
                kVar10 = null;
            }
            textView7.setText(kVar10.f40295f.f().f7364j);
        }
        TextView textView8 = this.f10171b;
        if (textView8 != null) {
            k kVar11 = this.f40272C;
            if (kVar11 == null) {
                AbstractC3255y.y("viewModel");
                kVar11 = null;
            }
            textView8.setText(kVar11.f40295f.f().f7355a);
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: v5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
            k kVar12 = this.f40272C;
            if (kVar12 == null) {
                AbstractC3255y.y("viewModel");
                kVar12 = null;
            }
            imageView.setContentDescription(kVar12.f40295f.f().f7369o);
        }
        k kVar13 = this.f40272C;
        if (kVar13 == null) {
            AbstractC3255y.y("viewModel");
            kVar13 = null;
        }
        List d8 = kVar13.d();
        M7.c cVar = this.f10179j;
        this.f40273D = new m(d8, this, cVar == null ? null : cVar.f7257i, cVar == null ? null : cVar.f7249a, this.f10181l);
        RecyclerView recyclerView = this.f40277p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            m mVar = this.f40273D;
            if (mVar == null) {
                AbstractC3255y.y("stacksAdapter");
                mVar = null;
            }
            recyclerView.setAdapter(mVar);
        }
        RecyclerView recyclerView2 = this.f40276o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            k kVar14 = this.f40272C;
            if (kVar14 == null) {
                AbstractC3255y.y("viewModel");
                kVar14 = null;
            }
            List b8 = kVar14.b();
            M7.c cVar2 = this.f10179j;
            recyclerView2.setAdapter(new U7.a(b8, this, null, null, cVar2 == null ? null : cVar2.f7257i, cVar2 == null ? null : cVar2.f7253e, cVar2 == null ? null : cVar2.f7254f, cVar2 == null ? null : cVar2.f7249a, null, this.f10181l, 268));
        }
        RecyclerView recyclerView3 = this.f40275n;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            k kVar15 = this.f40272C;
            if (kVar15 == null) {
                AbstractC3255y.y("viewModel");
                kVar15 = null;
            }
            List c8 = kVar15.c();
            M7.c cVar3 = this.f10179j;
            recyclerView3.setAdapter(new U7.a(c8, this, null, null, cVar3 == null ? null : cVar3.f7257i, cVar3 == null ? null : cVar3.f7253e, cVar3 == null ? null : cVar3.f7254f, cVar3 == null ? null : cVar3.f7249a, null, this.f10181l, 268));
        }
        RecyclerView recyclerView4 = this.f40274m;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
            k kVar16 = this.f40272C;
            if (kVar16 == null) {
                AbstractC3255y.y("viewModel");
                kVar16 = null;
            }
            List list3 = kVar16.f40296g;
            Context context = recyclerView4.getContext();
            AbstractC3255y.h(context, "context");
            M7.c cVar4 = this.f10179j;
            recyclerView4.setAdapter(new T7.l(list3, context, cVar4 == null ? null : cVar4.f7260l, this.f10181l));
        }
        s();
        TextView textView9 = this.f40285x;
        if (textView9 != null) {
            k kVar17 = this.f40272C;
            if (kVar17 == null) {
                AbstractC3255y.y("viewModel");
                kVar17 = null;
            }
            k kVar18 = this.f40272C;
            if (kVar18 == null) {
                AbstractC3255y.y("viewModel");
                kVar18 = null;
            }
            List itemsList = kVar18.b();
            kVar17.getClass();
            AbstractC3255y.i(itemsList, "itemsList");
            textView9.setVisibility(((ArrayList) itemsList).isEmpty() ^ true ? 0 : 8);
        }
        TextView textView10 = this.f40284w;
        if (textView10 != null) {
            k kVar19 = this.f40272C;
            if (kVar19 == null) {
                AbstractC3255y.y("viewModel");
                kVar19 = null;
            }
            k kVar20 = this.f40272C;
            if (kVar20 == null) {
                AbstractC3255y.y("viewModel");
                kVar = null;
            } else {
                kVar = kVar20;
            }
            List itemsList2 = kVar.c();
            kVar19.getClass();
            AbstractC3255y.i(itemsList2, "itemsList");
            textView10.setVisibility(((ArrayList) itemsList2).isEmpty() ^ true ? 0 : 8);
        }
        M7.c cVar5 = this.f10179j;
        if (cVar5 != null) {
            Integer num2 = cVar5.f7255g;
            if (num2 != null) {
                int intValue = num2.intValue();
                ConstraintLayout constraintLayout = this.f40278q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num3 = cVar5.f7257i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView11 = this.f40285x;
                if (textView11 != null) {
                    textView11.setTextColor(intValue2);
                }
                TextView textView12 = this.f40284w;
                if (textView12 != null) {
                    textView12.setTextColor(intValue2);
                }
                TextView textView13 = this.f40283v;
                if (textView13 != null) {
                    textView13.setTextColor(intValue2);
                }
                TextView textView14 = this.f40287z;
                if (textView14 != null) {
                    textView14.setTextColor(intValue2);
                }
                TextView textView15 = this.f40286y;
                if (textView15 != null) {
                    textView15.setTextColor(intValue2);
                }
                TextView textView16 = this.f40270A;
                if (textView16 != null) {
                    textView16.setTextColor(intValue2);
                }
            }
            Integer num4 = cVar5.f7249a;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView17 = this.f40270A;
                if (textView17 != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue3);
                    textView17.setBackground(gradientDrawable);
                }
            }
            Integer num5 = cVar5.f7261m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button = this.f40282u;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f40281t;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar5.f7263o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f40282u;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
                Button button4 = this.f40281t;
                if (button4 != null) {
                    button4.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        M7.c cVar6 = this.f10179j;
        if (cVar6 != null && (num = cVar6.f7249a) != null) {
            int intValue6 = num.intValue();
            View findViewById = view.findViewById(L1.b.f5764O);
            if (findViewById != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById2 = view.findViewById(L1.b.f5804f0);
            if (findViewById2 != null) {
                findViewById2.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById3 = view.findViewById(L1.b.f5760M);
            if (findViewById3 != null) {
                findViewById3.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById4 = view.findViewById(L1.b.f5833p);
            if (findViewById4 != null) {
                findViewById4.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById5 = view.findViewById(L1.b.f5748G);
            if (findViewById5 != null) {
                findViewById5.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
        }
        Typeface typeface = this.f10180k;
        if (typeface != null) {
            TextView textView18 = this.f40285x;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            TextView textView19 = this.f40284w;
            if (textView19 != null) {
                textView19.setTypeface(typeface);
            }
            TextView textView20 = this.f40283v;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f10181l;
        if (typeface2 == null) {
            return;
        }
        TextView textView21 = this.f40270A;
        if (textView21 != null) {
            textView21.setTypeface(typeface2);
        }
        TextView textView22 = this.f40287z;
        if (textView22 != null) {
            textView22.setTypeface(typeface2);
        }
        TextView textView23 = this.f40286y;
        if (textView23 != null) {
            textView23.setTypeface(typeface2);
        }
        Button button5 = this.f40282u;
        if (button5 != null) {
            button5.setTypeface(typeface2);
        }
        Button button6 = this.f40281t;
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
            fragment = supportFragmentManager.findFragmentByTag(G5.f.f3384m);
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
        Button button = this.f40282u;
        k kVar = null;
        if (button != null) {
            k kVar2 = this.f40272C;
            if (kVar2 == null) {
                AbstractC3255y.y("viewModel");
                kVar2 = null;
            }
            button.setText(kVar2.f40295f.f().f7361g);
            button.setOnClickListener(new View.OnClickListener() { // from class: v5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.r(i.this, view);
                }
            });
        }
        Button button2 = this.f40281t;
        if (button2 != null) {
            k kVar3 = this.f40272C;
            if (kVar3 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                kVar = kVar3;
            }
            button2.setText(kVar.f40295f.f().f7362h);
            button2.setOnClickListener(new View.OnClickListener() { // from class: v5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.t(i.this, view);
                }
            });
        }
        LinearLayout linearLayout = this.f40280s;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: v5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.n(i.this, view);
                }
            });
        }
        LinearLayout linearLayout2 = this.f40279r;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: v5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.p(i.this, view);
                }
            });
        }
    }
}
