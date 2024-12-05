package q0;

/* loaded from: classes3.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f38096a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar) {
        this.f38096a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3820d interfaceC3820d;
        InterfaceC3820d interfaceC3820d2;
        obj = this.f38096a.f38098b;
        synchronized (obj) {
            try {
                v vVar = this.f38096a;
                interfaceC3820d = vVar.f38099c;
                if (interfaceC3820d != null) {
                    interfaceC3820d2 = vVar.f38099c;
                    interfaceC3820d2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
