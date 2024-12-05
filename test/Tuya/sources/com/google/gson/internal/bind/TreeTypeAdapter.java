package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import p1.C3596a;
import p1.c;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    final Gson f17635a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeToken f17636b;

    /* renamed from: c, reason: collision with root package name */
    private final r f17637c;

    /* renamed from: d, reason: collision with root package name */
    private final b f17638d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17639e;

    /* renamed from: f, reason: collision with root package name */
    private volatile TypeAdapter f17640f;

    /* loaded from: classes3.dex */
    private static final class SingleTypeFactory implements r {

        /* renamed from: a, reason: collision with root package name */
        private final TypeToken f17641a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17642b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f17643c;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            boolean isAssignableFrom;
            TypeToken typeToken2 = this.f17641a;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.f17642b || this.f17641a.d() != typeToken.c())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f17643c.isAssignableFrom(typeToken.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private final class b {
        private b() {
        }
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar, boolean z8) {
        this.f17638d = new b();
        this.f17635a = gson;
        this.f17636b = typeToken;
        this.f17637c = rVar;
        this.f17639e = z8;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f17640f;
        if (typeAdapter == null) {
            TypeAdapter m8 = this.f17635a.m(this.f17637c, this.f17636b);
            this.f17640f = m8;
            return m8;
        }
        return typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3596a c3596a) {
        return f().b(c3596a);
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
