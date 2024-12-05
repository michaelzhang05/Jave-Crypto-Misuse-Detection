package androidx.compose.ui.text;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$UrlAnnotationSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$UrlAnnotationSaver$1 INSTANCE = new SaversKt$UrlAnnotationSaver$1();

    SaversKt$UrlAnnotationSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return SaversKt.save(urlAnnotation.getUrl());
    }
}
