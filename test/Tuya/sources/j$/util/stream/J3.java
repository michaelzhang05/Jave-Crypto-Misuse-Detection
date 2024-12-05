package j$.util.stream;

/* loaded from: classes2.dex */
final class J3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f32336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f32337b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(Runnable runnable, Runnable runnable2) {
        this.f32336a = runnable;
        this.f32337b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f32337b;
        try {
            this.f32336a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
