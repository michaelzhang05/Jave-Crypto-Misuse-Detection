package androidx.compose.animation.core;

import X5.o;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class TransitionKt$animateFloat$1 extends AbstractC3160z implements o {
    public static final TransitionKt$animateFloat$1 INSTANCE = new TransitionKt$animateFloat$1();

    public TransitionKt$animateFloat$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3159y.i(segment, "$this$null");
        composer.startReplaceableGroup(-522164544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-522164544, i8, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:935)");
        }
        SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
