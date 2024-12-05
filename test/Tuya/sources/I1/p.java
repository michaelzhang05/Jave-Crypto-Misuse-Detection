package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final i f31520a;

    /* renamed from: b, reason: collision with root package name */
    private final s f31521b;

    /* renamed from: c, reason: collision with root package name */
    private final C2768b f31522c;

    public p(i eventType, s sessionData, C2768b applicationInfo) {
        AbstractC3159y.i(eventType, "eventType");
        AbstractC3159y.i(sessionData, "sessionData");
        AbstractC3159y.i(applicationInfo, "applicationInfo");
        this.f31520a = eventType;
        this.f31521b = sessionData;
        this.f31522c = applicationInfo;
    }

    public final C2768b a() {
        return this.f31522c;
    }

    public final i b() {
        return this.f31520a;
    }

    public final s c() {
        return this.f31521b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f31520a == pVar.f31520a && AbstractC3159y.d(this.f31521b, pVar.f31521b) && AbstractC3159y.d(this.f31522c, pVar.f31522c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31520a.hashCode() * 31) + this.f31521b.hashCode()) * 31) + this.f31522c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f31520a + ", sessionData=" + this.f31521b + ", applicationInfo=" + this.f31522c + ')';
    }
}
