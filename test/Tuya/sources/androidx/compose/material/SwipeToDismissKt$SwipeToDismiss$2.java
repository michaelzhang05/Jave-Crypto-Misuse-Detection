package androidx.compose.material;

import L5.I;
import L5.r;
import L5.x;
import M5.Q;
import X5.n;
import X5.o;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$2 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ o $dismissContent;
    final /* synthetic */ Function1 $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, Function1 function1, int i8, DismissState dismissState, o oVar, o oVar2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$$dirty = i8;
        this.$state = dismissState;
        this.$background = oVar;
        this.$dismissContent = oVar2;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
        int i9;
        AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
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
        float m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(BoxWithConstraints.mo538getConstraintsmsEJaDk());
        boolean z8 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Float valueOf = Float.valueOf(0.0f);
        DismissValue dismissValue = DismissValue.Default;
        Map m8 = Q.m(x.a(valueOf, dismissValue));
        Set<DismissDirection> set = this.$directions;
        DismissDirection dismissDirection = DismissDirection.StartToEnd;
        if (set.contains(dismissDirection)) {
            r a8 = x.a(Float.valueOf(m5146getMaxWidthimpl), DismissValue.DismissedToEnd);
            m8.put(a8.c(), a8.d());
        }
        Set<DismissDirection> set2 = this.$directions;
        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
        if (set2.contains(dismissDirection2)) {
            r a9 = x.a(Float.valueOf(-m5146getMaxWidthimpl), DismissValue.DismissedToStart);
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
        n nVar = (n) rememberedValue;
        float f8 = this.$directions.contains(dismissDirection2) ? 10.0f : 20.0f;
        float f9 = this.$directions.contains(dismissDirection) ? 10.0f : 20.0f;
        Modifier.Companion companion = Modifier.Companion;
        Modifier m1364swipeablepPrIpRY$default = SwipeableKt.m1364swipeablepPrIpRY$default(companion, this.$state, m8, Orientation.Horizontal, this.$state.getCurrentValue() == dismissValue, z8, null, nVar, new ResistanceConfig(m5146getMaxWidthimpl, f8, f9), 0.0f, 288, null);
        o oVar = this.$background;
        int i10 = this.$$dirty;
        DismissState dismissState = this.$state;
        o oVar2 = this.$dismissContent;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m1364swipeablepPrIpRY$default);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
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
        o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(matchParentSize);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        oVar.invoke(rowScopeInstance, composer, Integer.valueOf(((i11 >> 6) & 112) | 6));
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
        o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(offset);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m2496constructorimpl3 = Updater.m2496constructorimpl(composer);
        Updater.m2503setimpl(m2496constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        oVar2.invoke(rowScopeInstance, composer, Integer.valueOf(((i12 >> 6) & 112) | 6));
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
