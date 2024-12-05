package H3;

import L5.I;
import L5.s;
import X5.n;
import b3.v;
import e3.m;
import i6.M;
import j2.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import x2.j;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final m f3502a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f3503b;

    /* renamed from: c, reason: collision with root package name */
    private final P5.g f3504c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3505a;

        /* renamed from: c, reason: collision with root package name */
        int f3507c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3505a = obj;
            this.f3507c |= Integer.MIN_VALUE;
            Object e8 = g.this.e(null, null, this);
            if (e8 == Q5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f3508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f3509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f3510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f3511d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar, g gVar, Throwable th, P5.d dVar) {
            super(2, dVar);
            this.f3509b = vVar;
            this.f3510c = gVar;
            this.f3511d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f3509b, this.f3510c, this.f3511d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f3508a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                L5.t.b(r6)
                L5.s r6 = (L5.s) r6
                java.lang.Object r6 = r6.k()
                goto L95
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                L5.t.b(r6)
                L5.s r6 = (L5.s) r6
                java.lang.Object r6 = r6.k()
                goto L57
            L2b:
                L5.t.b(r6)
                b3.v r6 = r5.f3509b
                boolean r1 = r6 instanceof b3.v.b
                java.lang.String r4 = "payment_method"
                if (r1 == 0) goto L70
                H3.g r6 = r5.f3510c
                e3.m r6 = H3.g.d(r6)
                b3.v r1 = r5.f3509b
                b3.v$b r1 = (b3.v.b) r1
                java.lang.String r1 = r1.d()
                H3.g r2 = r5.f3510c
                x2.j$c r2 = H3.g.c(r2)
                java.util.List r4 = M5.AbstractC1246t.e(r4)
                r5.f3508a = r3
                java.lang.Object r6 = r6.y(r1, r2, r4, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                java.lang.Throwable r0 = r5.f3511d
                boolean r1 = L5.s.h(r6)
                if (r1 == 0) goto L6b
                com.stripe.android.model.n r6 = (com.stripe.android.model.n) r6
                com.stripe.android.model.j$a r1 = com.stripe.android.model.j.f24270j
                com.stripe.android.model.StripeIntent r6 = H3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            L6b:
                java.lang.Object r6 = L5.s.b(r6)
                goto Lbe
            L70:
                boolean r1 = r6 instanceof b3.v.c
                if (r1 == 0) goto Lae
                H3.g r6 = r5.f3510c
                e3.m r6 = H3.g.d(r6)
                b3.v r1 = r5.f3509b
                b3.v$c r1 = (b3.v.c) r1
                java.lang.String r1 = r1.d()
                H3.g r3 = r5.f3510c
                x2.j$c r3 = H3.g.c(r3)
                java.util.List r4 = M5.AbstractC1246t.e(r4)
                r5.f3508a = r2
                java.lang.Object r6 = r6.h(r1, r3, r4, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                java.lang.Throwable r0 = r5.f3511d
                boolean r1 = L5.s.h(r6)
                if (r1 == 0) goto La9
                com.stripe.android.model.u r6 = (com.stripe.android.model.u) r6
                com.stripe.android.model.j$a r1 = com.stripe.android.model.j.f24270j
                com.stripe.android.model.StripeIntent r6 = H3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            La9:
                java.lang.Object r6 = L5.s.b(r6)
                goto Lbe
            Lae:
                boolean r6 = r6 instanceof b3.v.a
                if (r6 == 0) goto Lc3
                L5.s$a r6 = L5.s.f6511b
                java.lang.Throwable r6 = r5.f3511d
                java.lang.Object r6 = L5.t.a(r6)
                java.lang.Object r6 = L5.s.b(r6)
            Lbe:
                L5.s r6 = L5.s.a(r6)
                return r6
            Lc3:
                L5.p r6 = new L5.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: H3.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3512a;

        /* renamed from: b, reason: collision with root package name */
        Object f3513b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3514c;

        /* renamed from: e, reason: collision with root package name */
        int f3516e;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3514c = obj;
            this.f3516e |= Integer.MIN_VALUE;
            Object a8 = g.this.a(null, null, null, null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    public g(m stripeRepository, I5.a lazyPaymentConfig, P5.g workContext) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3159y.i(workContext, "workContext");
        this.f3502a = stripeRepository;
        this.f3503b = lazyPaymentConfig;
        this.f3504c = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(b3.v r6, java.lang.Throwable r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof H3.g.a
            if (r0 == 0) goto L13
            r0 = r8
            H3.g$a r0 = (H3.g.a) r0
            int r1 = r0.f3507c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3507c = r1
            goto L18
        L13:
            H3.g$a r0 = new H3.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3505a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3507c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r8)
            P5.g r8 = r5.f3504c
            H3.g$b r2 = new H3.g$b
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f3507c = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            L5.s r8 = (L5.s) r8
            java.lang.Object r6 = r8.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.g.e(b3.v, java.lang.Throwable, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c f() {
        return new j.c(((r) this.f3503b.get()).e(), ((r) this.f3503b.get()).f(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // H3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.u.l r6, com.stripe.android.paymentsheet.u.i r7, java.util.List r8, java.lang.String r9, P5.d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof H3.g.c
            if (r0 == 0) goto L13
            r0 = r10
            H3.g$c r0 = (H3.g.c) r0
            int r1 = r0.f3516e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3516e = r1
            goto L18
        L13:
            H3.g$c r0 = new H3.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3514c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3516e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r6 = r10.k()
            goto L7b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f3513b
            b3.v r6 = (b3.v) r6
            java.lang.Object r7 = r0.f3512a
            H3.g r7 = (H3.g) r7
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r8 = r10.k()
            goto L67
        L4c:
            L5.t.b(r10)
            b3.v r6 = H3.f.c(r6, r7, r8, r9)
            e3.m r7 = r5.f3502a
            x2.j$c r8 = r5.f()
            r0.f3512a = r5
            r0.f3513b = r6
            r0.f3516e = r4
            java.lang.Object r8 = r7.w(r6, r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r7 = r5
        L67:
            java.lang.Throwable r9 = L5.s.e(r8)
            if (r9 == 0) goto L7c
            r8 = 0
            r0.f3512a = r8
            r0.f3513b = r8
            r0.f3516e = r3
            java.lang.Object r6 = r7.e(r6, r9, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r8 = r6
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.g.a(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$i, java.util.List, java.lang.String, P5.d):java.lang.Object");
    }
}
