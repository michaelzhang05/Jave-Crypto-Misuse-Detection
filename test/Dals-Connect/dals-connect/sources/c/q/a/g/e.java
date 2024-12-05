package c.q.a.g;

import android.database.sqlite.SQLiteStatement;
import c.q.a.f;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteStatement f2915g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2915g = sQLiteStatement;
    }

    @Override // c.q.a.f
    public long n0() {
        return this.f2915g.executeInsert();
    }

    @Override // c.q.a.f
    public int p() {
        return this.f2915g.executeUpdateDelete();
    }
}
