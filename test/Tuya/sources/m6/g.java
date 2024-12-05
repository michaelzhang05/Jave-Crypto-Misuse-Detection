package m6;

import L5.I;
import P5.e;
import i6.H;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public abstract class g extends e {

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3358f f35886d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35887a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35888b;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f35888b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f35887a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35888b;
                g gVar = g.this;
                this.f35887a = 1;
                if (gVar.q(interfaceC3359g, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }

        @Override // X5.n
        public final Object invoke(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            return ((a) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
        }
    }

    public g(InterfaceC3358f interfaceC3358f, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(gVar, i8, enumC3132a);
        this.f35886d = interfaceC3358f;
    }

    static /* synthetic */ Object n(g gVar, InterfaceC3359g interfaceC3359g, P5.d dVar) {
        if (gVar.f35877b == -3) {
            P5.g context = dVar.getContext();
            P5.g d8 = H.d(context, gVar.f35876a);
            if (AbstractC3159y.d(d8, context)) {
                Object q8 = gVar.q(interfaceC3359g, dVar);
                if (q8 == Q5.b.e()) {
                    return q8;
                }
                return I.f6487a;
            }
            e.b bVar = P5.e.f7991a0;
            if (AbstractC3159y.d(d8.get(bVar), context.get(bVar))) {
                Object p8 = gVar.p(interfaceC3359g, d8, dVar);
                if (p8 == Q5.b.e()) {
                    return p8;
                }
                return I.f6487a;
            }
        }
        Object collect = super.collect(interfaceC3359g, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return I.f6487a;
    }

    static /* synthetic */ Object o(g gVar, k6.s sVar, P5.d dVar) {
        Object q8 = gVar.q(new w(sVar), dVar);
        if (q8 == Q5.b.e()) {
            return q8;
        }
        return I.f6487a;
    }

    private final Object p(InterfaceC3359g interfaceC3359g, P5.g gVar, P5.d dVar) {
        Object c8 = f.c(gVar, f.a(interfaceC3359g, dVar.getContext()), null, new a(null), dVar, 4, null);
        if (c8 == Q5.b.e()) {
            return c8;
        }
        return I.f6487a;
    }

    @Override // m6.e, l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return n(this, interfaceC3359g, dVar);
    }

    @Override // m6.e
    protected Object h(k6.s sVar, P5.d dVar) {
        return o(this, sVar, dVar);
    }

    protected abstract Object q(InterfaceC3359g interfaceC3359g, P5.d dVar);

    @Override // m6.e
    public String toString() {
        return this.f35886d + " -> " + super.toString();
    }
}
