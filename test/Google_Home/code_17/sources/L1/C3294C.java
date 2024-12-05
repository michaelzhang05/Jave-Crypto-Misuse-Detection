package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l1.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3294C {

    /* renamed from: a, reason: collision with root package name */
    private final String f34244a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34245b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34246c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34247d;

    /* renamed from: e, reason: collision with root package name */
    private final C3302e f34248e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34249f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34250g;

    public C3294C(String sessionId, String firstSessionId, int i8, long j8, C3302e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC3255y.i(sessionId, "sessionId");
        AbstractC3255y.i(firstSessionId, "firstSessionId");
        AbstractC3255y.i(dataCollectionStatus, "dataCollectionStatus");
        AbstractC3255y.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC3255y.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f34244a = sessionId;
        this.f34245b = firstSessionId;
        this.f34246c = i8;
        this.f34247d = j8;
        this.f34248e = dataCollectionStatus;
        this.f34249f = firebaseInstallationId;
        this.f34250g = firebaseAuthenticationToken;
    }

    public final C3302e a() {
        return this.f34248e;
    }

    public final long b() {
        return this.f34247d;
    }

    public final String c() {
        return this.f34250g;
    }

    public final String d() {
        return this.f34249f;
    }

    public final String e() {
        return this.f34245b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3294C)) {
            return false;
        }
        C3294C c3294c = (C3294C) obj;
        if (AbstractC3255y.d(this.f34244a, c3294c.f34244a) && AbstractC3255y.d(this.f34245b, c3294c.f34245b) && this.f34246c == c3294c.f34246c && this.f34247d == c3294c.f34247d && AbstractC3255y.d(this.f34248e, c3294c.f34248e) && AbstractC3255y.d(this.f34249f, c3294c.f34249f) && AbstractC3255y.d(this.f34250g, c3294c.f34250g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34244a;
    }

    public final int g() {
        return this.f34246c;
    }

    public int hashCode() {
        return (((((((((((this.f34244a.hashCode() * 31) + this.f34245b.hashCode()) * 31) + this.f34246c) * 31) + androidx.collection.a.a(this.f34247d)) * 31) + this.f34248e.hashCode()) * 31) + this.f34249f.hashCode()) * 31) + this.f34250g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f34244a + ", firstSessionId=" + this.f34245b + ", sessionIndex=" + this.f34246c + ", eventTimestampUs=" + this.f34247d + ", dataCollectionStatus=" + this.f34248e + ", firebaseInstallationId=" + this.f34249f + ", firebaseAuthenticationToken=" + this.f34250g + ')';
    }
}
