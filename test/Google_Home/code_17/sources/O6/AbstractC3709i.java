package o6;

import a6.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3709i {

    /* renamed from: o6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f36642a;

        public a(Object obj) {
            this.f36642a = obj;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object emit = interfaceC3707g.emit(this.f36642a, dVar);
            if (emit == T5.b.e()) {
                return emit;
            }
            return O5.I.f8278a;
        }
    }

    public static final InterfaceC3706f a(InterfaceC1668n interfaceC1668n) {
        return new C3702b(interfaceC1668n, null, 0, null, 14, null);
    }

    public static final InterfaceC3706f b(InterfaceC1668n interfaceC1668n) {
        return new C3704d(interfaceC1668n, null, 0, null, 14, null);
    }

    public static final InterfaceC3706f c(InterfaceC1668n interfaceC1668n) {
        return new z(interfaceC1668n);
    }

    public static final InterfaceC3706f d(Object obj) {
        return new a(obj);
    }
}
