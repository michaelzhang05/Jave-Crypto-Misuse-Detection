package k6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC3159y;
import n6.AbstractC3483C;

/* loaded from: classes5.dex */
public final class j extends AbstractC3483C {

    /* renamed from: e, reason: collision with root package name */
    private final b f33618e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReferenceArray f33619f;

    public j(long j8, j jVar, b bVar, int i8) {
        super(j8, jVar, i8);
        this.f33618e = bVar;
        this.f33619f = new AtomicReferenceArray(c.f33591b * 2);
    }

    private final void z(int i8, Object obj) {
        this.f33619f.lazySet(i8 * 2, obj);
    }

    public final void A(int i8, Object obj) {
        this.f33619f.set((i8 * 2) + 1, obj);
    }

    public final void B(int i8, Object obj) {
        z(i8, obj);
    }

    @Override // n6.AbstractC3483C
    public int n() {
        return c.f33591b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = u().f33572b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        n6.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // n6.AbstractC3483C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, P5.g r6) {
        /*
            r3 = this;
            int r5 = k6.c.f33591b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof i6.e1
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof k6.w
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            n6.F r2 = k6.c.j()
            if (r1 == r2) goto L63
            n6.F r2 = k6.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            n6.F r2 = k6.c.p()
            if (r1 == r2) goto Le
            n6.F r2 = k6.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            n6.F r4 = k6.c.f()
            if (r1 == r4) goto L62
            n6.F r4 = k6.c.f33593d
            if (r1 != r4) goto L40
            goto L62
        L40:
            n6.F r4 = k6.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            k6.b r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.f33572b
            if (r4 == 0) goto L73
            n6.x.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            n6.F r2 = k6.c.j()
            goto L7f
        L7b:
            n6.F r2 = k6.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            k6.b r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.f33572b
            if (r4 == 0) goto L9a
            n6.x.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.o(int, java.lang.Throwable, P5.g):void");
    }

    public final boolean r(int i8, Object obj, Object obj2) {
        return i.a(this.f33619f, (i8 * 2) + 1, obj, obj2);
    }

    public final void s(int i8) {
        z(i8, null);
    }

    public final Object t(int i8, Object obj) {
        return this.f33619f.getAndSet((i8 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f33618e;
        AbstractC3159y.f(bVar);
        return bVar;
    }

    public final Object v(int i8) {
        return this.f33619f.get(i8 * 2);
    }

    public final Object w(int i8) {
        return this.f33619f.get((i8 * 2) + 1);
    }

    public final void x(int i8, boolean z8) {
        if (z8) {
            u().M0((this.f36233c * c.f33591b) + i8);
        }
        p();
    }

    public final Object y(int i8) {
        Object v8 = v(i8);
        s(i8);
        return v8;
    }
}
