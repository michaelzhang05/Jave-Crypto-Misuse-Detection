package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 2:
                    str = S.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 4:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 5:
                    str4 = S.b.f(parcel, r8);
                    break;
                case 6:
                    uri = (Uri) S.b.e(parcel, r8, Uri.CREATOR);
                    break;
                case 7:
                    str5 = S.b.f(parcel, r8);
                    break;
                case 8:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 9:
                    str6 = S.b.f(parcel, r8);
                    break;
                case 10:
                    arrayList = S.b.j(parcel, r8, Scope.CREATOR);
                    break;
                case 11:
                    str7 = S.b.f(parcel, r8);
                    break;
                case 12:
                    str8 = S.b.f(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new GoogleSignInAccount(i8, str, str2, str3, str4, uri, str5, j8, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
