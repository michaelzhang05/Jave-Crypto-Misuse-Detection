package com.google.gson.t.n;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes2.dex */
public final class f extends com.google.gson.stream.c {
    private static final Writer q = new a();
    private static final com.google.gson.m r = new com.google.gson.m("closed");
    private final List<com.google.gson.j> s;
    private String t;
    private com.google.gson.j u;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes2.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(q);
        this.s = new ArrayList();
        this.u = com.google.gson.k.a;
    }

    private com.google.gson.j E0() {
        return this.s.get(r0.size() - 1);
    }

    private void F0(com.google.gson.j jVar) {
        if (this.t != null) {
            if (!jVar.w() || J()) {
                ((com.google.gson.l) E0()).D(this.t, jVar);
            }
            this.t = null;
            return;
        }
        if (this.s.isEmpty()) {
            this.u = jVar;
            return;
        }
        com.google.gson.j E0 = E0();
        if (E0 instanceof com.google.gson.g) {
            ((com.google.gson.g) E0).D(jVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c A0(String str) throws IOException {
        if (str == null) {
            return c0();
        }
        F0(new com.google.gson.m(str));
        return this;
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c B0(boolean z) throws IOException {
        F0(new com.google.gson.m(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c D() throws IOException {
        if (!this.s.isEmpty() && this.t == null) {
            if (E0() instanceof com.google.gson.l) {
                this.s.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public com.google.gson.j D0() {
        if (this.s.isEmpty()) {
            return this.u;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.s);
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c T(String str) throws IOException {
        if (!this.s.isEmpty() && this.t == null) {
            if (E0() instanceof com.google.gson.l) {
                this.t = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c c0() throws IOException {
        F0(com.google.gson.k.a);
        return this;
    }

    @Override // com.google.gson.stream.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.s.isEmpty()) {
            this.s.add(r);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c f() throws IOException {
        com.google.gson.g gVar = new com.google.gson.g();
        F0(gVar);
        this.s.add(gVar);
        return this;
    }

    @Override // com.google.gson.stream.c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c o() throws IOException {
        com.google.gson.l lVar = new com.google.gson.l();
        F0(lVar);
        this.s.add(lVar);
        return this;
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c x0(long j2) throws IOException {
        F0(new com.google.gson.m(Long.valueOf(j2)));
        return this;
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c y0(Boolean bool) throws IOException {
        if (bool == null) {
            return c0();
        }
        F0(new com.google.gson.m(bool));
        return this;
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c z() throws IOException {
        if (!this.s.isEmpty() && this.t == null) {
            if (E0() instanceof com.google.gson.g) {
                this.s.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.c
    public com.google.gson.stream.c z0(Number number) throws IOException {
        if (number == null) {
            return c0();
        }
        if (!P()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        F0(new com.google.gson.m(number));
        return this;
    }
}
