package cm.aptoide.pt.ads.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.ParcelerRuntimeException;
import org.parceler.a;
import org.parceler.c;

/* loaded from: classes.dex */
public class Payout$$Parcelable implements Parcelable, c<Payout> {
    public static final Parcelable.Creator<Payout$$Parcelable> CREATOR = new Parcelable.Creator<Payout$$Parcelable>() { // from class: cm.aptoide.pt.ads.data.Payout$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable createFromParcel(Parcel parcel) {
            return new Payout$$Parcelable(Payout$$Parcelable.read(parcel, new a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable[] newArray(int i2) {
            return new Payout$$Parcelable[i2];
        }
    };
    private Payout payout$$0;

    public Payout$$Parcelable(Payout payout) {
        this.payout$$0 = payout;
    }

    public static Payout read(Parcel parcel, a aVar) {
        int readInt = parcel.readInt();
        if (aVar.a(readInt)) {
            if (!aVar.d(readInt)) {
                return (Payout) aVar.b(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        int g2 = aVar.g();
        Payout payout = new Payout();
        aVar.f(g2, payout);
        payout.fiatAmount = parcel.readDouble();
        payout.fiatCurrency = parcel.readString();
        payout.fiatSymbol = parcel.readString();
        payout.appcAmount = parcel.readDouble();
        aVar.f(readInt, payout);
        return payout;
    }

    public static void write(Payout payout, Parcel parcel, int i2, a aVar) {
        int c2 = aVar.c(payout);
        if (c2 != -1) {
            parcel.writeInt(c2);
            return;
        }
        parcel.writeInt(aVar.e(payout));
        parcel.writeDouble(payout.fiatAmount);
        parcel.writeString(payout.fiatCurrency);
        parcel.writeString(payout.fiatSymbol);
        parcel.writeDouble(payout.appcAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.payout$$0, parcel, i2, new a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.c
    public Payout getParcel() {
        return this.payout$$0;
    }
}
