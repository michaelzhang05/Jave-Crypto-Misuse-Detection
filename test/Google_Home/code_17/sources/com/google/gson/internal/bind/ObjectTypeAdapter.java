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
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    private static final r f18660c = f(p.f18856a);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f18661a;

    /* renamed from: b, reason: collision with root package name */
    private final q f18662b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18664a;

        static {
            int[] iArr = new int[EnumC3991b.values().length];
            f18664a = iArr;
            try {
                iArr[EnumC3991b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18664a[EnumC3991b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18664a[EnumC3991b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18664a[EnumC3991b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18664a[EnumC3991b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18664a[EnumC3991b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static r e(q qVar) {
        if (qVar == p.f18856a) {
            return f18660c;
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

    private Object g(C3990a c3990a, EnumC3991b enumC3991b) {
        int i8 = a.f18664a[enumC3991b.ordinal()];
        if (i8 != 3) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        c3990a.J();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + enumC3991b);
                }
                return Boolean.valueOf(c3990a.D());
            }
            return this.f18662b.a(c3990a);
        }
        return c3990a.L();
    }

    private Object h(C3990a c3990a, EnumC3991b enumC3991b) {
        int i8 = a.f18664a[enumC3991b.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return null;
            }
            c3990a.b();
            return new g();
        }
        c3990a.a();
        return new ArrayList();
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3990a c3990a) {
        String str;
        boolean z8;
        EnumC3991b N8 = c3990a.N();
        Object h8 = h(c3990a, N8);
        if (h8 == null) {
            return g(c3990a, N8);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3990a.v()) {
                if (h8 instanceof Map) {
                    str = c3990a.H();
                } else {
                    str = null;
                }
                EnumC3991b N9 = c3990a.N();
                Object h9 = h(c3990a, N9);
                if (h9 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (h9 == null) {
                    h9 = g(c3990a, N9);
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
                    c3990a.m();
                } else {
                    c3990a.n();
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
            cVar.A();
            return;
        }
        TypeAdapter l8 = this.f18661a.l(obj.getClass());
        if (l8 instanceof ObjectTypeAdapter) {
            cVar.g();
            cVar.n();
        } else {
            l8.d(cVar, obj);
        }
    }

    private ObjectTypeAdapter(Gson gson, q qVar) {
        this.f18661a = gson;
        this.f18662b = qVar;
    }
}
