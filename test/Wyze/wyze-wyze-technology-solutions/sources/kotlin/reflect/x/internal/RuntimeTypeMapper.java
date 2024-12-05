package kotlin.reflect.x.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.u;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.x.internal.JvmFunctionSignature;
import kotlin.reflect.x.internal.JvmPropertySignature;
import kotlin.reflect.x.internal.l0.b.i;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.b.q.a;
import kotlin.reflect.x.internal.l0.d.a.g0;
import kotlin.reflect.x.internal.l0.d.a.k0.f;
import kotlin.reflect.x.internal.l0.d.a.z;
import kotlin.reflect.x.internal.l0.d.b.v;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.i.u.e;
import kotlin.reflect.x.internal.l0.j.b.g0.j;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "isKnownBuiltInFunction", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "mapName", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.f0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class RuntimeTypeMapper {
    public static final RuntimeTypeMapper a = new RuntimeTypeMapper();

    /* renamed from: b, reason: collision with root package name */
    private static final b f19560b;

    static {
        b m = b.m(new c("java.lang.Void"));
        l.e(m, "topLevel(FqName(\"java.lang.Void\"))");
        f19560b = m;
    }

    private RuntimeTypeMapper() {
    }

    private final i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return e.f(cls.getSimpleName()).r();
        }
        return null;
    }

    private final boolean b(y yVar) {
        if (kotlin.reflect.x.internal.l0.i.c.o(yVar) || kotlin.reflect.x.internal.l0.i.c.p(yVar)) {
            return true;
        }
        return l.a(yVar.getName(), a.f19748e.a()) && yVar.h().isEmpty();
    }

    private final JvmFunctionSignature.e d(y yVar) {
        return new JvmFunctionSignature.e(new d.b(e(yVar), v.c(yVar, false, false, 1, null)));
    }

    private final String e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        String b2 = g0.b(bVar);
        if (b2 != null) {
            return b2;
        }
        if (bVar instanceof u0) {
            String f2 = kotlin.reflect.x.internal.l0.i.t.a.o(bVar).getName().f();
            l.e(f2, "descriptor.propertyIfAccessor.name.asString()");
            return z.b(f2);
        }
        if (bVar instanceof v0) {
            String f3 = kotlin.reflect.x.internal.l0.i.t.a.o(bVar).getName().f();
            l.e(f3, "descriptor.propertyIfAccessor.name.asString()");
            return z.e(f3);
        }
        String f4 = bVar.getName().f();
        l.e(f4, "descriptor.name.asString()");
        return f4;
    }

    public final b c(Class<?> cls) {
        l.f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            l.e(componentType, "klass.componentType");
            i a2 = a(componentType);
            if (a2 != null) {
                return new b(k.r, a2.i());
            }
            b m = b.m(k.a.f19717i.l());
            l.e(m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m;
        }
        if (l.a(cls, Void.TYPE)) {
            return f19560b;
        }
        i a3 = a(cls);
        if (a3 != null) {
            return new b(k.r, a3.o());
        }
        b a4 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.a(cls);
        if (!a4.k()) {
            kotlin.reflect.x.internal.l0.b.q.c cVar = kotlin.reflect.x.internal.l0.b.q.c.a;
            c b2 = a4.b();
            l.e(b2, "classId.asSingleFqName()");
            b m2 = cVar.m(b2);
            if (m2 != null) {
                return m2;
            }
        }
        return a4;
    }

    public final JvmPropertySignature f(t0 t0Var) {
        l.f(t0Var, "possiblyOverriddenProperty");
        t0 L0 = ((t0) kotlin.reflect.x.internal.l0.i.d.L(t0Var)).L0();
        l.e(L0, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (L0 instanceof j) {
            j jVar = (j) L0;
            n E = jVar.E();
            h.f<n, a.d> fVar = kotlin.reflect.x.internal.l0.e.a0.a.f20332d;
            l.e(fVar, "propertySignature");
            a.d dVar = (a.d) kotlin.reflect.x.internal.l0.e.z.e.a(E, fVar);
            if (dVar != null) {
                return new JvmPropertySignature.c(L0, E, dVar, jVar.Z(), jVar.T());
            }
        } else if (L0 instanceof f) {
            z0 t = ((f) L0).t();
            kotlin.reflect.x.internal.l0.d.a.m0.a aVar = t instanceof kotlin.reflect.x.internal.l0.d.a.m0.a ? (kotlin.reflect.x.internal.l0.d.a.m0.a) t : null;
            kotlin.reflect.x.internal.l0.d.a.n0.l b2 = aVar != null ? aVar.b() : null;
            if (b2 instanceof r) {
                return new JvmPropertySignature.a(((r) b2).U());
            }
            if (b2 instanceof u) {
                Method U = ((u) b2).U();
                v0 setter = L0.getSetter();
                z0 t2 = setter != null ? setter.t() : null;
                kotlin.reflect.x.internal.l0.d.a.m0.a aVar2 = t2 instanceof kotlin.reflect.x.internal.l0.d.a.m0.a ? (kotlin.reflect.x.internal.l0.d.a.m0.a) t2 : null;
                kotlin.reflect.x.internal.l0.d.a.n0.l b3 = aVar2 != null ? aVar2.b() : null;
                u uVar = b3 instanceof u ? (u) b3 : null;
                return new JvmPropertySignature.b(U, uVar != null ? uVar.U() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + L0 + " (source = " + b2 + ')');
        }
        u0 getter = L0.getGetter();
        l.c(getter);
        JvmFunctionSignature.e d2 = d(getter);
        v0 setter2 = L0.getSetter();
        return new JvmPropertySignature.d(d2, setter2 != null ? d(setter2) : null);
    }

    public final JvmFunctionSignature g(y yVar) {
        Method U;
        d.b b2;
        d.b e2;
        l.f(yVar, "possiblySubstitutedFunction");
        y L0 = ((y) kotlin.reflect.x.internal.l0.i.d.L(yVar)).L0();
        l.e(L0, "unwrapFakeOverride(possi…titutedFunction).original");
        if (L0 instanceof kotlin.reflect.x.internal.l0.j.b.g0.b) {
            kotlin.reflect.x.internal.l0.j.b.g0.b bVar = (kotlin.reflect.x.internal.l0.j.b.g0.b) L0;
            o E = bVar.E();
            if ((E instanceof kotlin.reflect.x.internal.l0.e.i) && (e2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.e((kotlin.reflect.x.internal.l0.e.i) E, bVar.Z(), bVar.T())) != null) {
                return new JvmFunctionSignature.e(e2);
            }
            if ((E instanceof kotlin.reflect.x.internal.l0.e.d) && (b2 = kotlin.reflect.x.internal.l0.e.a0.b.i.a.b((kotlin.reflect.x.internal.l0.e.d) E, bVar.Z(), bVar.T())) != null) {
                m b3 = yVar.b();
                l.e(b3, "possiblySubstitutedFunction.containingDeclaration");
                if (kotlin.reflect.x.internal.l0.i.f.b(b3)) {
                    return new JvmFunctionSignature.e(b2);
                }
                return new JvmFunctionSignature.d(b2);
            }
            return d(L0);
        }
        if (L0 instanceof kotlin.reflect.x.internal.l0.d.a.k0.e) {
            z0 t = ((kotlin.reflect.x.internal.l0.d.a.k0.e) L0).t();
            kotlin.reflect.x.internal.l0.d.a.m0.a aVar = t instanceof kotlin.reflect.x.internal.l0.d.a.m0.a ? (kotlin.reflect.x.internal.l0.d.a.m0.a) t : null;
            kotlin.reflect.x.internal.l0.d.a.n0.l b4 = aVar != null ? aVar.b() : null;
            u uVar = b4 instanceof u ? (u) b4 : null;
            if (uVar != null && (U = uVar.U()) != null) {
                return new JvmFunctionSignature.c(U);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + L0);
        }
        if (L0 instanceof kotlin.reflect.x.internal.l0.d.a.k0.b) {
            z0 t2 = ((kotlin.reflect.x.internal.l0.d.a.k0.b) L0).t();
            kotlin.reflect.x.internal.l0.d.a.m0.a aVar2 = t2 instanceof kotlin.reflect.x.internal.l0.d.a.m0.a ? (kotlin.reflect.x.internal.l0.d.a.m0.a) t2 : null;
            kotlin.reflect.x.internal.l0.d.a.n0.l b5 = aVar2 != null ? aVar2.b() : null;
            if (b5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.r1.b.o) {
                return new JvmFunctionSignature.b(((kotlin.reflect.jvm.internal.impl.descriptors.r1.b.o) b5).U());
            }
            if (b5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l) {
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l lVar = (kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l) b5;
                if (lVar.q()) {
                    return new JvmFunctionSignature.a(lVar.v());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + L0 + " (" + b5 + ')');
        }
        if (b(L0)) {
            return d(L0);
        }
        throw new KotlinReflectionInternalError("Unknown origin of " + L0 + " (" + L0.getClass() + ')');
    }
}
