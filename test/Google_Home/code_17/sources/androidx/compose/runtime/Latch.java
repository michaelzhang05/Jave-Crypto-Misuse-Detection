package androidx.compose.runtime;

import O5.I;
import O5.s;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import l6.C3374p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<S5.d> awaiters = new ArrayList();
    private List<S5.d> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(S5.d dVar) {
        if (isOpen()) {
            return I.f8278a;
        }
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        synchronized (this.lock) {
            this.awaiters.add(c3374p);
        }
        c3374p.i(new Latch$await$2$2(this, c3374p));
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return I.f8278a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            I i8 = I.f8278a;
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
                List<S5.d> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    S5.d dVar = list.get(i8);
                    s.a aVar = s.f8302b;
                    dVar.resumeWith(s.b(I.f8278a));
                }
                list.clear();
                I i9 = I.f8278a;
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
            AbstractC3253w.b(1);
            openLatch();
            AbstractC3253w.a(1);
        }
    }
}
