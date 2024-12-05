package com.stripe.android.stripe3ds2.views;

import O5.InterfaceC1351g;
import O5.InterfaceC1355k;
import O5.x;
import W3.q;
import a4.v;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.b;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.transaction.q;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.b;
import com.stripe.android.stripe3ds2.views.d;
import d4.C2737a;
import d4.C2743g;
import d4.C2745i;
import d4.C2749m;
import d4.C2754r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.InterfaceC3249s;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import l6.C3347b0;
import l6.I;

/* loaded from: classes4.dex */
public final class ChallengeActivity extends AppCompatActivity {

    /* renamed from: m, reason: collision with root package name */
    private static final a f27995m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final I f27996n = C3347b0.b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f27997a = O5.l.b(new q());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f27998b = O5.l.b(new c());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f27999c = O5.l.b(new e());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f28000d = O5.l.b(new f());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f28001e = O5.l.b(new s());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1355k f28002f = O5.l.b(new b());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1355k f28003g = O5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1355k f28004h = new ViewModelLazy(U.b(com.stripe.android.stripe3ds2.views.b.class), new o(this), new t(), new p(null, this));

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1355k f28005i = O5.l.b(new r());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1355k f28006j = O5.l.b(new g());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f28007k = O5.l.b(new m());

    /* renamed from: l, reason: collision with root package name */
    private Dialog f28008l;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.a invoke() {
            return new b.a(ChallengeActivity.this.K().a(), ChallengeActivity.this.E(), ChallengeActivity.this.K().g(), ChallengeActivity.f27996n);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X3.a invoke() {
            Context applicationContext = ChallengeActivity.this.getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            return new X3.a(applicationContext, new X3.e(ChallengeActivity.this.K().l()), null, null, null, null, null, 0, 252, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.transaction.k invoke() {
            return new q.b(ChallengeActivity.f27996n).a(ChallengeActivity.this.K().b().a(), ChallengeActivity.this.E());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.c invoke() {
            return (com.stripe.android.stripe3ds2.views.c) ChallengeActivity.this.L().f10018b.getFragment();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T3.c invoke() {
            return ChallengeActivity.this.G().H();
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2754r invoke() {
            return new C2754r(ChallengeActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends OnBackPressedCallback {
        h() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ChallengeActivity.this.M().u(a.C0665a.f27853a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {
        i() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.a aVar) {
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.C();
                ChallengeActivity challengeActivity = ChallengeActivity.this;
                Dialog a8 = challengeActivity.I().a();
                a8.show();
                challengeActivity.f28008l = a8;
                com.stripe.android.stripe3ds2.views.b M8 = ChallengeActivity.this.M();
                AbstractC3255y.f(aVar);
                M8.u(aVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.a) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function1 {
        j() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.h hVar) {
            ChallengeActivity.this.setResult(-1, new Intent().putExtras(hVar.g()));
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.h) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(T t8) {
            super(1);
            this.f28019b = t8;
        }

        public final void a(b4.b bVar) {
            String str;
            ChallengeActivity.this.B();
            if (bVar != null) {
                ChallengeActivity.this.N(bVar);
                T t8 = this.f28019b;
                b4.g b02 = bVar.b0();
                if (b02 != null) {
                    str = b02.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                t8.f34162a = str;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b4.b) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(T t8) {
            super(1);
            this.f28021b = t8;
        }

        public final void a(Boolean bool) {
            if (AbstractC3255y.d(bool, Boolean.TRUE)) {
                ChallengeActivity.this.M().n(new h.g((String) this.f28021b.f34162a, ChallengeActivity.this.K().h().b0(), ChallengeActivity.this.K().i()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3256z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2745i invoke() {
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            return new C2745i(challengeActivity, challengeActivity.K().s());
        }
    }

    /* loaded from: classes4.dex */
    static final class n implements Observer, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f28023a;

        n(Function1 function) {
            AbstractC3255y.i(function, "function");
            this.f28023a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return this.f28023a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28023a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28024a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f28024a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28024a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28025a = function0;
            this.f28026b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28025a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28026b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3256z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a4.j invoke() {
            return new a4.j(ChallengeActivity.this.K().p(), ChallengeActivity.this.F(), ChallengeActivity.this.K().a());
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3256z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.d invoke() {
            d.a aVar = com.stripe.android.stripe3ds2.views.d.f28144h;
            Bundle extras = ChallengeActivity.this.getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            AbstractC3255y.f(extras);
            return aVar.a(extras);
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3256z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T3.b invoke() {
            T3.b c8 = T3.b.c(ChallengeActivity.this.getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends AbstractC3256z implements Function0 {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.C0678b(ChallengeActivity.this.D(), ChallengeActivity.this.J(), ChallengeActivity.this.E(), ChallengeActivity.f27996n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.M().u(a.C0665a.f27853a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Dialog dialog = this.f28008l;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.f28008l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        H().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.b D() {
        return (com.stripe.android.stripe3ds2.transaction.b) this.f28002f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X3.c E() {
        return (X3.c) this.f27998b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.k F() {
        return (com.stripe.android.stripe3ds2.transaction.k) this.f28003g.getValue();
    }

    private final C2754r H() {
        return (C2754r) this.f28006j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2745i I() {
        return (C2745i) this.f28007k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v J() {
        return (v) this.f27997a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.views.d K() {
        return (com.stripe.android.stripe3ds2.views.d) this.f28005i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(b4.b bVar) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC3255y.h(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        AbstractC3255y.h(beginTransaction, "beginTransaction()");
        C2737a c2737a = C2737a.f31168a;
        beginTransaction.setCustomAnimations(c2737a.a(), c2737a.b(), c2737a.a(), c2737a.b());
        beginTransaction.replace(L().f10018b.getId(), com.stripe.android.stripe3ds2.views.c.class, BundleKt.bundleOf(x.a("arg_cres", bVar)));
        beginTransaction.commit();
    }

    private final void z() {
        final ThreeDS2Button a8 = new C2749m(this).a(K().s().i(), K().s().g(q.a.CANCEL));
        if (a8 != null) {
            a8.setOnClickListener(new View.OnClickListener() { // from class: d4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.A(ThreeDS2Button.this, this, view);
                }
            });
        }
    }

    public final com.stripe.android.stripe3ds2.views.c G() {
        return (com.stripe.android.stripe3ds2.views.c) this.f27999c.getValue();
    }

    public final T3.b L() {
        return (T3.b) this.f28001e.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.b M() {
        return (com.stripe.android.stripe3ds2.views.b) this.f28004h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSupportFragmentManager().setFragmentFactory(new C2743g(K().s(), J(), F(), E(), D(), K().h().b0(), K().i(), f27996n));
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(new h());
        getWindow().setFlags(8192, 8192);
        setContentView(L().getRoot());
        M().l().observe(this, new n(new i()));
        M().j().observe(this, new n(new j()));
        z();
        T t8 = new T();
        t8.f34162a = "";
        M().h().observe(this, new n(new k(t8)));
        if (bundle == null) {
            M().p(K().h());
        }
        M().m().observe(this, new n(new l(t8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        B();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        M().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        M().s(true);
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (M().k()) {
            M().q();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        M().o();
    }
}
