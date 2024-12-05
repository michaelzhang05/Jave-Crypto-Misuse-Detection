package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: l7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3371d extends AbstractC3374g {

    /* renamed from: b, reason: collision with root package name */
    private final int f34813b;

    /* renamed from: c, reason: collision with root package name */
    private final C3376i f34814c;

    public C3371d(int i8, C3376i c3376i) {
        super(false);
        this.f34813b = i8;
        this.f34814c = c3376i;
    }

    public static C3371d a(Object obj) {
        if (obj instanceof C3371d) {
            return (C3371d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C3371d(((DataInputStream) obj).readInt(), C3376i.a(obj));
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream = null;
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3371d a8 = a(dataInputStream2);
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
                return a(G7.a.b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public int b() {
        return this.f34813b;
    }

    public C3376i c() {
        return this.f34814c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3371d c3371d = (C3371d) obj;
        if (this.f34813b != c3371d.f34813b) {
            return false;
        }
        return this.f34814c.equals(c3371d.f34814c);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34813b).d(this.f34814c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f34813b * 31) + this.f34814c.hashCode();
    }
}
