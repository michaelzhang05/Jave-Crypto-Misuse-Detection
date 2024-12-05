package androidx.compose.animation.core;

import a6.InterfaceC1669o;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class TransitionKt$animateInt$1 extends AbstractC3256z implements InterfaceC1669o {
    public static final TransitionKt$animateInt$1 INSTANCE = new TransitionKt$animateInt$1();

    public TransitionKt$animateInt$1() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3255y.i(segment, "$this$null");
        composer.startReplaceableGroup(-785273069);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-785273069, i8, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1088)");
        }
        SpringSpec<Integer> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }
}
