package Z2;

import Y2.h;
import e4.C2600b0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class D implements h.d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13254b = C2600b0.f30647e;

    /* renamed from: a, reason: collision with root package name */
    private final C2600b0 f13255a;

    public D(C2600b0 externalPaymentMethodSpec) {
        AbstractC3159y.i(externalPaymentMethodSpec, "externalPaymentMethodSpec");
        this.f13255a = externalPaymentMethodSpec;
    }

    @Override // Y2.h.d
    public W2.a b(boolean z8) {
        return h.d.a.b(this, z8);
    }

    @Override // Y2.h
    public W2.a e(Y2.b bVar, Y2.d dVar, List list, boolean z8) {
        return h.d.a.d(this, bVar, dVar, list, z8);
    }

    @Override // Y2.h
    public X2.g f(Y2.b bVar, List list) {
        return h.d.a.e(this, bVar, list);
    }

    @Override // Y2.h.d
    public List g(Y2.d metadata, h.a arguments) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(arguments, "arguments");
        return new X2.b(arguments).a();
    }

    @Override // Y2.h
    public boolean h(Y2.b bVar, List list) {
        return h.d.a.a(this, bVar, list);
    }

    @Override // Y2.h
    public List i(Y2.b bVar, Y2.d dVar, List list, h.a aVar) {
        return h.d.a.c(this, bVar, dVar, list, aVar);
    }

    @Override // Y2.h.d
    public X2.g j() {
        return new X2.g(this.f13255a.getType(), AbstractC3984c.b(this.f13255a.c()), 0, this.f13255a.e(), this.f13255a.b(), false, (InterfaceC3983b) null, 64, (AbstractC3151p) null);
    }
}
