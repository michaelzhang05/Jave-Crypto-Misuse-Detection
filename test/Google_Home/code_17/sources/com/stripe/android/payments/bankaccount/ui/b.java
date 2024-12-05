package com.stripe.android.payments.bankaccount.ui;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.a;
import h6.InterfaceC2963c;
import k3.AbstractC3220h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l3.C3313a;
import l3.C3314b;
import l3.C3315c;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3689C;
import o6.InterfaceC3687A;
import o6.v;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final C0544b f26189i = new C0544b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f26190j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final CollectBankAccountContract.a f26191a;

    /* renamed from: b, reason: collision with root package name */
    private final v f26192b;

    /* renamed from: c, reason: collision with root package name */
    private final C3314b f26193c;

    /* renamed from: d, reason: collision with root package name */
    private final C3313a f26194d;

    /* renamed from: e, reason: collision with root package name */
    private final C3315c f26195e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f26196f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4057d f26197g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3687A f26198h;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26199a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26199a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f26199a = 1;
                if (bVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0544b {
        private C0544b() {
        }

        public /* synthetic */ C0544b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26201a;

        public c(Function0 argsSupplier) {
            AbstractC3255y.i(argsSupplier, "argsSupplier");
            this.f26201a = argsSupplier;
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
            b a8 = AbstractC3220h.a().a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(D2.b.a(extras)).d(AbstractC3689C.b(0, 0, null, 7, null)).c((CollectBankAccountContract.a) this.f26201a.invoke()).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f26202a;

        /* renamed from: b, reason: collision with root package name */
        int f26203b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f26205d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FinancialConnectionsSession financialConnectionsSession, S5.d dVar) {
            super(2, dVar);
            this.f26205d = financialConnectionsSession;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f26205d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26206a;

        /* renamed from: b, reason: collision with root package name */
        Object f26207b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26208c;

        /* renamed from: e, reason: collision with root package name */
        int f26210e;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26208c = obj;
            this.f26210e |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult.Completed f26211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
            super(1);
            this.f26211a = completed;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, null, new c.b(this.f26211a.getPaymentMethodId(), this.f26211a.getLast4(), this.f26211a.getBankName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f26212a;

        /* renamed from: b, reason: collision with root package name */
        int f26213b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26215d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, S5.d dVar) {
            super(2, dVar);
            this.f26215d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f26215d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r6.f26213b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                O5.t.b(r7)
                goto L93
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f26212a
                O5.t.b(r7)
                goto L70
            L24:
                O5.t.b(r7)
                O5.s r7 = (O5.s) r7
                java.lang.Object r7 = r7.j()
            L2d:
                r1 = r7
                goto L5d
            L2f:
                O5.t.b(r7)
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r7 = com.stripe.android.payments.bankaccount.ui.b.g(r7)
                java.lang.String r7 = r7.d()
                if (r7 != 0) goto L44
                r7 = 0
                java.lang.Object r7 = O5.s.b(r7)
                goto L2d
            L44:
                com.stripe.android.payments.bankaccount.ui.b r1 = com.stripe.android.payments.bankaccount.ui.b.this
                l3.c r1 = com.stripe.android.payments.bankaccount.ui.b.j(r1)
                com.stripe.android.payments.bankaccount.ui.b r5 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r5 = com.stripe.android.payments.bankaccount.ui.b.g(r5)
                java.lang.String r5 = r5.h()
                r6.f26213b = r4
                java.lang.Object r7 = r1.a(r5, r7, r6)
                if (r7 != r0) goto L2d
                return r0
            L5d:
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                java.lang.Throwable r4 = O5.s.e(r1)
                if (r4 == 0) goto L70
                r6.f26212a = r1
                r6.f26213b = r3
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.c(r7, r4, r6)
                if (r7 != r0) goto L70
                return r0
            L70:
                kotlin.jvm.functions.Function1 r7 = r6.f26215d
                com.stripe.android.payments.bankaccount.ui.b r3 = com.stripe.android.payments.bankaccount.ui.b.this
                boolean r4 = O5.s.h(r1)
                if (r4 == 0) goto L93
                r4 = r1
                com.stripe.android.model.StripeIntent r4 = (com.stripe.android.model.StripeIntent) r4
                java.lang.Object r7 = r7.invoke(r4)
                com.stripe.android.payments.bankaccount.navigation.c r7 = (com.stripe.android.payments.bankaccount.navigation.c) r7
                com.stripe.android.payments.bankaccount.navigation.d$b r4 = new com.stripe.android.payments.bankaccount.navigation.d$b
                r4.<init>(r7)
                r6.f26212a = r1
                r6.f26213b = r2
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.e(r3, r4, r6)
                if (r7 != r0) goto L93
                return r0
            L93:
                O5.I r7 = O5.I.f8278a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f26216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FinancialConnectionsSession financialConnectionsSession) {
            super(1);
            this.f26216a = financialConnectionsSession;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, new c.C0541c(this.f26216a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetResult f26218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f26219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FinancialConnectionsSheetResult financialConnectionsSheetResult, b bVar, S5.d dVar) {
            super(2, dVar);
            this.f26218b = financialConnectionsSheetResult;
            this.f26219c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f26218b, this.f26219c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            int i8 = this.f26217a;
            if (i8 == 0 || i8 == 1 || i8 == 2) {
                t.b(obj);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26220a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult f26221b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f26222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult, b bVar, S5.d dVar) {
            super(2, dVar);
            this.f26221b = financialConnectionsSheetInstantDebitsResult;
            this.f26222c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f26221b, this.f26222c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            int i8 = this.f26220a;
            if (i8 == 0 || i8 == 1 || i8 == 2) {
                t.b(obj);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public b(CollectBankAccountContract.a args, v _viewEffect, C3314b createFinancialConnectionsSession, C3313a attachFinancialConnectionsSession, C3315c retrieveStripeIntent, SavedStateHandle savedStateHandle, InterfaceC4057d logger) {
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(_viewEffect, "_viewEffect");
        AbstractC3255y.i(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        AbstractC3255y.i(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        AbstractC3255y.i(retrieveStripeIntent, "retrieveStripeIntent");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(logger, "logger");
        this.f26191a = args;
        this.f26192b = _viewEffect;
        this.f26193c = createFinancialConnectionsSession;
        this.f26194d = attachFinancialConnectionsSession;
        this.f26195e = retrieveStripeIntent;
        this.f26196f = savedStateHandle;
        this.f26197g = logger;
        this.f26198h = _viewEffect;
        if (!r()) {
            AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(FinancialConnectionsSession financialConnectionsSession) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new d(financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(S5.d r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.l(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Throwable th, S5.d dVar) {
        this.f26197g.a("Error", new Exception(th));
        Object p8 = p(new d.c(th), dVar);
        if (p8 == T5.b.e()) {
            return p8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
        o(new f(completed));
    }

    private final void o(Function1 function1) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new g(function1, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(com.stripe.android.payments.bankaccount.navigation.d dVar, S5.d dVar2) {
        Object emit = this.f26192b.emit(new a.C0543a(dVar), dVar2);
        if (emit == T5.b.e()) {
            return emit;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(FinancialConnectionsSession financialConnectionsSession) {
        o(new h(financialConnectionsSession));
    }

    private final boolean r() {
        return AbstractC3255y.d(this.f26196f.get("key_has_launched"), Boolean.TRUE);
    }

    private final void v(boolean z8) {
        this.f26196f.set("key_has_launched", Boolean.valueOf(z8));
    }

    public final InterfaceC3687A s() {
        return this.f26198h;
    }

    public final void t(FinancialConnectionsSheetResult result) {
        AbstractC3255y.i(result, "result");
        v(false);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new i(result, this, null), 3, null);
    }

    public final void u(FinancialConnectionsSheetInstantDebitsResult result) {
        AbstractC3255y.i(result, "result");
        v(false);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new j(result, this, null), 3, null);
    }
}
