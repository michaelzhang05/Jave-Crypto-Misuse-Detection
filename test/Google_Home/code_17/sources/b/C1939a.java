package b;

import com.inmobi.cmp.ChoiceCmp;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1939a extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChoiceCmp f15004b;

    /* renamed from: c, reason: collision with root package name */
    public int f15005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939a(ChoiceCmp choiceCmp, S5.d dVar) {
        super(dVar);
        this.f15004b = choiceCmp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15003a = obj;
        this.f15005c |= Integer.MIN_VALUE;
        return ChoiceCmp.access$loadCmpInfo(this.f15004b, this);
    }
}
