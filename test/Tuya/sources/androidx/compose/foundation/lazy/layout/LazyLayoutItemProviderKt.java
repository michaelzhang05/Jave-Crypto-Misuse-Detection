package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i8) {
        AbstractC3159y.i(lazyLayoutItemProvider, "<this>");
        if (obj != null && lazyLayoutItemProvider.getItemCount() != 0) {
            if (i8 < lazyLayoutItemProvider.getItemCount() && AbstractC3159y.d(obj, lazyLayoutItemProvider.getKey(i8))) {
                return i8;
            }
            int index = lazyLayoutItemProvider.getIndex(obj);
            if (index != -1) {
                return index;
            }
        }
        return i8;
    }
}
