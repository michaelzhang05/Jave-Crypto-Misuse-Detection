package i6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2853w0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f31808e;

    public C2853w0(Function1 function1) {
        this.f31808e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return L5.I.f6487a;
    }

    @Override // i6.AbstractC2806E
    public void r(Throwable th) {
        this.f31808e.invoke(th);
    }
}
