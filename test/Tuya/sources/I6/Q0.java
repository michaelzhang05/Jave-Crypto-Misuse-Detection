package i6;

import L5.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Q0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final P5.d f31726e;

    public Q0(P5.d dVar) {
        this.f31726e = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return L5.I.f6487a;
    }

    @Override // i6.AbstractC2806E
    public void r(Throwable th) {
        P5.d dVar = this.f31726e;
        s.a aVar = L5.s.f6511b;
        dVar.resumeWith(L5.s.b(L5.I.f6487a));
    }
}
