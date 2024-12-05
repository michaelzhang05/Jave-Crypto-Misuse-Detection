package androidx.compose.runtime;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class Updater$reconcile$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ Function1 $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Updater$reconcile$1(Function1 function1) {
        super(2);
        this.$block = function1;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Updater$reconcile$1) obj, (I) obj2);
        return I.f8278a;
    }

    public final void invoke(T t8, I i8) {
        this.$block.invoke(t8);
    }
}
