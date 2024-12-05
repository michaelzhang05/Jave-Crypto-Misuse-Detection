package c.q.a;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: f, reason: collision with root package name */
    private final String f2891f;

    /* renamed from: g, reason: collision with root package name */
    private final Object[] f2892g;

    public a(String str, Object[] objArr) {
        this.f2891f = str;
        this.f2892g = objArr;
    }

    private static void c(d dVar, int i2, Object obj) {
        if (obj == null) {
            dVar.a0(i2);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.K(i2, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.r(i2, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.r(i2, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.F(i2, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.F(i2, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.F(i2, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.F(i2, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.m(i2, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.F(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            c(dVar, i2, obj);
        }
    }

    @Override // c.q.a.e
    public String a() {
        return this.f2891f;
    }

    @Override // c.q.a.e
    public void b(d dVar) {
        d(dVar, this.f2892g);
    }

    public a(String str) {
        this(str, null);
    }
}
