package androidx.compose.foundation.lazy.grid;

import L5.r;
import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyGridState$prefetchInfoRetriever$2 extends AbstractC3160z implements Function1 {
    public static final LazyGridState$prefetchInfoRetriever$2 INSTANCE = new LazyGridState$prefetchInfoRetriever$2();

    LazyGridState$prefetchInfoRetriever$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final List<r> invoke(int i8) {
        return AbstractC1246t.m();
    }
}
