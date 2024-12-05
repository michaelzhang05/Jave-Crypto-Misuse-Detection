package X4;

import G4.G;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import X4.W0;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import Z4.InterfaceC1591e;
import a5.C1641h;
import a5.C1644k;
import a5.C1648o;
import a5.Q;
import a6.InterfaceC1668n;
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
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.AbstractC3685y;
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;
import o5.C3680t;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public final class V0 extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final a f13193i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f13194a = O5.l.b(new c());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f13195b;

    /* renamed from: c, reason: collision with root package name */
    private C1644k f13196c;

    /* renamed from: d, reason: collision with root package name */
    private String f13197d;

    /* renamed from: e, reason: collision with root package name */
    private G4.G f13198e;

    /* renamed from: f, reason: collision with root package name */
    private r f13199f;

    /* renamed from: g, reason: collision with root package name */
    private q f13200g;

    /* renamed from: h, reason: collision with root package name */
    private final b f13201h;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final V0 a(C1644k category) {
            AbstractC3255y.i(category, "category");
            V0 v02 = new V0();
            v02.G(category);
            return v02;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.n0 invoke() {
            return W4.n0.c(V0.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f13215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1648o c1648o) {
            super(0);
            this.f13215b = c1648o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            V0.this.v(this.f13215b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1641h f13217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C1641h c1641h, int i8) {
            super(0);
            this.f13217b = c1641h;
            this.f13218c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            V0.this.s(this.f13217b, this.f13218c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1641h f13220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1648o f13221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13222d;

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f13223a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1648o f13224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V0 v02, C1648o c1648o) {
                super(0);
                this.f13223a = v02;
                this.f13224b = c1648o;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m90invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m90invoke() {
                this.f13223a.v(this.f13224b);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f13225a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13226b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f13227c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(V0 v02, C1641h c1641h, int i8) {
                super(0);
                this.f13225a = v02;
                this.f13226b = c1641h;
                this.f13227c = i8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m91invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m91invoke() {
                this.f13225a.s(this.f13226b, this.f13227c);
            }
        }

        f(C1641h c1641h, C1648o c1648o, int i8) {
            this.f13220b = c1641h;
            this.f13221c = c1648o;
            this.f13222d = i8;
        }

        @Override // Z4.K
        public void a() {
            V0.this.v(this.f13221c);
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof AbstractActivityC2683a) && !V0.this.requireActivity().isFinishing()) {
                this.f13220b.B1(reportVT);
                if (reportVT.h() <= 0) {
                    V0.this.v(this.f13221c);
                    return;
                }
                FragmentActivity activity = V0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                ((AbstractActivityC2683a) activity).j2(this.f13220b, new a(V0.this, this.f13221c), new b(V0.this, this.f13220b, this.f13222d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f13229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1648o c1648o) {
            super(0);
            this.f13229b = c1648o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m92invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m92invoke() {
            V0.this.v(this.f13229b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1641h f13231b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1641h c1641h, int i8) {
            super(0);
            this.f13231b = c1641h;
            this.f13232c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m93invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m93invoke() {
            V0.this.s(this.f13231b, this.f13232c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13234b;

        i(int i8) {
            this.f13234b = i8;
        }

        @Override // Z4.r
        public void c(int i8) {
            Toast.makeText(V0.this.requireContext(), V0.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            ArrayList arrayList;
            AbstractC3255y.i(appInfo, "appInfo");
            C1648o c1648o = new C1648o();
            c1648o.a(appInfo);
            V0.this.t(c1648o, appInfo, this.f13234b);
            G4.G g8 = V0.this.f13198e;
            if (g8 != null) {
                arrayList = g8.c();
            } else {
                arrayList = null;
            }
            AbstractC3255y.f(arrayList);
            ((G.b) arrayList.get(this.f13234b)).e(appInfo);
            G4.G g9 = V0.this.f13198e;
            if (g9 != null) {
                g9.notifyItemChanged(this.f13234b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class j extends RecyclerView.OnScrollListener {
        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !V0.this.z().h() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager3);
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition();
                if (!V0.this.z().f() && childCount + findFirstVisibleItemPosition >= itemCount - 10) {
                    V0.this.C();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13236a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f13238a;

            a(V0 v02) {
                this.f13238a = v02;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                boolean z8;
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f13238a.w().f12431c.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((W0.a) cVar.a()).a()) {
                        if (((W0.a) cVar.a()).b().size() > 0) {
                            this.f13238a.H(((W0.a) cVar.a()).b());
                        } else {
                            this.f13238a.w().f12432d.setVisibility(8);
                            this.f13238a.w().f12434f.setVisibility(0);
                        }
                    } else {
                        if (this.f13238a.x().b() != -2 && this.f13238a.x().b() != -3) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        G4.G g8 = this.f13238a.f13198e;
                        if (g8 != null) {
                            g8.a(((W0.a) cVar.a()).b(), z8);
                        }
                    }
                    this.f13238a.z().k(false);
                    this.f13238a.w().f12431c.f11842b.setVisibility(8);
                } else {
                    boolean z9 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13236a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L g8 = V0.this.z().g();
                a aVar = new a(V0.this);
                this.f13236a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f13239a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f13239a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class m extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0) {
            super(0);
            this.f13240a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f13240a.invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f13241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f13241a = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f13241a);
            return m5458viewModels$lambda1.getViewModelStore();
        }
    }

    /* loaded from: classes5.dex */
    public static final class o extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f13243b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f13242a = function0;
            this.f13243b = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f13242a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f13243b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5458viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5458viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class p extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13244a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f13245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Fragment fragment, InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f13244a = fragment;
            this.f13245b = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f13245b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5458viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5458viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f13244a.getDefaultViewModelProviderFactory();
            AbstractC3255y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class q implements InterfaceC1591e {
        q() {
        }

        @Override // Z4.InterfaceC1591e
        public void a(C1641h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3255y.i(appInfo, "appInfo");
            if (V0.this.getContext() != null) {
                C3674n.a aVar = C3674n.f36505t;
                Context context = V0.this.getContext();
                AbstractC3255y.f(context);
                C3674n a8 = aVar.a(context);
                a8.a();
                C1648o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                boolean r8 = new C3667g().r(appInfo.y0(), V0.this.getContext());
                String y02 = appInfo.y0();
                AbstractC3255y.f(y02);
                a5.O u02 = a8.u0(y02);
                a8.l();
                UptodownApp.a aVar2 = UptodownApp.f29058B;
                Context context2 = V0.this.getContext();
                AbstractC3255y.f(context2);
                boolean z10 = false;
                if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f31034k.c(appInfo.i())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Z7 != null && Z7.h0()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (Z7 != null && Z7.z() == 0) {
                    z10 = true;
                }
                if (Z7 != null && (z8 || z9 || z10)) {
                    int Z8 = Z7.Z();
                    if (1 > Z8 || Z8 >= 100 || !DownloadApkWorker.f31034k.d(appInfo.i(), appInfo.o0())) {
                        if (Z7.Z() == 100) {
                            C3677q c3677q = new C3677q();
                            Context context3 = V0.this.getContext();
                            AbstractC3255y.f(context3);
                            File f8 = c3677q.f(context3);
                            String X7 = Z7.X();
                            AbstractC3255y.f(X7);
                            File file = new File(f8, X7);
                            Context context4 = V0.this.getContext();
                            AbstractC3255y.f(context4);
                            aVar2.X(file, context4, appInfo.t0());
                            return;
                        }
                        Context context5 = V0.this.getContext();
                        AbstractC3255y.f(context5);
                        Z7.n0(context5);
                        G4.G g8 = V0.this.f13198e;
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
                if (u02.u() != 100) {
                    V0.this.u(appInfo.i(), i8);
                    return;
                }
                C3677q c3677q2 = new C3677q();
                Context context6 = V0.this.getContext();
                AbstractC3255y.f(context6);
                File g9 = c3677q2.g(context6);
                String l8 = u02.l();
                AbstractC3255y.f(l8);
                File file2 = new File(g9, l8);
                Context context7 = V0.this.getContext();
                AbstractC3255y.f(context7);
                aVar2.X(file2, context7, appInfo.t0());
            }
        }

        @Override // Z4.InterfaceC1591e
        public void b(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            V0.this.s(appInfo, i8);
        }
    }

    /* loaded from: classes5.dex */
    public static final class r implements InterfaceC1590d {
        r() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0()) {
                if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = V0.this.getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).F2(app.i());
                } else if (V0.this.getActivity() != null && (V0.this.getActivity() instanceof AbstractActivityC2683a)) {
                    FragmentActivity activity2 = V0.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2683a) activity2).F2(app.i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V0 f13250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, V0 v02, S5.d dVar) {
            super(2, dVar);
            this.f13249b = str;
            this.f13250c = v02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new s(this.f13249b, this.f13250c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13248a == 0) {
                O5.t.b(obj);
                String str = this.f13249b;
                if (str != null && str.length() != 0 && this.f13250c.f13198e != null) {
                    G4.G g8 = this.f13250c.f13198e;
                    AbstractC3255y.f(g8);
                    Iterator it = g8.c().iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        int i9 = i8 + 1;
                        G.b bVar = (G.b) it.next();
                        if (bVar.b() != null) {
                            C1641h b8 = bVar.b();
                            AbstractC3255y.f(b8);
                            if (b8.y0() != null) {
                                C1641h b9 = bVar.b();
                                AbstractC3255y.f(b9);
                                if (AbstractC3255y.d(b9.y0(), this.f13249b)) {
                                    G4.G g9 = this.f13250c.f13198e;
                                    AbstractC3255y.f(g9);
                                    g9.notifyItemChanged(i8);
                                }
                            }
                        }
                        i8 = i9;
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((s) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public V0() {
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new m(new l(this)));
        this.f13195b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(W0.class), new n(a8), new o(null, a8), new p(this, a8));
        this.f13196c = new C1644k(0, null, null, 7, null);
        this.f13199f = new r();
        this.f13200g = new q();
        this.f13201h = new b();
    }

    private final void A() {
        String h8 = this.f13196c.h();
        if (h8 != null && h8.length() != 0) {
            if (this.f13196c.b() >= 0 && !AbstractC3255y.d(this.f13196c.h(), getString(R.string.top_downloads_title))) {
                this.f13197d = getResources().getString(R.string.top_category, this.f13196c.h());
            } else {
                this.f13197d = this.f13196c.h();
            }
        } else {
            this.f13197d = getResources().getString(R.string.top_downloads_title);
        }
        w().f12433e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            w().f12433e.setNavigationIcon(drawable);
            w().f12433e.setNavigationContentDescription(getString(R.string.back));
        }
        w().f12433e.setNavigationOnClickListener(new View.OnClickListener() { // from class: X4.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.B(V0.this, view);
            }
        });
        TextView textView = w().f12435g;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        w().f12435g.setText(this.f13197d);
        w().f12434f.setTypeface(aVar.u());
        w().f12434f.setVisibility(8);
        w().f12432d.setItemAnimator(null);
        w().f12432d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = w().f12432d;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        recyclerView.addItemDecoration(new q5.t(requireContext, 11));
        if (this.f13196c.b() != -1) {
            RecyclerView recyclerView2 = w().f12432d;
            AbstractC3255y.h(recyclerView2, "binding.recyclerviewTopCat");
            recyclerView2.setPadding(0, 0, 0, 0);
        }
        w().f12432d.addOnScrollListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(V0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity instanceof MainActivity) {
            if (this$0.f13196c.b() == -1) {
                FragmentActivity activity2 = this$0.getActivity();
                AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).p5(0);
                return;
            } else {
                FragmentActivity activity3 = this$0.getActivity();
                AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity3).J6();
                return;
            }
        }
        if (activity instanceof AppDetailActivity) {
            FragmentActivity activity4 = this$0.getActivity();
            AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity4).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity5 = this$0.getActivity();
            AbstractC3255y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
            ((MoreInfo) activity5).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (getContext() != null) {
            W0 z8 = z();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            z8.e(requireContext, this.f13196c);
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
        G4.G g8;
        if (this.f13198e != null && w().f12432d.getAdapter() == null) {
            w().f12432d.setAdapter(this.f13198e);
        }
        if (H4.j.f3824g.h() == null && (g8 = this.f13198e) != null) {
            g8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(ArrayList arrayList) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            a5.N n8 = new a5.N(this.f13196c, arrayList, 0, 4, null);
            r rVar = this.f13199f;
            q qVar = this.f13200g;
            b bVar = this.f13201h;
            String a8 = this.f13196c.a();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3255y.h(string, "getString(R.string.read_more_desc_app_detail)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3255y.h(string2, "getString(R.string.read_less_desc_app_detail)");
            this.f13198e = new G4.G(rVar, qVar, bVar, a8, null, string, string2);
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            G4.G g8 = this.f13198e;
            if (g8 != null) {
                g8.b(n8, (int) dimension);
            }
            w().f12432d.setAdapter(this.f13198e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(C1641h c1641h, int i8) {
        if (getContext() != null) {
            C3674n.a aVar = C3674n.f36505t;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C3674n a8 = aVar.a(requireContext);
            a8.a();
            C1648o Z7 = a8.Z(String.valueOf(c1641h.f0()));
            String y02 = c1641h.y0();
            AbstractC3255y.f(y02);
            a5.O u02 = a8.u0(y02);
            a8.l();
            if (Z7 != null) {
                DownloadApkWorker.f31034k.a(c1641h.i());
                C3661a c3661a = new C3661a();
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                c3661a.a(requireContext2, Z7.X());
                Context requireContext3 = requireContext();
                AbstractC3255y.h(requireContext3, "requireContext()");
                Z7.n0(requireContext3);
                G4.G g8 = this.f13198e;
                if (g8 != null) {
                    g8.notifyItemChanged(i8);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).J2(Z7);
                    return;
                }
                return;
            }
            if (u02 != null) {
                DownloadUpdatesWorker.f31042k.a(u02.s());
                UptodownApp.a aVar2 = UptodownApp.f29058B;
                String s8 = u02.s();
                Context requireContext4 = requireContext();
                AbstractC3255y.h(requireContext4, "requireContext()");
                aVar2.c0(s8, requireContext4);
                String l8 = u02.l();
                if (l8 != null && l8.length() != 0) {
                    C3677q c3677q = new C3677q();
                    Context requireContext5 = requireContext();
                    AbstractC3255y.h(requireContext5, "requireContext()");
                    File g9 = c3677q.g(requireContext5);
                    String l9 = u02.l();
                    AbstractC3255y.f(l9);
                    File file = new File(g9, l9);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(C1648o c1648o, C1641h c1641h, int i8) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            Q.b bVar = a5.Q.f14058k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            a5.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                if (c1641h.o1()) {
                    FragmentActivity activity = getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2683a) activity).j2(c1641h, new d(c1648o), new e(c1641h, i8));
                    return;
                } else {
                    if (c1641h.O0() == null) {
                        FragmentActivity requireActivity2 = requireActivity();
                        AbstractC3255y.h(requireActivity2, "requireActivity()");
                        new V4.m(requireActivity2, String.valueOf(c1641h.f0()), c1641h.S0(), new f(c1641h, c1648o, i8), LifecycleOwnerKt.getLifecycleScope(this));
                        return;
                    }
                    a5.H O02 = c1641h.O0();
                    AbstractC3255y.f(O02);
                    if (O02.h() > 0) {
                        FragmentActivity activity2 = getActivity();
                        AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                        ((AbstractActivityC2683a) activity2).j2(c1641h, new g(c1648o), new h(c1641h, i8));
                        return;
                    }
                    v(c1648o);
                    return;
                }
            }
            v(c1648o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, j8, new i(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(C1648o c1648o) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            int l02 = c1648o.l0(requireContext);
            if (l02 >= 0) {
                if (C3680t.f36531a.d()) {
                    DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
                    Context requireContext2 = requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    aVar.f(requireContext2, l02);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).S1(c1648o);
                    return;
                }
                return;
            }
            Toast.makeText(requireContext(), getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W4.n0 w() {
        return (W4.n0) this.f13194a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W0 z() {
        return (W0) this.f13195b.getValue();
    }

    public final void F() {
        w().f12432d.smoothScrollToPosition(0);
    }

    public final void G(C1644k c1644k) {
        AbstractC3255y.i(c1644k, "<set-?>");
        this.f13196c = c1644k;
    }

    public final void I(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new s(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1644k c1644k;
        Object parcelable;
        super.onCreate(bundle);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("category", C1644k.class);
                c1644k = (C1644k) parcelable;
            } else {
                c1644k = (C1644k) bundle.getParcelable("category");
            }
            if (c1644k != null) {
                this.f13196c = c1644k;
            }
        }
        if (this.f13196c.b() != 0 && this.f13196c.b() >= -3) {
            y();
        } else if (this.f13196c.b() == 0) {
            this.f13196c.J(-1);
            y();
        }
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new k(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        A();
        RelativeLayout root = w().getRoot();
        AbstractC3255y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        E();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3255y.i(outState, "outState");
        outState.putParcelable("category", this.f13196c);
        super.onSaveInstanceState(outState);
    }

    public final C1644k x() {
        return this.f13196c;
    }

    public final void y() {
        if (getContext() != null) {
            W0 z8 = z();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            z8.d(requireContext, this.f13196c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1587a {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1641h f13203a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V0 f13204b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1641h c1641h, V0 v02) {
                super(0);
                this.f13203a = c1641h;
                this.f13204b = v02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m84invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m84invoke() {
                if (this.f13203a.y0() != null) {
                    V0 v02 = this.f13204b;
                    String y02 = this.f13203a.y0();
                    AbstractC3255y.f(y02);
                    v02.I(y02);
                }
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1641h f13208a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V0 f13209b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1641h c1641h, V0 v02) {
                super(0);
                this.f13208a = c1641h;
                this.f13209b = v02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m86invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m86invoke() {
                if (this.f13208a.y0() != null) {
                    V0 v02 = this.f13209b;
                    String y02 = this.f13208a.y0();
                    AbstractC3255y.f(y02);
                    v02.I(y02);
                }
            }
        }

        b() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (V0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = V0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout E52 = ((MainActivity) activity).E5();
                if (E52 == null || E52.getVisibility() != 0) {
                    FragmentActivity activity2 = V0.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).X6(appInfo, new a(appInfo, V0.this));
                    Context requireContext = V0.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    new V4.i(requireContext, appInfo.i(), new C0255b(V0.this), LifecycleOwnerKt.getLifecycleScope(V0.this));
                    return;
                }
            }
            if (V0.this.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity3 = V0.this.getActivity();
                AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity3).q3(V0.this.w().f12430b.getRoot());
                FragmentActivity activity4 = V0.this.getActivity();
                AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity4).r3(appInfo, new c(appInfo, V0.this));
                Context requireContext2 = V0.this.requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                new V4.i(requireContext2, appInfo.i(), new d(V0.this), LifecycleOwnerKt.getLifecycleScope(V0.this));
            }
        }

        /* renamed from: X4.V0$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0255b implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f13205a;

            /* renamed from: X4.V0$b$b$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ V0 f13206a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1641h f13207b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(V0 v02, C1641h c1641h) {
                    super(0);
                    this.f13206a = v02;
                    this.f13207b = c1641h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m85invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m85invoke() {
                    this.f13206a.I(this.f13207b.y0());
                }
            }

            C0255b(V0 v02) {
                this.f13205a = v02;
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13205a.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).X6(appInfo, new a(this.f13205a, appInfo));
            }

            @Override // Z4.r
            public void c(int i8) {
            }
        }

        /* loaded from: classes5.dex */
        public static final class d implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V0 f13210a;

            /* loaded from: classes5.dex */
            static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ V0 f13211a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1641h f13212b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(V0 v02, C1641h c1641h) {
                    super(0);
                    this.f13211a = v02;
                    this.f13212b = c1641h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m87invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m87invoke() {
                    this.f13211a.I(this.f13212b.y0());
                }
            }

            d(V0 v02) {
                this.f13210a = v02;
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13210a.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity).r3(appInfo, new a(this.f13210a, appInfo));
            }

            @Override // Z4.r
            public void c(int i8) {
            }
        }
    }
}
