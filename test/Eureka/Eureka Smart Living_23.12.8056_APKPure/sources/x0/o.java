package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private h f9821a = new h();

    /* renamed from: b, reason: collision with root package name */
    private i f9822b = new i();

    /* renamed from: c, reason: collision with root package name */
    private l f9823c = new l();

    /* renamed from: d, reason: collision with root package name */
    private m f9824d = new m();

    /* renamed from: e, reason: collision with root package name */
    private w0.i f9825e = new w0.i();

    public void a(ArrayList arrayList) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            JSONObject jSONObject = new JSONObject();
            ArrayList b6 = ((i) arrayList.get(i6)).b();
            if (b6.contains("value")) {
                jSONObject.put("value", ((i) arrayList.get(i6)).e());
            }
            if (b6.contains("name")) {
                jSONObject.put("name", ((i) arrayList.get(i6)).d());
            }
            if (b6.contains("mode")) {
                String c6 = ((i) arrayList.get(i6)).c();
                if (c6.length() > 0 && c6.equals("UNIQUE")) {
                    jSONObject.put("mode", c6);
                }
            }
            if (!this.f9822b.f(jSONObject)) {
                throw new Exception("checkIndexesValidity: indexes[" + i6 + "] not valid");
            }
        }
    }

    public void b(ArrayList arrayList) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            JSONObject jSONObject = new JSONObject();
            ArrayList e6 = ((h) arrayList.get(i6)).e();
            if (e6.contains("column")) {
                jSONObject.put("column", ((h) arrayList.get(i6)).a());
            }
            if (e6.contains("value")) {
                jSONObject.put("value", ((h) arrayList.get(i6)).f());
            }
            if (e6.contains("foreignkey")) {
                jSONObject.put("foreignkey", ((h) arrayList.get(i6)).d());
            }
            if (e6.contains("constraint")) {
                jSONObject.put("constraint", ((h) arrayList.get(i6)).c());
            }
            if (!this.f9821a.g(jSONObject)) {
                throw new Exception("checkSchemaValidity: schema[" + i6 + "] not valid");
            }
        }
    }

    public void c(ArrayList arrayList) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            JSONObject jSONObject = new JSONObject();
            ArrayList b6 = ((l) arrayList.get(i6)).b();
            if (b6.contains("name")) {
                jSONObject.put("name", ((l) arrayList.get(i6)).d());
            }
            if (b6.contains("timeevent")) {
                jSONObject.put("timeevent", ((l) arrayList.get(i6)).e());
            }
            if (b6.contains("condition")) {
                jSONObject.put("condition", ((l) arrayList.get(i6)).a());
            }
            if (b6.contains("logic")) {
                jSONObject.put("logic", ((l) arrayList.get(i6)).c());
            }
            if (!this.f9823c.g(jSONObject)) {
                throw new Exception("checkTriggersValidity: triggers[" + i6 + "] not valid");
            }
        }
    }

    public String d(ArrayList arrayList, char c6) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(c6);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public ArrayList e(List list, int i6, ArrayList arrayList, ArrayList arrayList2) {
        Object valueOf;
        ArrayList arrayList3 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            String str = (String) arrayList.get(i7);
            if (!((j0) list.get(i6)).has(str)) {
                throw new Exception("CreateRowValues: value is not (string, nsnull,int64,double");
            }
            Object obj = ((j0) list.get(i6)).get(str);
            if (obj.toString().equals("null")) {
                valueOf = JSONObject.NULL;
            } else if (obj instanceof Long) {
                valueOf = Long.valueOf(((j0) list.get(i6)).getLong(str));
            } else if (obj instanceof String) {
                valueOf = ((j0) list.get(i6)).getString(str);
            } else if (obj instanceof Double) {
                valueOf = Double.valueOf(((j0) list.get(i6)).getDouble(str));
            }
            arrayList3.add(valueOf);
        }
        return arrayList3;
    }

    public ArrayList f(Object obj) {
        return obj instanceof ArrayList ? (ArrayList) obj : new ArrayList();
    }

    public ArrayList g(j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = j0Var.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        return arrayList;
    }

    public j0 h(w0.c cVar, String str) {
        j0 j0Var = new j0();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            List<j0> a6 = cVar.I("PRAGMA table_info('" + str + "');", new ArrayList()).a();
            if (a6.size() > 0) {
                for (j0 j0Var2 : a6) {
                    arrayList.add(j0Var2.getString("name"));
                    arrayList2.add(j0Var2.getString("type"));
                }
                j0Var.put("names", arrayList);
                j0Var.put("types", arrayList2);
            }
            return j0Var;
        } catch (JSONException e6) {
            throw new Exception("GetTableColumnNamesTypes: " + e6.getMessage());
        } catch (Exception e7) {
            throw new Exception("GetTableColumnNamesTypes: " + e7.getMessage());
        }
    }

    public ArrayList i(w0.c cVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                j0 h6 = h(cVar, str2);
                new ArrayList();
                new ArrayList();
                if (!h6.has("names")) {
                    throw new Exception("GetValues: Table " + str2 + " no names");
                }
                ArrayList f6 = f(h6.get("names"));
                if (!h6.has("types")) {
                    throw new Exception("GetValues: Table " + str2 + " no types");
                }
                ArrayList f7 = f(h6.get("types"));
                List a6 = cVar.I(str, new ArrayList()).a();
                if (a6.size() > 0) {
                    for (int i6 = 0; i6 < a6.size(); i6++) {
                        arrayList.add(e(a6, i6, f6, f7));
                    }
                }
                return arrayList;
            } catch (Exception e6) {
                throw new Exception("GetValues: " + e6.getMessage());
            }
        } catch (Throwable unused) {
            return arrayList;
        }
    }

    public boolean j(w0.c cVar) {
        if (!cVar.z().booleanValue()) {
            throw new Exception("isLastModified: Database not opened");
        }
        try {
            for (String str : this.f9825e.g(cVar)) {
                j0 h6 = h(cVar, str);
                new ArrayList();
                if (!h6.has("names")) {
                    throw new Exception("isLastModified: Table " + str + " no names");
                }
                ArrayList f6 = f(h6.get("names"));
                if (f6.size() > 0 && f6.contains("last_modified")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e6) {
            throw new Exception("isLastModified: " + e6.getMessage());
        }
    }

    public boolean k(w0.c cVar) {
        if (!cVar.z().booleanValue()) {
            throw new Exception("isSqlDeleted: Database not opened");
        }
        try {
            for (String str : this.f9825e.g(cVar)) {
                j0 h6 = h(cVar, str);
                new ArrayList();
                if (!h6.has("names")) {
                    throw new Exception("isSqlDeleted: Table " + str + " no names");
                }
                if (f(h6.get("names")).contains("sql_deleted")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e6) {
            throw new Exception("isSqlDeleted: " + e6.getMessage());
        }
    }

    public boolean l(w0.c cVar, String str) {
        StringBuilder sb = new StringBuilder("SELECT name FROM sqlite_master WHERE type='table' AND name='");
        sb.append(str);
        sb.append("';");
        try {
            return cVar.I(sb.toString(), new ArrayList()).length() > 0;
        } catch (Exception e6) {
            throw new Exception("isTableExists: " + e6.getMessage());
        }
    }
}
