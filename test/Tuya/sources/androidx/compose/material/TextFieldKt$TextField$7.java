package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldKt$TextField$7 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ n $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$7(TextFieldValue textFieldValue, boolean z8, boolean z9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z10, n nVar, n nVar2, n nVar3, n nVar4, TextFieldColors textFieldColors, int i8, int i9) {
        super(3);
        this.$value = textFieldValue;
        this.$enabled = z8;
        this.$singleLine = z9;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z10;
        this.$label = nVar;
        this.$placeholder = nVar2;
        this.$leadingIcon = nVar3;
        this.$trailingIcon = nVar4;
        this.$colors = textFieldColors;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((n) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(n innerTextField, Composer composer, int i8) {
        int i9;
        AbstractC3159y.i(innerTextField, "innerTextField");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126640971, i9, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:397)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        String text = this.$value.getText();
        boolean z8 = this.$enabled;
        boolean z9 = this.$singleLine;
        VisualTransformation visualTransformation = this.$visualTransformation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        boolean z10 = this.$isError;
        n nVar = this.$label;
        n nVar2 = this.$placeholder;
        n nVar3 = this.$leadingIcon;
        n nVar4 = this.$trailingIcon;
        TextFieldColors textFieldColors = this.$colors;
        int i10 = this.$$dirty;
        int i11 = this.$$dirty1;
        textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z8, z9, visualTransformation, mutableInteractionSource, z10, nVar, nVar2, nVar3, nVar4, textFieldColors, null, composer, ((i11 >> 3) & 7168) | ((i9 << 3) & 112) | ((i10 >> 3) & 896) | ((i11 << 9) & 57344) | ((i11 >> 6) & 458752) | ((i11 << 18) & 3670016) | ((i10 << 3) & 29360128) | ((i10 << 3) & 234881024) | ((i10 << 3) & 1879048192), ((i10 >> 27) & 14) | 3072 | ((i11 >> 24) & 112), 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
