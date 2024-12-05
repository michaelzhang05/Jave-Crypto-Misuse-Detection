package androidx.activity.compose;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1668n $onBack;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$3(boolean z8, InterfaceC1668n interfaceC1668n, int i8, int i9) {
        super(2);
        this.$enabled = z8;
        this.$onBack = interfaceC1668n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        PredictiveBackHandlerKt.PredictiveBackHandler(this.$enabled, this.$onBack, composer, this.$$changed | 1, this.$$default);
    }
}
