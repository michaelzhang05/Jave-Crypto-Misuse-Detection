package J3;

import J3.V;
import L5.C1224h;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.U0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import q3.C3649b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* renamed from: J3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1203k implements V {

    /* renamed from: r, reason: collision with root package name */
    public static final h f5243r = new h(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f5244s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f5245a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f5246b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f5247c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f5248d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f5249e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f5250f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f5251g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f5252h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f5253i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f5254j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f5255k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f5256l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5257m;

    /* renamed from: n, reason: collision with root package name */
    private final i6.M f5258n;

    /* renamed from: o, reason: collision with root package name */
    private final l6.v f5259o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f5260p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f5261q;

    /* renamed from: J3.k$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5262a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0103a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5264a;

            C0103a(C1203k c1203k) {
                this.f5264a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5264a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, list, null, false, false, false, false, 62, null)));
                return L5.I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5262a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5245a;
                C0103a c0103a = new C0103a(C1203k.this);
                this.f5262a = 1;
                if (interfaceC3349K.collect(c0103a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5265a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5267a;

            a(C1203k c1203k) {
                this.f5267a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5267a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, z8, false, false, false, 59, null)));
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5265a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5246b;
                a aVar = new a(C1203k.this);
                this.f5265a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5268a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5270a;

            a(C1203k c1203k) {
                this.f5270a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5270a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, false, z8, false, 47, null)));
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5268a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5247c;
                a aVar = new a(C1203k.this);
                this.f5268a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5271a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5273a;

            a(C1203k c1203k) {
                this.f5273a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5273a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, false, false, z8, 31, null)));
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5271a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5248d;
                a aVar = new a(C1203k.this);
                this.f5271a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$e */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5274a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5276a;

            a(C1203k c1203k) {
                this.f5276a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5276a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, z8, false, false, 55, null)));
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5274a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5250f;
                a aVar = new a(C1203k.this);
                this.f5274a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5277a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5279a;

            a(C1203k c1203k) {
                this.f5279a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                this.f5279a.f5259o.setValue(abstractC3991f);
                return L5.I.f6487a;
            }
        }

        /* renamed from: J3.k$f$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f5280a;

            /* renamed from: J3.k$f$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f5281a;

                /* renamed from: J3.k$f$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0104a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f5282a;

                    /* renamed from: b, reason: collision with root package name */
                    int f5283b;

                    public C0104a(P5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5282a = obj;
                        this.f5283b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3359g interfaceC3359g) {
                    this.f5281a = interfaceC3359g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // l6.InterfaceC3359g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof J3.C1203k.f.b.a.C0104a
                        if (r0 == 0) goto L13
                        r0 = r7
                        J3.k$f$b$a$a r0 = (J3.C1203k.f.b.a.C0104a) r0
                        int r1 = r0.f5283b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f5283b = r1
                        goto L18
                    L13:
                        J3.k$f$b$a$a r0 = new J3.k$f$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f5282a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f5283b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        L5.t.b(r7)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        L5.t.b(r7)
                        l6.g r7 = r5.f5281a
                        r2 = r6
                        y3.f r2 = (y3.AbstractC3991f) r2
                        boolean r4 = r2 instanceof y3.AbstractC3991f.C0916f
                        if (r4 != 0) goto L4d
                        y3.f$d r4 = y3.AbstractC3991f.d.f39777a
                        boolean r4 = kotlin.jvm.internal.AbstractC3159y.d(r2, r4)
                        if (r4 != 0) goto L4d
                        y3.f$c r4 = y3.AbstractC3991f.c.f39776a
                        boolean r2 = kotlin.jvm.internal.AbstractC3159y.d(r2, r4)
                        if (r2 == 0) goto L56
                    L4d:
                        r0.f5283b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        L5.I r6 = L5.I.f6487a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J3.C1203k.f.b.a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3358f interfaceC3358f) {
                this.f5280a = interfaceC3358f;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                Object collect = this.f5280a.collect(new a(interfaceC3359g), dVar);
                if (collect == Q5.b.e()) {
                    return collect;
                }
                return L5.I.f6487a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5277a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                b bVar = new b(C1203k.this.f5251g);
                a aVar = new a(C1203k.this);
                this.f5277a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* renamed from: J3.k$g */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5285a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5287a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1203k c1203k) {
                super(3);
                this.f5287a = c1203k;
            }

            @Override // X5.o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.p invoke(AbstractC3991f abstractC3991f, com.stripe.android.model.o oVar, List paymentOptionsItems) {
                AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
                return this.f5287a.n(abstractC3991f, oVar, paymentOptionsItems);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$g$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5288a;

            b(C1203k c1203k) {
                this.f5288a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.paymentsheet.p pVar, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5288a.f5260p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, pVar, false, false, false, false, 61, null)));
                return L5.I.f6487a;
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5285a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = v4.g.e(C1203k.this.f5259o, C1203k.this.f5252h, C1203k.this.f5245a, new a(C1203k.this));
                b bVar = new b(C1203k.this);
                this.f5285a = 1;
                if (e9.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function0 {
            a(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.B.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m30invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30invoke() {
                ((com.stripe.android.paymentsheet.B) this.receiver).x();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f5289a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f5290b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M3.a aVar, Y2.d dVar) {
                super(0);
                this.f5289a = aVar;
                this.f5290b = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m31invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
                this.f5289a.r().m(new InterfaceC4021c.a(C1201i.f5189r.a(this.f5289a, this.f5290b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3156v implements Function1 {
            c(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "modifyPaymentMethod", "modifyPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3159y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).s(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3156v implements Function1 {
            d(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3159y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$e */
        /* loaded from: classes4.dex */
        public /* synthetic */ class e extends C3156v implements Function1 {
            e(Object obj) {
                super(1, obj, M3.a.class, "handlePaymentMethodSelected", "handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(AbstractC3991f abstractC3991f) {
                ((M3.a) this.receiver).E(abstractC3991f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((AbstractC3991f) obj);
                return L5.I.f6487a;
            }
        }

        private h() {
        }

        public final V a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder, com.stripe.android.paymentsheet.B savedPaymentMethodMutator) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            AbstractC3159y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new C1203k(savedPaymentMethodMutator.o(), savedPaymentMethodMutator.n(), savedPaymentMethodMutator.l(), savedPaymentMethodMutator.m(), new a(savedPaymentMethodMutator), viewModel.v(), viewModel.y(), customerStateHolder.b(), new b(viewModel, paymentMethodMetadata), new c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.V().a());
        }

        public /* synthetic */ h(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1203k(InterfaceC3349K paymentOptionsItems, InterfaceC3349K editing, InterfaceC3349K canEdit, InterfaceC3349K canRemove, Function0 toggleEdit, InterfaceC3349K isProcessing, InterfaceC3349K currentSelection, InterfaceC3349K mostRecentlySelectedSavedPaymentMethod, Function0 onAddCardPressed, Function1 onEditPaymentMethod, Function1 onDeletePaymentMethod, Function1 onPaymentMethodSelected, boolean z8) {
        AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3159y.i(editing, "editing");
        AbstractC3159y.i(canEdit, "canEdit");
        AbstractC3159y.i(canRemove, "canRemove");
        AbstractC3159y.i(toggleEdit, "toggleEdit");
        AbstractC3159y.i(isProcessing, "isProcessing");
        AbstractC3159y.i(currentSelection, "currentSelection");
        AbstractC3159y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3159y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3159y.i(onPaymentMethodSelected, "onPaymentMethodSelected");
        this.f5245a = paymentOptionsItems;
        this.f5246b = editing;
        this.f5247c = canEdit;
        this.f5248d = canRemove;
        this.f5249e = toggleEdit;
        this.f5250f = isProcessing;
        this.f5251g = currentSelection;
        this.f5252h = mostRecentlySelectedSavedPaymentMethod;
        this.f5253i = onAddCardPressed;
        this.f5254j = onEditPaymentMethod;
        this.f5255k = onDeletePaymentMethod;
        this.f5256l = onPaymentMethodSelected;
        this.f5257m = z8;
        i6.M a8 = i6.N.a(C2812b0.d().plus(U0.b(null, 1, null)));
        this.f5258n = a8;
        this.f5259o = AbstractC3351M.a(null);
        l6.v a9 = AbstractC3351M.a(m());
        this.f5260p = a9;
        this.f5261q = a9;
        AbstractC2829k.d(a8, null, null, new a(null), 3, null);
        AbstractC2829k.d(a8, null, null, new b(null), 3, null);
        AbstractC2829k.d(a8, null, null, new c(null), 3, null);
        AbstractC2829k.d(a8, null, null, new d(null), 3, null);
        AbstractC2829k.d(a8, null, null, new e(null), 3, null);
        AbstractC2829k.d(a8, null, null, new f(null), 3, null);
        AbstractC2829k.d(a8, null, null, new g(null), 3, null);
    }

    private final V.a m() {
        List list = (List) this.f5245a.getValue();
        return new V.a(list, n((AbstractC3991f) this.f5251g.getValue(), (com.stripe.android.model.o) this.f5252h.getValue(), list), ((Boolean) this.f5246b.getValue()).booleanValue(), ((Boolean) this.f5250f.getValue()).booleanValue(), ((Boolean) this.f5247c.getValue()).booleanValue(), ((Boolean) this.f5248d.getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.p n(AbstractC3991f abstractC3991f, com.stripe.android.model.o oVar, List list) {
        boolean d8;
        boolean d9;
        boolean z8;
        boolean z9 = true;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            d8 = true;
        } else {
            d8 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.d.f39777a);
        }
        if (d8) {
            d9 = true;
        } else {
            d9 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.c.f39776a);
        }
        if (!d9) {
            if (abstractC3991f instanceof AbstractC3991f.e) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.b;
            }
            if (!z8 && abstractC3991f != null) {
                z9 = false;
            }
            if (z9) {
                if (oVar != null) {
                    abstractC3991f = new AbstractC3991f.C0916f(oVar, null, null, 6, null);
                } else {
                    abstractC3991f = null;
                }
            } else {
                throw new L5.p();
            }
        }
        return com.stripe.android.paymentsheet.r.f26347a.c(list, abstractC3991f);
    }

    @Override // J3.V
    public boolean a() {
        return this.f5257m;
    }

    @Override // J3.V
    public void b(V.b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof V.b.C0095b) {
            this.f5255k.invoke(((V.b.C0095b) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.c) {
            this.f5254j.invoke(((V.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.d) {
            this.f5256l.invoke(((V.b.d) viewAction).a());
        } else if (AbstractC3159y.d(viewAction, V.b.a.f5126a)) {
            this.f5253i.invoke();
        } else if (AbstractC3159y.d(viewAction, V.b.e.f5132a)) {
            this.f5249e.invoke();
        }
    }

    @Override // J3.V
    public void close() {
        i6.N.d(this.f5258n, null, 1, null);
    }

    @Override // J3.V
    public InterfaceC3349K getState() {
        return this.f5261q;
    }
}
