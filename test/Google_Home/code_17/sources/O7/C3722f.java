package o7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: o7.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3722f implements H7.c {

    /* renamed from: a, reason: collision with root package name */
    private final C3721e f36844a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36845b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f36846c;

    public C3722f(C3721e c3721e, byte[] bArr, byte[] bArr2) {
        this.f36844a = c3721e;
        this.f36845b = bArr;
        this.f36846c = bArr2;
    }

    public static C3722f a(Object obj) {
        if (obj instanceof C3722f) {
            return (C3722f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C3721e e8 = C3721e.e(dataInputStream.readInt());
            byte[] bArr = new byte[e8.c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e8.d() * e8.c()];
            dataInputStream.readFully(bArr2);
            return new C3722f(e8, bArr, bArr2);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3722f a8 = a(dataInputStream3);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3722f c3722f = (C3722f) obj;
        C3721e c3721e = this.f36844a;
        if (c3721e == null ? c3722f.f36844a != null : !c3721e.equals(c3722f.f36844a)) {
            return false;
        }
        if (!Arrays.equals(this.f36845b, c3722f.f36845b)) {
            return false;
        }
        return Arrays.equals(this.f36846c, c3722f.f36846c);
    }

    @Override // H7.c
    public byte[] getEncoded() {
        return C3717a.f().i(this.f36844a.f()).d(this.f36845b).d(this.f36846c).b();
    }

    public int hashCode() {
        int i8;
        C3721e c3721e = this.f36844a;
        if (c3721e != null) {
            i8 = c3721e.hashCode();
        } else {
            i8 = 0;
        }
        return (((i8 * 31) + Arrays.hashCode(this.f36845b)) * 31) + Arrays.hashCode(this.f36846c);
    }
}
