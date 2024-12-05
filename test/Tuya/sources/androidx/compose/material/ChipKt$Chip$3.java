package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$Chip$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ o $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $leadingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ChipKt$Chip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ o $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ n $leadingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.ChipKt$Chip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03091 extends AbstractC3160z implements n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ChipColors $colors;
            final /* synthetic */ o $content;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ n $leadingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03091(n nVar, ChipColors chipColors, boolean z8, int i8, o oVar) {
                super(2);
                this.$leadingIcon = nVar;
                this.$colors = chipColors;
                this.$enabled = z8;
                this.$$dirty = i8;
                this.$content = oVar;
            }

            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                return state.getValue().m2981unboximpl();
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                float m5178constructorimpl;
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
                Modifier m632defaultMinSizeVpY3zN4$default = SizeKt.m632defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1164getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null) {
                    m5178constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m5178constructorimpl = Dp.m5178constructorimpl(0);
                }
                float f11 = m5178constructorimpl;
                f8 = ChipKt.HorizontalPadding;
                Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(m632defaultMinSizeVpY3zN4$default, f11, 0.0f, f8, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                n nVar = this.$leadingIcon;
                ChipColors chipColors = this.$colors;
                boolean z8 = this.$enabled;
                int i9 = this.$$dirty;
                o oVar = this.$content;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
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
                Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(2084788937);
                if (nVar != null) {
                    f9 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m652width3ABfNKs(companion, f9), composer, 6);
                    State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z8, composer, ((i9 >> 6) & 14) | ((i9 >> 15) & 112));
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2961boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2973getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, nVar, composer, ((i9 >> 18) & 112) | 8);
                    f10 = ChipKt.LeadingIconEndSpacing;
                    SpacerKt.Spacer(SizeKt.m652width3ABfNKs(companion, f10), composer, 6);
                }
                composer.endReplaceableGroup();
                oVar.invoke(rowScopeInstance, composer, Integer.valueOf(((i9 >> 21) & 112) | 6));
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
        AnonymousClass1(n nVar, ChipColors chipColors, boolean z8, int i8, o oVar) {
            super(2);
            this.$leadingIcon = nVar;
            this.$colors = chipColors;
            this.$enabled = z8;
            this.$$dirty = i8;
            this.$content = oVar;
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
                ComposerKt.traceEventStart(667535631, i8, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C03091(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(State<Color> state, n nVar, ChipColors chipColors, boolean z8, int i8, o oVar) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = nVar;
        this.$colors = chipColors;
        this.$enabled = z8;
        this.$$dirty = i8;
        this.$content = oVar;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
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
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(Color.m2973getAlphaimpl(Chip$lambda$1)))}, ComposableLambdaKt.composableLambda(composer, 667535631, true, new AnonymousClass1(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
