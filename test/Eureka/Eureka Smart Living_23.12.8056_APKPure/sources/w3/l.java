package w3;

import android.content.Context;
import android.text.TextUtils;
import v1.n;
import v1.q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f9766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9767b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9768c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9769d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9770e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9771f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9772g;

    private l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        n.k(!z1.k.a(str), "ApplicationId must be set.");
        this.f9767b = str;
        this.f9766a = str2;
        this.f9768c = str3;
        this.f9769d = str4;
        this.f9770e = str5;
        this.f9771f = str6;
        this.f9772g = str7;
    }

    public static l a(Context context) {
        q qVar = new q(context);
        String a6 = qVar.a("google_app_id");
        if (TextUtils.isEmpty(a6)) {
            return null;
        }
        return new l(a6, qVar.a("google_api_key"), qVar.a("firebase_database_url"), qVar.a("ga_trackingId"), qVar.a("gcm_defaultSenderId"), qVar.a("google_storage_bucket"), qVar.a("project_id"));
    }

    public String b() {
        return this.f9766a;
    }

    public String c() {
        return this.f9767b;
    }

    public String d() {
        return this.f9770e;
    }

    public String e() {
        return this.f9772g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return v1.m.a(this.f9767b, lVar.f9767b) && v1.m.a(this.f9766a, lVar.f9766a) && v1.m.a(this.f9768c, lVar.f9768c) && v1.m.a(this.f9769d, lVar.f9769d) && v1.m.a(this.f9770e, lVar.f9770e) && v1.m.a(this.f9771f, lVar.f9771f) && v1.m.a(this.f9772g, lVar.f9772g);
    }

    public int hashCode() {
        return v1.m.b(this.f9767b, this.f9766a, this.f9768c, this.f9769d, this.f9770e, this.f9771f, this.f9772g);
    }

    public String toString() {
        return v1.m.c(this).a("applicationId", this.f9767b).a("apiKey", this.f9766a).a("databaseUrl", this.f9768c).a("gcmSenderId", this.f9770e).a("storageBucket", this.f9771f).a("projectId", this.f9772g).toString();
    }
}
