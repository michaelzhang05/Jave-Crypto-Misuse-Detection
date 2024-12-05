package w0;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9728a = "w0.i";

    public void a(c cVar) {
        try {
            try {
                cVar.c();
                c(cVar);
                b(cVar);
                d(cVar);
                e(cVar);
                cVar.e();
                cVar.G();
                try {
                    cVar.n().o("VACUUM;");
                } catch (Exception e6) {
                    String str = "DropAll VACUUM failed: " + e6;
                    Log.d(f9728a, str);
                    throw new Exception(str);
                }
            } catch (Exception e7) {
                String str2 = "DropAll failed: " + e7;
                Log.d(f9728a, str2);
                throw new Exception(str2);
            }
        } catch (Throwable th) {
            try {
                cVar.n().o("VACUUM;");
                throw th;
            } catch (Exception e8) {
                String str3 = "DropAll VACUUM failed: " + e8;
                Log.d(f9728a, str3);
                throw new Exception(str3);
            }
        }
    }

    public void b(c cVar) {
        try {
            for (String str : f(cVar)) {
                cVar.n().o("DROP INDEX IF EXISTS " + str);
            }
        } catch (Exception e6) {
            String str2 = "DropAllIndexes failed: " + e6;
            Log.d(f9728a, str2);
            throw new Exception(str2);
        }
    }

    public void c(c cVar) {
        try {
            for (String str : g(cVar)) {
                cVar.n().o("DROP TABLE IF EXISTS " + str + " ;");
            }
        } catch (Exception e6) {
            String str2 = "DropAllTables failed: " + e6;
            Log.d(f9728a, str2);
            throw new Exception(str2);
        }
    }

    public void d(c cVar) {
        try {
            for (String str : h(cVar)) {
                cVar.n().o("DROP TRIGGER IF EXISTS " + str);
            }
        } catch (Exception e6) {
            String str2 = "DropAllTriggers failed: " + e6;
            Log.d(f9728a, str2);
            throw new Exception(str2);
        }
    }

    public void e(c cVar) {
        try {
            for (String str : i(cVar)) {
                cVar.n().o("DROP VIEW IF EXISTS " + str + " ;");
            }
        } catch (Exception e6) {
            String str2 = "DropAllViews failed: " + e6;
            Log.d(f9728a, str2);
            throw new Exception(str2);
        }
    }

    public List f(c cVar) {
        ArrayList arrayList = new ArrayList();
        k5.d dVar = (k5.d) cVar.n().B("SELECT name FROM sqlite_master WHERE type='index' AND name NOT LIKE 'sqlite_%';");
        dVar.moveToFirst();
        while (!dVar.isAfterLast()) {
            arrayList.add(dVar.getString(0));
            dVar.moveToNext();
        }
        dVar.close();
        return arrayList;
    }

    public List g(c cVar) {
        k5.d dVar;
        ArrayList arrayList = new ArrayList();
        k5.d dVar2 = null;
        try {
            try {
                dVar = (k5.d) cVar.n().B((((("SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sync_table' ") + "AND name NOT LIKE '_temp_%' ") + "AND name NOT LIKE 'sqlite_%' ") + "AND name NOT LIKE 'android_%' ") + "ORDER BY rootpage DESC;");
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable unused) {
        }
        try {
            dVar.moveToFirst();
            while (!dVar.isAfterLast()) {
                arrayList.add(dVar.getString(0));
                dVar.moveToNext();
            }
            dVar.close();
            return arrayList;
        } catch (Exception e7) {
            e = e7;
            dVar2 = dVar;
            throw new Exception("GetTablesNames failed " + e);
        } catch (Throwable unused2) {
            dVar2 = dVar;
            dVar2.close();
            return arrayList;
        }
    }

    public List h(c cVar) {
        ArrayList arrayList = new ArrayList();
        k5.d dVar = (k5.d) cVar.n().B("SELECT name FROM sqlite_master WHERE type='trigger';");
        dVar.moveToFirst();
        while (!dVar.isAfterLast()) {
            arrayList.add(dVar.getString(0));
            dVar.moveToNext();
        }
        dVar.close();
        return arrayList;
    }

    public List i(c cVar) {
        k5.d dVar;
        ArrayList arrayList = new ArrayList();
        k5.d dVar2 = null;
        try {
            try {
                dVar = (k5.d) cVar.n().B(("SELECT name FROM sqlite_master WHERE type='view' AND name NOT LIKE 'sqlite_%' ") + "ORDER BY rootpage DESC;");
            } catch (Throwable unused) {
            }
        } catch (Exception e6) {
            e = e6;
        }
        try {
            dVar.moveToFirst();
            while (!dVar.isAfterLast()) {
                arrayList.add(dVar.getString(0));
                dVar.moveToNext();
            }
            dVar.close();
            return arrayList;
        } catch (Exception e7) {
            e = e7;
            throw new Exception("GetTablesNames failed " + e);
        } catch (Throwable unused2) {
            dVar2 = dVar;
            dVar2.close();
            return arrayList;
        }
    }
}
