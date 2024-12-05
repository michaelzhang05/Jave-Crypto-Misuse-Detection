package m0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.measurement.internal.C2173d;
import com.google.android.gms.measurement.internal.C2270v;
import com.google.android.gms.measurement.internal.D4;
import com.google.android.gms.measurement.internal.u4;
import java.util.List;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3390c extends Q implements InterfaceC3391d {
    public AbstractBinderC3390c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.Q
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                C2270v c2270v = (C2270v) S.a(parcel, C2270v.CREATOR);
                D4 d42 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                C(c2270v, d42);
                parcel2.writeNoException();
                return true;
            case 2:
                u4 u4Var = (u4) S.a(parcel, u4.CREATOR);
                D4 d43 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                h0(u4Var, d43);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                D4 d44 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                M(d44);
                parcel2.writeNoException();
                return true;
            case 5:
                C2270v c2270v2 = (C2270v) S.a(parcel, C2270v.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                S.c(parcel);
                p(c2270v2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                D4 d45 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                o(d45);
                parcel2.writeNoException();
                return true;
            case 7:
                D4 d46 = (D4) S.a(parcel, D4.CREATOR);
                boolean f8 = S.f(parcel);
                S.c(parcel);
                List v8 = v(d46, f8);
                parcel2.writeNoException();
                parcel2.writeTypedList(v8);
                return true;
            case 9:
                C2270v c2270v3 = (C2270v) S.a(parcel, C2270v.CREATOR);
                String readString3 = parcel.readString();
                S.c(parcel);
                byte[] g02 = g0(c2270v3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(g02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                S.c(parcel);
                S(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                D4 d47 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                String z8 = z(d47);
                parcel2.writeNoException();
                parcel2.writeString(z8);
                return true;
            case 12:
                C2173d c2173d = (C2173d) S.a(parcel, C2173d.CREATOR);
                D4 d48 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                e0(c2173d, d48);
                parcel2.writeNoException();
                return true;
            case 13:
                C2173d c2173d2 = (C2173d) S.a(parcel, C2173d.CREATOR);
                S.c(parcel);
                u(c2173d2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean f9 = S.f(parcel);
                D4 d49 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                List W7 = W(readString7, readString8, f9, d49);
                parcel2.writeNoException();
                parcel2.writeTypedList(W7);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean f10 = S.f(parcel);
                S.c(parcel);
                List t8 = t(readString9, readString10, readString11, f10);
                parcel2.writeNoException();
                parcel2.writeTypedList(t8);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                D4 d410 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                List P8 = P(readString12, readString13, d410);
                parcel2.writeNoException();
                parcel2.writeTypedList(P8);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                S.c(parcel);
                List D8 = D(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(D8);
                return true;
            case 18:
                D4 d411 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                c0(d411);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
                D4 d412 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                s(bundle, d412);
                parcel2.writeNoException();
                return true;
            case 20:
                D4 d413 = (D4) S.a(parcel, D4.CREATOR);
                S.c(parcel);
                V(d413);
                parcel2.writeNoException();
                return true;
        }
    }
}
