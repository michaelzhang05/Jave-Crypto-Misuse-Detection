package Z4;

import a5.InterfaceC1575a;

/* loaded from: classes5.dex */
public final class c extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1575a f13410a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f13412c;

    /* renamed from: d, reason: collision with root package name */
    public int f13413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, P5.d dVar) {
        super(dVar);
        this.f13412c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13411b = obj;
        this.f13413d |= Integer.MIN_VALUE;
        return a.b(this.f13412c, null, null, this);
    }
}
