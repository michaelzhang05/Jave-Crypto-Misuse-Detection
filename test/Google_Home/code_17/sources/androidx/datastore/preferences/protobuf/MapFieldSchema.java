package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes3.dex */
interface MapFieldSchema {
    Map<?, ?> forMapData(Object obj);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i8, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    @CanIgnoreReturnValue
    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}