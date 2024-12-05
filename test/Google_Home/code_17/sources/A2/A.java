package A2;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C4135b;

/* loaded from: classes4.dex */
public abstract class A {
    public static final JSONObject a(H h8) {
        String str;
        AbstractC3255y.i(h8, "<this>");
        String str2 = (String) h8.a();
        if (str2 != null) {
            try {
                return new JSONObject(str2);
            } catch (JSONException e8) {
                int b8 = h8.b();
                z d8 = h8.d();
                List c8 = h8.c("Content-Type");
                if (c8 != null) {
                    str = (String) AbstractC1378t.o0(c8);
                } else {
                    str = null;
                }
                throw new C4135b(null, null, 0, j6.n.e("\n                    Exception while parsing response body.\n                      Status code: " + b8 + "\n                      Request-Id: " + d8 + "\n                      Content-Type: " + str + "\n                      Body: \"" + str2 + "\"\n                "), e8, 7, null);
            }
        }
        return new JSONObject();
    }
}
