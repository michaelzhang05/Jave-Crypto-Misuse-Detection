package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3361i {

    /* renamed from: l6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34641a;

        public a(Object obj) {
            this.f34641a = obj;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object emit = interfaceC3359g.emit(this.f34641a, dVar);
            if (emit == Q5.b.e()) {
                return emit;
            }
            return L5.I.f6487a;
        }
    }

    public static final InterfaceC3358f a(X5.n nVar) {
        return new C3354b(nVar, null, 0, null, 14, null);
    }

    public static final InterfaceC3358f b(X5.n nVar) {
        return new C3356d(nVar, null, 0, null, 14, null);
    }

    public static final InterfaceC3358f c(X5.n nVar) {
        return new y(nVar);
    }

    public static final InterfaceC3358f d(Object obj) {
        return new a(obj);
    }
}
