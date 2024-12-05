package Z4;

import L5.I;
import L5.t;
import X5.n;
import a5.InterfaceC1575a;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class i extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1575a f13420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONException f13421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC1575a interfaceC1575a, JSONException jSONException, P5.d dVar) {
        super(2, dVar);
        this.f13420a = interfaceC1575a;
        this.f13421b = jSONException;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new i(this.f13420a, this.f13421b, dVar);
    }

    @Override // X5.n
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f13420a, this.f13421b, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        t.b(obj);
        this.f13420a.a(this.f13421b.getMessage());
        return I.f6487a;
    }
}
