package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int a(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        x(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z) {
        y(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeBundle(bundle);
            x(parcel, v);
        }
    }

    public static void e(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeByteArray(bArr);
            x(parcel, v);
        }
    }

    public static void f(Parcel parcel, int i2, double d2) {
        y(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void g(Parcel parcel, int i2, float f2) {
        y(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void h(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            x(parcel, v);
        }
    }

    public static void i(Parcel parcel, int i2, int i3) {
        y(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void j(Parcel parcel, int i2, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                y(parcel, i2, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).intValue());
        }
        x(parcel, v);
    }

    public static void k(Parcel parcel, int i2, Integer num, boolean z) {
        if (num != null) {
            y(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            y(parcel, i2, 0);
        }
    }

    public static void l(Parcel parcel, int i2, long j2) {
        y(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void m(Parcel parcel, int i2, Long l, boolean z) {
        if (l != null) {
            y(parcel, i2, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            y(parcel, i2, 0);
        }
    }

    public static void n(Parcel parcel, int i2, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            x(parcel, v);
        }
    }

    public static void o(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            x(parcel, v);
        }
    }

    public static void p(Parcel parcel, int i2, short s) {
        y(parcel, i2, 4);
        parcel.writeInt(s);
    }

    public static void q(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeString(str);
            x(parcel, v);
        }
    }

    public static void r(Parcel parcel, int i2, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeStringArray(strArr);
            x(parcel, v);
        }
    }

    public static void s(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                y(parcel, i2, 0);
            }
        } else {
            int v = v(parcel, i2);
            parcel.writeStringList(list);
            x(parcel, v);
        }
    }

    public static <T extends Parcelable> void t(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                y(parcel, i2, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, t, i3);
            }
        }
        x(parcel, v);
    }

    public static <T extends Parcelable> void u(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                y(parcel, i2, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, t, 0);
            }
        }
        x(parcel, v);
    }

    private static int v(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <T extends Parcelable> void w(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void x(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void y(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | (-65536));
            parcel.writeInt(i3);
        } else {
            parcel.writeInt(i2 | (i3 << 16));
        }
    }
}
