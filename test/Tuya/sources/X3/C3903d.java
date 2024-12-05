package x3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import f4.InterfaceC2669b;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3903d implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3901b f39311a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39312b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f39313c;

    public C3903d(C3901b c3901b, I5.a aVar, I5.a aVar2) {
        this.f39311a = c3901b;
        this.f39312b = aVar;
        this.f39313c = aVar2;
    }

    public static C3903d a(C3901b c3901b, I5.a aVar, I5.a aVar2) {
        return new C3903d(c3901b, aVar, aVar2);
    }

    public static InterfaceC2669b c(C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
        return c3901b.b(context, aVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2669b get() {
        return c(this.f39311a, (Context) this.f39312b.get(), (AddressElementActivityContract.a) this.f39313c.get());
    }
}
