package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z;

/* compiled from: ReflectJavaClassifierType.kt */
/* loaded from: classes2.dex */
public final class n extends z implements kotlin.reflect.x.internal.l0.d.a.n0.j {

    /* renamed from: b, reason: collision with root package name */
    private final Type f21853b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.n0.i f21854c;

    public n(Type type) {
        kotlin.reflect.x.internal.l0.d.a.n0.i lVar;
        kotlin.jvm.internal.l.f(type, "reflectType");
        this.f21853b = type;
        Type R = R();
        if (R instanceof Class) {
            lVar = new l((Class) R);
        } else if (R instanceof TypeVariable) {
            lVar = new a0((TypeVariable) R);
        } else {
            if (!(R instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + R.getClass() + "): " + R);
            }
            Type rawType = ((ParameterizedType) R).getRawType();
            kotlin.jvm.internal.l.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            lVar = new l((Class) rawType);
        }
        this.f21854c = lVar;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.j
    public List<kotlin.reflect.x.internal.l0.d.a.n0.x> F() {
        int t;
        List<Type> c2 = d.c(R());
        z.a aVar = z.a;
        t = kotlin.collections.u.t(c2, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z
    public Type R() {
        return this.f21853b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.j
    public kotlin.reflect.x.internal.l0.d.a.n0.i b() {
        return this.f21854c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z, kotlin.reflect.x.internal.l0.d.a.n0.d
    public kotlin.reflect.x.internal.l0.d.a.n0.a e(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.a> getAnnotations() {
        List i2;
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.j
    public String n() {
        return R().toString();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.j
    public boolean x() {
        Type R = R();
        if (!(R instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) R).getTypeParameters();
        kotlin.jvm.internal.l.e(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.j
    public String y() {
        throw new UnsupportedOperationException("Type not found: " + R());
    }
}
