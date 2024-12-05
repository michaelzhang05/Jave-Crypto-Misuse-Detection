package androidx.compose.ui.text;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$VerbatimTtsAnnotationSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$VerbatimTtsAnnotationSaver$1 INSTANCE = new SaversKt$VerbatimTtsAnnotationSaver$1();

    SaversKt$VerbatimTtsAnnotationSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
    }
}
