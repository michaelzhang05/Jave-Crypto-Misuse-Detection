package q6;

import l6.AbstractC3343G;
import l6.AbstractC3344a;

/* renamed from: q6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3861B extends AbstractC3344a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final S5.d f38359d;

    public C3861B(S5.g gVar, S5.d dVar) {
        super(gVar, true, true);
        this.f38359d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l6.F0
    public void H(Object obj) {
        AbstractC3876k.c(T5.b.c(this.f38359d), AbstractC3343G.a(obj, this.f38359d), null, 2, null);
    }

    @Override // l6.AbstractC3344a
    protected void J0(Object obj) {
        S5.d dVar = this.f38359d;
        dVar.resumeWith(AbstractC3343G.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        S5.d dVar = this.f38359d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // l6.F0
    protected final boolean h0() {
        return true;
    }
}
