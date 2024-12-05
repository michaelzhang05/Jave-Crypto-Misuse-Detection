package K0;

import L0.F;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final U0.a f5028a = new W0.d().j(a.f4982a).i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static i b(String str, String str2, String str3, String str4, long j8) {
        return new b(str, str2, i(str3), str4, j8);
    }

    private static String i(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0097e h() {
        return F.e.d.AbstractC0097e.a().d(F.e.d.AbstractC0097e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
