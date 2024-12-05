package androidx.room;

import S5.g;
import a6.InterfaceC1668n;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TransactionElement implements g.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount;
    private final S5.e transactionDispatcher;
    private final InterfaceC3390x0 transactionThreadControlJob;

    /* loaded from: classes3.dex */
    public static final class Key implements g.c {
        private Key() {
        }

        public /* synthetic */ Key(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public TransactionElement(InterfaceC3390x0 transactionThreadControlJob, S5.e transactionDispatcher) {
        AbstractC3255y.i(transactionThreadControlJob, "transactionThreadControlJob");
        AbstractC3255y.i(transactionDispatcher, "transactionDispatcher");
        this.transactionThreadControlJob = transactionThreadControlJob;
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) g.b.a.a(this, r8, interfaceC1668n);
    }

    @Override // S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // S5.g.b
    public g.c getKey() {
        return Key;
    }

    public final S5.e getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // S5.g
    public S5.g plus(S5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void release() {
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                InterfaceC3390x0.a.a(this.transactionThreadControlJob, null, 1, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
