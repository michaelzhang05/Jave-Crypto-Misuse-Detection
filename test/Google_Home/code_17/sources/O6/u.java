package o6;

import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import a6.InterfaceC1671q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f36795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1670p f36796b;

        /* renamed from: o6.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0822a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f36797a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f36798b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f36799c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1670p f36800d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0822a(S5.d dVar, InterfaceC1670p interfaceC1670p) {
                super(3, dVar);
                this.f36800d = interfaceC1670p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3707g interfaceC3707g;
                Object e8 = T5.b.e();
                int i8 = this.f36797a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            O5.t.b(obj);
                            return O5.I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3707g = (InterfaceC3707g) this.f36798b;
                    O5.t.b(obj);
                } else {
                    O5.t.b(obj);
                    interfaceC3707g = (InterfaceC3707g) this.f36798b;
                    Object[] objArr = (Object[]) this.f36799c;
                    InterfaceC1670p interfaceC1670p = this.f36800d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f36798b = interfaceC3707g;
                    this.f36797a = 1;
                    AbstractC3253w.c(6);
                    obj = interfaceC1670p.invoke(obj2, obj3, obj4, this);
                    AbstractC3253w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f36798b = null;
                this.f36797a = 2;
                if (interfaceC3707g.emit(obj, this) == e8) {
                    return e8;
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0822a c0822a = new C0822a(dVar, this.f36800d);
                c0822a.f36798b = interfaceC3707g;
                c0822a.f36799c = objArr;
                return c0822a.invokeSuspend(O5.I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr, InterfaceC1670p interfaceC1670p) {
            this.f36795a = interfaceC3706fArr;
            this.f36796b = interfaceC1670p;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object a8 = p6.k.a(interfaceC3707g, this.f36795a, u.a(), new C0822a(null, this.f36796b), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f36801a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1671q f36802b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f36803a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f36804b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f36805c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1671q f36806d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(S5.d dVar, InterfaceC1671q interfaceC1671q) {
                super(3, dVar);
                this.f36806d = interfaceC1671q;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3707g interfaceC3707g;
                Object e8 = T5.b.e();
                int i8 = this.f36803a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            O5.t.b(obj);
                            return O5.I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3707g = (InterfaceC3707g) this.f36804b;
                    O5.t.b(obj);
                } else {
                    O5.t.b(obj);
                    interfaceC3707g = (InterfaceC3707g) this.f36804b;
                    Object[] objArr = (Object[]) this.f36805c;
                    InterfaceC1671q interfaceC1671q = this.f36806d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f36804b = interfaceC3707g;
                    this.f36803a = 1;
                    AbstractC3253w.c(6);
                    obj = interfaceC1671q.invoke(obj2, obj3, obj4, obj5, this);
                    AbstractC3253w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f36804b = null;
                this.f36803a = 2;
                if (interfaceC3707g.emit(obj, this) == e8) {
                    return e8;
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                a aVar = new a(dVar, this.f36806d);
                aVar.f36804b = interfaceC3707g;
                aVar.f36805c = objArr;
                return aVar.invokeSuspend(O5.I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr, InterfaceC1671q interfaceC1671q) {
            this.f36801a = interfaceC3706fArr;
            this.f36802b = interfaceC1671q;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object a8 = p6.k.a(interfaceC3707g, this.f36801a, u.a(), new a(null, this.f36802b), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f36809c;

        public c(InterfaceC3706f interfaceC3706f, InterfaceC3706f interfaceC3706f2, InterfaceC1669o interfaceC1669o) {
            this.f36807a = interfaceC3706f;
            this.f36808b = interfaceC3706f2;
            this.f36809c = interfaceC1669o;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object a8 = p6.k.a(interfaceC3707g, new InterfaceC3706f[]{this.f36807a, this.f36808b}, u.a(), new d(this.f36809c, null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f36810a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36811b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36812c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f36813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1669o interfaceC1669o, S5.d dVar) {
            super(3, dVar);
            this.f36813d = interfaceC1669o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3707g interfaceC3707g;
            Object e8 = T5.b.e();
            int i8 = this.f36810a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3707g = (InterfaceC3707g) this.f36811b;
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                interfaceC3707g = (InterfaceC3707g) this.f36811b;
                Object[] objArr = (Object[]) this.f36812c;
                InterfaceC1669o interfaceC1669o = this.f36813d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f36811b = interfaceC3707g;
                this.f36810a = 1;
                obj = interfaceC1669o.invoke(obj2, obj3, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f36811b = null;
            this.f36810a = 2;
            if (interfaceC3707g.emit(obj, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1669o
        public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
            d dVar2 = new d(this.f36813d, dVar);
            dVar2.f36811b = interfaceC3707g;
            dVar2.f36812c = objArr;
            return dVar2.invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f36814a = new e();

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

    public static final InterfaceC3706f b(InterfaceC3706f interfaceC3706f, InterfaceC3706f interfaceC3706f2, InterfaceC1669o interfaceC1669o) {
        return AbstractC3708h.A(interfaceC3706f, interfaceC3706f2, interfaceC1669o);
    }

    public static final InterfaceC3706f c(InterfaceC3706f interfaceC3706f, InterfaceC3706f interfaceC3706f2, InterfaceC3706f interfaceC3706f3, InterfaceC1670p interfaceC1670p) {
        return new a(new InterfaceC3706f[]{interfaceC3706f, interfaceC3706f2, interfaceC3706f3}, interfaceC1670p);
    }

    public static final InterfaceC3706f d(InterfaceC3706f interfaceC3706f, InterfaceC3706f interfaceC3706f2, InterfaceC3706f interfaceC3706f3, InterfaceC3706f interfaceC3706f4, InterfaceC1671q interfaceC1671q) {
        return new b(new InterfaceC3706f[]{interfaceC3706f, interfaceC3706f2, interfaceC3706f3, interfaceC3706f4}, interfaceC1671q);
    }

    public static final InterfaceC3706f e(InterfaceC3706f interfaceC3706f, InterfaceC3706f interfaceC3706f2, InterfaceC1669o interfaceC1669o) {
        return new c(interfaceC3706f, interfaceC3706f2, interfaceC1669o);
    }

    private static final Function0 f() {
        return e.f36814a;
    }
}
