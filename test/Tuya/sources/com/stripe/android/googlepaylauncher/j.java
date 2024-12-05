package com.stripe.android.googlepaylauncher;

import M5.a0;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import e3.m;
import e6.InterfaceC2643c;
import j2.C3073m;
import j2.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.v;
import org.json.JSONObject;
import s0.C3723m;
import x2.j;

/* loaded from: classes4.dex */
public final class j extends ViewModel {

    /* renamed from: j, reason: collision with root package name */
    private static final a f23948j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f23949k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3723m f23950a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f23951b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayPaymentMethodLauncherContractV2.a f23952c;

    /* renamed from: d, reason: collision with root package name */
    private final m f23953d;

    /* renamed from: e, reason: collision with root package name */
    private final C3073m f23954e;

    /* renamed from: f, reason: collision with root package name */
    private final I2.g f23955f;

    /* renamed from: g, reason: collision with root package name */
    private final SavedStateHandle f23956g;

    /* renamed from: h, reason: collision with root package name */
    private final v f23957h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3349K f23958i;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f23959a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f23960a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Application application) {
                super(0);
                this.f23960a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f33061c.a(this.f23960a).e();
            }
        }

        /* renamed from: com.stripe.android.googlepaylauncher.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0478b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f23961a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0478b(Application application) {
                super(0);
                this.f23961a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f33061c.a(this.f23961a).f();
            }
        }

        public b(GooglePayPaymentMethodLauncherContractV2.a args) {
            AbstractC3159y.i(args, "args");
            this.f23959a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            Application a8 = A2.b.a(extras);
            j a9 = J2.b.a().a(a8).d(false).c(new a(a8)).e(new C0478b(a8)).b(a0.d("GooglePayPaymentMethodLauncher")).f(this.f23959a.c()).build().a().b(this.f23959a).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3159y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23962a;

        /* renamed from: c, reason: collision with root package name */
        int f23964c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23962a = obj;
            this.f23964c |= Integer.MIN_VALUE;
            return j.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23965a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23966b;

        /* renamed from: d, reason: collision with root package name */
        int f23968d;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23966b = obj;
            this.f23968d |= Integer.MIN_VALUE;
            return j.this.g(this);
        }
    }

    public j(C3723m paymentsClient, j.c requestOptions, GooglePayPaymentMethodLauncherContractV2.a args, m stripeRepository, C3073m googlePayJsonFactory, I2.g googlePayRepository, SavedStateHandle savedStateHandle) {
        AbstractC3159y.i(paymentsClient, "paymentsClient");
        AbstractC3159y.i(requestOptions, "requestOptions");
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3159y.i(googlePayRepository, "googlePayRepository");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        this.f23950a = paymentsClient;
        this.f23951b = requestOptions;
        this.f23952c = args;
        this.f23953d = stripeRepository;
        this.f23954e = googlePayJsonFactory;
        this.f23955f = googlePayRepository;
        this.f23956g = savedStateHandle;
        v a8 = AbstractC3351M.a(null);
        this.f23957h = a8;
        this.f23958i = AbstractC3360h.b(a8);
    }

    public final JSONObject a() {
        return C3073m.e(this.f23954e, c(this.f23952c), com.stripe.android.googlepaylauncher.a.b(this.f23952c.c().c()), null, this.f23952c.c().k(), new C3073m.c(this.f23952c.c().j()), Boolean.valueOf(this.f23952c.c().b()), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(s0.C3719i r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.j.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.j$c r0 = (com.stripe.android.googlepaylauncher.j.c) r0
            int r1 = r0.f23964c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23964c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.j$c r0 = new com.stripe.android.googlepaylauncher.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23962a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23964c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r5 = r5.u()
            r6.<init>(r5)
            com.stripe.android.model.p$e r5 = com.stripe.android.model.p.f24581u
            com.stripe.android.model.p r5 = r5.j(r6)
            e3.m r6 = r4.f23953d
            x2.j$c r2 = r4.f23951b
            r0.f23964c = r3
            java.lang.Object r5 = r6.B(r5, r2, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            java.lang.Throwable r6 = L5.s.e(r5)
            if (r6 != 0) goto L64
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            com.stripe.android.googlepaylauncher.h$f$b r6 = new com.stripe.android.googlepaylauncher.h$f$b
            r6.<init>(r5)
            goto L75
        L64:
            com.stripe.android.googlepaylauncher.h$f$c r5 = new com.stripe.android.googlepaylauncher.h$f$c
            boolean r0 = r6 instanceof t2.C3780a
            if (r0 == 0) goto L6c
            r3 = 3
            goto L71
        L6c:
            boolean r0 = r6 instanceof t2.C3785f
            if (r0 == 0) goto L71
            r3 = 2
        L71:
            r5.<init>(r6, r3)
            r6 = r5
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.j.b(s0.i, P5.d):java.lang.Object");
    }

    public final C3073m.e c(GooglePayPaymentMethodLauncherContractV2.a args) {
        AbstractC3159y.i(args, "args");
        return new C3073m.e(args.e(), C3073m.e.c.f33033c, args.c().i(), args.i(), Long.valueOf(args.b()), args.f(), C3073m.e.a.f33027b);
    }

    public final InterfaceC3349K d() {
        return this.f23958i;
    }

    public final boolean e() {
        return AbstractC3159y.d(this.f23956g.get("has_launched"), Boolean.TRUE);
    }

    public final Object f(P5.d dVar) {
        return AbstractC3360h.u(this.f23955f.isReady(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.j.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.j$d r0 = (com.stripe.android.googlepaylauncher.j.d) r0
            int r1 = r0.f23968d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23968d = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.j$d r0 = new com.stripe.android.googlepaylauncher.j$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23966b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23968d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r6)
            goto L76
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f23965a
            com.stripe.android.googlepaylauncher.j r2 = (com.stripe.android.googlepaylauncher.j) r2
            L5.t.b(r6)
            goto L4b
        L3c:
            L5.t.b(r6)
            r0.f23965a = r5
            r0.f23968d = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L77
            s0.m r6 = r2.f23950a
            org.json.JSONObject r2 = r2.a()
            java.lang.String r2 = r2.toString()
            s0.j r2 = s0.C3720j.s(r2)
            com.google.android.gms.tasks.Task r6 = r6.t(r2)
            java.lang.String r2 = "loadPaymentData(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r6, r2)
            r2 = 0
            r0.f23965a = r2
            r0.f23968d = r3
            java.lang.Object r6 = I2.i.b(r6, r2, r0, r4, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.j.g(P5.d):java.lang.Object");
    }

    public final void h(boolean z8) {
        this.f23956g.set("has_launched", Boolean.valueOf(z8));
    }

    public final void i(h.f result) {
        AbstractC3159y.i(result, "result");
        this.f23957h.setValue(result);
    }
}
