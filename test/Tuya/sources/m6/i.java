package m6;

import L5.I;
import i6.M;
import i6.N;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.T;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public final class i extends g {

    /* renamed from: e, reason: collision with root package name */
    private final X5.o f35890e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35891a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35892b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f35894d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m6.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0825a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T f35895a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f35896b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f35897c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f35898d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: m6.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0826a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f35899a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f35900b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f35901c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f35902d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0826a(i iVar, InterfaceC3359g interfaceC3359g, Object obj, P5.d dVar) {
                    super(2, dVar);
                    this.f35900b = iVar;
                    this.f35901c = interfaceC3359g;
                    this.f35902d = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0826a(this.f35900b, this.f35901c, this.f35902d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0826a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f35899a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        X5.o oVar = this.f35900b.f35890e;
                        InterfaceC3359g interfaceC3359g = this.f35901c;
                        Object obj2 = this.f35902d;
                        this.f35899a = 1;
                        if (oVar.invoke(interfaceC3359g, obj2, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: m6.i$a$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f35903a;

                /* renamed from: b, reason: collision with root package name */
                Object f35904b;

                /* renamed from: c, reason: collision with root package name */
                Object f35905c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f35906d;

                /* renamed from: f, reason: collision with root package name */
                int f35908f;

                b(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f35906d = obj;
                    this.f35908f |= Integer.MIN_VALUE;
                    return C0825a.this.emit(null, this);
                }
            }

            C0825a(T t8, M m8, i iVar, InterfaceC3359g interfaceC3359g) {
                this.f35895a = t8;
                this.f35896b = m8;
                this.f35897c = iVar;
                this.f35898d = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, P5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof m6.i.a.C0825a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    m6.i$a$a$b r0 = (m6.i.a.C0825a.b) r0
                    int r1 = r0.f35908f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35908f = r1
                    goto L18
                L13:
                    m6.i$a$a$b r0 = new m6.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f35906d
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f35908f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f35905c
                    i6.x0 r8 = (i6.InterfaceC2855x0) r8
                    java.lang.Object r8 = r0.f35904b
                    java.lang.Object r0 = r0.f35903a
                    m6.i$a$a r0 = (m6.i.a.C0825a) r0
                    L5.t.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    L5.t.b(r9)
                    kotlin.jvm.internal.T r9 = r7.f35895a
                    java.lang.Object r9 = r9.f33761a
                    i6.x0 r9 = (i6.InterfaceC2855x0) r9
                    if (r9 == 0) goto L5d
                    m6.j r2 = new m6.j
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f35903a = r7
                    r0.f35904b = r8
                    r0.f35905c = r9
                    r0.f35908f = r3
                    java.lang.Object r9 = r9.e(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.T r9 = r0.f35895a
                    i6.M r1 = r0.f35896b
                    i6.O r3 = i6.O.UNDISPATCHED
                    m6.i$a$a$a r4 = new m6.i$a$a$a
                    m6.i r2 = r0.f35897c
                    l6.g r0 = r0.f35898d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    i6.x0 r8 = i6.AbstractC2825i.d(r1, r2, r3, r4, r5, r6)
                    r9.f33761a = r8
                    L5.I r8 = L5.I.f6487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: m6.i.a.C0825a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            super(2, dVar);
            this.f35894d = interfaceC3359g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f35894d, dVar);
            aVar.f35892b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f35891a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                M m8 = (M) this.f35892b;
                T t8 = new T();
                i iVar = i.this;
                InterfaceC3358f interfaceC3358f = iVar.f35886d;
                C0825a c0825a = new C0825a(t8, m8, iVar, this.f35894d);
                this.f35891a = 1;
                if (interfaceC3358f.collect(c0825a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public /* synthetic */ i(X5.o oVar, InterfaceC3358f interfaceC3358f, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, AbstractC3151p abstractC3151p) {
        this(oVar, interfaceC3358f, (i9 & 4) != 0 ? P5.h.f7994a : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? EnumC3132a.SUSPEND : enumC3132a);
    }

    @Override // m6.e
    protected e i(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return new i(this.f35890e, this.f35886d, gVar, i8, enumC3132a);
    }

    @Override // m6.g
    protected Object q(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        Object e8 = N.e(new a(interfaceC3359g, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    public i(X5.o oVar, InterfaceC3358f interfaceC3358f, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(interfaceC3358f, gVar, i8, enumC3132a);
        this.f35890e = oVar;
    }
}
