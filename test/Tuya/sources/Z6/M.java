package z6;

import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import v6.j;
import v6.k;

/* loaded from: classes5.dex */
public final class M implements A6.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40514a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40515b;

    public M(boolean z8, String discriminator) {
        AbstractC3159y.i(discriminator, "discriminator");
        this.f40514a = z8;
        this.f40515b = discriminator;
    }

    private final void d(v6.f fVar, InterfaceC2643c interfaceC2643c) {
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String f8 = fVar.f(i8);
            if (AbstractC3159y.d(f8, this.f40515b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC2643c + " has property '" + f8 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(v6.f fVar, InterfaceC2643c interfaceC2643c) {
        v6.j kind = fVar.getKind();
        if (!(kind instanceof v6.d) && !AbstractC3159y.d(kind, j.a.f38924a)) {
            if (this.f40514a) {
                return;
            }
            if (!AbstractC3159y.d(kind, k.b.f38927a) && !AbstractC3159y.d(kind, k.c.f38928a) && !(kind instanceof v6.e) && !(kind instanceof j.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + interfaceC2643c.b() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + interfaceC2643c.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // A6.d
    public void a(InterfaceC2643c baseClass, InterfaceC2643c actualClass, t6.b actualSerializer) {
        AbstractC3159y.i(baseClass, "baseClass");
        AbstractC3159y.i(actualClass, "actualClass");
        AbstractC3159y.i(actualSerializer, "actualSerializer");
        v6.f a8 = actualSerializer.a();
        e(a8, actualClass);
        if (!this.f40514a) {
            d(a8, actualClass);
        }
    }

    @Override // A6.d
    public void b(InterfaceC2643c baseClass, Function1 defaultSerializerProvider) {
        AbstractC3159y.i(baseClass, "baseClass");
        AbstractC3159y.i(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // A6.d
    public void c(InterfaceC2643c baseClass, Function1 defaultDeserializerProvider) {
        AbstractC3159y.i(baseClass, "baseClass");
        AbstractC3159y.i(defaultDeserializerProvider, "defaultDeserializerProvider");
    }
}
