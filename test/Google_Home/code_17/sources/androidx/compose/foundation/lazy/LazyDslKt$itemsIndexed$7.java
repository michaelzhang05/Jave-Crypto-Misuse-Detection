package androidx.compose.foundation.lazy;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$7 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC1668n $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$7(InterfaceC1668n interfaceC1668n, T[] tArr) {
        super(1);
        this.$contentType = interfaceC1668n;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$contentType.invoke(Integer.valueOf(i8), this.$items[i8]);
    }
}
