package p5;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f8890a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f8891b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f8892c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f8893d = null;

    public void a(long j6) {
        this.f8890a = j6;
    }

    public void b(String str) {
        this.f8892c = str;
    }

    public void c(int i6) {
        this.f8891b = i6;
    }

    public JSONObject d() {
        return new JSONObject("{bytesSent:" + this.f8890a + ",responseCode:" + this.f8891b + ",response:" + JSONObject.quote(this.f8892c) + ",objectId:" + JSONObject.quote(this.f8893d) + "}");
    }
}
