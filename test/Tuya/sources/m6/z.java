package m6;

import L5.I;
import l6.InterfaceC3359g;
import n6.J;

/* loaded from: classes5.dex */
final class z implements InterfaceC3359g {

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f35949a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35950b;

    /* renamed from: c, reason: collision with root package name */
    private final X5.n f35951c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35952a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f35954c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            super(2, dVar);
            this.f35954c = interfaceC3359g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f35954c, dVar);
            aVar.f35953b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(Object obj, P5.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f35952a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                Object obj2 = this.f35953b;
                InterfaceC3359g interfaceC3359g = this.f35954c;
                this.f35952a = 1;
                if (interfaceC3359g.emit(obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public z(InterfaceC3359g interfaceC3359g, P5.g gVar) {
        this.f35949a = gVar;
        this.f35950b = J.b(gVar);
        this.f35951c = new a(interfaceC3359g, null);
    }

    @Override // l6.InterfaceC3359g
    public Object emit(Object obj, P5.d dVar) {
        Object b8 = f.b(this.f35949a, obj, this.f35950b, this.f35951c, dVar);
        if (b8 == Q5.b.e()) {
            return b8;
        }
        return I.f6487a;
    }
}
