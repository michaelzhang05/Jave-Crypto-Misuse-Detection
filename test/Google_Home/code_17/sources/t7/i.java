package T7;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i extends T7.a {

    /* renamed from: A */
    public static int f10205A;

    /* renamed from: B */
    public static U7.e f10206B;

    /* renamed from: y */
    public static final a f10207y = new a();

    /* renamed from: z */
    public static final String f10208z;

    /* renamed from: m */
    public ConstraintLayout f10209m;

    /* renamed from: n */
    public TextView f10210n;

    /* renamed from: o */
    public TextView f10211o;

    /* renamed from: p */
    public TextView f10212p;

    /* renamed from: q */
    public TextView f10213q;

    /* renamed from: r */
    public TextView f10214r;

    /* renamed from: s */
    public NestedScrollView f10215s;

    /* renamed from: t */
    public RecyclerView f10216t;

    /* renamed from: u */
    public v5.k f10217u;

    /* renamed from: v */
    public boolean f10218v;

    /* renamed from: w */
    public boolean f10219w;

    /* renamed from: x */
    public String f10220x;

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ i a(a aVar, String str, String str2, String str3, String str4, String str5, int i8, U7.e eVar, boolean z8, E5.j jVar, int i9) {
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            boolean z9;
            E5.j jVar2;
            if ((i9 & 1) != 0) {
                str6 = "";
            } else {
                str6 = str;
            }
            if ((i9 & 2) != 0) {
                str7 = "";
            } else {
                str7 = str2;
            }
            if ((i9 & 4) != 0) {
                str8 = "";
            } else {
                str8 = str3;
            }
            if ((i9 & 8) != 0) {
                str9 = "";
            } else {
                str9 = str4;
            }
            if ((i9 & 16) != 0) {
                str10 = "";
            } else {
                str10 = str5;
            }
            if ((i9 & 128) != 0) {
                z9 = false;
            } else {
                z9 = z8;
            }
            if ((i9 & 256) != 0) {
                jVar2 = E5.j.ALL_VENDORS;
            } else {
                jVar2 = null;
            }
            return aVar.b(str6, str7, str8, str9, str10, i8, eVar, z9, jVar2);
        }

        public final i b(String title, String description, String legalDescription, String legalDescriptionLabel, String closeLabel, int i8, U7.e switchItemType, boolean z8, E5.j vendorTypeSelected) {
            AbstractC3255y.i(title, "title");
            AbstractC3255y.i(description, "description");
            AbstractC3255y.i(legalDescription, "legalDescription");
            AbstractC3255y.i(legalDescriptionLabel, "legalDescriptionLabel");
            AbstractC3255y.i(closeLabel, "closeLabel");
            AbstractC3255y.i(switchItemType, "switchItemType");
            AbstractC3255y.i(vendorTypeSelected, "vendorTypeSelected");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString(CampaignEx.JSON_KEY_TITLE, title);
            bundle.putString("description", description);
            bundle.putString("legal_description", legalDescription);
            bundle.putString("legal_description_label", legalDescriptionLabel);
            bundle.putString("close_button_label", closeLabel);
            bundle.putBoolean("legitimate_interest", z8);
            bundle.putString("vendor_type_selected", vendorTypeSelected.name());
            i.f10205A = i8;
            i.f10206B = switchItemType;
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends Dialog {

        /* renamed from: a */
        public final /* synthetic */ i f10221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, i iVar, int i8) {
            super(context, i8);
            this.f10221a = iVar;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            i iVar = this.f10221a;
            a aVar = i.f10207y;
            iVar.n();
        }
    }

    static {
        String simpleName = i.class.getSimpleName();
        AbstractC3255y.h(simpleName, "LegalDetailFragment::class.java.simpleName");
        f10208z = simpleName;
    }

    public static final void k(i this$0, View view) {
        E6.e eVar;
        Map map;
        E6.l lVar;
        U7.d a8;
        Map map2;
        U7.d a9;
        Map map3;
        U7.d a10;
        Map map4;
        AbstractC3255y.i(this$0, "this$0");
        NestedScrollView nestedScrollView = this$0.f10215s;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        RecyclerView recyclerView = this$0.f10216t;
        if (recyclerView != null) {
            v5.k kVar = this$0.f10217u;
            if (kVar == null) {
                AbstractC3255y.y("viewModel");
                kVar = null;
            }
            int i8 = f10205A;
            U7.e itemType = f10206B;
            if (itemType == null) {
                AbstractC3255y.y("localSwitchItemType");
                itemType = null;
            }
            boolean z8 = this$0.f10219w;
            String vendorTypeSelected = this$0.f10220x;
            if (vendorTypeSelected == null) {
                vendorTypeSelected = "";
            }
            kVar.getClass();
            AbstractC3255y.i(itemType, "itemType");
            AbstractC3255y.i(vendorTypeSelected, "vendorTypeSelected");
            ArrayList arrayList = new ArrayList();
            int ordinal = itemType.ordinal();
            if (ordinal == 4) {
                ArrayList arrayList2 = new ArrayList();
                if ((AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3255y.d(vendorTypeSelected, "IAB_VENDORS")) && (eVar = kVar.f40290a.f976a) != null && (map = eVar.f2638i) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((E6.l) entry.getValue()).f2656k == null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        E6.l lVar2 = (E6.l) ((Map.Entry) it.next()).getValue();
                        if (z8) {
                            Iterator it2 = lVar2.f2650e.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(lVar2, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar2.f2643b, null, 82));
                                }
                            }
                        } else {
                            Iterator it3 = lVar2.f2649d.iterator();
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(lVar2, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar2.f2643b, null, 82));
                                }
                            }
                        }
                    }
                }
                if (AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3255y.d(vendorTypeSelected, "NON_IAB_VENDORS")) {
                    for (H6.d dVar : kVar.f40291b.f3926c.f3921a) {
                        if (z8) {
                            Iterator it4 = dVar.f3920g.iterator();
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(dVar.a(), null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, dVar.f3916c, null, 82));
                                }
                            }
                        } else {
                            Iterator it5 = dVar.f3919f.iterator();
                            while (it5.hasNext()) {
                                if (((Number) it5.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(dVar.a(), null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, dVar.f3916c, null, 82));
                                }
                            }
                        }
                    }
                    if (AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") && (lVar = kVar.f40293d) != null) {
                        if (z8) {
                            Iterator it6 = lVar.f2650e.iterator();
                            while (it6.hasNext()) {
                                if (((Number) it6.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(lVar, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar.f2643b, null, 82));
                                }
                            }
                        } else {
                            Iterator it7 = lVar.f2649d.iterator();
                            while (it7.hasNext()) {
                                if (((Number) it7.next()).intValue() == i8) {
                                    arrayList2.add(new U7.d(lVar, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar.f2643b, null, 82));
                                }
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            } else if (ordinal != 5) {
                if (ordinal != 6) {
                    if (ordinal == 7 && (AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3255y.d(vendorTypeSelected, "IAB_VENDORS"))) {
                        E6.e eVar2 = kVar.f40290a.f976a;
                        if (eVar2 != null && (map4 = eVar2.f2638i) != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : map4.entrySet()) {
                                if (((E6.l) entry2.getValue()).f2656k == null) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Iterator it8 = linkedHashMap2.entrySet().iterator();
                            while (it8.hasNext()) {
                                E6.l lVar3 = (E6.l) ((Map.Entry) it8.next()).getValue();
                                Iterator it9 = lVar3.f2654i.iterator();
                                while (it9.hasNext()) {
                                    if (((Number) it9.next()).intValue() == i8) {
                                        arrayList.add(new U7.d(lVar3, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar3.f2643b, null, 82));
                                    }
                                }
                            }
                        }
                        E6.l lVar4 = kVar.f40293d;
                        if (lVar4 != null && (a10 = kVar.a(vendorTypeSelected, lVar4.f2654i, i8)) != null) {
                            arrayList.add(a10);
                        }
                    }
                } else if (AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3255y.d(vendorTypeSelected, "IAB_VENDORS")) {
                    E6.e eVar3 = kVar.f40290a.f976a;
                    if (eVar3 != null && (map3 = eVar3.f2638i) != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (((E6.l) entry3.getValue()).f2656k == null) {
                                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it10 = linkedHashMap3.entrySet().iterator();
                        while (it10.hasNext()) {
                            E6.l lVar5 = (E6.l) ((Map.Entry) it10.next()).getValue();
                            Iterator it11 = lVar5.f2653h.iterator();
                            while (it11.hasNext()) {
                                if (((Number) it11.next()).intValue() == i8) {
                                    arrayList.add(new U7.d(lVar5, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar5.f2643b, null, 82));
                                }
                            }
                        }
                    }
                    E6.l lVar6 = kVar.f40293d;
                    if (lVar6 != null && (a9 = kVar.a(vendorTypeSelected, lVar6.f2653h, i8)) != null) {
                        arrayList.add(a9);
                    }
                }
            } else if (AbstractC3255y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3255y.d(vendorTypeSelected, "IAB_VENDORS")) {
                E6.e eVar4 = kVar.f40290a.f976a;
                if (eVar4 != null && (map2 = eVar4.f2638i) != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry4 : map2.entrySet()) {
                        if (((E6.l) entry4.getValue()).f2656k == null) {
                            linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it12 = linkedHashMap4.entrySet().iterator();
                    while (it12.hasNext()) {
                        E6.l lVar7 = (E6.l) ((Map.Entry) it12.next()).getValue();
                        Iterator it13 = lVar7.f2652g.iterator();
                        while (it13.hasNext()) {
                            if (((Number) it13.next()).intValue() == i8) {
                                arrayList.add(new U7.d(lVar7, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar7.f2643b, null, 82));
                            }
                        }
                    }
                }
                E6.l lVar8 = kVar.f40293d;
                if (lVar8 != null && (a8 = kVar.a(vendorTypeSelected, lVar8.f2652g, i8)) != null) {
                    arrayList.add(a8);
                }
            }
            j jVar = new j();
            M7.c cVar = this$0.f10179j;
            recyclerView.setAdapter(new U7.a(arrayList, jVar, null, null, cVar == null ? null : cVar.f7257i, null, null, cVar == null ? null : cVar.f7249a, null, this$0.f10181l, 364));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setVisibility(0);
        }
        this$0.f10218v = true;
    }

    public static final void m(i this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.n();
    }

    public final void l(View view) {
        this.f10209m = (ConstraintLayout) view.findViewById(L1.b.f5750H);
        this.f10210n = (TextView) view.findViewById(L1.b.f5850w);
        this.f10211o = (TextView) view.findViewById(L1.b.f5848v);
        this.f10212p = (TextView) view.findViewById(L1.b.f5846u);
        this.f10213q = (TextView) view.findViewById(L1.b.f5852x);
        this.f10214r = (TextView) view.findViewById(L1.b.f5805f1);
        this.f10215s = (NestedScrollView) view.findViewById(L1.b.f5792b0);
        this.f10216t = (RecyclerView) view.findViewById(L1.b.f5776U);
        v5.k kVar = this.f10217u;
        if (kVar == null) {
            AbstractC3255y.y("viewModel");
            kVar = null;
        }
        String str = kVar.f40295f.f().f7370p;
        if (str.length() > 0) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 0);
            TextView textView = this.f10214r;
            if (textView != null) {
                textView.setText(spannableString);
            }
        }
        TextView textView2 = this.f10214r;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: T7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView3 = this.f10213q;
            if (textView3 != null) {
                textView3.setText(arguments.getString(CampaignEx.JSON_KEY_TITLE, ""));
            }
            TextView textView4 = this.f10212p;
            if (textView4 != null) {
                textView4.setText(arguments.getString("description", ""));
            }
            TextView textView5 = this.f10211o;
            if (textView5 != null) {
                textView5.setText(arguments.getString("legal_description", ""));
            }
            TextView textView6 = this.f10210n;
            if (textView6 != null) {
                textView6.setText(arguments.getString("legal_description_label", ""));
            }
            this.f10219w = arguments.getBoolean("legitimate_interest", false);
            this.f10220x = arguments.getString("vendor_type_selected", "");
        }
    }

    public final void n() {
        if (this.f10218v) {
            NestedScrollView nestedScrollView = this.f10215s;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            RecyclerView recyclerView = this.f10216t;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f10218v = false;
            return;
        }
        K7.m mVar = K7.m.f5260a;
        StringBuilder sb = new StringBuilder();
        U7.e eVar = f10206B;
        if (eVar == null) {
            AbstractC3255y.y("localSwitchItemType");
            eVar = null;
        }
        int ordinal = eVar.ordinal();
        int i8 = 6;
        if (ordinal != 5) {
            if (ordinal != 6) {
                i8 = 7;
                if (ordinal != 7) {
                    i8 = 3;
                }
            } else {
                i8 = 1;
            }
        }
        sb.append(K7.b.a(i8));
        sb.append("-id:");
        sb.append(f10205A);
        mVar.f("collapseElement", sb.toString());
        dismiss();
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore, "it.viewModelStore");
            this.f10217u = (v5.k) new ViewModelProvider(viewModelStore, new v5.l()).get(v5.k.class);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        b bVar;
        Context context = getContext();
        if (context == null) {
            bVar = null;
        } else {
            bVar = new b(context, this, L1.f.f5900a);
        }
        if (bVar == null) {
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            AbstractC3255y.h(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        return inflater.inflate(L1.c.f5861d, viewGroup, false);
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        String str;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView2 = this.f10171b;
        v5.k kVar = null;
        if (textView2 != null) {
            U7.e eVar = f10206B;
            if (eVar == null) {
                AbstractC3255y.y("localSwitchItemType");
                eVar = null;
            }
            int ordinal = eVar.ordinal();
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        v5.k kVar2 = this.f10217u;
                        if (kVar2 == null) {
                            AbstractC3255y.y("viewModel");
                            kVar2 = null;
                        }
                        str = kVar2.f40295f.f().f7358d;
                    } else {
                        v5.k kVar3 = this.f10217u;
                        if (kVar3 == null) {
                            AbstractC3255y.y("viewModel");
                            kVar3 = null;
                        }
                        str = kVar3.f40295f.f().f7360f;
                    }
                } else {
                    v5.k kVar4 = this.f10217u;
                    if (kVar4 == null) {
                        AbstractC3255y.y("viewModel");
                        kVar4 = null;
                    }
                    str = kVar4.f40295f.f().f7360f;
                }
            } else {
                v5.k kVar5 = this.f10217u;
                if (kVar5 == null) {
                    AbstractC3255y.y("viewModel");
                    kVar5 = null;
                }
                str = kVar5.f40295f.f().f7358d;
            }
            textView2.setText(str);
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: T7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.m(i.this, view2);
                }
            });
            v5.k kVar6 = this.f10217u;
            if (kVar6 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                kVar = kVar6;
            }
            imageView.setContentDescription(kVar.f40295f.f().f7369o);
        }
        l(view);
        M7.c cVar = this.f10179j;
        if (cVar != null) {
            Integer num = cVar.f7257i;
            if (num != null) {
                int intValue = num.intValue();
                TextView textView3 = this.f10213q;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f10212p;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f10211o;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f10210n;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
            }
            Integer num2 = cVar.f7260l;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView7 = this.f10214r;
                if (textView7 != null) {
                    textView7.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f7255g;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                ConstraintLayout constraintLayout = this.f10209m;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue3);
                }
            }
        }
        Typeface typeface = this.f10180k;
        if (typeface != null && (textView = this.f10213q) != null) {
            textView.setTypeface(typeface);
        }
        Typeface typeface2 = this.f10181l;
        if (typeface2 != null) {
            TextView textView8 = this.f10214r;
            if (textView8 != null) {
                textView8.setTypeface(typeface2);
            }
            TextView textView9 = this.f10212p;
            if (textView9 != null) {
                textView9.setTypeface(typeface2);
            }
            TextView textView10 = this.f10211o;
            if (textView10 != null) {
                textView10.setTypeface(typeface2);
            }
            TextView textView11 = this.f10210n;
            if (textView11 != null) {
                textView11.setTypeface(typeface2);
            }
        }
    }
}
