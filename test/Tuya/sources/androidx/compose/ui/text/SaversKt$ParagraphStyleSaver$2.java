package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$ParagraphStyleSaver$2 extends AbstractC3160z implements Function1 {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ParagraphStyle invoke(Object obj) {
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
        AbstractC3159y.f(textAlign);
        int m5081unboximpl = textAlign.m5081unboximpl();
        Object obj3 = list.get(1);
        TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
        AbstractC3159y.f(textDirection);
        int m5095unboximpl = textDirection.m5095unboximpl();
        Object obj4 = list.get(2);
        Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
        Boolean bool = Boolean.FALSE;
        TextUnit restore = (AbstractC3159y.d(obj4, bool) || obj4 == null) ? null : saver.restore(obj4);
        AbstractC3159y.f(restore);
        long m5374unboximpl = restore.m5374unboximpl();
        Object obj5 = list.get(3);
        return new ParagraphStyle(m5081unboximpl, m5095unboximpl, m5374unboximpl, (AbstractC3159y.d(obj5, bool) || obj5 == null) ? null : SaversKt.getSaver(TextIndent.Companion).restore(obj5), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 496, (AbstractC3151p) null);
    }
}
