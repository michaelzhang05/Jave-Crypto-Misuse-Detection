package Q;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p0.l f8162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f8163b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(y yVar, p0.l lVar) {
        this.f8163b = yVar;
        this.f8162a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.o0(this.f8163b, this.f8162a);
    }
}
