package androidx.collection;

import b6.InterfaceC1988d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, InterfaceC1988d.a {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i8) {
        AbstractC3255y.i(keys, "keys");
        AbstractC3255y.i(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i8;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v8) {
        Object[] objArr = this.values;
        int i8 = this.index;
        V v9 = (V) objArr[i8];
        objArr[i8] = v8;
        return v9;
    }
}
