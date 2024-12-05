package c.q.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                }
            } catch (Exception e3) {
                Log.w("SupportSQLite", "delete failed: ", e3);
            }
        }

        public void b(c.q.a.b bVar) {
        }

        public void c(c.q.a.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.c());
            if (!bVar.isOpen()) {
                a(bVar.c());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.i();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        a((String) it.next().second);
                    }
                } else {
                    a(bVar.c());
                }
            }
        }

        public abstract void d(c.q.a.b bVar);

        public abstract void e(c.q.a.b bVar, int i2, int i3);

        public void f(c.q.a.b bVar) {
        }

        public abstract void g(c.q.a.b bVar, int i2, int i3);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public final Context a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2893b;

        /* renamed from: c, reason: collision with root package name */
        public final a f2894c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2895d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* loaded from: classes.dex */
        public static class a {
            Context a;

            /* renamed from: b, reason: collision with root package name */
            String f2896b;

            /* renamed from: c, reason: collision with root package name */
            a f2897c;

            /* renamed from: d, reason: collision with root package name */
            boolean f2898d;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.f2897c != null) {
                    if (this.a != null) {
                        if (this.f2898d && TextUtils.isEmpty(this.f2896b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.a, this.f2896b, this.f2897c, this.f2898d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f2897c = aVar;
                return this;
            }

            public a c(String str) {
                this.f2896b = str;
                return this;
            }

            public a d(boolean z) {
                this.f2898d = z;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.f2893b = str;
            this.f2894c = aVar;
            this.f2895d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: c.q.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0077c {
        c a(b bVar);
    }

    c.q.a.b N();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
