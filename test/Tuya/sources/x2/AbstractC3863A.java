package x2;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C3781b;

/* renamed from: x2.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3863A {
    public static final JSONObject a(C3870H c3870h) {
        String str;
        AbstractC3159y.i(c3870h, "<this>");
        String str2 = (String) c3870h.a();
        if (str2 != null) {
            try {
                return new JSONObject(str2);
            } catch (JSONException e8) {
                int b8 = c3870h.b();
                z d8 = c3870h.d();
                List c8 = c3870h.c("Content-Type");
                if (c8 != null) {
                    str = (String) AbstractC1246t.o0(c8);
                } else {
                    str = null;
                }
                throw new C3781b(null, null, 0, g6.n.e("\n                    Exception while parsing response body.\n                      Status code: " + b8 + "\n                      Request-Id: " + d8 + "\n                      Content-Type: " + str + "\n                      Body: \"" + str2 + "\"\n                "), e8, 7, null);
            }
        }
        return new JSONObject();
    }
}
