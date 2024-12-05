package androidx.compose.foundation.lazy;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyListState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final LazyListState$Companion$Saver$1 INSTANCE = new LazyListState$Companion$Saver$1();

    LazyListState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final List<Integer> invoke(SaverScope listSaver, LazyListState it) {
        AbstractC3159y.i(listSaver, "$this$listSaver");
        AbstractC3159y.i(it, "it");
        return AbstractC1246t.p(Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset()));
    }
}
