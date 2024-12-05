package l2;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7374a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f7375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, i iVar) {
        this.f7375b = qVar;
        this.f7374a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        a aVar;
        h0 h0Var4;
        h0 h0Var5;
        if (this.f7374a.k()) {
            h0Var5 = this.f7375b.f7378c;
            h0Var5.q();
            return;
        }
        try {
            aVar = this.f7375b.f7377b;
            Object a6 = aVar.a(this.f7374a);
            h0Var4 = this.f7375b.f7378c;
            h0Var4.p(a6);
        } catch (g e6) {
            if (e6.getCause() instanceof Exception) {
                h0Var3 = this.f7375b.f7378c;
                h0Var3.o((Exception) e6.getCause());
            } else {
                h0Var2 = this.f7375b.f7378c;
                h0Var2.o(e6);
            }
        } catch (Exception e7) {
            h0Var = this.f7375b.f7378c;
            h0Var.o(e7);
        }
    }
}
