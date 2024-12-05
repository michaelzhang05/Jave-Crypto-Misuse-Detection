package androidx.compose.foundation.lazy;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyListState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final LazyListState$Companion$Saver$1 INSTANCE = new LazyListState$Companion$Saver$1();

    LazyListState$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<Integer> invoke(SaverScope listSaver, LazyListState it) {
        AbstractC3255y.i(listSaver, "$this$listSaver");
        AbstractC3255y.i(it, "it");
        return AbstractC1378t.p(Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset()));
    }
}
