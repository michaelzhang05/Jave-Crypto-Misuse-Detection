package o7;

import java.io.ByteArrayOutputStream;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3717a {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f36820a = new ByteArrayOutputStream();

    private C3717a() {
    }

    public static C3717a f() {
        return new C3717a();
    }

    public C3717a a(boolean z8) {
        this.f36820a.write(z8 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f36820a.toByteArray();
    }

    public C3717a c(H7.c cVar) {
        try {
            this.f36820a.write(cVar.getEncoded());
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3717a d(byte[] bArr) {
        try {
            this.f36820a.write(bArr);
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3717a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f36820a.write(bArr2);
            }
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3717a g(int i8, int i9) {
        while (this.f36820a.size() < i9) {
            this.f36820a.write(i8);
        }
        return this;
    }

    public C3717a h(int i8) {
        int i9 = i8 & 65535;
        this.f36820a.write((byte) (i9 >>> 8));
        this.f36820a.write((byte) i9);
        return this;
    }

    public C3717a i(int i8) {
        this.f36820a.write((byte) (i8 >>> 24));
        this.f36820a.write((byte) (i8 >>> 16));
        this.f36820a.write((byte) (i8 >>> 8));
        this.f36820a.write((byte) i8);
        return this;
    }

    public C3717a j(long j8) {
        i((int) (j8 >>> 32));
        i((int) j8);
        return this;
    }
}
