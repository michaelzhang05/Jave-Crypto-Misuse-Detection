package l6;

import i6.AbstractC2825i;
import i6.InterfaceC2855x0;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3344F f34752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f34754d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f34755e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0787a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f34756a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f34757b;

            C0787a(P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                C0787a c0787a = new C0787a(dVar);
                c0787a.f34757b = ((Number) obj).intValue();
                return c0787a;
            }

            public final Object g(int i8, P5.d dVar) {
                return ((C0787a) create(Integer.valueOf(i8), dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((Number) obj).intValue(), (P5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z8;
                Q5.b.e();
                if (this.f34756a == 0) {
                    L5.t.b(obj);
                    if (this.f34757b > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z8);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f34758a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34759b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f34760c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u f34761d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f34762e;

            /* renamed from: l6.r$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C0788a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f34763a;

                static {
                    int[] iArr = new int[EnumC3342D.values().length];
                    try {
                        iArr[EnumC3342D.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC3342D.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC3342D.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f34763a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3358f interfaceC3358f, u uVar, Object obj, P5.d dVar) {
                super(2, dVar);
                this.f34760c = interfaceC3358f;
                this.f34761d = uVar;
                this.f34762e = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                b bVar = new b(this.f34760c, this.f34761d, this.f34762e, dVar);
                bVar.f34759b = obj;
                return bVar;
            }

            @Override // X5.n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC3342D enumC3342D, P5.d dVar) {
                return ((b) create(enumC3342D, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f34758a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    int i9 = C0788a.f34763a[((EnumC3342D) this.f34759b).ordinal()];
                    if (i9 != 1) {
                        if (i9 == 3) {
                            Object obj2 = this.f34762e;
                            if (obj2 == AbstractC3340B.f34574a) {
                                this.f34761d.c();
                            } else {
                                this.f34761d.d(obj2);
                            }
                        }
                    } else {
                        InterfaceC3358f interfaceC3358f = this.f34760c;
                        u uVar = this.f34761d;
                        this.f34758a = 1;
                        if (interfaceC3358f.collect(uVar, this) == e8) {
                            return e8;
                        }
                    }
                }
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3344F interfaceC3344F, InterfaceC3358f interfaceC3358f, u uVar, Object obj, P5.d dVar) {
            super(2, dVar);
            this.f34752b = interfaceC3344F;
            this.f34753c = interfaceC3358f;
            this.f34754d = uVar;
            this.f34755e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f34752b, this.f34753c, this.f34754d, this.f34755e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r7.f34751a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                L5.t.b(r8)
                goto L5c
            L21:
                L5.t.b(r8)
                goto L8d
            L25:
                L5.t.b(r8)
                l6.F r8 = r7.f34752b
                l6.F$a r1 = l6.InterfaceC3344F.f34585a
                l6.F r6 = r1.c()
                if (r8 != r6) goto L3f
                l6.f r8 = r7.f34753c
                l6.u r1 = r7.f34754d
                r7.f34751a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                l6.F r8 = r7.f34752b
                l6.F r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                l6.u r8 = r7.f34754d
                l6.K r8 = r8.e()
                l6.r$a$a r1 = new l6.r$a$a
                r1.<init>(r5)
                r7.f34751a = r4
                java.lang.Object r8 = l6.AbstractC3360h.v(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                l6.f r8 = r7.f34753c
                l6.u r1 = r7.f34754d
                r7.f34751a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                l6.F r8 = r7.f34752b
                l6.u r1 = r7.f34754d
                l6.K r1 = r1.e()
                l6.f r8 = r8.a(r1)
                l6.f r8 = l6.AbstractC3360h.n(r8)
                l6.r$a$b r1 = new l6.r$a$b
                l6.f r3 = r7.f34753c
                l6.u r4 = r7.f34754d
                java.lang.Object r6 = r7.f34755e
                r1.<init>(r3, r4, r6, r5)
                r7.f34751a = r2
                java.lang.Object r8 = l6.AbstractC3360h.h(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                L5.I r8 = L5.I.f6487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final z a(u uVar) {
        return new w(uVar, null);
    }

    public static final InterfaceC3349K b(v vVar) {
        return new x(vVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final l6.C3343E c(l6.InterfaceC3358f r7, int r8) {
        /*
            k6.d$a r0 = k6.d.f33610o0
            int r0 = r0.a()
            int r0 = d6.m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof m6.e
            if (r1 == 0) goto L3c
            r1 = r7
            m6.e r1 = (m6.e) r1
            l6.f r2 = r1.j()
            if (r2 == 0) goto L3c
            l6.E r7 = new l6.E
            int r3 = r1.f35877b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            k6.a r4 = r1.f35878c
            k6.a r5 = k6.EnumC3132a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            k6.a r8 = r1.f35878c
            P5.g r1 = r1.f35876a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            l6.E r8 = new l6.E
            k6.a r1 = k6.EnumC3132a.SUSPEND
            P5.h r2 = P5.h.f7994a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.r.c(l6.f, int):l6.E");
    }

    private static final InterfaceC2855x0 d(i6.M m8, P5.g gVar, InterfaceC3358f interfaceC3358f, u uVar, InterfaceC3344F interfaceC3344F, Object obj) {
        i6.O o8;
        if (AbstractC3159y.d(interfaceC3344F, InterfaceC3344F.f34585a.c())) {
            o8 = i6.O.DEFAULT;
        } else {
            o8 = i6.O.UNDISPATCHED;
        }
        return AbstractC2825i.c(m8, gVar, o8, new a(interfaceC3344F, interfaceC3358f, uVar, obj, null));
    }

    public static final z e(InterfaceC3358f interfaceC3358f, i6.M m8, InterfaceC3344F interfaceC3344F, int i8) {
        C3343E c8 = c(interfaceC3358f, i8);
        u a8 = AbstractC3340B.a(i8, c8.f34582b, c8.f34583c);
        return new w(a8, d(m8, c8.f34584d, c8.f34581a, a8, interfaceC3344F, AbstractC3340B.f34574a));
    }

    public static final InterfaceC3349K f(InterfaceC3358f interfaceC3358f, i6.M m8, InterfaceC3344F interfaceC3344F, Object obj) {
        C3343E c8 = c(interfaceC3358f, 1);
        v a8 = AbstractC3351M.a(obj);
        return new x(a8, d(m8, c8.f34584d, c8.f34581a, a8, interfaceC3344F, obj));
    }
}
