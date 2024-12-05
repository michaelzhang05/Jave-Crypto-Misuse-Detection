package androidx.compose.material3;

import O5.I;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 extends AbstractC3256z implements Function1 {
    public static final ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 INSTANCE = new ProgressIndicatorKt$CircularProgressIndicator$startAngle$1();

    ProgressIndicatorKt$CircularProgressIndicator$startAngle$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
        return I.f8278a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        CubicBezierEasing cubicBezierEasing;
        AbstractC3255y.i(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1332);
        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 666);
        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
        keyframes.with(at, cubicBezierEasing);
        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
    }
}
