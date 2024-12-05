package io.sqlc;

import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.b0;

/* loaded from: classes.dex */
public class SQLitePlugin extends org.apache.cordova.b {

    /* renamed from: c, reason: collision with root package name */
    private Map f7013c = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7014a;

        static {
            int[] iArr = new int[b.values().length];
            f7014a = iArr;
            try {
                iArr[b.echoStringValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7014a[b.open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7014a[b.close.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7014a[b.delete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7014a[b.executeSqlBatch.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7014a[b.backgroundExecuteSqlBatch.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private enum b {
        echoStringValue,
        open,
        close,
        delete,
        executeSqlBatch,
        backgroundExecuteSqlBatch
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        final boolean f7022a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f7023b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f7024c;

        /* renamed from: d, reason: collision with root package name */
        final String[] f7025d;

        /* renamed from: e, reason: collision with root package name */
        final JSONArray[] f7026e;

        /* renamed from: f, reason: collision with root package name */
        final org.apache.cordova.a f7027f;

        c() {
            this.f7022a = true;
            this.f7023b = false;
            this.f7024c = false;
            this.f7025d = null;
            this.f7026e = null;
            this.f7027f = null;
        }

        c(boolean z5, org.apache.cordova.a aVar) {
            this.f7022a = true;
            this.f7023b = true;
            this.f7024c = z5;
            this.f7025d = null;
            this.f7026e = null;
            this.f7027f = aVar;
        }

        c(String[] strArr, JSONArray[] jSONArrayArr, org.apache.cordova.a aVar) {
            this.f7022a = false;
            this.f7023b = false;
            this.f7024c = false;
            this.f7025d = strArr;
            this.f7026e = jSONArrayArr;
            this.f7027f = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final String f7029a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7030b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7031c;

        /* renamed from: d, reason: collision with root package name */
        final BlockingQueue f7032d;

        /* renamed from: e, reason: collision with root package name */
        final org.apache.cordova.a f7033e;

        /* renamed from: f, reason: collision with root package name */
        io.sqlc.a f7034f;

        d(String str, JSONObject jSONObject, org.apache.cordova.a aVar) {
            this.f7029a = str;
            this.f7030b = jSONObject.has("androidOldDatabaseImplementation");
            Log.v(SQLitePlugin.class.getSimpleName(), "Android db implementation: built-in android.database.sqlite package");
            boolean z5 = this.f7030b && jSONObject.has("androidBugWorkaround");
            this.f7031c = z5;
            if (z5) {
                Log.v(SQLitePlugin.class.getSimpleName(), "Android db closing/locking workaround applied");
            }
            this.f7032d = new LinkedBlockingQueue();
            this.f7033e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7034f = SQLitePlugin.this.j(this.f7029a, this.f7033e, this.f7030b);
                c cVar = null;
                try {
                    Object take = this.f7032d.take();
                    while (true) {
                        cVar = (c) take;
                        if (cVar.f7022a) {
                            break;
                        }
                        this.f7034f.e(cVar.f7025d, cVar.f7026e, cVar.f7027f);
                        if (this.f7031c) {
                            String[] strArr = cVar.f7025d;
                            if (strArr.length == 1 && strArr[0] == "COMMIT") {
                                this.f7034f.c();
                            }
                        }
                        take = this.f7032d.take();
                    }
                } catch (Exception e6) {
                    Log.e(SQLitePlugin.class.getSimpleName(), "unexpected error", e6);
                }
                if (cVar == null || !cVar.f7023b) {
                    return;
                }
                try {
                    SQLitePlugin.this.f(this.f7029a);
                    SQLitePlugin.this.f7013c.remove(this.f7029a);
                    if (cVar.f7024c) {
                        try {
                            if (SQLitePlugin.this.h(this.f7029a)) {
                                cVar.f7027f.success();
                            } else {
                                cVar.f7027f.error("couldn't delete database");
                            }
                        } catch (Exception e7) {
                            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't delete database", e7);
                            cVar.f7027f.error("couldn't delete database: " + e7);
                        }
                    } else {
                        cVar.f7027f.success();
                    }
                } catch (Exception e8) {
                    Log.e(SQLitePlugin.class.getSimpleName(), "couldn't close database", e8);
                    org.apache.cordova.a aVar = cVar.f7027f;
                    if (aVar != null) {
                        aVar.error("couldn't close database: " + e8);
                    }
                }
            } catch (Exception e9) {
                Log.e(SQLitePlugin.class.getSimpleName(), "unexpected error, stopping db thread", e9);
                SQLitePlugin.this.f7013c.remove(this.f7029a);
            }
        }
    }

    private void e(String str, org.apache.cordova.a aVar) {
        d dVar = (d) this.f7013c.get(str);
        if (dVar == null) {
            if (aVar != null) {
                aVar.success();
                return;
            }
            return;
        }
        try {
            dVar.f7032d.put(new c(false, aVar));
        } catch (Exception e6) {
            if (aVar != null) {
                aVar.error("couldn't close database" + e6);
            }
            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't close database", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        io.sqlc.a aVar;
        d dVar = (d) this.f7013c.get(str);
        if (dVar == null || (aVar = dVar.f7034f) == null) {
            return;
        }
        aVar.d();
    }

    private void g(String str, org.apache.cordova.a aVar) {
        d dVar = (d) this.f7013c.get(str);
        if (dVar == null) {
            if (h(str)) {
                aVar.success();
                return;
            } else {
                aVar.error("couldn't delete database");
                return;
            }
        }
        try {
            dVar.f7032d.put(new c(true, aVar));
        } catch (Exception e6) {
            if (aVar != null) {
                aVar.error("couldn't close database" + e6);
            }
            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't close database", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(String str) {
        try {
            return this.f8371cordova.getActivity().deleteDatabase(this.f8371cordova.getActivity().getDatabasePath(str).getAbsolutePath());
        } catch (Exception e6) {
            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't delete database", e6);
            return false;
        }
    }

    private boolean i(b bVar, JSONArray jSONArray, org.apache.cordova.a aVar) {
        String str;
        switch (a.f7014a[bVar.ordinal()]) {
            case 1:
                aVar.success(jSONArray.getJSONObject(0).getString("value"));
                return true;
            case 2:
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                k(jSONObject.getString("name"), jSONObject, aVar);
                return true;
            case 3:
                e(jSONArray.getJSONObject(0).getString("path"), aVar);
                return true;
            case 4:
                g(jSONArray.getJSONObject(0).getString("path"), aVar);
                return true;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                String string = jSONObject2.getJSONObject("dbargs").getString("dbname");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("executes");
                if (jSONArray2.isNull(0)) {
                    str = "INTERNAL PLUGIN ERROR: missing executes list";
                } else {
                    int length = jSONArray2.length();
                    String[] strArr = new String[length];
                    JSONArray[] jSONArrayArr = new JSONArray[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i6);
                        strArr[i6] = jSONObject3.getString("sql");
                        jSONArrayArr[i6] = jSONObject3.getJSONArray("params");
                    }
                    c cVar = new c(strArr, jSONArrayArr, aVar);
                    d dVar = (d) this.f7013c.get(string);
                    if (dVar != null) {
                        try {
                            dVar.f7032d.put(cVar);
                            return true;
                        } catch (Exception e6) {
                            Log.e(SQLitePlugin.class.getSimpleName(), "couldn't add to queue", e6);
                            str = "INTERNAL PLUGIN ERROR: couldn't add to queue";
                        }
                    } else {
                        str = "INTERNAL PLUGIN ERROR: database not open";
                    }
                }
                aVar.error(str);
                return true;
            default:
                return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.sqlc.a j(String str, org.apache.cordova.a aVar, boolean z5) {
        try {
            File databasePath = this.f8371cordova.getActivity().getDatabasePath(str);
            if (!databasePath.exists()) {
                databasePath.getParentFile().mkdirs();
            }
            Log.v("info", "Open sqlite db: " + databasePath.getAbsolutePath());
            io.sqlc.a aVar2 = z5 ? new io.sqlc.a() : new io.sqlc.b();
            aVar2.i(databasePath);
            if (aVar != null) {
                aVar.success();
            }
            return aVar2;
        } catch (Exception e6) {
            if (aVar != null) {
                aVar.error("can't open database " + e6);
            }
            throw e6;
        }
    }

    private void k(String str, JSONObject jSONObject, org.apache.cordova.a aVar) {
        if (((d) this.f7013c.get(str)) == null) {
            d dVar = new d(str, jSONObject, aVar);
            this.f7013c.put(str, dVar);
            this.f8371cordova.getThreadPool().execute(dVar);
        } else {
            aVar.error("INTERNAL ERROR: database already open for db name: " + str);
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        try {
            try {
                return i(b.valueOf(str), jSONArray, aVar);
            } catch (JSONException e6) {
                e = e6;
                Log.e(SQLitePlugin.class.getSimpleName(), "unexpected error", e);
                return false;
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
        }
    }

    @Override // org.apache.cordova.b
    public void onDestroy() {
        while (!this.f7013c.isEmpty()) {
            String str = (String) this.f7013c.keySet().iterator().next();
            f(str);
            try {
                ((d) this.f7013c.get(str)).f7032d.put(new c());
            } catch (Exception e6) {
                Log.e(SQLitePlugin.class.getSimpleName(), "INTERNAL PLUGIN CLEANUP ERROR: could not stop db thread due to exception", e6);
            }
            this.f7013c.remove(str);
        }
    }
}
