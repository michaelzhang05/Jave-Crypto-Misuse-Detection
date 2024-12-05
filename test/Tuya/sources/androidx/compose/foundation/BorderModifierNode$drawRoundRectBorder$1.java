package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends AbstractC3160z implements Function1 {
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
        return I.f6487a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        long m297shrinkKibmq7A;
        AbstractC3159y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m2710getXimpl = CornerRadius.m2710getXimpl(this.$cornerRadius);
        float f8 = this.$halfStroke;
        if (m2710getXimpl < f8) {
            float f9 = this.$strokeWidth;
            float m2804getWidthimpl = Size.m2804getWidthimpl(onDrawWithContent.mo3414getSizeNHjbRc()) - this.$strokeWidth;
            float m2801getHeightimpl = Size.m2801getHeightimpl(onDrawWithContent.mo3414getSizeNHjbRc()) - this.$strokeWidth;
            int m2959getDifferencertfAjoo = ClipOp.Companion.m2959getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j8 = this.$cornerRadius;
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3423clipRectN_I0leg(f9, f9, m2804getWidthimpl, m2801getHeightimpl, m2959getDifferencertfAjoo);
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush, 0L, 0L, j8, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j9 = this.$topLeft;
        long j10 = this.$borderSize;
        m297shrinkKibmq7A = BorderKt.m297shrinkKibmq7A(this.$cornerRadius, f8);
        androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush2, j9, j10, m297shrinkKibmq7A, 0.0f, this.$borderStroke, null, 0, 208, null);
    }
}
