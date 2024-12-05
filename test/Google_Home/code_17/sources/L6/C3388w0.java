package l6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3388w0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f34660e;

    public C3388w0(Function1 function1) {
        this.f34660e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return O5.I.f8278a;
    }

    @Override // l6.AbstractC3341E
    public void r(Throwable th) {
        this.f34660e.invoke(th);
    }
}
