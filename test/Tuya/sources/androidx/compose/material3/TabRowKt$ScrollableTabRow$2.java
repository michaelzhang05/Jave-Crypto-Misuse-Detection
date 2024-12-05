package androidx.compose.material3;

import L5.I;
import M5.AbstractC1246t;
import P5.h;
import X5.n;
import X5.o;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ o $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRow$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ n $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ o $indicator;
        final /* synthetic */ ScrollableTabData $scrollableTabData;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ n $tabs;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRow$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03371 extends AbstractC3160z implements Function1 {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ long $constraints;
            final /* synthetic */ n $divider;
            final /* synthetic */ o $indicator;
            final /* synthetic */ int $layoutHeight;
            final /* synthetic */ int $layoutWidth;
            final /* synthetic */ int $padding;
            final /* synthetic */ ScrollableTabData $scrollableTabData;
            final /* synthetic */ int $selectedTabIndex;
            final /* synthetic */ List<Placeable> $tabPlaceables;
            final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRow$2$1$1$3, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends AbstractC3160z implements n {
                final /* synthetic */ int $$dirty;
                final /* synthetic */ o $indicator;
                final /* synthetic */ List<TabPosition> $tabPositions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(o oVar, List<TabPosition> list, int i8) {
                    super(2);
                    this.$indicator = oVar;
                    this.$tabPositions = list;
                    this.$$dirty = i8;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6487a;
                }

                @Composable
                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(963343607, i8, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                    }
                    this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 12) & 112) | 8));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03371(int i8, List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, n nVar, ScrollableTabData scrollableTabData, int i9, long j8, int i10, int i11, o oVar, int i12) {
                super(1);
                this.$padding = i8;
                this.$tabPlaceables = list;
                this.$this_SubcomposeLayout = subcomposeMeasureScope;
                this.$divider = nVar;
                this.$scrollableTabData = scrollableTabData;
                this.$selectedTabIndex = i9;
                this.$constraints = j8;
                this.$layoutWidth = i10;
                this.$layoutHeight = i11;
                this.$indicator = oVar;
                this.$$dirty = i12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return I.f6487a;
            }

            public final void invoke(Placeable.PlacementScope layout) {
                AbstractC3159y.i(layout, "$this$layout");
                ArrayList arrayList = new ArrayList();
                int i8 = this.$padding;
                List<Placeable> list = this.$tabPlaceables;
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                int i9 = i8;
                for (Placeable placeable : list) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, i9, 0, 0.0f, 4, null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.mo445toDpu2uoSUM(i9), subcomposeMeasureScope.mo445toDpu2uoSUM(placeable.getWidth()), null));
                    i9 += placeable.getWidth();
                }
                List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
                long j8 = this.$constraints;
                int i10 = this.$layoutWidth;
                int i11 = this.$layoutHeight;
                Iterator<T> it = subcompose.iterator();
                while (it.hasNext()) {
                    Placeable mo4131measureBRTryo0 = ((Measurable) it.next()).mo4131measureBRTryo0(Constraints.m5137copyZbe2FdA$default(j8, i10, i10, 0, 0, 8, null));
                    Placeable.PlacementScope.placeRelative$default(layout, mo4131measureBRTryo0, 0, i11 - mo4131measureBRTryo0.getHeight(), 0.0f, 4, null);
                    i10 = i10;
                    i11 = i11;
                    j8 = j8;
                }
                List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(963343607, true, new AnonymousClass3(this.$indicator, arrayList, this.$$dirty)));
                int i12 = this.$layoutWidth;
                int i13 = this.$layoutHeight;
                Iterator<T> it2 = subcompose2.iterator();
                while (it2.hasNext()) {
                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                }
                this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f8, n nVar, n nVar2, ScrollableTabData scrollableTabData, int i8, o oVar, int i9) {
            super(2);
            this.$edgePadding = f8;
            this.$tabs = nVar;
            this.$divider = nVar2;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i8;
            this.$indicator = oVar;
            this.$$dirty = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1838invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
        }

        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final MeasureResult m1838invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
            float f8;
            AbstractC3159y.i(SubcomposeLayout, "$this$SubcomposeLayout");
            f8 = TabRowKt.ScrollableTabRowMinimumTabWidth;
            int mo442roundToPx0680j_4 = SubcomposeLayout.mo442roundToPx0680j_4(f8);
            int mo442roundToPx0680j_42 = SubcomposeLayout.mo442roundToPx0680j_4(this.$edgePadding);
            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
            Iterator<T> it = subcompose.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8 = Math.max(i8, ((Measurable) it.next()).maxIntrinsicHeight(Integer.MAX_VALUE));
            }
            long m5137copyZbe2FdA$default = Constraints.m5137copyZbe2FdA$default(j8, mo442roundToPx0680j_4, 0, i8, 0, 10, null);
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(subcompose, 10));
            Iterator<T> it2 = subcompose.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Measurable) it2.next()).mo4131measureBRTryo0(m5137copyZbe2FdA$default));
            }
            Iterator it3 = arrayList.iterator();
            int i9 = mo442roundToPx0680j_42 * 2;
            while (it3.hasNext()) {
                i9 += ((Placeable) it3.next()).getWidth();
            }
            return MeasureScope.CC.q(SubcomposeLayout, i9, i8, null, new C03371(mo442roundToPx0680j_42, arrayList, SubcomposeLayout, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, j8, i9, i8, this.$indicator, this.$$dirty), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2(float f8, n nVar, n nVar2, int i8, o oVar, int i9) {
        super(2);
        this.$edgePadding = f8;
        this.$tabs = nVar;
        this.$divider = nVar2;
        this.$selectedTabIndex = i8;
        this.$indicator = oVar;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(286469328, i8, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f7994a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null))), new AnonymousClass1(this.$edgePadding, this.$tabs, this.$divider, (ScrollableTabData) rememberedValue2, this.$selectedTabIndex, this.$indicator, this.$$dirty), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
