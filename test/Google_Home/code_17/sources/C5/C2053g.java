package c5;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import d5.InterfaceC2755a;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: c5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2053g extends l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2755a f15742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2053g(InterfaceC2755a interfaceC2755a, S5.d dVar) {
        super(2, dVar);
        this.f15742a = interfaceC2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C2053g(this.f15742a, dVar);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(Object obj, Object obj2) {
        return new C2053g(this.f15742a, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        t.b(obj);
        this.f15742a.a("Something went wrong");
        return I.f8278a;
    }
}