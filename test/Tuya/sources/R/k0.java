package R;

import O.C1260d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C1309f c1309f, Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, c1309f.f8544a);
        S.c.k(parcel, 2, c1309f.f8545b);
        S.c.k(parcel, 3, c1309f.f8546c);
        S.c.q(parcel, 4, c1309f.f8547d, false);
        S.c.j(parcel, 5, c1309f.f8548e, false);
        S.c.t(parcel, 6, c1309f.f8549f, i8, false);
        S.c.e(parcel, 7, c1309f.f8550g, false);
        S.c.p(parcel, 8, c1309f.f8551h, i8, false);
        S.c.t(parcel, 10, c1309f.f8552i, i8, false);
        S.c.t(parcel, 11, c1309f.f8553j, i8, false);
        S.c.c(parcel, 12, c1309f.f8554k);
        S.c.k(parcel, 13, c1309f.f8555l);
        S.c.c(parcel, 14, c1309f.f8556m);
        S.c.q(parcel, 15, c1309f.s(), false);
        S.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        Scope[] scopeArr = C1309f.f8542o;
        Bundle bundle = new Bundle();
        C1260d[] c1260dArr = C1309f.f8543p;
        C1260d[] c1260dArr2 = c1260dArr;
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
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 2:
                    i9 = S.b.t(parcel, r8);
                    break;
                case 3:
                    i10 = S.b.t(parcel, r8);
                    break;
                case 4:
                    str = S.b.f(parcel, r8);
                    break;
                case 5:
                    iBinder = S.b.s(parcel, r8);
                    break;
                case 6:
                    scopeArr = (Scope[]) S.b.i(parcel, r8, Scope.CREATOR);
                    break;
                case 7:
                    bundle = S.b.a(parcel, r8);
                    break;
                case 8:
                    account = (Account) S.b.e(parcel, r8, Account.CREATOR);
                    break;
                case 9:
                default:
                    S.b.x(parcel, r8);
                    break;
                case 10:
                    c1260dArr = (C1260d[]) S.b.i(parcel, r8, C1260d.CREATOR);
                    break;
                case 11:
                    c1260dArr2 = (C1260d[]) S.b.i(parcel, r8, C1260d.CREATOR);
                    break;
                case 12:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 13:
                    i11 = S.b.t(parcel, r8);
                    break;
                case 14:
                    z9 = S.b.m(parcel, r8);
                    break;
                case 15:
                    str2 = S.b.f(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C1309f(i8, i9, i10, str, iBinder, scopeArr, bundle, account, c1260dArr, c1260dArr2, z8, i11, z9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1309f[i8];
    }
}
