package r0;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f37535b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar, Task task) {
        this.f37535b = rVar;
        this.f37534a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i8;
        I i9;
        I i10;
        InterfaceC3671b interfaceC3671b;
        I i11;
        I i12;
        if (this.f37534a.l()) {
            i12 = this.f37535b.f37538c;
            i12.s();
            return;
        }
        try {
            interfaceC3671b = this.f37535b.f37537b;
            Object a8 = interfaceC3671b.a(this.f37534a);
            i11 = this.f37535b.f37538c;
            i11.r(a8);
        } catch (C3677h e8) {
            if (e8.getCause() instanceof Exception) {
                i10 = this.f37535b.f37538c;
                i10.q((Exception) e8.getCause());
            } else {
                i9 = this.f37535b.f37538c;
                i9.q(e8);
            }
        } catch (Exception e9) {
            i8 = this.f37535b.f37538c;
            i8.q(e9);
        }
    }
}
