package h0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h0.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i6 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i6 == 1) {
                int d6 = d(a.AbstractBinderC0103a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(d6);
            } else if (i6 == 2) {
                h(a.AbstractBinderC0103a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i6 != 3) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                o(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int d(h0.a aVar, String str);

    void h(h0.a aVar, int i6);

    void o(int i6, String[] strArr);
}
