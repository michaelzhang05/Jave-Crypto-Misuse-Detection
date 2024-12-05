package j;

/* compiled from: PeekSource.kt */
/* loaded from: classes2.dex */
public final class v implements d0 {

    /* renamed from: f, reason: collision with root package name */
    private final f f19392f;

    /* renamed from: g, reason: collision with root package name */
    private y f19393g;

    /* renamed from: h, reason: collision with root package name */
    private int f19394h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19395i;

    /* renamed from: j, reason: collision with root package name */
    private long f19396j;

    /* renamed from: k, reason: collision with root package name */
    private final h f19397k;

    public v(h hVar) {
        kotlin.jvm.internal.l.f(hVar, "upstream");
        this.f19397k = hVar;
        f e2 = hVar.e();
        this.f19392f = e2;
        y yVar = e2.f19358f;
        this.f19393g = yVar;
        this.f19394h = yVar != null ? yVar.f19406c : -1;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19395i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r4 == r5.f19406c) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // j.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(j.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l.f(r9, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L89
            boolean r4 = r8.f19395i
            r4 = r4 ^ r1
            if (r4 == 0) goto L7d
            j.y r4 = r8.f19393g
            if (r4 == 0) goto L2a
            j.f r5 = r8.f19392f
            j.y r5 = r5.f19358f
            if (r4 != r5) goto L2b
            int r4 = r8.f19394h
            kotlin.jvm.internal.l.c(r5)
            int r5 = r5.f19406c
            if (r4 != r5) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L71
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L32
            return r2
        L32:
            j.h r0 = r8.f19397k
            long r1 = r8.f19396j
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L42
            r9 = -1
            return r9
        L42:
            j.y r0 = r8.f19393g
            if (r0 != 0) goto L55
            j.f r0 = r8.f19392f
            j.y r0 = r0.f19358f
            if (r0 == 0) goto L55
            r8.f19393g = r0
            kotlin.jvm.internal.l.c(r0)
            int r0 = r0.f19406c
            r8.f19394h = r0
        L55:
            j.f r0 = r8.f19392f
            long r0 = r0.size()
            long r2 = r8.f19396j
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            j.f r2 = r8.f19392f
            long r4 = r8.f19396j
            r3 = r9
            r6 = r10
            r2.g0(r3, r4, r6)
            long r0 = r8.f19396j
            long r0 = r0 + r10
            r8.f19396j = r0
            return r10
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L89:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.v.read(j.f, long):long");
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f19397k.timeout();
    }
}
