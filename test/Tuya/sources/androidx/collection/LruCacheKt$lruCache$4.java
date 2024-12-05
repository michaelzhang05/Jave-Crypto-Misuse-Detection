package androidx.collection;

import X5.n;
import X5.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
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

    @Override // androidx.collection.LruCache
    protected V create(K key) {
        AbstractC3159y.i(key, "key");
        return (V) this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z8, K key, V oldValue, V v8) {
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z8), key, oldValue, v8);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(K key, V value) {
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(value, "value");
        return ((Number) this.$sizeOf.invoke(key, value)).intValue();
    }
}
