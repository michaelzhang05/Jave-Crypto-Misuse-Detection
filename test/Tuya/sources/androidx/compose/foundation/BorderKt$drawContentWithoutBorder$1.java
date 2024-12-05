package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BorderKt$drawContentWithoutBorder$1 extends AbstractC3160z implements Function1 {
    public static final BorderKt$drawContentWithoutBorder$1 INSTANCE = new BorderKt$drawContentWithoutBorder$1();

    BorderKt$drawContentWithoutBorder$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        AbstractC3159y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
    }
}
