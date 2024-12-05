package androidx.compose.material3;

import L5.I;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 extends AbstractC3160z implements Function1 {
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1();

    ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
        return I.f6487a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        CubicBezierEasing cubicBezierEasing;
        AbstractC3159y.i(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1800);
        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
        cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
        keyframes.with(at, cubicBezierEasing);
        keyframes.at(Float.valueOf(1.0f), 750);
    }
}
