package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, Function0 function0, n nVar, int i8, n nVar2) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z9;
        this.$onClick = function0;
        this.$icon = nVar;
        this.$$dirty = i8;
        this.$text = nVar2;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float f8;
        float f9;
        float f10;
        TextStyle m4719copyv2rsoow;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866677691, i8, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
        }
        Modifier modifier = this.$modifier;
        f8 = TabKt.SmallTabHeight;
        Modifier m822selectableO2vRcR0 = SelectableKt.m822selectableO2vRcR0(SizeKt.m633height3ABfNKs(modifier, f8), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m4516boximpl(Role.Companion.m4529getTabo7Vup1c()), this.$onClick);
        f9 = TabKt.HorizontalTextPadding;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m602paddingVpY3zN4$default(m822selectableO2vRcR0, f9, 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        n nVar = this.$icon;
        int i9 = this.$$dirty;
        n nVar2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        nVar.invoke(composer, Integer.valueOf((i9 >> 9) & 14));
        Modifier.Companion companion2 = Modifier.Companion;
        f10 = TabKt.TextDistanceFromLeadingIcon;
        SpacerKt.Spacer(SizeKt.m644requiredWidth3ABfNKs(companion2, f10), composer, 6);
        m4719copyv2rsoow = r8.m4719copyv2rsoow((r48 & 1) != 0 ? r8.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r8.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r8.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r8.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r8.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r8.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r8.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(r8.paragraphStyle.m4607getTextAligne0LSkKk()) : TextAlign.m5075boximpl(TextAlign.Companion.m5082getCentere0LSkKk()), (r48 & 65536) != 0 ? TextDirection.m5089boximpl(r8.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r8.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r8.platformStyle : null, (r48 & 1048576) != 0 ? r8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(r8.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(r8.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getButton().paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m4719copyv2rsoow, nVar2, composer, (i9 >> 3) & 112);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
