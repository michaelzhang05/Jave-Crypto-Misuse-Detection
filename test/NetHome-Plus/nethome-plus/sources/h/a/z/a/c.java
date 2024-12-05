package h.a.z.a;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableHelper.java */
/* loaded from: classes2.dex */
public enum c implements h.a.x.c {
    DISPOSED;

    public static boolean B(AtomicReference<h.a.x.c> atomicReference, h.a.x.c cVar) {
        h.a.x.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.d();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.d();
        return true;
    }

    public static boolean C(AtomicReference<h.a.x.c> atomicReference, h.a.x.c cVar) {
        h.a.z.b.b.c(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.d();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        r();
        return false;
    }

    public static boolean D(h.a.x.c cVar, h.a.x.c cVar2) {
        if (cVar2 == null) {
            h.a.a0.a.o(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.d();
        r();
        return false;
    }

    public static boolean i(AtomicReference<h.a.x.c> atomicReference) {
        h.a.x.c andSet;
        h.a.x.c cVar = atomicReference.get();
        c cVar2 = DISPOSED;
        if (cVar == cVar2 || (andSet = atomicReference.getAndSet(cVar2)) == cVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.d();
        return true;
    }

    public static boolean n(h.a.x.c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean o(AtomicReference<h.a.x.c> atomicReference, h.a.x.c cVar) {
        h.a.x.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.d();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static void r() {
        h.a.a0.a.o(new ProtocolViolationException("Disposable already set!"));
    }

    @Override // h.a.x.c
    public void d() {
    }

    @Override // h.a.x.c
    public boolean f() {
        return true;
    }
}
