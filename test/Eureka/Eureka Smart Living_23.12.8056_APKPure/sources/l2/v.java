package l2;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f7389b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar, i iVar) {
        this.f7389b = wVar;
        this.f7388a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f7389b.f7391b;
        synchronized (obj) {
            w wVar = this.f7389b;
            dVar = wVar.f7392c;
            if (dVar != null) {
                dVar2 = wVar.f7392c;
                dVar2.a(this.f7388a);
            }
        }
    }
}
