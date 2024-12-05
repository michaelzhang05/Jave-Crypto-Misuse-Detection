package c.q.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import c.q.a.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
class b implements c.q.a.c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f2904f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2905g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f2906h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2907i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f2908j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private a f2909k;
    private boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: f, reason: collision with root package name */
        final c.q.a.g.a[] f2910f;

        /* renamed from: g, reason: collision with root package name */
        final c.a f2911g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2912h;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: c.q.a.g.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0079a implements DatabaseErrorHandler {
            final /* synthetic */ c.a a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.q.a.g.a[] f2913b;

            C0079a(c.a aVar, c.q.a.g.a[] aVarArr) {
                this.a = aVar;
                this.f2913b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.b(this.f2913b, sQLiteDatabase));
            }
        }

        a(Context context, String str, c.q.a.g.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.a, new C0079a(aVar, aVarArr));
            this.f2911g = aVar;
            this.f2910f = aVarArr;
        }

        static c.q.a.g.a b(c.q.a.g.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            c.q.a.g.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new c.q.a.g.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        c.q.a.g.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f2910f, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f2910f[0] = null;
        }

        synchronized c.q.a.b f() {
            this.f2912h = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f2912h) {
                close();
                return f();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f2911g.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f2911g.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2912h = true;
            this.f2911g.e(a(sQLiteDatabase), i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f2912h) {
                return;
            }
            this.f2911g.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2912h = true;
            this.f2911g.g(a(sQLiteDatabase), i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str, c.a aVar, boolean z) {
        this.f2904f = context;
        this.f2905g = str;
        this.f2906h = aVar;
        this.f2907i = z;
    }

    private a a() {
        a aVar;
        synchronized (this.f2908j) {
            if (this.f2909k == null) {
                c.q.a.g.a[] aVarArr = new c.q.a.g.a[1];
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && this.f2905g != null && this.f2907i) {
                    this.f2909k = new a(this.f2904f, new File(this.f2904f.getNoBackupFilesDir(), this.f2905g).getAbsolutePath(), aVarArr, this.f2906h);
                } else {
                    this.f2909k = new a(this.f2904f, this.f2905g, aVarArr, this.f2906h);
                }
                if (i2 >= 16) {
                    this.f2909k.setWriteAheadLoggingEnabled(this.l);
                }
            }
            aVar = this.f2909k;
        }
        return aVar;
    }

    @Override // c.q.a.c
    public c.q.a.b N() {
        return a().f();
    }

    @Override // c.q.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // c.q.a.c
    public String getDatabaseName() {
        return this.f2905g;
    }

    @Override // c.q.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f2908j) {
            a aVar = this.f2909k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.l = z;
        }
    }
}
