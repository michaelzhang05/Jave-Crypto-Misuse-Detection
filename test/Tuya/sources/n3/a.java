package N3;

import L5.t;
import N3.c;
import X5.n;
import e3.m;
import i6.AbstractC2829k;
import i6.I;
import i6.InterfaceC2855x0;
import i6.M;
import j2.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.v;

/* loaded from: classes4.dex */
public final class a implements N3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f7177a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f7178b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f7179c;

    /* renamed from: d, reason: collision with root package name */
    private final I f7180d;

    /* renamed from: e, reason: collision with root package name */
    private int f7181e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2855x0 f7182f;

    /* renamed from: g, reason: collision with root package name */
    private final v f7183g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f7184h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0152a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7185a;

        /* renamed from: c, reason: collision with root package name */
        int f7187c;

        C0152a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7185a = obj;
            this.f7187c |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f7188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.f7188a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f7188a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f7189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.f7189a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f7189a.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7190a;

        /* renamed from: b, reason: collision with root package name */
        Object f7191b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7192c;

        /* renamed from: e, reason: collision with root package name */
        int f7194e;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7192c = obj;
            this.f7194e |= Integer.MIN_VALUE;
            return a.this.g(false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7195a;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f7195a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f7195a = 1;
                if (a.h(aVar, false, this, 1, null) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    public a(m stripeRepository, I5.a paymentConfigProvider, c.a config, I dispatcher) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(dispatcher, "dispatcher");
        this.f7177a = stripeRepository;
        this.f7178b = paymentConfigProvider;
        this.f7179c = config;
        this.f7180d = dispatcher;
        v a8 = AbstractC3351M.a(null);
        this.f7183g = a8;
        this.f7184h = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof N3.a.C0152a
            if (r0 == 0) goto L14
            r0 = r9
            N3.a$a r0 = (N3.a.C0152a) r0
            int r1 = r0.f7187c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7187c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            N3.a$a r0 = new N3.a$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f7185a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r5.f7187c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r9 = r9.k()
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            L5.t.b(r9)
            I5.a r9 = r8.f7178b
            java.lang.Object r9 = r9.get()
            j2.r r9 = (j2.r) r9
            e3.m r1 = r8.f7177a
            N3.c$a r3 = r8.f7179c
            java.lang.String r3 = r3.a()
            x2.j$c r4 = new x2.j$c
            N3.a$b r6 = new N3.a$b
            r6.<init>(r9)
            N3.a$c r7 = new N3.a$c
            r7.<init>(r9)
            r4.<init>(r6, r7)
            r5.f7187c = r2
            r9 = 0
            r6 = 4
            r7 = 0
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = e3.m.a.b(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L6a
            return r0
        L6a:
            boolean r0 = L5.s.g(r9)
            r1 = 0
            if (r0 == 0) goto L72
            r9 = r1
        L72:
            com.stripe.android.model.n r9 = (com.stripe.android.model.n) r9
            if (r9 == 0) goto L7a
            com.stripe.android.model.StripeIntent$Status r1 = r9.getStatus()
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.a.f(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r8, P5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof N3.a.d
            if (r0 == 0) goto L13
            r0 = r9
            N3.a$d r0 = (N3.a.d) r0
            int r1 = r0.f7194e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7194e = r1
            goto L18
        L13:
            N3.a$d r0 = new N3.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f7192c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f7194e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f7190a
            N3.a r8 = (N3.a) r8
            L5.t.b(r9)
            goto L91
        L40:
            java.lang.Object r8 = r0.f7191b
            l6.v r8 = (l6.v) r8
            java.lang.Object r2 = r0.f7190a
            N3.a r2 = (N3.a) r2
            L5.t.b(r9)
            goto L70
        L4c:
            L5.t.b(r9)
            if (r8 != 0) goto L5b
            int r8 = r7.f7181e
            N3.c$a r9 = r7.f7179c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
        L5b:
            int r8 = r7.f7181e
            int r8 = r8 + r6
            r7.f7181e = r8
            l6.v r8 = r7.f7183g
            r0.f7190a = r7
            r0.f7191b = r8
            r0.f7194e = r6
            java.lang.Object r9 = r7.f(r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r2 = r7
        L70:
            r8.setValue(r9)
            int r8 = r2.f7181e
            N3.c$a r9 = r2.f7179c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
            int r8 = r2.f7181e
            long r8 = N3.b.a(r8)
            r0.f7190a = r2
            r0.f7191b = r5
            r0.f7194e = r4
            java.lang.Object r8 = i6.X.c(r8, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r8 = r2
        L91:
            r0.f7190a = r5
            r0.f7194e = r3
            r9 = 0
            java.lang.Object r8 = h(r8, r9, r0, r6, r5)
            if (r8 != r1) goto L9d
            return r1
        L9d:
            L5.I r8 = L5.I.f6487a
            return r8
        La0:
            L5.I r8 = L5.I.f6487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.a.g(boolean, P5.d):java.lang.Object");
    }

    static /* synthetic */ Object h(a aVar, boolean z8, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return aVar.g(z8, dVar);
    }

    @Override // N3.c
    public Object a(P5.d dVar) {
        return f(dVar);
    }

    @Override // N3.c
    public void b(M scope) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(scope, "scope");
        d8 = AbstractC2829k.d(scope, this.f7180d, null, new e(null), 2, null);
        this.f7182f = d8;
    }

    @Override // N3.c
    public void c() {
        InterfaceC2855x0 interfaceC2855x0 = this.f7182f;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        this.f7182f = null;
    }

    @Override // N3.c
    public InterfaceC3349K getState() {
        return this.f7184h;
    }
}
