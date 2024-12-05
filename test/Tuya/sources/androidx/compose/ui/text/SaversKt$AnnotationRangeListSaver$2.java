package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeListSaver$2 extends AbstractC3160z implements Function1 {
    public static final SaversKt$AnnotationRangeListSaver$2 INSTANCE = new SaversKt$AnnotationRangeListSaver$2();

    SaversKt$AnnotationRangeListSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AnnotatedString.Range<? extends Object>> invoke(Object obj) {
        Saver saver;
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj2 = list.get(i8);
            saver = SaversKt.AnnotationRangeSaver;
            AnnotatedString.Range range = null;
            if (!AbstractC3159y.d(obj2, Boolean.FALSE) && obj2 != null) {
                range = (AnnotatedString.Range) saver.restore(obj2);
            }
            AbstractC3159y.f(range);
            arrayList.add(range);
        }
        return arrayList;
    }
}
