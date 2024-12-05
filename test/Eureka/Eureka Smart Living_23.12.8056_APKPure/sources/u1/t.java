package u1;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j2.l f9396a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f9397b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(v vVar, j2.l lVar) {
        this.f9397b = vVar;
        this.f9396a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.B(this.f9397b, this.f9396a);
    }
}
