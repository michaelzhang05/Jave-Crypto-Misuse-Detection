package androidx.compose.ui.layout;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutKt$combineAsVirtualLayouts$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ List<InterfaceC1668n> $contents;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutKt$combineAsVirtualLayouts$1(List<? extends InterfaceC1668n> list) {
        super(2);
        this.$contents = list;
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
            ComposerKt.traceEventStart(-1953651383, i8, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:179)");
        }
        List<InterfaceC1668n> list = this.$contents;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC1668n interfaceC1668n = list.get(i9);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 virtualConstructor = companion.getVirtualConstructor();
            composer.startReplaceableGroup(-692256719);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(virtualConstructor);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            interfaceC1668n.invoke(composer, 0);
            composer.endNode();
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
