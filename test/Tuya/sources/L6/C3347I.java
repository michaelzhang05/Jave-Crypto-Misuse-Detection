package l6;

import L5.C1224h;

/* renamed from: l6.I, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3347I implements InterfaceC3344F {

    /* renamed from: l6.I$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34589a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34590b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f34591c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.I$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0783a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O f34592a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f34593b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: l6.I$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0784a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34594a;

                /* renamed from: c, reason: collision with root package name */
                int f34596c;

                C0784a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34594a = obj;
                    this.f34596c |= Integer.MIN_VALUE;
                    return C0783a.this.b(0, this);
                }
            }

            C0783a(kotlin.jvm.internal.O o8, InterfaceC3359g interfaceC3359g) {
                this.f34592a = o8;
                this.f34593b = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(int r5, P5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof l6.C3347I.a.C0783a.C0784a
                    if (r0 == 0) goto L13
                    r0 = r6
                    l6.I$a$a$a r0 = (l6.C3347I.a.C0783a.C0784a) r0
                    int r1 = r0.f34596c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34596c = r1
                    goto L18
                L13:
                    l6.I$a$a$a r0 = new l6.I$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34594a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f34596c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.O r5 = r4.f34592a
                    boolean r6 = r5.f33757a
                    if (r6 != 0) goto L4e
                    r5.f33757a = r3
                    l6.g r5 = r4.f34593b
                    l6.D r6 = l6.EnumC3342D.START
                    r0.f34596c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    L5.I r5 = L5.I.f6487a
                    return r5
                L4e:
                    L5.I r5 = L5.I.f6487a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.C3347I.a.C0783a.b(int, P5.d):java.lang.Object");
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3349K interfaceC3349K, P5.d dVar) {
            super(2, dVar);
            this.f34591c = interfaceC3349K;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f34591c, dVar);
            aVar.f34590b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f34589a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f34590b;
                kotlin.jvm.internal.O o8 = new kotlin.jvm.internal.O();
                InterfaceC3349K interfaceC3349K = this.f34591c;
                C0783a c0783a = new C0783a(o8, interfaceC3359g);
                this.f34589a = 1;
                if (interfaceC3349K.collect(c0783a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }

        @Override // X5.n
        public final Object invoke(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            return ((a) create(interfaceC3359g, dVar)).invokeSuspend(L5.I.f6487a);
        }
    }

    @Override // l6.InterfaceC3344F
    public InterfaceC3358f a(InterfaceC3349K interfaceC3349K) {
        return AbstractC3360h.x(new a(interfaceC3349K, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
