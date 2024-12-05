package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    private static final List f9795d = new ArrayList(Arrays.asList("name", "value", "mode"));

    /* renamed from: a, reason: collision with root package name */
    private String f9796a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f9797b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f9798c = "";

    public j0 a() {
        j0 j0Var = new j0();
        j0Var.m("name", this.f9796a);
        j0Var.m("value", this.f9797b);
        if (this.f9798c.length() > 0) {
            j0Var.m("mode", this.f9798c);
        }
        return j0Var;
    }

    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (d().length() > 0) {
            arrayList.add("name");
        }
        if (e().length() > 0) {
            arrayList.add("value");
        }
        if (c().length() > 0 && c().equalsIgnoreCase("UNIQUE")) {
            arrayList.add("mode");
        }
        return arrayList;
    }

    public String c() {
        return this.f9798c;
    }

    public String d() {
        return this.f9796a;
    }

    public String e() {
        return this.f9797b;
    }

    public boolean f(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9795d.contains(next)) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("name")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9796a = (String) obj;
                }
                if (next.equals("value")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9797b = (String) obj;
                }
                if (next.equals("mode")) {
                    if ((obj instanceof String) && ((String) obj).equalsIgnoreCase("UNIQUE")) {
                        this.f9798c = (String) obj;
                    }
                    return false;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void g(String str) {
        if (str.equalsIgnoreCase("UNIQUE")) {
            this.f9798c = str.toUpperCase();
        }
    }

    public void h(String str) {
        this.f9796a = str;
    }

    public void i(String str) {
        this.f9797b = str;
    }
}
