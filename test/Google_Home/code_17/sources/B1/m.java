package B1;

import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f776a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f777b;

    /* renamed from: c, reason: collision with root package name */
    private final String f778c;

    private m(String str, URL url, String str2) {
        this.f776a = str;
        this.f777b = url;
        this.f778c = str2;
    }

    public static m a(String str, URL url, String str2) {
        H1.g.f(str, "VendorKey is null or empty");
        H1.g.d(url, "ResourceURL is null");
        H1.g.f(str2, "VerificationParameters is null or empty");
        return new m(str, url, str2);
    }

    public static m b(URL url) {
        H1.g.d(url, "ResourceURL is null");
        return new m(null, url, null);
    }

    public URL c() {
        return this.f777b;
    }

    public String d() {
        return this.f776a;
    }

    public String e() {
        return this.f778c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        H1.c.i(jSONObject, "vendorKey", this.f776a);
        H1.c.i(jSONObject, "resourceUrl", this.f777b.toString());
        H1.c.i(jSONObject, "verificationParameters", this.f778c);
        return jSONObject;
    }
}
