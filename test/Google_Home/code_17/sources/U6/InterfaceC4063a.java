package u6;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC4063a {

    /* renamed from: u6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0902a {
        public static /* synthetic */ Object a(InterfaceC4063a interfaceC4063a, Object obj, S5.d dVar, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                return interfaceC4063a.a(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(InterfaceC4063a interfaceC4063a, Object obj, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                return interfaceC4063a.b(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(InterfaceC4063a interfaceC4063a, Object obj, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                interfaceC4063a.d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    Object a(Object obj, S5.d dVar);

    boolean b(Object obj);

    boolean c();

    void d(Object obj);
}
