package x0;

import com.getcapacitor.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final List f9818c = new ArrayList(Arrays.asList("name", "value"));

    /* renamed from: a, reason: collision with root package name */
    private String f9819a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f9820b = "";

    public String a() {
        return this.f9819a;
    }

    public String b() {
        return this.f9820b;
    }

    public j0 c() {
        j0 j0Var = new j0();
        j0Var.m("name", this.f9819a);
        j0Var.m("value", this.f9820b);
        return j0Var;
    }

    public boolean d(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f9818c.contains(next)) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("name")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9819a = (String) obj;
                }
                if (next.equals("value")) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    this.f9820b = (String) obj;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public void e(String str) {
        this.f9819a = str;
    }

    public void f(String str) {
        this.f9820b = str;
    }
}
