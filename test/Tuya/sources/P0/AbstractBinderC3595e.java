package p0;

import android.os.Parcel;
import e0.AbstractBinderC2570b;
import e0.AbstractC2571c;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3595e extends AbstractBinderC2570b implements f {
    public AbstractBinderC3595e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // e0.AbstractBinderC2570b
    protected final boolean m0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                AbstractC2571c.b(parcel);
                break;
            case 4:
                AbstractC2571c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC2571c.b(parcel);
                break;
            case 7:
                AbstractC2571c.b(parcel);
                break;
            case 8:
                l lVar = (l) AbstractC2571c.a(parcel, l.CREATOR);
                AbstractC2571c.b(parcel);
                Z(lVar);
                break;
            case 9:
                AbstractC2571c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
