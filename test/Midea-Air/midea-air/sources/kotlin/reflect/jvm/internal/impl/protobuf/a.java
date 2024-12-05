package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes2.dex */
public abstract class a implements o {

    /* renamed from: f, reason: collision with root package name */
    protected int f21887f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException f() {
        return new UninitializedMessageException(this);
    }

    public void i(OutputStream outputStream) throws IOException {
        int e2 = e();
        CodedOutputStream J = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(e2) + e2));
        J.o0(e2);
        d(J);
        J.I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0372a<BuilderType extends AbstractC0372a> implements o.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException j(o oVar) {
            return new UninitializedMessageException(oVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: i */
        public abstract BuilderType w(e eVar, f fVar) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0373a extends FilterInputStream {

            /* renamed from: f, reason: collision with root package name */
            private int f21888f;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0373a(InputStream inputStream, int i2) {
                super(inputStream);
                this.f21888f = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f21888f);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f21888f <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f21888f--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                long skip = super.skip(Math.min(j2, this.f21888f));
                if (skip >= 0) {
                    this.f21888f = (int) (this.f21888f - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = this.f21888f;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f21888f -= read;
                }
                return read;
            }
        }
    }
}
