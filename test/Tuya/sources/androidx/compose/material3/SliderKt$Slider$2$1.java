package androidx.compose.material3;

import L5.I;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$2$1 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z8, int i8) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
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
    public final void invoke(SliderPositions it, Composer composer, int i8) {
        AbstractC3159y.i(it, "it");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1923353268, i8, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        SliderColors sliderColors = this.$colors;
        boolean z8 = this.$enabled;
        int i9 = this.$$dirty;
        sliderDefaults.m1757Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z8, 0L, composer, ((i9 >> 24) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i9 >> 15) & 896) | (i9 & 7168), 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
