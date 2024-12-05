package x3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import f4.InterfaceC2669b;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import s3.C3747c;
import s3.InterfaceC3746b;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3901b {
    public final InterfaceC3746b a(C3747c defaultAddressLauncherEventReporter) {
        AbstractC3159y.i(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }

    public final InterfaceC2669b b(Context context, AddressElementActivityContract.a args) {
        String k8;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(args, "args");
        r3.e b8 = args.b();
        if (b8 == null || (k8 = b8.k()) == null) {
            return null;
        }
        return InterfaceC2669b.a.b(InterfaceC2669b.f31109a, context, k8, null, null, null, i.a.b(k3.i.f33394a, context, null, 2, null), 28, null);
    }
}
