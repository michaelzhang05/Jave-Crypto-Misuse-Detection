package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o1.AbstractC3525a;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f17610a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.c f17611b;

    /* renamed from: c, reason: collision with root package name */
    private final Excluder f17612c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f17613d;

    /* renamed from: e, reason: collision with root package name */
    private final List f17614e;

    /* loaded from: classes3.dex */
    public static abstract class Adapter<T, A> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        final Map f17615a;

        Adapter(Map map) {
            this.f17615a = map;
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(C3596a c3596a) {
            if (c3596a.N() == EnumC3597b.NULL) {
                c3596a.J();
                return null;
            }
            Object e8 = e();
            try {
                c3596a.b();
                while (c3596a.t()) {
                    b bVar = (b) this.f17615a.get(c3596a.H());
                    if (bVar != null && bVar.f17634e) {
                        g(e8, c3596a, bVar);
                    }
                    c3596a.X();
                }
                c3596a.l();
                return f(e8);
            } catch (IllegalAccessException e9) {
                throw AbstractC3525a.e(e9);
            } catch (IllegalStateException e10) {
                throw new m(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void d(p1.c cVar, Object obj) {
            if (obj == null) {
                cVar.x();
                return;
            }
            cVar.f();
            try {
                Iterator it = this.f17615a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(cVar, obj);
                }
                cVar.l();
            } catch (IllegalAccessException e8) {
                throw AbstractC3525a.e(e8);
            }
        }

        abstract Object e();

        abstract Object f(Object obj);

        abstract void g(Object obj, C3596a c3596a, b bVar);
    }

    /* loaded from: classes3.dex */
    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        private final h f17616b;

        FieldReflectionAdapter(h hVar, Map map) {
            super(map);
            this.f17616b = hVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object e() {
            return this.f17616b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object f(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void g(Object obj, C3596a c3596a, b bVar) {
            bVar.b(c3596a, obj);
        }
    }

    /* loaded from: classes3.dex */
    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        static final Map f17617e = j();

        /* renamed from: b, reason: collision with root package name */
        private final Constructor f17618b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f17619c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f17620d;

        RecordAdapter(Class cls, Map map, boolean z8) {
            super(map);
            this.f17620d = new HashMap();
            Constructor i8 = AbstractC3525a.i(cls);
            this.f17618b = i8;
            if (z8) {
                ReflectiveTypeAdapterFactory.c(null, i8);
            } else {
                AbstractC3525a.l(i8);
            }
            String[] j8 = AbstractC3525a.j(cls);
            for (int i9 = 0; i9 < j8.length; i9++) {
                this.f17620d.put(j8[i9], Integer.valueOf(i9));
            }
            Class<?>[] parameterTypes = this.f17618b.getParameterTypes();
            this.f17619c = new Object[parameterTypes.length];
            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                this.f17619c[i10] = f17617e.get(parameterTypes[i10]);
            }
        }

        private static Map j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f17619c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object f(Object[] objArr) {
            try {
                return this.f17618b.newInstance(objArr);
            } catch (IllegalAccessException e8) {
                throw AbstractC3525a.e(e8);
            } catch (IllegalArgumentException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC3525a.c(this.f17618b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e10) {
                e = e10;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC3525a.c(this.f17618b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC3525a.c(this.f17618b) + "' with args " + Arrays.toString(objArr), e11.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, C3596a c3596a, b bVar) {
            Integer num = (Integer) this.f17620d.get(bVar.f17632c);
            if (num != null) {
                bVar.a(c3596a, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC3525a.c(this.f17618b) + "' for field with name '" + bVar.f17632c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends b {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f17621f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Method f17622g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f17623h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f17624i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Gson f17625j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TypeToken f17626k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f17627l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f17628m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z8, boolean z9, boolean z10, Method method, boolean z11, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z12, boolean z13) {
            super(str, field, z8, z9);
            this.f17621f = z10;
            this.f17622g = method;
            this.f17623h = z11;
            this.f17624i = typeAdapter;
            this.f17625j = gson;
            this.f17626k = typeToken;
            this.f17627l = z12;
            this.f17628m = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(C3596a c3596a, int i8, Object[] objArr) {
            Object b8 = this.f17624i.b(c3596a);
            if (b8 == null && this.f17627l) {
                throw new j("null is not allowed as value for record component '" + this.f17632c + "' of primitive type; at path " + c3596a.getPath());
            }
            objArr[i8] = b8;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(C3596a c3596a, Object obj) {
            Object b8 = this.f17624i.b(c3596a);
            if (b8 != null || !this.f17627l) {
                if (this.f17621f) {
                    ReflectiveTypeAdapterFactory.c(obj, this.f17631b);
                } else if (this.f17628m) {
                    throw new g("Cannot set value of 'static final' " + AbstractC3525a.g(this.f17631b, false));
                }
                this.f17631b.set(obj, b8);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void c(p1.c cVar, Object obj) {
            Object obj2;
            TypeAdapter typeAdapterRuntimeTypeWrapper;
            if (!this.f17633d) {
                return;
            }
            if (this.f17621f) {
                Method method = this.f17622g;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.c(obj, this.f17631b);
                } else {
                    ReflectiveTypeAdapterFactory.c(obj, method);
                }
            }
            Method method2 = this.f17622g;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e8) {
                    throw new g("Accessor " + AbstractC3525a.g(this.f17622g, false) + " threw exception", e8.getCause());
                }
            } else {
                obj2 = this.f17631b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            cVar.u(this.f17630a);
            if (this.f17623h) {
                typeAdapterRuntimeTypeWrapper = this.f17624i;
            } else {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.f17625j, this.f17624i, this.f17626k.d());
            }
            typeAdapterRuntimeTypeWrapper.d(cVar, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final String f17630a;

        /* renamed from: b, reason: collision with root package name */
        final Field f17631b;

        /* renamed from: c, reason: collision with root package name */
        final String f17632c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f17633d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f17634e;

        protected b(String str, Field field, boolean z8, boolean z9) {
            this.f17630a = str;
            this.f17631b = field;
            this.f17632c = field.getName();
            this.f17633d = z8;
            this.f17634e = z9;
        }

        abstract void a(C3596a c3596a, int i8, Object[] objArr);

        abstract void b(C3596a c3596a, Object obj);

        abstract void c(p1.c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(c cVar, com.google.gson.c cVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f17610a = cVar;
        this.f17611b = cVar2;
        this.f17612c = excluder;
        this.f17613d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f17614e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (k.a(accessibleObject, obj)) {
            return;
        }
        throw new g(AbstractC3525a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private b d(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        TypeAdapter typeAdapter;
        boolean z12;
        boolean a8 = com.google.gson.internal.j.a(typeToken.c());
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z11 = true;
        } else {
            z11 = false;
        }
        m1.b bVar = (m1.b) field.getAnnotation(m1.b.class);
        if (bVar != null) {
            typeAdapter = this.f17613d.b(this.f17610a, gson, typeToken, bVar);
        } else {
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (typeAdapter == null) {
            typeAdapter = gson.k(typeToken);
        }
        return new a(str, field, z8, z9, z10, method, z12, typeAdapter, gson, typeToken, a8, z11);
    }

    private Map e(Gson gson, TypeToken typeToken, Class cls, boolean z8, boolean z9) {
        boolean z10;
        Method method;
        int i8;
        int i9;
        boolean z11;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        boolean z12 = z8;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z13 = true;
            boolean z14 = false;
            if (cls2 != cls && declaredFields.length > 0) {
                o b8 = k.b(reflectiveTypeAdapterFactory.f17614e, cls2);
                if (b8 != o.BLOCK_ALL) {
                    if (b8 == o.BLOCK_INACCESSIBLE) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    throw new g("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z15 = z12;
            int length = declaredFields.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean g8 = reflectiveTypeAdapterFactory.g(field, z13);
                boolean g9 = reflectiveTypeAdapterFactory.g(field, z14);
                if (!g8 && !g9) {
                    i8 = i10;
                    i9 = length;
                } else {
                    b bVar = null;
                    if (z9) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            method = null;
                            z10 = false;
                        } else {
                            Method h8 = AbstractC3525a.h(cls2, field);
                            if (!z15) {
                                AbstractC3525a.l(h8);
                            }
                            if (h8.getAnnotation(m1.c.class) != null && field.getAnnotation(m1.c.class) == null) {
                                throw new g("@SerializedName on " + AbstractC3525a.g(h8, z14) + " is not supported");
                            }
                            z10 = g9;
                            method = h8;
                        }
                    } else {
                        z10 = g9;
                        method = null;
                    }
                    if (!z15 && method == null) {
                        AbstractC3525a.l(field);
                    }
                    Type o8 = com.google.gson.internal.b.o(typeToken2.d(), cls2, field.getGenericType());
                    List f8 = reflectiveTypeAdapterFactory.f(field);
                    int size = f8.size();
                    int i11 = 0;
                    while (i11 < size) {
                        String str = (String) f8.get(i11);
                        if (i11 != 0) {
                            z11 = false;
                        } else {
                            z11 = g8;
                        }
                        int i12 = i11;
                        b bVar2 = bVar;
                        int i13 = size;
                        List list = f8;
                        Field field2 = field;
                        int i14 = i10;
                        int i15 = length;
                        b bVar3 = (b) linkedHashMap.put(str, d(gson, field, method, str, TypeToken.b(o8), z11, z10, z15));
                        if (bVar2 == null) {
                            bVar = bVar3;
                        } else {
                            bVar = bVar2;
                        }
                        i11 = i12 + 1;
                        g8 = z11;
                        i10 = i14;
                        size = i13;
                        f8 = list;
                        field = field2;
                        length = i15;
                    }
                    b bVar4 = bVar;
                    Field field3 = field;
                    i8 = i10;
                    i9 = length;
                    if (bVar4 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + bVar4.f17630a + "'; conflict is caused by fields " + AbstractC3525a.f(bVar4.f17631b) + " and " + AbstractC3525a.f(field3));
                    }
                }
                i10 = i8 + 1;
                length = i9;
                z14 = false;
                z13 = true;
                reflectiveTypeAdapterFactory = this;
            }
            typeToken2 = TypeToken.b(com.google.gson.internal.b.o(typeToken2.d(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.c();
            reflectiveTypeAdapterFactory = this;
            z12 = z15;
        }
        return linkedHashMap;
    }

    private List f(Field field) {
        m1.c cVar = (m1.c) field.getAnnotation(m1.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f17611b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z8) {
        if (!this.f17612c.c(field.getType(), z8) && !this.f17612c.f(field, z8)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        boolean z8;
        Class c8 = typeToken.c();
        if (!Object.class.isAssignableFrom(c8)) {
            return null;
        }
        o b8 = k.b(this.f17614e, c8);
        if (b8 != o.BLOCK_ALL) {
            if (b8 == o.BLOCK_INACCESSIBLE) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (AbstractC3525a.k(c8)) {
                return new RecordAdapter(c8, e(gson, typeToken, c8, z8, true), z8);
            }
            return new FieldReflectionAdapter(this.f17610a.b(typeToken), e(gson, typeToken, c8, z8, false));
        }
        throw new g("ReflectionAccessFilter does not permit using reflection for " + c8 + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
