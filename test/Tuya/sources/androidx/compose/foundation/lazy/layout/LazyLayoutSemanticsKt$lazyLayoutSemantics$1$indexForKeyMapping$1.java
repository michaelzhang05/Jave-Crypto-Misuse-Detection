package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function0 $itemProviderLambda;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(Function0 function0) {
        super(1);
        this.$itemProviderLambda = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object needle) {
        AbstractC3159y.i(needle, "needle");
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.$itemProviderLambda.invoke();
        int itemCount = lazyLayoutItemProvider.getItemCount();
        int i8 = 0;
        while (true) {
            if (i8 >= itemCount) {
                i8 = -1;
                break;
            }
            if (AbstractC3159y.d(lazyLayoutItemProvider.getKey(i8), needle)) {
                break;
            }
            i8++;
        }
        return Integer.valueOf(i8);
    }
}
