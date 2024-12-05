package c;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2002j extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f15555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002j(O o8) {
        super(2);
        this.f15555a = o8;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        if (!((Boolean) obj2).booleanValue()) {
            this.f15555a.f34158a = false;
        }
        return I.f8278a;
    }
}
