package l6;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f34778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.p f34779b;

        /* renamed from: l6.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0792a extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f34780a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f34781b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34782c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ X5.p f34783d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0792a(P5.d dVar, X5.p pVar) {
                super(3, dVar);
                this.f34783d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3359g interfaceC3359g;
                Object e8 = Q5.b.e();
                int i8 = this.f34780a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            L5.t.b(obj);
                            return L5.I.f6487a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3359g = (InterfaceC3359g) this.f34781b;
                    L5.t.b(obj);
                } else {
                    L5.t.b(obj);
                    interfaceC3359g = (InterfaceC3359g) this.f34781b;
                    Object[] objArr = (Object[]) this.f34782c;
                    X5.p pVar = this.f34783d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f34781b = interfaceC3359g;
                    this.f34780a = 1;
                    AbstractC3157w.c(6);
                    obj = pVar.invoke(obj2, obj3, obj4, this);
                    AbstractC3157w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f34781b = null;
                this.f34780a = 2;
                if (interfaceC3359g.emit(obj, this) == e8) {
                    return e8;
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0792a c0792a = new C0792a(dVar, this.f34783d);
                c0792a.f34781b = interfaceC3359g;
                c0792a.f34782c = objArr;
                return c0792a.invokeSuspend(L5.I.f6487a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr, X5.p pVar) {
            this.f34778a = interfaceC3358fArr;
            this.f34779b = pVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, this.f34778a, t.a(), new C0792a(null, this.f34779b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f34784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.q f34785b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f34786a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f34787b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34788c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ X5.q f34789d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(P5.d dVar, X5.q qVar) {
                super(3, dVar);
                this.f34789d = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3359g interfaceC3359g;
                Object e8 = Q5.b.e();
                int i8 = this.f34786a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            L5.t.b(obj);
                            return L5.I.f6487a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3359g = (InterfaceC3359g) this.f34787b;
                    L5.t.b(obj);
                } else {
                    L5.t.b(obj);
                    interfaceC3359g = (InterfaceC3359g) this.f34787b;
                    Object[] objArr = (Object[]) this.f34788c;
                    X5.q qVar = this.f34789d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f34787b = interfaceC3359g;
                    this.f34786a = 1;
                    AbstractC3157w.c(6);
                    obj = qVar.invoke(obj2, obj3, obj4, obj5, this);
                    AbstractC3157w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f34787b = null;
                this.f34786a = 2;
                if (interfaceC3359g.emit(obj, this) == e8) {
                    return e8;
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                a aVar = new a(dVar, this.f34789d);
                aVar.f34787b = interfaceC3359g;
                aVar.f34788c = objArr;
                return aVar.invokeSuspend(L5.I.f6487a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr, X5.q qVar) {
            this.f34784a = interfaceC3358fArr;
            this.f34785b = qVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, this.f34784a, t.a(), new a(null, this.f34785b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X5.o f34792c;

        public c(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
            this.f34790a = interfaceC3358f;
            this.f34791b = interfaceC3358f2;
            this.f34792c = oVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, new InterfaceC3358f[]{this.f34790a, this.f34791b}, t.a(), new d(this.f34792c, null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f34793a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34794b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.o f34796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(X5.o oVar, P5.d dVar) {
            super(3, dVar);
            this.f34796d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3359g interfaceC3359g;
            Object e8 = Q5.b.e();
            int i8 = this.f34793a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3359g = (InterfaceC3359g) this.f34794b;
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                interfaceC3359g = (InterfaceC3359g) this.f34794b;
                Object[] objArr = (Object[]) this.f34795c;
                X5.o oVar = this.f34796d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f34794b = interfaceC3359g;
                this.f34793a = 1;
                obj = oVar.invoke(obj2, obj3, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f34794b = null;
            this.f34793a = 2;
            if (interfaceC3359g.emit(obj, this) == e8) {
                return e8;
            }
            return L5.I.f6487a;
        }

        @Override // X5.o
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
            d dVar2 = new d(this.f34796d, dVar);
            dVar2.f34794b = interfaceC3359g;
            dVar2.f34795c = objArr;
            return dVar2.invokeSuspend(L5.I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f34797a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ Function0 a() {
        return f();
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
        return AbstractC3360h.y(interfaceC3358f, interfaceC3358f2, oVar);
    }

    public static final InterfaceC3358f c(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, InterfaceC3358f interfaceC3358f3, X5.p pVar) {
        return new a(new InterfaceC3358f[]{interfaceC3358f, interfaceC3358f2, interfaceC3358f3}, pVar);
    }

    public static final InterfaceC3358f d(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, InterfaceC3358f interfaceC3358f3, InterfaceC3358f interfaceC3358f4, X5.q qVar) {
        return new b(new InterfaceC3358f[]{interfaceC3358f, interfaceC3358f2, interfaceC3358f3, interfaceC3358f4}, qVar);
    }

    public static final InterfaceC3358f e(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
        return new c(interfaceC3358f, interfaceC3358f2, oVar);
    }

    private static final Function0 f() {
        return e.f34797a;
    }
}
