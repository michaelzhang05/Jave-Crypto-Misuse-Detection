package androidx.compose.ui.text;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$UrlAnnotationSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$UrlAnnotationSaver$1 INSTANCE = new SaversKt$UrlAnnotationSaver$1();

    SaversKt$UrlAnnotationSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return SaversKt.save(urlAnnotation.getUrl());
    }
}
