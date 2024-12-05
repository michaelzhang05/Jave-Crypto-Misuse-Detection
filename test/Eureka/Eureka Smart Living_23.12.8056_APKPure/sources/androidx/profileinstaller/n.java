package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f3184a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f3185b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int j6 = e.j(inputStream);
        if (j6 == 6 || j6 == 7) {
            return;
        }
        while (j6 > 0) {
            e.j(inputStream);
            for (int j7 = e.j(inputStream); j7 > 0; j7--) {
                e.h(inputStream);
            }
            j6--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, r.f3196a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f3197b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f3199d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f3198c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, r.f3200e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, d dVar) {
        int i6 = 0;
        for (int i7 : dVar.f3165h) {
            Integer valueOf = Integer.valueOf(i7);
            e.p(outputStream, valueOf.intValue() - i6);
            i6 = valueOf.intValue();
        }
    }

    private static s D(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i6 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f3160c);
                e.q(byteArrayOutputStream, dVar.f3161d);
                e.q(byteArrayOutputStream, dVar.f3164g);
                String j6 = j(dVar.f3158a, dVar.f3159b, r.f3196a);
                int k6 = e.k(j6);
                e.p(byteArrayOutputStream, k6);
                i6 = i6 + 4 + 4 + 4 + 2 + (k6 * 1);
                e.n(byteArrayOutputStream, j6);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i6 == byteArray.length) {
                s sVar = new s(f.DEX_FILES, i6, byteArray, false);
                byteArrayOutputStream.close();
                return sVar;
            }
            throw e.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f3184a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f3162e);
        e.q(outputStream, dVar.f3163f);
        e.q(outputStream, dVar.f3160c);
        e.q(outputStream, dVar.f3164g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) {
        byte[] bArr = new byte[k(dVar.f3164g)];
        for (Map.Entry entry : dVar.f3166i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) {
        int i6 = 0;
        for (Map.Entry entry : dVar.f3166i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, intValue - i6);
                e.p(outputStream, 0);
                i6 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j6 = j(dVar.f3158a, dVar.f3159b, r.f3200e);
            e.p(outputStream, e.k(j6));
            e.p(outputStream, dVar.f3166i.size());
            e.p(outputStream, dVar.f3165h.length);
            e.q(outputStream, dVar.f3160c);
            e.n(outputStream, j6);
            Iterator it = dVar.f3166i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i6 : dVar.f3165h) {
                e.p(outputStream, i6);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f3166i.size() * 4;
            String j6 = j(dVar.f3158a, dVar.f3159b, r.f3199d);
            e.p(outputStream, e.k(j6));
            e.p(outputStream, dVar.f3165h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f3160c);
            e.n(outputStream, j6);
            Iterator it = dVar.f3166i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
                e.p(outputStream, 0);
            }
            for (int i6 : dVar.f3165h) {
                e.p(outputStream, i6);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) {
        byte[] b6 = b(dVarArr, r.f3198c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b6);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) {
        byte[] b6 = b(dVarArr, r.f3197b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b6);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = r.f3196a.length + f3184a.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            s sVar = (s) arrayList.get(i6);
            e.q(outputStream, sVar.f3203a.b());
            e.q(outputStream, length2);
            if (sVar.f3206d) {
                byte[] bArr = sVar.f3205c;
                long length3 = bArr.length;
                byte[] b6 = e.b(bArr);
                arrayList2.add(b6);
                e.q(outputStream, b6.length);
                e.q(outputStream, length3);
                length = b6.length;
            } else {
                arrayList2.add(sVar.f3205c);
                e.q(outputStream, sVar.f3205c.length);
                e.q(outputStream, 0L);
                length = sVar.f3205c.length;
            }
            length2 += length;
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            outputStream.write((byte[]) arrayList2.get(i7));
        }
    }

    private static int a(d dVar) {
        Iterator it = dVar.f3166i.entrySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i6;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) {
        int i6 = 0;
        int i7 = 0;
        for (d dVar : dVarArr) {
            i7 += e.k(j(dVar.f3158a, dVar.f3159b, bArr)) + 16 + (dVar.f3162e * 2) + dVar.f3163f + k(dVar.f3164g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, r.f3198c)) {
            int length = dVarArr.length;
            while (i6 < length) {
                d dVar2 = dVarArr[i6];
                G(byteArrayOutputStream, dVar2, j(dVar2.f3158a, dVar2.f3159b, bArr));
                F(byteArrayOutputStream, dVar2);
                i6++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f3158a, dVar3.f3159b, bArr));
            }
            int length2 = dVarArr.length;
            while (i6 < length2) {
                F(byteArrayOutputStream, dVarArr[i6]);
                i6++;
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
    }

    private static s c(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 0;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            try {
                d dVar = dVarArr[i7];
                e.p(byteArrayOutputStream, i7);
                e.p(byteArrayOutputStream, dVar.f3162e);
                i6 = i6 + 2 + 2 + (dVar.f3162e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            s sVar = new s(f.CLASSES, i6, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw e.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    private static s d(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 0;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            try {
                d dVar = dVarArr[i7];
                int a6 = a(dVar);
                byte[] e6 = e(dVar);
                byte[] f6 = f(dVar);
                e.p(byteArrayOutputStream, i7);
                int length = e6.length + 2 + f6.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a6);
                byteArrayOutputStream.write(e6);
                byteArrayOutputStream.write(f6);
                i6 = i6 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            s sVar = new s(f.METHODS, i6, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw e.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h6 = h(str);
        for (int i6 = 0; i6 < dVarArr.length; i6++) {
            if (dVarArr[i6].f3159b.equals(h6)) {
                return dVarArr[i6];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a6 = r.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a6);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a6);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + r.a(bArr) + str2;
    }

    private static int k(int i6) {
        return y(i6 * 2) / 8;
    }

    private static int l(int i6, int i7, int i8) {
        if (i6 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i6 == 2) {
            return i7;
        }
        if (i6 == 4) {
            return i7 + i8;
        }
        throw e.c("Unexpected flag: " + i6);
    }

    private static int[] m(InputStream inputStream, int i6) {
        int[] iArr = new int[i6];
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += e.h(inputStream);
            iArr[i8] = i7;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i6, int i7) {
        int i8 = bitSet.get(l(2, i6, i7)) ? 2 : 0;
        return bitSet.get(l(4, i6, i7)) ? i8 | 4 : i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, r.f3197b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int available = inputStream.available() - dVar.f3163f;
        int i6 = 0;
        while (inputStream.available() > available) {
            i6 += e.h(inputStream);
            dVar.f3166i.put(Integer.valueOf(i6), 1);
            for (int h6 = e.h(inputStream); h6 > 0; h6--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, r.f3201f)) {
            if (Arrays.equals(r.f3196a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, r.f3202g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        if (!Arrays.equals(bArr, r.f3201f)) {
            throw e.c("Unsupported meta version");
        }
        int j6 = e.j(inputStream);
        byte[] e6 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            d[] s5 = s(byteArrayInputStream, j6, dVarArr);
            byteArrayInputStream.close();
            return s5;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] s(InputStream inputStream, int i6, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i6 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i6];
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int h6 = e.h(inputStream);
            iArr[i7] = e.h(inputStream);
            strArr[i7] = e.f(inputStream, h6);
        }
        for (int i8 = 0; i8 < i6; i8++) {
            d dVar = dVarArr[i8];
            if (!dVar.f3159b.equals(strArr[i8])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i9 = iArr[i8];
            dVar.f3162e = i9;
            dVar.f3165h = m(inputStream, i9);
        }
        return dVarArr;
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        int h6 = e.h(inputStream);
        byte[] e6 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            d[] u5 = u(byteArrayInputStream, bArr, h6, dVarArr);
            byteArrayInputStream.close();
            return u5;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i6, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i6 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            e.h(inputStream);
            String f6 = e.f(inputStream, e.h(inputStream));
            long i8 = e.i(inputStream);
            int h6 = e.h(inputStream);
            d i9 = i(dVarArr, f6);
            if (i9 == null) {
                throw e.c("Missing profile key: " + f6);
            }
            i9.f3161d = i8;
            int[] m6 = m(inputStream, h6);
            if (Arrays.equals(bArr, r.f3200e)) {
                i9.f3162e = h6;
                i9.f3165h = m6;
            }
        }
        return dVarArr;
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f3164g * 2)));
        int i6 = 0;
        while (true) {
            int i7 = dVar.f3164g;
            if (i6 >= i7) {
                return;
            }
            int n6 = n(valueOf, i6, i7);
            if (n6 != 0) {
                Integer num = (Integer) dVar.f3166i.get(Integer.valueOf(i6));
                if (num == null) {
                    num = 0;
                }
                dVar.f3166i.put(Integer.valueOf(i6), Integer.valueOf(n6 | num.intValue()));
            }
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d[] w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, r.f3197b)) {
            throw e.c("Unsupported version");
        }
        int j6 = e.j(inputStream);
        byte[] e6 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e6);
        try {
            d[] x5 = x(byteArrayInputStream, str, j6);
            byteArrayInputStream.close();
            return x5;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] x(InputStream inputStream, String str, int i6) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int h6 = e.h(inputStream);
            int h7 = e.h(inputStream);
            long i8 = e.i(inputStream);
            dVarArr[i7] = new d(str, e.f(inputStream, h6), e.i(inputStream), 0L, h7, (int) i8, (int) e.i(inputStream), new int[h7], new TreeMap());
        }
        for (int i9 = 0; i9 < i6; i9++) {
            d dVar = dVarArr[i9];
            p(inputStream, dVar);
            dVar.f3165h = m(inputStream, dVar.f3162e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i6) {
        return ((i6 + 8) - 1) & (-8);
    }

    private static void z(byte[] bArr, int i6, int i7, d dVar) {
        int l6 = l(i6, i7, dVar.f3164g);
        int i8 = l6 / 8;
        bArr[i8] = (byte) ((1 << (l6 % 8)) | bArr[i8]);
    }
}
