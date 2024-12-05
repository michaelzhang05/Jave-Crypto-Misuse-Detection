package J1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f4721a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f4722b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4723c;

    /* renamed from: d, reason: collision with root package name */
    private int f4724d;

    /* renamed from: e, reason: collision with root package name */
    private int f4725e;

    /* loaded from: classes3.dex */
    class a extends ByteArrayOutputStream {
        a(int i8) {
            super(i8);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i8 = ((ByteArrayOutputStream) this).count;
            if (i8 > 0 && ((ByteArrayOutputStream) this).buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i8, b.this.f4722b.name());
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.f4721a;
        byte[] bArr = this.f4723c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f4724d = 0;
            this.f4725e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4721a) {
            try {
                if (this.f4723c != null) {
                    this.f4723c = null;
                    this.f4721a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String e() {
        int i8;
        byte[] bArr;
        int i9;
        synchronized (this.f4721a) {
            try {
                if (this.f4723c != null) {
                    if (this.f4724d >= this.f4725e) {
                        b();
                    }
                    for (int i10 = this.f4724d; i10 != this.f4725e; i10++) {
                        byte[] bArr2 = this.f4723c;
                        if (bArr2[i10] == 10) {
                            int i11 = this.f4724d;
                            if (i10 != i11) {
                                i9 = i10 - 1;
                                if (bArr2[i9] == 13) {
                                    String str = new String(bArr2, i11, i9 - i11, this.f4722b.name());
                                    this.f4724d = i10 + 1;
                                    return str;
                                }
                            }
                            i9 = i10;
                            String str2 = new String(bArr2, i11, i9 - i11, this.f4722b.name());
                            this.f4724d = i10 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f4725e - this.f4724d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f4723c;
                        int i12 = this.f4724d;
                        aVar.write(bArr3, i12, this.f4725e - i12);
                        this.f4725e = -1;
                        b();
                        i8 = this.f4724d;
                        while (i8 != this.f4725e) {
                            bArr = this.f4723c;
                            if (bArr[i8] == 10) {
                                break loop1;
                            }
                            i8++;
                        }
                    }
                    int i13 = this.f4724d;
                    if (i8 != i13) {
                        aVar.write(bArr, i13, i8 - i13);
                    }
                    this.f4724d = i8 + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(InputStream inputStream, int i8, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i8 >= 0) {
            if (charset.equals(c.f4727a)) {
                this.f4721a = inputStream;
                this.f4722b = charset;
                this.f4723c = new byte[i8];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
