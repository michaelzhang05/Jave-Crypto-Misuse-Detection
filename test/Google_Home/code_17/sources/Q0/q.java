package q0;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38086a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f38087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar, Task task) {
        this.f38087b = rVar;
        this.f38086a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3815I c3815i;
        C3815I c3815i2;
        C3815I c3815i3;
        InterfaceC3818b interfaceC3818b;
        C3815I c3815i4;
        C3815I c3815i5;
        if (this.f38086a.l()) {
            c3815i5 = this.f38087b.f38090c;
            c3815i5.s();
            return;
        }
        try {
            interfaceC3818b = this.f38087b.f38089b;
            Object a8 = interfaceC3818b.a(this.f38086a);
            c3815i4 = this.f38087b.f38090c;
            c3815i4.r(a8);
        } catch (C3824h e8) {
            if (e8.getCause() instanceof Exception) {
                c3815i3 = this.f38087b.f38090c;
                c3815i3.q((Exception) e8.getCause());
            } else {
                c3815i2 = this.f38087b.f38090c;
                c3815i2.q(e8);
            }
        } catch (Exception e9) {
            c3815i = this.f38087b.f38090c;
            c3815i.q(e9);
        }
    }
}
