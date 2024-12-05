package c.q.a.g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import c.q.a.f;
import java.io.IOException;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
class a implements c.q.a.b {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f2899f = {HttpUrl.FRAGMENT_ENCODE_SET, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f2900g = new String[0];

    /* renamed from: h, reason: collision with root package name */
    private final SQLiteDatabase f2901h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: c.q.a.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0078a implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ c.q.a.e a;

        C0078a(c.q.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ c.q.a.e a;

        b(c.q.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SQLiteDatabase sQLiteDatabase) {
        this.f2901h = sQLiteDatabase;
    }

    @Override // c.q.a.b
    public void G() {
        this.f2901h.setTransactionSuccessful();
    }

    @Override // c.q.a.b
    public void I(String str, Object[] objArr) throws SQLException {
        this.f2901h.execSQL(str, objArr);
    }

    @Override // c.q.a.b
    public Cursor O(String str) {
        return Z(new c.q.a.a(str));
    }

    @Override // c.q.a.b
    public void S() {
        this.f2901h.endTransaction();
    }

    @Override // c.q.a.b
    public Cursor Z(c.q.a.e eVar) {
        return this.f2901h.rawQueryWithFactory(new C0078a(eVar), eVar.a(), f2900g, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f2901h == sQLiteDatabase;
    }

    @Override // c.q.a.b
    public String c() {
        return this.f2901h.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2901h.close();
    }

    @Override // c.q.a.b
    public boolean e0() {
        return this.f2901h.inTransaction();
    }

    @Override // c.q.a.b
    public void g() {
        this.f2901h.beginTransaction();
    }

    @Override // c.q.a.b
    public List<Pair<String, String>> i() {
        return this.f2901h.getAttachedDbs();
    }

    @Override // c.q.a.b
    public boolean isOpen() {
        return this.f2901h.isOpen();
    }

    @Override // c.q.a.b
    public void l(String str) throws SQLException {
        this.f2901h.execSQL(str);
    }

    @Override // c.q.a.b
    public f q(String str) {
        return new e(this.f2901h.compileStatement(str));
    }

    @Override // c.q.a.b
    public Cursor v(c.q.a.e eVar, CancellationSignal cancellationSignal) {
        return this.f2901h.rawQueryWithFactory(new b(eVar), eVar.a(), f2900g, null, cancellationSignal);
    }
}
