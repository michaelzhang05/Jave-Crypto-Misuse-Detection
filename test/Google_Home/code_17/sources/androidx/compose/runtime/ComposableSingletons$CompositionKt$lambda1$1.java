package androidx.compose.runtime;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$CompositionKt$lambda1$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final ComposableSingletons$CompositionKt$lambda1$1 INSTANCE = new ComposableSingletons$CompositionKt$lambda1$1();

    ComposableSingletons$CompositionKt$lambda1$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(954879418, i8, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:605)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
