package o7;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3719c extends AbstractC3723g {

    /* renamed from: b, reason: collision with root package name */
    private final int f36823b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36824c;

    /* renamed from: d, reason: collision with root package name */
    private List f36825d;

    /* renamed from: e, reason: collision with root package name */
    private List f36826e;

    /* renamed from: f, reason: collision with root package name */
    private final long f36827f;

    /* renamed from: g, reason: collision with root package name */
    private long f36828g;

    /* renamed from: h, reason: collision with root package name */
    private C3720d f36829h;

    private C3719c(int i8, List list, List list2, long j8, long j9, boolean z8) {
        super(true);
        this.f36828g = 0L;
        this.f36823b = i8;
        this.f36825d = DesugarCollections.unmodifiableList(list);
        this.f36826e = DesugarCollections.unmodifiableList(list2);
        this.f36828g = j8;
        this.f36827f = j9;
        this.f36824c = z8;
    }

    public static C3719c a(Object obj) {
        if (obj instanceof C3719c) {
            return (C3719c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                int readInt = dataInputStream.readInt();
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                boolean readBoolean = dataInputStream.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < readInt; i8++) {
                    arrayList.add(C3724h.e(obj));
                }
                for (int i9 = 0; i9 < readInt - 1; i9++) {
                    arrayList2.add(C3726j.a(obj));
                }
                return new C3719c(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3719c a8 = a(dataInputStream3);
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

    public static C3719c b(byte[] bArr, byte[] bArr2) {
        C3719c a8 = a(bArr);
        a8.f36829h = C3720d.a(bArr2);
        return a8;
    }

    private static C3719c f(C3719c c3719c) {
        try {
            return a(c3719c.getEncoded());
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public int c() {
        return this.f36823b;
    }

    protected Object clone() {
        return f(this);
    }

    public synchronized C3720d d() {
        return new C3720d(this.f36823b, e().i());
    }

    C3724h e() {
        return (C3724h) this.f36825d.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3719c c3719c = (C3719c) obj;
        if (this.f36823b != c3719c.f36823b || this.f36824c != c3719c.f36824c || this.f36827f != c3719c.f36827f || this.f36828g != c3719c.f36828g || !this.f36825d.equals(c3719c.f36825d)) {
            return false;
        }
        return this.f36826e.equals(c3719c.f36826e);
    }

    @Override // o7.AbstractC3723g, H7.c
    public synchronized byte[] getEncoded() {
        C3717a a8;
        try {
            a8 = C3717a.f().i(0).i(this.f36823b).j(this.f36828g).j(this.f36827f).a(this.f36824c);
            Iterator it = this.f36825d.iterator();
            while (it.hasNext()) {
                a8.c((C3724h) it.next());
            }
            Iterator it2 = this.f36826e.iterator();
            while (it2.hasNext()) {
                a8.c((C3726j) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return a8.b();
    }

    public int hashCode() {
        int hashCode = ((((((this.f36823b * 31) + (this.f36824c ? 1 : 0)) * 31) + this.f36825d.hashCode()) * 31) + this.f36826e.hashCode()) * 31;
        long j8 = this.f36827f;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f36828g;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
