package i.a.g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DNSOutgoing.java */
/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f18299h = true;

    /* renamed from: i, reason: collision with root package name */
    Map<String, Integer> f18300i;

    /* renamed from: j, reason: collision with root package name */
    private int f18301j;

    /* renamed from: k, reason: collision with root package name */
    private final a f18302k;
    private final a l;
    private final a m;
    private final a n;
    private InetSocketAddress o;

    /* compiled from: DNSOutgoing.java */
    /* loaded from: classes2.dex */
    public static class a extends ByteArrayOutputStream {

        /* renamed from: f, reason: collision with root package name */
        private final f f18303f;

        /* renamed from: g, reason: collision with root package name */
        private final int f18304g;

        a(int i2, f fVar) {
            this(i2, fVar, 0);
        }

        void D(h hVar, long j2) {
            o(hVar.c());
            J(hVar.f().d());
            J(hVar.e().f() | ((hVar.p() && this.f18303f.o()) ? 32768 : 0));
            f(j2 == 0 ? hVar.E() : hVar.A(j2));
            a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this.f18303f, this.f18304g + size() + 2);
            hVar.S(aVar);
            byte[] byteArray = aVar.toByteArray();
            J(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void J(int i2) {
            a(i2 >> 8);
            a(i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void L(String str, int i2, int i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                char charAt = str.charAt(i2 + i5);
                i4 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            }
            a(i4);
            for (int i6 = 0; i6 < i3; i6++) {
                char charAt2 = str.charAt(i2 + i6);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    a(charAt2);
                } else if (charAt2 > 2047) {
                    a(((charAt2 >> '\f') & 15) | 224);
                    a(((charAt2 >> 6) & 63) | 128);
                    a(((charAt2 >> 0) & 63) | 128);
                } else {
                    a(((charAt2 >> 6) & 31) | 192);
                    a(((charAt2 >> 0) & 63) | 128);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i2) {
            write(i2 & 255);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                a(bArr[i2 + i4]);
            }
        }

        void f(int i2) {
            J(i2 >> 16);
            J(i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(String str) {
            w(str, true);
        }

        void w(String str, boolean z) {
            while (true) {
                int indexOf = str.indexOf(46);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                if (indexOf <= 0) {
                    a(0);
                    return;
                }
                String substring = str.substring(0, indexOf);
                if (z && f.f18299h) {
                    Integer num = this.f18303f.f18300i.get(str);
                    if (num != null) {
                        int intValue = num.intValue();
                        a((intValue >> 8) | 192);
                        a(intValue & 255);
                        return;
                    }
                    this.f18303f.f18300i.put(str, Integer.valueOf(size() + this.f18304g));
                    L(substring, 0, substring.length());
                } else {
                    L(substring, 0, substring.length());
                }
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        void z(g gVar) {
            o(gVar.c());
            J(gVar.f().d());
            J(gVar.e().f());
        }

        a(int i2, f fVar, int i3) {
            super(i2);
            this.f18303f = fVar;
            this.f18304g = i3;
        }
    }

    public f(int i2) {
        this(i2, true, 1460);
    }

    public void A(g gVar) throws IOException {
        a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.z(gVar);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length < B()) {
            this.f18295d.add(gVar);
            this.f18302k.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    public int B() {
        return ((((this.f18301j - 12) - this.f18302k.size()) - this.l.size()) - this.m.size()) - this.n.size();
    }

    public byte[] C() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f18300i.clear();
        a aVar = new a(this.f18301j, this);
        aVar.J(this.f18293b ? 0 : f());
        aVar.J(e());
        aVar.J(j());
        aVar.J(h());
        aVar.J(i());
        aVar.J(g());
        Iterator<g> it = this.f18295d.iterator();
        while (it.hasNext()) {
            aVar.z(it.next());
        }
        Iterator<h> it2 = this.f18296e.iterator();
        while (it2.hasNext()) {
            aVar.D(it2.next(), currentTimeMillis);
        }
        Iterator<h> it3 = this.f18297f.iterator();
        while (it3.hasNext()) {
            aVar.D(it3.next(), currentTimeMillis);
        }
        Iterator<h> it4 = this.f18298g.iterator();
        while (it4.hasNext()) {
            aVar.D(it4.next(), currentTimeMillis);
        }
        byte[] byteArray = aVar.toByteArray();
        try {
            aVar.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public InetSocketAddress D() {
        return this.o;
    }

    public int E() {
        return this.f18301j;
    }

    public void F(InetSocketAddress inetSocketAddress) {
        this.o = inetSocketAddress;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(p() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(f()));
        if (e() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(e()));
            if (q()) {
                stringBuffer.append(":r");
            }
            if (m()) {
                stringBuffer.append(":aa");
            }
            if (r()) {
                stringBuffer.append(":tc");
            }
        }
        if (j() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(j());
        }
        if (h() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(h());
        }
        if (i() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(i());
        }
        if (g() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(g());
        }
        if (j() > 0) {
            stringBuffer.append("\nquestions:");
            for (g gVar : this.f18295d) {
                stringBuffer.append("\n\t");
                stringBuffer.append(gVar);
            }
        }
        if (h() > 0) {
            stringBuffer.append("\nanswers:");
            for (h hVar : this.f18296e) {
                stringBuffer.append("\n\t");
                stringBuffer.append(hVar);
            }
        }
        if (i() > 0) {
            stringBuffer.append("\nauthorities:");
            for (h hVar2 : this.f18297f) {
                stringBuffer.append("\n\t");
                stringBuffer.append(hVar2);
            }
        }
        if (g() > 0) {
            stringBuffer.append("\nadditionals:");
            for (h hVar3 : this.f18298g) {
                stringBuffer.append("\n\t");
                stringBuffer.append(hVar3);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.f18300i);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void x(c cVar, h hVar) throws IOException {
        if (cVar == null || !hVar.Q(cVar)) {
            y(hVar, 0L);
        }
    }

    public void y(h hVar, long j2) throws IOException {
        if (hVar != null) {
            if (j2 == 0 || !hVar.j(j2)) {
                a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
                aVar.D(hVar, j2);
                byte[] byteArray = aVar.toByteArray();
                aVar.close();
                if (byteArray.length < B()) {
                    this.f18296e.add(hVar);
                    this.l.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }

    public void z(h hVar) throws IOException {
        a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.D(hVar, 0L);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length < B()) {
            this.f18297f.add(hVar);
            this.m.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    public f(int i2, boolean z, int i3) {
        super(i2, 0, z);
        this.f18300i = new HashMap();
        this.f18301j = i3 > 0 ? i3 : 1460;
        this.f18302k = new a(i3, this);
        this.l = new a(i3, this);
        this.m = new a(i3, this);
        this.n = new a(i3, this);
    }
}
