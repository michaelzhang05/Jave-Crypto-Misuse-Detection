package l2;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7398a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f7399b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(a0 a0Var, i iVar) {
        this.f7399b = a0Var;
        this.f7398a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f7399b.f7351b;
        synchronized (obj) {
            a0 a0Var = this.f7399b;
            fVar = a0Var.f7352c;
            if (fVar != null) {
                fVar2 = a0Var.f7352c;
                fVar2.d(this.f7398a.i());
            }
        }
    }
}
