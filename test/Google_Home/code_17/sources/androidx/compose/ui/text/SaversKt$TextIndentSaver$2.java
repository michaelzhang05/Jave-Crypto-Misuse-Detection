package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$TextIndentSaver$2 extends AbstractC3256z implements Function1 {
    public static final SaversKt$TextIndentSaver$2 INSTANCE = new SaversKt$TextIndentSaver$2();

    SaversKt$TextIndentSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextIndent invoke(Object obj) {
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnit.Companion companion = TextUnit.Companion;
        Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit restore = (AbstractC3255y.d(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
        AbstractC3255y.f(restore);
        long m5379unboximpl = restore.m5379unboximpl();
        Object obj3 = list.get(1);
        Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
        if (!AbstractC3255y.d(obj3, bool) && obj3 != null) {
            textUnit = saver2.restore(obj3);
        }
        AbstractC3255y.f(textUnit);
        return new TextIndent(m5379unboximpl, textUnit.m5379unboximpl(), null);
    }
}
