package androidx.compose.foundation;

import L5.p;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ BorderModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.this$0 = borderModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope CacheDrawModifierNode) {
        DrawResult drawContentWithoutBorder;
        DrawResult m296drawRectBorderNsqcLGU;
        DrawResult m299drawRoundRectBorderJqoCqck;
        DrawResult drawGenericBorder;
        AbstractC3159y.i(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        if (CacheDrawModifierNode.mo448toPx0680j_4(this.this$0.m300getWidthD9Ej5fM()) < 0.0f || Size.m2803getMinDimensionimpl(CacheDrawModifierNode.m2639getSizeNHjbRc()) <= 0.0f) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(CacheDrawModifierNode);
            return drawContentWithoutBorder;
        }
        float f8 = 2;
        float min = Math.min(Dp.m5183equalsimpl0(this.this$0.m300getWidthD9Ej5fM(), Dp.Companion.m5196getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(CacheDrawModifierNode.mo448toPx0680j_4(this.this$0.m300getWidthD9Ej5fM())), (float) Math.ceil(Size.m2803getMinDimensionimpl(CacheDrawModifierNode.m2639getSizeNHjbRc()) / f8));
        float f9 = min / f8;
        long Offset = OffsetKt.Offset(f9, f9);
        long Size = SizeKt.Size(Size.m2804getWidthimpl(CacheDrawModifierNode.m2639getSizeNHjbRc()) - min, Size.m2801getHeightimpl(CacheDrawModifierNode.m2639getSizeNHjbRc()) - min);
        boolean z8 = f8 * min > Size.m2803getMinDimensionimpl(CacheDrawModifierNode.m2639getSizeNHjbRc());
        Outline mo331createOutlinePq9zytI = this.this$0.getShape().mo331createOutlinePq9zytI(CacheDrawModifierNode.m2639getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (mo331createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            drawGenericBorder = borderModifierNode.drawGenericBorder(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) mo331createOutlinePq9zytI, z8, min);
            return drawGenericBorder;
        }
        if (mo331createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m299drawRoundRectBorderJqoCqck = borderModifierNode2.m299drawRoundRectBorderJqoCqck(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) mo331createOutlinePq9zytI, Offset, Size, z8, min);
            return m299drawRoundRectBorderJqoCqck;
        }
        if (!(mo331createOutlinePq9zytI instanceof Outline.Rectangle)) {
            throw new p();
        }
        m296drawRectBorderNsqcLGU = BorderKt.m296drawRectBorderNsqcLGU(CacheDrawModifierNode, this.this$0.getBrush(), Offset, Size, z8, min);
        return m296drawRectBorderNsqcLGU;
    }
}
