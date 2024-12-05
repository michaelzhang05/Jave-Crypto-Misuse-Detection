package o6;

import a6.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36781a;

        /* renamed from: o6.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0819a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f36782a;

            /* renamed from: o6.t$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0820a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36783a;

                /* renamed from: b, reason: collision with root package name */
                int f36784b;

                public C0820a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f36783a = obj;
                    this.f36784b |= Integer.MIN_VALUE;
                    return C0819a.this.emit(null, this);
                }
            }

            public C0819a(InterfaceC3707g interfaceC3707g) {
                this.f36782a = interfaceC3707g;
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
                    boolean r0 = r6 instanceof o6.t.a.C0819a.C0820a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o6.t$a$a$a r0 = (o6.t.a.C0819a.C0820a) r0
                    int r1 = r0.f36784b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36784b = r1
                    goto L18
                L13:
                    o6.t$a$a$a r0 = new o6.t$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36783a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f36784b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    o6.g r6 = r4.f36782a
                    if (r5 == 0) goto L41
                    r0.f36784b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o6.t.a.C0819a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public a(InterfaceC3706f interfaceC3706f) {
            this.f36781a = interfaceC3706f;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f36781a.collect(new C0819a(interfaceC3707g), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36787b;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f36788a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f36789b;

            /* renamed from: o6.t$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0821a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36790a;

                /* renamed from: b, reason: collision with root package name */
                int f36791b;

                /* renamed from: d, reason: collision with root package name */
                Object f36793d;

                /* renamed from: e, reason: collision with root package name */
                Object f36794e;

                public C0821a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f36790a = obj;
                    this.f36791b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g, InterfaceC1668n interfaceC1668n) {
                this.f36788a = interfaceC3707g;
                this.f36789b = interfaceC1668n;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, S5.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof o6.t.b.a.C0821a
                    if (r0 == 0) goto L13
                    r0 = r7
                    o6.t$b$a$a r0 = (o6.t.b.a.C0821a) r0
                    int r1 = r0.f36791b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36791b = r1
                    goto L18
                L13:
                    o6.t$b$a$a r0 = new o6.t$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f36790a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f36791b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    O5.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f36794e
                    o6.g r6 = (o6.InterfaceC3707g) r6
                    java.lang.Object r2 = r0.f36793d
                    O5.t.b(r7)
                    goto L5c
                L3e:
                    O5.t.b(r7)
                    o6.g r7 = r5.f36788a
                    a6.n r2 = r5.f36789b
                    r0.f36793d = r6
                    r0.f36794e = r7
                    r0.f36791b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC3253w.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC3253w.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f36793d = r7
                    r0.f36794e = r7
                    r0.f36791b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    O5.I r6 = O5.I.f8278a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o6.t.b.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public b(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
            this.f36786a = interfaceC3706f;
            this.f36787b = interfaceC1668n;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f36786a.collect(new a(interfaceC3707g, this.f36787b), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    public static final InterfaceC3706f a(InterfaceC3706f interfaceC3706f) {
        return new a(interfaceC3706f);
    }

    public static final InterfaceC3706f b(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
        return new b(interfaceC3706f, interfaceC1668n);
    }
}
