package net.sqlcipher.database;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class SQLiteDebug {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8073a = Log.isLoggable("SQLiteStatements", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8074b = Log.isLoggable("SQLiteTime", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8075c = Log.isLoggable("SQLiteCompiledSql", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8076d = Log.isLoggable("SQLiteCursorClosing", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f8077e = Log.isLoggable("SQLiteLockTime", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f8078f = Log.isLoggable("SQLiteLockStackTrace", 2);

    /* renamed from: g, reason: collision with root package name */
    private static int f8079g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (SQLiteDebug.class) {
            f8079g++;
        }
    }
}
