package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.CursorWindow;

/* loaded from: classes.dex */
public class b extends k5.b {
    protected a D;

    /* renamed from: o, reason: collision with root package name */
    private String f8091o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f8092p;

    /* renamed from: q, reason: collision with root package name */
    private SQLiteQuery f8093q;

    /* renamed from: r, reason: collision with root package name */
    private SQLiteDatabase f8094r;

    /* renamed from: s, reason: collision with root package name */
    private c f8095s;

    /* renamed from: t, reason: collision with root package name */
    private int f8096t = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f8097u = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8098v = false;

    /* renamed from: y, reason: collision with root package name */
    private int f8101y = Integer.MAX_VALUE;

    /* renamed from: z, reason: collision with root package name */
    private int f8102z = Integer.MAX_VALUE;
    private int A = 0;
    private ReentrantLock B = null;
    private boolean C = false;

    /* renamed from: x, reason: collision with root package name */
    private Throwable f8100x = new l5.a().fillInStackTrace();

    /* renamed from: w, reason: collision with root package name */
    private Map f8099w = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f8103a;

        a(b bVar) {
            this.f8103a = new WeakReference(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar = (b) this.f8103a.get();
            if (bVar != null) {
                bVar.G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.sqlcipher.database.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0125b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f8104a;

        RunnableC0125b(int i6) {
            this.f8104a = i6;
        }

        private void a() {
            b bVar = b.this;
            a aVar = bVar.D;
            if (aVar == null) {
                bVar.C = true;
            } else {
                aVar.sendEmptyMessage(1);
                b.this.C = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        
            r4.f8105b.f8096t = r1;
            a();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                net.sqlcipher.database.b r0 = net.sqlcipher.database.b.this
                net.sqlcipher.CursorWindow r0 = net.sqlcipher.database.b.K(r0)
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            Lf:
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.b.L(r1)
                if (r1 != 0) goto L22
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r3 = 1
                r2.<init>(r3)
                net.sqlcipher.database.b.M(r1, r2)
            L22:
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.b.L(r1)
                r1.lock()
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                int r1 = net.sqlcipher.database.b.N(r1)
                int r2 = r4.f8104a
                if (r1 == r2) goto L3f
            L35:
                net.sqlcipher.database.b r0 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.b.L(r0)
                r0.unlock()
                goto L84
            L3f:
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.SQLiteQuery r1 = net.sqlcipher.database.b.S(r1)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.b r2 = net.sqlcipher.database.b.this     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                int r2 = net.sqlcipher.database.b.O(r2)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.b r3 = net.sqlcipher.database.b.this     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                int r3 = net.sqlcipher.database.b.P(r3)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                int r1 = r1.L(r0, r2, r3)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                if (r1 == 0) goto L35
                r2 = -1
                if (r1 != r2) goto L70
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                int r2 = net.sqlcipher.database.b.O(r1)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.b.R(r1, r2)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                r4.a()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.b.L(r1)
                r1.unlock()
                goto Lf
            L70:
                net.sqlcipher.database.b r0 = net.sqlcipher.database.b.this     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                net.sqlcipher.database.b.Q(r0, r1)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                r4.a()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L79
                goto L35
            L79:
                r0 = move-exception
                net.sqlcipher.database.b r1 = net.sqlcipher.database.b.this
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.b.L(r1)
                r1.unlock()
                throw r0
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.b.RunnableC0125b.run():void");
        }
    }

    public b(SQLiteDatabase sQLiteDatabase, c cVar, String str, SQLiteQuery sQLiteQuery) {
        this.f8094r = sQLiteDatabase;
        this.f8095s = cVar;
        this.f8091o = str;
        this.f8093q = sQLiteQuery;
        try {
            sQLiteDatabase.c0();
            int J = this.f8093q.J();
            this.f8092p = new String[J];
            for (int i6 = 0; i6 < J; i6++) {
                String K = this.f8093q.K(i6);
                this.f8092p[i6] = K;
                if ("_id".equals(K)) {
                    this.f7195e = i6;
                }
            }
        } finally {
            sQLiteDatabase.t0();
        }
    }

    static /* synthetic */ int R(b bVar, int i6) {
        int i7 = bVar.f8096t + i6;
        bVar.f8096t = i7;
        return i7;
    }

    private void V() {
        this.A = 0;
        CursorWindow cursorWindow = this.f7205n;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.f7205n = null;
        }
    }

    private void W(int i6) {
        if (this.f7205n == null) {
            this.f7205n = new CursorWindow(true);
        } else {
            this.A++;
            X();
            try {
                this.f7205n.clear();
            } finally {
                Y();
            }
        }
        int U = this.f8098v ? i6 : this.f8096t == -1 ? U(i6, 0) : U(i6, this.f8097u);
        this.f7205n.setStartPosition(U);
        this.f7205n.D(i6);
        this.f8096t = this.f8093q.L(this.f7205n, this.f8102z, 0);
        if (this.f8097u == 0) {
            this.f8097u = this.f7205n.getNumRows();
        }
        if (this.f8096t == -1) {
            this.f8096t = U + this.f8102z;
            new Thread(new RunnableC0125b(this.A), "query thread").start();
        }
    }

    private void X() {
        ReentrantLock reentrantLock = this.B;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void Y() {
        ReentrantLock reentrantLock = this.B;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    public int U(int i6, int i7) {
        return Math.max(i6 - (i7 / 3), 0);
    }

    @Override // k5.a, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        V();
        this.f8093q.close();
        this.f8095s.d();
    }

    @Override // k5.a, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        V();
        this.f8095s.b();
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i6, android.database.CursorWindow cursorWindow) {
        if (this.f7205n == null) {
            this.f7205n = new CursorWindow(true);
        } else {
            this.A++;
            X();
            try {
                this.f7205n.clear();
            } finally {
                Y();
            }
        }
        int U = this.f8098v ? i6 : this.f8096t == -1 ? U(i6, 0) : U(i6, this.f8097u);
        this.f7205n.setStartPosition(U);
        this.f7205n.D(i6);
        this.f8096t = this.f8093q.L(this.f7205n, this.f8102z, 0);
        if (this.f8097u == 0) {
            this.f8097u = this.f7205n.getNumRows();
        }
        if (this.f8096t == -1) {
            this.f8096t = U + this.f8102z;
            new Thread(new RunnableC0125b(this.A), "query thread").start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.a
    public void finalize() {
        try {
            if (this.f7205n != null) {
                this.f8093q.f8081d.length();
                close();
                SQLiteDebug.a();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // k5.a, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.f8099w == null) {
            String[] strArr = this.f8092p;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i6 = 0; i6 < length; i6++) {
                hashMap.put(strArr[i6], Integer.valueOf(i6));
            }
            this.f8099w = hashMap;
        }
        if (str.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer num = (Integer) this.f8099w.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // k5.a, android.database.Cursor
    public String[] getColumnNames() {
        return this.f8092p;
    }

    @Override // k5.a, android.database.Cursor
    public int getCount() {
        if (this.f8096t == -1) {
            W(0);
        }
        return this.f8096t;
    }

    @Override // k5.a, android.database.CrossProcessCursor
    public boolean onMove(int i6, int i7) {
        CursorWindow cursorWindow = this.f7205n;
        if (cursorWindow != null && i7 >= cursorWindow.getStartPosition() && i7 < this.f7205n.getStartPosition() + this.f7205n.getNumRows()) {
            return true;
        }
        W(i7);
        return true;
    }

    @Override // k5.a, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.f8101y && Integer.MAX_VALUE == this.f8102z) && this.D == null) {
            X();
            try {
                this.D = new a(this);
                if (this.C) {
                    G();
                    this.C = false;
                }
            } finally {
                Y();
            }
        }
    }

    @Override // k5.a, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.f8094r.c0();
        try {
            CursorWindow cursorWindow = this.f7205n;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            this.f7196f = -1;
            this.f8095s.a(this);
            this.f8096t = -1;
            this.A++;
            X();
            try {
                this.f8093q.M();
                this.f8094r.t0();
                return super.requery();
            } finally {
                Y();
            }
        } catch (Throwable th) {
            this.f8094r.t0();
            throw th;
        }
    }
}
