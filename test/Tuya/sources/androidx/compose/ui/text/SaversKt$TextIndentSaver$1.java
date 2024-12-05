package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$TextIndentSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();

    SaversKt$TextIndentSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
        TextUnit m5355boximpl = TextUnit.m5355boximpl(textIndent.m5106getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return AbstractC1246t.g(SaversKt.save(m5355boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m5355boximpl(textIndent.m5107getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
    }
}
