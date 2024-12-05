package o7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: o7.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3725i extends AbstractC3723g {

    /* renamed from: b, reason: collision with root package name */
    private final C3727k f36860b;

    /* renamed from: c, reason: collision with root package name */
    private final C3721e f36861c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f36862d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f36863e;

    public C3725i(C3727k c3727k, C3721e c3721e, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f36860b = c3727k;
        this.f36861c = c3721e;
        this.f36862d = H7.a.d(bArr2);
        this.f36863e = H7.a.d(bArr);
    }

    public static C3725i a(Object obj) {
        if (obj instanceof C3725i) {
            return (C3725i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C3727k e8 = C3727k.e(dataInputStream.readInt());
            C3721e e9 = C3721e.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e8.d()];
            dataInputStream.readFully(bArr2);
            return new C3725i(e8, e9, bArr2, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3725i a8 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a8;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof InputStream) {
                return a(J7.a.b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    byte[] b() {
        return C3717a.f().i(this.f36860b.f()).i(this.f36861c.f()).d(this.f36862d).d(this.f36863e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3725i c3725i = (C3725i) obj;
        if (!this.f36860b.equals(c3725i.f36860b) || !this.f36861c.equals(c3725i.f36861c) || !H7.a.a(this.f36862d, c3725i.f36862d)) {
            return false;
        }
        return H7.a.a(this.f36863e, c3725i.f36863e);
    }

    @Override // o7.AbstractC3723g, H7.c
    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.f36860b.hashCode() * 31) + this.f36861c.hashCode()) * 31) + H7.a.k(this.f36862d)) * 31) + H7.a.k(this.f36863e);
    }
}
