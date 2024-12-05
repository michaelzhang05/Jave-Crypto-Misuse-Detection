package X4;

import G4.C1199i;
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
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import g2.InterfaceC2865e;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;

/* loaded from: classes5.dex */
public final class T0 extends Fragment {

    /* renamed from: n, reason: collision with root package name */
    public static final a f13165n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1644k f13166a;

    /* renamed from: b, reason: collision with root package name */
    private C1199i f13167b;

    /* renamed from: e, reason: collision with root package name */
    private a5.N f13170e;

    /* renamed from: f, reason: collision with root package name */
    private a5.N f13171f;

    /* renamed from: g, reason: collision with root package name */
    private C1641h f13172g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f13173h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f13174i;

    /* renamed from: j, reason: collision with root package name */
    private View f13175j;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f13168c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f13169d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private Z4.s f13176k = new d();

    /* renamed from: l, reason: collision with root package name */
    private final b f13177l = new b();

    /* renamed from: m, reason: collision with root package name */
    private final c f13178m = new c();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final T0 a(C1644k category) {
            AbstractC3255y.i(category, "category");
            T0 t02 = new T0();
            t02.setArguments(category.z());
            return t02;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Z4.q {
        c() {
        }

        @Override // Z4.q
        public void a(a5.N topByCategoryReceived) {
            AbstractC3255y.i(topByCategoryReceived, "topByCategoryReceived");
            T0.this.f13171f = topByCategoryReceived;
        }

        @Override // Z4.q
        public void b(ArrayList topsByCategoryReceived) {
            C1199i c1199i;
            AbstractC3255y.i(topsByCategoryReceived, "topsByCategoryReceived");
            if (topsByCategoryReceived.size() > 0 && T0.this.r() != null && (c1199i = T0.this.f13167b) != null) {
                C1644k r8 = T0.this.r();
                AbstractC3255y.f(r8);
                c1199i.m(topsByCategoryReceived, r8);
            }
        }

        @Override // Z4.q
        public void c(ArrayList featuresReceived) {
            AbstractC3255y.i(featuresReceived, "featuresReceived");
            T0.this.f13169d = featuresReceived;
        }

        @Override // Z4.q
        public void d(ArrayList floatingCategories) {
            AbstractC3255y.i(floatingCategories, "floatingCategories");
            C1199i c1199i = T0.this.f13167b;
            if (c1199i != null) {
                c1199i.i(floatingCategories);
            }
        }

        @Override // Z4.q
        public void e(C1641h appReplacement) {
            AbstractC3255y.i(appReplacement, "appReplacement");
            C1199i c1199i = T0.this.f13167b;
            if (c1199i != null) {
                c1199i.b(appReplacement);
            }
        }

        @Override // Z4.q
        public void f(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            T0.this.f13172g = appInfo;
        }

        @Override // Z4.q
        public void g(a5.N topByCategoryReceived) {
            AbstractC3255y.i(topByCategoryReceived, "topByCategoryReceived");
            C1199i c1199i = T0.this.f13167b;
            if (c1199i != null) {
                c1199i.k(topByCategoryReceived);
            }
        }

        @Override // Z4.q
        public void h() {
            T0.this.p();
        }

        @Override // Z4.q
        public void i(ArrayList categoriesReceived) {
            AbstractC3255y.i(categoriesReceived, "categoriesReceived");
            T0.this.f13168c = categoriesReceived;
        }

        @Override // Z4.q
        public void j(a5.N recentsByCategoryReceived) {
            AbstractC3255y.i(recentsByCategoryReceived, "recentsByCategoryReceived");
            T0.this.f13170e = recentsByCategoryReceived;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Z4.s {
        d() {
        }

        @Override // Z4.s
        public void a(a5.N topByCategory) {
            AbstractC3255y.i(topByCategory, "topByCategory");
            if (UptodownApp.f29058B.a0()) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).P7(topByCategory.b());
            }
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0() && T0.this.getActivity() != null && (T0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).F2(app.i());
            }
        }

        @Override // Z4.InterfaceC1593g
        public void c(C1644k category) {
            AbstractC3255y.i(category, "category");
            if (UptodownApp.f29058B.a0()) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).P7(category);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13187a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T0 f13189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, T0 t02, S5.d dVar) {
            super(2, dVar);
            this.f13188b = str;
            this.f13189c = t02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f13188b, this.f13189c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1199i c1199i;
            T5.b.e();
            if (this.f13187a == 0) {
                O5.t.b(obj);
                String str = this.f13188b;
                if (str != null && str.length() != 0 && this.f13189c.f13174i != null && (c1199i = this.f13189c.f13167b) != null) {
                    String str2 = this.f13188b;
                    RecyclerView recyclerView = this.f13189c.f13174i;
                    AbstractC3255y.f(recyclerView);
                    c1199i.w(str2, recyclerView);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0.isEmpty() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r7 = this;
            G4.i r0 = r7.f13167b
            if (r0 == 0) goto L14
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.r()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
        L14:
            G4.i r0 = new G4.i
            Z4.s r1 = r7.f13176k
            X4.T0$b r2 = r7.f13177l
            android.content.Context r3 = r7.requireContext()
            java.lang.String r4 = "requireContext()"
            kotlin.jvm.internal.AbstractC3255y.h(r3, r4)
            java.lang.Class<X4.T0> r4 = X4.T0.class
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r5 = "this.javaClass.simpleName"
            kotlin.jvm.internal.AbstractC3255y.h(r4, r5)
            r0.<init>(r1, r2, r3, r4)
            r7.f13167b = r0
        L33:
            java.util.ArrayList r0 = r7.f13169d
            int r0 = r0.size()
            if (r0 <= 0) goto L5e
            java.util.ArrayList r0 = r7.f13168c
            int r0 = r0.size()
            if (r0 <= 0) goto L5e
            G4.i r1 = r7.f13167b
            if (r1 == 0) goto L54
            java.util.ArrayList r2 = r7.f13169d
            java.util.ArrayList r3 = r7.f13168c
            a5.N r4 = r7.f13170e
            a5.h r5 = r7.f13172g
            a5.N r6 = r7.f13171f
            r1.p(r2, r3, r4, r5, r6)
        L54:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f13174i
            if (r0 != 0) goto L59
            goto L5e
        L59:
            G4.i r1 = r7.f13167b
            r0.setAdapter(r1)
        L5e:
            android.widget.RelativeLayout r0 = r7.f13173h
            if (r0 != 0) goto L63
            goto L68
        L63:
            r1 = 8
            r0.setVisibility(r1)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.T0.p():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1644k c1644k = new C1644k(0, null, null, 7, null);
            this.f13166a = c1644k;
            AbstractC3255y.f(c1644k);
            c1644k.y(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        if (this.f13175j == null) {
            View inflate = inflater.inflate(R.layout.parent_category_fragment, viewGroup, false);
            this.f13175j = inflate;
            AbstractC3255y.f(inflate);
            this.f13173h = (RelativeLayout) inflate.findViewById(R.id.loading_view_parent_category_fragment);
            View view = this.f13175j;
            AbstractC3255y.f(view);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            this.f13174i = recyclerView;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            RecyclerView recyclerView2 = this.f13174i;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.f13174i;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new q5.q((int) getResources().getDimension(R.dimen.margin_m)));
            }
            RelativeLayout relativeLayout = this.f13173h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        } else {
            RelativeLayout relativeLayout2 = this.f13173h;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        q();
        return this.f13175j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC2865e o8 = UptodownApp.f29058B.o();
        if (o8 != null) {
            o8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC2865e o8;
        super.onResume();
        UptodownApp.a aVar = UptodownApp.f29058B;
        InterfaceC2865e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                if (aVar2.l(requireContext2) > 0 && (o8 = aVar.o()) != null) {
                    o8.play();
                }
            }
        }
    }

    public final void q() {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        c cVar = this.f13178m;
        C1644k c1644k = this.f13166a;
        AbstractC3255y.f(c1644k);
        new V4.h(requireContext, cVar, c1644k, LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final C1644k r() {
        return this.f13166a;
    }

    public final void s() {
        RecyclerView recyclerView = this.f13174i;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void t(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(str, this, null), 2, null);
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1587a {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T0 f13180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13181b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T0 t02, C1641h c1641h) {
                super(0);
                this.f13180a = t02;
                this.f13181b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m82invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m82invoke() {
                this.f13180a.t(this.f13181b.y0());
            }
        }

        b() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (T0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout E52 = ((MainActivity) activity).E5();
                if (E52 == null || E52.getVisibility() != 0) {
                    FragmentActivity activity2 = T0.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).X6(appInfo, new a(T0.this, appInfo));
                    Context requireContext = T0.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    new V4.i(requireContext, appInfo.i(), new C0254b(T0.this), LifecycleOwnerKt.getLifecycleScope(T0.this));
                }
            }
        }

        /* renamed from: X4.T0$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0254b implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T0 f13182a;

            /* renamed from: X4.T0$b$b$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ T0 f13183a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1641h f13184b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(T0 t02, C1641h c1641h) {
                    super(0);
                    this.f13183a = t02;
                    this.f13184b = c1641h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m83invoke();
                    return O5.I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m83invoke() {
                    this.f13183a.t(this.f13184b.y0());
                }
            }

            C0254b(T0 t02) {
                this.f13182a = t02;
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13182a.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).X6(appInfo, new a(this.f13182a, appInfo));
            }

            @Override // Z4.r
            public void c(int i8) {
            }
        }
    }
}
