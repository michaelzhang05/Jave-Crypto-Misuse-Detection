package l7;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3370c extends AbstractC3374g {

    /* renamed from: b, reason: collision with root package name */
    private final int f34806b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34807c;

    /* renamed from: d, reason: collision with root package name */
    private List f34808d;

    /* renamed from: e, reason: collision with root package name */
    private List f34809e;

    /* renamed from: f, reason: collision with root package name */
    private final long f34810f;

    /* renamed from: g, reason: collision with root package name */
    private long f34811g;

    /* renamed from: h, reason: collision with root package name */
    private C3371d f34812h;

    private C3370c(int i8, List list, List list2, long j8, long j9, boolean z8) {
        super(true);
        this.f34811g = 0L;
        this.f34806b = i8;
        this.f34808d = DesugarCollections.unmodifiableList(list);
        this.f34809e = DesugarCollections.unmodifiableList(list2);
        this.f34811g = j8;
        this.f34810f = j9;
        this.f34807c = z8;
    }

    public static C3370c a(Object obj) {
        if (obj instanceof C3370c) {
            return (C3370c) obj;
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
                    arrayList.add(C3375h.e(obj));
                }
                for (int i9 = 0; i9 < readInt - 1; i9++) {
                    arrayList2.add(C3377j.a(obj));
                }
                return new C3370c(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3370c a8 = a(dataInputStream3);
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

    public static C3370c b(byte[] bArr, byte[] bArr2) {
        C3370c a8 = a(bArr);
        a8.f34812h = C3371d.a(bArr2);
        return a8;
    }

    private static C3370c f(C3370c c3370c) {
        try {
            return a(c3370c.getEncoded());
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public int c() {
        return this.f34806b;
    }

    protected Object clone() {
        return f(this);
    }

    public synchronized C3371d d() {
        return new C3371d(this.f34806b, e().i());
    }

    C3375h e() {
        return (C3375h) this.f34808d.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3370c c3370c = (C3370c) obj;
        if (this.f34806b != c3370c.f34806b || this.f34807c != c3370c.f34807c || this.f34810f != c3370c.f34810f || this.f34811g != c3370c.f34811g || !this.f34808d.equals(c3370c.f34808d)) {
            return false;
        }
        return this.f34809e.equals(c3370c.f34809e);
    }

    @Override // l7.AbstractC3374g, E7.c
    public synchronized byte[] getEncoded() {
        C3368a a8;
        try {
            a8 = C3368a.f().i(0).i(this.f34806b).j(this.f34811g).j(this.f34810f).a(this.f34807c);
            Iterator it = this.f34808d.iterator();
            while (it.hasNext()) {
                a8.c((C3375h) it.next());
            }
            Iterator it2 = this.f34809e.iterator();
            while (it2.hasNext()) {
                a8.c((C3377j) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return a8.b();
    }

    public int hashCode() {
        int hashCode = ((((((this.f34806b * 31) + (this.f34807c ? 1 : 0)) * 31) + this.f34808d.hashCode()) * 31) + this.f34809e.hashCode()) * 31;
        long j8 = this.f34810f;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f34811g;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
