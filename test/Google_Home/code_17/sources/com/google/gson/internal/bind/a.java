package com.google.gson.internal.bind;

import com.google.gson.d;
import com.google.gson.f;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import s1.c;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: p, reason: collision with root package name */
    private static final Writer f18773p = new C0380a();

    /* renamed from: q, reason: collision with root package name */
    private static final k f18774q = new k("closed");

    /* renamed from: m, reason: collision with root package name */
    private final List f18775m;

    /* renamed from: n, reason: collision with root package name */
    private String f18776n;

    /* renamed from: o, reason: collision with root package name */
    private f f18777o;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0380a extends Writer {
        C0380a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public a() {
        super(f18773p);
        this.f18775m = new ArrayList();
        this.f18777o = h.f18615a;
    }

    private f U() {
        return (f) this.f18775m.get(r0.size() - 1);
    }

    private void V(f fVar) {
        if (this.f18776n != null) {
            if (!fVar.j() || o()) {
                ((i) U()).m(this.f18776n, fVar);
            }
            this.f18776n = null;
            return;
        }
        if (this.f18775m.isEmpty()) {
            this.f18777o = fVar;
            return;
        }
        f U8 = U();
        if (U8 instanceof d) {
            ((d) U8).m(fVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // s1.c
    public c A() {
        V(h.f18615a);
        return this;
    }

    @Override // s1.c
    public c M(double d8) {
        if (!u() && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d8);
        }
        V(new k(Double.valueOf(d8)));
        return this;
    }

    @Override // s1.c
    public c N(long j8) {
        V(new k(Long.valueOf(j8)));
        return this;
    }

    @Override // s1.c
    public c O(Boolean bool) {
        if (bool == null) {
            return A();
        }
        V(new k(bool));
        return this;
    }

    @Override // s1.c
    public c P(Number number) {
        if (number == null) {
            return A();
        }
        if (!u()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        V(new k(number));
        return this;
    }

    @Override // s1.c
    public c Q(String str) {
        if (str == null) {
            return A();
        }
        V(new k(str));
        return this;
    }

    @Override // s1.c
    public c R(boolean z8) {
        V(new k(Boolean.valueOf(z8)));
        return this;
    }

    public f T() {
        if (this.f18775m.isEmpty()) {
            return this.f18777o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f18775m);
    }

    @Override // s1.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f18775m.isEmpty()) {
            this.f18775m.add(f18774q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // s1.c
    public c f() {
        d dVar = new d();
        V(dVar);
        this.f18775m.add(dVar);
        return this;
    }

    @Override // s1.c, java.io.Flushable
    public void flush() {
    }

    @Override // s1.c
    public c g() {
        i iVar = new i();
        V(iVar);
        this.f18775m.add(iVar);
        return this;
    }

    @Override // s1.c
    public c m() {
        if (!this.f18775m.isEmpty() && this.f18776n == null) {
            if (U() instanceof d) {
                this.f18775m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // s1.c
    public c n() {
        if (!this.f18775m.isEmpty() && this.f18776n == null) {
            if (U() instanceof i) {
                this.f18775m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // s1.c
    public c x(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f18775m.isEmpty() && this.f18776n == null) {
            if (U() instanceof i) {
                this.f18776n = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
