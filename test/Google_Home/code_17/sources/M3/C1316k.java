package M3;

import B3.f;
import C3.c;
import M3.V;
import O5.C1352h;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import b3.C1970d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.U0;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import t3.C4028b;

/* renamed from: M3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1316k implements V {

    /* renamed from: r, reason: collision with root package name */
    public static final h f6949r = new h(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f6950s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f6951a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f6952b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f6953c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f6954d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f6955e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f6956f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f6957g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f6958h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f6959i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f6960j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6961k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f6962l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f6963m;

    /* renamed from: n, reason: collision with root package name */
    private final l6.M f6964n;

    /* renamed from: o, reason: collision with root package name */
    private final o6.w f6965o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f6966p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f6967q;

    /* renamed from: M3.k$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6968a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0128a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6970a;

            C0128a(C1316k c1316k) {
                this.f6970a = c1316k;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6970a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, list, null, false, false, false, false, 62, null)));
                return O5.I.f8278a;
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6968a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1316k.this.f6951a;
                C0128a c0128a = new C0128a(C1316k.this);
                this.f6968a = 1;
                if (interfaceC3698L.collect(c0128a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6971a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6973a;

            a(C1316k c1316k) {
                this.f6973a = c1316k;
            }

            public final Object a(boolean z8, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6973a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, null, null, z8, false, false, false, 59, null)));
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6971a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1316k.this.f6952b;
                a aVar = new a(C1316k.this);
                this.f6971a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6974a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6976a;

            a(C1316k c1316k) {
                this.f6976a = c1316k;
            }

            public final Object a(boolean z8, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6976a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, null, null, false, false, z8, false, 47, null)));
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6974a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1316k.this.f6953c;
                a aVar = new a(C1316k.this);
                this.f6974a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6977a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6979a;

            a(C1316k c1316k) {
                this.f6979a = c1316k;
            }

            public final Object a(boolean z8, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6979a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, null, null, false, false, false, z8, 31, null)));
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6977a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1316k.this.f6954d;
                a aVar = new a(C1316k.this);
                this.f6977a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$e */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6980a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6982a;

            a(C1316k c1316k) {
                this.f6982a = c1316k;
            }

            public final Object a(boolean z8, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6982a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, null, null, false, z8, false, false, 55, null)));
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6980a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1316k.this.f6956f;
                a aVar = new a(C1316k.this);
                this.f6980a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6983a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6985a;

            a(C1316k c1316k) {
                this.f6985a = c1316k;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.f fVar, S5.d dVar) {
                this.f6985a.f6965o.setValue(fVar);
                return O5.I.f8278a;
            }
        }

        /* renamed from: M3.k$f$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f6986a;

            /* renamed from: M3.k$f$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3707g f6987a;

                /* renamed from: M3.k$f$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0129a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f6988a;

                    /* renamed from: b, reason: collision with root package name */
                    int f6989b;

                    public C0129a(S5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6988a = obj;
                        this.f6989b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3707g interfaceC3707g) {
                    this.f6987a = interfaceC3707g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // o6.InterfaceC3707g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, S5.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof M3.C1316k.f.b.a.C0129a
                        if (r0 == 0) goto L13
                        r0 = r7
                        M3.k$f$b$a$a r0 = (M3.C1316k.f.b.a.C0129a) r0
                        int r1 = r0.f6989b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f6989b = r1
                        goto L18
                    L13:
                        M3.k$f$b$a$a r0 = new M3.k$f$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f6988a
                        java.lang.Object r1 = T5.b.e()
                        int r2 = r0.f6989b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        O5.t.b(r7)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        O5.t.b(r7)
                        o6.g r7 = r5.f6987a
                        r2 = r6
                        B3.f r2 = (B3.f) r2
                        boolean r4 = r2 instanceof B3.f.C0009f
                        if (r4 != 0) goto L4d
                        B3.f$d r4 = B3.f.d.f821a
                        boolean r4 = kotlin.jvm.internal.AbstractC3255y.d(r2, r4)
                        if (r4 != 0) goto L4d
                        B3.f$c r4 = B3.f.c.f820a
                        boolean r2 = kotlin.jvm.internal.AbstractC3255y.d(r2, r4)
                        if (r2 == 0) goto L56
                    L4d:
                        r0.f6989b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        O5.I r6 = O5.I.f8278a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: M3.C1316k.f.b.a.emit(java.lang.Object, S5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3706f interfaceC3706f) {
                this.f6986a = interfaceC3706f;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                Object collect = this.f6986a.collect(new a(interfaceC3707g), dVar);
                if (collect == T5.b.e()) {
                    return collect;
                }
                return O5.I.f8278a;
            }
        }

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6983a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                b bVar = new b(C1316k.this.f6957g);
                a aVar = new a(C1316k.this);
                this.f6983a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$g */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6991a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6993a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1316k c1316k) {
                super(3);
                this.f6993a = c1316k;
            }

            @Override // a6.InterfaceC1669o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.p invoke(B3.f fVar, com.stripe.android.model.o oVar, List paymentOptionsItems) {
                AbstractC3255y.i(paymentOptionsItems, "paymentOptionsItems");
                return this.f6993a.n(fVar, oVar, paymentOptionsItems);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$g$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1316k f6994a;

            b(C1316k c1316k) {
                this.f6994a = c1316k;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.paymentsheet.p pVar, S5.d dVar) {
                Object value;
                o6.w wVar = this.f6994a.f6966p;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, V.a.b((V.a) value, null, pVar, false, false, false, false, 61, null)));
                return O5.I.f8278a;
            }
        }

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6991a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = y4.g.e(C1316k.this.f6965o, C1316k.this.f6958h, C1316k.this.f6951a, new a(C1316k.this));
                b bVar = new b(C1316k.this);
                this.f6991a = 1;
                if (e9.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.k$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$h$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function0 {
            a(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.B.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m35invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m35invoke() {
                ((com.stripe.android.paymentsheet.B) this.receiver).x();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f6995a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1970d f6996b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P3.a aVar, C1970d c1970d) {
                super(0);
                this.f6995a = aVar;
                this.f6996b = c1970d;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m36invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m36invoke() {
                this.f6995a.r().m(new c.a(C1314i.f6895r.a(this.f6995a, this.f6996b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$h$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3252v implements Function1 {
            c(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "modifyPaymentMethod", "modifyPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3255y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).s(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$h$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3252v implements Function1 {
            d(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3255y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.k$h$e */
        /* loaded from: classes4.dex */
        public /* synthetic */ class e extends C3252v implements Function1 {
            e(Object obj) {
                super(1, obj, P3.a.class, "handlePaymentMethodSelected", "handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(B3.f fVar) {
                ((P3.a) this.receiver).E(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((B3.f) obj);
                return O5.I.f8278a;
            }
        }

        private h() {
        }

        public final V a(P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder, com.stripe.android.paymentsheet.B savedPaymentMethodMutator) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(customerStateHolder, "customerStateHolder");
            AbstractC3255y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new C1316k(savedPaymentMethodMutator.o(), savedPaymentMethodMutator.n(), savedPaymentMethodMutator.l(), savedPaymentMethodMutator.m(), new a(savedPaymentMethodMutator), viewModel.v(), viewModel.y(), customerStateHolder.b(), new b(viewModel, paymentMethodMetadata), new c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.W().c());
        }

        public /* synthetic */ h(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1316k(InterfaceC3698L paymentOptionsItems, InterfaceC3698L editing, InterfaceC3698L canEdit, InterfaceC3698L canRemove, Function0 toggleEdit, InterfaceC3698L isProcessing, InterfaceC3698L currentSelection, InterfaceC3698L mostRecentlySelectedSavedPaymentMethod, Function0 onAddCardPressed, Function1 onEditPaymentMethod, Function1 onDeletePaymentMethod, Function1 onPaymentMethodSelected, boolean z8) {
        AbstractC3255y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3255y.i(editing, "editing");
        AbstractC3255y.i(canEdit, "canEdit");
        AbstractC3255y.i(canRemove, "canRemove");
        AbstractC3255y.i(toggleEdit, "toggleEdit");
        AbstractC3255y.i(isProcessing, "isProcessing");
        AbstractC3255y.i(currentSelection, "currentSelection");
        AbstractC3255y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3255y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3255y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3255y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3255y.i(onPaymentMethodSelected, "onPaymentMethodSelected");
        this.f6951a = paymentOptionsItems;
        this.f6952b = editing;
        this.f6953c = canEdit;
        this.f6954d = canRemove;
        this.f6955e = toggleEdit;
        this.f6956f = isProcessing;
        this.f6957g = currentSelection;
        this.f6958h = mostRecentlySelectedSavedPaymentMethod;
        this.f6959i = onAddCardPressed;
        this.f6960j = onEditPaymentMethod;
        this.f6961k = onDeletePaymentMethod;
        this.f6962l = onPaymentMethodSelected;
        this.f6963m = z8;
        l6.M a8 = l6.N.a(C3347b0.d().plus(U0.b(null, 1, null)));
        this.f6964n = a8;
        this.f6965o = AbstractC3700N.a(null);
        o6.w a9 = AbstractC3700N.a(m());
        this.f6966p = a9;
        this.f6967q = a9;
        AbstractC3364k.d(a8, null, null, new a(null), 3, null);
        AbstractC3364k.d(a8, null, null, new b(null), 3, null);
        AbstractC3364k.d(a8, null, null, new c(null), 3, null);
        AbstractC3364k.d(a8, null, null, new d(null), 3, null);
        AbstractC3364k.d(a8, null, null, new e(null), 3, null);
        AbstractC3364k.d(a8, null, null, new f(null), 3, null);
        AbstractC3364k.d(a8, null, null, new g(null), 3, null);
    }

    private final V.a m() {
        List list = (List) this.f6951a.getValue();
        return new V.a(list, n((B3.f) this.f6957g.getValue(), (com.stripe.android.model.o) this.f6958h.getValue(), list), ((Boolean) this.f6952b.getValue()).booleanValue(), ((Boolean) this.f6956f.getValue()).booleanValue(), ((Boolean) this.f6953c.getValue()).booleanValue(), ((Boolean) this.f6954d.getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.p n(B3.f fVar, com.stripe.android.model.o oVar, List list) {
        boolean d8;
        boolean d9;
        boolean z8;
        boolean z9 = true;
        if (fVar instanceof f.C0009f) {
            d8 = true;
        } else {
            d8 = AbstractC3255y.d(fVar, f.d.f821a);
        }
        if (d8) {
            d9 = true;
        } else {
            d9 = AbstractC3255y.d(fVar, f.c.f820a);
        }
        if (!d9) {
            if (fVar instanceof f.e) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.b;
            }
            if (!z8 && fVar != null) {
                z9 = false;
            }
            if (z9) {
                if (oVar != null) {
                    fVar = new f.C0009f(oVar, null, null, 6, null);
                } else {
                    fVar = null;
                }
            } else {
                throw new O5.p();
            }
        }
        return com.stripe.android.paymentsheet.r.f27402a.c(list, fVar);
    }

    @Override // M3.V
    public void a(V.b viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof V.b.C0120b) {
            this.f6961k.invoke(((V.b.C0120b) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.c) {
            this.f6960j.invoke(((V.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.d) {
            this.f6962l.invoke(((V.b.d) viewAction).a());
        } else if (AbstractC3255y.d(viewAction, V.b.a.f6832a)) {
            this.f6959i.invoke();
        } else if (AbstractC3255y.d(viewAction, V.b.e.f6838a)) {
            this.f6955e.invoke();
        }
    }

    @Override // M3.V
    public boolean c() {
        return this.f6963m;
    }

    @Override // M3.V
    public void close() {
        l6.N.d(this.f6964n, null, 1, null);
    }

    @Override // M3.V
    public InterfaceC3698L getState() {
        return this.f6967q;
    }
}
