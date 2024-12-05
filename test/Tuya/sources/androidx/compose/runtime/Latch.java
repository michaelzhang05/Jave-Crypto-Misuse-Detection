package androidx.compose.runtime;

import L5.I;
import L5.s;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.C2839p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<P5.d> awaiters = new ArrayList();
    private List<P5.d> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(P5.d dVar) {
        if (isOpen()) {
            return I.f6487a;
        }
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        synchronized (this.lock) {
            this.awaiters.add(c2839p);
        }
        c2839p.j(new Latch$await$2$2(this, c2839p));
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return I.f6487a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            I i8 = I.f6487a;
        }
    }

    public final boolean isOpen() {
        boolean z8;
        synchronized (this.lock) {
            z8 = this._isOpen;
        }
        return z8;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<P5.d> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    P5.d dVar = list.get(i8);
                    s.a aVar = s.f6511b;
                    dVar.resumeWith(s.b(I.f6487a));
                }
                list.clear();
                I i9 = I.f6487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(Function0 function0) {
        closeLatch();
        try {
            return (R) function0.invoke();
        } finally {
            AbstractC3157w.b(1);
            openLatch();
            AbstractC3157w.a(1);
        }
    }
}
