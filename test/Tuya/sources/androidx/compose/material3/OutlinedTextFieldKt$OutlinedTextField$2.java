package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class OutlinedTextFieldKt$OutlinedTextField$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ n $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ n $supportingText;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3160z implements o {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ n $label;
        final /* synthetic */ n $leadingIcon;
        final /* synthetic */ n $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ n $supportingText;
        final /* synthetic */ n $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3160z implements n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ TextFieldColors $colors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ boolean $isError;
            final /* synthetic */ Shape $shape;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i8, int i9) {
                super(2);
                this.$enabled = z8;
                this.$isError = z9;
                this.$interactionSource = mutableInteractionSource;
                this.$colors = textFieldColors;
                this.$shape = shape;
                this.$$dirty = i8;
                this.$$dirty1 = i9;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-839984881, i8, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                }
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                boolean z8 = this.$enabled;
                boolean z9 = this.$isError;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                TextFieldColors textFieldColors = this.$colors;
                Shape shape = this.$shape;
                int i9 = ((this.$$dirty >> 9) & 14) | 12582912;
                int i10 = this.$$dirty1;
                textFieldDefaults.m1850OutlinedBorderContainerBoxnbWgWpA(z8, z9, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, i9 | (i10 & 112) | ((i10 >> 15) & 896) | ((i10 >> 18) & 7168) | ((i10 >> 12) & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z8, boolean z9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z10, n nVar, n nVar2, n nVar3, n nVar4, n nVar5, TextFieldColors textFieldColors, int i8, int i9, Shape shape) {
            super(3);
            this.$value = str;
            this.$enabled = z8;
            this.$singleLine = z9;
            this.$visualTransformation = visualTransformation;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z10;
            this.$label = nVar;
            this.$placeholder = nVar2;
            this.$leadingIcon = nVar3;
            this.$trailingIcon = nVar4;
            this.$supportingText = nVar5;
            this.$colors = textFieldColors;
            this.$$dirty = i8;
            this.$$dirty1 = i9;
            this.$shape = shape;
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
                i9 = i8 | (composer.changed(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(794931831, i9, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String str = this.$value;
            boolean z8 = this.$enabled;
            boolean z9 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z10 = this.$isError;
            n nVar = this.$label;
            n nVar2 = this.$placeholder;
            n nVar3 = this.$leadingIcon;
            n nVar4 = this.$trailingIcon;
            n nVar5 = this.$supportingText;
            TextFieldColors textFieldColors = this.$colors;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -839984881, true, new AnonymousClass1(z8, z10, mutableInteractionSource, textFieldColors, this.$shape, this.$$dirty, this.$$dirty1));
            int i10 = this.$$dirty;
            int i11 = this.$$dirty1;
            textFieldDefaults.OutlinedTextFieldDecorationBox(str, innerTextField, z8, z9, visualTransformation, mutableInteractionSource, z10, nVar, nVar2, nVar3, nVar4, nVar5, textFieldColors, null, composableLambda, composer, (i10 & 14) | ((i9 << 3) & 112) | ((i10 >> 3) & 896) | ((i11 >> 6) & 7168) | ((i11 << 6) & 57344) | (458752 & (i11 >> 6)) | ((i11 << 15) & 3670016) | ((i10 << 3) & 29360128) | ((i10 << 3) & 234881024) | ((i10 << 3) & 1879048192), ((i10 >> 27) & 14) | 221184 | ((i11 << 3) & 112) | ((i11 >> 21) & 896), 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$2(n nVar, Modifier modifier, TextFieldColors textFieldColors, boolean z8, int i8, String str, Function1 function1, boolean z9, boolean z10, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i10, n nVar2, n nVar3, n nVar4, n nVar5, Shape shape) {
        super(2);
        this.$label = nVar;
        this.$modifier = modifier;
        this.$colors = textFieldColors;
        this.$isError = z8;
        this.$$dirty1 = i8;
        this.$value = str;
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
        this.$placeholder = nVar2;
        this.$leadingIcon = nVar3;
        this.$trailingIcon = nVar4;
        this.$supportingText = nVar5;
        this.$shape = shape;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        Modifier modifier;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1801753362, i8, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
        }
        if (this.$label != null) {
            modifier = PaddingKt.m604paddingqDBjuR0$default(SemanticsModifierKt.semantics(this.$modifier, true, AnonymousClass1.INSTANCE), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
        } else {
            modifier = this.$modifier;
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        Modifier m631defaultMinSizeVpY3zN4 = SizeKt.m631defaultMinSizeVpY3zN4(modifier, textFieldDefaults.m1853getMinWidthD9Ej5fM(), textFieldDefaults.m1852getMinHeightD9Ej5fM());
        TextFieldColors textFieldColors = this.$colors;
        boolean z8 = this.$isError;
        int i9 = this.$$dirty1;
        SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z8, composer, ((i9 >> 24) & 112) | ((i9 >> 3) & 14)).getValue().m2981unboximpl(), null);
        String str = this.$value;
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
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 794931831, true, new AnonymousClass2(str, z9, z11, visualTransformation, mutableInteractionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$colors, this.$$dirty, this.$$dirty1, this.$shape));
        int i11 = this.$$dirty & 64638;
        int i12 = this.$$dirty1;
        BasicTextFieldKt.BasicTextField(str, function1, m631defaultMinSizeVpY3zN4, z9, z10, textStyle, keyboardOptions, keyboardActions, z11, i10, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, composableLambda, composer, i11 | ((i12 << 9) & 3670016) | (KeyboardActions.$stable << 21) | ((i12 << 9) & 29360128) | ((i12 << 9) & 234881024) | (1879048192 & (i12 << 9)), ((i12 >> 6) & 14) | 24576 | ((i12 >> 15) & 896), 2048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}