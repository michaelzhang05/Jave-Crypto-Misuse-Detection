package v1;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, fVar.f9569a);
        w1.c.f(parcel, 2, fVar.f9570b);
        w1.c.f(parcel, 3, fVar.f9571c);
        w1.c.j(parcel, 4, fVar.f9572d, false);
        w1.c.e(parcel, 5, fVar.f9573e, false);
        w1.c.l(parcel, 6, fVar.f9574f, i6, false);
        w1.c.d(parcel, 7, fVar.f9575g, false);
        w1.c.i(parcel, 8, fVar.f9576h, i6, false);
        w1.c.l(parcel, 10, fVar.f9577i, i6, false);
        w1.c.l(parcel, 11, fVar.f9578j, i6, false);
        w1.c.c(parcel, 12, fVar.f9579k);
        w1.c.f(parcel, 13, fVar.f9580l);
        w1.c.c(parcel, 14, fVar.f9581m);
        w1.c.j(parcel, 15, fVar.a(), false);
        w1.c.b(parcel, a6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        Scope[] scopeArr = f.f9567o;
        Bundle bundle = new Bundle();
        s1.c[] cVarArr = f.f9568p;
        s1.c[] cVarArr2 = cVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            switch (w1.b.i(k6)) {
                case 1:
                    i6 = w1.b.m(parcel, k6);
                    break;
                case 2:
                    i7 = w1.b.m(parcel, k6);
                    break;
                case 3:
                    i8 = w1.b.m(parcel, k6);
                    break;
                case 4:
                    str = w1.b.d(parcel, k6);
                    break;
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    iBinder = w1.b.l(parcel, k6);
                    break;
                case 6:
                    scopeArr = (Scope[]) w1.b.f(parcel, k6, Scope.CREATOR);
                    break;
                case 7:
                    bundle = w1.b.a(parcel, k6);
                    break;
                case 8:
                    account = (Account) w1.b.c(parcel, k6, Account.CREATOR);
                    break;
                case 9:
                default:
                    w1.b.p(parcel, k6);
                    break;
                case 10:
                    cVarArr = (s1.c[]) w1.b.f(parcel, k6, s1.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (s1.c[]) w1.b.f(parcel, k6, s1.c.CREATOR);
                    break;
                case 12:
                    z5 = w1.b.j(parcel, k6);
                    break;
                case 13:
                    i9 = w1.b.m(parcel, k6);
                    break;
                case 14:
                    z6 = w1.b.j(parcel, k6);
                    break;
                case 15:
                    str2 = w1.b.d(parcel, k6);
                    break;
            }
        }
        w1.b.h(parcel, q6);
        return new f(i6, i7, i8, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z5, i9, z6, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new f[i6];
    }
}
