package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldValue$Companion$Saver$2 extends AbstractC3256z implements Function1 {
    public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();

    TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextFieldValue invoke(Object obj) {
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        AnnotatedString restore = (AbstractC3255y.d(obj2, bool) || obj2 == null) ? null : annotatedStringSaver.restore(obj2);
        AbstractC3255y.f(restore);
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if (!AbstractC3255y.d(obj3, bool) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        AbstractC3255y.f(textRange);
        return new TextFieldValue(restore, textRange.m4701unboximpl(), (TextRange) null, 4, (AbstractC3247p) null);
    }
}
