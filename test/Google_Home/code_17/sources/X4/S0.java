package X4;

import G4.C1199i;
import P5.AbstractC1378t;
import Z4.InterfaceC1587a;
import a5.C1641h;
import a5.C1644k;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import g2.InterfaceC2865e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class S0 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private C1199i f13125a;

    /* renamed from: d, reason: collision with root package name */
    private a5.N f13128d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f13129e;

    /* renamed from: f, reason: collision with root package name */
    private a5.N f13130f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f13131g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f13132h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13134j;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f13126b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f13127c = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f13133i = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13135k = true;

    /* renamed from: l, reason: collision with root package name */
    private Z4.s f13136l = new c();

    /* renamed from: m, reason: collision with root package name */
    private final a f13137m = new a();

    /* renamed from: n, reason: collision with root package name */
    private final b f13138n = new b();

    /* loaded from: classes5.dex */
    public static final class b implements Z4.n {
        b() {
        }

        @Override // Z4.n
        public void a(a5.N topHorizontalTopReceived) {
            AbstractC3255y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C1199i c1199i = S0.this.f13125a;
            if (c1199i != null) {
                c1199i.u(topHorizontalTopReceived);
            }
        }

        @Override // Z4.n
        public void b(ArrayList miniTopsReceived) {
            C1199i c1199i;
            AbstractC3255y.i(miniTopsReceived, "miniTopsReceived");
            S0.this.f13127c = miniTopsReceived;
            if (S0.this.f13127c.size() > 0 && (c1199i = S0.this.f13125a) != null) {
                c1199i.l(S0.this.f13127c);
            }
        }

        @Override // Z4.n
        public void c(C1641h appInfoReceived) {
            AbstractC3255y.i(appInfoReceived, "appInfoReceived");
            C1199i c1199i = S0.this.f13125a;
            if (c1199i != null) {
                c1199i.j(appInfoReceived);
            }
        }

        @Override // Z4.n
        public void d(ArrayList homeFeaturesReceived) {
            AbstractC3255y.i(homeFeaturesReceived, "homeFeaturesReceived");
            S0.this.f13126b = homeFeaturesReceived;
        }

        @Override // Z4.n
        public void e(a5.N topByCategory) {
            AbstractC3255y.i(topByCategory, "topByCategory");
            S0.this.f13128d = topByCategory;
        }

        @Override // Z4.n
        public void f(a5.N topHorizontalLatestReceived) {
            AbstractC3255y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C1199i c1199i = S0.this.f13125a;
            if (c1199i != null) {
                c1199i.t(topHorizontalLatestReceived);
            }
        }

        @Override // Z4.n
        public void g(a5.N topHorizontalNewReleasesReceived) {
            AbstractC3255y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            S0.this.f13130f = topHorizontalNewReleasesReceived;
        }

        @Override // Z4.n
        public void h() {
            S0.this.x();
        }

        @Override // Z4.n
        public void i(C1641h appReplacement) {
            AbstractC3255y.i(appReplacement, "appReplacement");
            C1199i c1199i = S0.this.f13125a;
            if (c1199i != null) {
                c1199i.b(appReplacement);
            }
        }

        @Override // Z4.n
        public void j(ArrayList recentFeaturedReceived) {
            C1199i c1199i;
            AbstractC3255y.i(recentFeaturedReceived, "recentFeaturedReceived");
            if (recentFeaturedReceived.size() > 0 && (c1199i = S0.this.f13125a) != null) {
                c1199i.s((C1641h) AbstractC1378t.m0(recentFeaturedReceived));
            }
        }

        @Override // Z4.n
        public void k(ArrayList floatingMiniTopsReceived) {
            AbstractC3255y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            if (floatingMiniTopsReceived.size() <= 3) {
                S0.this.f13129e = floatingMiniTopsReceived;
            } else {
                S0.this.f13129e = new ArrayList();
                ArrayList arrayList = S0.this.f13129e;
                if (arrayList != null) {
                    arrayList.add(floatingMiniTopsReceived.get(0));
                }
                ArrayList arrayList2 = S0.this.f13129e;
                if (arrayList2 != null) {
                    arrayList2.add(floatingMiniTopsReceived.get(1));
                }
                ArrayList arrayList3 = S0.this.f13129e;
                if (arrayList3 != null) {
                    arrayList3.add(floatingMiniTopsReceived.get(2));
                }
            }
            C1199i c1199i = S0.this.f13125a;
            if (c1199i != null) {
                c1199i.o(S0.this.f13129e);
            }
        }

        @Override // Z4.n
        public void l(ArrayList categoriesReceived) {
            AbstractC3255y.i(categoriesReceived, "categoriesReceived");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Z4.s {
        c() {
        }

        @Override // Z4.s
        public void a(a5.N topByCategory) {
            AbstractC3255y.i(topByCategory, "topByCategory");
            if (UptodownApp.f29058B.a0()) {
                int b8 = topByCategory.b().b();
                if (b8 != -3 && b8 != -2) {
                    if (b8 != -1) {
                        if (b8 != 523) {
                            if (topByCategory.b().s()) {
                                FragmentActivity activity = S0.this.getActivity();
                                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity).P7(topByCategory.b());
                                return;
                            } else {
                                FragmentActivity activity2 = S0.this.getActivity();
                                AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity2).S7(topByCategory.b());
                                return;
                            }
                        }
                        FragmentActivity activity3 = S0.this.getActivity();
                        AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                        ((MainActivity) activity3).p5(1);
                        return;
                    }
                    FragmentActivity activity4 = S0.this.getActivity();
                    AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity4).p5(2);
                    return;
                }
                FragmentActivity activity5 = S0.this.getActivity();
                AbstractC3255y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity5).P7(topByCategory.b());
            }
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0() && S0.this.getActivity() != null && (S0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = S0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).F2(app.i());
            }
        }

        @Override // Z4.InterfaceC1593g
        public void c(C1644k category) {
            AbstractC3255y.i(category, "category");
            if (UptodownApp.f29058B.a0()) {
                if (category.b() == 523) {
                    FragmentActivity activity = S0.this.getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).p5(1);
                } else {
                    FragmentActivity activity2 = S0.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).S7(category);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !S0.this.f13134j && S0.this.f13135k && !recyclerView.canScrollVertically(1)) {
                S0.this.z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13148a;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13148a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                S0 s02 = S0.this;
                this.f13148a = 1;
                if (s02.A(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13150a;

        /* renamed from: b, reason: collision with root package name */
        Object f13151b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f13152c;

        /* renamed from: e, reason: collision with root package name */
        int f13154e;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13152c = obj;
            this.f13154e |= Integer.MIN_VALUE;
            return S0.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13155a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f13157c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f13157c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f13157c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f13155a == 0) {
                O5.t.b(obj);
                Context requireContext = S0.this.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C3660F c3660f = new C3660F(requireContext);
                ArrayList arrayList = new ArrayList();
                if (S0.this.f13129e != null) {
                    ArrayList arrayList2 = S0.this.f13129e;
                    AbstractC3255y.f(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kotlin.coroutines.jvm.internal.b.c(((a5.N) it.next()).b().b()));
                    }
                }
                if (arrayList.size() <= 0) {
                    S0.this.f13135k = false;
                } else {
                    a5.I j8 = c3660f.j(arrayList, 20, 0);
                    if (!j8.b() && j8.d() != null) {
                        String d8 = j8.d();
                        AbstractC3255y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = j8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                i8 = jSONObject.getInt("success");
                            } else {
                                i8 = 0;
                            }
                            if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                int length = jSONArray.length();
                                for (int i9 = 0; i9 < length; i9++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                    if (!jSONObject2.isNull("floatingCategory")) {
                                        JSONObject jsonObjectCategory = jSONObject2.getJSONObject("floatingCategory");
                                        C1644k c1644k = new C1644k(0, null, null, 7, null);
                                        AbstractC3255y.h(jsonObjectCategory, "jsonObjectCategory");
                                        c1644k.x(jsonObjectCategory);
                                        ArrayList arrayList3 = new ArrayList();
                                        if (!jSONObject2.isNull("apps")) {
                                            JSONArray jSONArray2 = jSONObject2.getJSONArray("apps");
                                            int length2 = jSONArray2.length();
                                            for (int i10 = 0; i10 < length2; i10++) {
                                                C1641h c1641h = new C1641h();
                                                JSONObject jsonObjectFloatingCategoryApp = jSONArray2.getJSONObject(i10);
                                                AbstractC3255y.h(jsonObjectFloatingCategoryApp, "jsonObjectFloatingCategoryApp");
                                                c1641h.a(jsonObjectFloatingCategoryApp);
                                                arrayList3.add(c1641h);
                                            }
                                        }
                                        a5.N n8 = new a5.N(c1644k, arrayList3, 0, 4, null);
                                        n8.f(5);
                                        ArrayList arrayList4 = S0.this.f13129e;
                                        if (arrayList4 != null) {
                                            kotlin.coroutines.jvm.internal.b.a(arrayList4.add(n8));
                                        }
                                        this.f13157c.add(n8);
                                    }
                                }
                            }
                        }
                    }
                    S0.this.f13135k = false;
                }
                S0.this.f13134j = false;
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S0 f13160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, S0 s02, S5.d dVar) {
            super(2, dVar);
            this.f13159b = arrayList;
            this.f13160c = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f13159b, this.f13160c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13158a == 0) {
                O5.t.b(obj);
                if (this.f13159b.size() < 4) {
                    this.f13160c.f13135k = false;
                }
                Iterator it = this.f13159b.iterator();
                while (it.hasNext()) {
                    a5.N item = (a5.N) it.next();
                    C1199i c1199i = this.f13160c.f13125a;
                    if (c1199i != null) {
                        AbstractC3255y.h(item, "item");
                        c1199i.a(item);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S0 f13163c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, S0 s02, S5.d dVar) {
            super(2, dVar);
            this.f13162b = str;
            this.f13163c = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f13162b, this.f13163c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1199i c1199i;
            T5.b.e();
            if (this.f13161a == 0) {
                O5.t.b(obj);
                String str = this.f13162b;
                if (str != null && str.length() != 0 && (c1199i = this.f13163c.f13125a) != null) {
                    String str2 = this.f13162b;
                    RecyclerView recyclerView = this.f13163c.f13132h;
                    AbstractC3255y.f(recyclerView);
                    c1199i.w(str2, recyclerView);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X4.S0.f
            if (r0 == 0) goto L13
            r0 = r8
            X4.S0$f r0 = (X4.S0.f) r0
            int r1 = r0.f13154e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13154e = r1
            goto L18
        L13:
            X4.S0$f r0 = new X4.S0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13152c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13154e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r8)
            goto L7e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f13151b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f13150a
            X4.S0 r4 = (X4.S0) r4
            O5.t.b(r8)
            goto L68
        L41:
            O5.t.b(r8)
            android.content.Context r8 = r7.getContext()
            if (r8 == 0) goto L81
            r7.f13134j = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            l6.I r8 = l6.C3347b0.b()
            X4.S0$g r6 = new X4.S0$g
            r6.<init>(r2, r5)
            r0.f13150a = r7
            r0.f13151b = r2
            r0.f13154e = r4
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r6, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r4 = r7
        L68:
            l6.J0 r8 = l6.C3347b0.c()
            X4.S0$h r6 = new X4.S0$h
            r6.<init>(r2, r4, r5)
            r0.f13150a = r5
            r0.f13151b = r5
            r0.f13154e = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r6, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            O5.I r8 = O5.I.f8278a
            return r8
        L81:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.S0.A(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (this.f13126b.size() > 0) {
            C1199i c1199i = this.f13125a;
            if (c1199i != null) {
                c1199i.q(this.f13126b, this.f13128d, this.f13130f);
            }
            RecyclerView recyclerView = this.f13132h;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f13125a);
            }
        }
        RelativeLayout relativeLayout = this.f13131g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (getActivity() != null && (getActivity() instanceof MainActivity) && this.f13133i) {
            this.f13133i = false;
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).x5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void B() {
        RecyclerView recyclerView = this.f13132h;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void C(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new i(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13133i = true;
        Z4.s sVar = this.f13136l;
        a aVar = this.f13137m;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        String simpleName = S0.class.getSimpleName();
        AbstractC3255y.h(simpleName, "this.javaClass.simpleName");
        this.f13125a = new C1199i(sVar, aVar, requireContext, simpleName);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.home_fragment, viewGroup, false);
        this.f13131g = (RelativeLayout) inflate.findViewById(R.id.loading_view_home_fragment);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f13132h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.f13132h;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.f13132h;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new q5.q((int) getResources().getDimension(R.dimen.margin_m)));
        }
        RecyclerView recyclerView4 = this.f13132h;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new d());
        }
        y();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC2865e n8 = UptodownApp.f29058B.n();
        if (n8 != null) {
            n8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC2865e n8;
        super.onResume();
        UptodownApp.a aVar = UptodownApp.f29058B;
        InterfaceC2865e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                if (aVar2.l(requireContext2) > 0 && (n8 = aVar.n()) != null) {
                    n8.play();
                }
            }
        }
    }

    public final void y() {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            new V4.c(requireContext, this.f13138n, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC1587a {

        /* renamed from: X4.S0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0252a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S0 f13140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13141b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0252a(S0 s02, C1641h c1641h) {
                super(0);
                this.f13140a = s02;
                this.f13141b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m80invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m80invoke() {
                this.f13140a.C(this.f13141b.y0());
            }
        }

        a() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (S0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = S0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout E52 = ((MainActivity) activity).E5();
                if (E52 == null || E52.getVisibility() != 0) {
                    FragmentActivity activity2 = S0.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).X6(appInfo, new C0252a(S0.this, appInfo));
                    Context requireContext = S0.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    new V4.i(requireContext, appInfo.i(), new b(S0.this), LifecycleOwnerKt.getLifecycleScope(S0.this));
                }
            }
        }

        /* loaded from: classes5.dex */
        public static final class b implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S0 f13142a;

            /* renamed from: X4.S0$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static final class C0253a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ S0 f13143a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1641h f13144b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0253a(S0 s02, C1641h c1641h) {
                    super(0);
                    this.f13143a = s02;
                    this.f13144b = c1641h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m81invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m81invoke() {
                    this.f13143a.C(this.f13144b.y0());
                }
            }

            b(S0 s02) {
                this.f13142a = s02;
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13142a.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).X6(appInfo, new C0253a(this.f13142a, appInfo));
            }

            @Override // Z4.r
            public void c(int i8) {
            }
        }
    }
}
