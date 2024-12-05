package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.reflect.x.internal.l0.d.a.n0.x;

/* compiled from: ReflectJavaType.kt */
/* loaded from: classes2.dex */
public abstract class z implements kotlin.reflect.x.internal.l0.d.a.n0.x {
    public static final a a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final z a(Type type) {
            z kVar;
            kotlin.jvm.internal.l.f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z || !((Class) type).isArray())) {
                kVar = type instanceof WildcardType ? new c0((WildcardType) type) : new n(type);
            } else {
                kVar = new k(type);
            }
            return kVar;
        }
    }

    protected abstract Type R();

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public kotlin.reflect.x.internal.l0.d.a.n0.a e(kotlin.reflect.x.internal.l0.f.c cVar) {
        return x.a.a(this, cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.l.a(R(), ((z) obj).R());
    }

    public int hashCode() {
        return R().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }
}
