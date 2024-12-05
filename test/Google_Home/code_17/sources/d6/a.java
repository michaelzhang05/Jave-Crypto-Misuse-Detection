package D6;

import h6.InterfaceC2963c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import w6.InterfaceC4150a;
import w6.i;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2235b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f2236c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f2237d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f2238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        super(null);
        AbstractC3255y.i(class2ContextualFactory, "class2ContextualFactory");
        AbstractC3255y.i(polyBase2Serializers, "polyBase2Serializers");
        AbstractC3255y.i(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC3255y.i(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC3255y.i(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f2234a = class2ContextualFactory;
        this.f2235b = polyBase2Serializers;
        this.f2236c = polyBase2DefaultSerializerProvider;
        this.f2237d = polyBase2NamedSerializers;
        this.f2238e = polyBase2DefaultDeserializerProvider;
    }

    @Override // D6.b
    public void a(d collector) {
        AbstractC3255y.i(collector, "collector");
        for (Map.Entry entry : this.f2234a.entrySet()) {
            android.support.v4.media.a.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f2235b.entrySet()) {
            InterfaceC2963c interfaceC2963c = (InterfaceC2963c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC2963c interfaceC2963c2 = (InterfaceC2963c) entry3.getKey();
                w6.b bVar = (w6.b) entry3.getValue();
                AbstractC3255y.g(interfaceC2963c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3255y.g(interfaceC2963c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3255y.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.a(interfaceC2963c, interfaceC2963c2, bVar);
            }
        }
        for (Map.Entry entry4 : this.f2236c.entrySet()) {
            InterfaceC2963c interfaceC2963c3 = (InterfaceC2963c) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            AbstractC3255y.g(interfaceC2963c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3255y.g(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.b(interfaceC2963c3, (Function1) Z.d(function1, 1));
        }
        for (Map.Entry entry5 : this.f2238e.entrySet()) {
            InterfaceC2963c interfaceC2963c4 = (InterfaceC2963c) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            AbstractC3255y.g(interfaceC2963c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3255y.g(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.c(interfaceC2963c4, (Function1) Z.d(function12, 1));
        }
    }

    @Override // D6.b
    public w6.b b(InterfaceC2963c kClass, List typeArgumentsSerializers) {
        AbstractC3255y.i(kClass, "kClass");
        AbstractC3255y.i(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.a.a(this.f2234a.get(kClass));
        return null;
    }

    @Override // D6.b
    public InterfaceC4150a d(InterfaceC2963c baseClass, String str) {
        w6.b bVar;
        Function1 function1;
        AbstractC3255y.i(baseClass, "baseClass");
        Map map = (Map) this.f2237d.get(baseClass);
        if (map != null) {
            bVar = (w6.b) map.get(str);
        } else {
            bVar = null;
        }
        if (!(bVar instanceof w6.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f2238e.get(baseClass);
        if (Z.i(obj, 1)) {
            function1 = (Function1) obj;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (InterfaceC4150a) function1.invoke(str);
    }

    @Override // D6.b
    public i e(InterfaceC2963c baseClass, Object value) {
        w6.b bVar;
        Function1 function1;
        AbstractC3255y.i(baseClass, "baseClass");
        AbstractC3255y.i(value, "value");
        if (!baseClass.c(value)) {
            return null;
        }
        Map map = (Map) this.f2235b.get(baseClass);
        if (map != null) {
            bVar = (w6.b) map.get(U.b(value.getClass()));
        } else {
            bVar = null;
        }
        if (!(bVar instanceof i)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f2236c.get(baseClass);
        if (Z.i(obj, 1)) {
            function1 = (Function1) obj;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (i) function1.invoke(value);
    }
}
