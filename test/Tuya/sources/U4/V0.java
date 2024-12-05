package U4;

import D4.G;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import U4.W0;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import W4.InterfaceC1482e;
import X4.C1498h;
import X4.C1501k;
import X4.C1505o;
import X4.Q;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.AbstractC3337y;
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;
import l5.C3332t;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public final class V0 extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11523i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f11524a = L5.l.b(new c());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f11525b;

    /* renamed from: c, reason: collision with root package name */
    private C1501k f11526c;

    /* renamed from: d, reason: collision with root package name */
    private String f11527d;

    /* renamed from: e, reason: collision with root package name */
    private D4.G f11528e;

    /* renamed from: f, reason: collision with root package name */
    private r f11529f;

    /* renamed from: g, reason: collision with root package name */
    private q f11530g;

    /* renamed from: h, reason: collision with root package name */
    private final b f11531h;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final V0 a(C1501k category) {
            AbstractC3159y.i(category, "category");
            V0 v02 = new V0();
            v02.G(category);
            return v02;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.n0 invoke() {
            return T4.n0.c(V0.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f11545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1505o c1505o) {
            super(0);
            this.f11545b = c1505o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m83invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            V0.this.v(this.f11545b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1498h f11547b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C1498h c1498h, int i8) {
            super(0);
            this.f11547b = c1498h;
            this.f11548c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m84invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m84invoke() {
            V0.this.s(this.f11547b, this.f11548c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1498h f11550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1505o f11551c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11552d;

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f11553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1505o f11554b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V0 v02, C1505o c1505o) {
                super(0);
                this.f11553a = v02;
                this.f11554b = c1505o;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m85invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m85invoke() {
                this.f11553a.v(this.f11554b);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f11555a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11556b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(V0 v02, C1498h c1498h, int i8) {
                super(0);
                this.f11555a = v02;
                this.f11556b = c1498h;
                this.f11557c = i8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m86invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m86invoke() {
                this.f11555a.s(this.f11556b, this.f11557c);
            }
        }

        f(C1498h c1498h, C1505o c1505o, int i8) {
            this.f11550b = c1498h;
            this.f11551c = c1505o;
            this.f11552d = i8;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof AbstractActivityC2489a) && !V0.this.requireActivity().isFinishing()) {
                this.f11550b.B1(reportVT);
                if (reportVT.f() <= 0) {
                    V0.this.v(this.f11551c);
                    return;
                }
                FragmentActivity activity = V0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                ((AbstractActivityC2489a) activity).j2(this.f11550b, new a(V0.this, this.f11551c), new b(V0.this, this.f11550b, this.f11552d));
            }
        }

        @Override // W4.K
        public void b() {
            V0.this.v(this.f11551c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f11559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1505o c1505o) {
            super(0);
            this.f11559b = c1505o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            V0.this.v(this.f11559b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1498h f11561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1498h c1498h, int i8) {
            super(0);
            this.f11561b = c1498h;
            this.f11562c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            V0.this.s(this.f11561b, this.f11562c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11564b;

        i(int i8) {
            this.f11564b = i8;
        }

        @Override // W4.r
        public void c(int i8) {
            Toast.makeText(V0.this.requireContext(), V0.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            ArrayList arrayList;
            AbstractC3159y.i(appInfo, "appInfo");
            C1505o c1505o = new C1505o();
            c1505o.b(appInfo);
            V0.this.t(c1505o, appInfo, this.f11564b);
            D4.G g8 = V0.this.f11528e;
            if (g8 != null) {
                arrayList = g8.c();
            } else {
                arrayList = null;
            }
            AbstractC3159y.f(arrayList);
            ((G.b) arrayList.get(this.f11564b)).e(appInfo);
            D4.G g9 = V0.this.f11528e;
            if (g9 != null) {
                g9.notifyItemChanged(this.f11564b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class j extends RecyclerView.OnScrollListener {
        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !V0.this.z().h() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager3);
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition();
                if (!V0.this.z().f() && childCount + findFirstVisibleItemPosition >= itemCount - 10) {
                    V0.this.C();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11566a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f11568a;

            a(V0 v02) {
                this.f11568a = v02;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                boolean z8;
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f11568a.w().f10774c.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((W0.a) cVar.a()).a()) {
                        if (((W0.a) cVar.a()).b().size() > 0) {
                            this.f11568a.H(((W0.a) cVar.a()).b());
                        } else {
                            this.f11568a.w().f10775d.setVisibility(8);
                            this.f11568a.w().f10777f.setVisibility(0);
                        }
                    } else {
                        if (this.f11568a.x().c() != -2 && this.f11568a.x().c() != -3) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        D4.G g8 = this.f11568a.f11528e;
                        if (g8 != null) {
                            g8.a(((W0.a) cVar.a()).b(), z8);
                        }
                    }
                    this.f11568a.z().k(false);
                    this.f11568a.w().f10774c.f10185b.setVisibility(8);
                } else {
                    boolean z9 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11566a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K g8 = V0.this.z().g();
                a aVar = new a(V0.this);
                this.f11566a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes5.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f11569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f11569a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f11569a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f11570a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0) {
            super(0);
            this.f11570a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f11570a.invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11571a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11571a = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11571a);
            return m5453viewModels$lambda1.getViewModelStore();
        }
    }

    /* loaded from: classes5.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f11572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11572a = function0;
            this.f11573b = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f11572a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11573b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5453viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5453viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class p extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f11574a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11575b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Fragment fragment, InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11574a = fragment;
            this.f11575b = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11575b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5453viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5453viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f11574a.getDefaultViewModelProviderFactory();
            AbstractC3159y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class q implements InterfaceC1482e {
        q() {
        }

        @Override // W4.InterfaceC1482e
        public void a(C1498h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3159y.i(appInfo, "appInfo");
            if (V0.this.getContext() != null) {
                C3326n.a aVar = C3326n.f34504t;
                Context context = V0.this.getContext();
                AbstractC3159y.f(context);
                C3326n a8 = aVar.a(context);
                a8.a();
                C1505o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                boolean r8 = new C3319g().r(appInfo.y0(), V0.this.getContext());
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                X4.O u02 = a8.u0(y02);
                a8.g();
                UptodownApp.a aVar2 = UptodownApp.f28003B;
                Context context2 = V0.this.getContext();
                AbstractC3159y.f(context2);
                boolean z10 = false;
                if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f30002k.c(appInfo.i())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Z7 != null && Z7.h0()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (Z7 != null && Z7.I() == 0) {
                    z10 = true;
                }
                if (Z7 != null && (z8 || z9 || z10)) {
                    int Z8 = Z7.Z();
                    if (1 > Z8 || Z8 >= 100 || !DownloadApkWorker.f30002k.d(appInfo.i(), appInfo.o0())) {
                        if (Z7.Z() == 100) {
                            C3329q c3329q = new C3329q();
                            Context context3 = V0.this.getContext();
                            AbstractC3159y.f(context3);
                            File f8 = c3329q.f(context3);
                            String X7 = Z7.X();
                            AbstractC3159y.f(X7);
                            File file = new File(f8, X7);
                            Context context4 = V0.this.getContext();
                            AbstractC3159y.f(context4);
                            aVar2.X(file, context4, appInfo.t0());
                            return;
                        }
                        Context context5 = V0.this.getContext();
                        AbstractC3159y.f(context5);
                        Z7.n0(context5);
                        D4.G g8 = V0.this.f11528e;
                        if (g8 != null) {
                            g8.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!r8) {
                    V0.this.u(appInfo.i(), i8);
                    return;
                }
                if (u02 == null) {
                    V0.this.D(appInfo.y0());
                    return;
                }
                if (u02.o() != 100) {
                    V0.this.u(appInfo.i(), i8);
                    return;
                }
                C3329q c3329q2 = new C3329q();
                Context context6 = V0.this.getContext();
                AbstractC3159y.f(context6);
                File g9 = c3329q2.g(context6);
                String j8 = u02.j();
                AbstractC3159y.f(j8);
                File file2 = new File(g9, j8);
                Context context7 = V0.this.getContext();
                AbstractC3159y.f(context7);
                aVar2.X(file2, context7, appInfo.t0());
            }
        }

        @Override // W4.InterfaceC1482e
        public void b(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            V0.this.s(appInfo, i8);
        }
    }

    /* loaded from: classes5.dex */
    public static final class r implements InterfaceC1481d {
        r() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f28003B.a0()) {
                if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = V0.this.getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).F2(app.i());
                } else if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof AbstractActivityC2489a)) {
                    FragmentActivity activity2 = V0.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2489a) activity2).F2(app.i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11579b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V0 f11580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, V0 v02, P5.d dVar) {
            super(2, dVar);
            this.f11579b = str;
            this.f11580c = v02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new s(this.f11579b, this.f11580c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((s) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11578a == 0) {
                L5.t.b(obj);
                String str = this.f11579b;
                if (str != null && str.length() != 0 && this.f11580c.f11528e != null) {
                    D4.G g8 = this.f11580c.f11528e;
                    AbstractC3159y.f(g8);
                    Iterator it = g8.c().iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        int i9 = i8 + 1;
                        G.b bVar = (G.b) it.next();
                        if (bVar.b() != null) {
                            C1498h b8 = bVar.b();
                            AbstractC3159y.f(b8);
                            if (b8.y0() != null) {
                                C1498h b9 = bVar.b();
                                AbstractC3159y.f(b9);
                                if (AbstractC3159y.d(b9.y0(), this.f11579b)) {
                                    D4.G g9 = this.f11580c.f11528e;
                                    AbstractC3159y.f(g9);
                                    g9.notifyItemChanged(i8);
                                }
                            }
                        }
                        i8 = i9;
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public V0() {
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new m(new l(this)));
        this.f11525b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(W0.class), new n(a8), new o(null, a8), new p(this, a8));
        this.f11526c = new C1501k(0, null, null, 7, null);
        this.f11529f = new r();
        this.f11530g = new q();
        this.f11531h = new b();
    }

    private final void A() {
        String f8 = this.f11526c.f();
        if (f8 != null && f8.length() != 0) {
            if (this.f11526c.c() >= 0 && !AbstractC3159y.d(this.f11526c.f(), getString(R.string.top_downloads_title))) {
                this.f11527d = getResources().getString(R.string.top_category, this.f11526c.f());
            } else {
                this.f11527d = this.f11526c.f();
            }
        } else {
            this.f11527d = getResources().getString(R.string.top_downloads_title);
        }
        w().f10776e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            w().f10776e.setNavigationIcon(drawable);
            w().f10776e.setNavigationContentDescription(getString(R.string.back));
        }
        w().f10776e.setNavigationOnClickListener(new View.OnClickListener() { // from class: U4.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.B(V0.this, view);
            }
        });
        TextView textView = w().f10778g;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        w().f10778g.setText(this.f11527d);
        w().f10777f.setTypeface(aVar.u());
        w().f10777f.setVisibility(8);
        w().f10775d.setItemAnimator(null);
        w().f10775d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = w().f10775d;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        recyclerView.addItemDecoration(new n5.t(requireContext, 11));
        if (this.f11526c.c() != -1) {
            RecyclerView recyclerView2 = w().f10775d;
            AbstractC3159y.h(recyclerView2, "binding.recyclerviewTopCat");
            recyclerView2.setPadding(0, 0, 0, 0);
        }
        w().f10775d.addOnScrollListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(V0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity instanceof MainActivity) {
            if (this$0.f11526c.c() == -1) {
                FragmentActivity activity2 = this$0.getActivity();
                AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).r5(0);
                return;
            } else {
                FragmentActivity activity3 = this$0.getActivity();
                AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity3).L6();
                return;
            }
        }
        if (activity instanceof AppDetailActivity) {
            FragmentActivity activity4 = this$0.getActivity();
            AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity4).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity5 = this$0.getActivity();
            AbstractC3159y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
            ((MoreInfo) activity5).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (getContext() != null) {
            W0 z8 = z();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            z8.e(requireContext, this.f11526c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String str) {
        Intent launchIntentForPackage;
        if (getActivity() != null && str != null && str.length() != 0 && (launchIntentForPackage = requireActivity().getPackageManager().getLaunchIntentForPackage(str)) != null) {
            startActivity(launchIntentForPackage);
        }
    }

    private final void E() {
        D4.G g8;
        if (this.f11528e != null && w().f10775d.getAdapter() == null) {
            w().f10775d.setAdapter(this.f11528e);
        }
        if (E4.j.f2274g.h() == null && (g8 = this.f11528e) != null) {
            g8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(ArrayList arrayList) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            X4.N n8 = new X4.N(this.f11526c, arrayList, 0, 4, null);
            r rVar = this.f11529f;
            q qVar = this.f11530g;
            b bVar = this.f11531h;
            String b8 = this.f11526c.b();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3159y.h(string, "getString(R.string.read_more_desc_app_detail)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3159y.h(string2, "getString(R.string.read_less_desc_app_detail)");
            this.f11528e = new D4.G(rVar, qVar, bVar, b8, null, string, string2);
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            D4.G g8 = this.f11528e;
            if (g8 != null) {
                g8.b(n8, (int) dimension);
            }
            w().f10775d.setAdapter(this.f11528e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(C1498h c1498h, int i8) {
        if (getContext() != null) {
            C3326n.a aVar = C3326n.f34504t;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C3326n a8 = aVar.a(requireContext);
            a8.a();
            C1505o Z7 = a8.Z(String.valueOf(c1498h.f0()));
            String y02 = c1498h.y0();
            AbstractC3159y.f(y02);
            X4.O u02 = a8.u0(y02);
            a8.g();
            if (Z7 != null) {
                DownloadApkWorker.f30002k.a(c1498h.i());
                C3313a c3313a = new C3313a();
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                c3313a.a(requireContext2, Z7.X());
                Context requireContext3 = requireContext();
                AbstractC3159y.h(requireContext3, "requireContext()");
                Z7.n0(requireContext3);
                D4.G g8 = this.f11528e;
                if (g8 != null) {
                    g8.notifyItemChanged(i8);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).J2(Z7);
                    return;
                }
                return;
            }
            if (u02 != null) {
                DownloadUpdatesWorker.f30010k.a(u02.n());
                UptodownApp.a aVar2 = UptodownApp.f28003B;
                String n8 = u02.n();
                Context requireContext4 = requireContext();
                AbstractC3159y.h(requireContext4, "requireContext()");
                aVar2.c0(n8, requireContext4);
                String j8 = u02.j();
                if (j8 != null && j8.length() != 0) {
                    C3329q c3329q = new C3329q();
                    Context requireContext5 = requireContext();
                    AbstractC3159y.h(requireContext5, "requireContext()");
                    File g9 = c3329q.g(requireContext5);
                    String j9 = u02.j();
                    AbstractC3159y.f(j9);
                    File file = new File(g9, j9);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(C1505o c1505o, C1498h c1498h, int i8) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            Q.b bVar = X4.Q.f12437k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            X4.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.G()) {
                if (c1498h.o1()) {
                    FragmentActivity activity = getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2489a) activity).j2(c1498h, new d(c1505o), new e(c1498h, i8));
                    return;
                } else {
                    if (c1498h.O0() == null) {
                        FragmentActivity requireActivity2 = requireActivity();
                        AbstractC3159y.h(requireActivity2, "requireActivity()");
                        new S4.m(requireActivity2, String.valueOf(c1498h.f0()), c1498h.S0(), new f(c1498h, c1505o, i8), LifecycleOwnerKt.getLifecycleScope(this));
                        return;
                    }
                    X4.H O02 = c1498h.O0();
                    AbstractC3159y.f(O02);
                    if (O02.f() > 0) {
                        FragmentActivity activity2 = getActivity();
                        AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                        ((AbstractActivityC2489a) activity2).j2(c1498h, new g(c1505o), new h(c1498h, i8));
                        return;
                    }
                    v(c1505o);
                    return;
                }
            }
            v(c1505o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, j8, new i(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(C1505o c1505o) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            int l02 = c1505o.l0(requireContext);
            if (l02 >= 0) {
                if (C3332t.f34530a.d()) {
                    DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
                    Context requireContext2 = requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    aVar.f(requireContext2, l02);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).S1(c1505o);
                    return;
                }
                return;
            }
            Toast.makeText(requireContext(), getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.n0 w() {
        return (T4.n0) this.f11524a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W0 z() {
        return (W0) this.f11525b.getValue();
    }

    public final void F() {
        w().f10775d.smoothScrollToPosition(0);
    }

    public final void G(C1501k c1501k) {
        AbstractC3159y.i(c1501k, "<set-?>");
        this.f11526c = c1501k;
    }

    public final void I(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new s(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1501k c1501k;
        Object parcelable;
        super.onCreate(bundle);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("category", C1501k.class);
                c1501k = (C1501k) parcelable;
            } else {
                c1501k = (C1501k) bundle.getParcelable("category");
            }
            if (c1501k != null) {
                this.f11526c = c1501k;
            }
        }
        if (this.f11526c.c() != 0 && this.f11526c.c() >= -3) {
            y();
        } else if (this.f11526c.c() == 0) {
            this.f11526c.Q(-1);
            y();
        }
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new k(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        A();
        RelativeLayout root = w().getRoot();
        AbstractC3159y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        E();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3159y.i(outState, "outState");
        outState.putParcelable("category", this.f11526c);
        super.onSaveInstanceState(outState);
    }

    public final C1501k x() {
        return this.f11526c;
    }

    public final void y() {
        if (getContext() != null) {
            W0 z8 = z();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            z8.d(requireContext, this.f11526c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1478a {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1498h f11533a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V0 f11534b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1498h c1498h, V0 v02) {
                super(0);
                this.f11533a = c1498h;
                this.f11534b = v02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m79invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m79invoke() {
                if (this.f11533a.y0() != null) {
                    V0 v02 = this.f11534b;
                    String y02 = this.f11533a.y0();
                    AbstractC3159y.f(y02);
                    v02.I(y02);
                }
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1498h f11538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V0 f11539b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1498h c1498h, V0 v02) {
                super(0);
                this.f11538a = c1498h;
                this.f11539b = v02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m81invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m81invoke() {
                if (this.f11538a.y0() != null) {
                    V0 v02 = this.f11539b;
                    String y02 = this.f11538a.y0();
                    AbstractC3159y.f(y02);
                    v02.I(y02);
                }
            }
        }

        b() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (V0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = V0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout G52 = ((MainActivity) activity).G5();
                if (G52 == null || G52.getVisibility() != 0) {
                    FragmentActivity activity2 = V0.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).Z6(appInfo, new a(appInfo, V0.this));
                    Context requireContext = V0.this.requireContext();
                    AbstractC3159y.h(requireContext, "requireContext()");
                    new S4.i(requireContext, appInfo.i(), new C0229b(V0.this), LifecycleOwnerKt.getLifecycleScope(V0.this));
                    return;
                }
            }
            if (V0.this.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity3 = V0.this.getActivity();
                AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity3).q3(V0.this.w().f10773b.getRoot());
                FragmentActivity activity4 = V0.this.getActivity();
                AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity4).r3(appInfo, new c(appInfo, V0.this));
                Context requireContext2 = V0.this.requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                new S4.i(requireContext2, appInfo.i(), new d(V0.this), LifecycleOwnerKt.getLifecycleScope(V0.this));
            }
        }

        /* renamed from: U4.V0$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0229b implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f11535a;

            /* renamed from: U4.V0$b$b$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ V0 f11536a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1498h f11537b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(V0 v02, C1498h c1498h) {
                    super(0);
                    this.f11536a = v02;
                    this.f11537b = c1498h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m80invoke();
                    return L5.I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m80invoke() {
                    this.f11536a.I(this.f11537b.y0());
                }
            }

            C0229b(V0 v02) {
                this.f11535a = v02;
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f11535a.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).Z6(appInfo, new a(this.f11535a, appInfo));
            }

            @Override // W4.r
            public void c(int i8) {
            }
        }

        /* loaded from: classes5.dex */
        public static final class d implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f11540a;

            /* loaded from: classes5.dex */
            static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ V0 f11541a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1498h f11542b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(V0 v02, C1498h c1498h) {
                    super(0);
                    this.f11541a = v02;
                    this.f11542b = c1498h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m82invoke();
                    return L5.I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m82invoke() {
                    this.f11541a.I(this.f11542b.y0());
                }
            }

            d(V0 v02) {
                this.f11540a = v02;
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f11540a.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity).r3(appInfo, new a(this.f11540a, appInfo));
            }

            @Override // W4.r
            public void c(int i8) {
            }
        }
    }
}
