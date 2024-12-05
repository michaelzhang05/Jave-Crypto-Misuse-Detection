package O;

import R.v0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class I extends S.a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    private final String f7639a;

    /* renamed from: b, reason: collision with root package name */
    private final z f7640b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7641c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7642d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(String str, z zVar, boolean z8, boolean z9) {
        this.f7639a = str;
        this.f7640b = zVar;
        this.f7641c = z8;
        this.f7642d = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7639a;
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, str, false);
        z zVar = this.f7640b;
        if (zVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zVar = null;
        }
        S.c.j(parcel, 2, zVar, false);
        S.c.c(parcel, 3, this.f7641c);
        S.c.c(parcel, 4, this.f7642d);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(String str, IBinder iBinder, boolean z8, boolean z9) {
        this.f7639a = str;
        A a8 = null;
        if (iBinder != null) {
            try {
                Z.a d8 = v0.j(iBinder).d();
                byte[] bArr = d8 == null ? null : (byte[]) Z.b.l(d8);
                if (bArr != null) {
                    a8 = new A(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f7640b = a8;
        this.f7641c = z8;
        this.f7642d = z9;
    }
}
