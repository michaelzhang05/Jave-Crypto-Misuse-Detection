package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ RadioButtonColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$3(boolean z8, Function0 function0, Modifier modifier, boolean z9, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$selected = z8;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$colors = radioButtonColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        RadioButtonKt.RadioButton(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
