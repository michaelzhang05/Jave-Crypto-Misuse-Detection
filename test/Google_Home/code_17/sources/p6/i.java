package p6;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.T;
import l6.M;
import l6.N;
import n6.EnumC3487a;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public final class i extends g {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1669o f37916e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37917a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37918b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f37920d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p6.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0855a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T f37921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f37922b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f37923c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f37924d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: p6.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0856a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f37925a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f37926b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3707g f37927c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f37928d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0856a(i iVar, InterfaceC3707g interfaceC3707g, Object obj, S5.d dVar) {
                    super(2, dVar);
                    this.f37926b = iVar;
                    this.f37927c = interfaceC3707g;
                    this.f37928d = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0856a(this.f37926b, this.f37927c, this.f37928d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f37925a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC1669o interfaceC1669o = this.f37926b.f37916e;
                        InterfaceC3707g interfaceC3707g = this.f37927c;
                        Object obj2 = this.f37928d;
                        this.f37925a = 1;
                        if (interfaceC1669o.invoke(interfaceC3707g, obj2, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0856a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: p6.i$a$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f37929a;

                /* renamed from: b, reason: collision with root package name */
                Object f37930b;

                /* renamed from: c, reason: collision with root package name */
                Object f37931c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37932d;

                /* renamed from: f, reason: collision with root package name */
                int f37934f;

                b(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f37932d = obj;
                    this.f37934f |= Integer.MIN_VALUE;
                    return C0855a.this.emit(null, this);
                }
            }

            C0855a(T t8, M m8, i iVar, InterfaceC3707g interfaceC3707g) {
                this.f37921a = t8;
                this.f37922b = m8;
                this.f37923c = iVar;
                this.f37924d = interfaceC3707g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, S5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p6.i.a.C0855a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    p6.i$a$a$b r0 = (p6.i.a.C0855a.b) r0
                    int r1 = r0.f37934f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37934f = r1
                    goto L18
                L13:
                    p6.i$a$a$b r0 = new p6.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f37932d
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f37934f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f37931c
                    l6.x0 r8 = (l6.InterfaceC3390x0) r8
                    java.lang.Object r8 = r0.f37930b
                    java.lang.Object r0 = r0.f37929a
                    p6.i$a$a r0 = (p6.i.a.C0855a) r0
                    O5.t.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    O5.t.b(r9)
                    kotlin.jvm.internal.T r9 = r7.f37921a
                    java.lang.Object r9 = r9.f34162a
                    l6.x0 r9 = (l6.InterfaceC3390x0) r9
                    if (r9 == 0) goto L5d
                    p6.j r2 = new p6.j
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f37929a = r7
                    r0.f37930b = r8
                    r0.f37931c = r9
                    r0.f37934f = r3
                    java.lang.Object r9 = r9.y(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.T r9 = r0.f37921a
                    l6.M r1 = r0.f37922b
                    l6.O r3 = l6.O.UNDISPATCHED
                    p6.i$a$a$a r4 = new p6.i$a$a$a
                    p6.i r2 = r0.f37923c
                    o6.g r0 = r0.f37924d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    l6.x0 r8 = l6.AbstractC3360i.d(r1, r2, r3, r4, r5, r6)
                    r9.f34162a = r8
                    O5.I r8 = O5.I.f8278a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p6.i.a.C0855a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            super(2, dVar);
            this.f37920d = interfaceC3707g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f37920d, dVar);
            aVar.f37918b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f37917a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                M m8 = (M) this.f37918b;
                T t8 = new T();
                i iVar = i.this;
                InterfaceC3706f interfaceC3706f = iVar.f37912d;
                C0855a c0855a = new C0855a(t8, m8, iVar, this.f37920d);
                this.f37917a = 1;
                if (interfaceC3706f.collect(c0855a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public /* synthetic */ i(InterfaceC1669o interfaceC1669o, InterfaceC3706f interfaceC3706f, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, AbstractC3247p abstractC3247p) {
        this(interfaceC1669o, interfaceC3706f, (i9 & 4) != 0 ? S5.h.f9825a : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? EnumC3487a.SUSPEND : enumC3487a);
    }

    @Override // p6.e
    protected e i(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return new i(this.f37916e, this.f37912d, gVar, i8, enumC3487a);
    }

    @Override // p6.g
    protected Object q(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        Object e8 = N.e(new a(interfaceC3707g, null), dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    public i(InterfaceC1669o interfaceC1669o, InterfaceC3706f interfaceC3706f, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(interfaceC3706f, gVar, i8, enumC3487a);
        this.f37916e = interfaceC1669o;
    }
}
