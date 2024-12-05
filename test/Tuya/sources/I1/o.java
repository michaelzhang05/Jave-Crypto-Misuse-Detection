package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f31516a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31517b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31518c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31519d;

    public o(String sessionId, String firstSessionId, int i8, long j8) {
        AbstractC3159y.i(sessionId, "sessionId");
        AbstractC3159y.i(firstSessionId, "firstSessionId");
        this.f31516a = sessionId;
        this.f31517b = firstSessionId;
        this.f31518c = i8;
        this.f31519d = j8;
    }

    public final String a() {
        return this.f31517b;
    }

    public final String b() {
        return this.f31516a;
    }

    public final int c() {
        return this.f31518c;
    }

    public final long d() {
        return this.f31519d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f31516a, oVar.f31516a) && AbstractC3159y.d(this.f31517b, oVar.f31517b) && this.f31518c == oVar.f31518c && this.f31519d == oVar.f31519d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f31516a.hashCode() * 31) + this.f31517b.hashCode()) * 31) + this.f31518c) * 31) + androidx.collection.a.a(this.f31519d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f31516a + ", firstSessionId=" + this.f31517b + ", sessionIndex=" + this.f31518c + ", sessionStartTimestampUs=" + this.f31519d + ')';
    }
}
