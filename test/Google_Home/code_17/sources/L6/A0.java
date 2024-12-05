package l6;

/* loaded from: classes5.dex */
public class A0 extends F0 implements InterfaceC3337A {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34523c;

    public A0(InterfaceC3390x0 interfaceC3390x0) {
        super(true);
        g0(interfaceC3390x0);
        this.f34523c = J0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0.c0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r0 instanceof l6.C3385v) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = (l6.C3385v) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0 = r0.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.Z() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean J0() {
        /*
            r4 = this;
            l6.u r0 = r4.c0()
            boolean r1 = r0 instanceof l6.C3385v
            r2 = 0
            if (r1 == 0) goto Lc
            l6.v r0 = (l6.C3385v) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            l6.F0 r0 = r0.s()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.Z()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            l6.u r0 = r0.c0()
            boolean r3 = r0 instanceof l6.C3385v
            if (r3 == 0) goto L2a
            l6.v r0 = (l6.C3385v) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            l6.F0 r0 = r0.s()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.A0.J0():boolean");
    }

    @Override // l6.F0
    public boolean Z() {
        return this.f34523c;
    }

    @Override // l6.InterfaceC3337A
    public boolean a(Throwable th) {
        return l0(new C3339C(th, false, 2, null));
    }

    @Override // l6.F0
    public boolean a0() {
        return true;
    }

    @Override // l6.InterfaceC3337A
    public boolean complete() {
        return l0(O5.I.f8278a);
    }
}
