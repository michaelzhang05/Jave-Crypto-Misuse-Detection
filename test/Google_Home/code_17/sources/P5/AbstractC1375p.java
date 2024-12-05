package P5;

import b6.InterfaceC1985a;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3237f;
import kotlin.jvm.internal.AbstractC3238g;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: P5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1375p extends AbstractC1374o {

    /* renamed from: P5.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f8890a;

        public a(Object[] objArr) {
            this.f8890a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3237f.a(this.f8890a);
        }
    }

    /* renamed from: P5.p$b */
    /* loaded from: classes5.dex */
    public static final class b implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f8891a;

        public b(int[] iArr) {
            this.f8891a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3238g.c(this.f8891a);
        }
    }

    /* renamed from: P5.p$c */
    /* loaded from: classes5.dex */
    public static final class c implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f8892a;

        public c(long[] jArr) {
            this.f8892a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3238g.d(this.f8892a);
        }
    }

    /* renamed from: P5.p$d */
    /* loaded from: classes5.dex */
    public static final class d implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float[] f8893a;

        public d(float[] fArr) {
            this.f8893a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3238g.b(this.f8893a);
        }
    }

    /* renamed from: P5.p$e */
    /* loaded from: classes5.dex */
    public static final class e implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double[] f8894a;

        public e(double[] dArr) {
            this.f8894a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3238g.a(this.f8894a);
        }
    }

    /* renamed from: P5.p$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC2998g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f8895a;

        public f(Object[] objArr) {
            this.f8895a = objArr;
        }

        @Override // i6.InterfaceC2998g
        public Iterator iterator() {
            return AbstractC3237f.a(this.f8895a);
        }
    }

    /* renamed from: P5.p$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f8896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object[] objArr) {
            super(0);
            this.f8896a = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return AbstractC3237f.a(this.f8896a);
        }
    }

    public static Object A0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[AbstractC1371l.i0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int B0(Object[] objArr, Object obj) {
        AbstractC3255y.i(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i9 = length2 - 1;
                    if (AbstractC3255y.d(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length2 = i9;
                }
            }
        }
        return -1;
    }

    public static Object C0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static int D0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            N it = new g6.i(1, AbstractC1371l.g0(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static Integer E0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        N it = new g6.i(1, AbstractC1371l.g0(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (i8 > i9) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final void F0(float[] fArr, int i8, int i9) {
        AbstractC3255y.i(fArr, "<this>");
        AbstractC1362c.Companion.d(i8, i9, fArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i11];
            fArr[i11] = f8;
            i11--;
            i8++;
        }
    }

    public static final void G0(int[] iArr, int i8, int i9) {
        AbstractC3255y.i(iArr, "<this>");
        AbstractC1362c.Companion.d(i8, i9, iArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            int i12 = iArr[i8];
            iArr[i8] = iArr[i11];
            iArr[i11] = i12;
            i11--;
            i8++;
        }
    }

    public static final void H0(long[] jArr, int i8, int i9) {
        AbstractC3255y.i(jArr, "<this>");
        AbstractC1362c.Companion.d(i8, i9, jArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i11];
            jArr[i11] = j8;
            i11--;
            i8++;
        }
    }

    public static List I0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 0) {
            return AbstractC1378t.m();
        }
        List Y02 = Y0(objArr);
        C.a0(Y02);
        return Y02;
    }

    public static char J0(char[] cArr) {
        AbstractC3255y.i(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object K0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static List L0(Object[] objArr, g6.i indices) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(indices, "indices");
        if (indices.isEmpty()) {
            return AbstractC1378t.m();
        }
        return AbstractC1371l.c(AbstractC1371l.p(objArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static Iterable M(double[] dArr) {
        AbstractC3255y.i(dArr, "<this>");
        if (dArr.length == 0) {
            return AbstractC1378t.m();
        }
        return new e(dArr);
    }

    public static void M0(float[] fArr, int i8, int i9) {
        AbstractC3255y.i(fArr, "<this>");
        AbstractC1371l.G(fArr, i8, i9);
        F0(fArr, i8, i9);
    }

    public static Iterable N(float[] fArr) {
        AbstractC3255y.i(fArr, "<this>");
        if (fArr.length == 0) {
            return AbstractC1378t.m();
        }
        return new d(fArr);
    }

    public static void N0(int[] iArr, int i8, int i9) {
        AbstractC3255y.i(iArr, "<this>");
        AbstractC1371l.H(iArr, i8, i9);
        G0(iArr, i8, i9);
    }

    public static Iterable O(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        if (iArr.length == 0) {
            return AbstractC1378t.m();
        }
        return new b(iArr);
    }

    public static void O0(long[] jArr, int i8, int i9) {
        AbstractC3255y.i(jArr, "<this>");
        AbstractC1371l.I(jArr, i8, i9);
        H0(jArr, i8, i9);
    }

    public static Iterable P(long[] jArr) {
        AbstractC3255y.i(jArr, "<this>");
        if (jArr.length == 0) {
            return AbstractC1378t.m();
        }
        return new c(jArr);
    }

    public static final Object[] P0(Object[] objArr, Comparator comparator) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3255y.h(copyOf, "copyOf(...)");
        AbstractC1374o.K(copyOf, comparator);
        return copyOf;
    }

    public static Iterable Q(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 0) {
            return AbstractC1378t.m();
        }
        return new a(objArr);
    }

    public static List Q0(Object[] objArr, Comparator comparator) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(comparator, "comparator");
        return AbstractC1371l.c(P0(objArr, comparator));
    }

    public static InterfaceC2998g R(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 0) {
            return AbstractC3001j.e();
        }
        return new f(objArr);
    }

    public static int R0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        return i8;
    }

    public static boolean S(byte[] bArr, byte b8) {
        AbstractC3255y.i(bArr, "<this>");
        if (l0(bArr, b8) >= 0) {
            return true;
        }
        return false;
    }

    public static final List S0(Object[] objArr, int i8) {
        AbstractC3255y.i(objArr, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC1378t.m();
            }
            int length = objArr.length;
            if (i8 >= length) {
                return AbstractC1371l.V0(objArr);
            }
            if (i8 == 1) {
                return AbstractC1378t.e(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = length - i8; i9 < length; i9++) {
                arrayList.add(objArr[i9]);
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static boolean T(char[] cArr, char c8) {
        AbstractC3255y.i(cArr, "<this>");
        if (m0(cArr, c8) >= 0) {
            return true;
        }
        return false;
    }

    public static final Collection T0(Object[] objArr, Collection destination) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static boolean U(int[] iArr, int i8) {
        AbstractC3255y.i(iArr, "<this>");
        if (AbstractC1371l.n0(iArr, i8) >= 0) {
            return true;
        }
        return false;
    }

    public static List U0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return AbstractC1371l.X0(iArr);
            }
            return AbstractC1378t.e(Integer.valueOf(iArr[0]));
        }
        return AbstractC1378t.m();
    }

    public static boolean V(long[] jArr, long j8) {
        AbstractC3255y.i(jArr, "<this>");
        if (o0(jArr, j8) >= 0) {
            return true;
        }
        return false;
    }

    public static List V0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return Y0(objArr);
            }
            return AbstractC1378t.e(objArr[0]);
        }
        return AbstractC1378t.m();
    }

    public static boolean W(Object[] objArr, Object obj) {
        AbstractC3255y.i(objArr, "<this>");
        if (AbstractC1371l.p0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List W0(boolean[] zArr) {
        AbstractC3255y.i(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                return Z0(zArr);
            }
            return AbstractC1378t.e(Boolean.valueOf(zArr[0]));
        }
        return AbstractC1378t.m();
    }

    public static boolean X(short[] sArr, short s8) {
        AbstractC3255y.i(sArr, "<this>");
        if (q0(sArr, s8) >= 0) {
            return true;
        }
        return false;
    }

    public static List X0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static List Y(Object[] objArr, int i8) {
        AbstractC3255y.i(objArr, "<this>");
        if (i8 >= 0) {
            return S0(objArr, g6.m.d(objArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List Y0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        return new ArrayList(AbstractC1380v.h(objArr));
    }

    public static List Z(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        return (List) a0(objArr, new ArrayList());
    }

    public static final List Z0(boolean[] zArr) {
        AbstractC3255y.i(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z8 : zArr) {
            arrayList.add(Boolean.valueOf(z8));
        }
        return arrayList;
    }

    public static final Collection a0(Object[] objArr, Collection destination) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final Set a1(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) T0(objArr, new LinkedHashSet(Q.d(objArr.length)));
            }
            return a0.d(objArr[0]);
        }
        return a0.f();
    }

    public static int b0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Iterable b1(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        return new L(new g(objArr));
    }

    public static Object c0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object d0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static g6.i e0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        return new g6.i(0, AbstractC1371l.g0(iArr));
    }

    public static int f0(float[] fArr) {
        AbstractC3255y.i(fArr, "<this>");
        return fArr.length - 1;
    }

    public static int g0(int[] iArr) {
        AbstractC3255y.i(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int h0(long[] jArr) {
        AbstractC3255y.i(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int i0(Object[] objArr) {
        AbstractC3255y.i(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer j0(int[] iArr, int i8) {
        AbstractC3255y.i(iArr, "<this>");
        if (i8 >= 0 && i8 <= AbstractC1371l.g0(iArr)) {
            return Integer.valueOf(iArr[i8]);
        }
        return null;
    }

    public static Object k0(Object[] objArr, int i8) {
        AbstractC3255y.i(objArr, "<this>");
        if (i8 >= 0 && i8 <= AbstractC1371l.i0(objArr)) {
            return objArr[i8];
        }
        return null;
    }

    public static final int l0(byte[] bArr, byte b8) {
        AbstractC3255y.i(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int m0(char[] cArr, char c8) {
        AbstractC3255y.i(cArr, "<this>");
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (c8 == cArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int n0(int[] iArr, int i8) {
        AbstractC3255y.i(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int o0(long[] jArr, long j8) {
        AbstractC3255y.i(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int p0(Object[] objArr, Object obj) {
        AbstractC3255y.i(objArr, "<this>");
        int i8 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i8 < length) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i8 < length2) {
            if (AbstractC3255y.d(obj, objArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final int q0(short[] sArr, short s8) {
        AbstractC3255y.i(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s8 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final Appendable r0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(bArr, "<this>");
        AbstractC3255y.i(buffer, "buffer");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (byte b8 : bArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b8)));
            } else {
                buffer.append(String.valueOf((int) b8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable s0(char[] cArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(cArr, "<this>");
        AbstractC3255y.i(buffer, "buffer");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (char c8 : cArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Character.valueOf(c8)));
            } else {
                buffer.append(c8);
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable t0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(buffer, "buffer");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : objArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            j6.n.a(buffer, obj, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String u0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(bArr, "<this>");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        String sb = ((StringBuilder) r0(bArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3255y.h(sb, "toString(...)");
        return sb;
    }

    public static final String v0(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(cArr, "<this>");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        String sb = ((StringBuilder) s0(cArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3255y.h(sb, "toString(...)");
        return sb;
    }

    public static final String w0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(objArr, "<this>");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        String sb = ((StringBuilder) t0(objArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3255y.h(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String x0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return u0(bArr, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static /* synthetic */ String y0(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return v0(cArr, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static /* synthetic */ String z0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return w0(objArr, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }
}
