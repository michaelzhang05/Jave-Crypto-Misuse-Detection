package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import i.AbstractC2970a;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
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
        return AbstractC3001j.w(AbstractC3001j.B(AbstractC3001j.i(new LoremIpsum$generateLoremIpsum$1(q8, list.size())), i8), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC2970a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public InterfaceC2998g getValues() {
        return AbstractC3001j.k(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
