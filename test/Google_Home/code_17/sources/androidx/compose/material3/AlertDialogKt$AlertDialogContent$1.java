package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ InterfaceC1668n $buttons;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ InterfaceC1668n $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ InterfaceC1668n $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$1(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, long j8, int i8, long j9, long j10, long j11, InterfaceC1668n interfaceC1668n4) {
        super(2);
        this.$icon = interfaceC1668n;
        this.$title = interfaceC1668n2;
        this.$text = interfaceC1668n3;
        this.$iconContentColor = j8;
        this.$$dirty = i8;
        this.$titleContentColor = j9;
        this.$textContentColor = j10;
        this.$buttonContentColor = j11;
        this.$buttons = interfaceC1668n4;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float f8;
        float f9;
        PaddingValues paddingValues;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126308228, i8, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:57)");
        }
        Modifier.Companion companion = Modifier.Companion;
        f8 = AlertDialogKt.MinWidth;
        f9 = AlertDialogKt.MaxWidth;
        Modifier m656sizeInqDBjuR0$default = SizeKt.m656sizeInqDBjuR0$default(companion, f8, 0.0f, f9, 0.0f, 10, null);
        paddingValues = AlertDialogKt.DialogPadding;
        Modifier padding = PaddingKt.padding(m656sizeInqDBjuR0$default, paddingValues);
        InterfaceC1668n interfaceC1668n = this.$icon;
        InterfaceC1668n interfaceC1668n2 = this.$title;
        InterfaceC1668n interfaceC1668n3 = this.$text;
        long j8 = this.$iconContentColor;
        int i9 = this.$$dirty;
        long j9 = this.$titleContentColor;
        long j10 = this.$textContentColor;
        long j11 = this.$buttonContentColor;
        InterfaceC1668n interfaceC1668n4 = this.$buttons;
        composer.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC1669o materializerOf = LayoutKt.materializerOf(padding);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, density, companion3.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1370717838);
        composer.startReplaceableGroup(76440864);
        if (interfaceC1668n != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j8))}, ComposableLambdaKt.composableLambda(composer, 934657765, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, interfaceC1668n, i9)), composer, 56);
            I i10 = I.f8278a;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76441259);
        if (interfaceC1668n2 != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j9))}, ComposableLambdaKt.composableLambda(composer, 1845262876, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, interfaceC1668n, interfaceC1668n2, i9)), composer, 56);
            I i11 = I.f8278a;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76442209);
        if (interfaceC1668n3 != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j10))}, ComposableLambdaKt.composableLambda(composer, 613970333, true, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, interfaceC1668n3, i9)), composer, 56);
            I i12 = I.f8278a;
        }
        composer.endReplaceableGroup();
        Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor2 = companion3.getConstructor();
        InterfaceC1669o materializerOf2 = LayoutKt.materializerOf(align);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
        Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, density2, companion3.getSetDensity());
        Updater.m2508setimpl(m2501constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m2508setimpl(m2501constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1902704376);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(j11))}, ComposableLambdaKt.composableLambda(composer, -433542216, true, new AlertDialogKt$AlertDialogContent$1$1$4$1(interfaceC1668n4, i9)), composer, 56);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
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