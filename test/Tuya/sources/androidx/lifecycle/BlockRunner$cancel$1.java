package androidx.lifecycle;

import L5.I;
import L5.t;
import i6.InterfaceC2855x0;
import i6.M;
import i6.X;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BlockRunner$cancel$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    int label;
    final /* synthetic */ BlockRunner<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(BlockRunner<T> blockRunner, P5.d dVar) {
        super(2, dVar);
        this.this$0 = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new BlockRunner$cancel$1(this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((BlockRunner$cancel$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        CoroutineLiveData coroutineLiveData;
        InterfaceC2855x0 interfaceC2855x0;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            j8 = ((BlockRunner) this.this$0).timeoutInMs;
            this.label = 1;
            if (X.b(j8, this) == e8) {
                return e8;
            }
        }
        coroutineLiveData = ((BlockRunner) this.this$0).liveData;
        if (!coroutineLiveData.hasActiveObservers()) {
            interfaceC2855x0 = ((BlockRunner) this.this$0).runningJob;
            if (interfaceC2855x0 != null) {
                InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
            }
            ((BlockRunner) this.this$0).runningJob = null;
        }
        return I.f6487a;
    }
}
