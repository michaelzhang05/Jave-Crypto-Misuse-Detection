package N;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    Messenger f7107a;

    public h(IBinder iBinder) {
        this.f7107a = new Messenger(iBinder);
    }

    public final IBinder b() {
        Messenger messenger = this.f7107a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void c(Message message) {
        Messenger messenger = this.f7107a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return b().equals(((h) obj).b());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Messenger messenger = this.f7107a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
