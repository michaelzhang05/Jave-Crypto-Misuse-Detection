package com.google.gson.t.n;

import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes2.dex */
public final class h extends q<Object> {
    public static final r a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.e f16932b;

    /* compiled from: ObjectTypeAdapter.java */
    /* loaded from: classes2.dex */
    static class a implements r {
        a() {
        }

        @Override // com.google.gson.r
        public <T> q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new h(eVar);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.google.gson.stream.b.values().length];
            a = iArr;
            try {
                iArr[com.google.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.google.gson.stream.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.google.gson.stream.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.google.gson.stream.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.google.gson.stream.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.google.gson.stream.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(com.google.gson.e eVar) {
        this.f16932b = eVar;
    }

    @Override // com.google.gson.q
    public Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (b.a[aVar.x0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.L()) {
                    arrayList.add(b(aVar));
                }
                aVar.z();
                return arrayList;
            case 2:
                com.google.gson.t.h hVar = new com.google.gson.t.h();
                aVar.b();
                while (aVar.L()) {
                    hVar.put(aVar.q0(), b(aVar));
                }
                aVar.D();
                return hVar;
            case 3:
                return aVar.v0();
            case 4:
                return Double.valueOf(aVar.g0());
            case 5:
                return Boolean.valueOf(aVar.c0());
            case 6:
                aVar.t0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.q
    public void d(com.google.gson.stream.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.c0();
            return;
        }
        q k2 = this.f16932b.k(obj.getClass());
        if (k2 instanceof h) {
            cVar.o();
            cVar.D();
        } else {
            k2.d(cVar, obj);
        }
    }
}
