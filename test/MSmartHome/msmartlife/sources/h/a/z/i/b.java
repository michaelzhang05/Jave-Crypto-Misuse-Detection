package h.a.z.i;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k.a.c;

/* compiled from: SubscriptionHelper.java */
/* loaded from: classes2.dex */
public enum b implements c {
    CANCELLED;

    public static boolean B(c cVar, c cVar2) {
        if (cVar2 == null) {
            h.a.a0.a.o(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        n();
        return false;
    }

    public static boolean d(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        b bVar = CANCELLED;
        if (cVar == bVar || (andSet = atomicReference.getAndSet(bVar)) == bVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void f(AtomicReference<c> atomicReference, AtomicLong atomicLong, long j2) {
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j2);
            return;
        }
        if (r(j2)) {
            h.a.z.j.b.a(atomicLong, j2);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean i(AtomicReference<c> atomicReference, AtomicLong atomicLong, c cVar) {
        if (!o(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static void n() {
        h.a.a0.a.o(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean o(AtomicReference<c> atomicReference, c cVar) {
        h.a.z.b.b.c(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        n();
        return false;
    }

    public static boolean r(long j2) {
        if (j2 > 0) {
            return true;
        }
        h.a.a0.a.o(new IllegalArgumentException("n > 0 required but it was " + j2));
        return false;
    }

    @Override // k.a.c
    public void cancel() {
    }

    @Override // k.a.c
    public void request(long j2) {
    }
}
