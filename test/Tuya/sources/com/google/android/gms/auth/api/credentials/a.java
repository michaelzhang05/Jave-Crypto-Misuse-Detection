package com.google.android.gms.auth.api.credentials;

import S.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = b.y(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = b.r(parcel);
            switch (b.l(r8)) {
                case 1:
                    str = b.f(parcel, r8);
                    break;
                case 2:
                    str2 = b.f(parcel, r8);
                    break;
                case 3:
                    uri = (Uri) b.e(parcel, r8, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = b.j(parcel, r8, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = b.f(parcel, r8);
                    break;
                case 6:
                    str4 = b.f(parcel, r8);
                    break;
                case 7:
                case 8:
                default:
                    b.x(parcel, r8);
                    break;
                case 9:
                    str5 = b.f(parcel, r8);
                    break;
                case 10:
                    str6 = b.f(parcel, r8);
                    break;
            }
        }
        b.k(parcel, y8);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Credential[i8];
    }
}
