package b;

import L5.I;
import X5.n;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1839j extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public Object f14217a;

    /* renamed from: b, reason: collision with root package name */
    public int f14218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1841l f14219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839j(C1841l c1841l, P5.d dVar) {
        super(2, dVar);
        this.f14219c = c1841l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new C1839j(this.f14219c, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new C1839j(this.f14219c, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        if (r12 == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.C1839j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
