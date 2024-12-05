package G0;

import b1.InterfaceC1955a;
import b1.InterfaceC1956b;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1955a f2918a;

    public m(InterfaceC1955a interfaceC1955a) {
        this.f2918a = interfaceC1955a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(f fVar, InterfaceC1956b interfaceC1956b) {
        android.support.v4.media.a.a(interfaceC1956b.get());
        throw null;
    }

    public void c(K0.l lVar) {
        if (lVar == null) {
            h.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final f fVar = new f(lVar);
            this.f2918a.a(new InterfaceC1955a.InterfaceC0356a() { // from class: G0.l
                @Override // b1.InterfaceC1955a.InterfaceC0356a
                public final void a(InterfaceC1956b interfaceC1956b) {
                    m.b(f.this, interfaceC1956b);
                }
            });
        }
    }
}
