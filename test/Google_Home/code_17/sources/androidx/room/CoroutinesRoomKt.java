package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3375p0;
import l6.I;

/* loaded from: classes3.dex */
public final class CoroutinesRoomKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final I getQueryDispatcher(RoomDatabase roomDatabase) {
        AbstractC3255y.i(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = AbstractC3375p0.a(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (I) obj;
    }

    public static final I getTransactionDispatcher(RoomDatabase roomDatabase) {
        AbstractC3255y.i(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = AbstractC3375p0.a(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (I) obj;
    }
}
