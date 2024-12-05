package w1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i6) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o6);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i6) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o6);
        return createIntArray;
    }

    public static Parcelable c(Parcel parcel, int i6, Parcelable.Creator creator) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o6);
        return parcelable;
    }

    public static String d(Parcel parcel, int i6) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o6);
        return readString;
    }

    public static ArrayList e(Parcel parcel, int i6) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o6);
        return createStringArrayList;
    }

    public static Object[] f(Parcel parcel, int i6, Parcelable.Creator creator) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o6);
        return createTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i6, Parcelable.Creator creator) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + o6);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i6) {
        if (parcel.dataPosition() == i6) {
            return;
        }
        throw new a("Overread allowed size end=" + i6, parcel);
    }

    public static int i(int i6) {
        return (char) i6;
    }

    public static boolean j(Parcel parcel, int i6) {
        r(parcel, i6, 4);
        return parcel.readInt() != 0;
    }

    public static int k(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder l(Parcel parcel, int i6) {
        int o6 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o6 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o6);
        return readStrongBinder;
    }

    public static int m(Parcel parcel, int i6) {
        r(parcel, i6, 4);
        return parcel.readInt();
    }

    public static long n(Parcel parcel, int i6) {
        r(parcel, i6, 8);
        return parcel.readLong();
    }

    public static int o(Parcel parcel, int i6) {
        return (i6 & (-65536)) != -65536 ? (char) (i6 >> 16) : parcel.readInt();
    }

    public static void p(Parcel parcel, int i6) {
        parcel.setDataPosition(parcel.dataPosition() + o(parcel, i6));
    }

    public static int q(Parcel parcel) {
        int k6 = k(parcel);
        int o6 = o(parcel, k6);
        int dataPosition = parcel.dataPosition();
        if (i(k6) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(k6))), parcel);
        }
        int i6 = o6 + dataPosition;
        if (i6 >= dataPosition && i6 <= parcel.dataSize()) {
            return i6;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i6, parcel);
    }

    private static void r(Parcel parcel, int i6, int i7) {
        int o6 = o(parcel, i6);
        if (o6 == i7) {
            return;
        }
        throw new a("Expected size " + i7 + " got " + o6 + " (0x" + Integer.toHexString(o6) + ")", parcel);
    }
}
