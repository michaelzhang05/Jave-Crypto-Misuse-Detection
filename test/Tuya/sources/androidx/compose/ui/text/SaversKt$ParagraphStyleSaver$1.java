package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$ParagraphStyleSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1();

    SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return AbstractC1246t.g(SaversKt.save(TextAlign.m5075boximpl(paragraphStyle.m4607getTextAligne0LSkKk())), SaversKt.save(TextDirection.m5089boximpl(paragraphStyle.m4609getTextDirections_7Xco())), SaversKt.save(TextUnit.m5355boximpl(paragraphStyle.m4605getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope));
    }
}
