package androidx.compose.animation.core;

import a6.InterfaceC1669o;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class TransitionKt$animateRect$1 extends AbstractC3256z implements InterfaceC1669o {
    public static final TransitionKt$animateRect$1 INSTANCE = new TransitionKt$animateRect$1();

    public TransitionKt$animateRect$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3255y.i(segment, "$this$null");
        composer.startReplaceableGroup(691336298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(691336298, i8, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1150)");
        }
        SpringSpec<Rect> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
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
