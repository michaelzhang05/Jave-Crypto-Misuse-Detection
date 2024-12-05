package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class n1 extends r1 implements u {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22264g;

    public n1(l1 l1Var) {
        super(true);
        H(l1Var);
        this.f22264g = o0();
    }

    private final boolean o0() {
        q C = C();
        r rVar = C instanceof r ? (r) C : null;
        if (rVar == null) {
            return false;
        }
        r1 w = rVar.w();
        while (!w.y()) {
            q C2 = w.C();
            r rVar2 = C2 instanceof r ? (r) C2 : null;
            if (rVar2 == null) {
                return false;
            }
            w = rVar2.w();
        }
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public boolean A() {
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public boolean y() {
        return this.f22264g;
    }
}
