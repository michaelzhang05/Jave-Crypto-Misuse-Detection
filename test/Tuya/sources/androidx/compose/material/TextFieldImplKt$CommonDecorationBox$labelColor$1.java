package androidx.compose.material;

import X5.o;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z8, boolean z9, InteractionSource interactionSource, int i8, int i9) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z8;
        this.$isError = z9;
        this.$interactionSource = interactionSource;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return Color.m2961boximpl(m1407invokeXeAY9LY((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY, reason: not valid java name */
    public final long m1407invokeXeAY9LY(InputPhase it, Composer composer, int i8) {
        boolean z8;
        AbstractC3159y.i(it, "it");
        composer.startReplaceableGroup(697243846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(697243846, i8, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z9 = this.$enabled;
        if (it == InputPhase.UnfocusedEmpty) {
            z8 = false;
        } else {
            z8 = this.$isError;
        }
        InteractionSource interactionSource = this.$interactionSource;
        int i9 = (this.$$dirty >> 27) & 14;
        int i10 = this.$$dirty1;
        long m2981unboximpl = textFieldColors.labelColor(z9, z8, interactionSource, composer, i9 | ((i10 << 3) & 896) | (i10 & 7168)).getValue().m2981unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2981unboximpl;
    }
}
