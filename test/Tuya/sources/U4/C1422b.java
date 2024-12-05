package U4;

import D4.G;
import L5.InterfaceC1227k;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import W4.InterfaceC1482e;
import X4.C1495e;
import X4.C1498h;
import X4.C1501k;
import X4.C1505o;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
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
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;
import l5.C3332t;

/* renamed from: U4.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1422b extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f11609f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public C1495e f11611b;

    /* renamed from: c, reason: collision with root package name */
    private D4.G f11612c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f11610a = L5.l.b(new C0230b());

    /* renamed from: d, reason: collision with root package name */
    private j f11613d = new j();

    /* renamed from: e, reason: collision with root package name */
    private i f11614e = new i();

    /* renamed from: U4.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1422b a(C1495e alternatives) {
            AbstractC3159y.i(alternatives, "alternatives");
            C1422b c1422b = new C1422b();
            c1422b.v(alternatives);
            return c1422b;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: U4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0230b extends AbstractC3160z implements Function0 {
        C0230b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.n0 invoke() {
            return T4.n0.c(C1422b.this.getLayoutInflater());
        }
    }

    /* renamed from: U4.b$c */
    /* loaded from: classes5.dex */
    public static final class c implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11617b;

        c(int i8) {
            this.f11617b = i8;
        }

        @Override // W4.r
        public void c(int i8) {
            Toast.makeText(C1422b.this.requireContext(), C1422b.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            ArrayList arrayList;
            AbstractC3159y.i(appInfo, "appInfo");
            C1505o c1505o = new C1505o();
            c1505o.b(appInfo);
            C1422b.this.o(c1505o);
            D4.G g8 = C1422b.this.f11612c;
            if (g8 != null) {
                arrayList = g8.c();
            } else {
                arrayList = null;
            }
            AbstractC3159y.f(arrayList);
            ((G.b) arrayList.get(this.f11617b)).e(appInfo);
            D4.G g9 = C1422b.this.f11612c;
            if (g9 != null) {
                g9.notifyItemChanged(this.f11617b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1498h f11618a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1422b f11619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1498h c1498h, C1422b c1422b) {
            super(0);
            this.f11618a = c1498h;
            this.f11619b = c1422b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            if (this.f11618a.y0() != null) {
                C1422b c1422b = this.f11619b;
                String y02 = this.f11618a.y0();
                AbstractC3159y.f(y02);
                c1422b.y(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1498h f11623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1422b f11624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1498h c1498h, C1422b c1422b) {
            super(0);
            this.f11623a = c1498h;
            this.f11624b = c1422b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m91invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m91invoke() {
            if (this.f11623a.y0() != null) {
                C1422b c1422b = this.f11624b;
                String y02 = this.f11623a.y0();
                AbstractC3159y.f(y02);
                c1422b.y(y02);
            }
        }
    }

    /* renamed from: U4.b$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC1478a {
        h() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            C1422b.this.w(appInfo);
        }
    }

    /* renamed from: U4.b$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC1482e {
        i() {
        }

        @Override // W4.InterfaceC1482e
        public void a(C1498h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3159y.i(appInfo, "appInfo");
            if (C1422b.this.getContext() != null) {
                C3326n.a aVar = C3326n.f34504t;
                Context context = C1422b.this.getContext();
                AbstractC3159y.f(context);
                C3326n a8 = aVar.a(context);
                a8.a();
                C1505o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                boolean r8 = new C3319g().r(appInfo.y0(), C1422b.this.getContext());
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                X4.O u02 = a8.u0(y02);
                a8.g();
                UptodownApp.a aVar2 = UptodownApp.f28003B;
                Context context2 = C1422b.this.getContext();
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
                            Context context3 = C1422b.this.getContext();
                            AbstractC3159y.f(context3);
                            File f8 = c3329q.f(context3);
                            String X7 = Z7.X();
                            AbstractC3159y.f(X7);
                            File file = new File(f8, X7);
                            Context context4 = C1422b.this.getContext();
                            AbstractC3159y.f(context4);
                            aVar2.X(file, context4, appInfo.t0());
                            return;
                        }
                        Context context5 = C1422b.this.getContext();
                        AbstractC3159y.f(context5);
                        Z7.n0(context5);
                        D4.G g8 = C1422b.this.f11612c;
                        if (g8 != null) {
                            g8.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!r8) {
                    C1422b.this.n(appInfo.i(), i8);
                    return;
                }
                if (u02 == null) {
                    C1422b.this.t(appInfo.y0());
                    return;
                }
                if (u02.o() != 100) {
                    C1422b.this.n(appInfo.i(), i8);
                    return;
                }
                C3329q c3329q2 = new C3329q();
                Context context6 = C1422b.this.getContext();
                AbstractC3159y.f(context6);
                File g9 = c3329q2.g(context6);
                String j8 = u02.j();
                AbstractC3159y.f(j8);
                File file2 = new File(g9, j8);
                Context context7 = C1422b.this.getContext();
                AbstractC3159y.f(context7);
                aVar2.X(file2, context7, appInfo.t0());
            }
        }

        @Override // W4.InterfaceC1482e
        public void b(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (C1422b.this.getContext() != null) {
                C3326n.a aVar = C3326n.f34504t;
                Context context = C1422b.this.getContext();
                AbstractC3159y.f(context);
                C3326n a8 = aVar.a(context);
                a8.a();
                C1505o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                X4.O u02 = a8.u0(y02);
                a8.g();
                if (Z7 != null) {
                    DownloadApkWorker.f30002k.a(appInfo.i());
                    C3313a c3313a = new C3313a();
                    Context context2 = C1422b.this.getContext();
                    AbstractC3159y.f(context2);
                    c3313a.a(context2, Z7.X());
                    Context context3 = C1422b.this.getContext();
                    AbstractC3159y.f(context3);
                    Z7.n0(context3);
                    D4.G g8 = C1422b.this.f11612c;
                    if (g8 != null) {
                        g8.notifyItemChanged(i8);
                    }
                    if (C1422b.this.getActivity() != null && (C1422b.this.getActivity() instanceof MainActivity)) {
                        FragmentActivity activity = C1422b.this.getActivity();
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
                    Context context4 = C1422b.this.getContext();
                    AbstractC3159y.f(context4);
                    aVar2.c0(n8, context4);
                    String j8 = u02.j();
                    if (j8 != null && j8.length() != 0) {
                        C3329q c3329q = new C3329q();
                        Context context5 = C1422b.this.getContext();
                        AbstractC3159y.f(context5);
                        File g9 = c3329q.g(context5);
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
    }

    /* renamed from: U4.b$j */
    /* loaded from: classes5.dex */
    public static final class j implements InterfaceC1481d {
        j() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f28003B.a0()) {
                if (C1422b.this.getActivity() != null && (C1422b.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = C1422b.this.getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).F2(app.i());
                } else if (C1422b.this.getActivity() != null && (C1422b.this.getActivity() instanceof AbstractActivityC2489a)) {
                    FragmentActivity activity2 = C1422b.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2489a) activity2).F2(app.i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.b$k */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1422b f11633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, C1422b c1422b, P5.d dVar) {
            super(2, dVar);
            this.f11632b = str;
            this.f11633c = c1422b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f11632b, this.f11633c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11631a == 0) {
                L5.t.b(obj);
                String str = this.f11632b;
                if (str != null && str.length() != 0 && this.f11633c.f11612c != null) {
                    D4.G g8 = this.f11633c.f11612c;
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
                                if (AbstractC3159y.d(b9.y0(), this.f11632b)) {
                                    D4.G g9 = this.f11633c.f11612c;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, j8, new c(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C1505o c1505o) {
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

    private final T4.n0 q() {
        return (T4.n0) this.f11610a.getValue();
    }

    private final void r() {
        q().f10776e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            q().f10776e.setNavigationIcon(drawable);
            q().f10776e.setNavigationContentDescription(getString(R.string.back));
        }
        q().f10776e.setNavigationOnClickListener(new View.OnClickListener() { // from class: U4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1422b.s(C1422b.this, view);
            }
        });
        q().f10777f.setTypeface(E4.j.f2274g.u());
        q().f10777f.setVisibility(8);
        q().f10775d.setItemAnimator(null);
        q().f10775d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = q().f10775d;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        recyclerView.addItemDecoration(new n5.t(requireContext, 11));
        RecyclerView recyclerView2 = q().f10775d;
        AbstractC3159y.h(recyclerView2, "binding.recyclerviewTopCat");
        recyclerView2.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C1422b this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity instanceof MainActivity) {
            FragmentActivity activity2 = this$0.getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).L6();
        } else if (activity instanceof AppDetailActivity) {
            FragmentActivity activity3 = this$0.getActivity();
            AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity4 = this$0.getActivity();
            AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
            ((MoreInfo) activity4).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        Intent launchIntentForPackage;
        if (getActivity() != null && str != null && str.length() != 0 && (launchIntentForPackage = requireActivity().getPackageManager().getLaunchIntentForPackage(str)) != null) {
            startActivity(launchIntentForPackage);
        }
    }

    private final void u() {
        D4.G g8;
        if (E4.j.f2274g.h() == null && (g8 = this.f11612c) != null) {
            g8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C1498h c1498h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).Z6(c1498h, new d(c1498h, this));
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            new S4.i(requireContext, c1498h.i(), new e(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).q3(q().f10773b.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).r3(c1498h, new f(c1498h, this));
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            new S4.i(requireContext2, c1498h.i(), new g(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void x(C1495e c1495e) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            X4.N n8 = new X4.N(null, null, 0, 7, null);
            ArrayList a8 = c1495e.a();
            AbstractC3159y.f(a8);
            n8.d(a8);
            n8.e(new C1501k(-4, c1495e.c(), c1495e.b()));
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            j jVar = this.f11613d;
            i iVar = this.f11614e;
            h hVar = new h();
            String b8 = c1495e.b();
            String c8 = c1495e.c();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3159y.h(string, "getString(R.string.read_more_desc_app_detail)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3159y.h(string2, "getString(R.string.read_less_desc_app_detail)");
            D4.G g8 = new D4.G(jVar, iVar, hVar, b8, c8, string, string2);
            this.f11612c = g8;
            g8.b(n8, (int) dimension);
            q().f10775d.setAdapter(this.f11612c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x(p());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        r();
        RelativeLayout root = q().getRoot();
        AbstractC3159y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u();
    }

    public final C1495e p() {
        C1495e c1495e = this.f11611b;
        if (c1495e != null) {
            return c1495e;
        }
        AbstractC3159y.y("alternatives");
        return null;
    }

    public final void v(C1495e c1495e) {
        AbstractC3159y.i(c1495e, "<set-?>");
        this.f11611b = c1495e;
    }

    public final void y(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new k(str, this, null), 2, null);
    }

    /* renamed from: U4.b$e */
    /* loaded from: classes5.dex */
    public static final class e implements W4.r {

        /* renamed from: U4.b$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1422b f11621a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11622b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1422b c1422b, C1498h c1498h) {
                super(0);
                this.f11621a = c1422b;
                this.f11622b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m90invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m90invoke() {
                this.f11621a.y(this.f11622b.y0());
            }
        }

        e() {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            FragmentActivity activity = C1422b.this.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).Z6(appInfo, new a(C1422b.this, appInfo));
        }

        @Override // W4.r
        public void c(int i8) {
        }
    }

    /* renamed from: U4.b$g */
    /* loaded from: classes5.dex */
    public static final class g implements W4.r {

        /* renamed from: U4.b$g$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1422b f11626a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11627b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1422b c1422b, C1498h c1498h) {
                super(0);
                this.f11626a = c1422b;
                this.f11627b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m92invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m92invoke() {
                this.f11626a.y(this.f11627b.y0());
            }
        }

        g() {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            FragmentActivity activity = C1422b.this.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity).r3(appInfo, new a(C1422b.this, appInfo));
        }

        @Override // W4.r
        public void c(int i8) {
        }
    }
}
