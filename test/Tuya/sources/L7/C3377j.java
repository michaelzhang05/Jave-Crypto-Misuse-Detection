package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: l7.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3377j implements E7.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f34847a;

    /* renamed from: b, reason: collision with root package name */
    private final C3373f f34848b;

    /* renamed from: c, reason: collision with root package name */
    private final C3378k f34849c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f34850d;

    public C3377j(int i8, C3373f c3373f, C3378k c3378k, byte[][] bArr) {
        this.f34847a = i8;
        this.f34848b = c3373f;
        this.f34849c = c3378k;
        this.f34850d = bArr;
    }

    public static C3377j a(Object obj) {
        if (obj instanceof C3377j) {
            return (C3377j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            C3373f a8 = C3373f.a(obj);
            C3378k e8 = C3378k.e(dataInputStream.readInt());
            int c8 = e8.c();
            byte[][] bArr = new byte[c8];
            for (int i8 = 0; i8 < c8; i8++) {
                byte[] bArr2 = new byte[e8.d()];
                bArr[i8] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C3377j(readInt, a8, e8, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3377j a9 = a(dataInputStream3);
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
        C3377j c3377j = (C3377j) obj;
        if (this.f34847a != c3377j.f34847a) {
            return false;
        }
        C3373f c3373f = this.f34848b;
        if (c3373f == null ? c3377j.f34848b != null : !c3373f.equals(c3377j.f34848b)) {
            return false;
        }
        C3378k c3378k = this.f34849c;
        if (c3378k == null ? c3377j.f34849c != null : !c3378k.equals(c3377j.f34849c)) {
            return false;
        }
        return Arrays.deepEquals(this.f34850d, c3377j.f34850d);
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34847a).d(this.f34848b.getEncoded()).i(this.f34849c.f()).e(this.f34850d).b();
    }

    public int hashCode() {
        int i8;
        int i9 = this.f34847a * 31;
        C3373f c3373f = this.f34848b;
        int i10 = 0;
        if (c3373f != null) {
            i8 = c3373f.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i9 + i8) * 31;
        C3378k c3378k = this.f34849c;
        if (c3378k != null) {
            i10 = c3378k.hashCode();
        }
        return ((i11 + i10) * 31) + Arrays.deepHashCode(this.f34850d);
    }
}
