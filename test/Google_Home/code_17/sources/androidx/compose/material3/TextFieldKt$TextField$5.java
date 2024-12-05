package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldKt$TextField$5 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ InterfaceC1668n $label;
    final /* synthetic */ InterfaceC1668n $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ InterfaceC1668n $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC1668n $supportingText;
    final /* synthetic */ InterfaceC1668n $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1669o {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ InterfaceC1668n $label;
        final /* synthetic */ InterfaceC1668n $leadingIcon;
        final /* synthetic */ InterfaceC1668n $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ InterfaceC1668n $supportingText;
        final /* synthetic */ InterfaceC1668n $trailingIcon;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldValue textFieldValue, boolean z8, boolean z9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z10, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, Shape shape, TextFieldColors textFieldColors, int i8, int i9) {
            super(3);
            this.$value = textFieldValue;
            this.$enabled = z8;
            this.$singleLine = z9;
            this.$visualTransformation = visualTransformation;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z10;
            this.$label = interfaceC1668n;
            this.$placeholder = interfaceC1668n2;
            this.$leadingIcon = interfaceC1668n3;
            this.$trailingIcon = interfaceC1668n4;
            this.$supportingText = interfaceC1668n5;
            this.$shape = shape;
            this.$colors = textFieldColors;
            this.$$dirty = i8;
            this.$$dirty1 = i9;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1668n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(InterfaceC1668n innerTextField, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(innerTextField, "innerTextField");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(998109572, i9, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:342)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String text = this.$value.getText();
            boolean z8 = this.$enabled;
            boolean z9 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z10 = this.$isError;
            InterfaceC1668n interfaceC1668n = this.$label;
            InterfaceC1668n interfaceC1668n2 = this.$placeholder;
            InterfaceC1668n interfaceC1668n3 = this.$leadingIcon;
            InterfaceC1668n interfaceC1668n4 = this.$trailingIcon;
            InterfaceC1668n interfaceC1668n5 = this.$supportingText;
            Shape shape = this.$shape;
            TextFieldColors textFieldColors = this.$colors;
            int i10 = this.$$dirty;
            int i11 = this.$$dirty1;
            textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z8, z9, visualTransformation, mutableInteractionSource, z10, interfaceC1668n, interfaceC1668n2, interfaceC1668n3, interfaceC1668n4, interfaceC1668n5, shape, textFieldColors, null, null, composer, ((i11 >> 6) & 7168) | ((i10 >> 3) & 896) | ((i9 << 3) & 112) | ((i11 << 6) & 57344) | ((i11 >> 6) & 458752) | ((i11 << 15) & 3670016) | ((i10 << 3) & 29360128) | ((i10 << 3) & 234881024) | ((i10 << 3) & 1879048192), ((i10 >> 27) & 14) | 1572864 | ((i11 << 3) & 112) | ((i11 >> 18) & 896) | ((i11 >> 18) & 7168), 49152);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$5(Modifier modifier, TextFieldColors textFieldColors, boolean z8, int i8, TextFieldValue textFieldValue, Function1 function1, boolean z9, boolean z10, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i10, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, Shape shape) {
        super(2);
        this.$modifier = modifier;
        this.$colors = textFieldColors;
        this.$isError = z8;
        this.$$dirty1 = i8;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$enabled = z9;
        this.$readOnly = z10;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z11;
        this.$maxLines = i9;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i10;
        this.$label = interfaceC1668n;
        this.$placeholder = interfaceC1668n2;
        this.$leadingIcon = interfaceC1668n3;
        this.$trailingIcon = interfaceC1668n4;
        this.$supportingText = interfaceC1668n5;
        this.$shape = shape;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(765006587, i8, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:322)");
        }
        Modifier modifier = this.$modifier;
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        Modifier m636defaultMinSizeVpY3zN4 = SizeKt.m636defaultMinSizeVpY3zN4(modifier, textFieldDefaults.m1858getMinWidthD9Ej5fM(), textFieldDefaults.m1857getMinHeightD9Ej5fM());
        TextFieldColors textFieldColors = this.$colors;
        boolean z8 = this.$isError;
        int i9 = this.$$dirty1;
        SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z8, composer, ((i9 >> 24) & 112) | ((i9 >> 3) & 14)).getValue().m2986unboximpl(), null);
        TextFieldValue textFieldValue = this.$value;
        Function1 function1 = this.$onValueChange;
        boolean z9 = this.$enabled;
        boolean z10 = this.$readOnly;
        TextStyle textStyle = this.$mergedTextStyle;
        KeyboardOptions keyboardOptions = this.$keyboardOptions;
        KeyboardActions keyboardActions = this.$keyboardActions;
        boolean z11 = this.$singleLine;
        int i10 = this.$maxLines;
        VisualTransformation visualTransformation = this.$visualTransformation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 998109572, true, new AnonymousClass1(textFieldValue, z9, z11, visualTransformation, mutableInteractionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$shape, this.$colors, this.$$dirty, this.$$dirty1));
        int i11 = this.$$dirty & 64638;
        int i12 = this.$$dirty1;
        BasicTextFieldKt.BasicTextField(textFieldValue, function1, m636defaultMinSizeVpY3zN4, z9, z10, textStyle, keyboardOptions, keyboardActions, z11, i10, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, composableLambda, composer, i11 | ((i12 << 9) & 3670016) | (KeyboardActions.$stable << 21) | ((i12 << 9) & 29360128) | ((i12 << 9) & 234881024) | (1879048192 & (i12 << 9)), ((i12 >> 6) & 14) | 24576 | ((i12 >> 15) & 896), 2048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
