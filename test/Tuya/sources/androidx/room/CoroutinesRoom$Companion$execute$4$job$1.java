package androidx.room;

import L5.I;
import L5.s;
import i6.InterfaceC2837o;
import i6.M;
import java.util.concurrent.Callable;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC2837o $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC2837o interfaceC2837o, P5.d dVar) {
        super(2, dVar);
        this.$callable = callable;
        this.$continuation = interfaceC2837o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        if (this.label == 0) {
            L5.t.b(obj);
            try {
                this.$continuation.resumeWith(L5.s.b(this.$callable.call()));
            } catch (Throwable th) {
                InterfaceC2837o interfaceC2837o = this.$continuation;
                s.a aVar = L5.s.f6511b;
                interfaceC2837o.resumeWith(L5.s.b(L5.t.a(th)));
            }
            return I.f6487a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
