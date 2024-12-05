package A3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import i4.InterfaceC2987b;

/* renamed from: A3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0954d implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C0952b f306a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f307b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f308c;

    public C0954d(C0952b c0952b, L5.a aVar, L5.a aVar2) {
        this.f306a = c0952b;
        this.f307b = aVar;
        this.f308c = aVar2;
    }

    public static C0954d a(C0952b c0952b, L5.a aVar, L5.a aVar2) {
        return new C0954d(c0952b, aVar, aVar2);
    }

    public static InterfaceC2987b c(C0952b c0952b, Context context, AddressElementActivityContract.a aVar) {
        return c0952b.b(context, aVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2987b get() {
        return c(this.f306a, (Context) this.f307b.get(), (AddressElementActivityContract.a) this.f308c.get());
    }
}
