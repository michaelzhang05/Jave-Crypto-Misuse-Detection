package androidx.compose.runtime;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3372o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC3372o $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, InterfaceC3372o interfaceC3372o) {
        super(1);
        this.this$0 = latch;
        this.$co = interfaceC3372o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8278a;
    }

    public final void invoke(Throwable th) {
        Object obj = this.this$0.lock;
        Latch latch = this.this$0;
        InterfaceC3372o interfaceC3372o = this.$co;
        synchronized (obj) {
            latch.awaiters.remove(interfaceC3372o);
            I i8 = I.f8278a;
        }
    }
}
