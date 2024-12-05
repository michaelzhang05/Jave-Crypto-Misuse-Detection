package androidx.lifecycle;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class EmittedSource$disposeNow$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    int label;
    final /* synthetic */ EmittedSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmittedSource$disposeNow$2(EmittedSource emittedSource, S5.d dVar) {
        super(2, dVar);
        this.this$0 = emittedSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new EmittedSource$disposeNow$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.removeSource();
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((EmittedSource$disposeNow$2) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
