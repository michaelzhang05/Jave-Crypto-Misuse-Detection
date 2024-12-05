package io.rakam.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.database.room.RoomNotification;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHelper.java */
/* loaded from: classes2.dex */
public class b extends SQLiteOpenHelper {

    /* renamed from: f, reason: collision with root package name */
    static final Map<String, b> f18444f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final h f18445g = h.d();

    /* renamed from: h, reason: collision with root package name */
    File f18446h;

    /* renamed from: i, reason: collision with root package name */
    private String f18447i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18448j;

    /* renamed from: k, reason: collision with root package name */
    private c f18449k;

    protected b(Context context, String str) {
        super(context, L(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f18448j = true;
        this.f18446h = context.getDatabasePath(L(str));
        this.f18447i = j.e(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static b D(Context context) {
        return J(context, null);
    }

    private synchronized void F0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = " + j2, null);
                } catch (SQLiteException e2) {
                    f18445g.c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e2);
                    e.e().g(String.format("DB: Failed to removeEvent from table %s", str), e2);
                    w();
                }
            } catch (StackOverflowError e3) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e3);
                e.e().g(String.format("DB: Failed to removeEvent from table %s", str), e3);
                w();
            }
        } finally {
        }
    }

    private synchronized void H0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id <= " + j2, null);
                } catch (SQLiteException e2) {
                    f18445g.c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e2);
                    e.e().g(String.format("DB: Failed to removeEvents from table %s", str), e2);
                    w();
                }
            } catch (StackOverflowError e3) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e3);
                e.e().g(String.format("DB: Failed to removeEvents from table %s", str), e3);
                w();
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized b J(Context context, String str) {
        b bVar;
        synchronized (b.class) {
            String e2 = j.e(str);
            Map<String, b> map = f18444f;
            bVar = map.get(e2);
            if (bVar == null) {
                bVar = new b(context.getApplicationContext(), e2);
                map.put(e2, bVar);
            }
        }
        return bVar;
    }

    private void K0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    private static String L(String str) {
        if (j.d(str) || str.equals("$default_instance")) {
            return "io.rakam.api";
        }
        return "io.rakam.api_" + str;
    }

    private synchronized long T(String str) {
        long j2;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    sQLiteStatement = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM " + str);
                    j2 = sQLiteStatement.simpleQueryForLong();
                    sQLiteStatement.close();
                    close();
                } catch (SQLiteException e2) {
                    f18445g.c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e2);
                    e.e().g(String.format("DB: Failed to getNumberRows for table %s", str), e2);
                    w();
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    j2 = 0;
                    return j2;
                }
            } catch (StackOverflowError e3) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e3);
                e.e().g(String.format("DB: Failed to getNumberRows for table %s", str), e3);
                w();
                j2 = 0;
                return j2;
            }
        } finally {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
        }
        return j2;
    }

    private synchronized long b(String str, String str2) {
        StackOverflowError e2;
        long j2;
        SQLiteException e3;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event", str2);
                j2 = x0(writableDatabase, str, contentValues);
                if (j2 == -1) {
                    try {
                        f18445g.g("io.rakam.api.DatabaseHelper", String.format("Insert into %s failed", str));
                    } catch (SQLiteException e4) {
                        e3 = e4;
                        f18445g.c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e3);
                        e.e().g(String.format("DB: Failed to addEvent: %s", str2), e3);
                        w();
                        return j2;
                    } catch (StackOverflowError e5) {
                        e2 = e5;
                        f18445g.c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e2);
                        e.e().g(String.format("DB: Failed to addEvent: %s", str2), e2);
                        w();
                        return j2;
                    }
                }
            } catch (SQLiteException e6) {
                e3 = e6;
                j2 = -1;
            } catch (StackOverflowError e7) {
                e2 = e7;
                j2 = -1;
            }
        } finally {
            close();
        }
        return j2;
    }

    private static void o(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (j.d(message)) {
            throw runtimeException;
        }
        if (message.startsWith("Cursor window allocation of")) {
            throw new CursorWindowAllocationException(message);
        }
        throw runtimeException;
    }

    private synchronized long s0(String str, long j2) {
        long j3;
        j3 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    SQLiteStatement compileStatement = getReadableDatabase().compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j2 - 1));
                    try {
                        j3 = compileStatement.simpleQueryForLong();
                    } catch (SQLiteDoneException e2) {
                        f18445g.h("io.rakam.api.DatabaseHelper", e2);
                    }
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                } catch (StackOverflowError e3) {
                    f18445g.c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e3);
                    e.e().g(String.format("DB: Failed to getNthEventId from table %s", str), e3);
                    w();
                    if (0 != 0) {
                        sQLiteStatement.close();
                    }
                }
            } catch (SQLiteException e4) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e4);
                e.e().g(String.format("DB: Failed to getNthEventId from table %s", str), e4);
                w();
                if (0 != 0) {
                    sQLiteStatement.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
            throw th;
        }
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r3.isOpen() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r3.isOpen() != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.b.w():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long A0(String str, String str2) {
        long C0;
        if (str2 == null) {
            C0 = z(AccountAnalytics.STORE, str);
        } else {
            C0 = C0(AccountAnalytics.STORE, str, str2);
        }
        return C0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long B0(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long y0;
        ContentValues contentValues = new ContentValues();
        contentValues.put(RoomNotification.KEY, str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        y0 = y0(sQLiteDatabase, str, contentValues);
        if (y0 == -1) {
            f18445g.g("io.rakam.api.DatabaseHelper", "Insert failed");
        }
        return y0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r2.isOpen() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r2.isOpen() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized long C0(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            long r8 = r7.B0(r2, r8, r9, r10)     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            if (r2 == 0) goto L7d
            boolean r10 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L7d
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7d
        L18:
            r8 = move-exception
            goto L7f
        L1a:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.b.f18445g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.e.e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.w()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
        L48:
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7b
        L4c:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.b.f18445g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.e.e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.w()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
            goto L48
        L7b:
            r8 = -1
        L7d:
            monitor-exit(r7)
            return r8
        L7f:
            if (r2 == 0) goto L8a
            boolean r9 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L8a
            r7.close()     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            monitor-exit(r7)
            goto L8f
        L8e:
            throw r8
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.b.C0(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    Cursor D0(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void E0(long j2) {
        F0("events", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void G0(long j2) {
        H0("events", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void I0(long j2) {
        F0("identifys", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void J0(long j2) {
        H0("identifys", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0(c cVar) {
        this.f18449k = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long P() {
        return T("events");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<JSONObject> Y(long j2, long j3) throws JSONException {
        return c0("events", j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long a(String str) {
        return b("events", str);
    }

    protected synchronized List<JSONObject> c0(String str, long j2, long j3) throws JSONException {
        LinkedList linkedList;
        String str2;
        String str3;
        linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        String[] strArr = {DeepLinkIntentReceiver.DeepLinksKeys.ID, "event"};
                        if (j2 >= 0) {
                            str2 = "id <= " + j2;
                        } else {
                            str2 = null;
                        }
                        if (j3 >= 0) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET + j3;
                        } else {
                            str3 = null;
                        }
                        cursor = D0(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                        while (cursor.moveToNext()) {
                            long j4 = cursor.getLong(0);
                            String string = cursor.getString(1);
                            if (!j.d(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                jSONObject.put("event_id", j4);
                                linkedList.add(jSONObject);
                            }
                        }
                        cursor.close();
                    } catch (SQLiteException e2) {
                        f18445g.c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e2);
                        e.e().g(String.format("DB: Failed to getEventsFromTable %s", str), e2);
                        w();
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (RuntimeException e3) {
                    e.e().g(String.format("DB: Failed to getEventsFromTable %s", str), e3);
                    o(e3);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (StackOverflowError e4) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e4);
                e.e().g(String.format("DB: Failed to getEventsFromTable %s", str), e4);
                w();
                if (cursor != null) {
                    cursor.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            close();
            throw th;
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long f(String str) {
        return b("identifys", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long g0() {
        return T("identifys");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<JSONObject> i0(long j2, long j3) throws JSONException {
        return c0("identifys", j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Long k0(String str) {
        return (Long) w0("long_store", str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        c cVar = this.f18449k;
        if (cVar == null || !this.f18448j) {
            return;
        }
        try {
            try {
                this.f18448j = false;
                cVar.a(sQLiteDatabase);
            } catch (SQLiteException e2) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("databaseReset callback failed during onCreate", new Object[0]), e2);
                e.e().g(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e2);
            }
        } finally {
            this.f18448j = true;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 > i3) {
            f18445g.b("io.rakam.api.DatabaseHelper", "onUpgrade() with invalid oldVersion and newVersion");
            K0(sQLiteDatabase);
            return;
        }
        if (i3 <= 1) {
            return;
        }
        if (i2 == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            if (i3 <= 2) {
                return;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                f18445g.b("io.rakam.api.DatabaseHelper", "onUpgrade() with unknown oldVersion " + i2);
                K0(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long q0(long j2) {
        return s0("events", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long t0(long j2) {
        return s0("identifys", j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long u0() {
        return P() + g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String v0(String str) {
        return (String) w0(AccountAnalytics.STORE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ca: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:46:0x00ca */
    protected synchronized Object w0(String str, String str2) {
        Cursor cursor;
        Object obj;
        Cursor cursor2;
        cursor = null;
        try {
        } catch (Throwable th) {
            th = th;
            cursor = obj;
        }
        try {
            cursor2 = D0(getReadableDatabase(), str, new String[]{RoomNotification.KEY, "value"}, "key = ?", new String[]{str2}, null, null, null, null);
            try {
                if (cursor2.moveToFirst()) {
                    cursor = str.equals(AccountAnalytics.STORE) ? cursor2.getString(1) : Long.valueOf(cursor2.getLong(1));
                }
                cursor2.close();
            } catch (SQLiteException e2) {
                e = e2;
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                e.e().g(String.format("DB: Failed to getValue: %s", str2), e);
                w();
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            } catch (RuntimeException e3) {
                e = e3;
                e.e().g(String.format("DB: Failed to getValue: %s", str2), e);
                o(e);
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            } catch (StackOverflowError e4) {
                e = e4;
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                e.e().g(String.format("DB: Failed to getValue: %s", str2), e);
                w();
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor2 = null;
        } catch (RuntimeException e6) {
            e = e6;
            cursor2 = null;
        } catch (StackOverflowError e7) {
            e = e7;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            close();
            throw th;
        }
        close();
        return cursor;
    }

    synchronized long x0(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    synchronized long y0(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    synchronized long z(String str, String str2) {
        long j2;
        try {
            try {
                try {
                    j2 = getWritableDatabase().delete(str, "key=?", new String[]{str2});
                } catch (StackOverflowError e2) {
                    f18445g.c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e2);
                    e.e().g(String.format("DB: Failed to deleteKey: %s", str2), e2);
                    w();
                    close();
                    j2 = -1;
                    return j2;
                }
            } catch (SQLiteException e3) {
                f18445g.c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e3);
                e.e().g(String.format("DB: Failed to deleteKey: %s", str2), e3);
                w();
                close();
                j2 = -1;
                return j2;
            }
        } finally {
            close();
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long z0(String str, Long l) {
        long C0;
        if (l == null) {
            C0 = z("long_store", str);
        } else {
            C0 = C0("long_store", str, l);
        }
        return C0;
    }
}
