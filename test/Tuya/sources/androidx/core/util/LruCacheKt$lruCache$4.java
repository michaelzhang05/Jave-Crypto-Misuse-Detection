package androidx.core.util;

import X5.n;
import X5.p;
import android.util.LruCache;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes3.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ Function1 $create;
    final /* synthetic */ p $onEntryRemoved;
    final /* synthetic */ n $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i8, n nVar, Function1 function1, p pVar) {
        super(i8);
        this.$sizeOf = nVar;
        this.$create = function1;
        this.$onEntryRemoved = pVar;
    }

    @Override // android.util.LruCache
    protected V create(K k8) {
        return (V) this.$create.invoke(k8);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z8, K k8, V v8, V v9) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(z8), k8, v8, v9);
    }

    @Override // android.util.LruCache
    protected int sizeOf(K k8, V v8) {
        return ((Number) this.$sizeOf.invoke(k8, v8)).intValue();
    }
}
