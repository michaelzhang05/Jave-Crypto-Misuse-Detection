package androidx.room;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import java.util.concurrent.Callable;
import l6.InterfaceC3372o;
import l6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC3372o $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC3372o interfaceC3372o, S5.d dVar) {
        super(2, dVar);
        this.$callable = callable;
        this.$continuation = interfaceC3372o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        if (this.label == 0) {
            O5.t.b(obj);
            try {
                this.$continuation.resumeWith(O5.s.b(this.$callable.call()));
            } catch (Throwable th) {
                InterfaceC3372o interfaceC3372o = this.$continuation;
                s.a aVar = O5.s.f8302b;
                interfaceC3372o.resumeWith(O5.s.b(O5.t.a(th)));
            }
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, S5.d dVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
