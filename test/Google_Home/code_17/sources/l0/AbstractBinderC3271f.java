package l0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC2076b0;
import com.google.android.gms.internal.measurement.AbstractC2066a0;
import com.google.android.gms.measurement.internal.C2350g;
import com.google.android.gms.measurement.internal.V5;
import com.google.android.gms.measurement.internal.b6;
import java.util.List;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3271f extends AbstractBinderC2076b0 implements InterfaceC3272g {
    public AbstractBinderC3271f() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2076b0
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                com.google.android.gms.measurement.internal.G g8 = (com.google.android.gms.measurement.internal.G) AbstractC2066a0.a(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                b6 b6Var = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                p(g8, b6Var);
                parcel2.writeNoException();
                return true;
            case 2:
                V5 v52 = (V5) AbstractC2066a0.a(parcel, V5.CREATOR);
                b6 b6Var2 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                m0(v52, b6Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                b6 b6Var3 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                B(b6Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.G g9 = (com.google.android.gms.measurement.internal.G) AbstractC2066a0.a(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC2066a0.f(parcel);
                m(g9, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                b6 b6Var4 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                d0(b6Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                b6 b6Var5 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                boolean h8 = AbstractC2066a0.h(parcel);
                AbstractC2066a0.f(parcel);
                List I8 = I(b6Var5, h8);
                parcel2.writeNoException();
                parcel2.writeTypedList(I8);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.G g10 = (com.google.android.gms.measurement.internal.G) AbstractC2066a0.a(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                String readString3 = parcel.readString();
                AbstractC2066a0.f(parcel);
                byte[] o8 = o(g10, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(o8);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC2066a0.f(parcel);
                L(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                b6 b6Var6 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                String S8 = S(b6Var6);
                parcel2.writeNoException();
                parcel2.writeString(S8);
                return true;
            case 12:
                C2350g c2350g = (C2350g) AbstractC2066a0.a(parcel, C2350g.CREATOR);
                b6 b6Var7 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                t(c2350g, b6Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C2350g c2350g2 = (C2350g) AbstractC2066a0.a(parcel, C2350g.CREATOR);
                AbstractC2066a0.f(parcel);
                O(c2350g2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h9 = AbstractC2066a0.h(parcel);
                b6 b6Var8 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                List l02 = l0(readString7, readString8, h9, b6Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean h10 = AbstractC2066a0.h(parcel);
                AbstractC2066a0.f(parcel);
                List z8 = z(readString9, readString10, readString11, h10);
                parcel2.writeNoException();
                parcel2.writeTypedList(z8);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                b6 b6Var9 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                List u8 = u(readString12, readString13, b6Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(u8);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC2066a0.f(parcel);
                List T8 = T(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(T8);
                return true;
            case 18:
                b6 b6Var10 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                D(b6Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                b6 b6Var11 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                n(bundle, b6Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                b6 b6Var12 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                k0(b6Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                b6 b6Var13 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                C3266a G8 = G(b6Var13);
                parcel2.writeNoException();
                AbstractC2066a0.g(parcel2, G8);
                return true;
            case 24:
                b6 b6Var14 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                AbstractC2066a0.f(parcel);
                List N8 = N(b6Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(N8);
                return true;
            case 25:
                b6 b6Var15 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                h0(b6Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                b6 b6Var16 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                o0(b6Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                b6 b6Var17 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                r(b6Var17);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                b6 b6Var18 = (b6) AbstractC2066a0.a(parcel, b6.CREATOR);
                AbstractC2066a0.f(parcel);
                U(bundle3, b6Var18);
                parcel2.writeNoException();
                return true;
        }
    }
}
