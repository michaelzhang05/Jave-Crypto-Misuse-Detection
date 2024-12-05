package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: l7.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3373f implements E7.c {

    /* renamed from: a, reason: collision with root package name */
    private final C3372e f34827a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34828b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f34829c;

    public C3373f(C3372e c3372e, byte[] bArr, byte[] bArr2) {
        this.f34827a = c3372e;
        this.f34828b = bArr;
        this.f34829c = bArr2;
    }

    public static C3373f a(Object obj) {
        if (obj instanceof C3373f) {
            return (C3373f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C3372e e8 = C3372e.e(dataInputStream.readInt());
            byte[] bArr = new byte[e8.c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e8.d() * e8.c()];
            dataInputStream.readFully(bArr2);
            return new C3373f(e8, bArr, bArr2);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3373f a8 = a(dataInputStream3);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3373f c3373f = (C3373f) obj;
        C3372e c3372e = this.f34827a;
        if (c3372e == null ? c3373f.f34827a != null : !c3372e.equals(c3373f.f34827a)) {
            return false;
        }
        if (!Arrays.equals(this.f34828b, c3373f.f34828b)) {
            return false;
        }
        return Arrays.equals(this.f34829c, c3373f.f34829c);
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34827a.f()).d(this.f34828b).d(this.f34829c).b();
    }

    public int hashCode() {
        int i8;
        C3372e c3372e = this.f34827a;
        if (c3372e != null) {
            i8 = c3372e.hashCode();
        } else {
            i8 = 0;
        }
        return (((i8 * 31) + Arrays.hashCode(this.f34828b)) * 31) + Arrays.hashCode(this.f34829c);
    }
}
