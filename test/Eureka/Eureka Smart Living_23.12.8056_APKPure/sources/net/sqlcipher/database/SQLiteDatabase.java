package net.sqlcipher.database;

import android.content.Context;
import android.database.Cursor;
import android.os.Debug;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import k5.h;
import k5.k;
import k5.l;

/* loaded from: classes.dex */
public class SQLiteDatabase extends net.sqlcipher.database.a implements j0.b {
    private static WeakHashMap B = new WeakHashMap();
    private static final String[] C = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final Pattern D = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static int E = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8040c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8041d;

    /* renamed from: l, reason: collision with root package name */
    private String f8049l;

    /* renamed from: n, reason: collision with root package name */
    private int f8051n;

    /* renamed from: o, reason: collision with root package name */
    private WeakHashMap f8052o;

    /* renamed from: r, reason: collision with root package name */
    private int f8055r;

    /* renamed from: s, reason: collision with root package name */
    private final h f8056s;

    /* renamed from: t, reason: collision with root package name */
    private int f8057t;

    /* renamed from: u, reason: collision with root package name */
    private int f8058u;

    /* renamed from: x, reason: collision with root package name */
    private Throwable f8061x;

    /* renamed from: y, reason: collision with root package name */
    private final int f8062y;

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f8042e = new ReentrantLock(true);

    /* renamed from: f, reason: collision with root package name */
    private long f8043f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f8044g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f8045h = 0;

    /* renamed from: i, reason: collision with root package name */
    private String f8046i = null;

    /* renamed from: j, reason: collision with root package name */
    long f8047j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f8048k = 0;

    /* renamed from: m, reason: collision with root package name */
    private String f8050m = null;

    /* renamed from: p, reason: collision with root package name */
    Map f8053p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private int f8054q = 250;

    /* renamed from: v, reason: collision with root package name */
    private String f8059v = null;

    /* renamed from: w, reason: collision with root package name */
    private String f8060w = null;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8063z = true;
    private final Map A = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e {
        a() {
        }

        @Override // net.sqlcipher.database.SQLiteDatabase.e
        public void a(String... strArr) {
            for (String str : strArr) {
                System.loadLibrary(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f8064a;

        b(byte[] bArr) {
            this.f8064a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = this.f8064a;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            SQLiteDatabase.this.key(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f8066a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ char[] f8067b;

        c(byte[] bArr, char[] cArr) {
            this.f8066a = bArr;
            this.f8067b = cArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8066a != null) {
                SQLiteDatabase.this.key_mutf8(this.f8067b);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        k5.d a(SQLiteDatabase sQLiteDatabase, net.sqlcipher.database.c cVar, String str, SQLiteQuery sQLiteQuery);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String... strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum f {
        Deferred,
        Immediate,
        Exclusive
    }

    private SQLiteDatabase(String str, d dVar, int i6, h hVar) {
        this.f8061x = null;
        if (str == null) {
            throw new IllegalArgumentException("path should not be null");
        }
        this.f8051n = i6;
        this.f8049l = str;
        this.f8062y = -1;
        this.f8061x = new l5.a().fillInStackTrace();
        this.f8052o = new WeakHashMap();
        this.f8056s = hVar;
    }

    private void M(l5.d dVar, f fVar) {
        String str;
        d0();
        if (!k()) {
            throw new IllegalStateException("database not open");
        }
        try {
            if (this.f8042e.getHoldCount() > 1) {
                if (this.f8040c) {
                    throw new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                }
                return;
            }
            if (fVar == f.Exclusive) {
                str = "BEGIN EXCLUSIVE;";
            } else if (fVar == f.Immediate) {
                str = "BEGIN IMMEDIATE;";
            } else {
                if (fVar != f.Deferred) {
                    throw new IllegalArgumentException(String.format("%s is an unsupported transaction type", fVar));
                }
                str = "BEGIN DEFERRED;";
            }
            o(str);
            this.f8041d = true;
            this.f8040c = false;
            if (dVar != null) {
                try {
                    dVar.a();
                } catch (RuntimeException e6) {
                    o("ROLLBACK;");
                    throw e6;
                }
            }
        } catch (Throwable th) {
            u0();
            throw th;
        }
    }

    private void O() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = elapsedRealtime - this.f8043f;
        if ((j6 >= 2000 || Log.isLoggable("Database", 2) || elapsedRealtime - this.f8045h >= 20000) && j6 > 300) {
            if (((int) ((Debug.threadCpuTimeNanos() - this.f8044g) / 1000000)) > 100 || j6 > 2000) {
                this.f8045h = elapsedRealtime;
                boolean z5 = SQLiteDebug.f8073a;
            }
        }
    }

    private void P() {
        S();
        Iterator it = this.f8052o.entrySet().iterator();
        while (it.hasNext()) {
            net.sqlcipher.database.a aVar = (net.sqlcipher.database.a) ((Map.Entry) it.next()).getKey();
            if (aVar != null) {
                aVar.D();
            }
        }
    }

    private boolean R(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c6 : cArr) {
            if (c6 == 0) {
                return true;
            }
        }
        return false;
    }

    private void S() {
        synchronized (this.f8053p) {
            Iterator it = this.f8053p.values().iterator();
            while (it.hasNext()) {
                ((SQLiteCompiledSql) it.next()).d();
            }
            this.f8053p.clear();
        }
    }

    public static byte[] T(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName("UTF-8").encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }

    public static char[] U(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        CharBuffer decode = Charset.forName("UTF-8").decode(ByteBuffer.wrap(bArr));
        char[] cArr = new char[decode.limit()];
        decode.get(cArr);
        return cArr;
    }

    private String X() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    private void Y(l5.b bVar, Runnable runnable) {
        if (bVar != null) {
            bVar.a(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (bVar != null) {
            bVar.b(this);
        }
        if (SQLiteDebug.f8075c) {
            this.f8059v = X();
        }
        k5.d q02 = q0("select count(*) from sqlite_master;", new String[0]);
        if (q02 != null) {
            q02.moveToFirst();
            q02.getInt(0);
            q02.close();
        }
    }

    public static synchronized void Z(Context context) {
        synchronized (SQLiteDatabase.class) {
            a0(context, context.getFilesDir());
        }
    }

    public static synchronized void a0(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            b0(context, file, new a());
        }
    }

    public static synchronized void b0(Context context, File file, e eVar) {
        synchronized (SQLiteDatabase.class) {
            eVar.a("sqlcipher");
        }
    }

    private void d0() {
        this.f8042e.lock();
        if (SQLiteDebug.f8077e && this.f8042e.getHoldCount() == 1) {
            this.f8043f = SystemClock.elapsedRealtime();
            this.f8044g = Debug.threadCpuTimeNanos();
        }
    }

    private native void dbclose();

    private native void dbopen(String str, int i6);

    public static SQLiteDatabase e0(String str, String str2, d dVar, int i6) {
        return f0(str, str2, dVar, i6, null);
    }

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    public static SQLiteDatabase f0(String str, String str2, d dVar, int i6, l5.b bVar) {
        return g0(str, str2, dVar, i6, bVar, null);
    }

    public static SQLiteDatabase g0(String str, String str2, d dVar, int i6, l5.b bVar, h hVar) {
        return i0(str, str2 == null ? null : str2.toCharArray(), dVar, i6, bVar, hVar);
    }

    public static SQLiteDatabase h0(String str, byte[] bArr, d dVar, int i6, l5.b bVar, h hVar) {
        if (hVar == null) {
            hVar = new k();
        }
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, dVar, i6, hVar);
        sQLiteDatabase.j0(bArr, bVar);
        if (SQLiteDebug.f8073a) {
            sQLiteDatabase.enableSqlTracing(str);
        }
        if (SQLiteDebug.f8074b) {
            sQLiteDatabase.enableSqlProfiling(str);
        }
        synchronized (B) {
            B.put(sQLiteDatabase, null);
        }
        return sQLiteDatabase;
    }

    public static SQLiteDatabase i0(String str, char[] cArr, d dVar, int i6, l5.b bVar, h hVar) {
        return h0(str, T(cArr), dVar, i6, bVar, hVar);
    }

    private void j0(byte[] bArr, l5.b bVar) {
        dbopen(this.f8049l, this.f8051n);
        try {
            try {
                Y(bVar, new b(bArr));
            } catch (RuntimeException e6) {
                char[] U = U(bArr);
                if (!R(U)) {
                    throw e6;
                }
                Y(bVar, new c(bArr, U));
                if (bArr != null && bArr.length > 0) {
                    rekey(bArr);
                }
                if (U == null || U.length <= 0) {
                    return;
                }
                Arrays.fill(U, (char) 0);
            }
        } catch (Throwable th) {
            if (1 != 0) {
                dbclose();
                if (SQLiteDebug.f8075c) {
                    this.f8060w = X();
                }
            }
            throw th;
        }
    }

    public static SQLiteDatabase k0(File file, String str, d dVar) {
        return l0(file, str, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void key(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void key_mutf8(char[] cArr);

    public static SQLiteDatabase l0(File file, String str, d dVar, l5.b bVar) {
        return m0(file, str, dVar, bVar, null);
    }

    public static SQLiteDatabase m0(File file, String str, d dVar, l5.b bVar, h hVar) {
        return n0(file == null ? null : file.getPath(), str, dVar, bVar, hVar);
    }

    public static SQLiteDatabase n0(String str, String str2, d dVar, l5.b bVar, h hVar) {
        return i0(str, str2 == null ? null : str2.toCharArray(), dVar, 268435456, bVar, hVar);
    }

    private native void native_rawExecSQL(String str);

    private native void rekey(byte[] bArr);

    private void u0() {
        if (SQLiteDebug.f8077e && this.f8042e.getHoldCount() == 1) {
            O();
        }
        this.f8042e.unlock();
    }

    @Override // j0.b
    public Cursor B(String str) {
        return q0(str, null);
    }

    @Override // j0.b
    public boolean C() {
        return this.f8042e.getHoldCount() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(net.sqlcipher.database.a aVar) {
        c0();
        try {
            this.f8052o.put(aVar, null);
        } finally {
            t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(String str, SQLiteCompiledSql sQLiteCompiledSql) {
        if (this.f8054q == 0) {
            boolean z5 = SQLiteDebug.f8073a;
            return;
        }
        synchronized (this.f8053p) {
            if (((SQLiteCompiledSql) this.f8053p.get(str)) != null) {
                return;
            }
            if (this.f8053p.size() == this.f8054q) {
                this.f8055r++;
            } else {
                this.f8053p.put(str, sQLiteCompiledSql);
                boolean z6 = SQLiteDebug.f8073a;
            }
        }
    }

    public void L(l5.d dVar) {
        M(dVar, f.Exclusive);
    }

    public void N(String str) {
        if (!k()) {
            throw new l5.c("database not open");
        }
        if (str != null) {
            byte[] T = T(str.toCharArray());
            rekey(T);
            Arrays.fill(T, (byte) 0);
        }
    }

    @Override // j0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public SQLiteStatement u(String str) {
        c0();
        try {
            if (k()) {
                return new SQLiteStatement(this, str);
            }
            throw new IllegalStateException("database not open");
        } finally {
            t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteCompiledSql V(String str) {
        synchronized (this.f8053p) {
            if (this.f8054q == 0) {
                boolean z5 = SQLiteDebug.f8073a;
                return null;
            }
            SQLiteCompiledSql sQLiteCompiledSql = (SQLiteCompiledSql) this.f8053p.get(str);
            boolean z6 = sQLiteCompiledSql != null;
            if (z6) {
                this.f8057t++;
            } else {
                this.f8058u++;
            }
            boolean z7 = SQLiteDebug.f8073a;
            return sQLiteCompiledSql;
        }
    }

    public final String W() {
        return this.f8049l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0() {
        if (this.f8063z) {
            this.f8042e.lock();
            if (SQLiteDebug.f8077e && this.f8042e.getHoldCount() == 1) {
                this.f8043f = SystemClock.elapsedRealtime();
                this.f8044g = Debug.threadCpuTimeNanos();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (k()) {
            c0();
            try {
                P();
                w();
            } finally {
                t0();
            }
        }
    }

    @Override // j0.b
    public void d() {
        if (!k()) {
            throw new IllegalStateException("database not open");
        }
        if (!this.f8042e.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        }
        try {
            if (this.f8040c) {
                this.f8040c = false;
            } else {
                this.f8041d = false;
            }
            if (this.f8042e.getHoldCount() != 1) {
                return;
            }
            if (this.f8041d) {
                o("COMMIT;");
            } else {
                try {
                    o("ROLLBACK;");
                } catch (l unused) {
                }
            }
        } finally {
            u0();
        }
    }

    @Override // j0.b
    public void e() {
        L(null);
    }

    protected void finalize() {
        if (k()) {
            P();
            w();
        }
    }

    @Override // j0.b
    public boolean k() {
        return this.f8047j != 0;
    }

    @Override // j0.b
    public Cursor l(String str, Object[] objArr) {
        return p0(str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int lastChangeCount();

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long lastInsertRow();

    @Override // j0.b
    public void m(boolean z5) {
        if (C()) {
            throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
        }
        Object[] objArr = new Object[1];
        objArr[0] = z5 ? "ON" : "OFF";
        o(String.format("PRAGMA foreign_keys = %s;", objArr));
    }

    @Override // j0.b
    public void n(int i6) {
        o("PRAGMA user_version = " + i6);
    }

    native void native_execSQL(String str);

    @Override // j0.b
    public void o(String str) {
        SystemClock.uptimeMillis();
        c0();
        try {
            if (!k()) {
                throw new IllegalStateException("database not open");
            }
            native_execSQL(str);
        } finally {
            t0();
        }
    }

    public void o0(String str) {
        SystemClock.uptimeMillis();
        c0();
        try {
            if (!k()) {
                throw new IllegalStateException("database not open");
            }
            native_rawExecSQL(str);
        } finally {
            t0();
        }
    }

    /* JADX WARN: Finally extract failed */
    public k5.d p0(String str, Object[] objArr) {
        if (!k()) {
            throw new IllegalStateException("database not open");
        }
        long currentTimeMillis = this.f8062y != -1 ? System.currentTimeMillis() : 0L;
        net.sqlcipher.database.d dVar = new net.sqlcipher.database.d(this, str, null);
        try {
            k5.d e6 = dVar.e(null, objArr);
            if (this.f8062y != -1) {
                int count = e6 != null ? e6.getCount() : -1;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 >= this.f8062y) {
                    Log.v("Database", "query (" + currentTimeMillis2 + " ms): " + dVar.toString() + ", args are <redacted>, count is " + count);
                }
            }
            return new k5.c(e6);
        } catch (Throwable th) {
            if (this.f8062y != -1) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis3 >= this.f8062y) {
                    Log.v("Database", "query (" + currentTimeMillis3 + " ms): " + dVar.toString() + ", args are <redacted>, count is -1");
                }
            }
            throw th;
        }
    }

    public k5.d q0(String str, String[] strArr) {
        return r0(null, str, strArr, null);
    }

    @Override // j0.b
    public void r() {
        if (!k()) {
            throw new IllegalStateException("database not open");
        }
        if (!this.f8042e.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        }
        if (this.f8040c) {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
        this.f8040c = true;
    }

    /* JADX WARN: Finally extract failed */
    public k5.d r0(d dVar, String str, String[] strArr, String str2) {
        if (!k()) {
            throw new IllegalStateException("database not open");
        }
        long currentTimeMillis = this.f8062y != -1 ? System.currentTimeMillis() : 0L;
        net.sqlcipher.database.d dVar2 = new net.sqlcipher.database.d(this, str, str2);
        if (dVar == null) {
            dVar = null;
        }
        try {
            k5.d c6 = dVar2.c(dVar, strArr);
            if (this.f8062y != -1) {
                int count = c6 != null ? c6.getCount() : -1;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 >= this.f8062y) {
                    Log.v("Database", "query (" + currentTimeMillis2 + " ms): " + dVar2.toString() + ", args are <redacted>, count is " + count);
                }
            }
            return new k5.c(c6);
        } catch (Throwable th) {
            if (this.f8062y != -1) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis3 >= this.f8062y) {
                    Log.v("Database", "query (" + currentTimeMillis3 + " ms): " + dVar2.toString() + ", args are <redacted>, count is -1");
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0(net.sqlcipher.database.a aVar) {
        c0();
        try {
            this.f8052o.remove(aVar);
        } finally {
            t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t0() {
        if (this.f8063z) {
            if (SQLiteDebug.f8077e && this.f8042e.getHoldCount() == 1) {
                O();
            }
            this.f8042e.unlock();
        }
    }

    @Override // net.sqlcipher.database.a
    protected void w() {
        if (k()) {
            if (SQLiteDebug.f8075c) {
                this.f8060w = X();
            }
            dbclose();
            synchronized (B) {
                B.remove(this);
            }
        }
    }

    @Override // j0.b
    public int y() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        c0();
        try {
            if (!k()) {
                throw new IllegalStateException("database not open");
            }
            sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;");
            try {
                int J = (int) sQLiteStatement.J();
                sQLiteStatement.close();
                t0();
                return J;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                t0();
                throw th;
            }
        } catch (Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }
}
