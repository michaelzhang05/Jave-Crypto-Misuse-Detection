package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: l7.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3376i extends AbstractC3374g {

    /* renamed from: b, reason: collision with root package name */
    private final C3378k f34843b;

    /* renamed from: c, reason: collision with root package name */
    private final C3372e f34844c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f34845d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f34846e;

    public C3376i(C3378k c3378k, C3372e c3372e, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f34843b = c3378k;
        this.f34844c = c3372e;
        this.f34845d = E7.a.d(bArr2);
        this.f34846e = E7.a.d(bArr);
    }

    public static C3376i a(Object obj) {
        if (obj instanceof C3376i) {
            return (C3376i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C3378k e8 = C3378k.e(dataInputStream.readInt());
            C3372e e9 = C3372e.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e8.d()];
            dataInputStream.readFully(bArr2);
            return new C3376i(e8, e9, bArr2, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3376i a8 = a(dataInputStream3);
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
                return a(G7.a.b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    byte[] b() {
        return C3368a.f().i(this.f34843b.f()).i(this.f34844c.f()).d(this.f34845d).d(this.f34846e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3376i c3376i = (C3376i) obj;
        if (!this.f34843b.equals(c3376i.f34843b) || !this.f34844c.equals(c3376i.f34844c) || !E7.a.a(this.f34845d, c3376i.f34845d)) {
            return false;
        }
        return E7.a.a(this.f34846e, c3376i.f34846e);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.f34843b.hashCode() * 31) + this.f34844c.hashCode()) * 31) + E7.a.k(this.f34845d)) * 31) + E7.a.k(this.f34846e);
    }
}
