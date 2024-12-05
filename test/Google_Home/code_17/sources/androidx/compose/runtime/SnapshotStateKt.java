package androidx.compose.runtime;

import O5.r;
import a6.InterfaceC1668n;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC3706f interfaceC3706f, R r8, S5.g gVar, Composer composer, int i8, int i9) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC3706f, r8, gVar, composer, i8, i9);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0 function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, function0);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, h6.i iVar) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, iVar);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t8, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t8, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i8, Object obj2) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, snapshotMutationPolicy, i8, obj2);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0 function0) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, function0);
    }

    @Composable
    public static final <T> State<T> produceState(T t8, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, interfaceC1668n, composer, i8);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t8, Composer composer, int i8) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t8, composer, i8);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, h6.i iVar, T t8) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, iVar, t8);
    }

    public static final <T> InterfaceC3706f snapshotFlow(Function0 function0) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends r> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    public static final <T> State<T> collectAsState(InterfaceC3698L interfaceC3698L, S5.g gVar, Composer composer, int i8, int i9) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC3698L, gVar, composer, i8, i9);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(Function0 function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(r... rVarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(rVarArr);
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, interfaceC1668n, composer, i8);
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, Object obj2, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, obj2, interfaceC1668n, composer, i8);
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object obj, Object obj2, Object obj3, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, obj2, obj3, interfaceC1668n, composer, i8);
    }

    @Composable
    public static final <T> State<T> produceState(T t8, Object[] objArr, InterfaceC1668n interfaceC1668n, Composer composer, int i8) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t8, objArr, interfaceC1668n, composer, i8);
    }
}
