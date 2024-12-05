package c5;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import d5.InterfaceC2755a;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class i extends l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2755a f15744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONException f15745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2755a interfaceC2755a, JSONException jSONException, S5.d dVar) {
        super(2, dVar);
        this.f15744a = interfaceC2755a;
        this.f15745b = jSONException;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new i(this.f15744a, this.f15745b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f15744a, this.f15745b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        T5.b.e();
        t.b(obj);
        this.f15744a.a(this.f15745b.getMessage());
        return I.f8278a;
    }
}
