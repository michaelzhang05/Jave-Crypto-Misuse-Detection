package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    private static final r f17601b = f(p.f17802b);

    /* renamed from: a, reason: collision with root package name */
    private final q f17602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17604a;

        static {
            int[] iArr = new int[EnumC3597b.values().length];
            f17604a = iArr;
            try {
                iArr[EnumC3597b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17604a[EnumC3597b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17604a[EnumC3597b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(q qVar) {
        this.f17602a = qVar;
    }

    public static r e(q qVar) {
        if (qVar == p.f17802b) {
            return f17601b;
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
    public Number b(C3596a c3596a) {
        EnumC3597b N8 = c3596a.N();
        int i8 = a.f17604a[N8.ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                throw new m("Expecting number, got: " + N8 + "; at path " + c3596a.getPath());
            }
            return this.f17602a.a(c3596a);
        }
        c3596a.J();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Number number) {
        cVar.P(number);
    }
}
