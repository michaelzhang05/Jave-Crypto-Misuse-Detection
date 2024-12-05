package l2;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f7384a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(u uVar) {
        this.f7384a = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f7384a.f7386b;
        synchronized (obj) {
            u uVar = this.f7384a;
            cVar = uVar.f7387c;
            if (cVar != null) {
                cVar2 = uVar.f7387c;
                cVar2.a();
            }
        }
    }
}
