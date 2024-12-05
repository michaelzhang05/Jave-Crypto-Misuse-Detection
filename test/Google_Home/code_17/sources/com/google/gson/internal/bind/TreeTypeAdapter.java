package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import s1.C3990a;
import s1.c;

/* loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    final Gson f18690a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeToken f18691b;

    /* renamed from: c, reason: collision with root package name */
    private final r f18692c;

    /* renamed from: d, reason: collision with root package name */
    private final b f18693d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18694e;

    /* renamed from: f, reason: collision with root package name */
    private volatile TypeAdapter f18695f;

    /* loaded from: classes4.dex */
    private static final class SingleTypeFactory implements r {

        /* renamed from: a, reason: collision with root package name */
        private final TypeToken f18696a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f18697b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f18698c;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            boolean isAssignableFrom;
            TypeToken typeToken2 = this.f18696a;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.f18697b || this.f18696a.d() != typeToken.c())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f18698c.isAssignableFrom(typeToken.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    private final class b {
        private b() {
        }
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar, boolean z8) {
        this.f18693d = new b();
        this.f18690a = gson;
        this.f18691b = typeToken;
        this.f18692c = rVar;
        this.f18694e = z8;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f18695f;
        if (typeAdapter == null) {
            TypeAdapter m8 = this.f18690a.m(this.f18692c, this.f18691b);
            this.f18695f = m8;
            return m8;
        }
        return typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3990a c3990a) {
        return f().b(c3990a);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        f().d(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter e() {
        return f();
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar) {
        this(lVar, eVar, gson, typeToken, rVar, true);
    }
}
