package i.a.g;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DNSMessage.java */
/* loaded from: classes2.dex */
public abstract class e {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    boolean f18293b;

    /* renamed from: c, reason: collision with root package name */
    private int f18294c;

    /* renamed from: d, reason: collision with root package name */
    protected final List<g> f18295d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    protected final List<h> f18296e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f, reason: collision with root package name */
    protected final List<h> f18297f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g, reason: collision with root package name */
    protected final List<h> f18298g = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: Access modifiers changed from: protected */
    public e(int i2, int i3, boolean z) {
        this.f18294c = i2;
        this.a = i3;
        this.f18293b = z;
    }

    public Collection<? extends h> a() {
        return this.f18298g;
    }

    public List<h> b() {
        ArrayList arrayList = new ArrayList(this.f18296e.size() + this.f18297f.size() + this.f18298g.size());
        arrayList.addAll(this.f18296e);
        arrayList.addAll(this.f18297f);
        arrayList.addAll(this.f18298g);
        return arrayList;
    }

    public Collection<? extends h> c() {
        return this.f18296e;
    }

    public Collection<? extends h> d() {
        return this.f18297f;
    }

    public int e() {
        return this.f18294c;
    }

    public int f() {
        if (this.f18293b) {
            return 0;
        }
        return this.a;
    }

    public int g() {
        return a().size();
    }

    public int h() {
        return c().size();
    }

    public int i() {
        return d().size();
    }

    public int j() {
        return l().size();
    }

    public int k() {
        return (this.f18294c & 30720) >> 11;
    }

    public Collection<? extends g> l() {
        return this.f18295d;
    }

    public boolean m() {
        return (this.f18294c & 1024) != 0;
    }

    public boolean n() {
        return ((j() + h()) + i()) + g() == 0;
    }

    public boolean o() {
        return this.f18293b;
    }

    public boolean p() {
        return (this.f18294c & 32768) == 0;
    }

    public boolean q() {
        return (this.f18294c & 32768) == 32768;
    }

    public boolean r() {
        return (this.f18294c & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    public boolean s() {
        return (this.f18294c & 15) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append("\n");
        for (g gVar : this.f18295d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(gVar);
            stringBuffer.append("\n");
        }
        for (h hVar : this.f18296e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(hVar);
            stringBuffer.append("\n");
        }
        for (h hVar2 : this.f18297f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(hVar2);
            stringBuffer.append("\n");
        }
        for (h hVar3 : this.f18298g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(hVar3);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String u(byte[] bArr) {
        StringBuilder sb = new StringBuilder(4000);
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int min = Math.min(32, length - i2);
            if (i2 < 16) {
                sb.append(' ');
            }
            if (i2 < 256) {
                sb.append(' ');
            }
            if (i2 < 4096) {
                sb.append(' ');
            }
            sb.append(Integer.toHexString(i2));
            sb.append(':');
            int i3 = 0;
            while (i3 < min) {
                if (i3 % 8 == 0) {
                    sb.append(' ');
                }
                int i4 = i2 + i3;
                sb.append(Integer.toHexString((bArr[i4] & 240) >> 4));
                sb.append(Integer.toHexString((bArr[i4] & 15) >> 0));
                i3++;
            }
            if (i3 < 32) {
                while (i3 < 32) {
                    if (i3 % 8 == 0) {
                        sb.append(' ');
                    }
                    sb.append("  ");
                    i3++;
                }
            }
            sb.append("    ");
            for (int i5 = 0; i5 < min; i5++) {
                if (i5 % 8 == 0) {
                    sb.append(' ');
                }
                int i6 = bArr[i2 + i5] & 255;
                sb.append((i6 <= 32 || i6 >= 127) ? '.' : (char) i6);
            }
            sb.append("\n");
            i2 += 32;
            if (i2 >= 2048) {
                sb.append("....\n");
                break;
            }
        }
        return sb.toString();
    }

    public void v(int i2) {
        this.f18294c = i2;
    }

    public void w(int i2) {
        this.a = i2;
    }
}
