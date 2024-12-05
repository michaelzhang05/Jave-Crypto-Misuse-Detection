package com.stripe.android.payments.bankaccount.ui;

import L5.I;
import L5.t;
import X5.n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.a;
import e6.InterfaceC2643c;
import h3.AbstractC2753h;
import i3.C2778a;
import i3.C2779b;
import i3.C2780c;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3340B;
import l6.u;
import l6.z;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final C0548b f25134i = new C0548b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f25135j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final CollectBankAccountContract.a f25136a;

    /* renamed from: b, reason: collision with root package name */
    private final u f25137b;

    /* renamed from: c, reason: collision with root package name */
    private final C2779b f25138c;

    /* renamed from: d, reason: collision with root package name */
    private final C2778a f25139d;

    /* renamed from: e, reason: collision with root package name */
    private final C2780c f25140e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f25141f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3684d f25142g;

    /* renamed from: h, reason: collision with root package name */
    private final z f25143h;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25144a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25144a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f25144a = 1;
                if (bVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0548b {
        private C0548b() {
        }

        public /* synthetic */ C0548b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f25146a;

        public c(Function0 argsSupplier) {
            AbstractC3159y.i(argsSupplier, "argsSupplier");
            this.f25146a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            b a8 = AbstractC2753h.a().a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(A2.b.a(extras)).d(AbstractC3340B.b(0, 0, null, 7, null)).c((CollectBankAccountContract.a) this.f25146a.invoke()).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f25147a;

        /* renamed from: b, reason: collision with root package name */
        int f25148b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f25150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FinancialConnectionsSession financialConnectionsSession, P5.d dVar) {
            super(2, dVar);
            this.f25150d = financialConnectionsSession;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f25150d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25151a;

        /* renamed from: b, reason: collision with root package name */
        Object f25152b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25153c;

        /* renamed from: e, reason: collision with root package name */
        int f25155e;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25153c = obj;
            this.f25155e |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult.Completed f25156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
            super(1);
            this.f25156a = completed;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, null, new c.b(this.f25156a.getPaymentMethodId(), this.f25156a.getLast4(), this.f25156a.getBankName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f25157a;

        /* renamed from: b, reason: collision with root package name */
        int f25158b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f25160d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, P5.d dVar) {
            super(2, dVar);
            this.f25160d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f25160d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r6.f25158b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                L5.t.b(r7)
                goto L93
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f25157a
                L5.t.b(r7)
                goto L70
            L24:
                L5.t.b(r7)
                L5.s r7 = (L5.s) r7
                java.lang.Object r7 = r7.k()
            L2d:
                r1 = r7
                goto L5d
            L2f:
                L5.t.b(r7)
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r7 = com.stripe.android.payments.bankaccount.ui.b.g(r7)
                java.lang.String r7 = r7.d()
                if (r7 != 0) goto L44
                r7 = 0
                java.lang.Object r7 = L5.s.b(r7)
                goto L2d
            L44:
                com.stripe.android.payments.bankaccount.ui.b r1 = com.stripe.android.payments.bankaccount.ui.b.this
                i3.c r1 = com.stripe.android.payments.bankaccount.ui.b.j(r1)
                com.stripe.android.payments.bankaccount.ui.b r5 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r5 = com.stripe.android.payments.bankaccount.ui.b.g(r5)
                java.lang.String r5 = r5.f()
                r6.f25158b = r4
                java.lang.Object r7 = r1.a(r5, r7, r6)
                if (r7 != r0) goto L2d
                return r0
            L5d:
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                java.lang.Throwable r4 = L5.s.e(r1)
                if (r4 == 0) goto L70
                r6.f25157a = r1
                r6.f25158b = r3
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.c(r7, r4, r6)
                if (r7 != r0) goto L70
                return r0
            L70:
                kotlin.jvm.functions.Function1 r7 = r6.f25160d
                com.stripe.android.payments.bankaccount.ui.b r3 = com.stripe.android.payments.bankaccount.ui.b.this
                boolean r4 = L5.s.h(r1)
                if (r4 == 0) goto L93
                r4 = r1
                com.stripe.android.model.StripeIntent r4 = (com.stripe.android.model.StripeIntent) r4
                java.lang.Object r7 = r7.invoke(r4)
                com.stripe.android.payments.bankaccount.navigation.c r7 = (com.stripe.android.payments.bankaccount.navigation.c) r7
                com.stripe.android.payments.bankaccount.navigation.d$b r4 = new com.stripe.android.payments.bankaccount.navigation.d$b
                r4.<init>(r7)
                r6.f25157a = r1
                r6.f25158b = r2
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.e(r3, r4, r6)
                if (r7 != r0) goto L93
                return r0
            L93:
                L5.I r7 = L5.I.f6487a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f25161a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FinancialConnectionsSession financialConnectionsSession) {
            super(1);
            this.f25161a = financialConnectionsSession;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, new c.C0545c(this.f25161a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetResult f25163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FinancialConnectionsSheetResult financialConnectionsSheetResult, b bVar, P5.d dVar) {
            super(2, dVar);
            this.f25163b = financialConnectionsSheetResult;
            this.f25164c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f25163b, this.f25164c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            int i8 = this.f25162a;
            if (i8 == 0 || i8 == 1 || i8 == 2) {
                t.b(obj);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult f25166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult, b bVar, P5.d dVar) {
            super(2, dVar);
            this.f25166b = financialConnectionsSheetInstantDebitsResult;
            this.f25167c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f25166b, this.f25167c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            int i8 = this.f25165a;
            if (i8 == 0 || i8 == 1 || i8 == 2) {
                t.b(obj);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(CollectBankAccountContract.a args, u _viewEffect, C2779b createFinancialConnectionsSession, C2778a attachFinancialConnectionsSession, C2780c retrieveStripeIntent, SavedStateHandle savedStateHandle, InterfaceC3684d logger) {
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(_viewEffect, "_viewEffect");
        AbstractC3159y.i(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        AbstractC3159y.i(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        AbstractC3159y.i(retrieveStripeIntent, "retrieveStripeIntent");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(logger, "logger");
        this.f25136a = args;
        this.f25137b = _viewEffect;
        this.f25138c = createFinancialConnectionsSession;
        this.f25139d = attachFinancialConnectionsSession;
        this.f25140e = retrieveStripeIntent;
        this.f25141f = savedStateHandle;
        this.f25142g = logger;
        this.f25143h = _viewEffect;
        if (!r()) {
            AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(FinancialConnectionsSession financialConnectionsSession) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new d(financialConnectionsSession, null), 3, null);
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
    public final java.lang.Object l(P5.d r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.l(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Throwable th, P5.d dVar) {
        this.f25142g.a("Error", new Exception(th));
        Object p8 = p(new d.c(th), dVar);
        if (p8 == Q5.b.e()) {
            return p8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
        o(new f(completed));
    }

    private final void o(Function1 function1) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new g(function1, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(com.stripe.android.payments.bankaccount.navigation.d dVar, P5.d dVar2) {
        Object emit = this.f25137b.emit(new a.C0547a(dVar), dVar2);
        if (emit == Q5.b.e()) {
            return emit;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(FinancialConnectionsSession financialConnectionsSession) {
        o(new h(financialConnectionsSession));
    }

    private final boolean r() {
        return AbstractC3159y.d(this.f25141f.get("key_has_launched"), Boolean.TRUE);
    }

    private final void v(boolean z8) {
        this.f25141f.set("key_has_launched", Boolean.valueOf(z8));
    }

    public final z s() {
        return this.f25143h;
    }

    public final void t(FinancialConnectionsSheetResult result) {
        AbstractC3159y.i(result, "result");
        v(false);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new i(result, this, null), 3, null);
    }

    public final void u(FinancialConnectionsSheetInstantDebitsResult result) {
        AbstractC3159y.i(result, "result");
        v(false);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new j(result, this, null), 3, null);
    }
}
