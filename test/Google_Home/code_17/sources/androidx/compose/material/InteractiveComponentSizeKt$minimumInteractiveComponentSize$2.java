package androidx.compose.material;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 extends AbstractC3256z implements InterfaceC1669o {
    public static final InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 INSTANCE = new InteractiveComponentSizeKt$minimumInteractiveComponentSize$2();

    InteractiveComponentSizeKt$minimumInteractiveComponentSize$2() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier modifier;
        long j8;
        AbstractC3255y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1964721376);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1964721376, i8, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:54)");
        }
        if (((Boolean) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement())).booleanValue()) {
            j8 = InteractiveComponentSizeKt.minimumInteractiveComponentSize;
            modifier = new MinimumInteractiveComponentSizeModifier(j8, null);
        } else {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
