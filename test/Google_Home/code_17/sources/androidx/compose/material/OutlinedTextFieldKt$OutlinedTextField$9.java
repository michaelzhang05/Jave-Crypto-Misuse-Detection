package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$9 extends AbstractC3256z implements InterfaceC1669o {
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
    final /* synthetic */ InterfaceC1668n $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
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
                ComposerKt.traceEventStart(-753611134, i8, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:405)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            boolean z8 = this.$enabled;
            boolean z9 = this.$isError;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            TextFieldColors textFieldColors = this.$colors;
            Shape shape = this.$shape;
            int i9 = ((this.$$dirty >> 9) & 14) | 12582912;
            int i10 = this.$$dirty1;
            textFieldDefaults.m1396BorderBoxnbWgWpA(z8, z9, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, i9 | ((i10 << 3) & 112) | ((i10 >> 15) & 896) | ((i10 >> 18) & 7168) | ((i10 >> 12) & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$9(TextFieldValue textFieldValue, boolean z8, boolean z9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z10, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, TextFieldColors textFieldColors, int i8, int i9, Shape shape) {
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
        this.$colors = textFieldColors;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
        this.$shape = shape;
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
            i9 = i8 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1001528775, i9, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:391)");
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
        TextFieldColors textFieldColors = this.$colors;
        int i10 = i9;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -753611134, true, new AnonymousClass1(z8, z10, mutableInteractionSource, textFieldColors, this.$shape, this.$$dirty, this.$$dirty1));
        int i11 = this.$$dirty;
        int i12 = this.$$dirty1;
        textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z8, z9, visualTransformation, mutableInteractionSource, z10, interfaceC1668n, interfaceC1668n2, interfaceC1668n3, interfaceC1668n4, textFieldColors, null, composableLambda, composer, ((i10 << 3) & 112) | ((i11 >> 3) & 896) | ((i12 >> 3) & 7168) | ((i12 << 9) & 57344) | ((i12 >> 6) & 458752) | ((i12 << 18) & 3670016) | ((i11 << 3) & 29360128) | ((i11 << 3) & 234881024) | ((i11 << 3) & 1879048192), ((i11 >> 27) & 14) | 27648 | ((i12 >> 24) & 112), 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
