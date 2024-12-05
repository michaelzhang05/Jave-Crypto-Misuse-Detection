package d2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f6473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6474b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f6473a = iBinder;
        this.f6474b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6474b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6473a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i6, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6473a.transact(i6, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i6, Parcel parcel) {
        try {
            this.f6473a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
