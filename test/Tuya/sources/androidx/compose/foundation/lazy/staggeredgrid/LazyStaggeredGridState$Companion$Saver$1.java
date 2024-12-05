package androidx.compose.foundation.lazy.staggeredgrid;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyStaggeredGridState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final LazyStaggeredGridState$Companion$Saver$1 INSTANCE = new LazyStaggeredGridState$Companion$Saver$1();

    LazyStaggeredGridState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final List<int[]> invoke(SaverScope listSaver, LazyStaggeredGridState state) {
        AbstractC3159y.i(listSaver, "$this$listSaver");
        AbstractC3159y.i(state, "state");
        return AbstractC1246t.p(state.getScrollPosition$foundation_release().getIndices(), state.getScrollPosition$foundation_release().getOffsets());
    }
}
