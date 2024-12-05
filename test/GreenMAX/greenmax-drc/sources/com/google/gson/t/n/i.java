package com.google.gson.t.n;

import com.google.gson.JsonSyntaxException;
import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class i implements r {

    /* renamed from: f, reason: collision with root package name */
    private final com.google.gson.t.c f16933f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.gson.d f16934g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.gson.t.d f16935h;

    /* renamed from: i, reason: collision with root package name */
    private final d f16936i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.gson.t.o.b f16937j = com.google.gson.t.o.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f16938d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f16939e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f16940f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.gson.e f16941g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.google.gson.u.a f16942h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f16943i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, q qVar, com.google.gson.e eVar, com.google.gson.u.a aVar, boolean z4) {
            super(str, z, z2);
            this.f16938d = field;
            this.f16939e = z3;
            this.f16940f = qVar;
            this.f16941g = eVar;
            this.f16942h = aVar;
            this.f16943i = z4;
        }

        @Override // com.google.gson.t.n.i.c
        void a(com.google.gson.stream.a aVar, Object obj) throws IOException, IllegalAccessException {
            Object b2 = this.f16940f.b(aVar);
            if (b2 == null && this.f16943i) {
                return;
            }
            this.f16938d.set(obj, b2);
        }

        @Override // com.google.gson.t.n.i.c
        void b(com.google.gson.stream.c cVar, Object obj) throws IOException, IllegalAccessException {
            (this.f16939e ? this.f16940f : new m(this.f16941g, this.f16940f, this.f16942h.getType())).d(cVar, this.f16938d.get(obj));
        }

        @Override // com.google.gson.t.n.i.c
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            return this.f16946b && this.f16938d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends q<T> {
        private final com.google.gson.t.i<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, c> f16945b;

        b(com.google.gson.t.i<T> iVar, Map<String, c> map) {
            this.a = iVar;
            this.f16945b = map;
        }

        @Override // com.google.gson.q
        public T b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            T a = this.a.a();
            try {
                aVar.b();
                while (aVar.L()) {
                    c cVar = this.f16945b.get(aVar.q0());
                    if (cVar != null && cVar.f16947c) {
                        cVar.a(aVar, a);
                    }
                    aVar.H0();
                }
                aVar.D();
                return a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // com.google.gson.q
        public void d(com.google.gson.stream.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.c0();
                return;
            }
            cVar.o();
            try {
                for (c cVar2 : this.f16945b.values()) {
                    if (cVar2.c(t)) {
                        cVar.T(cVar2.a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.D();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f16946b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f16947c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.f16946b = z;
            this.f16947c = z2;
        }

        abstract void a(com.google.gson.stream.a aVar, Object obj) throws IOException, IllegalAccessException;

        abstract void b(com.google.gson.stream.c cVar, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public i(com.google.gson.t.c cVar, com.google.gson.d dVar, com.google.gson.t.d dVar2, d dVar3) {
        this.f16933f = cVar;
        this.f16934g = dVar;
        this.f16935h = dVar2;
        this.f16936i = dVar3;
    }

    private c a(com.google.gson.e eVar, Field field, String str, com.google.gson.u.a<?> aVar, boolean z, boolean z2) {
        boolean b2 = com.google.gson.t.k.b(aVar.getRawType());
        com.google.gson.s.b bVar = (com.google.gson.s.b) field.getAnnotation(com.google.gson.s.b.class);
        q<?> a2 = bVar != null ? this.f16936i.a(this.f16933f, eVar, aVar, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = eVar.j(aVar);
        }
        return new a(str, z, z2, field, z3, a2, eVar, aVar, b2);
    }

    static boolean d(Field field, boolean z, com.google.gson.t.d dVar) {
        return (dVar.d(field.getType(), z) || dVar.h(field, z)) ? false : true;
    }

    private Map<String, c> e(com.google.gson.e eVar, com.google.gson.u.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        com.google.gson.u.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean c2 = c(field, true);
                boolean c3 = c(field, z);
                if (c2 || c3) {
                    this.f16937j.b(field);
                    Type p = com.google.gson.t.b.p(aVar2.getType(), cls2, field.getGenericType());
                    List<String> f2 = f(field);
                    int size = f2.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = f2.get(i3);
                        boolean z2 = i3 != 0 ? false : c2;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = f2;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, com.google.gson.u.a.get(p), z2, c3)) : cVar2;
                        i3 = i4 + 1;
                        c2 = z2;
                        f2 = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = com.google.gson.u.a.get(com.google.gson.t.b.p(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        com.google.gson.s.c cVar = (com.google.gson.s.c) field.getAnnotation(com.google.gson.s.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f16934g.d(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.r
    public <T> q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.f16933f.a(aVar), e(eVar, aVar, rawType));
        }
        return null;
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f16935h);
    }
}
