package j0;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import s0.C3718h;
import s0.C3719i;

/* renamed from: j0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3040q extends IInterface {
    void J(int i8, MaskedWallet maskedWallet, Bundle bundle);

    void X(int i8, Bundle bundle);

    void a0(Status status, C3719i c3719i, Bundle bundle);

    void b0(Status status, C3718h c3718h, Bundle bundle);

    void f0(int i8, FullWallet fullWallet, Bundle bundle);

    void w(Status status, boolean z8, Bundle bundle);

    void y(int i8, boolean z8, Bundle bundle);
}
