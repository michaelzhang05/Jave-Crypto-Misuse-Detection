package s0;

/* loaded from: classes.dex */
public enum a implements d {
    LIGHT("LIGHT", new long[]{0, 50}, new int[]{0, 110}, new long[]{0, 20}),
    MEDIUM("MEDIUM", new long[]{0, 43}, new int[]{0, 180}, new long[]{0, 43}),
    HEAVY("HEAVY", new long[]{0, 60}, new int[]{0, 255}, new long[]{0, 61});


    /* renamed from: a, reason: collision with root package name */
    private final String f9191a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f9192b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f9193c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f9194d;

    a(String str, long[] jArr, int[] iArr, long[] jArr2) {
        this.f9191a = str;
        this.f9192b = jArr;
        this.f9193c = iArr;
        this.f9194d = jArr2;
    }

    public static a e(String str) {
        for (a aVar : values()) {
            if (aVar.f9191a.equals(str)) {
                return aVar;
            }
        }
        return HEAVY;
    }

    @Override // s0.d
    public int[] a() {
        return this.f9193c;
    }

    @Override // s0.d
    public long[] b() {
        return this.f9192b;
    }

    @Override // s0.d
    public long[] c() {
        return this.f9194d;
    }
}
