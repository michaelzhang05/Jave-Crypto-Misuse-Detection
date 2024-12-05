package androidx.compose.runtime.external.kotlinx.collections.immutable;

import L5.r;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.Q;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import f6.InterfaceC2680g;
import g6.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(r... rVarArr) {
        return persistentHashMapOf((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
    }

    public static final <E> PersistentSet<E> immutableHashSetOf(E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> PersistentList<E> immutableListOf(E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <K, V> PersistentMap<K, V> immutableMapOf(r... rVarArr) {
        return persistentMapOf((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
    }

    public static final <E> PersistentSet<E> immutableSetOf(E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> PersistentSet<E> intersect(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.S(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E e8) {
        return persistentCollection.remove((PersistentCollection<? extends E>) e8);
    }

    public static final <T> PersistentSet<T> mutate(PersistentSet<? extends T> persistentSet, Function1 function1) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(r... rVarArr) {
        PersistentHashMap<K, V> emptyOf$runtime_release = PersistentHashMap.Companion.emptyOf$runtime_release();
        AbstractC3159y.g(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        Q.t(builder2, rVarArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf(E... eArr) {
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll((Collection) AbstractC1239l.c(eArr));
    }

    public static final <E> PersistentList<E> persistentListOf(E... eArr) {
        return UtilsKt.persistentVectorOf().addAll((Collection) AbstractC1239l.c(eArr));
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf(r... rVarArr) {
        PersistentOrderedMap<K, V> emptyOf$runtime_release = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        AbstractC3159y.g(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        Q.t(builder2, rVarArr);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> persistentSetOf(E... eArr) {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll((Collection) AbstractC1239l.c(eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E e8) {
        return persistentCollection.add((PersistentCollection<? extends E>) e8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap;
        PersistentMap.Builder builder;
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof ImmutableMap) {
            immutableMap = (ImmutableMap) map;
        } else {
            immutableMap = null;
        }
        if (immutableMap == null) {
            if (map instanceof PersistentMap.Builder) {
                builder = (PersistentMap.Builder) map;
            } else {
                builder = null;
            }
            if (builder != null) {
                persistentMap = builder.build2();
            }
            if (persistentMap != null) {
                return persistentMap;
            }
            return persistentMapOf().putAll((Map) map);
        }
        return immutableMap;
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        PersistentSet build = builder != null ? builder.build() : null;
        return build != null ? build : plus(persistentSetOf(), (Iterable) iterable);
    }

    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        PersistentHashMap<K, V> persistentHashMap2 = null;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap2 = persistentHashMapBuilder.build2();
            }
            if (persistentHashMap2 != null) {
                return persistentHashMap2;
            }
            return PersistentHashMap.Companion.emptyOf$runtime_release().putAll((Map) map);
        }
        return persistentHashMap;
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return build != null ? build : plus(PersistentHashSet.Companion.emptyOf$runtime_release(), (Iterable) iterable);
    }

    public static final <T> PersistentList<T> toPersistentList(Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> build = builder != null ? builder.build() : null;
        return build == null ? plus(persistentListOf(), (Iterable) iterable) : build;
    }

    public static final <K, V> PersistentMap<K, V> toPersistentMap(Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder;
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof PersistentOrderedMap) {
            persistentOrderedMap = (PersistentOrderedMap) map;
        } else {
            persistentOrderedMap = null;
        }
        if (persistentOrderedMap == null) {
            if (map instanceof PersistentOrderedMapBuilder) {
                persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) map;
            } else {
                persistentOrderedMapBuilder = null;
            }
            if (persistentOrderedMapBuilder != null) {
                persistentMap = persistentOrderedMapBuilder.build2();
            }
            if (persistentMap == null) {
                return PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll((Map) map);
            }
            return persistentMap;
        }
        return persistentOrderedMap;
    }

    public static final <T> PersistentSet<T> toPersistentSet(Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), (Iterable) iterable) : build;
    }

    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.K(builder, iterable);
        return builder.build();
    }

    public static final <T> PersistentList<T> mutate(PersistentList<? extends T> persistentList, Function1 function1) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.D(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends r> iterable) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        Q.s(builder2, iterable);
        return builder2.build2();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.L(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> mutate(PersistentMap<? extends K, ? extends V> persistentMap, Function1 function1) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        function1.invoke(builder2);
        return builder2.build2();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.E(builder, eArr);
        return builder.build();
    }

    public static final <T> ImmutableList<T> toImmutableList(InterfaceC2680g interfaceC2680g) {
        return toPersistentList(interfaceC2680g);
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, InterfaceC2680g interfaceC2680g) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.J(builder, interfaceC2680g);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, InterfaceC2680g interfaceC2680g) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC1246t.C(builder, interfaceC2680g);
        return builder.build();
    }

    public static final ImmutableList<Character> toImmutableList(CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(InterfaceC2680g interfaceC2680g) {
        return toPersistentSet(interfaceC2680g);
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(InterfaceC2680g interfaceC2680g) {
        return plus(persistentHashSetOf(), interfaceC2680g);
    }

    public static final <T> PersistentList<T> toPersistentList(InterfaceC2680g interfaceC2680g) {
        return plus(persistentListOf(), interfaceC2680g);
    }

    public static final <T> PersistentSet<T> toPersistentSet(InterfaceC2680g interfaceC2680g) {
        return plus(persistentSetOf(), interfaceC2680g);
    }

    public static final <E> PersistentSet<E> intersect(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E e8) {
        return persistentList.remove((PersistentList<? extends E>) e8);
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E e8) {
        return persistentList.add((PersistentList<? extends E>) e8);
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, r[] rVarArr) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        Q.t(builder2, rVarArr);
        return builder2.build2();
    }

    public static final PersistentSet<Character> toImmutableSet(CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    public static final PersistentSet<Character> toPersistentHashSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        n.W0(charSequence, builder);
        return builder.build();
    }

    public static final PersistentList<Character> toPersistentList(CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        n.W0(charSequence, builder);
        return builder.build();
    }

    public static final PersistentSet<Character> toPersistentSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        n.W0(charSequence, builder);
        return builder.build();
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.K(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.D(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        Q.r(builder2, interfaceC2680g);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E e8) {
        return persistentSet.remove((PersistentSet<? extends E>) e8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E e8) {
        return persistentSet.add((PersistentSet<? extends E>) e8);
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.K(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.D(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K k8) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((PersistentMap<? extends K, ? extends V>) k8);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, r rVar) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((PersistentMap<? extends K, ? extends V>) rVar.c(), rVar.d());
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.L(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends r> iterable) {
        return putAll(persistentMap, iterable);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, r[] rVarArr) {
        return putAll(persistentMap, rVarArr);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, InterfaceC2680g interfaceC2680g) {
        return putAll(persistentMap, interfaceC2680g);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, InterfaceC2680g interfaceC2680g) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.J(builder, interfaceC2680g);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.E(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.L(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, InterfaceC2680g interfaceC2680g) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC1246t.C(builder, interfaceC2680g);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, InterfaceC2680g interfaceC2680g) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.J(builder, interfaceC2680g);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.E(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends K> iterable) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        AbstractC1246t.K(builder2.keySet(), iterable);
        return builder2.build2();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, InterfaceC2680g interfaceC2680g) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC1246t.C(builder, interfaceC2680g);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K[] kArr) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        AbstractC1246t.L(builder2.keySet(), kArr);
        return builder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.g(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        AbstractC1246t.J(builder2.keySet(), interfaceC2680g);
        return builder2.build2();
    }
}
