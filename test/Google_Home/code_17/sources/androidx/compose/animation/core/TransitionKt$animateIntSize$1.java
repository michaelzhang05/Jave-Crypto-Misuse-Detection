package androidx.compose.animation.core;

import a6.InterfaceC1669o;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class TransitionKt$animateIntSize$1 extends AbstractC3256z implements InterfaceC1669o {
    public static final TransitionKt$animateIntSize$1 INSTANCE = new TransitionKt$animateIntSize$1();

    public TransitionKt$animateIntSize$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3255y.i(segment, "$this$null");
        composer.startReplaceableGroup(967893300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(967893300, i8, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1120)");
        }
        SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5341boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
