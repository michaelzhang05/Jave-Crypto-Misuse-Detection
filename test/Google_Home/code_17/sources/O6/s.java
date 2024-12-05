package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.InterfaceC3390x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3693G f36769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36770c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f36771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f36772e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0817a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f36773a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f36774b;

            C0817a(S5.d dVar) {
                super(2, dVar);
            }

            public final Object a(int i8, S5.d dVar) {
                return ((C0817a) create(Integer.valueOf(i8), dVar)).invokeSuspend(O5.I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                C0817a c0817a = new C0817a(dVar);
                c0817a.f36774b = ((Number) obj).intValue();
                return c0817a;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (S5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z8;
                T5.b.e();
                if (this.f36773a == 0) {
                    O5.t.b(obj);
                    if (this.f36774b > 0) {
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f36775a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36776b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f36777c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ v f36778d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f36779e;

            /* renamed from: o6.s$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C0818a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f36780a;

                static {
                    int[] iArr = new int[EnumC3691E.values().length];
                    try {
                        iArr[EnumC3691E.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC3691E.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC3691E.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f36780a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3706f interfaceC3706f, v vVar, Object obj, S5.d dVar) {
                super(2, dVar);
                this.f36777c = interfaceC3706f;
                this.f36778d = vVar;
                this.f36779e = obj;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC3691E enumC3691E, S5.d dVar) {
                return ((b) create(enumC3691E, dVar)).invokeSuspend(O5.I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                b bVar = new b(this.f36777c, this.f36778d, this.f36779e, dVar);
                bVar.f36776b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f36775a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    int i9 = C0818a.f36780a[((EnumC3691E) this.f36776b).ordinal()];
                    if (i9 != 1) {
                        if (i9 == 3) {
                            Object obj2 = this.f36779e;
                            if (obj2 == AbstractC3689C.f36575a) {
                                this.f36778d.d();
                            } else {
                                this.f36778d.e(obj2);
                            }
                        }
                    } else {
                        InterfaceC3706f interfaceC3706f = this.f36777c;
                        v vVar = this.f36778d;
                        this.f36775a = 1;
                        if (interfaceC3706f.collect(vVar, this) == e8) {
                            return e8;
                        }
                    }
                }
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3693G interfaceC3693G, InterfaceC3706f interfaceC3706f, v vVar, Object obj, S5.d dVar) {
            super(2, dVar);
            this.f36769b = interfaceC3693G;
            this.f36770c = interfaceC3706f;
            this.f36771d = vVar;
            this.f36772e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f36769b, this.f36770c, this.f36771d, this.f36772e, dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r7.f36768a
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
                O5.t.b(r8)
                goto L5c
            L21:
                O5.t.b(r8)
                goto L8d
            L25:
                O5.t.b(r8)
                o6.G r8 = r7.f36769b
                o6.G$a r1 = o6.InterfaceC3693G.f36586a
                o6.G r6 = r1.c()
                if (r8 != r6) goto L3f
                o6.f r8 = r7.f36770c
                o6.v r1 = r7.f36771d
                r7.f36768a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                o6.G r8 = r7.f36769b
                o6.G r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                o6.v r8 = r7.f36771d
                o6.L r8 = r8.f()
                o6.s$a$a r1 = new o6.s$a$a
                r1.<init>(r5)
                r7.f36768a = r4
                java.lang.Object r8 = o6.AbstractC3708h.x(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                o6.f r8 = r7.f36770c
                o6.v r1 = r7.f36771d
                r7.f36768a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                o6.G r8 = r7.f36769b
                o6.v r1 = r7.f36771d
                o6.L r1 = r1.f()
                o6.f r8 = r8.a(r1)
                o6.f r8 = o6.AbstractC3708h.p(r8)
                o6.s$a$b r1 = new o6.s$a$b
                o6.f r3 = r7.f36770c
                o6.v r4 = r7.f36771d
                java.lang.Object r6 = r7.f36772e
                r1.<init>(r3, r4, r6, r5)
                r7.f36768a = r2
                java.lang.Object r8 = o6.AbstractC3708h.j(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                O5.I r8 = O5.I.f8278a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public static final InterfaceC3687A a(v vVar) {
        return new x(vVar, null);
    }

    public static final InterfaceC3698L b(w wVar) {
        return new y(wVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o6.C3692F c(o6.InterfaceC3706f r7, int r8) {
        /*
            n6.d$a r0 = n6.d.f35602o0
            int r0 = r0.a()
            int r0 = g6.m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof p6.e
            if (r1 == 0) goto L3c
            r1 = r7
            p6.e r1 = (p6.e) r1
            o6.f r2 = r1.j()
            if (r2 == 0) goto L3c
            o6.F r7 = new o6.F
            int r3 = r1.f37903b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            n6.a r4 = r1.f37904c
            n6.a r5 = n6.EnumC3487a.SUSPEND
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
            n6.a r8 = r1.f37904c
            S5.g r1 = r1.f37902a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            o6.F r8 = new o6.F
            n6.a r1 = n6.EnumC3487a.SUSPEND
            S5.h r2 = S5.h.f9825a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.s.c(o6.f, int):o6.F");
    }

    private static final InterfaceC3390x0 d(l6.M m8, S5.g gVar, InterfaceC3706f interfaceC3706f, v vVar, InterfaceC3693G interfaceC3693G, Object obj) {
        l6.O o8;
        if (AbstractC3255y.d(interfaceC3693G, InterfaceC3693G.f36586a.c())) {
            o8 = l6.O.DEFAULT;
        } else {
            o8 = l6.O.UNDISPATCHED;
        }
        return AbstractC3360i.c(m8, gVar, o8, new a(interfaceC3693G, interfaceC3706f, vVar, obj, null));
    }

    public static final InterfaceC3687A e(InterfaceC3706f interfaceC3706f, l6.M m8, InterfaceC3693G interfaceC3693G, int i8) {
        C3692F c8 = c(interfaceC3706f, i8);
        v a8 = AbstractC3689C.a(i8, c8.f36583b, c8.f36584c);
        return new x(a8, d(m8, c8.f36585d, c8.f36582a, a8, interfaceC3693G, AbstractC3689C.f36575a));
    }

    public static final InterfaceC3698L f(InterfaceC3706f interfaceC3706f, l6.M m8, InterfaceC3693G interfaceC3693G, Object obj) {
        C3692F c8 = c(interfaceC3706f, 1);
        w a8 = AbstractC3700N.a(obj);
        return new y(a8, d(m8, c8.f36585d, c8.f36582a, a8, interfaceC3693G, obj));
    }
}
