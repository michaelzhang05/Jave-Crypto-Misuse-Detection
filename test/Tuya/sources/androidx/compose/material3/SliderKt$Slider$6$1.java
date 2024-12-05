package androidx.compose.material3;

import L5.I;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$6$1 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$6$1(SliderColors sliderColors, boolean z8, int i8) {
        super(3);
        this.$colors = sliderColors;
        this.$enabled = z8;
        this.$$dirty = i8;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SliderPositions) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SliderPositions sliderPositions, Composer composer, int i8) {
        AbstractC3159y.i(sliderPositions, "sliderPositions");
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(sliderPositions) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1252336501, i8, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        SliderColors sliderColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        sliderDefaults.Track(sliderPositions, null, sliderColors, z8, composer, (i8 & 14) | 24576 | ((i9 >> 15) & 896) | (i9 & 7168), 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
