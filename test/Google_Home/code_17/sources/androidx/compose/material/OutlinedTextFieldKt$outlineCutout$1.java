package androidx.compose.material;

import O5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import g6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
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
        return I.f8278a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        float f8;
        float c8;
        AbstractC3255y.i(drawWithContent, "$this$drawWithContent");
        float m2809getWidthimpl = Size.m2809getWidthimpl(this.$labelSize);
        if (m2809getWidthimpl > 0.0f) {
            f8 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
            float mo453toPx0680j_4 = drawWithContent.mo453toPx0680j_4(f8);
            float mo453toPx0680j_42 = drawWithContent.mo453toPx0680j_4(this.$paddingValues.mo556calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - mo453toPx0680j_4;
            float f9 = 2;
            float f10 = m2809getWidthimpl + mo453toPx0680j_42 + (mo453toPx0680j_4 * f9);
            LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                c8 = Size.m2809getWidthimpl(drawWithContent.mo3419getSizeNHjbRc()) - f10;
            } else {
                c8 = m.c(mo453toPx0680j_42, 0.0f);
            }
            float f11 = c8;
            if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                f10 = Size.m2809getWidthimpl(drawWithContent.mo3419getSizeNHjbRc()) - m.c(mo453toPx0680j_42, 0.0f);
            }
            float f12 = f10;
            float m2806getHeightimpl = Size.m2806getHeightimpl(this.$labelSize);
            float f13 = (-m2806getHeightimpl) / f9;
            float f14 = m2806getHeightimpl / f9;
            int m2964getDifferencertfAjoo = ClipOp.Companion.m2964getDifferencertfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long mo3425getSizeNHjbRc = drawContext.mo3425getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3428clipRectN_I0leg(f11, f13, f12, f14, m2964getDifferencertfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo3426setSizeuvyYCjk(mo3425getSizeNHjbRc);
            return;
        }
        drawWithContent.drawContent();
    }
}
