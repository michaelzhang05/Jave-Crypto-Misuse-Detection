package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    private static final r f17605c = f(p.f17801a);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f17606a;

    /* renamed from: b, reason: collision with root package name */
    private final q f17607b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17609a;

        static {
            int[] iArr = new int[EnumC3597b.values().length];
            f17609a = iArr;
            try {
                iArr[EnumC3597b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17609a[EnumC3597b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17609a[EnumC3597b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17609a[EnumC3597b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17609a[EnumC3597b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17609a[EnumC3597b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static r e(q qVar) {
        if (qVar == p.f17801a) {
            return f17605c;
        }
        return f(qVar);
    }

    private static r f(final q qVar) {
        return new r() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(gson, q.this);
            }
        };
    }

    private Object g(C3596a c3596a, EnumC3597b enumC3597b) {
        int i8 = a.f17609a[enumC3597b.ordinal()];
        if (i8 != 3) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        c3596a.J();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + enumC3597b);
                }
                return Boolean.valueOf(c3596a.A());
            }
            return this.f17607b.a(c3596a);
        }
        return c3596a.L();
    }

    private Object h(C3596a c3596a, EnumC3597b enumC3597b) {
        int i8 = a.f17609a[enumC3597b.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return null;
            }
            c3596a.b();
            return new g();
        }
        c3596a.a();
        return new ArrayList();
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3596a c3596a) {
        String str;
        boolean z8;
        EnumC3597b N8 = c3596a.N();
        Object h8 = h(c3596a, N8);
        if (h8 == null) {
            return g(c3596a, N8);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3596a.t()) {
                if (h8 instanceof Map) {
                    str = c3596a.H();
                } else {
                    str = null;
                }
                EnumC3597b N9 = c3596a.N();
                Object h9 = h(c3596a, N9);
                if (h9 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (h9 == null) {
                    h9 = g(c3596a, N9);
                }
                if (h8 instanceof List) {
                    ((List) h8).add(h9);
                } else {
                    ((Map) h8).put(str, h9);
                }
                if (z8) {
                    arrayDeque.addLast(h8);
                    h8 = h9;
                }
            } else {
                if (h8 instanceof List) {
                    c3596a.h();
                } else {
                    c3596a.l();
                }
                if (arrayDeque.isEmpty()) {
                    return h8;
                }
                h8 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.x();
            return;
        }
        TypeAdapter l8 = this.f17606a.l(obj.getClass());
        if (l8 instanceof ObjectTypeAdapter) {
            cVar.f();
            cVar.l();
        } else {
            l8.d(cVar, obj);
        }
    }

    private ObjectTypeAdapter(Gson gson, q qVar) {
        this.f17606a = gson;
        this.f17607b = qVar;
    }
}
