package androidx.collection;

import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ Function1 $create;
    final /* synthetic */ InterfaceC1670p $onEntryRemoved;
    final /* synthetic */ InterfaceC1668n $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i8, InterfaceC1668n interfaceC1668n, Function1 function1, InterfaceC1670p interfaceC1670p) {
        super(i8);
        this.$sizeOf = interfaceC1668n;
        this.$create = function1;
        this.$onEntryRemoved = interfaceC1670p;
    }

    @Override // androidx.collection.LruCache
    protected V create(K key) {
        AbstractC3255y.i(key, "key");
        return (V) this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z8, K key, V oldValue, V v8) {
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z8), key, oldValue, v8);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(K key, V value) {
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(value, "value");
        return ((Number) this.$sizeOf.invoke(key, value)).intValue();
    }
}
