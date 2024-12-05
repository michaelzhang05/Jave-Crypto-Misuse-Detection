package androidx.compose.foundation.lazy.layout;

import M5.AbstractC1239l;
import M5.Q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import d6.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    private final Object[] keys;
    private final int keysStartIndex;
    private final Map<Object, Integer> map;

    public NearestRangeKeyIndexMap(i nearestRange, LazyLayoutIntervalContent<?> intervalContent) {
        AbstractC3159y.i(nearestRange, "nearestRange");
        AbstractC3159y.i(intervalContent, "intervalContent");
        IntervalList<?> intervals = intervalContent.getIntervals();
        int g8 = nearestRange.g();
        if (g8 >= 0) {
            int min = Math.min(nearestRange.h(), intervals.getSize() - 1);
            if (min < g8) {
                this.map = Q.h();
                this.keys = new Object[0];
                this.keysStartIndex = 0;
                return;
            } else {
                this.keys = new Object[(min - g8) + 1];
                this.keysStartIndex = g8;
                HashMap hashMap = new HashMap();
                intervals.forEach(g8, min, new NearestRangeKeyIndexMap$1$1(g8, min, hashMap, this));
                this.map = hashMap;
                return;
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object key) {
        AbstractC3159y.i(key, "key");
        Integer num = this.map.get(key);
        if (num == null) {
            num = -1;
        }
        return num.intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i8) {
        Object[] objArr = this.keys;
        int i9 = i8 - this.keysStartIndex;
        if (i9 >= 0 && i9 <= AbstractC1239l.i0(objArr)) {
            return objArr[i9];
        }
        return null;
    }
}
