package i.a.g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: DNSIncoming.java */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    private static k.b.b f18285h = k.b.c.i(c.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static boolean f18286i = true;

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f18287j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: k, reason: collision with root package name */
    private final DatagramPacket f18288k;
    private final long l;
    private final b m;
    private int n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DNSIncoming.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18289b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f18290c;

        static {
            int[] iArr = new int[i.a.g.s.e.values().length];
            f18290c = iArr;
            try {
                iArr[i.a.g.s.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_CNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_PTR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_TXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_SRV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_HINFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18290c[i.a.g.s.e.TYPE_OPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[i.a.g.s.c.values().length];
            f18289b = iArr2;
            try {
                iArr2[i.a.g.s.c.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18289b[i.a.g.s.c.LLQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18289b[i.a.g.s.c.NSID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18289b[i.a.g.s.c.UL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18289b[i.a.g.s.c.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[i.a.g.s.b.values().length];
            a = iArr3;
            try {
                iArr3[i.a.g.s.b.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[i.a.g.s.b.Compressed.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[i.a.g.s.b.Extended.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[i.a.g.s.b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: DNSIncoming.java */
    /* loaded from: classes2.dex */
    public static class b extends ByteArrayInputStream {

        /* renamed from: f, reason: collision with root package name */
        private static k.b.b f18291f = k.b.c.i(b.class.getName());

        /* renamed from: g, reason: collision with root package name */
        final Map<Integer, String> f18292g;

        public b(byte[] bArr, int i2) {
            this(bArr, 0, i2);
        }

        public byte[] a(int i2) {
            byte[] bArr = new byte[i2];
            read(bArr, 0, i2);
            return bArr;
        }

        public String b() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int w = w();
                if (w == 0) {
                    break;
                }
                int i2 = a.a[i.a.g.s.b.f(w).ordinal()];
                if (i2 == 1) {
                    int i3 = ((ByteArrayInputStream) this).pos - 1;
                    String str = o(w) + ".";
                    sb.append(str);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    hashMap.put(Integer.valueOf(i3), new StringBuilder(str));
                } else if (i2 == 2) {
                    int i4 = (i.a.g.s.b.i(w) << 8) | w();
                    String str2 = this.f18292g.get(Integer.valueOf(i4));
                    if (str2 == null) {
                        f18291f.h("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(i4) + " at 0x" + Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    sb.append(str2);
                    Iterator it2 = hashMap.values().iterator();
                    while (it2.hasNext()) {
                        ((StringBuilder) it2.next()).append(str2);
                    }
                    z = true;
                } else if (i2 != 3) {
                    f18291f.h("unsupported dns label type: '" + Integer.toHexString(w & 192) + "'");
                } else {
                    f18291f.c("Extended label are not currently supported.");
                }
            }
            for (Integer num : hashMap.keySet()) {
                this.f18292g.put(num, ((StringBuilder) hashMap.get(num)).toString());
            }
            return sb.toString();
        }

        public String f() {
            return o(w());
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
        public String o(int i2) {
            int i3;
            int w;
            StringBuilder sb = new StringBuilder(i2);
            int i4 = 0;
            while (i4 < i2) {
                int w2 = w();
                switch (w2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i3 = (w2 & 63) << 4;
                        w = w() & 15;
                        w2 = i3 | w;
                        i4++;
                        break;
                    case 12:
                    case 13:
                        i3 = (w2 & 31) << 6;
                        w = w() & 63;
                        w2 = i3 | w;
                        i4++;
                        break;
                    case 14:
                        w2 = ((w2 & 15) << 12) | ((w() & 63) << 6) | (w() & 63);
                        i4++;
                        i4++;
                        break;
                }
                sb.append((char) w2);
                i4++;
            }
            return sb.toString();
        }

        public int readInt() {
            return (z() << 16) | z();
        }

        public int w() {
            return read() & 255;
        }

        public int z() {
            return (w() << 8) | w();
        }

        public b(byte[] bArr, int i2, int i3) {
            super(bArr, i2, i3);
            this.f18292g = new HashMap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DatagramPacket datagramPacket) throws IOException {
        super(0, 0, datagramPacket.getPort() == i.a.g.s.a.a);
        this.f18288k = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        b bVar = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.m = bVar;
        this.l = System.currentTimeMillis();
        this.n = 1460;
        try {
            w(bVar.z());
            v(bVar.z());
            if (k() <= 0) {
                int z = bVar.z();
                int z2 = bVar.z();
                int z3 = bVar.z();
                int z4 = bVar.z();
                if (f18285h.b()) {
                    f18285h.c("DNSIncoming() questions:" + z + " answers:" + z2 + " authorities:" + z3 + " additionals:" + z4);
                }
                if ((z * 5) + ((z2 + z3 + z4) * 11) <= datagramPacket.getLength()) {
                    if (z > 0) {
                        for (int i2 = 0; i2 < z; i2++) {
                            this.f18295d.add(E());
                        }
                    }
                    if (z2 > 0) {
                        for (int i3 = 0; i3 < z2; i3++) {
                            h D = D(address);
                            if (D != null) {
                                this.f18296e.add(D);
                            }
                        }
                    }
                    if (z3 > 0) {
                        for (int i4 = 0; i4 < z3; i4++) {
                            h D2 = D(address);
                            if (D2 != null) {
                                this.f18297f.add(D2);
                            }
                        }
                    }
                    if (z4 > 0) {
                        for (int i5 = 0; i5 < z4; i5++) {
                            h D3 = D(address);
                            if (D3 != null) {
                                this.f18298g.add(D3);
                            }
                        }
                    }
                    if (this.m.available() > 0) {
                        throw new IOException("Received a message with the wrong length.");
                    }
                    return;
                }
                throw new IOException("questions:" + z + " answers:" + z2 + " authorities:" + z3 + " additionals:" + z4);
            }
            throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
        } catch (Exception e2) {
            f18285h.f("DNSIncoming() dump " + C(true) + "\n exception ", e2);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private i.a.g.h D(java.net.InetAddress r23) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.g.c.D(java.net.InetAddress):i.a.g.h");
    }

    private g E() {
        String b2 = this.m.b();
        i.a.g.s.e f2 = i.a.g.s.e.f(this.m.z());
        if (f2 == i.a.g.s.e.TYPE_IGNORE) {
            f18285h.h("Could not find record type: " + C(true));
        }
        int z = this.m.z();
        i.a.g.s.d d2 = i.a.g.s.d.d(z);
        return g.C(b2, f2, d2, d2.i(z));
    }

    private String x(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            char[] cArr = f18287j;
            sb.append(cArr[i2 / 16]);
            sb.append(cArr[i2 % 16]);
        }
        return sb.toString();
    }

    public int A() {
        return (int) (System.currentTimeMillis() - this.l);
    }

    public int B() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String C(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        if (z) {
            int length = this.f18288k.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f18288k.getData(), 0, bArr, 0, length);
            sb.append(u(bArr));
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p() ? "dns[query," : "dns[response,");
        if (this.f18288k.getAddress() != null) {
            sb.append(this.f18288k.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this.f18288k.getPort());
        sb.append(", length=");
        sb.append(this.f18288k.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(f()));
        if (e() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(e()));
            if ((e() & 32768) != 0) {
                sb.append(":r");
            }
            if ((e() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((e() & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                sb.append(":tc");
            }
        }
        if (j() > 0) {
            sb.append(", questions=");
            sb.append(j());
        }
        if (h() > 0) {
            sb.append(", answers=");
            sb.append(h());
        }
        if (i() > 0) {
            sb.append(", authorities=");
            sb.append(i());
        }
        if (g() > 0) {
            sb.append(", additionals=");
            sb.append(g());
        }
        if (j() > 0) {
            sb.append("\nquestions:");
            for (g gVar : this.f18295d) {
                sb.append("\n\t");
                sb.append(gVar);
            }
        }
        if (h() > 0) {
            sb.append("\nanswers:");
            for (h hVar : this.f18296e) {
                sb.append("\n\t");
                sb.append(hVar);
            }
        }
        if (i() > 0) {
            sb.append("\nauthorities:");
            for (h hVar2 : this.f18297f) {
                sb.append("\n\t");
                sb.append(hVar2);
            }
        }
        if (g() > 0) {
            sb.append("\nadditionals:");
            for (h hVar3 : this.f18298g) {
                sb.append("\n\t");
                sb.append(hVar3);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(c cVar) {
        if (p() && r() && cVar.p()) {
            this.f18295d.addAll(cVar.l());
            this.f18296e.addAll(cVar.c());
            this.f18297f.addAll(cVar.d());
            this.f18298g.addAll(cVar.a());
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(e(), f(), o(), this.f18288k, this.l);
        cVar.n = this.n;
        cVar.f18295d.addAll(this.f18295d);
        cVar.f18296e.addAll(this.f18296e);
        cVar.f18297f.addAll(this.f18297f);
        cVar.f18298g.addAll(this.f18298g);
        return cVar;
    }

    private c(int i2, int i3, boolean z, DatagramPacket datagramPacket, long j2) {
        super(i2, i3, z);
        this.f18288k = datagramPacket;
        this.m = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.l = j2;
    }
}
