package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f34395a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34396b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34397c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34398d;

    public y(String sessionId, String firstSessionId, int i8, long j8) {
        AbstractC3255y.i(sessionId, "sessionId");
        AbstractC3255y.i(firstSessionId, "firstSessionId");
        this.f34395a = sessionId;
        this.f34396b = firstSessionId;
        this.f34397c = i8;
        this.f34398d = j8;
    }

    public final String a() {
        return this.f34396b;
    }

    public final String b() {
        return this.f34395a;
    }

    public final int c() {
        return this.f34397c;
    }

    public final long d() {
        return this.f34398d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (AbstractC3255y.d(this.f34395a, yVar.f34395a) && AbstractC3255y.d(this.f34396b, yVar.f34396b) && this.f34397c == yVar.f34397c && this.f34398d == yVar.f34398d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f34395a.hashCode() * 31) + this.f34396b.hashCode()) * 31) + this.f34397c) * 31) + androidx.collection.a.a(this.f34398d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f34395a + ", firstSessionId=" + this.f34396b + ", sessionIndex=" + this.f34397c + ", sessionStartTimestampUs=" + this.f34398d + ')';
    }
}
