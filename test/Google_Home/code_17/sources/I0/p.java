package i0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import r0.C3900h;
import r0.C3901i;

/* loaded from: classes3.dex */
public abstract class p extends AbstractBinderC2973c implements q {
    public p() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // i0.AbstractBinderC2973c
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                int readInt = parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) d.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                P(readInt, maskedWallet, bundle);
                return true;
            case 2:
                int readInt2 = parcel.readInt();
                FullWallet fullWallet = (FullWallet) d.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                n0(readInt2, fullWallet, bundle2);
                return true;
            case 3:
                int readInt3 = parcel.readInt();
                boolean e8 = d.e(parcel);
                Bundle bundle3 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                C(readInt3, e8, bundle3);
                return true;
            case 4:
                int readInt4 = parcel.readInt();
                Bundle bundle4 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                f0(readInt4, bundle4);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                d.e(parcel);
                d.b(parcel);
                return true;
            case 7:
                d.b(parcel);
                return true;
            case 8:
                d.b(parcel);
                return true;
            case 9:
                Status status = (Status) d.a(parcel, Status.CREATOR);
                boolean e9 = d.e(parcel);
                Bundle bundle5 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                v(status, e9, bundle5);
                return true;
            case 10:
                d.b(parcel);
                return true;
            case 11:
                d.b(parcel);
                return true;
            case 12:
                d.b(parcel);
                return true;
            case 13:
                d.b(parcel);
                return true;
            case 14:
                Status status2 = (Status) d.a(parcel, Status.CREATOR);
                C3901i c3901i = (C3901i) d.a(parcel, C3901i.CREATOR);
                Bundle bundle6 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                l(status2, c3901i, bundle6);
                return true;
            case 15:
                d.b(parcel);
                return true;
            case 16:
                d.b(parcel);
                return true;
            case 17:
                d.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                d.b(parcel);
                return true;
            case 19:
                Status status3 = (Status) d.a(parcel, Status.CREATOR);
                C3900h c3900h = (C3900h) d.a(parcel, C3900h.CREATOR);
                Bundle bundle7 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                j0(status3, c3900h, bundle7);
                return true;
            case 20:
                d.b(parcel);
                return true;
        }
    }
}
