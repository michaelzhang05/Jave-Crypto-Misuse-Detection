package B2;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f709a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2.d f710b;

    /* renamed from: c, reason: collision with root package name */
    private final List f711c;

    /* renamed from: d, reason: collision with root package name */
    private final List f712d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3991f f713e;

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f714f;

    public d(a config, Y2.d paymentMethodMetadata, List customerPaymentMethods, List supportedPaymentMethods, AbstractC3991f abstractC3991f, Throwable th) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(customerPaymentMethods, "customerPaymentMethods");
        AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
        this.f709a = config;
        this.f710b = paymentMethodMetadata;
        this.f711c = customerPaymentMethods;
        this.f712d = supportedPaymentMethods;
        this.f713e = abstractC3991f;
        this.f714f = th;
    }

    public final List a() {
        return this.f711c;
    }

    public final Y2.d b() {
        return this.f710b;
    }

    public final AbstractC3991f c() {
        return this.f713e;
    }

    public final List d() {
        return this.f712d;
    }

    public final Throwable e() {
        return this.f714f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f709a, dVar.f709a) && AbstractC3159y.d(this.f710b, dVar.f710b) && AbstractC3159y.d(this.f711c, dVar.f711c) && AbstractC3159y.d(this.f712d, dVar.f712d) && AbstractC3159y.d(this.f713e, dVar.f713e) && AbstractC3159y.d(this.f714f, dVar.f714f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f709a.hashCode() * 31) + this.f710b.hashCode()) * 31) + this.f711c.hashCode()) * 31) + this.f712d.hashCode()) * 31;
        AbstractC3991f abstractC3991f = this.f713e;
        int i8 = 0;
        if (abstractC3991f == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC3991f.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        Throwable th = this.f714f;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Full(config=" + this.f709a + ", paymentMethodMetadata=" + this.f710b + ", customerPaymentMethods=" + this.f711c + ", supportedPaymentMethods=" + this.f712d + ", paymentSelection=" + this.f713e + ", validationError=" + this.f714f + ")";
    }
}
