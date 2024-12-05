package E2;

import b3.C1970d;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f2304a;

    /* renamed from: b, reason: collision with root package name */
    private final C1970d f2305b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2306c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2307d;

    /* renamed from: e, reason: collision with root package name */
    private final B3.f f2308e;

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f2309f;

    public d(a config, C1970d paymentMethodMetadata, List customerPaymentMethods, List supportedPaymentMethods, B3.f fVar, Throwable th) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(customerPaymentMethods, "customerPaymentMethods");
        AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
        this.f2304a = config;
        this.f2305b = paymentMethodMetadata;
        this.f2306c = customerPaymentMethods;
        this.f2307d = supportedPaymentMethods;
        this.f2308e = fVar;
        this.f2309f = th;
    }

    public final List a() {
        return this.f2306c;
    }

    public final C1970d b() {
        return this.f2305b;
    }

    public final B3.f c() {
        return this.f2308e;
    }

    public final List d() {
        return this.f2307d;
    }

    public final Throwable e() {
        return this.f2309f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f2304a, dVar.f2304a) && AbstractC3255y.d(this.f2305b, dVar.f2305b) && AbstractC3255y.d(this.f2306c, dVar.f2306c) && AbstractC3255y.d(this.f2307d, dVar.f2307d) && AbstractC3255y.d(this.f2308e, dVar.f2308e) && AbstractC3255y.d(this.f2309f, dVar.f2309f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f2304a.hashCode() * 31) + this.f2305b.hashCode()) * 31) + this.f2306c.hashCode()) * 31) + this.f2307d.hashCode()) * 31;
        B3.f fVar = this.f2308e;
        int i8 = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        Throwable th = this.f2309f;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Full(config=" + this.f2304a + ", paymentMethodMetadata=" + this.f2305b + ", customerPaymentMethods=" + this.f2306c + ", supportedPaymentMethods=" + this.f2307d + ", paymentSelection=" + this.f2308e + ", validationError=" + this.f2309f + ")";
    }
}
