package l7;

import java.io.ByteArrayOutputStream;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3368a {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f34803a = new ByteArrayOutputStream();

    private C3368a() {
    }

    public static C3368a f() {
        return new C3368a();
    }

    public C3368a a(boolean z8) {
        this.f34803a.write(z8 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f34803a.toByteArray();
    }

    public C3368a c(E7.c cVar) {
        try {
            this.f34803a.write(cVar.getEncoded());
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3368a d(byte[] bArr) {
        try {
            this.f34803a.write(bArr);
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3368a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f34803a.write(bArr2);
            }
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3368a g(int i8, int i9) {
        while (this.f34803a.size() < i9) {
            this.f34803a.write(i8);
        }
        return this;
    }

    public C3368a h(int i8) {
        int i9 = i8 & 65535;
        this.f34803a.write((byte) (i9 >>> 8));
        this.f34803a.write((byte) i9);
        return this;
    }

    public C3368a i(int i8) {
        this.f34803a.write((byte) (i8 >>> 24));
        this.f34803a.write((byte) (i8 >>> 16));
        this.f34803a.write((byte) (i8 >>> 8));
        this.f34803a.write((byte) i8);
        return this;
    }

    public C3368a j(long j8) {
        i((int) (j8 >>> 32));
        i((int) j8);
        return this;
    }
}
