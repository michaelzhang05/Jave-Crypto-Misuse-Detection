package androidx.compose.material;

import O5.I;
import O5.t;
import S5.d;
import S5.g;
import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3390x0;
import l6.M;
import u6.InterfaceC4063a;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {177, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutateWith$2 extends l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1668n $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, InterfaceC1668n interfaceC1668n, T t8, d dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = interfaceC1668n;
        this.$receiver = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, dVar);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [u6.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4063a interfaceC4063a;
        InterfaceC1668n interfaceC1668n;
        Object obj2;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex.Mutator mutator2;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
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
                            internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                            interfaceC4063a2 = (InterfaceC4063a) this.L$1;
                            mutator2 = (InternalMutatorMutex.Mutator) this.L$0;
                            try {
                                t.b(obj);
                                atomicReference2 = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.d.a(atomicReference2, mutator2, null);
                                interfaceC4063a2.d(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.d.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    interfaceC1668n = (InterfaceC1668n) this.L$2;
                    InterfaceC4063a interfaceC4063a3 = (InterfaceC4063a) this.L$1;
                    mutator = (InternalMutatorMutex.Mutator) this.L$0;
                    t.b(obj);
                    interfaceC4063a = interfaceC4063a3;
                } else {
                    t.b(obj);
                    M m8 = (M) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = m8.getCoroutineContext().get(InterfaceC3390x0.f34661n0);
                    AbstractC3255y.f(bVar);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (InterfaceC3390x0) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    interfaceC4063a = this.this$0.mutex;
                    interfaceC1668n = this.$block;
                    Object obj3 = this.$receiver;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = interfaceC4063a;
                    this.L$2 = interfaceC1668n;
                    this.L$3 = obj3;
                    this.L$4 = internalMutatorMutex3;
                    this.label = 1;
                    if (interfaceC4063a.a(null, this) == e8) {
                        return e8;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = interfaceC4063a;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = interfaceC1668n.invoke(obj2, this);
                if (invoke == e8) {
                    return e8;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                interfaceC4063a2 = interfaceC4063a;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.d.a(atomicReference2, mutator2, null);
                interfaceC4063a2.d(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.d.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.d(null);
            throw th4;
        }
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((InternalMutatorMutex$mutateWith$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
