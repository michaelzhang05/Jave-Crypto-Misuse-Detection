package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.InterfaceC3737a;
import s1.C3990a;

/* loaded from: classes4.dex */
public final class Excluder implements r, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Excluder f18617g = new Excluder();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18621d;

    /* renamed from: a, reason: collision with root package name */
    private double f18618a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f18619b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18620c = true;

    /* renamed from: e, reason: collision with root package name */
    private List f18622e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List f18623f = Collections.emptyList();

    private boolean d(Class cls) {
        if (this.f18618a != -1.0d && !l((p1.d) cls.getAnnotation(p1.d.class), (p1.e) cls.getAnnotation(p1.e.class))) {
            return true;
        }
        if (!this.f18620c && h(cls)) {
            return true;
        }
        return g(cls);
    }

    private boolean e(Class cls, boolean z8) {
        List list;
        if (z8) {
            list = this.f18622e;
        } else {
            list = this.f18623f;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    private boolean g(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && !i(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean h(Class cls) {
        if (cls.isMemberClass() && !i(cls)) {
            return true;
        }
        return false;
    }

    private boolean i(Class cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean j(p1.d dVar) {
        if (dVar == null) {
            return true;
        }
        if (this.f18618a >= dVar.value()) {
            return true;
        }
        return false;
    }

    private boolean k(p1.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (this.f18618a < eVar.value()) {
            return true;
        }
        return false;
    }

    private boolean l(p1.d dVar, p1.e eVar) {
        if (j(dVar) && k(eVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(final Gson gson, final TypeToken typeToken) {
        final boolean z8;
        final boolean z9;
        Class c8 = typeToken.c();
        boolean d8 = d(c8);
        if (!d8 && !e(c8, true)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!d8 && !e(c8, false)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z8 && !z9) {
            return null;
        }
        return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: a, reason: collision with root package name */
            private TypeAdapter f18624a;

            private TypeAdapter e() {
                TypeAdapter typeAdapter = this.f18624a;
                if (typeAdapter == null) {
                    TypeAdapter m8 = gson.m(Excluder.this, typeToken);
                    this.f18624a = m8;
                    return m8;
                }
                return typeAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            public Object b(C3990a c3990a) {
                if (z9) {
                    c3990a.X();
                    return null;
                }
                return e().b(c3990a);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(s1.c cVar, Object obj) {
                if (z8) {
                    cVar.A();
                } else {
                    e().d(cVar, obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public boolean c(Class cls, boolean z8) {
        if (!d(cls) && !e(cls, z8)) {
            return false;
        }
        return true;
    }

    public boolean f(Field field, boolean z8) {
        List list;
        InterfaceC3737a interfaceC3737a;
        if ((this.f18619b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f18618a != -1.0d && !l((p1.d) field.getAnnotation(p1.d.class), (p1.e) field.getAnnotation(p1.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f18621d && ((interfaceC3737a = (InterfaceC3737a) field.getAnnotation(InterfaceC3737a.class)) == null || (!z8 ? !interfaceC3737a.deserialize() : !interfaceC3737a.serialize()))) {
            return true;
        }
        if ((!this.f18620c && h(field.getType())) || g(field.getType())) {
            return true;
        }
        if (z8) {
            list = this.f18622e;
        } else {
            list = this.f18623f;
        }
        if (!list.isEmpty()) {
            new com.google.gson.a(field);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
            return false;
        }
        return false;
    }
}
