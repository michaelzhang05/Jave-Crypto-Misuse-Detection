package O7;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final N7.a f8537a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.b f8538b;

    /* renamed from: c, reason: collision with root package name */
    public final P7.j f8539c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8540d;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8541a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8542b;

        /* renamed from: d, reason: collision with root package name */
        public int f8544d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8542b = obj;
            this.f8544d |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(N7.a networkUtil, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8537a = networkUtil;
        this.f8538b = requestApi;
        this.f8539c = resolver;
        this.f8540d = "geoip";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // O7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof O7.n.a
            if (r0 == 0) goto L13
            r0 = r12
            O7.n$a r0 = (O7.n.a) r0
            int r1 = r0.f8544d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8544d = r1
            goto L18
        L13:
            O7.n$a r0 = new O7.n$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8542b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8544d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f8541a
            O7.n r0 = (O7.n) r0
            O5.t.b(r12)     // Catch: y5.C4208a -> L2e
            goto L59
        L2e:
            goto L6c
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            O5.t.b(r12)
            N7.a r12 = r11.f8537a     // Catch: y5.C4208a -> L5c
            boolean r12 = r12.a()     // Catch: y5.C4208a -> L5c
            if (r12 == 0) goto L5e
            N7.b r12 = r11.f8538b     // Catch: y5.C4208a -> L5c
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r5 = r11.f8540d     // Catch: y5.C4208a -> L5c
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3255y.q(r2, r5)     // Catch: y5.C4208a -> L5c
            r0.f8541a = r11     // Catch: y5.C4208a -> L5c
            r0.f8544d = r4     // Catch: y5.C4208a -> L5c
            java.lang.Object r12 = r12.b(r2, r0)     // Catch: y5.C4208a -> L5c
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r11
        L59:
            java.lang.String r12 = (java.lang.String) r12     // Catch: y5.C4208a -> L2e
            goto L6d
        L5c:
            goto L6b
        L5e:
            y5.b r4 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L5c
            com.inmobi.cmp.model.ChoiceError r5 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L5c
            r9 = 0
            r10 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            y5.C4209b.b(r4, r5, r6, r7, r8, r9, r10)     // Catch: y5.C4208a -> L5c
        L6b:
            r0 = r11
        L6c:
            r12 = r3
        L6d:
            if (r12 != 0) goto L70
            goto L79
        L70:
            P7.j r0 = r0.f8539c
            java.lang.Object r12 = r0.a(r12)
            r3 = r12
            M5.b r3 = (M5.b) r3
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.n.a(S5.d):java.lang.Object");
    }
}
