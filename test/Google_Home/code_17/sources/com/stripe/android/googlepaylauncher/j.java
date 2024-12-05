package com.stripe.android.googlepaylauncher;

import A2.j;
import P5.a0;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import h3.m;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.C3427m;
import m2.r;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.w;
import org.json.JSONObject;
import r0.C3905m;

/* loaded from: classes4.dex */
public final class j extends ViewModel {

    /* renamed from: j, reason: collision with root package name */
    private static final a f25003j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25004k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3905m f25005a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f25006b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayPaymentMethodLauncherContractV2.a f25007c;

    /* renamed from: d, reason: collision with root package name */
    private final m f25008d;

    /* renamed from: e, reason: collision with root package name */
    private final C3427m f25009e;

    /* renamed from: f, reason: collision with root package name */
    private final L2.g f25010f;

    /* renamed from: g, reason: collision with root package name */
    private final SavedStateHandle f25011g;

    /* renamed from: h, reason: collision with root package name */
    private final w f25012h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3698L f25013i;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f25014a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f25015a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Application application) {
                super(0);
                this.f25015a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35037c.a(this.f25015a).g();
            }
        }

        /* renamed from: com.stripe.android.googlepaylauncher.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0474b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f25016a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0474b(Application application) {
                super(0);
                this.f25016a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35037c.a(this.f25016a).h();
            }
        }

        public b(GooglePayPaymentMethodLauncherContractV2.a args) {
            AbstractC3255y.i(args, "args");
            this.f25014a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            Application a8 = D2.b.a(extras);
            j a9 = M2.b.a().a(a8).d(false).c(new a(a8)).e(new C0474b(a8)).b(a0.d("GooglePayPaymentMethodLauncher")).f(this.f25014a.b()).build().a().b(this.f25014a).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3255y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25017a;

        /* renamed from: c, reason: collision with root package name */
        int f25019c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25017a = obj;
            this.f25019c |= Integer.MIN_VALUE;
            return j.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25020a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25021b;

        /* renamed from: d, reason: collision with root package name */
        int f25023d;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25021b = obj;
            this.f25023d |= Integer.MIN_VALUE;
            return j.this.g(this);
        }
    }

    public j(C3905m paymentsClient, j.c requestOptions, GooglePayPaymentMethodLauncherContractV2.a args, m stripeRepository, C3427m googlePayJsonFactory, L2.g googlePayRepository, SavedStateHandle savedStateHandle) {
        AbstractC3255y.i(paymentsClient, "paymentsClient");
        AbstractC3255y.i(requestOptions, "requestOptions");
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3255y.i(googlePayRepository, "googlePayRepository");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        this.f25005a = paymentsClient;
        this.f25006b = requestOptions;
        this.f25007c = args;
        this.f25008d = stripeRepository;
        this.f25009e = googlePayJsonFactory;
        this.f25010f = googlePayRepository;
        this.f25011g = savedStateHandle;
        w a8 = AbstractC3700N.a(null);
        this.f25012h = a8;
        this.f25013i = AbstractC3708h.b(a8);
    }

    public final JSONObject a() {
        return C3427m.e(this.f25009e, c(this.f25007c), com.stripe.android.googlepaylauncher.a.b(this.f25007c.b().b()), null, this.f25007c.b().p(), new C3427m.c(this.f25007c.b().l()), Boolean.valueOf(this.f25007c.b().a()), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(r0.C3901i r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.j.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.j$c r0 = (com.stripe.android.googlepaylauncher.j.c) r0
            int r1 = r0.f25019c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25019c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.j$c r0 = new com.stripe.android.googlepaylauncher.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25017a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25019c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r5 = r5.u()
            r6.<init>(r5)
            com.stripe.android.model.p$e r5 = com.stripe.android.model.p.f25636u
            com.stripe.android.model.p r5 = r5.j(r6)
            h3.m r6 = r4.f25008d
            A2.j$c r2 = r4.f25006b
            r0.f25019c = r3
            java.lang.Object r5 = r6.n(r5, r2, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            java.lang.Throwable r6 = O5.s.e(r5)
            if (r6 != 0) goto L64
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            com.stripe.android.googlepaylauncher.h$f$b r6 = new com.stripe.android.googlepaylauncher.h$f$b
            r6.<init>(r5)
            goto L75
        L64:
            com.stripe.android.googlepaylauncher.h$f$c r5 = new com.stripe.android.googlepaylauncher.h$f$c
            boolean r0 = r6 instanceof w2.C4134a
            if (r0 == 0) goto L6c
            r3 = 3
            goto L71
        L6c:
            boolean r0 = r6 instanceof w2.C4139f
            if (r0 == 0) goto L71
            r3 = 2
        L71:
            r5.<init>(r6, r3)
            r6 = r5
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.j.b(r0.i, S5.d):java.lang.Object");
    }

    public final C3427m.e c(GooglePayPaymentMethodLauncherContractV2.a args) {
        AbstractC3255y.i(args, "args");
        return new C3427m.e(args.g(), C3427m.e.c.f35009c, args.b().i(), args.i(), Long.valueOf(args.a()), args.h(), C3427m.e.a.f35003b);
    }

    public final InterfaceC3698L d() {
        return this.f25013i;
    }

    public final boolean e() {
        return AbstractC3255y.d(this.f25011g.get("has_launched"), Boolean.TRUE);
    }

    public final Object f(S5.d dVar) {
        return AbstractC3708h.w(this.f25010f.isReady(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.j.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.j$d r0 = (com.stripe.android.googlepaylauncher.j.d) r0
            int r1 = r0.f25023d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25023d = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.j$d r0 = new com.stripe.android.googlepaylauncher.j$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25021b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25023d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r6)
            goto L76
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f25020a
            com.stripe.android.googlepaylauncher.j r2 = (com.stripe.android.googlepaylauncher.j) r2
            O5.t.b(r6)
            goto L4b
        L3c:
            O5.t.b(r6)
            r0.f25020a = r5
            r0.f25023d = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L77
            r0.m r6 = r2.f25005a
            org.json.JSONObject r2 = r2.a()
            java.lang.String r2 = r2.toString()
            r0.j r2 = r0.C3902j.p(r2)
            com.google.android.gms.tasks.Task r6 = r6.t(r2)
            java.lang.String r2 = "loadPaymentData(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r6, r2)
            r2 = 0
            r0.f25020a = r2
            r0.f25023d = r3
            java.lang.Object r6 = L2.i.b(r6, r2, r0, r4, r2)
            if (r6 != r1) goto L76
            return r1
        L76:
            return r6
        L77:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Google Pay is unavailable."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.j.g(S5.d):java.lang.Object");
    }

    public final void h(boolean z8) {
        this.f25011g.set("has_launched", Boolean.valueOf(z8));
    }

    public final void i(h.f result) {
        AbstractC3255y.i(result, "result");
        this.f25012h.setValue(result);
    }
}
