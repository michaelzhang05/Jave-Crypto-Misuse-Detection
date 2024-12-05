package androidx.compose.ui.tooling.preview.datasource;

import M5.AbstractC1246t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import f6.InterfaceC2680g;
import i.AbstractC2765a;
import java.util.Collection;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC2765a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public InterfaceC2680g getValues() {
        return AbstractC1246t.c0(this.collection);
    }
}
