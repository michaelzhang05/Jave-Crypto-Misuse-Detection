package l6;

import O5.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Q0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final S5.d f34578e;

    public Q0(S5.d dVar) {
        this.f34578e = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return O5.I.f8278a;
    }

    @Override // l6.AbstractC3341E
    public void r(Throwable th) {
        S5.d dVar = this.f34578e;
        s.a aVar = O5.s.f8302b;
        dVar.resumeWith(O5.s.b(O5.I.f8278a));
    }
}
