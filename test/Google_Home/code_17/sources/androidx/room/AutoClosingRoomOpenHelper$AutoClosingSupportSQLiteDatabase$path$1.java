package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 extends AbstractC3256z implements Function1 {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(SupportSQLiteDatabase obj) {
        AbstractC3255y.i(obj, "obj");
        return obj.getPath();
    }
}
