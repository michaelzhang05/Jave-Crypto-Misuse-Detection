package androidx.compose.runtime;

import L5.I;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ InterfaceC2837o $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, InterfaceC2837o interfaceC2837o) {
        super(1);
        this.this$0 = latch;
        this.$co = interfaceC2837o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        Object obj = this.this$0.lock;
        Latch latch = this.this$0;
        InterfaceC2837o interfaceC2837o = this.$co;
        synchronized (obj) {
            latch.awaiters.remove(interfaceC2837o);
            I i8 = I.f6487a;
        }
    }
}
