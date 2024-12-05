package androidx.compose.ui.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$ParagraphStyleSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1();

    SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return AbstractC1378t.g(SaversKt.save(TextAlign.m5080boximpl(paragraphStyle.m4612getTextAligne0LSkKk())), SaversKt.save(TextDirection.m5094boximpl(paragraphStyle.m4614getTextDirections_7Xco())), SaversKt.save(TextUnit.m5360boximpl(paragraphStyle.m4610getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope));
    }
}
