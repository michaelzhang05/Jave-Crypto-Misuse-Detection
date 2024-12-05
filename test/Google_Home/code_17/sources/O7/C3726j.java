package o7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: o7.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3726j implements H7.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f36864a;

    /* renamed from: b, reason: collision with root package name */
    private final C3722f f36865b;

    /* renamed from: c, reason: collision with root package name */
    private final C3727k f36866c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f36867d;

    public C3726j(int i8, C3722f c3722f, C3727k c3727k, byte[][] bArr) {
        this.f36864a = i8;
        this.f36865b = c3722f;
        this.f36866c = c3727k;
        this.f36867d = bArr;
    }

    public static C3726j a(Object obj) {
        if (obj instanceof C3726j) {
            return (C3726j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            C3722f a8 = C3722f.a(obj);
            C3727k e8 = C3727k.e(dataInputStream.readInt());
            int c8 = e8.c();
            byte[][] bArr = new byte[c8];
            for (int i8 = 0; i8 < c8; i8++) {
                byte[] bArr2 = new byte[e8.d()];
                bArr[i8] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C3726j(readInt, a8, e8, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3726j a9 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a9;
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
        C3726j c3726j = (C3726j) obj;
        if (this.f36864a != c3726j.f36864a) {
            return false;
        }
        C3722f c3722f = this.f36865b;
        if (c3722f == null ? c3726j.f36865b != null : !c3722f.equals(c3726j.f36865b)) {
            return false;
        }
        C3727k c3727k = this.f36866c;
        if (c3727k == null ? c3726j.f36866c != null : !c3727k.equals(c3726j.f36866c)) {
            return false;
        }
        return Arrays.deepEquals(this.f36867d, c3726j.f36867d);
    }

    @Override // H7.c
    public byte[] getEncoded() {
        return C3717a.f().i(this.f36864a).d(this.f36865b.getEncoded()).i(this.f36866c.f()).e(this.f36867d).b();
    }

    public int hashCode() {
        int i8;
        int i9 = this.f36864a * 31;
        C3722f c3722f = this.f36865b;
        int i10 = 0;
        if (c3722f != null) {
            i8 = c3722f.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i9 + i8) * 31;
        C3727k c3727k = this.f36866c;
        if (c3727k != null) {
            i10 = c3727k.hashCode();
        }
        return ((i11 + i10) * 31) + Arrays.deepHashCode(this.f36867d);
    }
}
