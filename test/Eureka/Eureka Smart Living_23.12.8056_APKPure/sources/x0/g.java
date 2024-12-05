package x0;

import android.database.SQLException;
import android.os.Build;
import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private o f9785a = new o();

    /* renamed from: b, reason: collision with root package name */
    private w0.i f9786b = new w0.i();

    /* renamed from: c, reason: collision with root package name */
    private w0.o f9787c = new w0.o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9788a;

        a(String str) {
            this.f9788a = str;
            put("progress", "Import: " + str);
        }
    }

    private Integer e(w0.c cVar, j jVar) {
        Integer num = -1;
        int intValue = num.intValue();
        j0.b n6 = cVar.n();
        try {
            try {
                try {
                    try {
                        if (!cVar.z().booleanValue() || jVar == null) {
                            throw new Exception("CreateSchema: Database not opened");
                        }
                        cVar.c();
                        ArrayList f6 = f(jVar);
                        if (f6.size() > 0) {
                            Integer valueOf = Integer.valueOf(this.f9787c.e(n6));
                            Iterator it = f6.iterator();
                            while (it.hasNext()) {
                                n6.o((String) it.next());
                            }
                            intValue = this.f9787c.e(n6) - valueOf.intValue();
                            if (intValue >= 0) {
                                cVar.e();
                            }
                        } else if (jVar.d().equals("partial")) {
                            Integer num2 = 0;
                            intValue = num2.intValue();
                        }
                        return Integer.valueOf(intValue);
                    } catch (SQLException e6) {
                        throw new Exception("CreateSchema: " + e6.getMessage());
                    }
                } catch (Exception e7) {
                    throw new Exception("CreateSchema: " + e7.getMessage());
                }
            } catch (IllegalStateException e8) {
                throw new Exception("CreateSchema: " + e8.getMessage());
            }
        } finally {
            if (n6 != null && n6.C()) {
                cVar.G();
            }
        }
    }

    private ArrayList f(j jVar) {
        ArrayList arrayList = new ArrayList();
        jVar.d();
        for (int i6 = 0; i6 < jVar.f().size(); i6++) {
            String c6 = ((k) jVar.f().get(i6)).c();
            if (((k) jVar.f().get(i6)).d().size() > 0) {
                ArrayList d6 = ((k) jVar.f().get(i6)).d();
                if (d6.size() > 0) {
                    arrayList.addAll(i(d6, c6));
                }
            }
            if (((k) jVar.f().get(i6)).a().size() > 0) {
                ArrayList a6 = ((k) jVar.f().get(i6)).a();
                if (a6.size() > 0) {
                    arrayList.addAll(h(a6, c6));
                }
            }
            if (((k) jVar.f().get(i6)).f().size() > 0) {
                ArrayList f6 = ((k) jVar.f().get(i6)).f();
                if (f6.size() > 0) {
                    arrayList.addAll(j(f6, c6));
                }
            }
        }
        return arrayList;
    }

    private void g(w0.c cVar, String str, ArrayList arrayList, String str2) {
        if (!this.f9785a.l(cVar, str2)) {
            throw new Exception("createTableData: Table " + str2 + "does not exist");
        }
        try {
            j0 h6 = this.f9785a.h(cVar, str2);
            if (h6.length() == 0) {
                throw new Exception("CreateTableData: no column names & types returned");
            }
            if (!h6.has("names")) {
                throw new Exception("GetValues: Table " + str2 + " no names");
            }
            ArrayList f6 = this.f9785a.f(h6.get("names"));
            JSONObject l6 = l(f6, arrayList);
            String d6 = this.f9785a.d(f6, ',');
            if (l6.has("insert")) {
                if (cVar.F("INSERT OR REPLACE INTO " + str2 + "(" + d6 + ") " + l6.get("insert") + ";", new ArrayList(), Boolean.TRUE, "no").getLong("lastId") < 0) {
                    throw new Exception("CreateTableData: INSERT lastId < 0");
                }
            }
            if (l6.has("delete")) {
                if (cVar.F("DELETE FROM " + str2 + " WHERE " + ((String) f6.get(0)) + " " + l6.get("delete") + ";", new ArrayList(), Boolean.TRUE, "no").getLong("lastId") < 0) {
                    throw new Exception("CreateTableData: INSERT lastId < 0");
                }
            }
        } catch (JSONException e6) {
            throw new Exception("CreateTableData: " + e6.getMessage());
        } catch (Exception e7) {
            throw new Exception("CreateTableData: " + e7.getMessage());
        }
    }

    private ArrayList h(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            String c6 = ((i) arrayList.get(i6)).c();
            arrayList2.add("CREATE " + (c6.length() > 0 ? c6 + " " : "") + "INDEX IF NOT EXISTS " + ((i) arrayList.get(i6)).d() + " ON " + str + " (" + ((i) arrayList.get(i6)).e() + ");");
        }
        return arrayList2;
    }

    private ArrayList i(ArrayList arrayList, String str) {
        StringBuilder sb;
        ArrayList arrayList2 = new ArrayList();
        String str2 = "CREATE TABLE IF NOT EXISTS " + str + " (";
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = bool;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (i6 == arrayList.size() - 1) {
                if (((h) arrayList.get(i6)).a() != null) {
                    str2 = str2 + ((h) arrayList.get(i6)).a() + " " + ((h) arrayList.get(i6)).f();
                    if (((h) arrayList.get(i6)).a().equals("last_modified")) {
                        bool = Boolean.TRUE;
                    }
                    if (!((h) arrayList.get(i6)).a().equals("sql_deleted")) {
                    }
                    bool2 = Boolean.TRUE;
                } else {
                    if (((h) arrayList.get(i6)).d() != null) {
                        sb = new StringBuilder(str2);
                        sb.append("FOREIGN KEY (");
                        sb.append(((h) arrayList.get(i6)).d());
                        sb.append(") ");
                    } else if (((h) arrayList.get(i6)).c() != null) {
                        sb = new StringBuilder(str2);
                        sb.append("CONSTRAINT ");
                        sb.append(((h) arrayList.get(i6)).c());
                        sb.append(" ");
                    }
                    sb.append(((h) arrayList.get(i6)).f());
                    str2 = sb.toString();
                }
            } else if (((h) arrayList.get(i6)).a() != null) {
                str2 = str2 + ((h) arrayList.get(i6)).a() + " " + ((h) arrayList.get(i6)).f() + ",";
                if (((h) arrayList.get(i6)).a().equals("last_modified")) {
                    bool = Boolean.TRUE;
                }
                if (!((h) arrayList.get(i6)).a().equals("sql_deleted")) {
                }
                bool2 = Boolean.TRUE;
            } else {
                if (((h) arrayList.get(i6)).d() != null) {
                    sb = new StringBuilder(str2);
                    sb.append("FOREIGN KEY (");
                    sb.append(((h) arrayList.get(i6)).d());
                    sb.append(") ");
                } else if (((h) arrayList.get(i6)).c() != null) {
                    sb = new StringBuilder(str2);
                    sb.append("CONSTRAINT ");
                    sb.append(((h) arrayList.get(i6)).c());
                    sb.append(" ");
                }
                sb.append(((h) arrayList.get(i6)).f());
                sb.append(",");
                str2 = sb.toString();
            }
        }
        arrayList2.add(str2 + ");");
        if (bool.booleanValue() && bool2.booleanValue()) {
            arrayList2.add("CREATE TRIGGER IF NOT EXISTS " + str + "_trigger_last_modified AFTER UPDATE ON " + str + " FOR EACH ROW WHEN NEW.last_modified <= OLD.last_modified BEGIN UPDATE " + str + " SET last_modified = (strftime('%s','now')) WHERE id=NEW.id; END;");
        }
        return arrayList2;
    }

    private ArrayList j(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            String e6 = ((l) arrayList.get(i6)).e();
            if (e6.toUpperCase().endsWith(" ON")) {
                e6 = e6.substring(0, e6.length() - 3);
            }
            StringBuilder sb = new StringBuilder("CREATE TRIGGER IF NOT EXISTS ");
            sb.append(((l) arrayList.get(i6)).d());
            sb.append(" ");
            sb.append(e6);
            sb.append(" ON ");
            sb.append(str);
            sb.append(" ");
            if (((l) arrayList.get(i6)).a() != null) {
                sb.append(((l) arrayList.get(i6)).a());
                sb.append(" ");
            }
            sb.append(((l) arrayList.get(i6)).c());
            arrayList2.add(sb.toString());
        }
        return arrayList2;
    }

    private JSONObject l(ArrayList arrayList, ArrayList arrayList2) {
        Stream map;
        Object[] array;
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) it.next();
            int indexOf = arrayList.indexOf("sql_deleted");
            if (indexOf == -1 || ((Integer) arrayList3.get(indexOf)).intValue() == 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    map = arrayList3.stream().map(new Function() { // from class: x0.e
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String m6;
                            m6 = g.m(obj);
                            return m6;
                        }
                    });
                    array = map.toArray(new IntFunction() { // from class: x0.f
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i6) {
                            String[] n6;
                            n6 = g.n(i6);
                            return n6;
                        }
                    });
                    String a6 = d.a(", ", (CharSequence[]) array);
                    sb.append("(");
                    sb.append(a6);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                        if (i6 > 0) {
                            sb3.append(", ");
                        }
                        Object obj = arrayList3.get(i6);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.contains("'")) {
                                str = str.replace("'", "''");
                            }
                            sb3.append("'");
                            sb3.append(str);
                            sb3.append("'");
                        } else {
                            sb3.append(obj);
                        }
                    }
                    sb.append("(");
                    sb.append((CharSequence) sb3);
                }
                sb.append("), ");
            } else if (((Integer) arrayList3.get(indexOf)).intValue() == 1) {
                if (arrayList3.get(0) instanceof String) {
                    sb2.append("'");
                    sb2.append(arrayList3.get(0));
                    sb2.append("', ");
                } else {
                    sb2.append(arrayList3.get(0));
                    sb2.append(", ");
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
            sb.insert(0, "VALUES ");
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 2);
            sb2.insert(0, "IN (");
            sb2.append(")");
        }
        if (sb.length() > 0) {
            jSONObject.put("insert", sb.toString());
        }
        if (sb2.length() > 0) {
            jSONObject.put("delete", sb2.toString());
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(Object obj) {
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        String str = (String) obj;
        if (str.contains("'")) {
            str = str.replace("'", "''");
        }
        return "'" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] n(int i6) {
        return new String[i6];
    }

    public Integer c(w0.c cVar, j jVar) {
        Integer num = -1;
        num.intValue();
        num.intValue();
        j0.b n6 = cVar.n();
        try {
            try {
                try {
                    if (!cVar.z().booleanValue() || jVar == null) {
                        throw new Exception("CreateDatabaseData: Database not opened");
                    }
                    int e6 = this.f9787c.e(n6);
                    cVar.c();
                    int i6 = 0;
                    boolean z5 = false;
                    for (int i7 = 0; i7 < jVar.f().size(); i7++) {
                        if (((k) jVar.f().get(i7)).g().size() > 0) {
                            try {
                                g(cVar, jVar.d(), ((k) jVar.f().get(i7)).g(), ((k) jVar.f().get(i7)).c());
                                o("Table ".concat(((k) jVar.f().get(i7)).c()).concat(" data creation completed") + " " + (i7 + 1) + "/" + jVar.f().size() + " ...");
                                z5 = true;
                            } catch (Exception e7) {
                                throw new Exception("CreateDatabaseData: " + e7.getMessage());
                            }
                        }
                    }
                    if (z5 && (i6 = this.f9787c.e(n6) - e6) >= 0) {
                        cVar.e();
                        o("Tables data creation completed changes: " + i6);
                    }
                    return Integer.valueOf(i6);
                } catch (SQLException e8) {
                    throw new Exception("CreateDatabaseData: " + e8.getMessage());
                }
            } catch (IllegalStateException e9) {
                throw new Exception("CreateDatabaseData: " + e9.getMessage());
            } catch (Exception e10) {
                throw new Exception("CreateDatabaseData: " + e10.getMessage());
            }
        } finally {
            if (n6 != null && n6.C()) {
                cVar.G();
            }
        }
    }

    public Integer d(w0.c cVar, j jVar) {
        Integer num = -1;
        num.intValue();
        cVar.n().n(jVar.h().intValue());
        if (jVar.d().equals("full")) {
            try {
                this.f9786b.a(cVar);
            } catch (Exception e6) {
                throw new Exception("CreateDatabaseSchema: " + e6.getMessage());
            }
        }
        try {
            int intValue = e(cVar, jVar).intValue();
            o("Schema creation completed changes: " + intValue);
            return Integer.valueOf(intValue);
        } catch (Exception e7) {
            throw new Exception("CreateDatabaseSchema: " + e7.getMessage());
        }
    }

    public Integer k(w0.c cVar, ArrayList arrayList) {
        Integer num = 0;
        num.intValue();
        j0.b n6 = cVar.n();
        try {
            try {
                if (!cVar.z().booleanValue() || arrayList.size() <= 0) {
                    throw new Exception("CreateViews: Database not opened");
                }
                cVar.c();
                Integer valueOf = Integer.valueOf(this.f9787c.e(n6));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (mVar.a().length() <= 0 || mVar.b().length() <= 0) {
                        throw new Exception("CreateViews: no name and value");
                    }
                    n6.o("CREATE VIEW IF NOT EXISTS " + mVar.a() + " AS " + mVar.b() + " ;");
                }
                int e6 = this.f9787c.e(n6) - valueOf.intValue();
                if (e6 >= 0) {
                    cVar.e();
                }
                return Integer.valueOf(e6);
            } catch (Exception e7) {
                throw new Exception("CreateViews: " + e7.getMessage());
            }
        } finally {
            if (n6 != null && n6.C()) {
                cVar.G();
            }
        }
    }

    public void o(String str) {
        com.getcapacitor.community.database.sqlite.g.b().c("importJsonProgress", new a(str));
    }
}
