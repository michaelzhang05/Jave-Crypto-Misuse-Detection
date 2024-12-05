package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ n $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ n $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ n $supportingText;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$2(TextFieldDefaults textFieldDefaults, String str, n nVar, boolean z8, boolean z9, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z10, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6, TextFieldColors textFieldColors, PaddingValues paddingValues, n nVar7, int i8, int i9, int i10) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$value = str;
        this.$innerTextField = nVar;
        this.$enabled = z8;
        this.$singleLine = z9;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = interactionSource;
        this.$isError = z10;
        this.$label = nVar2;
        this.$placeholder = nVar3;
        this.$leadingIcon = nVar4;
        this.$trailingIcon = nVar5;
        this.$supportingText = nVar6;
        this.$colors = textFieldColors;
        this.$contentPadding = paddingValues;
        this.$container = nVar7;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.OutlinedTextFieldDecorationBox(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$colors, this.$contentPadding, this.$container, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
