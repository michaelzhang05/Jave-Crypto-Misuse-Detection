package N2;

import O5.s;
import Q2.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.w;

/* loaded from: classes4.dex */
public final class k implements N2.e {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f7703a;

    /* renamed from: b, reason: collision with root package name */
    private final w f7704b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f7705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7706a;

        /* renamed from: c, reason: collision with root package name */
        int f7708c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7706a = obj;
            this.f7708c |= Integer.MIN_VALUE;
            Object f8 = k.this.f(null, null, this);
            if (f8 == T5.b.e()) {
                return f8;
            }
            return s.a(f8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7709a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(Q2.b bVar) {
            O2.b c8;
            InterfaceC3698L h8;
            if (bVar == null || (c8 = bVar.c()) == null || (h8 = c8.h()) == null) {
                return y4.g.n(null);
            }
            return h8;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7710a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(R2.b bVar) {
            if (bVar != null) {
                return bVar.e();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7711a;

        /* renamed from: c, reason: collision with root package name */
        int f7713c;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7711a = obj;
            this.f7713c |= Integer.MIN_VALUE;
            Object c8 = k.this.c(null, this);
            if (c8 == T5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7714a;

        /* renamed from: c, reason: collision with root package name */
        int f7716c;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7714a = obj;
            this.f7716c |= Integer.MIN_VALUE;
            Object a8 = k.this.a(null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    public k(b.a linkComponentBuilder) {
        AbstractC3255y.i(linkComponentBuilder, "linkComponentBuilder");
        this.f7703a = linkComponentBuilder;
        w a8 = AbstractC3700N.a(null);
        this.f7704b = a8;
        this.f7705c = y4.g.m(y4.g.l(a8, b.f7709a), c.f7710a);
    }

    private final Q2.b g(N2.d dVar) {
        Q2.b bVar = (Q2.b) this.f7704b.getValue();
        if (bVar != null) {
            if (!AbstractC3255y.d(bVar.a(), dVar)) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        Q2.b build = this.f7703a.a(dVar).build();
        this.f7704b.setValue(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(N2.d r5, W2.m r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof N2.k.e
            if (r0 == 0) goto L13
            r0 = r7
            N2.k$e r0 = (N2.k.e) r0
            int r1 = r0.f7716c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7716c = r1
            goto L18
        L13:
            N2.k$e r0 = new N2.k$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7714a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7716c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r7)
            Q2.b r5 = r4.g(r5)
            O2.b r5 = r5.c()
            r0.f7716c = r3
            java.lang.Object r5 = r5.p(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            boolean r6 = O5.s.h(r5)
            if (r6 == 0) goto L57
            R2.b r5 = (R2.b) r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
        L57:
            java.lang.Object r5 = O5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.k.a(N2.d, W2.m, S5.d):java.lang.Object");
    }

    @Override // N2.e
    public InterfaceC3706f b(N2.d configuration) {
        AbstractC3255y.i(configuration, "configuration");
        return g(configuration).c().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(N2.d r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof N2.k.d
            if (r0 == 0) goto L13
            r0 = r6
            N2.k$d r0 = (N2.k.d) r0
            int r1 = r0.f7713c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7713c = r1
            goto L18
        L13:
            N2.k$d r0 = new N2.k$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7711a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7713c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r6)
            Q2.b r5 = r4.g(r5)
            O2.b r5 = r5.c()
            r0.f7713c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.k.c(N2.d, S5.d):java.lang.Object");
    }

    @Override // N2.e
    public InterfaceC3698L d() {
        return this.f7705c;
    }

    @Override // N2.e
    public Q2.b e(N2.d configuration) {
        AbstractC3255y.i(configuration, "configuration");
        return g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(N2.d r5, com.stripe.android.model.p r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof N2.k.a
            if (r0 == 0) goto L13
            r0 = r7
            N2.k$a r0 = (N2.k.a) r0
            int r1 = r0.f7708c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7708c = r1
            goto L18
        L13:
            N2.k$a r0 = new N2.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7706a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7708c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r7)
            Q2.b r5 = r4.g(r5)
            O2.b r5 = r5.c()
            r0.f7708c = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.k.f(N2.d, com.stripe.android.model.p, S5.d):java.lang.Object");
    }
}
