package androidx.compose.ui.tooling.preview;

import i.AbstractC2970a;
import i6.InterfaceC2998g;

/* loaded from: classes.dex */
public interface PreviewParameterProvider<T> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            int a8;
            a8 = AbstractC2970a.a(previewParameterProvider);
            return a8;
        }
    }

    int getCount();

    InterfaceC2998g getValues();
}
