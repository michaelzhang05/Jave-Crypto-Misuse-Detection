package A3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import i4.InterfaceC2987b;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import v3.C4100c;
import v3.InterfaceC4099b;

/* renamed from: A3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0952b {
    public final InterfaceC4099b a(C4100c defaultAddressLauncherEventReporter) {
        AbstractC3255y.i(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }

    public final InterfaceC2987b b(Context context, AddressElementActivityContract.a args) {
        String p8;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(args, "args");
        u3.e a8 = args.a();
        if (a8 == null || (p8 = a8.p()) == null) {
            return null;
        }
        return InterfaceC2987b.a.b(InterfaceC2987b.f32972a, context, p8, null, null, null, i.a.b(n3.i.f35386a, context, null, 2, null), 28, null);
    }
}
