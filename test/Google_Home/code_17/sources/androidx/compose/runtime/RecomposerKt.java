package androidx.compose.runtime;

import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l6.N;

/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k8, V v8) {
        List<V> list = map.get(k8);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k8, list);
        }
        return list.add(v8);
    }

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k8) {
        List<V> list = map.get(k8);
        if (list != null) {
            V v8 = (V) AbstractC1378t.N(list);
            if (list.isEmpty()) {
                map.remove(k8);
                return v8;
            }
            return v8;
        }
        return null;
    }

    public static final <R> Object withRunningRecomposer(InterfaceC1669o interfaceC1669o, S5.d dVar) {
        return N.e(new RecomposerKt$withRunningRecomposer$2(interfaceC1669o, null), dVar);
    }
}
