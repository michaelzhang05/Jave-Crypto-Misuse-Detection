package androidx.compose.material;

import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import l6.N;
import u6.AbstractC4065c;
import u6.InterfaceC4063a;

@Stable
/* loaded from: classes.dex */
public final class InternalMutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final InterfaceC4063a mutex = AbstractC4065c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Mutator {
        private final InterfaceC3390x0 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority priority, InterfaceC3390x0 job) {
            AbstractC3255y.i(priority, "priority");
            AbstractC3255y.i(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            AbstractC3255y.i(other, "other");
            if (this.priority.compareTo(other.priority) >= 0) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            InterfaceC3390x0.a.a(this.job, null, 1, null);
        }

        public final InterfaceC3390x0 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, Function1 function1, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, function1, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, interfaceC1668n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.d.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1 function1, d dVar) {
        return N.e(new InternalMutatorMutex$mutate$2(mutatePriority, this, function1, null), dVar);
    }

    public final <T, R> Object mutateWith(T t8, MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, d dVar) {
        return N.e(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, interfaceC1668n, t8, null), dVar);
    }

    public final boolean tryMutate(Function0 block) {
        AbstractC3255y.i(block, "block");
        boolean b8 = InterfaceC4063a.C0902a.b(this.mutex, null, 1, null);
        if (b8) {
            try {
                block.invoke();
            } finally {
                InterfaceC4063a.C0902a.c(this.mutex, null, 1, null);
            }
        }
        return b8;
    }
}