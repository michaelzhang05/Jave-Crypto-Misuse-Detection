package j2;

import android.os.Parcel;
import t3.b0;

/* loaded from: classes.dex */
public abstract class e extends d2.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // d2.b
    protected final boolean z(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case 7:
                break;
            case 8:
                m((l) d2.c.a(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
