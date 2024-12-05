package androidx.compose.material.pullrefresh;

import O5.I;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 extends AbstractC3256z implements Function1 {
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 INSTANCE = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1();

    PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        AbstractC3255y.i(drawWithContent, "$this$drawWithContent");
        int m2965getIntersectrtfAjoo = ClipOp.Companion.m2965getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo3425getSizeNHjbRc = drawContext.mo3425getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3428clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m2965getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo3426setSizeuvyYCjk(mo3425getSizeNHjbRc);
    }
}
