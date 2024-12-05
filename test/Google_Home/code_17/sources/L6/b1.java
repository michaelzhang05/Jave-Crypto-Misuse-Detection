package l6;

/* loaded from: classes5.dex */
public final class b1 extends I {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f34603a = new b1();

    private b1() {
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        f1 f1Var = (f1) gVar.get(f1.f34621b);
        if (f1Var != null) {
            f1Var.f34622a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // l6.I
    public boolean isDispatchNeeded(S5.g gVar) {
        return false;
    }

    @Override // l6.I
    public I limitedParallelism(int i8) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // l6.I
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
