package i0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2971a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f32844a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32845b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2971a(IBinder iBinder, String str) {
        this.f32844a = iBinder;
        this.f32845b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32844a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32845b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32844a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8, Parcel parcel) {
        try {
            this.f32844a.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
