package androidx.compose.runtime;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class Recomposer$readObserverOf$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ ControlledComposition $composition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(ControlledComposition controlledComposition) {
        super(1);
        this.$composition = controlledComposition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2488invoke(obj);
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2488invoke(Object obj) {
        this.$composition.recordReadOf(obj);
    }
}
