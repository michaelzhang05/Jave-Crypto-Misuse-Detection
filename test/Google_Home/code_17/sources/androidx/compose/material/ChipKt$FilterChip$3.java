package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$FilterChip$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1668n $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ InterfaceC1668n $selectedIcon;
    final /* synthetic */ InterfaceC1668n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ InterfaceC1669o $content;
        final /* synthetic */ State<Color> $contentColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InterfaceC1668n $leadingIcon;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ InterfaceC1668n $selectedIcon;
        final /* synthetic */ InterfaceC1668n $trailingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03151 extends AbstractC3256z implements InterfaceC1668n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ SelectableChipColors $colors;
            final /* synthetic */ InterfaceC1669o $content;
            final /* synthetic */ State<Color> $contentColor;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ InterfaceC1668n $leadingIcon;
            final /* synthetic */ boolean $selected;
            final /* synthetic */ InterfaceC1668n $selectedIcon;
            final /* synthetic */ InterfaceC1668n $trailingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03151(InterfaceC1668n interfaceC1668n, boolean z8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1669o interfaceC1669o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9, State<Color> state) {
                super(2);
                this.$leadingIcon = interfaceC1668n;
                this.$selected = z8;
                this.$selectedIcon = interfaceC1668n2;
                this.$trailingIcon = interfaceC1668n3;
                this.$content = interfaceC1669o;
                this.$$dirty1 = i8;
                this.$colors = selectableChipColors;
                this.$enabled = z9;
                this.$$dirty = i9;
                this.$contentColor = state;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                float m5183constructorimpl;
                float m5183constructorimpl2;
                float f8;
                RowScopeInstance rowScopeInstance;
                int i9;
                float f9;
                int i10;
                Modifier modifier;
                float f10;
                float f11;
                float f12;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1543702066, i8, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m637defaultMinSizeVpY3zN4$default = SizeKt.m637defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1169getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null && (!this.$selected || this.$selectedIcon == null)) {
                    m5183constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m5183constructorimpl = Dp.m5183constructorimpl(0);
                }
                float f13 = m5183constructorimpl;
                if (this.$trailingIcon == null) {
                    m5183constructorimpl2 = ChipKt.HorizontalPadding;
                } else {
                    m5183constructorimpl2 = Dp.m5183constructorimpl(0);
                }
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(m637defaultMinSizeVpY3zN4$default, f13, 0.0f, m5183constructorimpl2, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                InterfaceC1668n interfaceC1668n = this.$leadingIcon;
                boolean z8 = this.$selected;
                InterfaceC1668n interfaceC1668n2 = this.$selectedIcon;
                InterfaceC1669o interfaceC1669o = this.$content;
                int i11 = this.$$dirty1;
                InterfaceC1668n interfaceC1668n3 = this.$trailingIcon;
                SelectableChipColors selectableChipColors = this.$colors;
                boolean z9 = this.$enabled;
                int i12 = this.$$dirty;
                State<Color> state = this.$contentColor;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
                Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1943412047);
                if (interfaceC1668n != null || (z8 && interfaceC1668n2 != null)) {
                    f8 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f8), composer, 6);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0 constructor2 = companion3.getConstructor();
                    rowScopeInstance = rowScopeInstance2;
                    InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                    i9 = i11;
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
                    Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(649985685);
                    if (interfaceC1668n != null) {
                        State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z9, z8, composer, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 15) & 896));
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2978getAlphaimpl(leadingIconColor.getValue().m2986unboximpl())))}, interfaceC1668n, composer, ((i12 >> 21) & 112) | 8);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1943411233);
                    if (z8 && interfaceC1668n2 != null) {
                        long m2986unboximpl = state.getValue().m2986unboximpl();
                        composer.startReplaceableGroup(649986516);
                        if (interfaceC1668n != null) {
                            f10 = ChipKt.SelectedIconContainerSize;
                            modifier = ClipKt.clip(BackgroundKt.m286backgroundbw27NRU(SizeKt.m644requiredSize3ABfNKs(companion, f10), state.getValue().m2986unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                            m2986unboximpl = selectableChipColors.backgroundColor(z9, z8, composer, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 15) & 896)).getValue().m2986unboximpl();
                        } else {
                            modifier = companion;
                        }
                        composer.endReplaceableGroup();
                        Alignment center = companion2.getCenter();
                        composer.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Function0 constructor3 = companion3.getConstructor();
                        InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer m2501constructorimpl3 = Updater.m2501constructorimpl(composer);
                        Updater.m2508setimpl(m2501constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(m2986unboximpl))}, interfaceC1668n2, composer, ((i12 >> 24) & 112) | 8);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    f9 = ChipKt.LeadingIconEndSpacing;
                    i10 = 6;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f9), composer, 6);
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    i9 = i11;
                    i10 = 6;
                }
                composer.endReplaceableGroup();
                interfaceC1669o.invoke(rowScopeInstance, composer, Integer.valueOf((i9 & 112) | i10));
                composer.startReplaceableGroup(-1181292829);
                if (interfaceC1668n3 != null) {
                    f11 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f11), composer, i10);
                    interfaceC1668n3.invoke(composer, Integer.valueOf(i9 & 14));
                    f12 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f12), composer, i10);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC1668n interfaceC1668n, boolean z8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1669o interfaceC1669o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9, State<Color> state) {
            super(2);
            this.$leadingIcon = interfaceC1668n;
            this.$selected = z8;
            this.$selectedIcon = interfaceC1668n2;
            this.$trailingIcon = interfaceC1668n3;
            this.$content = interfaceC1669o;
            this.$$dirty1 = i8;
            this.$colors = selectableChipColors;
            this.$enabled = z9;
            this.$$dirty = i9;
            this.$contentColor = state;
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
                ComposerKt.traceEventStart(1582291359, i8, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C03151(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$3(State<Color> state, InterfaceC1668n interfaceC1668n, boolean z8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1669o interfaceC1669o, int i8, SelectableChipColors selectableChipColors, boolean z9, int i9) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = interfaceC1668n;
        this.$selected = z8;
        this.$selectedIcon = interfaceC1668n2;
        this.$trailingIcon = interfaceC1668n3;
        this.$content = interfaceC1669o;
        this.$$dirty1 = i8;
        this.$colors = selectableChipColors;
        this.$enabled = z9;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(722126431, i8, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2978getAlphaimpl(this.$contentColor.getValue().m2986unboximpl())))}, ComposableLambdaKt.composableLambda(composer, 1582291359, true, new AnonymousClass1(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
