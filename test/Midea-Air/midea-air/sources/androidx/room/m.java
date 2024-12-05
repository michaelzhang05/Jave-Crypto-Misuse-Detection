package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public class m implements c.q.a.e, c.q.a.d {

    /* renamed from: f, reason: collision with root package name */
    static final TreeMap<Integer, m> f1679f = new TreeMap<>();

    /* renamed from: g, reason: collision with root package name */
    private volatile String f1680g;

    /* renamed from: h, reason: collision with root package name */
    final long[] f1681h;

    /* renamed from: i, reason: collision with root package name */
    final double[] f1682i;

    /* renamed from: j, reason: collision with root package name */
    final String[] f1683j;

    /* renamed from: k, reason: collision with root package name */
    final byte[][] f1684k;
    private final int[] l;
    final int m;
    int n;

    private m(int i2) {
        this.m = i2;
        int i3 = i2 + 1;
        this.l = new int[i3];
        this.f1681h = new long[i3];
        this.f1682i = new double[i3];
        this.f1683j = new String[i3];
        this.f1684k = new byte[i3];
    }

    public static m f(String str, int i2) {
        TreeMap<Integer, m> treeMap = f1679f;
        synchronized (treeMap) {
            Map.Entry<Integer, m> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                m value = ceilingEntry.getValue();
                value.o(str, i2);
                return value;
            }
            m mVar = new m(i2);
            mVar.o(str, i2);
            return mVar;
        }
    }

    private static void w() {
        TreeMap<Integer, m> treeMap = f1679f;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i2;
        }
    }

    @Override // c.q.a.d
    public void F(int i2, long j2) {
        this.l[i2] = 2;
        this.f1681h[i2] = j2;
    }

    @Override // c.q.a.d
    public void K(int i2, byte[] bArr) {
        this.l[i2] = 5;
        this.f1684k[i2] = bArr;
    }

    @Override // c.q.a.e
    public String a() {
        return this.f1680g;
    }

    @Override // c.q.a.d
    public void a0(int i2) {
        this.l[i2] = 1;
    }

    @Override // c.q.a.e
    public void b(c.q.a.d dVar) {
        for (int i2 = 1; i2 <= this.n; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1) {
                dVar.a0(i2);
            } else if (i3 == 2) {
                dVar.F(i2, this.f1681h[i2]);
            } else if (i3 == 3) {
                dVar.r(i2, this.f1682i[i2]);
            } else if (i3 == 4) {
                dVar.m(i2, this.f1683j[i2]);
            } else if (i3 == 5) {
                dVar.K(i2, this.f1684k[i2]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c.q.a.d
    public void m(int i2, String str) {
        this.l[i2] = 4;
        this.f1683j[i2] = str;
    }

    void o(String str, int i2) {
        this.f1680g = str;
        this.n = i2;
    }

    @Override // c.q.a.d
    public void r(int i2, double d2) {
        this.l[i2] = 3;
        this.f1682i[i2] = d2;
    }

    public void z() {
        TreeMap<Integer, m> treeMap = f1679f;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.m), this);
            w();
        }
    }
}
