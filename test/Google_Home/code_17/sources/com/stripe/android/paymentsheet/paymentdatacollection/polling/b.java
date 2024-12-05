package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import O5.InterfaceC1351g;
import O5.t;
import Q3.c;
import a6.InterfaceC1668n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import h6.InterfaceC2963c;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3232a;
import kotlin.jvm.internal.InterfaceC3249s;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.I;
import l6.M;
import l6.X;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final e f27352a;

    /* renamed from: b, reason: collision with root package name */
    private final Q3.c f27353b;

    /* renamed from: c, reason: collision with root package name */
    private final I3.h f27354c;

    /* renamed from: d, reason: collision with root package name */
    private final I f27355d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f27356e;

    /* renamed from: f, reason: collision with root package name */
    private final w f27357f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f27358g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27359a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, S5.d dVar) {
            super(2, dVar);
            this.f27361c = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f27361c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27359a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                long j8 = this.f27361c;
                this.f27359a = 1;
                if (bVar.m(j8, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0641b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27362a;

        C0641b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0641b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27362a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f27362a = 1;
                if (bVar.n(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0641b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j8, b bVar, S5.d dVar) {
            super(2, dVar);
            this.f27365b = j8;
            this.f27366c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f27365b, this.f27366c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27364a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                long j8 = this.f27365b;
                this.f27364a = 1;
                if (X.c(j8, this) == e8) {
                    return e8;
                }
            }
            b bVar = this.f27366c;
            this.f27364a = 2;
            if (bVar.l(this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27367a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27368b;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f27368b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            M m8;
            Object e8 = T5.b.e();
            int i8 = this.f27367a;
            if (i8 != 0) {
                if (i8 == 1) {
                    m8 = (M) this.f27368b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m9 = (M) this.f27368b;
                long c8 = b.this.f27352a.c();
                this.f27368b = m9;
                this.f27367a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
                m8 = m9;
            }
            b.this.f27353b.a(m8);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f27370a;

        /* renamed from: b, reason: collision with root package name */
        private final long f27371b;

        /* renamed from: c, reason: collision with root package name */
        private final long f27372c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27373d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27374e;

        public /* synthetic */ e(String str, long j8, long j9, int i8, int i9, AbstractC3247p abstractC3247p) {
            this(str, j8, j9, i8, i9);
        }

        public final String a() {
            return this.f27370a;
        }

        public final int b() {
            return this.f27374e;
        }

        public final long c() {
            return this.f27372c;
        }

        public final int d() {
            return this.f27373d;
        }

        public final long e() {
            return this.f27371b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3255y.d(this.f27370a, eVar.f27370a) && C3225a.j(this.f27371b, eVar.f27371b) && C3225a.j(this.f27372c, eVar.f27372c) && this.f27373d == eVar.f27373d && this.f27374e == eVar.f27374e;
        }

        public int hashCode() {
            return (((((((this.f27370a.hashCode() * 31) + C3225a.A(this.f27371b)) * 31) + C3225a.A(this.f27372c)) * 31) + this.f27373d) * 31) + this.f27374e;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f27370a + ", timeLimit=" + C3225a.N(this.f27371b) + ", initialDelay=" + C3225a.N(this.f27372c) + ", maxAttempts=" + this.f27373d + ", ctaText=" + this.f27374e + ")";
        }

        private e(String clientSecret, long j8, long j9, int i8, int i9) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            this.f27370a = clientSecret;
            this.f27371b = j8;
            this.f27372c = j9;
            this.f27373d = i8;
            this.f27374e = i9;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f27375a;

        public f(Function0 argsSupplier) {
            AbstractC3255y.i(argsSupplier, "argsSupplier");
            this.f27375a = argsSupplier;
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
            e eVar = (e) this.f27375a.invoke();
            b a8 = J3.b.a().b(D2.b.a(extras)).a(new c.a(eVar.a(), eVar.d())).c(C3347b0.b()).build().a().b(eVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27376a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27377b;

        /* renamed from: d, reason: collision with root package name */
        int f27379d;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27377b = obj;
            this.f27379d |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3707g {
        h() {
        }

        public final Object a(long j8, S5.d dVar) {
            Object value;
            w wVar = b.this.f27357f;
            do {
                value = wVar.getValue();
            } while (!wVar.c(value, I3.f.b((I3.f) value, j8, 0, null, 6, null)));
            return O5.I.f8278a;
        }

        @Override // o6.InterfaceC3707g
        public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
            return a(((C3225a) obj).P(), dVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f27381a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f27382a;

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0642a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f27383a;

                /* renamed from: b, reason: collision with root package name */
                int f27384b;

                public C0642a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27383a = obj;
                    this.f27384b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g) {
                this.f27382a = interfaceC3707g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0642a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0642a) r0
                    int r1 = r0.f27384b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27384b = r1
                    goto L18
                L13:
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f27383a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f27384b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    o6.g r6 = r4.f27382a
                    com.stripe.android.model.StripeIntent$Status r5 = (com.stripe.android.model.StripeIntent.Status) r5
                    if (r5 == 0) goto L40
                    I3.e r5 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b(r5)
                    if (r5 != 0) goto L42
                L40:
                    I3.e r5 = I3.e.f4032a
                L42:
                    r0.f27384b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3706f interfaceC3706f) {
            this.f27381a = interfaceC3706f;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f27381a.collect(new a(interfaceC3707g), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27386a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27387b;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I3.e eVar, S5.d dVar) {
            return ((j) create(eVar, dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            j jVar = new j(dVar);
            jVar.f27387b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f27386a == 0) {
                t.b(obj);
                if (((I3.e) this.f27387b) == I3.e.f4034c) {
                    b.this.f27353b.c();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class k implements InterfaceC3707g, InterfaceC3249s {
        k() {
        }

        @Override // o6.InterfaceC3707g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(I3.e eVar, S5.d dVar) {
            Object o8 = b.o(b.this, eVar, dVar);
            if (o8 == T5.b.e()) {
                return o8;
            }
            return O5.I.f8278a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3707g) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3232a(2, b.this, b.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27390a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27391b;

        /* renamed from: d, reason: collision with root package name */
        int f27393d;

        l(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27391b = obj;
            this.f27393d |= Integer.MIN_VALUE;
            return b.this.q(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27394a;

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27394a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long c8 = b.this.f27352a.c();
                this.f27394a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
            }
            b.this.f27353b.a(ViewModelKt.getViewModelScope(b.this));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public b(e args, Q3.c poller, I3.h timeProvider, I dispatcher, SavedStateHandle savedStateHandle) {
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(poller, "poller");
        AbstractC3255y.i(timeProvider, "timeProvider");
        AbstractC3255y.i(dispatcher, "dispatcher");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        this.f27352a = args;
        this.f27353b = poller;
        this.f27354c = timeProvider;
        this.f27355d = dispatcher;
        this.f27356e = savedStateHandle;
        w a8 = AbstractC3700N.a(new I3.f(args.e(), args.b(), null, 4, null));
        this.f27357f = a8;
        this.f27358g = a8;
        long i8 = i();
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new a(i8, null), 2, null);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new C0641b(null), 2, null);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new c(i8, this, null), 2, null);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new d(null), 2, null);
    }

    private final long i() {
        Long l8 = (Long) this.f27356e.get("KEY_CURRENT_POLLING_START_TIME");
        if (l8 == null) {
            this.f27356e.set("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.f27354c.a()));
        }
        if (l8 != null) {
            return ((C3225a) R5.a.c(C3225a.e(AbstractC3227c.t((l8.longValue() + C3225a.o(this.f27352a.e())) - this.f27354c.a(), EnumC3228d.f34140d)), C3225a.e(C3225a.f34131b.b()))).P();
        }
        return this.f27352a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g) r0
            int r1 = r0.f27379d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27379d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27377b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27379d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f27376a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r2 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r2
            O5.t.b(r8)
            goto L59
        L3c:
            O5.t.b(r8)
            Q3.c r8 = r7.f27353b
            r8.c()
            k6.a$a r8 = k6.C3225a.f34131b
            r8 = 3
            k6.d r2 = k6.EnumC3228d.f34141e
            long r5 = k6.AbstractC3227c.s(r8, r2)
            r0.f27376a = r7
            r0.f27379d = r4
            java.lang.Object r8 = l6.X.c(r5, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            r8 = 0
            r0.f27376a = r8
            r0.f27379d = r3
            java.lang.Object r8 = r2.q(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(long j8, S5.d dVar) {
        Object collect = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.a(j8).collect(new h(), dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(S5.d dVar) {
        Object collect = AbstractC3708h.G(new i(this.f27353b.getState()), new j(null)).collect(new k(), dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object o(b bVar, I3.e eVar, S5.d dVar) {
        bVar.s(eVar);
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l) r0
            int r1 = r0.f27393d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27393d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27391b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27393d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27390a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r0
            O5.t.b(r9)
            goto L46
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            O5.t.b(r9)
            Q3.c r9 = r8.f27353b
            r0.f27390a = r8
            r0.f27393d = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            r0 = r8
        L46:
            com.stripe.android.model.StripeIntent$Status r9 = (com.stripe.android.model.StripeIntent.Status) r9
            com.stripe.android.model.StripeIntent$Status r1 = com.stripe.android.model.StripeIntent.Status.f25209h
            if (r9 != r1) goto L67
            o6.w r9 = r0.f27357f
        L4e:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            I3.f r1 = (I3.f) r1
            I3.e r5 = I3.e.f4033b
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            I3.f r1 = I3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.c(r0, r1)
            if (r0 == 0) goto L4e
            goto L81
        L67:
            o6.w r9 = r0.f27357f
        L69:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            I3.f r1 = (I3.f) r1
            I3.e r5 = I3.e.f4034c
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            I3.f r1 = I3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.c(r0, r1)
            if (r0 == 0) goto L69
        L81:
            O5.I r9 = O5.I.f8278a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.q(S5.d):java.lang.Object");
    }

    private final void s(I3.e eVar) {
        Object value;
        w wVar = this.f27357f;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, I3.f.b((I3.f) value, 0L, 0, eVar, 3, null)));
    }

    public final InterfaceC3698L j() {
        return this.f27358g;
    }

    public final void k() {
        Object value;
        w wVar = this.f27357f;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, I3.f.b((I3.f) value, 0L, 0, I3.e.f4035d, 3, null)));
        this.f27353b.c();
    }

    public final void p() {
        this.f27353b.c();
    }

    public final void r() {
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), this.f27355d, null, new m(null), 2, null);
    }
}
