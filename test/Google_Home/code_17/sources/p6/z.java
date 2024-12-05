package p6;

import O5.I;
import a6.InterfaceC1668n;
import o6.InterfaceC3707g;
import q6.J;

/* loaded from: classes5.dex */
final class z implements InterfaceC3707g {

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f37975a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37976b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1668n f37977c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37978a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f37980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            super(2, dVar);
            this.f37980c = interfaceC3707g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f37980c, dVar);
            aVar.f37979b = obj;
            return aVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(Object obj, S5.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f37978a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                Object obj2 = this.f37979b;
                InterfaceC3707g interfaceC3707g = this.f37980c;
                this.f37978a = 1;
                if (interfaceC3707g.emit(obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    public z(InterfaceC3707g interfaceC3707g, S5.g gVar) {
        this.f37975a = gVar;
        this.f37976b = J.b(gVar);
        this.f37977c = new a(interfaceC3707g, null);
    }

    @Override // o6.InterfaceC3707g
    public Object emit(Object obj, S5.d dVar) {
        Object b8 = f.b(this.f37975a, obj, this.f37976b, this.f37977c, dVar);
        if (b8 == T5.b.e()) {
            return b8;
        }
        return I.f8278a;
    }
}
