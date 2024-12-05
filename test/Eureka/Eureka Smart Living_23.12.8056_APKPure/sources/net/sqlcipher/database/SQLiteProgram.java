package net.sqlcipher.database;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class SQLiteProgram extends a implements j0.c {

    /* renamed from: c, reason: collision with root package name */
    protected SQLiteDatabase f8080c;

    /* renamed from: d, reason: collision with root package name */
    final String f8081d;

    /* renamed from: e, reason: collision with root package name */
    protected long f8082e;

    /* renamed from: f, reason: collision with root package name */
    private SQLiteCompiledSql f8083f;

    /* renamed from: g, reason: collision with root package name */
    protected long f8084g;

    /* renamed from: h, reason: collision with root package name */
    boolean f8085h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb;
        String str2;
        long j6;
        this.f8082e = 0L;
        this.f8084g = 0L;
        this.f8080c = sQLiteDatabase;
        String trim = str.trim();
        this.f8081d = trim;
        sQLiteDatabase.g();
        sQLiteDatabase.J(this);
        this.f8082e = sQLiteDatabase.f8047j;
        trim = trim.length() >= 6 ? trim.substring(0, 6) : trim;
        if (trim.equalsIgnoreCase("INSERT") || trim.equalsIgnoreCase("UPDATE") || trim.equalsIgnoreCase("REPLAC") || trim.equalsIgnoreCase("DELETE") || trim.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql V = sQLiteDatabase.V(str);
            this.f8083f = V;
            if (V == null) {
                SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.f8083f = sQLiteCompiledSql;
                sQLiteCompiledSql.a();
                sQLiteDatabase.K(str, this.f8083f);
                if (SQLiteDebug.f8076d) {
                    sb = new StringBuilder();
                    sb.append("Created DbObj (id#");
                    sb.append(this.f8083f.f8037c);
                    str2 = ") for sql: ";
                    sb.append(str2);
                    sb.append(str);
                    Log.v("SQLiteProgram", sb.toString());
                }
                j6 = this.f8083f.f8037c;
            } else {
                if (!V.a()) {
                    long j7 = this.f8083f.f8037c;
                    this.f8083f = new SQLiteCompiledSql(sQLiteDatabase, str);
                    if (SQLiteDebug.f8076d) {
                        sb = new StringBuilder();
                        sb.append("** possible bug ** Created NEW DbObj (id#");
                        sb.append(this.f8083f.f8037c);
                        sb.append(") because the previously created DbObj (id#");
                        sb.append(j7);
                        str2 = ") was not released for sql:";
                        sb.append(str2);
                        sb.append(str);
                        Log.v("SQLiteProgram", sb.toString());
                    }
                }
                j6 = this.f8083f.f8037c;
            }
        } else {
            SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
            this.f8083f = sQLiteCompiledSql2;
            j6 = sQLiteCompiledSql2.f8037c;
        }
        this.f8084g = j6;
    }

    private void H() {
        if (this.f8083f == null) {
            return;
        }
        synchronized (this.f8080c.f8053p) {
            if (this.f8080c.f8053p.containsValue(this.f8083f)) {
                this.f8083f.c();
            } else {
                this.f8083f.d();
                this.f8083f = null;
                this.f8084g = 0L;
            }
        }
    }

    @Override // net.sqlcipher.database.a
    protected void D() {
        H();
        this.f8080c.G();
    }

    @Override // j0.c
    public void a(int i6, long j6) {
        if (this.f8085h) {
            throw new IllegalStateException("program already closed");
        }
        if (this.f8080c.k()) {
            g();
            try {
                native_bind_long(i6, j6);
                return;
            } finally {
                G();
            }
        }
        throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
    }

    @Override // j0.c
    public void b(int i6) {
        if (this.f8085h) {
            throw new IllegalStateException("program already closed");
        }
        if (this.f8080c.k()) {
            g();
            try {
                native_bind_null(i6);
                return;
            } finally {
                G();
            }
        }
        throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
    }

    @Override // j0.c
    public void c(int i6, double d6) {
        if (this.f8085h) {
            throw new IllegalStateException("program already closed");
        }
        if (this.f8080c.k()) {
            g();
            try {
                native_bind_double(i6, d6);
                return;
            } finally {
                G();
            }
        }
        throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f8085h && this.f8080c.k()) {
            this.f8080c.c0();
            try {
                G();
                this.f8080c.t0();
                this.f8085h = true;
            } catch (Throwable th) {
                this.f8080c.t0();
                throw th;
            }
        }
    }

    protected final native void native_bind_blob(int i6, byte[] bArr);

    protected final native void native_bind_double(int i6, double d6);

    protected final native void native_bind_long(int i6, long j6);

    protected final native void native_bind_null(int i6);

    protected final native void native_bind_string(int i6, String str);

    @Override // j0.c
    public void p(int i6, String str) {
        if (str == null) {
            throw new IllegalArgumentException("the bind value at index " + i6 + " is null");
        }
        if (this.f8085h) {
            throw new IllegalStateException("program already closed");
        }
        if (this.f8080c.k()) {
            g();
            try {
                native_bind_string(i6, str);
                return;
            } finally {
                G();
            }
        }
        throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
    }

    @Override // net.sqlcipher.database.a
    protected void w() {
        H();
        this.f8080c.G();
        this.f8080c.s0(this);
    }

    @Override // j0.c
    public void x(int i6, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("the bind value at index " + i6 + " is null");
        }
        if (this.f8085h) {
            throw new IllegalStateException("program already closed");
        }
        if (this.f8080c.k()) {
            g();
            try {
                native_bind_blob(i6, bArr);
                return;
            } finally {
                G();
            }
        }
        throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
    }
}
