package com.google.gson.t;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.t.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes2.dex */
public final class l {
    public static com.google.gson.j a(com.google.gson.stream.a aVar) throws JsonParseException {
        boolean z;
        try {
            try {
                aVar.x0();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return n.X.b(aVar);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return com.google.gson.k.a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    public static void b(com.google.gson.j jVar, com.google.gson.stream.c cVar) throws IOException {
        n.X.d(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    /* loaded from: classes2.dex */
    private static final class a extends Writer {

        /* renamed from: f, reason: collision with root package name */
        private final Appendable f16916f;

        /* renamed from: g, reason: collision with root package name */
        private final C0204a f16917g = new C0204a();

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.t.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0204a implements CharSequence {

            /* renamed from: f, reason: collision with root package name */
            char[] f16918f;

            C0204a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f16918f[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f16918f.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f16918f, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f16916f = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            C0204a c0204a = this.f16917g;
            c0204a.f16918f = cArr;
            this.f16916f.append(c0204a, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f16916f.append((char) i2);
        }
    }
}
