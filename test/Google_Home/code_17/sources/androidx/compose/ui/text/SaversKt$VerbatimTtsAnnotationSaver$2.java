package androidx.compose.ui.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$VerbatimTtsAnnotationSaver$2 extends AbstractC3256z implements Function1 {
    public static final SaversKt$VerbatimTtsAnnotationSaver$2 INSTANCE = new SaversKt$VerbatimTtsAnnotationSaver$2();

    SaversKt$VerbatimTtsAnnotationSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VerbatimTtsAnnotation invoke(Object obj) {
        String str = obj != null ? (String) obj : null;
        AbstractC3255y.f(str);
        return new VerbatimTtsAnnotation(str);
    }
}
