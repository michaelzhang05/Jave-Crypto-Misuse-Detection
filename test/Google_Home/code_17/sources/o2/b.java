package O2;

import O5.I;
import O5.p;
import O5.s;
import W2.l;
import e3.o;
import e3.r;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final N2.d f7844a;

    /* renamed from: b, reason: collision with root package name */
    private final S2.c f7845b;

    /* renamed from: c, reason: collision with root package name */
    private final P2.e f7846c;

    /* renamed from: d, reason: collision with root package name */
    private final n3.i f7847d;

    /* renamed from: e, reason: collision with root package name */
    private final w f7848e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f7849f;

    /* renamed from: g, reason: collision with root package name */
    private volatile String f7850g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3706f f7851h;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7852a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7853b;

        static {
            int[] iArr = new int[R2.a.values().length];
            try {
                iArr[R2.a.f9616a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R2.a.f9617b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R2.a.f9618c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R2.a.f9619d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R2.a.f9620e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7852a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.f11627a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l.f11628b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l.f11629c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[l.f11630d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[l.f11631e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f7853b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0146b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7854a;

        /* renamed from: b, reason: collision with root package name */
        Object f7855b;

        /* renamed from: c, reason: collision with root package name */
        Object f7856c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f7857d;

        /* renamed from: f, reason: collision with root package name */
        int f7859f;

        C0146b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7857d = obj;
            this.f7859f |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            if (d8 == T5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7860a;

        /* renamed from: c, reason: collision with root package name */
        int f7862c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7860a = obj;
            this.f7862c |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7863a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7864b;

        /* renamed from: d, reason: collision with root package name */
        int f7866d;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7864b = obj;
            this.f7866d |= Integer.MIN_VALUE;
            Object i8 = b.this.i(this);
            if (i8 == T5.b.e()) {
                return i8;
            }
            return s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7867a;

        /* renamed from: b, reason: collision with root package name */
        boolean f7868b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7869c;

        /* renamed from: e, reason: collision with root package name */
        int f7871e;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7869c = obj;
            this.f7871e |= Integer.MIN_VALUE;
            Object j8 = b.this.j(null, false, this);
            if (j8 == T5.b.e()) {
                return j8;
            }
            return s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7872a;

        /* renamed from: c, reason: collision with root package name */
        int f7874c;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7872a = obj;
            this.f7874c |= Integer.MIN_VALUE;
            Object p8 = b.this.p(null, this);
            if (p8 == T5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7875a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7876b;

        /* renamed from: d, reason: collision with root package name */
        int f7878d;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7876b = obj;
            this.f7878d |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, null, null, null, this);
            if (q8 == T5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7879a;

        /* renamed from: b, reason: collision with root package name */
        Object f7880b;

        /* renamed from: c, reason: collision with root package name */
        Object f7881c;

        /* renamed from: d, reason: collision with root package name */
        Object f7882d;

        /* renamed from: e, reason: collision with root package name */
        Object f7883e;

        /* renamed from: f, reason: collision with root package name */
        Object f7884f;

        /* renamed from: g, reason: collision with root package name */
        Object f7885g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f7886h;

        /* renamed from: j, reason: collision with root package name */
        int f7888j;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7886h = obj;
            this.f7888j |= Integer.MIN_VALUE;
            Object r8 = b.this.r(null, null, null, null, null, this);
            if (r8 == T5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f7889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f7890b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f7891a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f7892b;

            /* renamed from: O2.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0147a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7893a;

                /* renamed from: b, reason: collision with root package name */
                int f7894b;

                /* renamed from: c, reason: collision with root package name */
                Object f7895c;

                public C0147a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7893a = obj;
                    this.f7894b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g, b bVar) {
                this.f7891a = interfaceC3707g;
                this.f7892b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, S5.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof O2.b.i.a.C0147a
                    if (r0 == 0) goto L13
                    r0 = r8
                    O2.b$i$a$a r0 = (O2.b.i.a.C0147a) r0
                    int r1 = r0.f7894b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7894b = r1
                    goto L18
                L13:
                    O2.b$i$a$a r0 = new O2.b$i$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f7893a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f7894b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    O5.t.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f7895c
                    o6.g r7 = (o6.InterfaceC3707g) r7
                    O5.t.b(r8)
                    goto L53
                L3c:
                    O5.t.b(r8)
                    o6.g r8 = r6.f7891a
                    R2.b r7 = (R2.b) r7
                    O2.b r2 = r6.f7892b
                    r0.f7895c = r8
                    r0.f7894b = r4
                    java.lang.Object r7 = O2.b.a(r2, r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f7895c = r2
                    r0.f7894b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    O5.I r7 = O5.I.f8278a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: O2.b.i.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3706f interfaceC3706f, b bVar) {
            this.f7889a = interfaceC3706f;
            this.f7890b = bVar;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f7889a.collect(new a(interfaceC3707g, this.f7890b), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return I.f8278a;
        }
    }

    public b(N2.d config, S2.c linkRepository, P2.e linkEventsReporter, n3.i errorReporter) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(linkRepository, "linkRepository");
        AbstractC3255y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f7844a = config;
        this.f7845b = linkRepository;
        this.f7846c = linkEventsReporter;
        this.f7847d = errorReporter;
        w a8 = AbstractC3700N.a(null);
        this.f7848e = a8;
        this.f7849f = a8;
        this.f7851h = new i(a8, this);
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
    public final java.lang.Object e(R2.b r9, S5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof O2.b.c
            if (r0 == 0) goto L14
            r0 = r10
            O2.b$c r0 = (O2.b.c) r0
            int r1 = r0.f7862c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7862c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            O2.b$c r0 = new O2.b$c
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f7860a
            java.lang.Object r0 = T5.b.e()
            int r1 = r4.f7862c
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r9 = r10.j()
            goto L5f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            O5.t.b(r10)
            if (r9 == 0) goto L45
            R2.a r9 = r9.c()
            if (r9 != 0) goto L88
        L45:
            N2.d r9 = r8.f7844a
            N2.d$b r9 = r9.a()
            java.lang.String r9 = r9.b()
            if (r9 == 0) goto L82
            r4.f7862c = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            boolean r10 = O5.s.h(r9)
            if (r10 == 0) goto L72
            R2.b r9 = (R2.b) r9
            if (r9 == 0) goto L6d
            R2.a r7 = r9.c()
        L6d:
            java.lang.Object r9 = O5.s.b(r7)
            goto L76
        L72:
            java.lang.Object r9 = O5.s.b(r9)
        L76:
            java.lang.Throwable r10 = O5.s.e(r9)
            if (r10 != 0) goto L7d
            goto L7f
        L7d:
            R2.a r9 = R2.a.f9620e
        L7f:
            r7 = r9
            R2.a r7 = (R2.a) r7
        L82:
            if (r7 != 0) goto L87
            R2.a r9 = R2.a.f9619d
            goto L88
        L87:
            r9 = r7
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.e(R2.b, S5.d):java.lang.Object");
    }

    private final r g(l lVar) {
        int i8 = a.f7853b[lVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            return r.f31549f;
                        }
                        throw new p();
                    }
                    return r.f31548e;
                }
                return r.f31547d;
            }
            return r.f31546c;
        }
        return r.f31545b;
    }

    public static /* synthetic */ Object k(b bVar, String str, boolean z8, S5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return bVar.j(str, z8, dVar);
    }

    private final void l(String str, String str2) {
        String str3;
        if (str2 != null) {
            this.f7850g = str2;
            return;
        }
        R2.b bVar = (R2.b) this.f7848e.getValue();
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!AbstractC3255y.d(str3, str)) {
            this.f7850g = null;
        }
    }

    private final R2.b m(o oVar, String str) {
        l(oVar.b(), str);
        R2.b bVar = new R2.b(oVar);
        this.f7848e.setValue(bVar);
        return bVar;
    }

    private final R2.b n(o oVar, String str) {
        R2.b m8;
        if (oVar == null || (m8 = m(oVar, str)) == null) {
            this.f7848e.setValue(null);
            this.f7850g = null;
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
    public final java.lang.Object q(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, W2.l r13, S5.d r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof O2.b.g
            if (r0 == 0) goto L14
            r0 = r14
            O2.b$g r0 = (O2.b.g) r0
            int r1 = r0.f7878d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7878d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            O2.b$g r0 = new O2.b$g
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f7876b
            java.lang.Object r0 = T5.b.e()
            int r1 = r7.f7878d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r9 = r7.f7875a
            O2.b r9 = (O2.b) r9
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r10 = r14.j()
            goto L56
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            O5.t.b(r14)
            S2.c r1 = r8.f7845b
            e3.r r6 = r8.g(r13)
            r7.f7875a = r8
            r7.f7878d = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r10 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L55
            return r0
        L55:
            r9 = r8
        L56:
            boolean r11 = O5.s.h(r10)
            if (r11 == 0) goto L6f
            e3.q r10 = (e3.q) r10
            e3.o r11 = r10.a()
            java.lang.String r10 = r10.b()
            R2.b r9 = r9.m(r11, r10)
            java.lang.Object r9 = O5.s.b(r9)
            goto L73
        L6f:
            java.lang.Object r9 = O5.s.b(r10)
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, W2.l, S5.d):java.lang.Object");
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
    public final java.lang.Object r(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, W2.l r22, S5.d r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.r(java.lang.String, java.lang.String, java.lang.String, java.lang.String, W2.l, S5.d):java.lang.Object");
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
    public final java.lang.Object d(com.stripe.android.model.p r17, S5.d r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.d(com.stripe.android.model.p, S5.d):java.lang.Object");
    }

    public final InterfaceC3706f f() {
        return this.f7851h;
    }

    public final InterfaceC3698L h() {
        return this.f7849f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(S5.d r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.i(S5.d):java.lang.Object");
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
    public final java.lang.Object j(java.lang.String r5, boolean r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof O2.b.e
            if (r0 == 0) goto L13
            r0 = r7
            O2.b$e r0 = (O2.b.e) r0
            int r1 = r0.f7871e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7871e = r1
            goto L18
        L13:
            O2.b$e r0 = new O2.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7869c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7871e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.f7868b
            java.lang.Object r5 = r0.f7867a
            O2.b r5 = (O2.b) r5
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r7 = r7.j()
            goto L50
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            O5.t.b(r7)
            S2.c r7 = r4.f7845b
            r0.f7867a = r4
            r0.f7868b = r6
            r0.f7871e = r3
            java.lang.Object r7 = r7.d(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            java.lang.Throwable r0 = O5.s.e(r7)
            if (r0 == 0) goto L5b
            P2.e r1 = r5.f7846c
            r1.i(r0)
        L5b:
            boolean r0 = O5.s.h(r7)
            if (r0 == 0) goto L6c
            e3.p r7 = (e3.p) r7
            R2.b r5 = r5.o(r7, r6)
            java.lang.Object r5 = O5.s.b(r5)
            goto L70
        L6c:
            java.lang.Object r5 = O5.s.b(r7)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.j(java.lang.String, boolean, S5.d):java.lang.Object");
    }

    public final R2.b o(e3.p lookup, boolean z8) {
        AbstractC3255y.i(lookup, "lookup");
        o a8 = lookup.a();
        if (a8 != null) {
            if (z8) {
                return n(a8, lookup.b());
            }
            return new R2.b(a8);
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
    public final java.lang.Object p(W2.m r9, S5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof O2.b.f
            if (r0 == 0) goto L14
            r0 = r10
            O2.b$f r0 = (O2.b.f) r0
            int r1 = r0.f7874c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7874c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            O2.b$f r0 = new O2.b$f
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f7872a
            java.lang.Object r0 = T5.b.e()
            int r1 = r7.f7874c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L47
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r9 = r10.j()
            goto Laf
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r9 = r10.j()
            goto L62
        L47:
            O5.t.b(r10)
            boolean r10 = r9 instanceof W2.m.a
            if (r10 == 0) goto L8a
            W2.m$a r9 = (W2.m.a) r9
            java.lang.String r2 = r9.a()
            r7.f7874c = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r4 = r7
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L62
            return r0
        L62:
            boolean r10 = O5.s.h(r9)
            if (r10 == 0) goto L85
            R2.b r9 = (R2.b) r9     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L73
            java.lang.Object r9 = O5.s.b(r9)     // Catch: java.lang.Throwable -> L71
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
            O5.s$a r10 = O5.s.f8302b
            java.lang.Object r9 = O5.t.a(r9)
        L85:
            java.lang.Object r9 = O5.s.b(r9)
        L89:
            return r9
        L8a:
            boolean r10 = r9 instanceof W2.m.b
            if (r10 == 0) goto Lb0
            W2.m$b r9 = (W2.m.b) r9
            java.lang.String r10 = r9.c()
            java.lang.String r4 = r9.b()
            java.lang.String r3 = r9.e()
            java.lang.String r5 = r9.d()
            W2.l r6 = r9.a()
            r7.f7874c = r2
            r1 = r8
            r2 = r10
            java.lang.Object r9 = r1.r(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Laf
            return r0
        Laf:
            return r9
        Lb0:
            O5.p r9 = new O5.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.p(W2.m, S5.d):java.lang.Object");
    }
}
