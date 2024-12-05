package androidx.compose.foundation.lazy.staggeredgrid;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyStaggeredGridState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final LazyStaggeredGridState$Companion$Saver$1 INSTANCE = new LazyStaggeredGridState$Companion$Saver$1();

    LazyStaggeredGridState$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<int[]> invoke(SaverScope listSaver, LazyStaggeredGridState state) {
        AbstractC3255y.i(listSaver, "$this$listSaver");
        AbstractC3255y.i(state, "state");
        return AbstractC1378t.p(state.getScrollPosition$foundation_release().getIndices(), state.getScrollPosition$foundation_release().getOffsets());
    }
}
