package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
public final class ChipKt$Chip$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1668n $leadingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ChipKt$Chip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ InterfaceC1669o $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InterfaceC1668n $leadingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ChipKt$Chip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03141 extends AbstractC3256z implements InterfaceC1668n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ChipColors $colors;
            final /* synthetic */ InterfaceC1669o $content;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ InterfaceC1668n $leadingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03141(InterfaceC1668n interfaceC1668n, ChipColors chipColors, boolean z8, int i8, InterfaceC1669o interfaceC1669o) {
                super(2);
                this.$leadingIcon = interfaceC1668n;
                this.$colors = chipColors;
                this.$enabled = z8;
                this.$$dirty = i8;
                this.$content = interfaceC1669o;
            }

            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                return state.getValue().m2986unboximpl();
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
                float f8;
                float f9;
                float f10;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1131213696, i8, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m637defaultMinSizeVpY3zN4$default = SizeKt.m637defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1169getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null) {
                    m5183constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m5183constructorimpl = Dp.m5183constructorimpl(0);
                }
                float f11 = m5183constructorimpl;
                f8 = ChipKt.HorizontalPadding;
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(m637defaultMinSizeVpY3zN4$default, f11, 0.0f, f8, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                InterfaceC1668n interfaceC1668n = this.$leadingIcon;
                ChipColors chipColors = this.$colors;
                boolean z8 = this.$enabled;
                int i9 = this.$$dirty;
                InterfaceC1669o interfaceC1669o = this.$content;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
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
                Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(2084788937);
                if (interfaceC1668n != null) {
                    f9 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f9), composer, 6);
                    State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z8, composer, ((i9 >> 6) & 14) | ((i9 >> 15) & 112));
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2978getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, interfaceC1668n, composer, ((i9 >> 18) & 112) | 8);
                    f10 = ChipKt.LeadingIconEndSpacing;
                    SpacerKt.Spacer(SizeKt.m657width3ABfNKs(companion, f10), composer, 6);
                }
                composer.endReplaceableGroup();
                interfaceC1669o.invoke(rowScopeInstance, composer, Integer.valueOf(((i9 >> 21) & 112) | 6));
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
        AnonymousClass1(InterfaceC1668n interfaceC1668n, ChipColors chipColors, boolean z8, int i8, InterfaceC1669o interfaceC1669o) {
            super(2);
            this.$leadingIcon = interfaceC1668n;
            this.$colors = chipColors;
            this.$enabled = z8;
            this.$$dirty = i8;
            this.$content = interfaceC1669o;
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
                ComposerKt.traceEventStart(667535631, i8, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C03141(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(State<Color> state, InterfaceC1668n interfaceC1668n, ChipColors chipColors, boolean z8, int i8, InterfaceC1669o interfaceC1669o) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = interfaceC1668n;
        this.$colors = chipColors;
        this.$enabled = z8;
        this.$$dirty = i8;
        this.$content = interfaceC1669o;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        long Chip$lambda$1;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139076687, i8, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
        }
        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
        Chip$lambda$1 = ChipKt.Chip$lambda$1(this.$contentColor$delegate);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(Color.m2978getAlphaimpl(Chip$lambda$1)))}, ComposableLambdaKt.composableLambda(composer, 667535631, true, new AnonymousClass1(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
