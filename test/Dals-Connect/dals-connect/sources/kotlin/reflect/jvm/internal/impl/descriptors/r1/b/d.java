package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;

/* compiled from: reflectClassUtil.kt */
/* loaded from: classes2.dex */
public final class d {
    private static final List<KClass<? extends Object>> a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f21832b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f21833c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Class<? extends Function<?>>, Integer> f21834d;

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<ParameterizedType, ParameterizedType> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21835f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            kotlin.jvm.internal.l.f(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21836f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<Type> invoke(ParameterizedType parameterizedType) {
            Sequence<Type> q;
            kotlin.jvm.internal.l.f(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.l.e(actualTypeArguments, "it.actualTypeArguments");
            q = kotlin.collections.n.q(actualTypeArguments);
            return q;
        }
    }

    static {
        List<KClass<? extends Object>> l;
        int t;
        Map<Class<? extends Object>, Class<? extends Object>> q;
        int t2;
        Map<Class<? extends Object>, Class<? extends Object>> q2;
        List l2;
        int t3;
        Map<Class<? extends Function<?>>, Integer> q3;
        int i2 = 0;
        l = kotlin.collections.t.l(kotlin.jvm.internal.b0.b(Boolean.TYPE), kotlin.jvm.internal.b0.b(Byte.TYPE), kotlin.jvm.internal.b0.b(Character.TYPE), kotlin.jvm.internal.b0.b(Double.TYPE), kotlin.jvm.internal.b0.b(Float.TYPE), kotlin.jvm.internal.b0.b(Integer.TYPE), kotlin.jvm.internal.b0.b(Long.TYPE), kotlin.jvm.internal.b0.b(Short.TYPE));
        a = l;
        t = kotlin.collections.u.t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(kotlin.s.a(kotlin.jvm.a.c(kClass), kotlin.jvm.a.d(kClass)));
        }
        q = o0.q(arrayList);
        f21832b = q;
        List<KClass<? extends Object>> list = a;
        t2 = kotlin.collections.u.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(kotlin.s.a(kotlin.jvm.a.d(kClass2), kotlin.jvm.a.c(kClass2)));
        }
        q2 = o0.q(arrayList2);
        f21833c = q2;
        l2 = kotlin.collections.t.l(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        t3 = kotlin.collections.u.t(l2, 10);
        ArrayList arrayList3 = new ArrayList(t3);
        for (Object obj : l2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.t.s();
            }
            arrayList3.add(kotlin.s.a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        q3 = o0.q(arrayList3);
        f21834d = q3;
    }

    public static final kotlin.reflect.x.internal.l0.f.b a(Class<?> cls) {
        kotlin.reflect.x.internal.l0.f.b m;
        kotlin.reflect.x.internal.l0.f.b a2;
        kotlin.jvm.internal.l.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    String simpleName = cls.getSimpleName();
                    kotlin.jvm.internal.l.e(simpleName, "simpleName");
                    if (!(simpleName.length() == 0)) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        if (declaringClass == null || (a2 = a(declaringClass)) == null || (m = a2.d(kotlin.reflect.x.internal.l0.f.f.r(cls.getSimpleName()))) == null) {
                            m = kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c(cls.getName()));
                        }
                        kotlin.jvm.internal.l.e(m, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                        return m;
                    }
                }
                kotlin.reflect.x.internal.l0.f.c cVar = new kotlin.reflect.x.internal.l0.f.c(cls.getName());
                return new kotlin.reflect.x.internal.l0.f.b(cVar.e(), kotlin.reflect.x.internal.l0.f.c.k(cVar.g()), true);
            }
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
    }

    public static final String b(Class<?> cls) {
        String v;
        String v2;
        kotlin.jvm.internal.l.f(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        }
        if (cls.isArray()) {
            String name2 = cls.getName();
            kotlin.jvm.internal.l.e(name2, "name");
            v2 = kotlin.text.u.v(name2, '.', '/', false, 4, null);
            return v2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        String name3 = cls.getName();
        kotlin.jvm.internal.l.e(name3, "name");
        v = kotlin.text.u.v(name3, '.', '/', false, 4, null);
        sb.append(v);
        sb.append(';');
        return sb.toString();
    }

    public static final List<Type> c(Type type) {
        Sequence f2;
        Sequence p;
        List<Type> A;
        List<Type> X;
        List<Type> i2;
        kotlin.jvm.internal.l.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            i2 = kotlin.collections.t.i();
            return i2;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.l.e(actualTypeArguments, "actualTypeArguments");
            X = kotlin.collections.n.X(actualTypeArguments);
            return X;
        }
        f2 = kotlin.sequences.l.f(type, a.f21835f);
        p = kotlin.sequences.n.p(f2, b.f21836f);
        A = kotlin.sequences.n.A(p);
        return A;
    }

    public static final Class<?> d(Class<?> cls) {
        kotlin.jvm.internal.l.f(cls, "<this>");
        return f21832b.get(cls);
    }

    public static final ClassLoader e(Class<?> cls) {
        kotlin.jvm.internal.l.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.l.e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    public static final Class<?> f(Class<?> cls) {
        kotlin.jvm.internal.l.f(cls, "<this>");
        return f21833c.get(cls);
    }

    public static final boolean g(Class<?> cls) {
        kotlin.jvm.internal.l.f(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
