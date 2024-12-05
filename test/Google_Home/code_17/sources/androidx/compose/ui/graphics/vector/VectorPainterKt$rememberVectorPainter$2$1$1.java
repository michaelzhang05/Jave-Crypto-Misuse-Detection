package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorPainterKt$rememberVectorPainter$2$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1670p $content;
    final /* synthetic */ long $viewport;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$1$1(InterfaceC1670p interfaceC1670p, long j8) {
        super(2);
        this.$content = interfaceC1670p;
        this.$viewport = j8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-824421385, i8, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
        }
        this.$content.invoke(Float.valueOf(Size.m2809getWidthimpl(this.$viewport)), Float.valueOf(Size.m2806getHeightimpl(this.$viewport)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
