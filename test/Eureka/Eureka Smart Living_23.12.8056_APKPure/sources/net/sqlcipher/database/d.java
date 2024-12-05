package net.sqlcipher.database;

import android.database.Cursor;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private String f8106a;

    /* renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f8107b;

    /* renamed from: c, reason: collision with root package name */
    private k5.d f8108c;

    /* renamed from: d, reason: collision with root package name */
    private String f8109d;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteQuery f8110e;

    public d(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        this.f8107b = sQLiteDatabase;
        this.f8106a = str2;
        this.f8109d = str;
    }

    @Override // net.sqlcipher.database.c
    public void a(Cursor cursor) {
    }

    @Override // net.sqlcipher.database.c
    public void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // net.sqlcipher.database.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k5.d c(net.sqlcipher.database.SQLiteDatabase.d r5, java.lang.String[] r6) {
        /*
            r4 = this;
            net.sqlcipher.database.SQLiteQuery r0 = new net.sqlcipher.database.SQLiteQuery
            net.sqlcipher.database.SQLiteDatabase r1 = r4.f8107b
            java.lang.String r2 = r4.f8109d
            r3 = 0
            r0.<init>(r1, r2, r3, r6)
            if (r6 != 0) goto Le
            r1 = 0
            goto Lf
        Le:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L39
        Lf:
            if (r3 >= r1) goto L1a
            int r2 = r3 + 1
            r3 = r6[r3]     // Catch: java.lang.Throwable -> L39
            r0.p(r2, r3)     // Catch: java.lang.Throwable -> L39
            r3 = r2
            goto Lf
        L1a:
            if (r5 != 0) goto L28
            net.sqlcipher.database.b r5 = new net.sqlcipher.database.b     // Catch: java.lang.Throwable -> L39
            net.sqlcipher.database.SQLiteDatabase r6 = r4.f8107b     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r4.f8106a     // Catch: java.lang.Throwable -> L39
            r5.<init>(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L39
        L25:
            r4.f8108c = r5     // Catch: java.lang.Throwable -> L39
            goto L31
        L28:
            net.sqlcipher.database.SQLiteDatabase r6 = r4.f8107b     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r4.f8106a     // Catch: java.lang.Throwable -> L39
            k5.d r5 = r5.a(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L39
            goto L25
        L31:
            r4.f8110e = r0     // Catch: java.lang.Throwable -> L39
            k5.d r5 = r4.f8108c     // Catch: java.lang.Throwable -> L36
            return r5
        L36:
            r5 = move-exception
            r0 = 0
            goto L3a
        L39:
            r5 = move-exception
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.d.c(net.sqlcipher.database.SQLiteDatabase$d, java.lang.String[]):k5.d");
    }

    @Override // net.sqlcipher.database.c
    public void d() {
        this.f8108c = null;
    }

    public k5.d e(SQLiteDatabase.d dVar, Object[] objArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f8107b, this.f8109d, 0, objArr);
        try {
            sQLiteQuery.I(objArr);
            this.f8108c = dVar == null ? new b(this.f8107b, this, this.f8106a, sQLiteQuery) : dVar.a(this.f8107b, this, this.f8106a, sQLiteQuery);
            this.f8110e = sQLiteQuery;
            try {
                return this.f8108c;
            } catch (Throwable th) {
                th = th;
                sQLiteQuery = null;
                if (sQLiteQuery != null) {
                    sQLiteQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.f8109d;
    }
}
