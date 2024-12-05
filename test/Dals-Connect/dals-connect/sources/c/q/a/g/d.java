package c.q.a.g;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
class d implements c.q.a.d {

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteProgram f2914f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(SQLiteProgram sQLiteProgram) {
        this.f2914f = sQLiteProgram;
    }

    @Override // c.q.a.d
    public void F(int i2, long j2) {
        this.f2914f.bindLong(i2, j2);
    }

    @Override // c.q.a.d
    public void K(int i2, byte[] bArr) {
        this.f2914f.bindBlob(i2, bArr);
    }

    @Override // c.q.a.d
    public void a0(int i2) {
        this.f2914f.bindNull(i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2914f.close();
    }

    @Override // c.q.a.d
    public void m(int i2, String str) {
        this.f2914f.bindString(i2, str);
    }

    @Override // c.q.a.d
    public void r(int i2, double d2) {
        this.f2914f.bindDouble(i2, d2);
    }
}
