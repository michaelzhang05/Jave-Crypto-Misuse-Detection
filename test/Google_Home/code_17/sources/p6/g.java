package p6;

import O5.I;
import S5.e;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import l6.H;
import n6.EnumC3487a;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public abstract class g extends e {

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3706f f37912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37913a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37914b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(dVar);
            aVar.f37914b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f37913a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37914b;
                g gVar = g.this;
                this.f37913a = 1;
                if (gVar.q(interfaceC3707g, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            return ((a) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public g(InterfaceC3706f interfaceC3706f, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(gVar, i8, enumC3487a);
        this.f37912d = interfaceC3706f;
    }

    static /* synthetic */ Object n(g gVar, InterfaceC3707g interfaceC3707g, S5.d dVar) {
        if (gVar.f37903b == -3) {
            S5.g context = dVar.getContext();
            S5.g d8 = H.d(context, gVar.f37902a);
            if (AbstractC3255y.d(d8, context)) {
                Object q8 = gVar.q(interfaceC3707g, dVar);
                if (q8 == T5.b.e()) {
                    return q8;
                }
                return I.f8278a;
            }
            e.b bVar = S5.e.f9822a0;
            if (AbstractC3255y.d(d8.get(bVar), context.get(bVar))) {
                Object p8 = gVar.p(interfaceC3707g, d8, dVar);
                if (p8 == T5.b.e()) {
                    return p8;
                }
                return I.f8278a;
            }
        }
        Object collect = super.collect(interfaceC3707g, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    static /* synthetic */ Object o(g gVar, n6.s sVar, S5.d dVar) {
        Object q8 = gVar.q(new w(sVar), dVar);
        if (q8 == T5.b.e()) {
            return q8;
        }
        return I.f8278a;
    }

    private final Object p(InterfaceC3707g interfaceC3707g, S5.g gVar, S5.d dVar) {
        Object c8 = f.c(gVar, f.a(interfaceC3707g, dVar.getContext()), null, new a(null), dVar, 4, null);
        if (c8 == T5.b.e()) {
            return c8;
        }
        return I.f8278a;
    }

    @Override // p6.e, o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        return n(this, interfaceC3707g, dVar);
    }

    @Override // p6.e
    protected Object h(n6.s sVar, S5.d dVar) {
        return o(this, sVar, dVar);
    }

    protected abstract Object q(InterfaceC3707g interfaceC3707g, S5.d dVar);

    @Override // p6.e
    public String toString() {
        return this.f37912d + " -> " + super.toString();
    }
}
