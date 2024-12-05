package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3306i f34399a;

    /* renamed from: b, reason: collision with root package name */
    private final C3294C f34400b;

    /* renamed from: c, reason: collision with root package name */
    private final C3299b f34401c;

    public z(EnumC3306i eventType, C3294C sessionData, C3299b applicationInfo) {
        AbstractC3255y.i(eventType, "eventType");
        AbstractC3255y.i(sessionData, "sessionData");
        AbstractC3255y.i(applicationInfo, "applicationInfo");
        this.f34399a = eventType;
        this.f34400b = sessionData;
        this.f34401c = applicationInfo;
    }

    public final C3299b a() {
        return this.f34401c;
    }

    public final EnumC3306i b() {
        return this.f34399a;
    }

    public final C3294C c() {
        return this.f34400b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f34399a == zVar.f34399a && AbstractC3255y.d(this.f34400b, zVar.f34400b) && AbstractC3255y.d(this.f34401c, zVar.f34401c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34399a.hashCode() * 31) + this.f34400b.hashCode()) * 31) + this.f34401c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f34399a + ", sessionData=" + this.f34400b + ", applicationInfo=" + this.f34401c + ')';
    }
}
