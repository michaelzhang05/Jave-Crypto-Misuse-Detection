package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3302e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3301d f34326a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3301d f34327b;

    /* renamed from: c, reason: collision with root package name */
    private final double f34328c;

    public C3302e(EnumC3301d performance, EnumC3301d crashlytics, double d8) {
        AbstractC3255y.i(performance, "performance");
        AbstractC3255y.i(crashlytics, "crashlytics");
        this.f34326a = performance;
        this.f34327b = crashlytics;
        this.f34328c = d8;
    }

    public final EnumC3301d a() {
        return this.f34327b;
    }

    public final EnumC3301d b() {
        return this.f34326a;
    }

    public final double c() {
        return this.f34328c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3302e)) {
            return false;
        }
        C3302e c3302e = (C3302e) obj;
        if (this.f34326a == c3302e.f34326a && this.f34327b == c3302e.f34327b && Double.compare(this.f34328c, c3302e.f34328c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34326a.hashCode() * 31) + this.f34327b.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f34328c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f34326a + ", crashlytics=" + this.f34327b + ", sessionSamplingRate=" + this.f34328c + ')';
    }
}
