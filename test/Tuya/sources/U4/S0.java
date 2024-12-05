package U4;

import D4.C1100i;
import M5.AbstractC1246t;
import W4.InterfaceC1478a;
import X4.C1498h;
import X4.C1501k;
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
import d2.InterfaceC2541e;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class S0 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private C1100i f11455a;

    /* renamed from: d, reason: collision with root package name */
    private X4.N f11458d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f11459e;

    /* renamed from: f, reason: collision with root package name */
    private X4.N f11460f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f11461g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f11462h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11464j;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f11456b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f11457c = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f11463i = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11465k = true;

    /* renamed from: l, reason: collision with root package name */
    private W4.s f11466l = new c();

    /* renamed from: m, reason: collision with root package name */
    private final a f11467m = new a();

    /* renamed from: n, reason: collision with root package name */
    private final b f11468n = new b();

    /* loaded from: classes5.dex */
    public static final class b implements W4.n {
        b() {
        }

        @Override // W4.n
        public void a(X4.N topHorizontalTopReceived) {
            AbstractC3159y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C1100i c1100i = S0.this.f11455a;
            if (c1100i != null) {
                c1100i.u(topHorizontalTopReceived);
            }
        }

        @Override // W4.n
        public void b(ArrayList miniTopsReceived) {
            C1100i c1100i;
            AbstractC3159y.i(miniTopsReceived, "miniTopsReceived");
            S0.this.f11457c = miniTopsReceived;
            if (S0.this.f11457c.size() > 0 && (c1100i = S0.this.f11455a) != null) {
                c1100i.l(S0.this.f11457c);
            }
        }

        @Override // W4.n
        public void c(X4.N topHorizontalNewReleasesReceived) {
            AbstractC3159y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            S0.this.f11460f = topHorizontalNewReleasesReceived;
        }

        @Override // W4.n
        public void d(ArrayList homeFeaturesReceived) {
            AbstractC3159y.i(homeFeaturesReceived, "homeFeaturesReceived");
            S0.this.f11456b = homeFeaturesReceived;
        }

        @Override // W4.n
        public void e() {
            S0.this.x();
        }

        @Override // W4.n
        public void f(X4.N topHorizontalLatestReceived) {
            AbstractC3159y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C1100i c1100i = S0.this.f11455a;
            if (c1100i != null) {
                c1100i.t(topHorizontalLatestReceived);
            }
        }

        @Override // W4.n
        public void g(ArrayList recentFeaturedReceived) {
            C1100i c1100i;
            AbstractC3159y.i(recentFeaturedReceived, "recentFeaturedReceived");
            if (recentFeaturedReceived.size() > 0 && (c1100i = S0.this.f11455a) != null) {
                c1100i.s((C1498h) AbstractC1246t.m0(recentFeaturedReceived));
            }
        }

        @Override // W4.n
        public void h(X4.N topByCategory) {
            AbstractC3159y.i(topByCategory, "topByCategory");
            S0.this.f11458d = topByCategory;
        }

        @Override // W4.n
        public void i(ArrayList floatingMiniTopsReceived) {
            AbstractC3159y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            if (floatingMiniTopsReceived.size() <= 3) {
                S0.this.f11459e = floatingMiniTopsReceived;
            } else {
                S0.this.f11459e = new ArrayList();
                ArrayList arrayList = S0.this.f11459e;
                if (arrayList != null) {
                    arrayList.add(floatingMiniTopsReceived.get(0));
                }
                ArrayList arrayList2 = S0.this.f11459e;
                if (arrayList2 != null) {
                    arrayList2.add(floatingMiniTopsReceived.get(1));
                }
                ArrayList arrayList3 = S0.this.f11459e;
                if (arrayList3 != null) {
                    arrayList3.add(floatingMiniTopsReceived.get(2));
                }
            }
            C1100i c1100i = S0.this.f11455a;
            if (c1100i != null) {
                c1100i.o(S0.this.f11459e);
            }
        }

        @Override // W4.n
        public void j(C1498h appReplacement) {
            AbstractC3159y.i(appReplacement, "appReplacement");
            C1100i c1100i = S0.this.f11455a;
            if (c1100i != null) {
                c1100i.b(appReplacement);
            }
        }

        @Override // W4.n
        public void k(C1498h appInfoReceived) {
            AbstractC3159y.i(appInfoReceived, "appInfoReceived");
            C1100i c1100i = S0.this.f11455a;
            if (c1100i != null) {
                c1100i.j(appInfoReceived);
            }
        }

        @Override // W4.n
        public void l(ArrayList categoriesReceived) {
            AbstractC3159y.i(categoriesReceived, "categoriesReceived");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements W4.s {
        c() {
        }

        @Override // W4.InterfaceC1484g
        public void a(C1501k category) {
            AbstractC3159y.i(category, "category");
            if (UptodownApp.f28003B.a0()) {
                if (category.c() == 523) {
                    FragmentActivity activity = S0.this.getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).r5(1);
                } else {
                    FragmentActivity activity2 = S0.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).T7(category);
                }
            }
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f28003B.a0() && S0.this.getActivity() != null && (S0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = S0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).F2(app.i());
            }
        }

        @Override // W4.s
        public void c(X4.N topByCategory) {
            AbstractC3159y.i(topByCategory, "topByCategory");
            if (UptodownApp.f28003B.a0()) {
                int c8 = topByCategory.b().c();
                if (c8 != -3 && c8 != -2) {
                    if (c8 != -1) {
                        if (c8 != 523) {
                            if (topByCategory.b().n()) {
                                FragmentActivity activity = S0.this.getActivity();
                                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity).Q7(topByCategory.b());
                                return;
                            } else {
                                FragmentActivity activity2 = S0.this.getActivity();
                                AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity2).T7(topByCategory.b());
                                return;
                            }
                        }
                        FragmentActivity activity3 = S0.this.getActivity();
                        AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                        ((MainActivity) activity3).r5(1);
                        return;
                    }
                    FragmentActivity activity4 = S0.this.getActivity();
                    AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity4).r5(2);
                    return;
                }
                FragmentActivity activity5 = S0.this.getActivity();
                AbstractC3159y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity5).Q7(topByCategory.b());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !S0.this.f11464j && S0.this.f11465k && !recyclerView.canScrollVertically(1)) {
                S0.this.z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11478a;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11478a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                S0 s02 = S0.this;
                this.f11478a = 1;
                if (s02.A(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11480a;

        /* renamed from: b, reason: collision with root package name */
        Object f11481b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11482c;

        /* renamed from: e, reason: collision with root package name */
        int f11484e;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11482c = obj;
            this.f11484e |= Integer.MIN_VALUE;
            return S0.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11485a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11487c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f11487c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f11487c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Q5.b.e();
            if (this.f11485a == 0) {
                L5.t.b(obj);
                Context requireContext = S0.this.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C3312F c3312f = new C3312F(requireContext);
                ArrayList arrayList = new ArrayList();
                if (S0.this.f11459e != null) {
                    ArrayList arrayList2 = S0.this.f11459e;
                    AbstractC3159y.f(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kotlin.coroutines.jvm.internal.b.c(((X4.N) it.next()).b().c()));
                    }
                }
                if (arrayList.size() <= 0) {
                    S0.this.f11465k = false;
                } else {
                    X4.I j8 = c3312f.j(arrayList, 20, 0);
                    if (!j8.b() && j8.d() != null) {
                        String d8 = j8.d();
                        AbstractC3159y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = j8.d();
                            AbstractC3159y.f(d9);
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
                                        C1501k c1501k = new C1501k(0, null, null, 7, null);
                                        AbstractC3159y.h(jsonObjectCategory, "jsonObjectCategory");
                                        c1501k.z(jsonObjectCategory);
                                        ArrayList arrayList3 = new ArrayList();
                                        if (!jSONObject2.isNull("apps")) {
                                            JSONArray jSONArray2 = jSONObject2.getJSONArray("apps");
                                            int length2 = jSONArray2.length();
                                            for (int i10 = 0; i10 < length2; i10++) {
                                                C1498h c1498h = new C1498h();
                                                JSONObject jsonObjectFloatingCategoryApp = jSONArray2.getJSONObject(i10);
                                                AbstractC3159y.h(jsonObjectFloatingCategoryApp, "jsonObjectFloatingCategoryApp");
                                                c1498h.b(jsonObjectFloatingCategoryApp);
                                                arrayList3.add(c1498h);
                                            }
                                        }
                                        X4.N n8 = new X4.N(c1501k, arrayList3, 0, 4, null);
                                        n8.f(5);
                                        ArrayList arrayList4 = S0.this.f11459e;
                                        if (arrayList4 != null) {
                                            kotlin.coroutines.jvm.internal.b.a(arrayList4.add(n8));
                                        }
                                        this.f11487c.add(n8);
                                    }
                                }
                            }
                        }
                    }
                    S0.this.f11465k = false;
                }
                S0.this.f11464j = false;
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S0 f11490c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, S0 s02, P5.d dVar) {
            super(2, dVar);
            this.f11489b = arrayList;
            this.f11490c = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f11489b, this.f11490c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11488a == 0) {
                L5.t.b(obj);
                if (this.f11489b.size() < 4) {
                    this.f11490c.f11465k = false;
                }
                Iterator it = this.f11489b.iterator();
                while (it.hasNext()) {
                    X4.N item = (X4.N) it.next();
                    C1100i c1100i = this.f11490c.f11455a;
                    if (c1100i != null) {
                        AbstractC3159y.h(item, "item");
                        c1100i.a(item);
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11491a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11492b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S0 f11493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, S0 s02, P5.d dVar) {
            super(2, dVar);
            this.f11492b = str;
            this.f11493c = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f11492b, this.f11493c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1100i c1100i;
            Q5.b.e();
            if (this.f11491a == 0) {
                L5.t.b(obj);
                String str = this.f11492b;
                if (str != null && str.length() != 0 && (c1100i = this.f11493c.f11455a) != null) {
                    String str2 = this.f11492b;
                    RecyclerView recyclerView = this.f11493c.f11462h;
                    AbstractC3159y.f(recyclerView);
                    c1100i.w(str2, recyclerView);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
    public final java.lang.Object A(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof U4.S0.f
            if (r0 == 0) goto L13
            r0 = r8
            U4.S0$f r0 = (U4.S0.f) r0
            int r1 = r0.f11484e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11484e = r1
            goto L18
        L13:
            U4.S0$f r0 = new U4.S0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11482c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11484e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r8)
            goto L7e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f11481b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f11480a
            U4.S0 r4 = (U4.S0) r4
            L5.t.b(r8)
            goto L68
        L41:
            L5.t.b(r8)
            android.content.Context r8 = r7.getContext()
            if (r8 == 0) goto L81
            r7.f11464j = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            i6.I r8 = i6.C2812b0.b()
            U4.S0$g r6 = new U4.S0$g
            r6.<init>(r2, r5)
            r0.f11480a = r7
            r0.f11481b = r2
            r0.f11484e = r4
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r6, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r4 = r7
        L68:
            i6.J0 r8 = i6.C2812b0.c()
            U4.S0$h r6 = new U4.S0$h
            r6.<init>(r2, r4, r5)
            r0.f11480a = r5
            r0.f11481b = r5
            r0.f11484e = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r6, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            L5.I r8 = L5.I.f6487a
            return r8
        L81:
            L5.I r8 = L5.I.f6487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.S0.A(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (this.f11456b.size() > 0) {
            C1100i c1100i = this.f11455a;
            if (c1100i != null) {
                c1100i.q(this.f11456b, this.f11458d, this.f11460f);
            }
            RecyclerView recyclerView = this.f11462h;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f11455a);
            }
        }
        RelativeLayout relativeLayout = this.f11461g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (getActivity() != null && (getActivity() instanceof MainActivity) && this.f11463i) {
            this.f11463i = false;
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void B() {
        RecyclerView recyclerView = this.f11462h;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void C(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new i(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11463i = true;
        W4.s sVar = this.f11466l;
        a aVar = this.f11467m;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        String simpleName = S0.class.getSimpleName();
        AbstractC3159y.h(simpleName, "this.javaClass.simpleName");
        this.f11455a = new C1100i(sVar, aVar, requireContext, simpleName);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.home_fragment, viewGroup, false);
        this.f11461g = (RelativeLayout) inflate.findViewById(R.id.loading_view_home_fragment);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f11462h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.f11462h;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.f11462h;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new n5.q((int) getResources().getDimension(R.dimen.margin_m)));
        }
        RecyclerView recyclerView4 = this.f11462h;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new d());
        }
        y();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC2541e n8 = UptodownApp.f28003B.n();
        if (n8 != null) {
            n8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC2541e n8;
        super.onResume();
        UptodownApp.a aVar = UptodownApp.f28003B;
        InterfaceC2541e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                if (aVar2.l(requireContext2) > 0 && (n8 = aVar.n()) != null) {
                    n8.play();
                }
            }
        }
    }

    public final void y() {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            new S4.c(requireContext, this.f11468n, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC1478a {

        /* renamed from: U4.S0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0226a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S0 f11470a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0226a(S0 s02, C1498h c1498h) {
                super(0);
                this.f11470a = s02;
                this.f11471b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m75invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m75invoke() {
                this.f11470a.C(this.f11471b.y0());
            }
        }

        a() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (S0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = S0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout G52 = ((MainActivity) activity).G5();
                if (G52 == null || G52.getVisibility() != 0) {
                    FragmentActivity activity2 = S0.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).Z6(appInfo, new C0226a(S0.this, appInfo));
                    Context requireContext = S0.this.requireContext();
                    AbstractC3159y.h(requireContext, "requireContext()");
                    new S4.i(requireContext, appInfo.i(), new b(S0.this), LifecycleOwnerKt.getLifecycleScope(S0.this));
                }
            }
        }

        /* loaded from: classes5.dex */
        public static final class b implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S0 f11472a;

            /* renamed from: U4.S0$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static final class C0227a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ S0 f11473a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1498h f11474b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0227a(S0 s02, C1498h c1498h) {
                    super(0);
                    this.f11473a = s02;
                    this.f11474b = c1498h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m76invoke();
                    return L5.I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m76invoke() {
                    this.f11473a.C(this.f11474b.y0());
                }
            }

            b(S0 s02) {
                this.f11472a = s02;
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f11472a.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).Z6(appInfo, new C0227a(this.f11472a, appInfo));
            }

            @Override // W4.r
            public void c(int i8) {
            }
        }
    }
}
