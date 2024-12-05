package net.sqlcipher.database;

import android.util.Log;

/* loaded from: classes.dex */
class SQLiteCompiledSql {

    /* renamed from: a, reason: collision with root package name */
    SQLiteDatabase f8035a;

    /* renamed from: b, reason: collision with root package name */
    long f8036b;

    /* renamed from: d, reason: collision with root package name */
    private String f8038d;

    /* renamed from: c, reason: collision with root package name */
    long f8037c = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8039e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        this.f8036b = 0L;
        this.f8038d = null;
        if (sQLiteDatabase.k()) {
            this.f8035a = sQLiteDatabase;
            this.f8038d = str;
            this.f8036b = sQLiteDatabase.f8047j;
            b(str, true);
            return;
        }
        throw new IllegalStateException("database " + sQLiteDatabase.W() + " already closed");
    }

    private void b(String str, boolean z5) {
        if (!this.f8035a.k()) {
            throw new IllegalStateException("database " + this.f8035a.W() + " already closed");
        }
        if (z5) {
            this.f8035a.c0();
            try {
                native_compile(str);
            } finally {
                this.f8035a.t0();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a() {
        if (this.f8039e) {
            return false;
        }
        this.f8039e = true;
        if (SQLiteDebug.f8076d) {
            Log.v("SQLiteCompiledSql", "Acquired DbObj (id#" + this.f8037c + ") from DB cache");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c() {
        if (SQLiteDebug.f8076d) {
            Log.v("SQLiteCompiledSql", "Released DbObj (id#" + this.f8037c + ") back to DB cache");
        }
        this.f8039e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.f8037c != 0) {
            if (SQLiteDebug.f8076d) {
                Log.v("SQLiteCompiledSql", "closed and deallocated DbObj (id#" + this.f8037c + ")");
            }
            native_finalize();
            this.f8037c = 0L;
        }
    }

    protected void finalize() {
        try {
            if (this.f8037c == 0) {
                return;
            }
            if (SQLiteDebug.f8076d) {
                Log.v("SQLiteCompiledSql", "** warning ** Finalized DbObj (id#" + this.f8037c + ")");
            }
            d();
        } finally {
            super.finalize();
        }
    }
}
