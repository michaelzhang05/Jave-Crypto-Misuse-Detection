package androidx.collection;

import X5.n;
import X5.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, n sizeOf, Function1 create, p onEntryRemoved) {
        AbstractC3159y.i(sizeOf, "sizeOf");
        AbstractC3159y.i(create, "create");
        AbstractC3159y.i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, n sizeOf, Function1 create, p onEntryRemoved, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            sizeOf = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            create = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i9 & 8) != 0) {
            onEntryRemoved = LruCacheKt$lruCache$3.INSTANCE;
        }
        AbstractC3159y.i(sizeOf, "sizeOf");
        AbstractC3159y.i(create, "create");
        AbstractC3159y.i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }
}
