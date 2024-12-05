package e.h.a.k0;

/* compiled from: FileDownloadProperties.java */
/* loaded from: classes2.dex */
public class e {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17892c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17893d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17894e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17895f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17896g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17897h;

    /* compiled from: FileDownloadProperties.java */
    /* loaded from: classes2.dex */
    public static class b {
        private static final e a = new e();
    }

    public static e a() {
        return b.a;
    }

    public static int b(int i2) {
        if (i2 > 12) {
            d.i(e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i2), 12, 12);
            return 12;
        }
        if (i2 >= 1) {
            return i2;
        }
        d.i(e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i2), 1, 1);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ad A[Catch: all -> 0x0294, TryCatch #5 {all -> 0x0294, blocks: (B:77:0x0036, B:80:0x003d, B:83:0x0041, B:86:0x0045, B:89:0x0049, B:92:0x004d, B:95:0x0051, B:98:0x0055, B:102:0x00a9, B:104:0x00ad, B:106:0x00b1, B:115:0x00bf), top: B:76:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bf A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #5 {all -> 0x0294, blocks: (B:77:0x0036, B:80:0x003d, B:83:0x0041, B:86:0x0045, B:89:0x0049, B:92:0x004d, B:95:0x0051, B:98:0x0055, B:102:0x00a9, B:104:0x00ad, B:106:0x00b1, B:115:0x00bf), top: B:76:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private e() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.k0.e.<init>():void");
    }
}
