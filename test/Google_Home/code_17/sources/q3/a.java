package Q3;

import O5.t;
import Q3.c;
import a6.InterfaceC1668n;
import h3.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.I;
import l6.InterfaceC3390x0;
import l6.M;
import m2.r;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.w;

/* loaded from: classes4.dex */
public final class a implements Q3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f9137a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f9138b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f9139c;

    /* renamed from: d, reason: collision with root package name */
    private final I f9140d;

    /* renamed from: e, reason: collision with root package name */
    private int f9141e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3390x0 f9142f;

    /* renamed from: g, reason: collision with root package name */
    private final w f9143g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f9144h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0181a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9145a;

        /* renamed from: c, reason: collision with root package name */
        int f9147c;

        C0181a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9145a = obj;
            this.f9147c |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f9148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.f9148a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f9148a.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f9149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.f9149a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f9149a.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9150a;

        /* renamed from: b, reason: collision with root package name */
        Object f9151b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9152c;

        /* renamed from: e, reason: collision with root package name */
        int f9154e;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9152c = obj;
            this.f9154e |= Integer.MIN_VALUE;
            return a.this.g(false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9155a;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f9155a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f9155a = 1;
                if (a.h(aVar, false, this, 1, null) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public a(m stripeRepository, L5.a paymentConfigProvider, c.a config, I dispatcher) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(dispatcher, "dispatcher");
        this.f9137a = stripeRepository;
        this.f9138b = paymentConfigProvider;
        this.f9139c = config;
        this.f9140d = dispatcher;
        w a8 = AbstractC3700N.a(null);
        this.f9143g = a8;
        this.f9144h = a8;
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
    public final java.lang.Object f(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Q3.a.C0181a
            if (r0 == 0) goto L14
            r0 = r9
            Q3.a$a r0 = (Q3.a.C0181a) r0
            int r1 = r0.f9147c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9147c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            Q3.a$a r0 = new Q3.a$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f9145a
            java.lang.Object r0 = T5.b.e()
            int r1 = r5.f9147c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r9 = r9.j()
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            O5.t.b(r9)
            L5.a r9 = r8.f9138b
            java.lang.Object r9 = r9.get()
            m2.r r9 = (m2.r) r9
            h3.m r1 = r8.f9137a
            Q3.c$a r3 = r8.f9139c
            java.lang.String r3 = r3.a()
            A2.j$c r4 = new A2.j$c
            Q3.a$b r6 = new Q3.a$b
            r6.<init>(r9)
            Q3.a$c r7 = new Q3.a$c
            r7.<init>(r9)
            r4.<init>(r6, r7)
            r5.f9147c = r2
            r9 = 0
            r6 = 4
            r7 = 0
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = h3.m.a.b(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L6a
            return r0
        L6a:
            boolean r0 = O5.s.g(r9)
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
        throw new UnsupportedOperationException("Method not decompiled: Q3.a.f(S5.d):java.lang.Object");
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
    public final java.lang.Object g(boolean r8, S5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Q3.a.d
            if (r0 == 0) goto L13
            r0 = r9
            Q3.a$d r0 = (Q3.a.d) r0
            int r1 = r0.f9154e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9154e = r1
            goto L18
        L13:
            Q3.a$d r0 = new Q3.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9152c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f9154e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f9150a
            Q3.a r8 = (Q3.a) r8
            O5.t.b(r9)
            goto L91
        L40:
            java.lang.Object r8 = r0.f9151b
            o6.w r8 = (o6.w) r8
            java.lang.Object r2 = r0.f9150a
            Q3.a r2 = (Q3.a) r2
            O5.t.b(r9)
            goto L70
        L4c:
            O5.t.b(r9)
            if (r8 != 0) goto L5b
            int r8 = r7.f9141e
            Q3.c$a r9 = r7.f9139c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
        L5b:
            int r8 = r7.f9141e
            int r8 = r8 + r6
            r7.f9141e = r8
            o6.w r8 = r7.f9143g
            r0.f9150a = r7
            r0.f9151b = r8
            r0.f9154e = r6
            java.lang.Object r9 = r7.f(r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r2 = r7
        L70:
            r8.setValue(r9)
            int r8 = r2.f9141e
            Q3.c$a r9 = r2.f9139c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
            int r8 = r2.f9141e
            long r8 = Q3.b.a(r8)
            r0.f9150a = r2
            r0.f9151b = r5
            r0.f9154e = r4
            java.lang.Object r8 = l6.X.c(r8, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r8 = r2
        L91:
            r0.f9150a = r5
            r0.f9154e = r3
            r9 = 0
            java.lang.Object r8 = h(r8, r9, r0, r6, r5)
            if (r8 != r1) goto L9d
            return r1
        L9d:
            O5.I r8 = O5.I.f8278a
            return r8
        La0:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.a.g(boolean, S5.d):java.lang.Object");
    }

    static /* synthetic */ Object h(a aVar, boolean z8, S5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return aVar.g(z8, dVar);
    }

    @Override // Q3.c
    public void a(M scope) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(scope, "scope");
        d8 = AbstractC3364k.d(scope, this.f9140d, null, new e(null), 2, null);
        this.f9142f = d8;
    }

    @Override // Q3.c
    public Object b(S5.d dVar) {
        return f(dVar);
    }

    @Override // Q3.c
    public void c() {
        InterfaceC3390x0 interfaceC3390x0 = this.f9142f;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        this.f9142f = null;
    }

    @Override // Q3.c
    public InterfaceC3698L getState() {
        return this.f9144h;
    }
}
