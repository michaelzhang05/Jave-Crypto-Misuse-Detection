package A6;

import e6.InterfaceC2643c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import t6.InterfaceC3796a;
import t6.i;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f512a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f513b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f514c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f515d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        super(null);
        AbstractC3159y.i(class2ContextualFactory, "class2ContextualFactory");
        AbstractC3159y.i(polyBase2Serializers, "polyBase2Serializers");
        AbstractC3159y.i(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC3159y.i(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC3159y.i(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f512a = class2ContextualFactory;
        this.f513b = polyBase2Serializers;
        this.f514c = polyBase2DefaultSerializerProvider;
        this.f515d = polyBase2NamedSerializers;
        this.f516e = polyBase2DefaultDeserializerProvider;
    }

    @Override // A6.b
    public void a(d collector) {
        AbstractC3159y.i(collector, "collector");
        for (Map.Entry entry : this.f512a.entrySet()) {
            android.support.v4.media.a.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f513b.entrySet()) {
            InterfaceC2643c interfaceC2643c = (InterfaceC2643c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC2643c interfaceC2643c2 = (InterfaceC2643c) entry3.getKey();
                t6.b bVar = (t6.b) entry3.getValue();
                AbstractC3159y.g(interfaceC2643c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3159y.g(interfaceC2643c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3159y.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.a(interfaceC2643c, interfaceC2643c2, bVar);
            }
        }
        for (Map.Entry entry4 : this.f514c.entrySet()) {
            InterfaceC2643c interfaceC2643c3 = (InterfaceC2643c) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            AbstractC3159y.g(interfaceC2643c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3159y.g(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.b(interfaceC2643c3, (Function1) Z.d(function1, 1));
        }
        for (Map.Entry entry5 : this.f516e.entrySet()) {
            InterfaceC2643c interfaceC2643c4 = (InterfaceC2643c) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            AbstractC3159y.g(interfaceC2643c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3159y.g(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.c(interfaceC2643c4, (Function1) Z.d(function12, 1));
        }
    }

    @Override // A6.b
    public t6.b b(InterfaceC2643c kClass, List typeArgumentsSerializers) {
        AbstractC3159y.i(kClass, "kClass");
        AbstractC3159y.i(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.a.a(this.f512a.get(kClass));
        return null;
    }

    @Override // A6.b
    public InterfaceC3796a d(InterfaceC2643c baseClass, String str) {
        t6.b bVar;
        Function1 function1;
        AbstractC3159y.i(baseClass, "baseClass");
        Map map = (Map) this.f515d.get(baseClass);
        if (map != null) {
            bVar = (t6.b) map.get(str);
        } else {
            bVar = null;
        }
        if (!(bVar instanceof t6.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f516e.get(baseClass);
        if (Z.i(obj, 1)) {
            function1 = (Function1) obj;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (InterfaceC3796a) function1.invoke(str);
    }

    @Override // A6.b
    public i e(InterfaceC2643c baseClass, Object value) {
        t6.b bVar;
        Function1 function1;
        AbstractC3159y.i(baseClass, "baseClass");
        AbstractC3159y.i(value, "value");
        if (!baseClass.c(value)) {
            return null;
        }
        Map map = (Map) this.f513b.get(baseClass);
        if (map != null) {
            bVar = (t6.b) map.get(U.b(value.getClass()));
        } else {
            bVar = null;
        }
        if (!(bVar instanceof i)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f514c.get(baseClass);
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
