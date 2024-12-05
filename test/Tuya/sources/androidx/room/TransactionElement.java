package androidx.room;

import P5.g;
import androidx.annotation.RestrictTo;
import i6.InterfaceC2855x0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TransactionElement implements g.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount;
    private final P5.e transactionDispatcher;
    private final InterfaceC2855x0 transactionThreadControlJob;

    /* loaded from: classes3.dex */
    public static final class Key implements g.c {
        private Key() {
        }

        public /* synthetic */ Key(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public TransactionElement(InterfaceC2855x0 transactionThreadControlJob, P5.e transactionDispatcher) {
        AbstractC3159y.i(transactionThreadControlJob, "transactionThreadControlJob");
        AbstractC3159y.i(transactionDispatcher, "transactionDispatcher");
        this.transactionThreadControlJob = transactionThreadControlJob;
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // P5.g.b, P5.g
    public <R> R fold(R r8, X5.n nVar) {
        return (R) g.b.a.a(this, r8, nVar);
    }

    @Override // P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // P5.g.b
    public g.c getKey() {
        return Key;
    }

    public final P5.e getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // P5.g
    public P5.g plus(P5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void release() {
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                InterfaceC2855x0.a.a(this.transactionThreadControlJob, null, 1, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
