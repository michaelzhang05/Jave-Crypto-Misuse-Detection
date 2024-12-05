package y4;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import a6.InterfaceC1671q;
import a6.InterfaceC1672r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public abstract class g {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f40952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1671q f40953b;

        /* renamed from: y4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0931a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f40954a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0931a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f40954a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f40954a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f40955a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f40956b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40957c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1671q f40958d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(S5.d dVar, InterfaceC1671q interfaceC1671q) {
                super(3, dVar);
                this.f40958d = interfaceC1671q;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f40955a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40956b;
                    Object[] objArr = (Object[]) this.f40957c;
                    Object invoke = this.f40958d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                    this.f40955a = 1;
                    if (interfaceC3707g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar, this.f40958d);
                bVar.f40956b = interfaceC3707g;
                bVar.f40957c = objArr;
                return bVar.invokeSuspend(I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr, InterfaceC1671q interfaceC1671q) {
            this.f40952a = interfaceC3706fArr;
            this.f40953b = interfaceC1671q;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f40952a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0931a(interfaceC3706fArr), new b(null, this.f40953b), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f40959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1672r f40960b;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f40961a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f40961a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f40961a.length];
            }
        }

        /* renamed from: y4.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0932b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f40962a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f40963b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40964c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1672r f40965d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0932b(S5.d dVar, InterfaceC1672r interfaceC1672r) {
                super(3, dVar);
                this.f40965d = interfaceC1672r;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f40962a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40963b;
                    Object[] objArr = (Object[]) this.f40964c;
                    Object invoke = this.f40965d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                    this.f40962a = 1;
                    if (interfaceC3707g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0932b c0932b = new C0932b(dVar, this.f40965d);
                c0932b.f40963b = interfaceC3707g;
                c0932b.f40964c = objArr;
                return c0932b.invokeSuspend(I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr, InterfaceC1672r interfaceC1672r) {
            this.f40959a = interfaceC3706fArr;
            this.f40960b = interfaceC1672r;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f40959a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new C0932b(null, this.f40960b), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1672r f40966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40972g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1672r interfaceC1672r, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4, InterfaceC3698L interfaceC3698L5, InterfaceC3698L interfaceC3698L6) {
            super(0);
            this.f40966a = interfaceC1672r;
            this.f40967b = interfaceC3698L;
            this.f40968c = interfaceC3698L2;
            this.f40969d = interfaceC3698L3;
            this.f40970e = interfaceC3698L4;
            this.f40971f = interfaceC3698L5;
            this.f40972g = interfaceC3698L6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40966a.invoke(this.f40967b.getValue(), this.f40968c.getValue(), this.f40969d.getValue(), this.f40970e.getValue(), this.f40971f.getValue(), this.f40972g.getValue());
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class d extends C3252v implements InterfaceC1669o {
        d(Object obj) {
            super(3, obj, AbstractC3255y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, S5.d dVar) {
            return g.i((InterfaceC1668n) this.receiver, obj, obj2, dVar);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f40973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40974b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC1668n interfaceC1668n, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2) {
            super(0);
            this.f40973a = interfaceC1668n;
            this.f40974b = interfaceC3698L;
            this.f40975c = interfaceC3698L2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40973a.invoke(this.f40974b.getValue(), this.f40975c.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends C3252v implements InterfaceC1670p {
        f(Object obj) {
            super(4, obj, AbstractC3255y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // a6.InterfaceC1670p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, S5.d dVar) {
            return g.j((InterfaceC1669o) this.receiver, obj, obj2, obj3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0933g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f40976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0933g(InterfaceC1669o interfaceC1669o, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3) {
            super(0);
            this.f40976a = interfaceC1669o;
            this.f40977b = interfaceC3698L;
            this.f40978c = interfaceC3698L2;
            this.f40979d = interfaceC3698L3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40976a.invoke(this.f40977b.getValue(), this.f40978c.getValue(), this.f40979d.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends C3252v implements InterfaceC1671q {
        h(Object obj) {
            super(5, obj, AbstractC3255y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // a6.InterfaceC1671q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, S5.d dVar) {
            return g.k((InterfaceC1670p) this.receiver, obj, obj2, obj3, obj4, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1670p f40980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40981b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40982c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40983d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40984e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC1670p interfaceC1670p, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4) {
            super(0);
            this.f40980a = interfaceC1670p;
            this.f40981b = interfaceC3698L;
            this.f40982c = interfaceC3698L2;
            this.f40983d = interfaceC3698L3;
            this.f40984e = interfaceC3698L4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40980a.invoke(this.f40981b.getValue(), this.f40982c.getValue(), this.f40983d.getValue(), this.f40984e.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1671q f40985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40987c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40988d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40989e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC1671q interfaceC1671q, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4, InterfaceC3698L interfaceC3698L5) {
            super(0);
            this.f40985a = interfaceC1671q;
            this.f40986b = interfaceC3698L;
            this.f40987c = interfaceC3698L2;
            this.f40988d = interfaceC3698L3;
            this.f40989e = interfaceC3698L4;
            this.f40990f = interfaceC3698L5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f40985a.invoke(this.f40986b.getValue(), this.f40987c.getValue(), this.f40988d.getValue(), this.f40989e.getValue(), this.f40990f.getValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f40991a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40992b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f40994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(S5.d dVar, Function1 function1) {
            super(3, dVar);
            this.f40994d = function1;
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3707g interfaceC3707g, Object obj, S5.d dVar) {
            k kVar = new k(dVar, this.f40994d);
            kVar.f40992b = interfaceC3707g;
            kVar.f40993c = obj;
            return kVar.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40991a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40992b;
                InterfaceC3706f interfaceC3706f = (InterfaceC3706f) this.f40994d.invoke(this.f40993c);
                this.f40991a = 1;
                if (AbstractC3708h.t(interfaceC3707g, interfaceC3706f, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f40995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f40996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function1 function1, InterfaceC3698L interfaceC3698L) {
            super(0);
            this.f40995a = function1;
            this.f40996b = interfaceC3698L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((InterfaceC3698L) this.f40995a.invoke(this.f40996b.getValue())).getValue();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f40997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f40998b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f40999a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f41000b;

            /* renamed from: y4.g$m$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0934a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f41001a;

                /* renamed from: b, reason: collision with root package name */
                int f41002b;

                public C0934a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f41001a = obj;
                    this.f41002b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g, Function1 function1) {
                this.f40999a = interfaceC3707g;
                this.f41000b = function1;
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
                    boolean r0 = r6 instanceof y4.g.m.a.C0934a
                    if (r0 == 0) goto L13
                    r0 = r6
                    y4.g$m$a$a r0 = (y4.g.m.a.C0934a) r0
                    int r1 = r0.f41002b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f41002b = r1
                    goto L18
                L13:
                    y4.g$m$a$a r0 = new y4.g$m$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f41001a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f41002b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    o6.g r6 = r4.f40999a
                    kotlin.jvm.functions.Function1 r2 = r4.f41000b
                    java.lang.Object r5 = r2.invoke(r5)
                    r0.f41002b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: y4.g.m.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public m(InterfaceC3706f interfaceC3706f, Function1 function1) {
            this.f40997a = interfaceC3706f;
            this.f40998b = function1;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f40997a.collect(new a(interfaceC3707g, this.f40998b), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f41004a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f41005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, InterfaceC3698L interfaceC3698L) {
            super(0);
            this.f41004a = function1;
            this.f41005b = interfaceC3698L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f41004a.invoke(this.f41005b.getValue());
        }
    }

    public static final InterfaceC3698L d(InterfaceC3698L flow1, InterfaceC3698L flow2, InterfaceC1668n transform) {
        AbstractC3255y.i(flow1, "flow1");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(AbstractC3708h.k(flow1, flow2, new d(transform)), new e(transform, flow1, flow2));
    }

    public static final InterfaceC3698L e(InterfaceC3698L flow1, InterfaceC3698L flow2, InterfaceC3698L flow3, InterfaceC1669o transform) {
        AbstractC3255y.i(flow1, "flow1");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(flow3, "flow3");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(AbstractC3708h.l(flow1, flow2, flow3, new f(transform)), new C0933g(transform, flow1, flow2, flow3));
    }

    public static final InterfaceC3698L f(InterfaceC3698L flow1, InterfaceC3698L flow2, InterfaceC3698L flow3, InterfaceC3698L flow4, InterfaceC1670p transform) {
        AbstractC3255y.i(flow1, "flow1");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(flow3, "flow3");
        AbstractC3255y.i(flow4, "flow4");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(AbstractC3708h.m(flow1, flow2, flow3, flow4, new h(transform)), new i(transform, flow1, flow2, flow3, flow4));
    }

    public static final InterfaceC3698L g(InterfaceC3698L flow1, InterfaceC3698L flow2, InterfaceC3698L flow3, InterfaceC3698L flow4, InterfaceC3698L flow5, InterfaceC1671q transform) {
        AbstractC3255y.i(flow1, "flow1");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(flow3, "flow3");
        AbstractC3255y.i(flow4, "flow4");
        AbstractC3255y.i(flow5, "flow5");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(new a((InterfaceC3706f[]) AbstractC1378t.W0(AbstractC1378t.p(flow1, flow2, flow3, flow4, flow5)).toArray(new InterfaceC3706f[0]), transform), new j(transform, flow1, flow2, flow3, flow4, flow5));
    }

    public static final InterfaceC3698L h(InterfaceC3698L flow1, InterfaceC3698L flow2, InterfaceC3698L flow3, InterfaceC3698L flow4, InterfaceC3698L flow5, InterfaceC3698L flow6, InterfaceC1672r transform) {
        AbstractC3255y.i(flow1, "flow1");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(flow3, "flow3");
        AbstractC3255y.i(flow4, "flow4");
        AbstractC3255y.i(flow5, "flow5");
        AbstractC3255y.i(flow6, "flow6");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(new b((InterfaceC3706f[]) AbstractC1378t.W0(AbstractC1378t.p(flow1, flow2, flow3, flow4, flow5, flow6)).toArray(new InterfaceC3706f[0]), transform), new c(transform, flow1, flow2, flow3, flow4, flow5, flow6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object i(InterfaceC1668n interfaceC1668n, Object obj, Object obj2, S5.d dVar) {
        return interfaceC1668n.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object j(InterfaceC1669o interfaceC1669o, Object obj, Object obj2, Object obj3, S5.d dVar) {
        return interfaceC1669o.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object k(InterfaceC1670p interfaceC1670p, Object obj, Object obj2, Object obj3, Object obj4, S5.d dVar) {
        return interfaceC1670p.invoke(obj, obj2, obj3, obj4);
    }

    public static final InterfaceC3698L l(InterfaceC3698L interfaceC3698L, Function1 transform) {
        AbstractC3255y.i(interfaceC3698L, "<this>");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(AbstractC3708h.M(interfaceC3698L, new k(null, transform)), new l(transform, interfaceC3698L));
    }

    public static final InterfaceC3698L m(InterfaceC3698L interfaceC3698L, Function1 transform) {
        AbstractC3255y.i(interfaceC3698L, "<this>");
        AbstractC3255y.i(transform, "transform");
        return new y4.e(new m(interfaceC3698L, transform), new n(transform, interfaceC3698L));
    }

    public static final InterfaceC3698L n(Object obj) {
        return AbstractC3708h.b(AbstractC3700N.a(obj));
    }
}
