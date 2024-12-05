package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z;

/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes2.dex */
public final class k extends z implements kotlin.reflect.x.internal.l0.d.a.n0.f {

    /* renamed from: b, reason: collision with root package name */
    private final Type f21840b;

    /* renamed from: c, reason: collision with root package name */
    private final z f21841c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> f21842d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21843e;

    public k(Type type) {
        z a;
        List i2;
        kotlin.jvm.internal.l.f(type, "reflectType");
        this.f21840b = type;
        Type R = R();
        if (!(R instanceof GenericArrayType)) {
            if (R instanceof Class) {
                Class cls = (Class) R;
                if (cls.isArray()) {
                    z.a aVar = z.a;
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.l.e(componentType, "getComponentType()");
                    a = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + R().getClass() + "): " + R());
        }
        z.a aVar2 = z.a;
        Type genericComponentType = ((GenericArrayType) R).getGenericComponentType();
        kotlin.jvm.internal.l.e(genericComponentType, "genericComponentType");
        a = aVar2.a(genericComponentType);
        this.f21841c = a;
        i2 = kotlin.collections.t.i();
        this.f21842d = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z
    protected Type R() {
        return this.f21840b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public z m() {
        return this.f21841c;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> getAnnotations() {
        return this.f21842d;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return this.f21843e;
    }
}
