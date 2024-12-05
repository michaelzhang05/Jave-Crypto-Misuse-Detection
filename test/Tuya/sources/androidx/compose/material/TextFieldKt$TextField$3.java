package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldKt$TextField$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ n $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$3(String str, Function1 function1, Modifier modifier, boolean z8, boolean z9, TextStyle textStyle, n nVar, n nVar2, n nVar3, n nVar4, boolean z10, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i8, int i9, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i10, int i11, int i12) {
        super(2);
        this.$value = str;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$readOnly = z9;
        this.$textStyle = textStyle;
        this.$label = nVar;
        this.$placeholder = nVar2;
        this.$leadingIcon = nVar3;
        this.$trailingIcon = nVar4;
        this.$isError = z10;
        this.$visualTransformation = visualTransformation;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z11;
        this.$maxLines = i8;
        this.$minLines = i9;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$colors = textFieldColors;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        TextFieldKt.TextField(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$interactionSource, this.$shape, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
