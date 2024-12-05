package com.squareup.moshi;

import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* compiled from: JsonAdapter.java */
/* loaded from: classes2.dex */
public abstract class f<T> {

    /* compiled from: JsonAdapter.java */
    /* loaded from: classes2.dex */
    class a extends f<T> {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(i iVar) throws IOException {
            return (T) this.a.fromJson(iVar);
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, T t) throws IOException {
            boolean D = oVar.D();
            oVar.s0(true);
            try {
                this.a.toJson(oVar, (o) t);
            } finally {
                oVar.s0(D);
            }
        }

        public String toString() {
            return this.a + ".serializeNulls()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* loaded from: classes2.dex */
    class b extends f<T> {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(i iVar) throws IOException {
            boolean D = iVar.D();
            iVar.v0(true);
            try {
                return (T) this.a.fromJson(iVar);
            } finally {
                iVar.v0(D);
            }
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, T t) throws IOException {
            boolean J = oVar.J();
            oVar.q0(true);
            try {
                this.a.toJson(oVar, (o) t);
            } finally {
                oVar.q0(J);
            }
        }

        public String toString() {
            return this.a + ".lenient()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* loaded from: classes2.dex */
    class c extends f<T> {
        final /* synthetic */ f a;

        c(f fVar) {
            this.a = fVar;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(i iVar) throws IOException {
            boolean w = iVar.w();
            iVar.u0(true);
            try {
                return (T) this.a.fromJson(iVar);
            } finally {
                iVar.u0(w);
            }
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, T t) throws IOException {
            this.a.toJson(oVar, (o) t);
        }

        public String toString() {
            return this.a + ".failOnUnknown()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* loaded from: classes2.dex */
    class d extends f<T> {
        final /* synthetic */ f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17247b;

        d(f fVar, String str) {
            this.a = fVar;
            this.f17247b = str;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(i iVar) throws IOException {
            return (T) this.a.fromJson(iVar);
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, T t) throws IOException {
            String z = oVar.z();
            oVar.k0(this.f17247b);
            try {
                this.a.toJson(oVar, (o) t);
            } finally {
                oVar.k0(z);
            }
        }

        public String toString() {
            return this.a + ".indent(\"" + this.f17247b + "\")";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* loaded from: classes2.dex */
    public interface e {
        f<?> a(Type type, Set<? extends Annotation> set, r rVar);
    }

    public final f<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(i iVar) throws IOException;

    public final T fromJson(j.h hVar) throws IOException {
        return fromJson(i.g0(hVar));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new m(obj));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public f<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final f<T> lenient() {
        return new b(this);
    }

    public final f<T> nonNull() {
        return this instanceof com.squareup.moshi.w.a ? this : new com.squareup.moshi.w.a(this);
    }

    public final f<T> nullSafe() {
        return this instanceof com.squareup.moshi.w.b ? this : new com.squareup.moshi.w.b(this);
    }

    public final f<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(o oVar, T t) throws IOException;

    public final void toJson(j.g gVar, T t) throws IOException {
        toJson(o.T(gVar), (o) t);
    }

    public final Object toJsonValue(T t) {
        n nVar = new n();
        try {
            toJson((o) nVar, (n) t);
            return nVar.z0();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final T fromJson(String str) throws IOException {
        i g0 = i.g0(new j.f().M(str));
        T fromJson = fromJson(g0);
        if (isLenient() || g0.i0() == i.b.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        j.f fVar = new j.f();
        try {
            toJson((j.g) fVar, (j.f) t);
            return fVar.D0();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
