package androidx.room;

import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 extends AbstractC3160z implements Function1 {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Pair<String, String>> invoke(SupportSQLiteDatabase obj) {
        AbstractC3159y.i(obj, "obj");
        return obj.getAttachedDbs();
    }
}
