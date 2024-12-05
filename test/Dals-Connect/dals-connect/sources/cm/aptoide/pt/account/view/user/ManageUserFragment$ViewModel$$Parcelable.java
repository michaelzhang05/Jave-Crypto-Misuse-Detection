package cm.aptoide.pt.account.view.user;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.pt.account.view.user.ManageUserFragment;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class ManageUserFragment$ViewModel$$Parcelable implements Parcelable, org.parceler.c<ManageUserFragment.ViewModel> {
    public static final Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable> CREATOR = new Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable>() { // from class: cm.aptoide.pt.account.view.user.ManageUserFragment$ViewModel$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageUserFragment$ViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment$ViewModel$$Parcelable.read(parcel, new org.parceler.a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageUserFragment$ViewModel$$Parcelable[] newArray(int i2) {
            return new ManageUserFragment$ViewModel$$Parcelable[i2];
        }
    };
    private ManageUserFragment.ViewModel viewModel$$0;

    public ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment.ViewModel viewModel) {
        this.viewModel$$0 = viewModel;
    }

    public static ManageUserFragment.ViewModel read(Parcel parcel, org.parceler.a aVar) {
        int readInt = parcel.readInt();
        if (aVar.a(readInt)) {
            if (!aVar.d(readInt)) {
                return (ManageUserFragment.ViewModel) aVar.b(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        int g2 = aVar.g();
        ManageUserFragment.ViewModel viewModel = new ManageUserFragment.ViewModel();
        aVar.f(g2, viewModel);
        viewModel.hasNewPicture = parcel.readInt() == 1;
        viewModel.name = parcel.readString();
        viewModel.pictureUri = parcel.readString();
        aVar.f(readInt, viewModel);
        return viewModel;
    }

    public static void write(ManageUserFragment.ViewModel viewModel, Parcel parcel, int i2, org.parceler.a aVar) {
        int c2 = aVar.c(viewModel);
        if (c2 != -1) {
            parcel.writeInt(c2);
            return;
        }
        parcel.writeInt(aVar.e(viewModel));
        parcel.writeInt(viewModel.hasNewPicture ? 1 : 0);
        parcel.writeString(viewModel.name);
        parcel.writeString(viewModel.pictureUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.viewModel$$0, parcel, i2, new org.parceler.a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.c
    public ManageUserFragment.ViewModel getParcel() {
        return this.viewModel$$0;
    }
}
