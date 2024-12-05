package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $conflictAlgorithm;
    final /* synthetic */ String $table;
    final /* synthetic */ ContentValues $values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1(String str, int i8, ContentValues contentValues) {
        super(1);
        this.$table = str;
        this.$conflictAlgorithm = i8;
        this.$values = contentValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(SupportSQLiteDatabase db) {
        AbstractC3159y.i(db, "db");
        return Long.valueOf(db.insert(this.$table, this.$conflictAlgorithm, this.$values));
    }
}
