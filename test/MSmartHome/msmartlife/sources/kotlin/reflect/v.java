package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.sequences.Sequence;
import kotlin.sequences.i;
import kotlin.sequences.n;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", HttpUrl.FRAGMENT_ENCODE_SET, "typeToString", HttpUrl.FRAGMENT_ENCODE_SET, "type", "computeJavaType", "forceWrapper", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class v {

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.IN.ordinal()] = 1;
            iArr[KVariance.INVARIANT.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends j implements Function1<Class<?>, Class<?>> {

        /* renamed from: h, reason: collision with root package name */
        public static final b f19520h = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> cls) {
            l.f(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(KType kType, boolean z) {
        KClassifier b2 = kType.b();
        if (b2 instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) b2);
        }
        if (b2 instanceof KClass) {
            KClass kClass = (KClass) b2;
            Class c2 = z ? kotlin.jvm.a.c(kClass) : kotlin.jvm.a.b(kClass);
            List<KTypeProjection> w = kType.w();
            if (w.isEmpty()) {
                return c2;
            }
            if (c2.isArray()) {
                if (c2.getComponentType().isPrimitive()) {
                    return c2;
                }
                KTypeProjection kTypeProjection = (KTypeProjection) r.p0(w);
                if (kTypeProjection != null) {
                    KVariance f19504c = kTypeProjection.getF19504c();
                    KType f19505d = kTypeProjection.getF19505d();
                    int i2 = f19504c == null ? -1 : a.a[f19504c.ordinal()];
                    if (i2 == -1 || i2 == 1) {
                        return c2;
                    }
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l.c(f19505d);
                    Type d2 = d(f19505d, false, 1, null);
                    return d2 instanceof Class ? c2 : new GenericArrayTypeImpl(d2);
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
            }
            return e(c2, w);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    static /* synthetic */ Type d(KType kType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return c(kType, z);
    }

    private static final Type e(Class<?> cls, List<KTypeProjection> list) {
        int t;
        int t2;
        int t3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            t3 = u.t(list, 10);
            ArrayList arrayList = new ArrayList(t3);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            t2 = u.t(list, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e2 = e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        t = u.t(subList, 10);
        ArrayList arrayList3 = new ArrayList(t);
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, e2, arrayList3);
    }

    public static final Type f(KType kType) {
        Type e2;
        l.f(kType, "<this>");
        return (!(kType instanceof KTypeBase) || (e2 = ((KTypeBase) kType).e()) == null) ? d(kType, false, 1, null) : e2;
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        KVariance d2 = kTypeProjection.d();
        if (d2 == null) {
            return WildcardTypeImpl.f19521f.a();
        }
        KType c2 = kTypeProjection.c();
        l.c(c2);
        int i2 = a.a[d2.ordinal()];
        if (i2 == 1) {
            return new WildcardTypeImpl(null, c(c2, true));
        }
        if (i2 == 2) {
            return c(c2, true);
        }
        if (i2 == 3) {
            return new WildcardTypeImpl(c(c2, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        String name;
        Sequence f2;
        int j2;
        String s;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                f2 = kotlin.sequences.l.f(type, b.f19520h);
                StringBuilder sb = new StringBuilder();
                sb.append(((Class) i.t(f2)).getName());
                j2 = n.j(f2);
                s = kotlin.text.u.s(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, j2);
                sb.append(s);
                name = sb.toString();
            } else {
                name = cls.getName();
            }
            l.e(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}
