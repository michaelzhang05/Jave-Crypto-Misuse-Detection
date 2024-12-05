package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    public static IBinder A(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + G);
        return readStrongBinder;
    }

    public static int B(Parcel parcel, int i2) {
        J(parcel, i2, 4);
        return parcel.readInt();
    }

    public static Integer C(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        if (G == 0) {
            return null;
        }
        K(parcel, i2, G, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long D(Parcel parcel, int i2) {
        J(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long E(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        if (G == 0) {
            return null;
        }
        K(parcel, i2, G, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short F(Parcel parcel, int i2) {
        J(parcel, i2, 4);
        return (short) parcel.readInt();
    }

    public static int G(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (i2 >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE : parcel.readInt();
    }

    public static void H(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + G(parcel, i2));
    }

    public static int I(Parcel parcel) {
        int z = z(parcel);
        int G = G(parcel, z);
        int dataPosition = parcel.dataPosition();
        if (v(z) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(z));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = G + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void J(Parcel parcel, int i2, int i3) {
        int G = G(parcel, i2);
        if (G == i3) {
            return;
        }
        String hexString = Integer.toHexString(G);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(G);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }

    private static void K(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(i3);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + G);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + G);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + G);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + G);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + G);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + G);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + G);
        return createByteArray;
    }

    public static double[] h(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + G);
        return createDoubleArray;
    }

    public static float[] i(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + G);
        return createFloatArray;
    }

    public static int[] j(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + G);
        return createIntArray;
    }

    public static ArrayList<Integer> k(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + G);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + G);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, G);
        parcel.setDataPosition(dataPosition + G);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i3] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(dataPosition + G);
        return parcelArr;
    }

    public static <T extends Parcelable> T o(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + G);
        return createFromParcel;
    }

    public static String p(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + G);
        return readString;
    }

    public static String[] q(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + G);
        return createStringArray;
    }

    public static ArrayList<String> r(Parcel parcel, int i2) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + G);
        return createStringArrayList;
    }

    public static <T> T[] s(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + G);
        return tArr;
    }

    public static <T> ArrayList<T> t(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int G = G(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (G == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + G);
        return createTypedArrayList;
    }

    public static void u(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new ParseException(sb.toString(), parcel);
    }

    public static int v(int i2) {
        return i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public static boolean w(Parcel parcel, int i2) {
        J(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static double x(Parcel parcel, int i2) {
        J(parcel, i2, 8);
        return parcel.readDouble();
    }

    public static float y(Parcel parcel, int i2) {
        J(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static int z(Parcel parcel) {
        return parcel.readInt();
    }
}
