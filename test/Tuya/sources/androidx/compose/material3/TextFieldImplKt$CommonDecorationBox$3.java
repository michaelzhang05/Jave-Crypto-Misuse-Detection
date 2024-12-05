package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.r;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3 extends AbstractC3160z implements r {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextStyle $bodySmall;
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
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ n $supportingText;
    final /* synthetic */ n $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            iArr[TextFieldType.Filled.ordinal()] = 1;
            iArr[TextFieldType.Outlined.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3(n nVar, n nVar2, String str, boolean z8, int i8, TextFieldColors textFieldColors, boolean z9, InteractionSource interactionSource, n nVar3, n nVar4, n nVar5, TextFieldType textFieldType, n nVar6, boolean z10, PaddingValues paddingValues, int i9, boolean z11, TextStyle textStyle, n nVar7) {
        super(6);
        this.$label = nVar;
        this.$placeholder = nVar2;
        this.$transformedText = str;
        this.$isError = z8;
        this.$$dirty1 = i8;
        this.$colors = textFieldColors;
        this.$enabled = z9;
        this.$interactionSource = interactionSource;
        this.$leadingIcon = nVar3;
        this.$trailingIcon = nVar4;
        this.$supportingText = nVar5;
        this.$type = textFieldType;
        this.$innerTextField = nVar6;
        this.$singleLine = z10;
        this.$contentPadding = paddingValues;
        this.$$dirty = i9;
        this.$shouldOverrideTextStyleColor = z11;
        this.$bodySmall = textStyle;
        this.$container = nVar7;
    }

    @Override // X5.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m1866invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m2981unboximpl(), ((Color) obj3).m2981unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
        return I.f6487a;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-RIQooxk, reason: not valid java name */
    public final void m1866invokeRIQooxk(float f8, long j8, long j9, float f9, Composer composer, int i8) {
        int i9;
        ?? r14;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        ComposableLambda composableLambda4;
        ComposableLambda composableLambda5;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i8 & 14) == 0) {
            if (composer.changed(f8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (composer.changed(j8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (composer.changed(j9)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (composer.changed(f9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((46811 & i14) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1915872767, i14, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
        }
        n nVar = this.$label;
        if (nVar != null) {
            r14 = 1;
            composableLambda = ComposableLambdaKt.composableLambda(composer, 1199990137, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f8, j9, nVar, i14, this.$shouldOverrideTextStyleColor, j8));
        } else {
            r14 = 1;
            composableLambda = null;
        }
        if (this.$placeholder != null && this.$transformedText.length() == 0) {
            composableLambda2 = ComposableLambdaKt.composableLambda(composer, 1472145357, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f9, this.$colors, this.$enabled, this.$$dirty1, this.$placeholder, this.$$dirty));
        } else {
            composableLambda2 = null;
        }
        String m1795getStringNWtq28 = Strings_androidKt.m1795getStringNWtq28(Strings.Companion.m1787getDefaultErrorMessageadMyvUU(), composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object valueOf = Boolean.valueOf(this.$isError);
        boolean z8 = this.$isError;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(m1795getStringNWtq28);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z8, m1795getStringNWtq28);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r14, null);
        TextFieldColors textFieldColors = this.$colors;
        boolean z9 = this.$enabled;
        boolean z10 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i15 = this.$$dirty1;
        long m2981unboximpl = textFieldColors.leadingIconColor$material3_release(z9, z10, interactionSource, composer, (i15 & 1022) | ((i15 >> 3) & 7168)).getValue().m2981unboximpl();
        n nVar2 = this.$leadingIcon;
        if (nVar2 != null) {
            composableLambda3 = ComposableLambdaKt.composableLambda(composer, 175497959, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m2981unboximpl, nVar2));
        } else {
            composableLambda3 = null;
        }
        TextFieldColors textFieldColors2 = this.$colors;
        boolean z11 = this.$enabled;
        boolean z12 = this.$isError;
        InteractionSource interactionSource2 = this.$interactionSource;
        int i16 = this.$$dirty1;
        long m2981unboximpl2 = textFieldColors2.trailingIconColor$material3_release(z11, z12, interactionSource2, composer, (i16 & 1022) | ((i16 >> 3) & 7168)).getValue().m2981unboximpl();
        n nVar3 = this.$trailingIcon;
        if (nVar3 != null) {
            composableLambda4 = ComposableLambdaKt.composableLambda(composer, -432498573, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m2981unboximpl2, nVar3));
        } else {
            composableLambda4 = null;
        }
        TextFieldColors textFieldColors3 = this.$colors;
        boolean z13 = this.$enabled;
        boolean z14 = this.$isError;
        InteractionSource interactionSource3 = this.$interactionSource;
        int i17 = this.$$dirty1;
        long m2981unboximpl3 = textFieldColors3.supportingTextColor$material3_release(z13, z14, interactionSource3, composer, (i17 & 1022) | ((i17 >> 3) & 7168)).getValue().m2981unboximpl();
        n nVar4 = this.$supportingText;
        if (nVar4 != null) {
            composableLambda5 = ComposableLambdaKt.composableLambda(composer, -1269483524, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(m2981unboximpl3, this.$bodySmall, nVar4));
        } else {
            composableLambda5 = null;
        }
        int i18 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
        if (i18 != r14) {
            if (i18 != 2) {
                composer.startReplaceableGroup(404044016);
                composer.endReplaceableGroup();
                I i19 = I.f6487a;
            } else {
                composer.startReplaceableGroup(404042394);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2792boximpl(Size.Companion.m2813getZeroNHjbRc()), null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composer, 787383072, r14, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(mutableState, this.$contentPadding, this.$container, this.$$dirty1));
                n nVar5 = this.$innerTextField;
                boolean z15 = this.$singleLine;
                Object valueOf2 = Float.valueOf(f8);
                composer.startReplaceableGroup(511388516);
                boolean changed2 = composer.changed(valueOf2) | composer.changed(mutableState);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = new TextFieldImplKt$CommonDecorationBox$3$1$1(f8, mutableState);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Function1 function1 = (Function1) rememberedValue3;
                PaddingValues paddingValues = this.$contentPadding;
                int i20 = this.$$dirty;
                ComposableLambda composableLambda7 = composableLambda2;
                ComposableLambda composableLambda8 = composableLambda;
                ComposableLambda composableLambda9 = composableLambda3;
                ComposableLambda composableLambda10 = composableLambda4;
                ComposableLambda composableLambda11 = composableLambda5;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, nVar5, composableLambda7, composableLambda8, composableLambda9, composableLambda10, z15, f8, function1, composableLambda6, composableLambda11, paddingValues, composer, ((i20 >> 9) & 3670016) | ((i20 >> 3) & 112) | 805306368 | ((i14 << 21) & 29360128), (this.$$dirty1 >> 6) & 112);
                composer.endReplaceableGroup();
                I i21 = I.f6487a;
            }
        } else {
            composer.startReplaceableGroup(404041480);
            ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composer, 1566950173, r14, new TextFieldImplKt$CommonDecorationBox$3$containerWithId$1(this.$container, this.$$dirty1));
            n nVar6 = this.$innerTextField;
            boolean z16 = this.$singleLine;
            PaddingValues paddingValues2 = this.$contentPadding;
            int i22 = this.$$dirty;
            ComposableLambda composableLambda13 = composableLambda;
            ComposableLambda composableLambda14 = composableLambda2;
            ComposableLambda composableLambda15 = composableLambda3;
            ComposableLambda composableLambda16 = composableLambda4;
            ComposableLambda composableLambda17 = composableLambda5;
            TextFieldKt.TextFieldLayout(semantics$default, nVar6, composableLambda13, composableLambda14, composableLambda15, composableLambda16, z16, f8, composableLambda12, composableLambda17, paddingValues2, composer, ((i22 >> 9) & 3670016) | ((i22 >> 3) & 112) | 100663296 | ((i14 << 21) & 29360128), (this.$$dirty1 >> 9) & 14);
            composer.endReplaceableGroup();
            I i23 = I.f6487a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
