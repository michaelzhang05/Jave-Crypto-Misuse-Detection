package A0;

import Q.AbstractC1398n;
import Q.AbstractC1400p;
import Q.C1402s;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f91a;

    /* renamed from: b, reason: collision with root package name */
    private final String f92b;

    /* renamed from: c, reason: collision with root package name */
    private final String f93c;

    /* renamed from: d, reason: collision with root package name */
    private final String f94d;

    /* renamed from: e, reason: collision with root package name */
    private final String f95e;

    /* renamed from: f, reason: collision with root package name */
    private final String f96f;

    /* renamed from: g, reason: collision with root package name */
    private final String f97g;

    private o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1400p.p(!V.n.a(str), "ApplicationId must be set.");
        this.f92b = str;
        this.f91a = str2;
        this.f93c = str3;
        this.f94d = str4;
        this.f95e = str5;
        this.f96f = str6;
        this.f97g = str7;
    }

    public static o a(Context context) {
        C1402s c1402s = new C1402s(context);
        String a8 = c1402s.a("google_app_id");
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        return new o(a8, c1402s.a("google_api_key"), c1402s.a("firebase_database_url"), c1402s.a("ga_trackingId"), c1402s.a("gcm_defaultSenderId"), c1402s.a("google_storage_bucket"), c1402s.a("project_id"));
    }

    public String b() {
        return this.f91a;
    }

    public String c() {
        return this.f92b;
    }

    public String d() {
        return this.f95e;
    }

    public String e() {
        return this.f97g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!AbstractC1398n.a(this.f92b, oVar.f92b) || !AbstractC1398n.a(this.f91a, oVar.f91a) || !AbstractC1398n.a(this.f93c, oVar.f93c) || !AbstractC1398n.a(this.f94d, oVar.f94d) || !AbstractC1398n.a(this.f95e, oVar.f95e) || !AbstractC1398n.a(this.f96f, oVar.f96f) || !AbstractC1398n.a(this.f97g, oVar.f97g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1398n.b(this.f92b, this.f91a, this.f93c, this.f94d, this.f95e, this.f96f, this.f97g);
    }

    public String toString() {
        return AbstractC1398n.c(this).a("applicationId", this.f92b).a("apiKey", this.f91a).a("databaseUrl", this.f93c).a("gcmSenderId", this.f95e).a("storageBucket", this.f96f).a("projectId", this.f97g).toString();
    }
}
