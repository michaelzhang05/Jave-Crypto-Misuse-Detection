package net.sqlcipher.database;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class SQLiteStatement extends SQLiteProgram implements j0.d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str);
    }

    private final native long native_1x1_long();

    private final native void native_execute();

    @Override // j0.d
    public long A() {
        if (!this.f8080c.k()) {
            throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
        }
        SystemClock.uptimeMillis();
        this.f8080c.c0();
        g();
        try {
            native_execute();
            return this.f8080c.lastChangeCount() > 0 ? this.f8080c.lastInsertRow() : -1L;
        } finally {
            G();
            this.f8080c.t0();
        }
    }

    public void I() {
        if (!this.f8080c.k()) {
            throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
        }
        SystemClock.uptimeMillis();
        this.f8080c.c0();
        g();
        try {
            native_execute();
        } finally {
            G();
            this.f8080c.t0();
        }
    }

    public long J() {
        if (!this.f8080c.k()) {
            throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
        }
        SystemClock.uptimeMillis();
        this.f8080c.c0();
        g();
        try {
            return native_1x1_long();
        } finally {
            G();
            this.f8080c.t0();
        }
    }

    @Override // j0.d
    public int t() {
        if (!this.f8080c.k()) {
            throw new IllegalStateException("database " + this.f8080c.W() + " already closed");
        }
        SystemClock.uptimeMillis();
        this.f8080c.c0();
        g();
        try {
            native_execute();
            return this.f8080c.lastChangeCount();
        } finally {
            G();
            this.f8080c.t0();
        }
    }
}
