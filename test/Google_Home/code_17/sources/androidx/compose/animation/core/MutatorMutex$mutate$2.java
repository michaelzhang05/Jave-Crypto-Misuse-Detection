package androidx.compose.animation.core;

import O5.I;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import l6.M;
import u6.InterfaceC4063a;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {184, 132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2 extends l implements InterfaceC1668n {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1 function1, S5.d dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, dVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [u6.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4063a interfaceC4063a;
        Function1 function1;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        MutatorMutex.Mutator mutator2;
        Throwable th;
        MutatorMutex mutatorMutex2;
        InterfaceC4063a interfaceC4063a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object e8 = T5.b.e();
        ?? r12 = this.label;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            interfaceC4063a2 = (InterfaceC4063a) this.L$1;
                            mutator2 = (MutatorMutex.Mutator) this.L$0;
                            try {
                                t.b(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                d.a(atomicReference2, mutator2, null);
                                interfaceC4063a2.d(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                d.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    function1 = (Function1) this.L$2;
                    InterfaceC4063a interfaceC4063a3 = (InterfaceC4063a) this.L$1;
                    mutator = (MutatorMutex.Mutator) this.L$0;
                    t.b(obj);
                    interfaceC4063a = interfaceC4063a3;
                } else {
                    t.b(obj);
                    M m8 = (M) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = m8.getCoroutineContext().get(InterfaceC3390x0.f34661n0);
                    AbstractC3255y.f(bVar);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (InterfaceC3390x0) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    interfaceC4063a = this.this$0.mutex;
                    Function1 function12 = this.$block;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = interfaceC4063a;
                    this.L$2 = function12;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (interfaceC4063a.a(null, this) == e8) {
                        return e8;
                    }
                    function1 = function12;
                    mutator = mutator3;
                    mutatorMutex = mutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = interfaceC4063a;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = function1.invoke(this);
                if (invoke == e8) {
                    return e8;
                }
                mutatorMutex2 = mutatorMutex;
                interfaceC4063a2 = interfaceC4063a;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.currentMutator;
                d.a(atomicReference2, mutator2, null);
                interfaceC4063a2.d(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                d.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.d(null);
            throw th4;
        }
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((MutatorMutex$mutate$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
