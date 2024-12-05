package K3;

import A2.j;
import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import e3.v;
import h3.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import m2.r;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final m f5105a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f5106b;

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f5107c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5108a;

        /* renamed from: c, reason: collision with root package name */
        int f5110c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5108a = obj;
            this.f5110c |= Integer.MIN_VALUE;
            Object e8 = g.this.e(null, null, this);
            if (e8 == T5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f5111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f5112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f5113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f5114d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar, g gVar, Throwable th, S5.d dVar) {
            super(2, dVar);
            this.f5112b = vVar;
            this.f5113c = gVar;
            this.f5114d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f5112b, this.f5113c, this.f5114d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r5.f5111a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                O5.t.b(r6)
                O5.s r6 = (O5.s) r6
                java.lang.Object r6 = r6.j()
                goto L95
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                O5.t.b(r6)
                O5.s r6 = (O5.s) r6
                java.lang.Object r6 = r6.j()
                goto L57
            L2b:
                O5.t.b(r6)
                e3.v r6 = r5.f5112b
                boolean r1 = r6 instanceof e3.v.b
                java.lang.String r4 = "payment_method"
                if (r1 == 0) goto L70
                K3.g r6 = r5.f5113c
                h3.m r6 = K3.g.d(r6)
                e3.v r1 = r5.f5112b
                e3.v$b r1 = (e3.v.b) r1
                java.lang.String r1 = r1.d()
                K3.g r2 = r5.f5113c
                A2.j$c r2 = K3.g.c(r2)
                java.util.List r4 = P5.AbstractC1378t.e(r4)
                r5.f5111a = r3
                java.lang.Object r6 = r6.i(r1, r2, r4, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                java.lang.Throwable r0 = r5.f5114d
                boolean r1 = O5.s.h(r6)
                if (r1 == 0) goto L6b
                com.stripe.android.model.n r6 = (com.stripe.android.model.n) r6
                com.stripe.android.model.j$a r1 = com.stripe.android.model.j.f25325j
                com.stripe.android.model.StripeIntent r6 = K3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            L6b:
                java.lang.Object r6 = O5.s.b(r6)
                goto Lbe
            L70:
                boolean r1 = r6 instanceof e3.v.c
                if (r1 == 0) goto Lae
                K3.g r6 = r5.f5113c
                h3.m r6 = K3.g.d(r6)
                e3.v r1 = r5.f5112b
                e3.v$c r1 = (e3.v.c) r1
                java.lang.String r1 = r1.d()
                K3.g r3 = r5.f5113c
                A2.j$c r3 = K3.g.c(r3)
                java.util.List r4 = P5.AbstractC1378t.e(r4)
                r5.f5111a = r2
                java.lang.Object r6 = r6.b(r1, r3, r4, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                java.lang.Throwable r0 = r5.f5114d
                boolean r1 = O5.s.h(r6)
                if (r1 == 0) goto La9
                com.stripe.android.model.u r6 = (com.stripe.android.model.u) r6
                com.stripe.android.model.j$a r1 = com.stripe.android.model.j.f25325j
                com.stripe.android.model.StripeIntent r6 = K3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            La9:
                java.lang.Object r6 = O5.s.b(r6)
                goto Lbe
            Lae:
                boolean r6 = r6 instanceof e3.v.a
                if (r6 == 0) goto Lc3
                O5.s$a r6 = O5.s.f8302b
                java.lang.Throwable r6 = r5.f5114d
                java.lang.Object r6 = O5.t.a(r6)
                java.lang.Object r6 = O5.s.b(r6)
            Lbe:
                O5.s r6 = O5.s.a(r6)
                return r6
            Lc3:
                O5.p r6 = new O5.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: K3.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5115a;

        /* renamed from: b, reason: collision with root package name */
        Object f5116b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f5117c;

        /* renamed from: e, reason: collision with root package name */
        int f5119e;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5117c = obj;
            this.f5119e |= Integer.MIN_VALUE;
            Object a8 = g.this.a(null, null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    public g(m stripeRepository, L5.a lazyPaymentConfig, S5.g workContext) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3255y.i(workContext, "workContext");
        this.f5105a = stripeRepository;
        this.f5106b = lazyPaymentConfig;
        this.f5107c = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(e3.v r6, java.lang.Throwable r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof K3.g.a
            if (r0 == 0) goto L13
            r0 = r8
            K3.g$a r0 = (K3.g.a) r0
            int r1 = r0.f5110c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5110c = r1
            goto L18
        L13:
            K3.g$a r0 = new K3.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5108a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5110c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r8)
            S5.g r8 = r5.f5107c
            K3.g$b r2 = new K3.g$b
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f5110c = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            O5.s r8 = (O5.s) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.g.e(e3.v, java.lang.Throwable, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c f() {
        return new j.c(((r) this.f5106b.get()).g(), ((r) this.f5106b.get()).h(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // K3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.u.l r6, com.stripe.android.paymentsheet.u.i r7, java.util.List r8, java.lang.String r9, S5.d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof K3.g.c
            if (r0 == 0) goto L13
            r0 = r10
            K3.g$c r0 = (K3.g.c) r0
            int r1 = r0.f5119e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5119e = r1
            goto L18
        L13:
            K3.g$c r0 = new K3.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5117c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5119e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r6 = r10.j()
            goto L7b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f5116b
            e3.v r6 = (e3.v) r6
            java.lang.Object r7 = r0.f5115a
            K3.g r7 = (K3.g) r7
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r8 = r10.j()
            goto L67
        L4c:
            O5.t.b(r10)
            e3.v r6 = K3.f.c(r6, r7, r8, r9)
            h3.m r7 = r5.f5105a
            A2.j$c r8 = r5.f()
            r0.f5115a = r5
            r0.f5116b = r6
            r0.f5119e = r4
            java.lang.Object r8 = r7.y(r6, r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r7 = r5
        L67:
            java.lang.Throwable r9 = O5.s.e(r8)
            if (r9 == 0) goto L7c
            r8 = 0
            r0.f5115a = r8
            r0.f5116b = r8
            r0.f5119e = r3
            java.lang.Object r6 = r7.e(r6, r9, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r8 = r6
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.g.a(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$i, java.util.List, java.lang.String, S5.d):java.lang.Object");
    }
}
