package w1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return n(parcel, 20293);
    }

    public static void b(Parcel parcel, int i6) {
        o(parcel, i6);
    }

    public static void c(Parcel parcel, int i6, boolean z5) {
        p(parcel, i6, 4);
        parcel.writeInt(z5 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i6, Bundle bundle, boolean z5) {
        if (bundle == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcel.writeBundle(bundle);
            o(parcel, n6);
        }
    }

    public static void e(Parcel parcel, int i6, IBinder iBinder, boolean z5) {
        if (iBinder == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcel.writeStrongBinder(iBinder);
            o(parcel, n6);
        }
    }

    public static void f(Parcel parcel, int i6, int i7) {
        p(parcel, i6, 4);
        parcel.writeInt(i7);
    }

    public static void g(Parcel parcel, int i6, int[] iArr, boolean z5) {
        if (iArr == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcel.writeIntArray(iArr);
            o(parcel, n6);
        }
    }

    public static void h(Parcel parcel, int i6, long j6) {
        p(parcel, i6, 8);
        parcel.writeLong(j6);
    }

    public static void i(Parcel parcel, int i6, Parcelable parcelable, int i7, boolean z5) {
        if (parcelable == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcelable.writeToParcel(parcel, i7);
            o(parcel, n6);
        }
    }

    public static void j(Parcel parcel, int i6, String str, boolean z5) {
        if (str == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcel.writeString(str);
            o(parcel, n6);
        }
    }

    public static void k(Parcel parcel, int i6, List list, boolean z5) {
        if (list == null) {
            if (z5) {
                p(parcel, i6, 0);
            }
        } else {
            int n6 = n(parcel, i6);
            parcel.writeStringList(list);
            o(parcel, n6);
        }
    }

    public static void l(Parcel parcel, int i6, Parcelable[] parcelableArr, int i7, boolean z5) {
        if (parcelableArr == null) {
            if (z5) {
                p(parcel, i6, 0);
                return;
            }
            return;
        }
        int n6 = n(parcel, i6);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                q(parcel, parcelable, i7);
            }
        }
        o(parcel, n6);
    }

    public static void m(Parcel parcel, int i6, List list, boolean z5) {
        if (list == null) {
            if (z5) {
                p(parcel, i6, 0);
                return;
            }
            return;
        }
        int n6 = n(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            Parcelable parcelable = (Parcelable) list.get(i7);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                q(parcel, parcelable, 0);
            }
        }
        o(parcel, n6);
    }

    private static int n(Parcel parcel, int i6) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void o(Parcel parcel, int i6) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(dataPosition - i6);
        parcel.setDataPosition(dataPosition);
    }

    private static void p(Parcel parcel, int i6, int i7) {
        parcel.writeInt(i6 | (i7 << 16));
    }

    private static void q(Parcel parcel, Parcelable parcelable, int i6) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i6);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
