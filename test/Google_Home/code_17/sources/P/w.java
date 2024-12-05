package P;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0.l f8653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f8654b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(y yVar, o0.l lVar) {
        this.f8654b = yVar;
        this.f8653a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.u0(this.f8654b, this.f8653a);
    }
}
