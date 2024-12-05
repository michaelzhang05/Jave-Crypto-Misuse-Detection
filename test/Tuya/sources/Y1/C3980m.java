package y1;

import java.net.URL;
import org.json.JSONObject;

/* renamed from: y1.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3980m {

    /* renamed from: a, reason: collision with root package name */
    private final String f39732a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f39733b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39734c;

    private C3980m(String str, URL url, String str2) {
        this.f39732a = str;
        this.f39733b = url;
        this.f39734c = str2;
    }

    public static C3980m a(String str, URL url, String str2) {
        E1.g.d(str, "VendorKey is null or empty");
        E1.g.b(url, "ResourceURL is null");
        E1.g.d(str2, "VerificationParameters is null or empty");
        return new C3980m(str, url, str2);
    }

    public static C3980m b(URL url) {
        E1.g.b(url, "ResourceURL is null");
        return new C3980m(null, url, null);
    }

    public URL c() {
        return this.f39733b;
    }

    public String d() {
        return this.f39732a;
    }

    public String e() {
        return this.f39734c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, "vendorKey", this.f39732a);
        E1.c.h(jSONObject, "resourceUrl", this.f39733b.toString());
        E1.c.h(jSONObject, "verificationParameters", this.f39734c);
        return jSONObject;
    }
}
