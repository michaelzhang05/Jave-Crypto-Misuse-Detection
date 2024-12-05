package i1;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f31532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31533b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31534c;

    /* renamed from: d, reason: collision with root package name */
    private long f31535d;

    /* renamed from: e, reason: collision with root package name */
    private C2771e f31536e;

    /* renamed from: f, reason: collision with root package name */
    private String f31537f;

    public s(String sessionId, String firstSessionId, int i8, long j8, C2771e dataCollectionStatus, String firebaseInstallationId) {
        AbstractC3159y.i(sessionId, "sessionId");
        AbstractC3159y.i(firstSessionId, "firstSessionId");
        AbstractC3159y.i(dataCollectionStatus, "dataCollectionStatus");
        AbstractC3159y.i(firebaseInstallationId, "firebaseInstallationId");
        this.f31532a = sessionId;
        this.f31533b = firstSessionId;
        this.f31534c = i8;
        this.f31535d = j8;
        this.f31536e = dataCollectionStatus;
        this.f31537f = firebaseInstallationId;
    }

    public final C2771e a() {
        return this.f31536e;
    }

    public final long b() {
        return this.f31535d;
    }

    public final String c() {
        return this.f31537f;
    }

    public final String d() {
        return this.f31533b;
    }

    public final String e() {
        return this.f31532a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3159y.d(this.f31532a, sVar.f31532a) && AbstractC3159y.d(this.f31533b, sVar.f31533b) && this.f31534c == sVar.f31534c && this.f31535d == sVar.f31535d && AbstractC3159y.d(this.f31536e, sVar.f31536e) && AbstractC3159y.d(this.f31537f, sVar.f31537f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f31534c;
    }

    public final void g(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f31537f = str;
    }

    public int hashCode() {
        return (((((((((this.f31532a.hashCode() * 31) + this.f31533b.hashCode()) * 31) + this.f31534c) * 31) + androidx.collection.a.a(this.f31535d)) * 31) + this.f31536e.hashCode()) * 31) + this.f31537f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f31532a + ", firstSessionId=" + this.f31533b + ", sessionIndex=" + this.f31534c + ", eventTimestampUs=" + this.f31535d + ", dataCollectionStatus=" + this.f31536e + ", firebaseInstallationId=" + this.f31537f + ')';
    }

    public /* synthetic */ s(String str, String str2, int i8, long j8, C2771e c2771e, String str3, int i9, AbstractC3151p abstractC3151p) {
        this(str, str2, i8, j8, (i9 & 16) != 0 ? new C2771e(null, null, 0.0d, 7, null) : c2771e, (i9 & 32) != 0 ? "" : str3);
    }
}
