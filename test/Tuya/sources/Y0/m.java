package y0;

import R.AbstractC1317n;
import R.AbstractC1319p;
import R.C1321s;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f39669a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39670b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39671c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39672d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39673e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39674f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39675g;

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1319p.p(!W.n.a(str), "ApplicationId must be set.");
        this.f39670b = str;
        this.f39669a = str2;
        this.f39671c = str3;
        this.f39672d = str4;
        this.f39673e = str5;
        this.f39674f = str6;
        this.f39675g = str7;
    }

    public static m a(Context context) {
        C1321s c1321s = new C1321s(context);
        String a8 = c1321s.a("google_app_id");
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        return new m(a8, c1321s.a("google_api_key"), c1321s.a("firebase_database_url"), c1321s.a("ga_trackingId"), c1321s.a("gcm_defaultSenderId"), c1321s.a("google_storage_bucket"), c1321s.a("project_id"));
    }

    public String b() {
        return this.f39669a;
    }

    public String c() {
        return this.f39670b;
    }

    public String d() {
        return this.f39673e;
    }

    public String e() {
        return this.f39675g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!AbstractC1317n.a(this.f39670b, mVar.f39670b) || !AbstractC1317n.a(this.f39669a, mVar.f39669a) || !AbstractC1317n.a(this.f39671c, mVar.f39671c) || !AbstractC1317n.a(this.f39672d, mVar.f39672d) || !AbstractC1317n.a(this.f39673e, mVar.f39673e) || !AbstractC1317n.a(this.f39674f, mVar.f39674f) || !AbstractC1317n.a(this.f39675g, mVar.f39675g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1317n.b(this.f39670b, this.f39669a, this.f39671c, this.f39672d, this.f39673e, this.f39674f, this.f39675g);
    }

    public String toString() {
        return AbstractC1317n.c(this).a("applicationId", this.f39670b).a("apiKey", this.f39669a).a("databaseUrl", this.f39671c).a("gcmSenderId", this.f39673e).a("storageBucket", this.f39674f).a("projectId", this.f39675g).toString();
    }
}
