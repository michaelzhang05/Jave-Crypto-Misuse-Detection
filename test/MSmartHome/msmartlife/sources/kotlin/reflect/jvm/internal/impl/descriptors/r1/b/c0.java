package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z;

/* compiled from: ReflectJavaWildcardType.kt */
/* loaded from: classes2.dex */
public final class c0 extends z implements kotlin.reflect.x.internal.l0.d.a.n0.c0 {

    /* renamed from: b, reason: collision with root package name */
    private final WildcardType f21829b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> f21830c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21831d;

    public c0(WildcardType wildcardType) {
        List i2;
        kotlin.jvm.internal.l.f(wildcardType, "reflectType");
        this.f21829b = wildcardType;
        i2 = kotlin.collections.t.i();
        this.f21830c = i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.c0
    public boolean J() {
        kotlin.jvm.internal.l.e(R().getUpperBounds(), "reflectType.upperBounds");
        return !kotlin.jvm.internal.l.a(kotlin.collections.j.w(r0), Object.class);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.c0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public z C() {
        Type[] upperBounds = R().getUpperBounds();
        Type[] lowerBounds = R().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                z.a aVar = z.a;
                kotlin.jvm.internal.l.e(lowerBounds, "lowerBounds");
                Object M = kotlin.collections.j.M(lowerBounds);
                kotlin.jvm.internal.l.e(M, "lowerBounds.single()");
                return aVar.a((Type) M);
            }
            if (upperBounds.length != 1) {
                return null;
            }
            kotlin.jvm.internal.l.e(upperBounds, "upperBounds");
            Type type = (Type) kotlin.collections.j.M(upperBounds);
            if (kotlin.jvm.internal.l.a(type, Object.class)) {
                return null;
            }
            z.a aVar2 = z.a;
            kotlin.jvm.internal.l.e(type, "ub");
            return aVar2.a(type);
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + R());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public WildcardType R() {
        return this.f21829b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> getAnnotations() {
        return this.f21830c;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return this.f21831d;
    }
}
