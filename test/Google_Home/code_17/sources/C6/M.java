package C6;

import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import y6.j;
import y6.k;

/* loaded from: classes5.dex */
public final class M implements D6.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1632a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1633b;

    public M(boolean z8, String discriminator) {
        AbstractC3255y.i(discriminator, "discriminator");
        this.f1632a = z8;
        this.f1633b = discriminator;
    }

    private final void d(y6.f fVar, InterfaceC2963c interfaceC2963c) {
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String f8 = fVar.f(i8);
            if (AbstractC3255y.d(f8, this.f1633b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC2963c + " has property '" + f8 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(y6.f fVar, InterfaceC2963c interfaceC2963c) {
        y6.j kind = fVar.getKind();
        if (!(kind instanceof y6.d) && !AbstractC3255y.d(kind, j.a.f41055a)) {
            if (this.f1632a) {
                return;
            }
            if (!AbstractC3255y.d(kind, k.b.f41058a) && !AbstractC3255y.d(kind, k.c.f41059a) && !(kind instanceof y6.e) && !(kind instanceof j.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + interfaceC2963c.b() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + interfaceC2963c.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // D6.d
    public void a(InterfaceC2963c baseClass, InterfaceC2963c actualClass, w6.b actualSerializer) {
        AbstractC3255y.i(baseClass, "baseClass");
        AbstractC3255y.i(actualClass, "actualClass");
        AbstractC3255y.i(actualSerializer, "actualSerializer");
        y6.f a8 = actualSerializer.a();
        e(a8, actualClass);
        if (!this.f1632a) {
            d(a8, actualClass);
        }
    }

    @Override // D6.d
    public void b(InterfaceC2963c baseClass, Function1 defaultSerializerProvider) {
        AbstractC3255y.i(baseClass, "baseClass");
        AbstractC3255y.i(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // D6.d
    public void c(InterfaceC2963c baseClass, Function1 defaultDeserializerProvider) {
        AbstractC3255y.i(baseClass, "baseClass");
        AbstractC3255y.i(defaultDeserializerProvider, "defaultDeserializerProvider");
    }
}
