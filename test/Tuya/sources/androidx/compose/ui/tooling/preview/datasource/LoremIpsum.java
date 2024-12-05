package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import f6.AbstractC2683j;
import f6.InterfaceC2680g;
import i.AbstractC2765a;
import java.util.List;
import kotlin.jvm.internal.Q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i8) {
        this.words = i8;
    }

    private final String generateLoremIpsum(int i8) {
        List list;
        Q q8 = new Q();
        list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
        return AbstractC2683j.w(AbstractC2683j.B(AbstractC2683j.i(new LoremIpsum$generateLoremIpsum$1(q8, list.size())), i8), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC2765a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public InterfaceC2680g getValues() {
        return AbstractC2683j.k(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
