package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyGridState$Companion$Saver$2 extends AbstractC3256z implements Function1 {
    public static final LazyGridState$Companion$Saver$2 INSTANCE = new LazyGridState$Companion$Saver$2();

    LazyGridState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LazyGridState invoke(List<Integer> it) {
        AbstractC3255y.i(it, "it");
        return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
    }
}
