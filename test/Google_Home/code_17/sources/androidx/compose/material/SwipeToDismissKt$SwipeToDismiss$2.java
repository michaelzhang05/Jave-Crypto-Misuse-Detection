package androidx.compose.material;

import O5.I;
import O5.r;
import O5.x;
import P5.Q;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1669o $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ InterfaceC1669o $dismissContent;
    final /* synthetic */ Function1 $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, Function1 function1, int i8, DismissState dismissState, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$$dirty = i8;
        this.$state = dismissState;
        this.$background = interfaceC1669o;
        this.$dismissContent = interfaceC1669o2;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(338007641, i8, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
        }
        float m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(BoxWithConstraints.mo543getConstraintsmsEJaDk());
        boolean z8 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Float valueOf = Float.valueOf(0.0f);
        DismissValue dismissValue = DismissValue.Default;
        Map m8 = Q.m(x.a(valueOf, dismissValue));
        Set<DismissDirection> set = this.$directions;
        DismissDirection dismissDirection = DismissDirection.StartToEnd;
        if (set.contains(dismissDirection)) {
            r a8 = x.a(Float.valueOf(m5151getMaxWidthimpl), DismissValue.DismissedToEnd);
            m8.put(a8.c(), a8.d());
        }
        Set<DismissDirection> set2 = this.$directions;
        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
        if (set2.contains(dismissDirection2)) {
            r a9 = x.a(Float.valueOf(-m5151getMaxWidthimpl), DismissValue.DismissedToStart);
            m8.put(a9.c(), a9.d());
        }
        Function1 function1 = this.$dismissThresholds;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InterfaceC1668n interfaceC1668n = (InterfaceC1668n) rememberedValue;
        float f8 = this.$directions.contains(dismissDirection2) ? 10.0f : 20.0f;
        float f9 = this.$directions.contains(dismissDirection) ? 10.0f : 20.0f;
        Modifier.Companion companion = Modifier.Companion;
        Modifier m1369swipeablepPrIpRY$default = SwipeableKt.m1369swipeablepPrIpRY$default(companion, this.$state, m8, Orientation.Horizontal, this.$state.getCurrentValue() == dismissValue, z8, null, interfaceC1668n, new ResistanceConfig(m5151getMaxWidthimpl, f8, f9), 0.0f, 288, null);
        InterfaceC1669o interfaceC1669o = this.$background;
        int i10 = this.$$dirty;
        DismissState dismissState = this.$state;
        InterfaceC1669o interfaceC1669o2 = this.$dismissContent;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m1369swipeablepPrIpRY$default);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
        int i11 = (i10 >> 3) & 7168;
        composer.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(matchParentSize);
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
        Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        interfaceC1669o.invoke(rowScopeInstance, composer, Integer.valueOf(((i11 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(dismissState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SwipeToDismissKt$SwipeToDismiss$2$1$1$1(dismissState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier offset = OffsetKt.offset(companion, (Function1) rememberedValue2);
        int i12 = (i10 >> 6) & 7168;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0 constructor3 = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(offset);
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
        Updater.m2508setimpl(m2501constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        interfaceC1669o2.invoke(rowScopeInstance, composer, Integer.valueOf(((i12 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
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
