package i.a.g;

import i.a.d;
import i.a.g.h;
import i.a.g.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: ServiceInfoImpl.java */
/* loaded from: classes2.dex */
public class q extends i.a.d implements d, i {

    /* renamed from: g, reason: collision with root package name */
    private static k.b.b f18374g = k.b.c.i(q.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private String f18375h;

    /* renamed from: i, reason: collision with root package name */
    private String f18376i;

    /* renamed from: j, reason: collision with root package name */
    private String f18377j;

    /* renamed from: k, reason: collision with root package name */
    private String f18378k;
    private String l;
    private String m;
    private int n;
    private int o;
    private int p;
    private byte[] q;
    private Map<String, byte[]> r;
    private final Set<Inet4Address> s;
    private final Set<Inet6Address> t;
    private transient String u;
    private boolean v;
    private boolean w;
    private final b x;

    /* compiled from: ServiceInfoImpl.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.a.g.s.e.values().length];
            a = iArr;
            try {
                iArr[i.a.g.s.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.a.g.s.e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.a.g.s.e.TYPE_SRV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.a.g.s.e.TYPE_TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.a.g.s.e.TYPE_PTR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ServiceInfoImpl.java */
    /* loaded from: classes2.dex */
    public static final class b extends i.b {
        private final q l;

        public b(q qVar) {
            this.l = qVar;
        }

        @Override // i.a.g.i.b
        public void q(l lVar) {
            super.q(lVar);
        }

        @Override // i.a.g.i.b
        protected void s(i.a.g.t.a aVar) {
            super.s(aVar);
            if (this.f18314h == null && this.l.X()) {
                lock();
                try {
                    if (this.f18314h == null && this.l.X()) {
                        if (this.f18315i.f()) {
                            r(i.a.g.s.g.f18414i);
                            if (d() != null) {
                                d().L();
                            }
                        }
                        this.l.g0(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    public q(String str, String str2, String str3, int i2, int i3, int i4, boolean z, byte[] bArr) {
        this(I(str, str2, str3), i2, i3, i4, z, bArr);
    }

    protected static Map<d.a, String> G(Map<d.a, String> map) {
        HashMap hashMap = new HashMap(5);
        d.a aVar = d.a.Domain;
        String str = "local";
        String str2 = map.containsKey(aVar) ? map.get(aVar) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        hashMap.put(aVar, c0(str));
        d.a aVar2 = d.a.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(aVar2) ? map.get(aVar2) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        hashMap.put(aVar2, c0(str3));
        d.a aVar3 = d.a.Application;
        boolean containsKey = map.containsKey(aVar3);
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str6 = containsKey ? map.get(aVar3) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str6 == null || str6.length() == 0) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        hashMap.put(aVar3, c0(str6));
        d.a aVar4 = d.a.Instance;
        String str7 = map.containsKey(aVar4) ? map.get(aVar4) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str7 == null || str7.length() == 0) {
            str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        hashMap.put(aVar4, c0(str7));
        d.a aVar5 = d.a.Subtype;
        String str8 = map.containsKey(aVar5) ? map.get(aVar5) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        hashMap.put(aVar5, c0(str5));
        return hashMap;
    }

    public static Map<d.a, String> I(String str, String str2, String str3) {
        Map<d.a, String> K = K(str);
        K.put(d.a.Instance, str2);
        K.put(d.a.Subtype, str3);
        return G(K);
    }

    public static Map<d.a, String> K(String str) {
        String c0;
        String substring;
        String str2;
        int indexOf;
        String substring2;
        String str3;
        String str4;
        String lowerCase = str.toLowerCase();
        boolean contains = lowerCase.contains("in-addr.arpa");
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!contains && !lowerCase.contains("ip6.arpa")) {
            if (!lowerCase.contains("_") && lowerCase.contains(".")) {
                int indexOf2 = lowerCase.indexOf(46);
                c0 = c0(str.substring(0, indexOf2));
                substring = c0(str.substring(indexOf2));
            } else {
                if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf("._")) > 0) {
                    substring2 = str.substring(0, indexOf);
                    int i2 = indexOf + 1;
                    if (i2 < lowerCase.length()) {
                        str3 = lowerCase.substring(i2);
                        str = str.substring(i2);
                    } else {
                        str3 = lowerCase;
                    }
                } else {
                    str3 = lowerCase;
                    substring2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int lastIndexOf = str3.lastIndexOf("._");
                if (lastIndexOf > 0) {
                    int i3 = lastIndexOf + 2;
                    str4 = str.substring(i3, str3.indexOf(46, i3));
                } else {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (str4.length() > 0) {
                    int indexOf3 = str3.indexOf("_" + str4.toLowerCase() + ".");
                    int length = str4.length() + indexOf3 + 2;
                    int length2 = str3.length() - (str3.endsWith(".") ? 1 : 0);
                    String substring3 = length2 > length ? str.substring(length, length2) : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (indexOf3 > 0) {
                        lowerCase = str.substring(0, indexOf3 - 1);
                        substring = substring3;
                    } else {
                        substring = substring3;
                        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    substring = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
                if (indexOf4 > 0) {
                    str5 = c0(lowerCase.substring(0, indexOf4));
                    lowerCase = lowerCase.substring(indexOf4 + 5);
                }
                c0 = substring2;
                String str6 = str5;
                str5 = str4;
                str2 = str6;
                HashMap hashMap = new HashMap(5);
                hashMap.put(d.a.Domain, c0(substring));
                hashMap.put(d.a.Protocol, str5);
                hashMap.put(d.a.Application, c0(lowerCase));
                hashMap.put(d.a.Instance, c0);
                hashMap.put(d.a.Subtype, str2);
                return hashMap;
            }
        } else {
            int indexOf5 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            c0 = c0(str.substring(0, indexOf5));
            substring = str.substring(indexOf5);
        }
        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
        str2 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(d.a.Domain, c0(substring));
        hashMap2.put(d.a.Protocol, str5);
        hashMap2.put(d.a.Application, c0(lowerCase));
        hashMap2.put(d.a.Instance, c0);
        hashMap2.put(d.a.Subtype, str2);
        return hashMap2;
    }

    private final boolean S() {
        return this.s.size() > 0 || this.t.size() > 0;
    }

    private static String c0(String str) {
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? trim.substring(0, trim.length() - 1) : trim;
    }

    private static byte[] j0(Map<String, ?> map) {
        byte[] bArr = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m0(byteArrayOutputStream2, str);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m0(byteArrayOutputStream2, (String) obj);
                        } else if (obj instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj;
                            if (bArr2.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                            } else {
                                obj = null;
                            }
                        } else {
                            throw new IllegalArgumentException("invalid property value: " + obj);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArray.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(str);
                        sb.append(obj != null ? HttpUrl.FRAGMENT_ENCODE_SET : "=" + obj);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray.length);
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException("unexpected exception: " + e2);
            }
        }
        return (bArr == null || bArr.length <= 0) ? h.f18307i : bArr;
    }

    static void m0(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= 1 && charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt > 2047) {
                outputStream.write(((charAt >> '\f') & 15) | 224);
                outputStream.write(((charAt >> 6) & 63) | 128);
                outputStream.write(((charAt >> 0) & 63) | 128);
            } else {
                outputStream.write(((charAt >> 6) & 31) | 192);
                outputStream.write(((charAt >> 0) & 63) | 128);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Inet4Address inet4Address) {
        this.s.add(inet4Address);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Inet6Address inet6Address) {
        this.t.add(inet6Address);
    }

    public Collection<h> C(i.a.g.s.d dVar, boolean z, int i2, k kVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar == i.a.g.s.d.CLASS_ANY || dVar == i.a.g.s.d.CLASS_IN) {
            if (q().length() > 0) {
                arrayList.add(new h.e(R(), i.a.g.s.d.CLASS_IN, false, i2, n()));
            }
            String s = s();
            i.a.g.s.d dVar2 = i.a.g.s.d.CLASS_IN;
            arrayList.add(new h.e(s, dVar2, false, i2, n()));
            arrayList.add(new h.f(n(), dVar2, z, i2, this.p, this.o, this.n, kVar.q()));
            arrayList.add(new h.g(n(), dVar2, z, i2, r()));
        }
        return arrayList;
    }

    public void E(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        this.x.a(aVar, gVar);
    }

    public boolean F() {
        return this.x.b();
    }

    @Override // i.a.d
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public q clone() {
        q qVar = new q(Q(), this.n, this.o, this.p, this.v, this.q);
        for (Inet6Address inet6Address : h()) {
            qVar.t.add(inet6Address);
        }
        for (Inet4Address inet4Address : g()) {
            qVar.s.add(inet4Address);
        }
        return qVar;
    }

    public l M() {
        return this.x.d();
    }

    public String N() {
        if (this.u == null) {
            this.u = n().toLowerCase();
        }
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r0.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized java.util.Map<java.lang.String, byte[]> O() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.r     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L77
            byte[] r0 = r9.r()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L77
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            r1 = 0
            r2 = 0
        L12:
            byte[] r3 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r3 = r3.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r2 >= r3) goto L75
            byte[] r3 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r2 + 1
            r2 = r3[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L69
            int r3 = r4 + r2
            byte[] r5 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r5 = r5.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r3 <= r5) goto L2f
            goto L69
        L2f:
            r5 = 0
        L30:
            if (r5 >= r2) goto L41
            byte[] r6 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r7 = r4 + r5
            r6 = r6[r7]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r7 = 61
            if (r6 == r7) goto L41
            int r5 = r5 + 1
            goto L30
        L41:
            byte[] r6 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            java.lang.String r6 = r9.Z(r6, r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r6 != 0) goto L4f
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L4f:
            if (r5 != r2) goto L57
            byte[] r2 = i.a.d.f18272f     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L67
        L57:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            byte[] r8 = r9.r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r7)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
        L67:
            r2 = r3
            goto L12
        L69:
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L6d:
            r1 = move-exception
            k.b.b r2 = i.a.g.q.f18374g     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Malformed TXT Field "
            r2.f(r3, r1)     // Catch: java.lang.Throwable -> L82
        L75:
            r9.r = r0     // Catch: java.lang.Throwable -> L82
        L77:
            java.util.Map<java.lang.String, byte[]> r0 = r9.r     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            goto L80
        L7c:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r9)
            return r0
        L82:
            r0 = move-exception
            monitor-exit(r9)
            goto L86
        L85:
            throw r0
        L86:
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.g.q.O():java.util.Map");
    }

    public Map<d.a, String> Q() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(d.a.Domain, e());
        hashMap.put(d.a.Protocol, m());
        hashMap.put(d.a.Application, d());
        hashMap.put(d.a.Instance, j());
        hashMap.put(d.a.Subtype, q());
        return hashMap;
    }

    public String R() {
        String str;
        String q = q();
        StringBuilder sb = new StringBuilder();
        if (q.length() > 0) {
            str = "_" + q.toLowerCase() + "._sub.";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append(s());
        return sb.toString();
    }

    public boolean T() {
        return this.x.e();
    }

    public boolean U() {
        return this.x.f();
    }

    public boolean V(i.a.g.t.a aVar, i.a.g.s.g gVar) {
        return this.x.g(aVar, gVar);
    }

    public boolean W() {
        return this.x.l();
    }

    public boolean X() {
        return this.w;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    String Z(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = i2 + i3;
        while (i2 < i7) {
            int i8 = i2 + 1;
            int i9 = bArr[i2] & 255;
            switch (i9 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    stringBuffer.append((char) i9);
                    i2 = i8;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i5 = i8 + 1;
                    if (i5 >= i3) {
                        return null;
                    }
                    i4 = (i9 & 63) << 4;
                    i6 = bArr[i8] & 15;
                    i9 = i4 | i6;
                    i8 = i5;
                    stringBuffer.append((char) i9);
                    i2 = i8;
                case 12:
                case 13:
                    if (i8 >= i3) {
                        return null;
                    }
                    i4 = (i9 & 31) << 6;
                    i5 = i8 + 1;
                    i6 = bArr[i8] & 63;
                    i9 = i4 | i6;
                    i8 = i5;
                    stringBuffer.append((char) i9);
                    i2 = i8;
                case 14:
                    if (i8 + 2 >= i3) {
                        return null;
                    }
                    int i10 = i8 + 1;
                    int i11 = ((i9 & 15) << 12) | ((bArr[i8] & 63) << 6);
                    i8 = i10 + 1;
                    i9 = i11 | (bArr[i10] & 63);
                    stringBuffer.append((char) i9);
                    i2 = i8;
            }
        }
        return stringBuffer.toString();
    }

    public boolean a0() {
        return this.x.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // i.a.g.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(i.a.g.a r5, long r6, i.a.g.b r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.g.q.b(i.a.g.a, long, i.a.g.b):void");
    }

    public void b0(i.a.g.t.a aVar) {
        this.x.n(aVar);
    }

    @Override // i.a.d
    public String d() {
        String str = this.f18377j;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public boolean d0() {
        return this.x.p();
    }

    @Override // i.a.d
    public String e() {
        String str = this.f18375h;
        return str != null ? str : "local";
    }

    public void e0(l lVar) {
        this.x.q(lVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && n().equals(((q) obj).n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(String str) {
        this.f18378k = str;
        this.u = null;
    }

    @Override // i.a.d
    public Inet4Address[] g() {
        Set<Inet4Address> set = this.s;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    public void g0(boolean z) {
        this.w = z;
        if (z) {
            this.x.s(null);
        }
    }

    @Override // i.a.d
    public Inet6Address[] h() {
        Set<Inet6Address> set = this.t;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(String str) {
        this.m = str;
    }

    public int hashCode() {
        return n().hashCode();
    }

    @Override // i.a.d
    public InetAddress[] i() {
        ArrayList arrayList = new ArrayList(this.s.size() + this.t.size());
        arrayList.addAll(this.s);
        arrayList.addAll(this.t);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // i.a.d
    public String j() {
        String str = this.f18378k;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // i.a.d
    public int k() {
        return this.n;
    }

    public boolean k0(long j2) {
        return this.x.t(j2);
    }

    @Override // i.a.d
    public int l() {
        return this.p;
    }

    public boolean l0(long j2) {
        return this.x.u(j2);
    }

    @Override // i.a.d
    public String m() {
        String str = this.f18376i;
        return str != null ? str : "tcp";
    }

    @Override // i.a.d
    public String n() {
        String str;
        String str2;
        String e2 = e();
        String m = m();
        String d2 = d();
        String j2 = j();
        StringBuilder sb = new StringBuilder();
        int length = j2.length();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = j2 + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (d2.length() > 0) {
            str2 = "_" + d2 + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (m.length() > 0) {
            str3 = "_" + m + ".";
        }
        sb.append(str3);
        sb.append(e2);
        sb.append(".");
        return sb.toString();
    }

    @Override // i.a.g.i
    public boolean o(i.a.g.t.a aVar) {
        return this.x.o(aVar);
    }

    @Override // i.a.d
    public String p() {
        String str = this.m;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // i.a.d
    public String q() {
        String str = this.l;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // i.a.d
    public byte[] r() {
        byte[] bArr = this.q;
        return (bArr == null || bArr.length <= 0) ? h.f18307i : bArr;
    }

    @Override // i.a.d
    public String s() {
        String str;
        String e2 = e();
        String m = m();
        String d2 = d();
        StringBuilder sb = new StringBuilder();
        int length = d2.length();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = "_" + d2 + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (m.length() > 0) {
            str2 = "_" + m + ".";
        }
        sb.append(str2);
        sb.append(e2);
        sb.append(".");
        return sb.toString();
    }

    @Override // i.a.d
    public int t() {
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + q.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        int length = j().length();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb2.append(length > 0 ? j() + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(R());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] i2 = i();
        if (i2.length > 0) {
            for (InetAddress inetAddress : i2) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(k());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(k());
        }
        sb.append("' status: '");
        sb.append(this.x.toString());
        sb.append(x() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!u()) {
            str = "NO ";
        }
        sb.append(str);
        sb.append("data");
        if (r().length > 0) {
            Map<String, byte[]> O = O();
            if (!O.isEmpty()) {
                sb.append("\n");
                for (String str2 : O.keySet()) {
                    sb.append("\t" + str2 + ": " + new String(O.get(str2)) + "\n");
                }
            } else {
                sb.append(" empty");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // i.a.d
    public synchronized boolean u() {
        boolean z;
        if (p() != null && S() && r() != null) {
            z = r().length > 0;
        }
        return z;
    }

    @Override // i.a.d
    public boolean v(i.a.d dVar) {
        if (dVar == null) {
            return false;
        }
        if (dVar instanceof q) {
            q qVar = (q) dVar;
            return this.s.size() == qVar.s.size() && this.t.size() == qVar.t.size() && this.s.equals(qVar.s) && this.t.equals(qVar.t);
        }
        InetAddress[] i2 = i();
        InetAddress[] i3 = dVar.i();
        return i2.length == i3.length && new HashSet(Arrays.asList(i2)).equals(new HashSet(Arrays.asList(i3)));
    }

    @Override // i.a.d
    public boolean x() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(byte[] bArr) {
        this.q = bArr;
        this.r = null;
    }

    public q(Map<d.a, String> map, int i2, int i3, int i4, boolean z, Map<String, ?> map2) {
        this(map, i2, i3, i4, z, j0(map2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Map<d.a, String> map, int i2, int i3, int i4, boolean z, String str) {
        this(map, i2, i3, i4, z, (byte[]) null);
        this.m = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m0(byteArrayOutputStream, str);
            this.q = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("unexpected exception: " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Map<d.a, String> map, int i2, int i3, int i4, boolean z, byte[] bArr) {
        Map<d.a, String> G = G(map);
        this.f18375h = G.get(d.a.Domain);
        this.f18376i = G.get(d.a.Protocol);
        this.f18377j = G.get(d.a.Application);
        this.f18378k = G.get(d.a.Instance);
        this.l = G.get(d.a.Subtype);
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = bArr;
        g0(false);
        this.x = new b(this);
        this.v = z;
        this.s = Collections.synchronizedSet(new LinkedHashSet());
        this.t = Collections.synchronizedSet(new LinkedHashSet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(i.a.d dVar) {
        this.s = Collections.synchronizedSet(new LinkedHashSet());
        this.t = Collections.synchronizedSet(new LinkedHashSet());
        if (dVar != null) {
            this.f18375h = dVar.e();
            this.f18376i = dVar.m();
            this.f18377j = dVar.d();
            this.f18378k = dVar.j();
            this.l = dVar.q();
            this.n = dVar.k();
            this.o = dVar.t();
            this.p = dVar.l();
            this.q = dVar.r();
            this.v = dVar.x();
            for (Inet6Address inet6Address : dVar.h()) {
                this.t.add(inet6Address);
            }
            for (Inet4Address inet4Address : dVar.g()) {
                this.s.add(inet4Address);
            }
        }
        this.x = new b(this);
    }
}
