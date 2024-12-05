package i1;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2771e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2770d f31473a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2770d f31474b;

    /* renamed from: c, reason: collision with root package name */
    private final double f31475c;

    public C2771e(EnumC2770d performance, EnumC2770d crashlytics, double d8) {
        AbstractC3159y.i(performance, "performance");
        AbstractC3159y.i(crashlytics, "crashlytics");
        this.f31473a = performance;
        this.f31474b = crashlytics;
        this.f31475c = d8;
    }

    public final EnumC2770d a() {
        return this.f31474b;
    }

    public final EnumC2770d b() {
        return this.f31473a;
    }

    public final double c() {
        return this.f31475c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771e)) {
            return false;
        }
        C2771e c2771e = (C2771e) obj;
        if (this.f31473a == c2771e.f31473a && this.f31474b == c2771e.f31474b && AbstractC3159y.d(Double.valueOf(this.f31475c), Double.valueOf(c2771e.f31475c))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31473a.hashCode() * 31) + this.f31474b.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f31475c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f31473a + ", crashlytics=" + this.f31474b + ", sessionSamplingRate=" + this.f31475c + ')';
    }

    public /* synthetic */ C2771e(EnumC2770d enumC2770d, EnumC2770d enumC2770d2, double d8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? EnumC2770d.COLLECTION_SDK_NOT_INSTALLED : enumC2770d, (i8 & 2) != 0 ? EnumC2770d.COLLECTION_SDK_NOT_INSTALLED : enumC2770d2, (i8 & 4) != 0 ? 1.0d : d8);
    }
}
