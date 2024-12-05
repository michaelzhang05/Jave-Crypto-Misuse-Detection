package androidx.work;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
final class ListenableFutureKt$await$2$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ InterfaceFutureC3857a $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(InterfaceFutureC3857a interfaceFutureC3857a) {
        super(1);
        this.$this_await = interfaceFutureC3857a;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel(false);
    }
}
