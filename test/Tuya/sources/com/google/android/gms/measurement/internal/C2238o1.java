package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238o1 extends A1 {

    /* renamed from: c, reason: collision with root package name */
    private final C2233n1 f16714c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16715d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2238o1(Y1 y12) {
        super(y12);
        Context c8 = this.f16777a.c();
        this.f16777a.z();
        this.f16714c = new C2233n1(this, c8, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2238o1.x(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.A1
    protected final boolean n() {
        return false;
    }

    final SQLiteDatabase o() {
        if (this.f16715d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16714c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f16715d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(int r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2238o1.p(int):java.util.List");
    }

    public final void q() {
        int delete;
        h();
        try {
            SQLiteDatabase o8 = o();
            if (o8 != null && (delete = o8.delete("messages", null, null)) > 0) {
                this.f16777a.d().v().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e8) {
            this.f16777a.d().r().b("Error resetting local analytics data. error", e8);
        }
    }

    public final boolean r() {
        return x(3, new byte[0]);
    }

    final boolean s() {
        Context c8 = this.f16777a.c();
        this.f16777a.z();
        return c8.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean t() {
        h();
        if (!this.f16715d && s()) {
            int i8 = 5;
            for (int i9 = 0; i9 < 5; i9++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase o8 = o();
                            if (o8 == null) {
                                this.f16715d = true;
                                return false;
                            }
                            o8.beginTransaction();
                            o8.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            o8.setTransactionSuccessful();
                            o8.endTransaction();
                            o8.close();
                            return true;
                        } catch (SQLiteException e8) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f16777a.d().r().b("Error deleting app launch break from local database", e8);
                            this.f16715d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i8);
                        i8 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e9) {
                    this.f16777a.d().r().b("Error deleting app launch break from local database", e9);
                    this.f16715d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            this.f16777a.d().w().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean u(C2173d c2173d) {
        byte[] e02 = this.f16777a.N().e0(c2173d);
        if (e02.length > 131072) {
            this.f16777a.d().t().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return x(2, e02);
    }

    public final boolean v(C2270v c2270v) {
        Parcel obtain = Parcel.obtain();
        C2275w.a(c2270v, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f16777a.d().t().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return x(0, marshall);
    }

    public final boolean w(u4 u4Var) {
        Parcel obtain = Parcel.obtain();
        v4.a(u4Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f16777a.d().t().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return x(1, marshall);
    }
}
