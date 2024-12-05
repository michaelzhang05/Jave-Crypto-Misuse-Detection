package androidx.compose.material3;

import L5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j8, PaddingValues paddingValues) {
        super(1);
        this.$labelSize = j8;
        this.$paddingValues = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        float f8;
        float c8;
        AbstractC3159y.i(drawWithContent, "$this$drawWithContent");
        float m2804getWidthimpl = Size.m2804getWidthimpl(this.$labelSize);
        if (m2804getWidthimpl > 0.0f) {
            f8 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
            float mo448toPx0680j_4 = drawWithContent.mo448toPx0680j_4(f8);
            float mo448toPx0680j_42 = drawWithContent.mo448toPx0680j_4(this.$paddingValues.mo551calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - mo448toPx0680j_4;
            float f9 = 2;
            float f10 = m2804getWidthimpl + mo448toPx0680j_42 + (mo448toPx0680j_4 * f9);
            LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                c8 = Size.m2804getWidthimpl(drawWithContent.mo3414getSizeNHjbRc()) - f10;
            } else {
                c8 = m.c(mo448toPx0680j_42, 0.0f);
            }
            float f11 = c8;
            if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                f10 = Size.m2804getWidthimpl(drawWithContent.mo3414getSizeNHjbRc()) - m.c(mo448toPx0680j_42, 0.0f);
            }
            float f12 = f10;
            float m2801getHeightimpl = Size.m2801getHeightimpl(this.$labelSize);
            float f13 = (-m2801getHeightimpl) / f9;
            float f14 = m2801getHeightimpl / f9;
            int m2959getDifferencertfAjoo = ClipOp.Companion.m2959getDifferencertfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3423clipRectN_I0leg(f11, f13, f12, f14, m2959getDifferencertfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
            return;
        }
        drawWithContent.drawContent();
    }
}
