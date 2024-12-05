package androidx.compose.material.pullrefresh;

import L5.I;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 extends AbstractC3160z implements Function1 {
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 INSTANCE = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1();

    PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(ContentDrawScope drawWithContent) {
        AbstractC3159y.i(drawWithContent, "$this$drawWithContent");
        int m2960getIntersectrtfAjoo = ClipOp.Companion.m2960getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3423clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m2960getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }
}
