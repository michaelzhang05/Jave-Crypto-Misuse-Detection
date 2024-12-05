package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    private static final List f9807f = new ArrayList(Arrays.asList("name", "schema", "indexes", "triggers", "values"));

    /* renamed from: a, reason: collision with root package name */
    private String f9808a = "";

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f9809b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f9810c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f9811d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f9812e = new ArrayList();

    public ArrayList a() {
        return this.f9810c;
    }

    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (c().length() > 0) {
            arrayList.add("names");
        }
        if (d().size() > 0) {
            arrayList.add("schema");
        }
        if (a().size() > 0) {
            arrayList.add("indexes");
        }
        if (f().size() > 0) {
            arrayList.add("triggers");
        }
        if (g().size() > 0) {
            arrayList.add("values");
        }
        return arrayList;
    }

    public String c() {
        return this.f9808a;
    }

    public ArrayList d() {
        return this.f9809b;
    }

    public j0 e() {
        j0 j0Var = new j0();
        j0Var.m("name", c());
        JSONArray jSONArray = new JSONArray();
        if (this.f9809b.size() > 0) {
            Iterator it = this.f9809b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((h) it.next()).b());
            }
            j0Var.put("schema", jSONArray);
        }
        JSONArray jSONArray2 = new JSONArray();
        if (this.f9810c.size() > 0) {
            Iterator it2 = this.f9810c.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((i) it2.next()).a());
            }
            j0Var.put("indexes", jSONArray2);
        }
        JSONArray jSONArray3 = new JSONArray();
        if (this.f9811d.size() > 0) {
            Iterator it3 = this.f9811d.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(((l) it3.next()).f());
            }
            j0Var.put("triggers", jSONArray3);
        }
        JSONArray jSONArray4 = new JSONArray();
        if (this.f9812e.size() > 0) {
            Iterator it4 = this.f9812e.iterator();
            while (it4.hasNext()) {
                ArrayList arrayList = (ArrayList) it4.next();
                JSONArray jSONArray5 = new JSONArray();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (next instanceof String) {
                        next = next.toString();
                    }
                    jSONArray5.put(next);
                }
                jSONArray4.put(jSONArray5);
            }
            j0Var.put("values", jSONArray4);
        }
        return j0Var;
    }

    public ArrayList f() {
        return this.f9811d;
    }

    public ArrayList g() {
        return this.f9812e;
    }

    public boolean h(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        int i6 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9807f.contains(next)) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("name")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9808a = (String) obj;
                }
                if (next.equals("schema")) {
                    if (!(obj instanceof JSONArray) && !(obj instanceof ArrayList)) {
                        return false;
                    }
                    this.f9809b = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    int i7 = 0;
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        h hVar = new h();
                        boolean g6 = hVar.g(jSONArray.getJSONObject(i8));
                        if (hVar.a() != null) {
                            i7++;
                        }
                        if (!g6) {
                            return false;
                        }
                        this.f9809b.add(hVar);
                    }
                    i6 = i7;
                }
                if (next.equals("indexes")) {
                    if (!(obj instanceof JSONArray) && !(obj instanceof ArrayList)) {
                        return false;
                    }
                    this.f9810c = new ArrayList();
                    JSONArray jSONArray2 = jSONObject.getJSONArray(next);
                    for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                        i iVar = new i();
                        if (!iVar.f(jSONArray2.getJSONObject(i9))) {
                            return false;
                        }
                        this.f9810c.add(iVar);
                    }
                }
                if (next.equals("triggers")) {
                    if (!(obj instanceof JSONArray) && !(obj instanceof ArrayList)) {
                        return false;
                    }
                    this.f9811d = new ArrayList();
                    JSONArray jSONArray3 = jSONObject.getJSONArray(next);
                    for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                        l lVar = new l();
                        if (!lVar.g(jSONArray3.getJSONObject(i10))) {
                            return false;
                        }
                        this.f9811d.add(lVar);
                    }
                }
                if (next.equals("values")) {
                    if (!(obj instanceof JSONArray) && !(obj instanceof ArrayList)) {
                        return false;
                    }
                    this.f9812e = new ArrayList();
                    JSONArray jSONArray4 = jSONObject.getJSONArray(next);
                    for (int i11 = 0; i11 < jSONArray4.length(); i11++) {
                        JSONArray jSONArray5 = jSONArray4.getJSONArray(i11);
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < jSONArray5.length(); i12++) {
                            if (i6 > 0 && jSONArray5.length() != i6) {
                                return false;
                            }
                            arrayList.add(jSONArray5.get(i12));
                        }
                        this.f9812e.add(arrayList);
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void i(ArrayList arrayList) {
        this.f9810c = arrayList;
    }

    public void j(String str) {
        this.f9808a = str;
    }

    public void k(ArrayList arrayList) {
        this.f9809b = arrayList;
    }

    public void l(ArrayList arrayList) {
        this.f9811d = arrayList;
    }

    public void m(ArrayList arrayList) {
        this.f9812e = arrayList;
    }
}
