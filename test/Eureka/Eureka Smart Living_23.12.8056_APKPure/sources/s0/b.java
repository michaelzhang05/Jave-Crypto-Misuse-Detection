package s0;

/* loaded from: classes.dex */
public enum b implements d {
    SUCCESS("SUCCESS", new long[]{0, 35, 65, 21}, new int[]{0, 250, 0, 180}, new long[]{0, 35, 65, 21}),
    WARNING("WARNING", new long[]{0, 30, 40, 30, 50, 60}, new int[]{255, 255, 255, 255, 255, 255}, new long[]{0, 30, 40, 30, 50, 60}),
    ERROR("ERROR", new long[]{0, 27, 45, 50}, new int[]{0, 120, 0, 250}, new long[]{0, 27, 45, 50});


    /* renamed from: a, reason: collision with root package name */
    private final String f9199a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f9200b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f9201c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f9202d;

    b(String str, long[] jArr, int[] iArr, long[] jArr2) {
        this.f9199a = str;
        this.f9200b = jArr;
        this.f9201c = iArr;
        this.f9202d = jArr2;
    }

    public static b e(String str) {
        for (b bVar : values()) {
            if (bVar.f9199a.equals(str)) {
                return bVar;
            }
        }
        return SUCCESS;
    }

    @Override // s0.d
    public int[] a() {
        return this.f9201c;
    }

    @Override // s0.d
    public long[] b() {
        return this.f9200b;
    }

    @Override // s0.d
    public long[] c() {
        return this.f9202d;
    }
}
