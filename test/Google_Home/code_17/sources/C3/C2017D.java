package c3;

import a3.C1620b;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.C2920b0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2017D implements InterfaceC1974h.d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f15578b = C2920b0.f32568e;

    /* renamed from: a, reason: collision with root package name */
    private final C2920b0 f15579a;

    public C2017D(C2920b0 externalPaymentMethodSpec) {
        AbstractC3255y.i(externalPaymentMethodSpec, "externalPaymentMethodSpec");
        this.f15579a = externalPaymentMethodSpec;
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.d.a.c(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.d
    public Z2.a b(boolean z8) {
        return InterfaceC1974h.d.a.b(this, z8);
    }

    @Override // b3.InterfaceC1974h
    public boolean d(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.a(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h
    public Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8) {
        return InterfaceC1974h.d.a.d(this, interfaceC1968b, c1970d, list, z8);
    }

    @Override // b3.InterfaceC1974h.d
    public List g(C1970d metadata, InterfaceC1974h.a arguments) {
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(arguments, "arguments");
        return new C1620b(arguments).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(this.f15579a.getType(), B2.c.b(this.f15579a.b()), 0, this.f15579a.g(), this.f15579a.a(), false, (B2.b) null, 64, (AbstractC3247p) null);
    }
}
