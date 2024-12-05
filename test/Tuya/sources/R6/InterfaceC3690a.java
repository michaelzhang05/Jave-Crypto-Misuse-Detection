package r6;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3690a {

    /* renamed from: r6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0867a {
        public static /* synthetic */ Object a(InterfaceC3690a interfaceC3690a, Object obj, P5.d dVar, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                return interfaceC3690a.b(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(InterfaceC3690a interfaceC3690a, Object obj, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                return interfaceC3690a.a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(InterfaceC3690a interfaceC3690a, Object obj, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                interfaceC3690a.d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a(Object obj);

    Object b(Object obj, P5.d dVar);

    boolean c();

    void d(Object obj);
}
