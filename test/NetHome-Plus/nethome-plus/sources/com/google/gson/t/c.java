package com.google.gson.t;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class c {
    private final Map<Type, com.google.gson.f<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.t.o.b f16873b = com.google.gson.t.o.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class a<T> implements com.google.gson.t.i<T> {
        a() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class b<T> implements com.google.gson.t.i<T> {
        b() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0203c<T> implements com.google.gson.t.i<T> {
        C0203c() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class d<T> implements com.google.gson.t.i<T> {
        d() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new com.google.gson.t.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class e<T> implements com.google.gson.t.i<T> {
        private final com.google.gson.t.m a = com.google.gson.t.m.b();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f16874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f16875c;

        e(Class cls, Type type) {
            this.f16874b = cls;
            this.f16875c = type;
        }

        @Override // com.google.gson.t.i
        public T a() {
            try {
                return (T) this.a.c(this.f16874b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16875c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    class f<T> implements com.google.gson.t.i<T> {
        final /* synthetic */ com.google.gson.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f16877b;

        f(com.google.gson.f fVar, Type type) {
            this.a = fVar;
            this.f16877b = type;
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) this.a.a(this.f16877b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    class g<T> implements com.google.gson.t.i<T> {
        final /* synthetic */ com.google.gson.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f16879b;

        g(com.google.gson.f fVar, Type type) {
            this.a = fVar;
            this.f16879b = type;
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) this.a.a(this.f16879b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class h<T> implements com.google.gson.t.i<T> {
        final /* synthetic */ Constructor a;

        h(Constructor constructor) {
            this.a = constructor;
        }

        @Override // com.google.gson.t.i
        public T a() {
            try {
                return (T) this.a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class i<T> implements com.google.gson.t.i<T> {
        i() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class j<T> implements com.google.gson.t.i<T> {
        final /* synthetic */ Type a;

        j(Type type) {
            this.a = type;
        }

        @Override // com.google.gson.t.i
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class k<T> implements com.google.gson.t.i<T> {
        k() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class l<T> implements com.google.gson.t.i<T> {
        l() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class m<T> implements com.google.gson.t.i<T> {
        m() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes2.dex */
    public class n<T> implements com.google.gson.t.i<T> {
        n() {
        }

        @Override // com.google.gson.t.i
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.f<?>> map) {
        this.a = map;
    }

    private <T> com.google.gson.t.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16873b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.google.gson.t.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new n();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new a();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new b();
        }
        if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.google.gson.u.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
            return new C0203c();
        }
        return new d();
    }

    private <T> com.google.gson.t.i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> com.google.gson.t.i<T> a(com.google.gson.u.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        com.google.gson.f<?> fVar = this.a.get(type);
        if (fVar != null) {
            return new f(fVar, type);
        }
        com.google.gson.f<?> fVar2 = this.a.get(rawType);
        if (fVar2 != null) {
            return new g(fVar2, type);
        }
        com.google.gson.t.i<T> b2 = b(rawType);
        if (b2 != null) {
            return b2;
        }
        com.google.gson.t.i<T> c2 = c(type, rawType);
        return c2 != null ? c2 : d(type, rawType);
    }

    public String toString() {
        return this.a.toString();
    }
}
