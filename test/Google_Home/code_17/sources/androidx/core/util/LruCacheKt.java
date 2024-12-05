package androidx.core.util;

import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import android.util.LruCache;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, InterfaceC1668n interfaceC1668n, Function1 function1, InterfaceC1670p interfaceC1670p) {
        return new LruCacheKt$lruCache$4(i8, interfaceC1668n, function1, interfaceC1670p);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, InterfaceC1668n interfaceC1668n, Function1 function1, InterfaceC1670p interfaceC1670p, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            interfaceC1668n = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i9 & 8) != 0) {
            interfaceC1670p = LruCacheKt$lruCache$3.INSTANCE;
        }
        return new LruCacheKt$lruCache$4(i8, interfaceC1668n, function1, interfaceC1670p);
    }
}
