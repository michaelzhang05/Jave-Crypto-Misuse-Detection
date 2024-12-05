package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    private static final r f18656b = f(p.f18857b);

    /* renamed from: a, reason: collision with root package name */
    private final q f18657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18659a;

        static {
            int[] iArr = new int[EnumC3991b.values().length];
            f18659a = iArr;
            try {
                iArr[EnumC3991b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18659a[EnumC3991b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18659a[EnumC3991b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(q qVar) {
        this.f18657a = qVar;
    }

    public static r e(q qVar) {
        if (qVar == p.f18857b) {
            return f18656b;
        }
        return f(qVar);
    }

    private static r f(q qVar) {
        return new r() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(C3990a c3990a) {
        EnumC3991b N8 = c3990a.N();
        int i8 = a.f18659a[N8.ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                throw new m("Expecting number, got: " + N8 + "; at path " + c3990a.getPath());
            }
            return this.f18657a.a(c3990a);
        }
        c3990a.J();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Number number) {
        cVar.P(number);
    }
}
