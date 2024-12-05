package Q;

import N.C1333d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C1390f c1390f, Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, c1390f.f9006a);
        R.c.k(parcel, 2, c1390f.f9007b);
        R.c.k(parcel, 3, c1390f.f9008c);
        R.c.q(parcel, 4, c1390f.f9009d, false);
        R.c.j(parcel, 5, c1390f.f9010e, false);
        R.c.t(parcel, 6, c1390f.f9011f, i8, false);
        R.c.e(parcel, 7, c1390f.f9012g, false);
        R.c.p(parcel, 8, c1390f.f9013h, i8, false);
        R.c.t(parcel, 10, c1390f.f9014i, i8, false);
        R.c.t(parcel, 11, c1390f.f9015j, i8, false);
        R.c.c(parcel, 12, c1390f.f9016k);
        R.c.k(parcel, 13, c1390f.f9017l);
        R.c.c(parcel, 14, c1390f.f9018m);
        R.c.q(parcel, 15, c1390f.p(), false);
        R.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Scope[] scopeArr = C1390f.f9004o;
        Bundle bundle = new Bundle();
        C1333d[] c1333dArr = C1390f.f9005p;
        C1333d[] c1333dArr2 = c1333dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 2:
                    i9 = R.b.t(parcel, r8);
                    break;
                case 3:
                    i10 = R.b.t(parcel, r8);
                    break;
                case 4:
                    str = R.b.f(parcel, r8);
                    break;
                case 5:
                    iBinder = R.b.s(parcel, r8);
                    break;
                case 6:
                    scopeArr = (Scope[]) R.b.i(parcel, r8, Scope.CREATOR);
                    break;
                case 7:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 8:
                    account = (Account) R.b.e(parcel, r8, Account.CREATOR);
                    break;
                case 9:
                default:
                    R.b.x(parcel, r8);
                    break;
                case 10:
                    c1333dArr = (C1333d[]) R.b.i(parcel, r8, C1333d.CREATOR);
                    break;
                case 11:
                    c1333dArr2 = (C1333d[]) R.b.i(parcel, r8, C1333d.CREATOR);
                    break;
                case 12:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 13:
                    i11 = R.b.t(parcel, r8);
                    break;
                case 14:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 15:
                    str2 = R.b.f(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C1390f(i8, i9, i10, str, iBinder, scopeArr, bundle, account, c1333dArr, c1333dArr2, z8, i11, z9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1390f[i8];
    }
}
