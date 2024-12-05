package androidx.core.util;

import X5.n;
import X5.p;
import android.util.LruCache;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, n nVar, Function1 function1, p pVar) {
        return new LruCacheKt$lruCache$4(i8, nVar, function1, pVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, n nVar, Function1 function1, p pVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            nVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i9 & 8) != 0) {
            pVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        return new LruCacheKt$lruCache$4(i8, nVar, function1, pVar);
    }
}
