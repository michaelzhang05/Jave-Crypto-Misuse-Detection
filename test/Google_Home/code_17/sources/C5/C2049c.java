package c5;

import d5.InterfaceC2755a;

/* renamed from: c5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2049c extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2755a f15734a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2047a f15736c;

    /* renamed from: d, reason: collision with root package name */
    public int f15737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2049c(C2047a c2047a, S5.d dVar) {
        super(dVar);
        this.f15736c = c2047a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15735b = obj;
        this.f15737d |= Integer.MIN_VALUE;
        return C2047a.b(this.f15736c, null, null, this);
    }
}
