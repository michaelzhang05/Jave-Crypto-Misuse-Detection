package androidx.compose.ui.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$TextIndentSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();

    SaversKt$TextIndentSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
        TextUnit m5360boximpl = TextUnit.m5360boximpl(textIndent.m5111getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return AbstractC1378t.g(SaversKt.save(m5360boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m5360boximpl(textIndent.m5112getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
    }
}
