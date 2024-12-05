package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    private static final List f9790e = new ArrayList(Arrays.asList("column", "value", "foreignkey", "constraint"));

    /* renamed from: a, reason: collision with root package name */
    private String f9791a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f9792b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f9793c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f9794d = null;

    public String a() {
        return this.f9791a;
    }

    public j0 b() {
        j0 j0Var = new j0();
        String str = this.f9791a;
        if (str != null) {
            j0Var.m("column", str);
        }
        j0Var.m("value", this.f9792b);
        String str2 = this.f9793c;
        if (str2 != null) {
            j0Var.m("foreignkey", str2);
        }
        String str3 = this.f9794d;
        if (str3 != null) {
            j0Var.m("constraint", str3);
        }
        return j0Var;
    }

    public String c() {
        return this.f9794d;
    }

    public String d() {
        return this.f9793c;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        if (a() != null && a().length() > 0) {
            arrayList.add("column");
        }
        if (f() != null && f().length() > 0) {
            arrayList.add("value");
        }
        if (d() != null && d().length() > 0) {
            arrayList.add("foreignkey");
        }
        if (c() != null && c().length() > 0) {
            arrayList.add("constraint");
        }
        return arrayList;
    }

    public String f() {
        return this.f9792b;
    }

    public boolean g(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9790e.contains(next)) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("column")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9791a = (String) obj;
                }
                if (next.equals("value")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9792b = (String) obj;
                }
                if (next.equals("foreignkey")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9793c = (String) obj;
                }
                if (next.equals("constraint")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9794d = (String) obj;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void h(String str) {
        this.f9791a = str;
    }

    public void i(String str) {
        this.f9794d = str;
    }

    public void j(String str) {
        this.f9793c = str;
    }

    public void k(String str) {
        this.f9792b = str;
    }
}
