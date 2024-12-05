package X4;

import G4.G;
import O5.InterfaceC1355k;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import Z4.InterfaceC1591e;
import a5.C1638e;
import a5.C1641h;
import a5.C1644k;
import a5.C1648o;
import a6.InterfaceC1668n;
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
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;
import o5.C3680t;

/* renamed from: X4.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1531b extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f13279f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public C1638e f13281b;

    /* renamed from: c, reason: collision with root package name */
    private G4.G f13282c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f13280a = O5.l.b(new C0256b());

    /* renamed from: d, reason: collision with root package name */
    private j f13283d = new j();

    /* renamed from: e, reason: collision with root package name */
    private i f13284e = new i();

    /* renamed from: X4.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1531b a(C1638e alternatives) {
            AbstractC3255y.i(alternatives, "alternatives");
            C1531b c1531b = new C1531b();
            c1531b.v(alternatives);
            return c1531b;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: X4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0256b extends AbstractC3256z implements Function0 {
        C0256b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.n0 invoke() {
            return W4.n0.c(C1531b.this.getLayoutInflater());
        }
    }

    /* renamed from: X4.b$c */
    /* loaded from: classes5.dex */
    public static final class c implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13287b;

        c(int i8) {
            this.f13287b = i8;
        }

        @Override // Z4.r
        public void c(int i8) {
            Toast.makeText(C1531b.this.requireContext(), C1531b.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            ArrayList arrayList;
            AbstractC3255y.i(appInfo, "appInfo");
            C1648o c1648o = new C1648o();
            c1648o.a(appInfo);
            C1531b.this.o(c1648o);
            G4.G g8 = C1531b.this.f13282c;
            if (g8 != null) {
                arrayList = g8.c();
            } else {
                arrayList = null;
            }
            AbstractC3255y.f(arrayList);
            ((G.b) arrayList.get(this.f13287b)).e(appInfo);
            G4.G g9 = C1531b.this.f13282c;
            if (g9 != null) {
                g9.notifyItemChanged(this.f13287b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1641h f13288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1531b f13289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1641h c1641h, C1531b c1531b) {
            super(0);
            this.f13288a = c1641h;
            this.f13289b = c1531b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m94invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m94invoke() {
            if (this.f13288a.y0() != null) {
                C1531b c1531b = this.f13289b;
                String y02 = this.f13288a.y0();
                AbstractC3255y.f(y02);
                c1531b.y(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1641h f13293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1531b f13294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1641h c1641h, C1531b c1531b) {
            super(0);
            this.f13293a = c1641h;
            this.f13294b = c1531b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m96invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m96invoke() {
            if (this.f13293a.y0() != null) {
                C1531b c1531b = this.f13294b;
                String y02 = this.f13293a.y0();
                AbstractC3255y.f(y02);
                c1531b.y(y02);
            }
        }
    }

    /* renamed from: X4.b$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC1587a {
        h() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            C1531b.this.w(appInfo);
        }
    }

    /* renamed from: X4.b$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC1591e {
        i() {
        }

        @Override // Z4.InterfaceC1591e
        public void a(C1641h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3255y.i(appInfo, "appInfo");
            if (C1531b.this.getContext() != null) {
                C3674n.a aVar = C3674n.f36505t;
                Context context = C1531b.this.getContext();
                AbstractC3255y.f(context);
                C3674n a8 = aVar.a(context);
                a8.a();
                C1648o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                boolean r8 = new C3667g().r(appInfo.y0(), C1531b.this.getContext());
                String y02 = appInfo.y0();
                AbstractC3255y.f(y02);
                a5.O u02 = a8.u0(y02);
                a8.l();
                UptodownApp.a aVar2 = UptodownApp.f29058B;
                Context context2 = C1531b.this.getContext();
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
                            Context context3 = C1531b.this.getContext();
                            AbstractC3255y.f(context3);
                            File f8 = c3677q.f(context3);
                            String X7 = Z7.X();
                            AbstractC3255y.f(X7);
                            File file = new File(f8, X7);
                            Context context4 = C1531b.this.getContext();
                            AbstractC3255y.f(context4);
                            aVar2.X(file, context4, appInfo.t0());
                            return;
                        }
                        Context context5 = C1531b.this.getContext();
                        AbstractC3255y.f(context5);
                        Z7.n0(context5);
                        G4.G g8 = C1531b.this.f13282c;
                        if (g8 != null) {
                            g8.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!r8) {
                    C1531b.this.n(appInfo.i(), i8);
                    return;
                }
                if (u02 == null) {
                    C1531b.this.t(appInfo.y0());
                    return;
                }
                if (u02.u() != 100) {
                    C1531b.this.n(appInfo.i(), i8);
                    return;
                }
                C3677q c3677q2 = new C3677q();
                Context context6 = C1531b.this.getContext();
                AbstractC3255y.f(context6);
                File g9 = c3677q2.g(context6);
                String l8 = u02.l();
                AbstractC3255y.f(l8);
                File file2 = new File(g9, l8);
                Context context7 = C1531b.this.getContext();
                AbstractC3255y.f(context7);
                aVar2.X(file2, context7, appInfo.t0());
            }
        }

        @Override // Z4.InterfaceC1591e
        public void b(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (C1531b.this.getContext() != null) {
                C3674n.a aVar = C3674n.f36505t;
                Context context = C1531b.this.getContext();
                AbstractC3255y.f(context);
                C3674n a8 = aVar.a(context);
                a8.a();
                C1648o Z7 = a8.Z(String.valueOf(appInfo.f0()));
                String y02 = appInfo.y0();
                AbstractC3255y.f(y02);
                a5.O u02 = a8.u0(y02);
                a8.l();
                if (Z7 != null) {
                    DownloadApkWorker.f31034k.a(appInfo.i());
                    C3661a c3661a = new C3661a();
                    Context context2 = C1531b.this.getContext();
                    AbstractC3255y.f(context2);
                    c3661a.a(context2, Z7.X());
                    Context context3 = C1531b.this.getContext();
                    AbstractC3255y.f(context3);
                    Z7.n0(context3);
                    G4.G g8 = C1531b.this.f13282c;
                    if (g8 != null) {
                        g8.notifyItemChanged(i8);
                    }
                    if (C1531b.this.getActivity() != null && (C1531b.this.getActivity() instanceof MainActivity)) {
                        FragmentActivity activity = C1531b.this.getActivity();
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
                    Context context4 = C1531b.this.getContext();
                    AbstractC3255y.f(context4);
                    aVar2.c0(s8, context4);
                    String l8 = u02.l();
                    if (l8 != null && l8.length() != 0) {
                        C3677q c3677q = new C3677q();
                        Context context5 = C1531b.this.getContext();
                        AbstractC3255y.f(context5);
                        File g9 = c3677q.g(context5);
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
    }

    /* renamed from: X4.b$j */
    /* loaded from: classes5.dex */
    public static final class j implements InterfaceC1590d {
        j() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0()) {
                if (C1531b.this.getActivity() != null && (C1531b.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = C1531b.this.getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).F2(app.i());
                } else if (C1531b.this.getActivity() != null && (C1531b.this.getActivity() instanceof AbstractActivityC2683a)) {
                    FragmentActivity activity2 = C1531b.this.getActivity();
                    AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2683a) activity2).F2(app.i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.b$k */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1531b f13303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, C1531b c1531b, S5.d dVar) {
            super(2, dVar);
            this.f13302b = str;
            this.f13303c = c1531b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f13302b, this.f13303c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13301a == 0) {
                O5.t.b(obj);
                String str = this.f13302b;
                if (str != null && str.length() != 0 && this.f13303c.f13282c != null) {
                    G4.G g8 = this.f13303c.f13282c;
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
                                if (AbstractC3255y.d(b9.y0(), this.f13302b)) {
                                    G4.G g9 = this.f13303c.f13282c;
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
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, j8, new c(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C1648o c1648o) {
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

    private final W4.n0 q() {
        return (W4.n0) this.f13280a.getValue();
    }

    private final void r() {
        q().f12433e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            q().f12433e.setNavigationIcon(drawable);
            q().f12433e.setNavigationContentDescription(getString(R.string.back));
        }
        q().f12433e.setNavigationOnClickListener(new View.OnClickListener() { // from class: X4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1531b.s(C1531b.this, view);
            }
        });
        q().f12434f.setTypeface(H4.j.f3824g.u());
        q().f12434f.setVisibility(8);
        q().f12432d.setItemAnimator(null);
        q().f12432d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = q().f12432d;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        recyclerView.addItemDecoration(new q5.t(requireContext, 11));
        RecyclerView recyclerView2 = q().f12432d;
        AbstractC3255y.h(recyclerView2, "binding.recyclerviewTopCat");
        recyclerView2.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C1531b this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity instanceof MainActivity) {
            FragmentActivity activity2 = this$0.getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).J6();
        } else if (activity instanceof AppDetailActivity) {
            FragmentActivity activity3 = this$0.getActivity();
            AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity4 = this$0.getActivity();
            AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
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
        G4.G g8;
        if (H4.j.f3824g.h() == null && (g8 = this.f13282c) != null) {
            g8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C1641h c1641h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).X6(c1641h, new d(c1641h, this));
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            new V4.i(requireContext, c1641h.i(), new e(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).q3(q().f12430b.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).r3(c1641h, new f(c1641h, this));
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            new V4.i(requireContext2, c1641h.i(), new g(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void x(C1638e c1638e) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            a5.N n8 = new a5.N(null, null, 0, 7, null);
            ArrayList a8 = c1638e.a();
            AbstractC3255y.f(a8);
            n8.d(a8);
            n8.e(new C1644k(-4, c1638e.c(), c1638e.b()));
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            j jVar = this.f13283d;
            i iVar = this.f13284e;
            h hVar = new h();
            String b8 = c1638e.b();
            String c8 = c1638e.c();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3255y.h(string, "getString(R.string.read_more_desc_app_detail)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3255y.h(string2, "getString(R.string.read_less_desc_app_detail)");
            G4.G g8 = new G4.G(jVar, iVar, hVar, b8, c8, string, string2);
            this.f13282c = g8;
            g8.b(n8, (int) dimension);
            q().f12432d.setAdapter(this.f13282c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x(p());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        r();
        RelativeLayout root = q().getRoot();
        AbstractC3255y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u();
    }

    public final C1638e p() {
        C1638e c1638e = this.f13281b;
        if (c1638e != null) {
            return c1638e;
        }
        AbstractC3255y.y("alternatives");
        return null;
    }

    public final void v(C1638e c1638e) {
        AbstractC3255y.i(c1638e, "<set-?>");
        this.f13281b = c1638e;
    }

    public final void y(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new k(str, this, null), 2, null);
    }

    /* renamed from: X4.b$e */
    /* loaded from: classes5.dex */
    public static final class e implements Z4.r {

        /* renamed from: X4.b$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1531b f13291a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13292b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1531b c1531b, C1641h c1641h) {
                super(0);
                this.f13291a = c1531b;
                this.f13292b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m95invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m95invoke() {
                this.f13291a.y(this.f13292b.y0());
            }
        }

        e() {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            FragmentActivity activity = C1531b.this.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).X6(appInfo, new a(C1531b.this, appInfo));
        }

        @Override // Z4.r
        public void c(int i8) {
        }
    }

    /* renamed from: X4.b$g */
    /* loaded from: classes5.dex */
    public static final class g implements Z4.r {

        /* renamed from: X4.b$g$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1531b f13296a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13297b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1531b c1531b, C1641h c1641h) {
                super(0);
                this.f13296a = c1531b;
                this.f13297b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m97invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m97invoke() {
                this.f13296a.y(this.f13297b.y0());
            }
        }

        g() {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            FragmentActivity activity = C1531b.this.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity).r3(appInfo, new a(C1531b.this, appInfo));
        }

        @Override // Z4.r
        public void c(int i8) {
        }
    }
}
