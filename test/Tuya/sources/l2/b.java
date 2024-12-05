package L2;

import L5.I;
import L5.p;
import L5.s;
import T2.l;
import b3.o;
import b3.r;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final K2.d f6053a;

    /* renamed from: b, reason: collision with root package name */
    private final P2.c f6054b;

    /* renamed from: c, reason: collision with root package name */
    private final M2.e f6055c;

    /* renamed from: d, reason: collision with root package name */
    private final k3.i f6056d;

    /* renamed from: e, reason: collision with root package name */
    private final v f6057e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f6058f;

    /* renamed from: g, reason: collision with root package name */
    private volatile String f6059g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3358f f6060h;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6061a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6062b;

        static {
            int[] iArr = new int[O2.a.values().length];
            try {
                iArr[O2.a.f7760a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O2.a.f7761b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O2.a.f7762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O2.a.f7763d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[O2.a.f7764e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6061a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.f9970a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l.f9971b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l.f9972c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[l.f9973d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[l.f9974e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f6062b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0118b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6063a;

        /* renamed from: b, reason: collision with root package name */
        Object f6064b;

        /* renamed from: c, reason: collision with root package name */
        Object f6065c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f6066d;

        /* renamed from: f, reason: collision with root package name */
        int f6068f;

        C0118b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6066d = obj;
            this.f6068f |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            if (d8 == Q5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6069a;

        /* renamed from: c, reason: collision with root package name */
        int f6071c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6069a = obj;
            this.f6071c |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6072a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6073b;

        /* renamed from: d, reason: collision with root package name */
        int f6075d;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6073b = obj;
            this.f6075d |= Integer.MIN_VALUE;
            Object i8 = b.this.i(this);
            if (i8 == Q5.b.e()) {
                return i8;
            }
            return s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6076a;

        /* renamed from: b, reason: collision with root package name */
        boolean f6077b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6078c;

        /* renamed from: e, reason: collision with root package name */
        int f6080e;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6078c = obj;
            this.f6080e |= Integer.MIN_VALUE;
            Object j8 = b.this.j(null, false, this);
            if (j8 == Q5.b.e()) {
                return j8;
            }
            return s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6081a;

        /* renamed from: c, reason: collision with root package name */
        int f6083c;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6081a = obj;
            this.f6083c |= Integer.MIN_VALUE;
            Object p8 = b.this.p(null, this);
            if (p8 == Q5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6084a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6085b;

        /* renamed from: d, reason: collision with root package name */
        int f6087d;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6085b = obj;
            this.f6087d |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, null, null, null, this);
            if (q8 == Q5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6088a;

        /* renamed from: b, reason: collision with root package name */
        Object f6089b;

        /* renamed from: c, reason: collision with root package name */
        Object f6090c;

        /* renamed from: d, reason: collision with root package name */
        Object f6091d;

        /* renamed from: e, reason: collision with root package name */
        Object f6092e;

        /* renamed from: f, reason: collision with root package name */
        Object f6093f;

        /* renamed from: g, reason: collision with root package name */
        Object f6094g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f6095h;

        /* renamed from: j, reason: collision with root package name */
        int f6097j;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6095h = obj;
            this.f6097j |= Integer.MIN_VALUE;
            Object r8 = b.this.r(null, null, null, null, null, this);
            if (r8 == Q5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f6098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6099b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f6100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6101b;

            /* renamed from: L2.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0119a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f6102a;

                /* renamed from: b, reason: collision with root package name */
                int f6103b;

                /* renamed from: c, reason: collision with root package name */
                Object f6104c;

                public C0119a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f6102a = obj;
                    this.f6103b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g, b bVar) {
                this.f6100a = interfaceC3359g;
                this.f6101b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, P5.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof L2.b.i.a.C0119a
                    if (r0 == 0) goto L13
                    r0 = r8
                    L2.b$i$a$a r0 = (L2.b.i.a.C0119a) r0
                    int r1 = r0.f6103b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6103b = r1
                    goto L18
                L13:
                    L2.b$i$a$a r0 = new L2.b$i$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f6102a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f6103b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    L5.t.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f6104c
                    l6.g r7 = (l6.InterfaceC3359g) r7
                    L5.t.b(r8)
                    goto L53
                L3c:
                    L5.t.b(r8)
                    l6.g r8 = r6.f6100a
                    O2.b r7 = (O2.b) r7
                    L2.b r2 = r6.f6101b
                    r0.f6104c = r8
                    r0.f6103b = r4
                    java.lang.Object r7 = L2.b.a(r2, r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f6104c = r2
                    r0.f6103b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    L5.I r7 = L5.I.f6487a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: L2.b.i.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3358f interfaceC3358f, b bVar) {
            this.f6098a = interfaceC3358f;
            this.f6099b = bVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f6098a.collect(new a(interfaceC3359g, this.f6099b), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return I.f6487a;
        }
    }

    public b(K2.d config, P2.c linkRepository, M2.e linkEventsReporter, k3.i errorReporter) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(linkRepository, "linkRepository");
        AbstractC3159y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f6053a = config;
        this.f6054b = linkRepository;
        this.f6055c = linkEventsReporter;
        this.f6056d = errorReporter;
        v a8 = AbstractC3351M.a(null);
        this.f6057e = a8;
        this.f6058f = a8;
        this.f6060h = new i(a8, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(O2.b r9, P5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof L2.b.c
            if (r0 == 0) goto L14
            r0 = r10
            L2.b$c r0 = (L2.b.c) r0
            int r1 = r0.f6071c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6071c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            L2.b$c r0 = new L2.b$c
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f6069a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r4.f6071c
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r9 = r10.k()
            goto L5f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            L5.t.b(r10)
            if (r9 == 0) goto L45
            O2.a r9 = r9.c()
            if (r9 != 0) goto L88
        L45:
            K2.d r9 = r8.f6053a
            K2.d$b r9 = r9.b()
            java.lang.String r9 = r9.c()
            if (r9 == 0) goto L82
            r4.f6071c = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            boolean r10 = L5.s.h(r9)
            if (r10 == 0) goto L72
            O2.b r9 = (O2.b) r9
            if (r9 == 0) goto L6d
            O2.a r7 = r9.c()
        L6d:
            java.lang.Object r9 = L5.s.b(r7)
            goto L76
        L72:
            java.lang.Object r9 = L5.s.b(r9)
        L76:
            java.lang.Throwable r10 = L5.s.e(r9)
            if (r10 != 0) goto L7d
            goto L7f
        L7d:
            O2.a r9 = O2.a.f7764e
        L7f:
            r7 = r9
            O2.a r7 = (O2.a) r7
        L82:
            if (r7 != 0) goto L87
            O2.a r9 = O2.a.f7763d
            goto L88
        L87:
            r9 = r7
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.e(O2.b, P5.d):java.lang.Object");
    }

    private final r g(l lVar) {
        int i8 = a.f6062b[lVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            return r.f14543f;
                        }
                        throw new p();
                    }
                    return r.f14542e;
                }
                return r.f14541d;
            }
            return r.f14540c;
        }
        return r.f14539b;
    }

    public static /* synthetic */ Object k(b bVar, String str, boolean z8, P5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return bVar.j(str, z8, dVar);
    }

    private final void l(String str, String str2) {
        String str3;
        if (str2 != null) {
            this.f6059g = str2;
            return;
        }
        O2.b bVar = (O2.b) this.f6057e.getValue();
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!AbstractC3159y.d(str3, str)) {
            this.f6059g = null;
        }
    }

    private final O2.b m(o oVar, String str) {
        l(oVar.c(), str);
        O2.b bVar = new O2.b(oVar);
        this.f6057e.setValue(bVar);
        return bVar;
    }

    private final O2.b n(o oVar, String str) {
        O2.b m8;
        if (oVar == null || (m8 = m(oVar, str)) == null) {
            this.f6057e.setValue(null);
            this.f6059g = null;
            return null;
        }
        return m8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, T2.l r13, P5.d r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof L2.b.g
            if (r0 == 0) goto L14
            r0 = r14
            L2.b$g r0 = (L2.b.g) r0
            int r1 = r0.f6087d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6087d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            L2.b$g r0 = new L2.b$g
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f6085b
            java.lang.Object r0 = Q5.b.e()
            int r1 = r7.f6087d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r9 = r7.f6084a
            L2.b r9 = (L2.b) r9
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r10 = r14.k()
            goto L56
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            L5.t.b(r14)
            P2.c r1 = r8.f6054b
            b3.r r6 = r8.g(r13)
            r7.f6084a = r8
            r7.f6087d = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r10 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L55
            return r0
        L55:
            r9 = r8
        L56:
            boolean r11 = L5.s.h(r10)
            if (r11 == 0) goto L6f
            b3.q r10 = (b3.q) r10
            b3.o r11 = r10.b()
            java.lang.String r10 = r10.c()
            O2.b r9 = r9.m(r11, r10)
            java.lang.Object r9 = L5.s.b(r9)
            goto L73
        L6f:
            java.lang.Object r9 = L5.s.b(r10)
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, T2.l, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, T2.l r22, P5.d r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.r(java.lang.String, java.lang.String, java.lang.String, java.lang.String, T2.l, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.stripe.android.model.p r17, P5.d r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.d(com.stripe.android.model.p, P5.d):java.lang.Object");
    }

    public final InterfaceC3358f f() {
        return this.f6060h;
    }

    public final InterfaceC3349K h() {
        return this.f6058f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(P5.d r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.i(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, boolean r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof L2.b.e
            if (r0 == 0) goto L13
            r0 = r7
            L2.b$e r0 = (L2.b.e) r0
            int r1 = r0.f6080e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6080e = r1
            goto L18
        L13:
            L2.b$e r0 = new L2.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6078c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6080e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.f6077b
            java.lang.Object r5 = r0.f6076a
            L2.b r5 = (L2.b) r5
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r7 = r7.k()
            goto L50
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            L5.t.b(r7)
            P2.c r7 = r4.f6054b
            r0.f6076a = r4
            r0.f6077b = r6
            r0.f6080e = r3
            java.lang.Object r7 = r7.d(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            java.lang.Throwable r0 = L5.s.e(r7)
            if (r0 == 0) goto L5b
            M2.e r1 = r5.f6055c
            r1.i(r0)
        L5b:
            boolean r0 = L5.s.h(r7)
            if (r0 == 0) goto L6c
            b3.p r7 = (b3.p) r7
            O2.b r5 = r5.o(r7, r6)
            java.lang.Object r5 = L5.s.b(r5)
            goto L70
        L6c:
            java.lang.Object r5 = L5.s.b(r7)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.j(java.lang.String, boolean, P5.d):java.lang.Object");
    }

    public final O2.b o(b3.p lookup, boolean z8) {
        AbstractC3159y.i(lookup, "lookup");
        o b8 = lookup.b();
        if (b8 != null) {
            if (z8) {
                return n(b8, lookup.c());
            }
            return new O2.b(b8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(T2.m r9, P5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof L2.b.f
            if (r0 == 0) goto L14
            r0 = r10
            L2.b$f r0 = (L2.b.f) r0
            int r1 = r0.f6083c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6083c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            L2.b$f r0 = new L2.b$f
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f6081a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r7.f6083c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L47
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r9 = r10.k()
            goto Laf
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r9 = r10.k()
            goto L62
        L47:
            L5.t.b(r10)
            boolean r10 = r9 instanceof T2.m.a
            if (r10 == 0) goto L8a
            T2.m$a r9 = (T2.m.a) r9
            java.lang.String r2 = r9.a()
            r7.f6083c = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r4 = r7
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L62
            return r0
        L62:
            boolean r10 = L5.s.h(r9)
            if (r10 == 0) goto L85
            O2.b r9 = (O2.b) r9     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L73
            java.lang.Object r9 = L5.s.b(r9)     // Catch: java.lang.Throwable -> L71
            goto L89
        L71:
            r9 = move-exception
            goto L7f
        L73:
            java.lang.String r9 = "Error fetching user account"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L71
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L7f:
            L5.s$a r10 = L5.s.f6511b
            java.lang.Object r9 = L5.t.a(r9)
        L85:
            java.lang.Object r9 = L5.s.b(r9)
        L89:
            return r9
        L8a:
            boolean r10 = r9 instanceof T2.m.b
            if (r10 == 0) goto Lb0
            T2.m$b r9 = (T2.m.b) r9
            java.lang.String r10 = r9.c()
            java.lang.String r4 = r9.b()
            java.lang.String r3 = r9.e()
            java.lang.String r5 = r9.d()
            T2.l r6 = r9.a()
            r7.f6083c = r2
            r1 = r8
            r2 = r10
            java.lang.Object r9 = r1.r(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Laf
            return r0
        Laf:
            return r9
        Lb0:
            L5.p r9 = new L5.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.p(T2.m, P5.d):java.lang.Object");
    }
}
