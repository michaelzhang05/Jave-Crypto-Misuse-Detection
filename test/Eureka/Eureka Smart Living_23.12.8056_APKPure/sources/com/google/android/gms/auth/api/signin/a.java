package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import t3.b0;
import w1.b;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = b.q(parcel);
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
        long j6 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = b.k(parcel);
            switch (b.i(k6)) {
                case 1:
                    i6 = b.m(parcel, k6);
                    break;
                case 2:
                    str = b.d(parcel, k6);
                    break;
                case 3:
                    str2 = b.d(parcel, k6);
                    break;
                case 4:
                    str3 = b.d(parcel, k6);
                    break;
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    str4 = b.d(parcel, k6);
                    break;
                case 6:
                    uri = (Uri) b.c(parcel, k6, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel, k6);
                    break;
                case 8:
                    j6 = b.n(parcel, k6);
                    break;
                case 9:
                    str6 = b.d(parcel, k6);
                    break;
                case 10:
                    arrayList = b.g(parcel, k6, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel, k6);
                    break;
                case 12:
                    str8 = b.d(parcel, k6);
                    break;
                default:
                    b.p(parcel, k6);
                    break;
            }
        }
        b.h(parcel, q6);
        return new GoogleSignInAccount(i6, str, str2, str3, str4, uri, str5, j6, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new GoogleSignInAccount[i6];
    }
}
