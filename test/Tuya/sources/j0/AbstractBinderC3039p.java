package j0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import s0.C3718h;
import s0.C3719i;

/* renamed from: j0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3039p extends AbstractBinderC3026c implements InterfaceC3040q {
    public AbstractBinderC3039p() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // j0.AbstractBinderC3026c
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                int readInt = parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) AbstractC3027d.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                J(readInt, maskedWallet, bundle);
                return true;
            case 2:
                int readInt2 = parcel.readInt();
                FullWallet fullWallet = (FullWallet) AbstractC3027d.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                f0(readInt2, fullWallet, bundle2);
                return true;
            case 3:
                int readInt3 = parcel.readInt();
                boolean e8 = AbstractC3027d.e(parcel);
                Bundle bundle3 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                y(readInt3, e8, bundle3);
                return true;
            case 4:
                int readInt4 = parcel.readInt();
                Bundle bundle4 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                X(readInt4, bundle4);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                AbstractC3027d.e(parcel);
                AbstractC3027d.b(parcel);
                return true;
            case 7:
                AbstractC3027d.b(parcel);
                return true;
            case 8:
                AbstractC3027d.b(parcel);
                return true;
            case 9:
                Status status = (Status) AbstractC3027d.a(parcel, Status.CREATOR);
                boolean e9 = AbstractC3027d.e(parcel);
                Bundle bundle5 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                w(status, e9, bundle5);
                return true;
            case 10:
                AbstractC3027d.b(parcel);
                return true;
            case 11:
                AbstractC3027d.b(parcel);
                return true;
            case 12:
                AbstractC3027d.b(parcel);
                return true;
            case 13:
                AbstractC3027d.b(parcel);
                return true;
            case 14:
                Status status2 = (Status) AbstractC3027d.a(parcel, Status.CREATOR);
                C3719i c3719i = (C3719i) AbstractC3027d.a(parcel, C3719i.CREATOR);
                Bundle bundle6 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                a0(status2, c3719i, bundle6);
                return true;
            case 15:
                AbstractC3027d.b(parcel);
                return true;
            case 16:
                AbstractC3027d.b(parcel);
                return true;
            case 17:
                AbstractC3027d.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                AbstractC3027d.b(parcel);
                return true;
            case 19:
                Status status3 = (Status) AbstractC3027d.a(parcel, Status.CREATOR);
                C3718h c3718h = (C3718h) AbstractC3027d.a(parcel, C3718h.CREATOR);
                Bundle bundle7 = (Bundle) AbstractC3027d.a(parcel, Bundle.CREATOR);
                AbstractC3027d.b(parcel);
                b0(status3, c3718h, bundle7);
                return true;
            case 20:
                AbstractC3027d.b(parcel);
                return true;
        }
    }
}
