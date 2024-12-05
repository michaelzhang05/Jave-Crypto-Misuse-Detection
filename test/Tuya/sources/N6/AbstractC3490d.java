package n6;

/* renamed from: n6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC3490d {

    /* renamed from: a */
    private static final C3486F f36259a = new C3486F("CLOSED");

    public static final AbstractC3491e b(AbstractC3491e abstractC3491e) {
        while (true) {
            Object f8 = abstractC3491e.f();
            if (f8 == f36259a) {
                return abstractC3491e;
            }
            AbstractC3491e abstractC3491e2 = (AbstractC3491e) f8;
            if (abstractC3491e2 == null) {
                if (abstractC3491e.j()) {
                    return abstractC3491e;
                }
            } else {
                abstractC3491e = abstractC3491e2;
            }
        }
    }

    public static final Object c(AbstractC3483C abstractC3483C, long j8, X5.n nVar) {
        while (true) {
            if (abstractC3483C.f36233c < j8 || abstractC3483C.h()) {
                Object f8 = abstractC3483C.f();
                if (f8 == f36259a) {
                    return AbstractC3484D.a(f36259a);
                }
                AbstractC3483C abstractC3483C2 = (AbstractC3483C) ((AbstractC3491e) f8);
                if (abstractC3483C2 == null) {
                    abstractC3483C2 = (AbstractC3483C) nVar.invoke(Long.valueOf(abstractC3483C.f36233c + 1), abstractC3483C);
                    if (abstractC3483C.l(abstractC3483C2)) {
                        if (abstractC3483C.h()) {
                            abstractC3483C.k();
                        }
                    }
                }
                abstractC3483C = abstractC3483C2;
            } else {
                return AbstractC3484D.a(abstractC3483C);
            }
        }
    }
}
