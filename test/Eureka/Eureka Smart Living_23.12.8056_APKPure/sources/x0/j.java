package x0;

import android.util.Log;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: h, reason: collision with root package name */
    private static final List f9799h = new ArrayList(Arrays.asList("database", "version", "overwrite", "encrypted", "mode", "tables", "views"));

    /* renamed from: a, reason: collision with root package name */
    private String f9800a = "";

    /* renamed from: b, reason: collision with root package name */
    private Integer f9801b = 1;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f9802c = Boolean.FALSE;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f9803d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f9804e = "";

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f9805f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f9806g = new ArrayList();

    public String a() {
        return this.f9800a;
    }

    public Boolean b() {
        return this.f9803d;
    }

    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        if (a().length() > 0) {
            arrayList.add("database");
        }
        if (h() != null) {
            arrayList.add("version");
        }
        if (e() != null) {
            arrayList.add("overwrite");
        }
        if (b() != null) {
            arrayList.add("encrypted");
        }
        if (d().length() > 0) {
            arrayList.add("mode");
        }
        if (f().size() > 0) {
            arrayList.add("tables");
        }
        if (i().size() > 0) {
            arrayList.add("views");
        }
        return arrayList;
    }

    public String d() {
        return this.f9804e;
    }

    public Boolean e() {
        return this.f9802c;
    }

    public ArrayList f() {
        return this.f9805f;
    }

    public g0 g() {
        g0 g0Var = new g0();
        Iterator it = this.f9805f.iterator();
        while (it.hasNext()) {
            g0Var.put(((k) it.next()).e());
        }
        return g0Var;
    }

    public Integer h() {
        return this.f9801b;
    }

    public ArrayList i() {
        return this.f9806g;
    }

    public g0 j() {
        g0 g0Var = new g0();
        Iterator it = this.f9806g.iterator();
        while (it.hasNext()) {
            g0Var.put(((m) it.next()).c());
        }
        return g0Var;
    }

    public boolean k(j0 j0Var, Boolean bool) {
        if (j0Var == null || j0Var.length() == 0) {
            return false;
        }
        Iterator<String> keys = j0Var.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9799h.contains(next)) {
                return false;
            }
            try {
                Object obj = j0Var.get(next);
                if (next.equals("database")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9800a = (String) obj;
                } else if (next.equals("version")) {
                    if (!(obj instanceof Integer)) {
                        return false;
                    }
                    this.f9801b = (Integer) obj;
                } else if (next.equals("overwrite")) {
                    if (!(obj instanceof Boolean)) {
                        return false;
                    }
                    this.f9802c = j0Var.b(next);
                } else if (next.equals("encrypted")) {
                    if (!(obj instanceof Boolean)) {
                        return false;
                    }
                    Boolean b6 = j0Var.b(next);
                    this.f9803d = b6;
                    if (b6.booleanValue() && !bool.booleanValue()) {
                        return false;
                    }
                } else if (next.equals("mode")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9804e = j0Var.getString(next);
                } else if (next.equals("tables")) {
                    if (!(obj instanceof JSONArray)) {
                        Log.d("JsonSQLite", "value: not instance of JSONArray 1");
                        return false;
                    }
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = j0Var.getJSONArray(next);
                        this.f9805f = new ArrayList();
                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                            k kVar = new k();
                            if (!kVar.h(jSONArray.getJSONObject(i6))) {
                                return false;
                            }
                            this.f9805f.add(kVar);
                        }
                    } else {
                        Log.d("JsonSQLite", "value: not instance of JSONArray 2");
                    }
                } else if (!next.equals("views")) {
                    continue;
                } else {
                    if (!(obj instanceof JSONArray)) {
                        Log.d("JsonSQLite", "value: not instance of JSONArray");
                        return false;
                    }
                    JSONArray jSONArray2 = j0Var.getJSONArray(next);
                    this.f9806g = new ArrayList();
                    for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                        m mVar = new m();
                        if (!mVar.d(jSONArray2.getJSONObject(i7))) {
                            return false;
                        }
                        this.f9806g.add(mVar);
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void l(String str) {
        this.f9800a = str;
    }

    public void m(Boolean bool) {
        this.f9803d = bool;
    }

    public void n(String str) {
        this.f9804e = str;
    }

    public void o(ArrayList arrayList) {
        this.f9805f = arrayList;
    }

    public void p(Integer num) {
        this.f9801b = num;
    }

    public void q(ArrayList arrayList) {
        this.f9806g = arrayList;
    }
}
