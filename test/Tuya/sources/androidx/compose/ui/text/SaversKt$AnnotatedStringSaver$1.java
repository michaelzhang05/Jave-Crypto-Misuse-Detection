package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$AnnotatedStringSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1();

    SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
        Saver saver;
        Saver saver2;
        Saver saver3;
        Object save = SaversKt.save(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        saver = SaversKt.AnnotationRangeListSaver;
        Object save2 = SaversKt.save(spanStyles, saver, saverScope);
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        saver2 = SaversKt.AnnotationRangeListSaver;
        Object save3 = SaversKt.save(paragraphStyles, saver2, saverScope);
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        saver3 = SaversKt.AnnotationRangeListSaver;
        return AbstractC1246t.g(save, save2, save3, SaversKt.save(annotations$ui_text_release, saver3, saverScope));
    }
}
