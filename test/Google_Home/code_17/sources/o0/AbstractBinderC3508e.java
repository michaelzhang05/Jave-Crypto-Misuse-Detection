package o0;

import android.os.Parcel;
import d0.AbstractBinderC2723b;
import d0.AbstractC2724c;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3508e extends AbstractBinderC2723b implements InterfaceC3509f {
    public AbstractBinderC3508e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // d0.AbstractBinderC2723b
    protected final boolean s0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                AbstractC2724c.b(parcel);
                break;
            case 4:
                AbstractC2724c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC2724c.b(parcel);
                break;
            case 7:
                AbstractC2724c.b(parcel);
                break;
            case 8:
                l lVar = (l) AbstractC2724c.a(parcel, l.CREATOR);
                AbstractC2724c.b(parcel);
                i0(lVar);
                break;
            case 9:
                AbstractC2724c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
