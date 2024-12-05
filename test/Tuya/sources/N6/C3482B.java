package n6;

import i6.AbstractC2808G;
import i6.AbstractC2809a;

/* renamed from: n6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3482B extends AbstractC2809a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final P5.d f36231d;

    public C3482B(P5.g gVar, P5.d dVar) {
        super(gVar, true, true);
        this.f36231d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i6.F0
    public void H(Object obj) {
        AbstractC3497k.c(Q5.b.c(this.f36231d), AbstractC2808G.a(obj, this.f36231d), null, 2, null);
    }

    @Override // i6.AbstractC2809a
    protected void K0(Object obj) {
        P5.d dVar = this.f36231d;
        dVar.resumeWith(AbstractC2808G.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        P5.d dVar = this.f36231d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // i6.F0
    protected final boolean i0() {
        return true;
    }
}
