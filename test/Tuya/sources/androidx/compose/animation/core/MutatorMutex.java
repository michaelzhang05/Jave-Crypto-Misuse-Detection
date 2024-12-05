package androidx.compose.animation.core;

import X5.n;
import androidx.compose.runtime.Stable;
import i6.InterfaceC2855x0;
import i6.N;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import r6.AbstractC3692c;
import r6.InterfaceC3690a;

@Stable
/* loaded from: classes.dex */
public final class MutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final InterfaceC3690a mutex = AbstractC3692c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Mutator {
        private final InterfaceC2855x0 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority priority, InterfaceC2855x0 job) {
            AbstractC3159y.i(priority, "priority");
            AbstractC3159y.i(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            AbstractC3159y.i(other, "other");
            if (this.priority.compareTo(other.priority) >= 0) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        public final InterfaceC2855x0 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, n nVar, P5.d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, nVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!d.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1 function1, P5.d dVar) {
        return N.e(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), dVar);
    }

    public final <T, R> Object mutateWith(T t8, MutatePriority mutatePriority, n nVar, P5.d dVar) {
        return N.e(new MutatorMutex$mutateWith$2(mutatePriority, this, nVar, t8, null), dVar);
    }
}
