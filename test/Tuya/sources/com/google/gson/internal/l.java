package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import j$.util.Objects;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class l {
    public static void a(com.google.gson.f fVar, p1.c cVar) {
        TypeAdapters.f17669V.d(cVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new b(appendable);
    }

    /* loaded from: classes3.dex */
    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f17770a;

        /* renamed from: b, reason: collision with root package name */
        private final a f17771b = new a();

        /* loaded from: classes3.dex */
        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f17772a;

            /* renamed from: b, reason: collision with root package name */
            private String f17773b;

            private a() {
            }

            void a(char[] cArr) {
                this.f17772a = cArr;
                this.f17773b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i8) {
                return this.f17772a[i8];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f17772a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i8, int i9) {
                return new String(this.f17772a, i8, i9 - i8);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f17773b == null) {
                    this.f17773b = new String(this.f17772a);
                }
                return this.f17773b;
            }
        }

        b(Appendable appendable) {
            this.f17770a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            this.f17771b.a(cArr);
            this.f17770a.append(this.f17771b, i8, i9 + i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            this.f17770a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i8) {
            this.f17770a.append((char) i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i8, int i9) {
            this.f17770a.append(charSequence, i8, i9);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i8, int i9) {
            Objects.requireNonNull(str);
            this.f17770a.append(str, i8, i9 + i8);
        }
    }
}
