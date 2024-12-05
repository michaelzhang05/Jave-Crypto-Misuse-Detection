package i0;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import r0.C3900h;
import r0.C3901i;

/* loaded from: classes3.dex */
public interface q extends IInterface {
    void C(int i8, boolean z8, Bundle bundle);

    void P(int i8, MaskedWallet maskedWallet, Bundle bundle);

    void f0(int i8, Bundle bundle);

    void j0(Status status, C3900h c3900h, Bundle bundle);

    void l(Status status, C3901i c3901i, Bundle bundle);

    void n0(int i8, FullWallet fullWallet, Bundle bundle);

    void v(Status status, boolean z8, Bundle bundle);
}
