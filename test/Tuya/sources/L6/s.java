package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34764a;

        /* renamed from: l6.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0789a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f34765a;

            /* renamed from: l6.s$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0790a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34766a;

                /* renamed from: b, reason: collision with root package name */
                int f34767b;

                public C0790a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34766a = obj;
                    this.f34767b |= Integer.MIN_VALUE;
                    return C0789a.this.emit(null, this);
                }
            }

            public C0789a(InterfaceC3359g interfaceC3359g) {
                this.f34765a = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, P5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof l6.s.a.C0789a.C0790a
                    if (r0 == 0) goto L13
                    r0 = r6
                    l6.s$a$a$a r0 = (l6.s.a.C0789a.C0790a) r0
                    int r1 = r0.f34767b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34767b = r1
                    goto L18
                L13:
                    l6.s$a$a$a r0 = new l6.s$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34766a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f34767b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    l6.g r6 = r4.f34765a
                    if (r5 == 0) goto L41
                    r0.f34767b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    L5.I r5 = L5.I.f6487a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.s.a.C0789a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public a(InterfaceC3358f interfaceC3358f) {
            this.f34764a = interfaceC3358f;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34764a.collect(new C0789a(interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34769a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f34770b;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f34771a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ X5.n f34772b;

            /* renamed from: l6.s$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0791a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34773a;

                /* renamed from: b, reason: collision with root package name */
                int f34774b;

                /* renamed from: d, reason: collision with root package name */
                Object f34776d;

                /* renamed from: e, reason: collision with root package name */
                Object f34777e;

                public C0791a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34773a = obj;
                    this.f34774b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g, X5.n nVar) {
                this.f34771a = interfaceC3359g;
                this.f34772b = nVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof l6.s.b.a.C0791a
                    if (r0 == 0) goto L13
                    r0 = r7
                    l6.s$b$a$a r0 = (l6.s.b.a.C0791a) r0
                    int r1 = r0.f34774b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34774b = r1
                    goto L18
                L13:
                    l6.s$b$a$a r0 = new l6.s$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f34773a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f34774b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    L5.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f34777e
                    l6.g r6 = (l6.InterfaceC3359g) r6
                    java.lang.Object r2 = r0.f34776d
                    L5.t.b(r7)
                    goto L5c
                L3e:
                    L5.t.b(r7)
                    l6.g r7 = r5.f34771a
                    X5.n r2 = r5.f34772b
                    r0.f34776d = r6
                    r0.f34777e = r7
                    r0.f34774b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC3157w.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC3157w.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f34776d = r7
                    r0.f34777e = r7
                    r0.f34774b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    L5.I r6 = L5.I.f6487a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.s.b.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public b(InterfaceC3358f interfaceC3358f, X5.n nVar) {
            this.f34769a = interfaceC3358f;
            this.f34770b = nVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34769a.collect(new a(interfaceC3359g, this.f34770b), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6487a;
        }
    }

    public static final InterfaceC3358f a(InterfaceC3358f interfaceC3358f) {
        return new a(interfaceC3358f);
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return new b(interfaceC3358f, nVar);
    }
}
