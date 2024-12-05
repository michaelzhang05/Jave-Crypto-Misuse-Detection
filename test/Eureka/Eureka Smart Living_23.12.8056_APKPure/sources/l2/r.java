package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7379a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f7380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, i iVar) {
        this.f7380b = sVar;
        this.f7379a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        a aVar;
        try {
            aVar = this.f7380b.f7382b;
            i iVar = (i) aVar.a(this.f7379a);
            if (iVar == null) {
                this.f7380b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f7372b;
            iVar.e(executor, this.f7380b);
            iVar.d(executor, this.f7380b);
            iVar.a(executor, this.f7380b);
        } catch (g e6) {
            if (e6.getCause() instanceof Exception) {
                h0Var3 = this.f7380b.f7383c;
                h0Var3.o((Exception) e6.getCause());
            } else {
                h0Var2 = this.f7380b.f7383c;
                h0Var2.o(e6);
            }
        } catch (Exception e7) {
            h0Var = this.f7380b.f7383c;
            h0Var.o(e7);
        }
    }
}
