package l2;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7393a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f7394b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(y yVar, i iVar) {
        this.f7394b = yVar;
        this.f7393a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f7394b.f7396b;
        synchronized (obj) {
            y yVar = this.f7394b;
            eVar = yVar.f7397c;
            if (eVar != null) {
                eVar2 = yVar.f7397c;
                eVar2.c((Exception) v1.n.h(this.f7393a.h()));
            }
        }
    }
}
