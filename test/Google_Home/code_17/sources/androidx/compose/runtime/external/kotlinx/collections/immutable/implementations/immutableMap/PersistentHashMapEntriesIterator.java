package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;

@StabilityInferred(parameters = 4)
/* loaded from: classes.dex */
public final class PersistentHashMapEntriesIterator<K, V> extends PersistentHashMapBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PersistentHashMapEntriesIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> r5) {
        /*
            r4 = this;
            r0 = 8
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[] r1 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L11
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeEntriesIterator r3 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeEntriesIterator
            r3.<init>()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L11:
            r4.<init>(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapEntriesIterator.<init>(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode):void");
    }
}
