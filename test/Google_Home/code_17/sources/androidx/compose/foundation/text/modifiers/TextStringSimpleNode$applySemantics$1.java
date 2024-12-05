package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextStringSimpleNode$applySemantics$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ TextStringSimpleNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$1(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.this$0 = textStringSimpleNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<TextLayoutResult> textLayoutResult) {
        ParagraphLayoutCache layoutCache;
        AbstractC3255y.i(textLayoutResult, "textLayoutResult");
        layoutCache = this.this$0.getLayoutCache();
        TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull();
        if (slowCreateTextLayoutResultOrNull != null) {
            textLayoutResult.add(slowCreateTextLayoutResultOrNull);
        }
        return Boolean.FALSE;
    }
}
