package o7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: o7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3720d extends AbstractC3723g {

    /* renamed from: b, reason: collision with root package name */
    private final int f36830b;

    /* renamed from: c, reason: collision with root package name */
    private final C3725i f36831c;

    public C3720d(int i8, C3725i c3725i) {
        super(false);
        this.f36830b = i8;
        this.f36831c = c3725i;
    }

    public static C3720d a(Object obj) {
        if (obj instanceof C3720d) {
            return (C3720d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C3720d(((DataInputStream) obj).readInt(), C3725i.a(obj));
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream = null;
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3720d a8 = a(dataInputStream2);
                    dataInputStream2.close();
                    return a8;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        dataInputStream.close();
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

    public int b() {
        return this.f36830b;
    }

    public C3725i c() {
        return this.f36831c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3720d c3720d = (C3720d) obj;
        if (this.f36830b != c3720d.f36830b) {
            return false;
        }
        return this.f36831c.equals(c3720d.f36831c);
    }

    @Override // o7.AbstractC3723g, H7.c
    public byte[] getEncoded() {
        return C3717a.f().i(this.f36830b).d(this.f36831c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f36830b * 31) + this.f36831c.hashCode();
    }
}
