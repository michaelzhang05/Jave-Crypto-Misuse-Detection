package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import r1.AbstractC3915a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18778a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18779b;

    /* renamed from: c, reason: collision with root package name */
    private final List f18780c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.google.gson.internal.h {
        a() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.google.gson.internal.h {
        b() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0381c implements com.google.gson.internal.h {
        C0381c() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.google.gson.internal.h {
        d() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements com.google.gson.internal.h {
        e() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements com.google.gson.internal.h {
        f() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements com.google.gson.internal.h {
        g() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements com.google.gson.internal.h {
        h() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements com.google.gson.internal.h {
        i() {
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            return new com.google.gson.internal.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f18781a;

        j(Class cls) {
            this.f18781a = cls;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            try {
                return com.google.gson.internal.m.f18829a.d(this.f18781a);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to create instance of " + this.f18781a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18783a;

        k(String str) {
            this.f18783a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.g(this.f18783a);
        }
    }

    /* loaded from: classes4.dex */
    class l implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18785a;

        l(String str) {
            this.f18785a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.g(this.f18785a);
        }
    }

    /* loaded from: classes4.dex */
    class m implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18787a;

        m(String str) {
            this.f18787a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.g(this.f18787a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f18789a;

        n(Type type) {
            this.f18789a = type;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            Type type = this.f18789a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.g("Invalid EnumSet type: " + this.f18789a.toString());
            }
            throw new com.google.gson.g("Invalid EnumSet type: " + this.f18789a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f18790a;

        o(Type type) {
            this.f18790a = type;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            Type type = this.f18790a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new com.google.gson.g("Invalid EnumMap type: " + this.f18790a.toString());
            }
            throw new com.google.gson.g("Invalid EnumMap type: " + this.f18790a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18791a;

        p(String str) {
            this.f18791a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.g(this.f18791a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18792a;

        q(String str) {
            this.f18792a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.g(this.f18792a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f18793a;

        r(Constructor constructor) {
            this.f18793a = constructor;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            try {
                return this.f18793a.newInstance(null);
            } catch (IllegalAccessException e8) {
                throw AbstractC3915a.e(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC3915a.c(this.f18793a) + "' with no args", e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC3915a.c(this.f18793a) + "' with no args", e10.getCause());
            }
        }
    }

    public c(Map map, boolean z8, List list) {
        this.f18778a = map;
        this.f18779b = z8;
        this.f18780c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
        }
        return null;
    }

    private static com.google.gson.internal.h c(Class cls, com.google.gson.o oVar) {
        String m8;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.o oVar2 = com.google.gson.o.ALLOW;
            if (oVar != oVar2 && (!com.google.gson.internal.k.a(declaredConstructor, null) || (oVar == com.google.gson.o.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            }
            if (oVar == oVar2 && (m8 = AbstractC3915a.m(declaredConstructor)) != null) {
                return new q(m8);
            }
            return new r(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static com.google.gson.internal.h d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C0381c();
            }
            return new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new g();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new h();
            }
            return new i();
        }
        return null;
    }

    private static com.google.gson.internal.h e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private com.google.gson.internal.h f(Class cls) {
        if (this.f18779b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public com.google.gson.internal.h b(TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        android.support.v4.media.a.a(this.f18778a.get(d8));
        android.support.v4.media.a.a(this.f18778a.get(c8));
        com.google.gson.internal.h e8 = e(d8, c8);
        if (e8 != null) {
            return e8;
        }
        com.google.gson.o b8 = com.google.gson.internal.k.b(this.f18780c, c8);
        com.google.gson.internal.h c9 = c(c8, b8);
        if (c9 != null) {
            return c9;
        }
        com.google.gson.internal.h d9 = d(d8, c8);
        if (d9 != null) {
            return d9;
        }
        String a8 = a(c8);
        if (a8 != null) {
            return new l(a8);
        }
        if (b8 == com.google.gson.o.ALLOW) {
            return f(c8);
        }
        return new m("Unable to create instance of " + c8 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f18778a.toString();
    }
}
