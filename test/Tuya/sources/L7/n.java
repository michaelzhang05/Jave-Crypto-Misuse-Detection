package L7;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final K7.a f6746a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.b f6747b;

    /* renamed from: c, reason: collision with root package name */
    public final M7.j f6748c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6749d;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6750a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6751b;

        /* renamed from: d, reason: collision with root package name */
        public int f6753d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6751b = obj;
            this.f6753d |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(K7.a networkUtil, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6746a = networkUtil;
        this.f6747b = requestApi;
        this.f6748c = resolver;
        this.f6749d = "geoip";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // L7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof L7.n.a
            if (r0 == 0) goto L13
            r0 = r12
            L7.n$a r0 = (L7.n.a) r0
            int r1 = r0.f6753d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6753d = r1
            goto L18
        L13:
            L7.n$a r0 = new L7.n$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f6751b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6753d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f6750a
            L7.n r0 = (L7.n) r0
            L5.t.b(r12)     // Catch: v5.C3831a -> L2e
            goto L59
        L2e:
            goto L6c
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            L5.t.b(r12)
            K7.a r12 = r11.f6746a     // Catch: v5.C3831a -> L5c
            boolean r12 = r12.a()     // Catch: v5.C3831a -> L5c
            if (r12 == 0) goto L5e
            K7.b r12 = r11.f6747b     // Catch: v5.C3831a -> L5c
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r5 = r11.f6749d     // Catch: v5.C3831a -> L5c
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3159y.q(r2, r5)     // Catch: v5.C3831a -> L5c
            r0.f6750a = r11     // Catch: v5.C3831a -> L5c
            r0.f6753d = r4     // Catch: v5.C3831a -> L5c
            java.lang.Object r12 = r12.b(r2, r0)     // Catch: v5.C3831a -> L5c
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r11
        L59:
            java.lang.String r12 = (java.lang.String) r12     // Catch: v5.C3831a -> L2e
            goto L6d
        L5c:
            goto L6b
        L5e:
            v5.b r4 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L5c
            com.inmobi.cmp.model.ChoiceError r5 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L5c
            r9 = 0
            r10 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            v5.C3832b.b(r4, r5, r6, r7, r8, r9, r10)     // Catch: v5.C3831a -> L5c
        L6b:
            r0 = r11
        L6c:
            r12 = r3
        L6d:
            if (r12 != 0) goto L70
            goto L79
        L70:
            M7.j r0 = r0.f6748c
            java.lang.Object r12 = r0.a(r12)
            r3 = r12
            J5.b r3 = (J5.b) r3
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.n.a(P5.d):java.lang.Object");
    }
}
