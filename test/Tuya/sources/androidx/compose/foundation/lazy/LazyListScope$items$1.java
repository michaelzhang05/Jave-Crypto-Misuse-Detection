package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyListScope$items$1 extends AbstractC3160z implements Function1 {
    public static final LazyListScope$items$1 INSTANCE = new LazyListScope$items$1();

    LazyListScope$items$1() {
        super(1);
    }

    public final Void invoke(int i8) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
