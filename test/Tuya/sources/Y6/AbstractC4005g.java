package y6;

import L5.C1224h;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import t6.InterfaceC3796a;
import v6.d;

/* renamed from: y6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4005g implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2643c f40001a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f40002b;

    public AbstractC4005g(InterfaceC2643c baseClass) {
        AbstractC3159y.i(baseClass, "baseClass");
        this.f40001a = baseClass;
        this.f40002b = v6.i.c("JsonContentPolymorphicSerializer<" + baseClass.b() + '>', d.b.f38893a, new v6.f[0], null, 8, null);
    }

    private final Void g(InterfaceC2643c interfaceC2643c, InterfaceC2643c interfaceC2643c2) {
        String b8 = interfaceC2643c.b();
        if (b8 == null) {
            b8 = String.valueOf(interfaceC2643c);
        }
        throw new t6.h("Class '" + b8 + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC2643c2.b() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f40002b;
    }

    @Override // t6.InterfaceC3796a
    public final Object c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        InterfaceC4006h d8 = l.d(decoder);
        AbstractC4007i n8 = d8.n();
        InterfaceC3796a f8 = f(n8);
        AbstractC3159y.g(f8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d8.c().a((t6.b) f8, n8);
    }

    @Override // t6.i
    public final void e(w6.f encoder, Object value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        t6.i e8 = encoder.b().e(this.f40001a, value);
        if (e8 == null && (e8 = t6.j.a(U.b(value.getClass()))) == null) {
            g(U.b(value.getClass()), this.f40001a);
            throw new C1224h();
        }
        ((t6.b) e8).e(encoder, value);
    }

    protected abstract InterfaceC3796a f(AbstractC4007i abstractC4007i);
}
