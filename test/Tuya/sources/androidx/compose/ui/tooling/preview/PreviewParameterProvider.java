package androidx.compose.ui.tooling.preview;

import f6.InterfaceC2680g;
import i.AbstractC2765a;

/* loaded from: classes.dex */
public interface PreviewParameterProvider<T> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            int a8;
            a8 = AbstractC2765a.a(previewParameterProvider);
            return a8;
        }
    }

    int getCount();

    InterfaceC2680g getValues();
}
