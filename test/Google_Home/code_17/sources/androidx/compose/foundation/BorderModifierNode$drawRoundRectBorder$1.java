package androidx.compose.foundation;

import O5.I;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z8, Brush brush, long j8, float f8, float f9, long j9, long j10, Stroke stroke) {
        super(1);
        this.$fillArea = z8;
        this.$brush = brush;
        this.$cornerRadius = j8;
        this.$halfStroke = f8;
        this.$strokeWidth = f9;
        this.$topLeft = j9;
        this.$borderSize = j10;
        this.$borderStroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        long m302shrinkKibmq7A;
        AbstractC3255y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m2715getXimpl = CornerRadius.m2715getXimpl(this.$cornerRadius);
        float f8 = this.$halfStroke;
        if (m2715getXimpl < f8) {
            float f9 = this.$strokeWidth;
            float m2809getWidthimpl = Size.m2809getWidthimpl(onDrawWithContent.mo3419getSizeNHjbRc()) - this.$strokeWidth;
            float m2806getHeightimpl = Size.m2806getHeightimpl(onDrawWithContent.mo3419getSizeNHjbRc()) - this.$strokeWidth;
            int m2964getDifferencertfAjoo = ClipOp.Companion.m2964getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j8 = this.$cornerRadius;
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long mo3425getSizeNHjbRc = drawContext.mo3425getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3428clipRectN_I0leg(f9, f9, m2809getWidthimpl, m2806getHeightimpl, m2964getDifferencertfAjoo);
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush, 0L, 0L, j8, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo3426setSizeuvyYCjk(mo3425getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j9 = this.$topLeft;
        long j10 = this.$borderSize;
        m302shrinkKibmq7A = BorderKt.m302shrinkKibmq7A(this.$cornerRadius, f8);
        androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush2, j9, j10, m302shrinkKibmq7A, 0.0f, this.$borderStroke, null, 0, 208, null);
    }
}
