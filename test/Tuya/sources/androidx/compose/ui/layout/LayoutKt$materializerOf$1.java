package androidx.compose.ui.layout;

import L5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutKt$materializerOf$1 extends AbstractC3160z implements X5.o {
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m4145invokeDeg8D_g(((SkippableUpdater) obj).m2492unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m4145invokeDeg8D_g(Composer composer, Composer composer2, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1586257396, i8, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:202)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m2503setimpl(m2496constructorimpl, materializeModifier, companion.getSetModifier());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
