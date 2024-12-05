package B6;

import O5.C1352h;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import w6.InterfaceC4150a;
import y6.d;

/* loaded from: classes5.dex */
public abstract class g implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2963c f1045a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f1046b;

    public g(InterfaceC2963c baseClass) {
        AbstractC3255y.i(baseClass, "baseClass");
        this.f1045a = baseClass;
        this.f1046b = y6.i.c("JsonContentPolymorphicSerializer<" + baseClass.b() + '>', d.b.f41024a, new y6.f[0], null, 8, null);
    }

    private final Void g(InterfaceC2963c interfaceC2963c, InterfaceC2963c interfaceC2963c2) {
        String b8 = interfaceC2963c.b();
        if (b8 == null) {
            b8 = String.valueOf(interfaceC2963c);
        }
        throw new w6.h("Class '" + b8 + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC2963c2.b() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f1046b;
    }

    @Override // w6.InterfaceC4150a
    public final Object b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        h d8 = l.d(decoder);
        i n8 = d8.n();
        InterfaceC4150a f8 = f(n8);
        AbstractC3255y.g(f8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d8.c().a((w6.b) f8, n8);
    }

    @Override // w6.i
    public final void d(z6.f encoder, Object value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        w6.i e8 = encoder.a().e(this.f1045a, value);
        if (e8 == null && (e8 = w6.j.a(U.b(value.getClass()))) == null) {
            g(U.b(value.getClass()), this.f1045a);
            throw new C1352h();
        }
        ((w6.b) e8).d(encoder, value);
    }

    protected abstract InterfaceC4150a f(i iVar);
}
