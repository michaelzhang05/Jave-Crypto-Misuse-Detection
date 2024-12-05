package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f34718a = n6.G.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f34719a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34720b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f34722d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X5.n nVar, P5.d dVar) {
            super(3, dVar);
            this.f34722d = nVar;
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object obj, P5.d dVar) {
            a aVar = new a(this.f34722d, dVar);
            aVar.f34720b = interfaceC3359g;
            aVar.f34721c = obj;
            return aVar.invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3359g interfaceC3359g;
            Object e8 = Q5.b.e();
            int i8 = this.f34719a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3359g = (InterfaceC3359g) this.f34720b;
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                interfaceC3359g = (InterfaceC3359g) this.f34720b;
                Object obj2 = this.f34721c;
                X5.n nVar = this.f34722d;
                this.f34720b = interfaceC3359g;
                this.f34719a = 1;
                obj = nVar.invoke(obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f34720b = null;
            this.f34719a = 2;
            if (interfaceC3359g.emit(obj, this) == e8) {
                return e8;
            }
            return L5.I.f6487a;
        }
    }

    public static final InterfaceC3358f a(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return AbstractC3360h.K(interfaceC3358f, new a(nVar, null));
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, X5.o oVar) {
        return new m6.i(oVar, interfaceC3358f, null, 0, null, 28, null);
    }
}
