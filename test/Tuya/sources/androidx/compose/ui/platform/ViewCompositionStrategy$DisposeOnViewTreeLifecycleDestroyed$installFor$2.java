package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ kotlin.jvm.internal.T $disposer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(kotlin.jvm.internal.T t8) {
        super(0);
        this.$disposer = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4500invoke();
        return L5.I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4500invoke() {
        ((Function0) this.$disposer.f33761a).invoke();
    }
}
