package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    private static final List f9813e = new ArrayList(Arrays.asList("name", "timeevent", "condition", "logic"));

    /* renamed from: a, reason: collision with root package name */
    private String f9814a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f9815b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f9816c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f9817d = null;

    public String a() {
        return this.f9816c;
    }

    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (d() != null && d().length() > 0) {
            arrayList.add("name");
        }
        if (e() != null && e().length() > 0) {
            arrayList.add("timeevent");
        }
        if (a() != null && a().length() > 0) {
            arrayList.add("condition");
        }
        if (c() != null && c().length() > 0) {
            arrayList.add("logic");
        }
        return arrayList;
    }

    public String c() {
        return this.f9817d;
    }

    public String d() {
        return this.f9814a;
    }

    public String e() {
        return this.f9815b;
    }

    public j0 f() {
        j0 j0Var = new j0();
        j0Var.m("name", this.f9814a);
        j0Var.m("timeevent", this.f9815b);
        String str = this.f9816c;
        if (str != null) {
            j0Var.m("condition", str);
        }
        j0Var.m("logic", this.f9817d);
        return j0Var;
    }

    public boolean g(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9813e.contains(next)) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("name")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9814a = (String) obj;
                }
                if (next.equals("timeevent")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9815b = (String) obj;
                }
                if (next.equals("condition")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9816c = (String) obj;
                }
                if (next.equals("logic")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9817d = (String) obj;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void h(String str) {
        this.f9816c = str;
    }

    public void i(String str) {
        this.f9817d = str;
    }

    public void j(String str) {
        this.f9814a = str;
    }

    public void k(String str) {
        this.f9815b = str;
    }
}
