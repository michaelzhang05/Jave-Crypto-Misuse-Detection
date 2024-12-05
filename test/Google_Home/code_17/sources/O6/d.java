package O6;

import S6.C1417e;
import S6.C1420h;
import S6.InterfaceC1419g;
import S6.L;
import S6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f8343a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f8344b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f8345a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1419g f8346b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8347c;

        /* renamed from: d, reason: collision with root package name */
        private int f8348d;

        /* renamed from: e, reason: collision with root package name */
        c[] f8349e;

        /* renamed from: f, reason: collision with root package name */
        int f8350f;

        /* renamed from: g, reason: collision with root package name */
        int f8351g;

        /* renamed from: h, reason: collision with root package name */
        int f8352h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8, Z z8) {
            this(i8, i8, z8);
        }

        private void a() {
            int i8 = this.f8348d;
            int i9 = this.f8352h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f8349e, (Object) null);
            this.f8350f = this.f8349e.length - 1;
            this.f8351g = 0;
            this.f8352h = 0;
        }

        private int c(int i8) {
            return this.f8350f + 1 + i8;
        }

        private int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f8349e.length;
                while (true) {
                    length--;
                    i9 = this.f8350f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f8349e[length].f8342c;
                    i8 -= i11;
                    this.f8352h -= i11;
                    this.f8351g--;
                    i10++;
                }
                c[] cVarArr = this.f8349e;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f8351g);
                this.f8350f += i10;
            }
            return i10;
        }

        private C1420h f(int i8) {
            if (h(i8)) {
                return d.f8343a[i8].f8340a;
            }
            int c8 = c(i8 - d.f8343a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f8349e;
                if (c8 < cVarArr.length) {
                    return cVarArr[c8].f8340a;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void g(int i8, c cVar) {
            this.f8345a.add(cVar);
            int i9 = cVar.f8342c;
            if (i8 != -1) {
                i9 -= this.f8349e[c(i8)].f8342c;
            }
            int i10 = this.f8348d;
            if (i9 > i10) {
                b();
                return;
            }
            int d8 = d((this.f8352h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f8351g + 1;
                c[] cVarArr = this.f8349e;
                if (i11 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f8350f = this.f8349e.length - 1;
                    this.f8349e = cVarArr2;
                }
                int i12 = this.f8350f;
                this.f8350f = i12 - 1;
                this.f8349e[i12] = cVar;
                this.f8351g++;
            } else {
                this.f8349e[i8 + c(i8) + d8] = cVar;
            }
            this.f8352h += i9;
        }

        private boolean h(int i8) {
            if (i8 >= 0 && i8 <= d.f8343a.length - 1) {
                return true;
            }
            return false;
        }

        private int i() {
            return this.f8346b.readByte() & 255;
        }

        private void l(int i8) {
            if (h(i8)) {
                this.f8345a.add(d.f8343a[i8]);
                return;
            }
            int c8 = c(i8 - d.f8343a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f8349e;
                if (c8 < cVarArr.length) {
                    this.f8345a.add(cVarArr[c8]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void n(int i8) {
            g(-1, new c(f(i8), j()));
        }

        private void o() {
            g(-1, new c(d.a(j()), j()));
        }

        private void p(int i8) {
            this.f8345a.add(new c(f(i8), j()));
        }

        private void q() {
            this.f8345a.add(new c(d.a(j()), j()));
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.f8345a);
            this.f8345a.clear();
            return arrayList;
        }

        C1420h j() {
            boolean z8;
            int i8 = i();
            if ((i8 & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            int m8 = m(i8, 127);
            if (z8) {
                return C1420h.C(k.f().c(this.f8346b.readByteArray(m8)));
            }
            return this.f8346b.readByteString(m8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k() {
            while (!this.f8346b.exhausted()) {
                byte readByte = this.f8346b.readByte();
                int i8 = readByte & 255;
                if (i8 != 128) {
                    if ((readByte & 128) == 128) {
                        l(m(i8, 127) - 1);
                    } else if (i8 == 64) {
                        o();
                    } else if ((readByte & 64) == 64) {
                        n(m(i8, 63) - 1);
                    } else if ((readByte & 32) == 32) {
                        int m8 = m(i8, 31);
                        this.f8348d = m8;
                        if (m8 >= 0 && m8 <= this.f8347c) {
                            a();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.f8348d);
                        }
                    } else if (i8 != 16 && i8 != 0) {
                        p(m(i8, 15) - 1);
                    } else {
                        q();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        int m(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) != 0) {
                    i9 += (i12 & 127) << i11;
                    i11 += 7;
                } else {
                    return i9 + (i12 << i11);
                }
            }
        }

        a(int i8, int i9, Z z8) {
            this.f8345a = new ArrayList();
            this.f8349e = new c[8];
            this.f8350f = r0.length - 1;
            this.f8351g = 0;
            this.f8352h = 0;
            this.f8347c = i8;
            this.f8348d = i9;
            this.f8346b = L.d(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C1417e f8353a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8354b;

        /* renamed from: c, reason: collision with root package name */
        private int f8355c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8356d;

        /* renamed from: e, reason: collision with root package name */
        int f8357e;

        /* renamed from: f, reason: collision with root package name */
        int f8358f;

        /* renamed from: g, reason: collision with root package name */
        c[] f8359g;

        /* renamed from: h, reason: collision with root package name */
        int f8360h;

        /* renamed from: i, reason: collision with root package name */
        int f8361i;

        /* renamed from: j, reason: collision with root package name */
        int f8362j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C1417e c1417e) {
            this(4096, true, c1417e);
        }

        private void a() {
            int i8 = this.f8358f;
            int i9 = this.f8362j;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    c(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f8359g, (Object) null);
            this.f8360h = this.f8359g.length - 1;
            this.f8361i = 0;
            this.f8362j = 0;
        }

        private int c(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f8359g.length;
                while (true) {
                    length--;
                    i9 = this.f8360h;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f8359g[length].f8342c;
                    i8 -= i11;
                    this.f8362j -= i11;
                    this.f8361i--;
                    i10++;
                }
                c[] cVarArr = this.f8359g;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f8361i);
                c[] cVarArr2 = this.f8359g;
                int i12 = this.f8360h;
                Arrays.fill(cVarArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.f8360h += i10;
            }
            return i10;
        }

        private void d(c cVar) {
            int i8 = cVar.f8342c;
            int i9 = this.f8358f;
            if (i8 > i9) {
                b();
                return;
            }
            c((this.f8362j + i8) - i9);
            int i10 = this.f8361i + 1;
            c[] cVarArr = this.f8359g;
            if (i10 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f8360h = this.f8359g.length - 1;
                this.f8359g = cVarArr2;
            }
            int i11 = this.f8360h;
            this.f8360h = i11 - 1;
            this.f8359g[i11] = cVar;
            this.f8361i++;
            this.f8362j += i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(int i8) {
            this.f8357e = i8;
            int min = Math.min(i8, 16384);
            int i9 = this.f8358f;
            if (i9 == min) {
                return;
            }
            if (min < i9) {
                this.f8355c = Math.min(this.f8355c, min);
            }
            this.f8356d = true;
            this.f8358f = min;
            a();
        }

        void f(C1420h c1420h) {
            if (this.f8354b && k.f().e(c1420h) < c1420h.K()) {
                C1417e c1417e = new C1417e();
                k.f().d(c1420h, c1417e);
                C1420h A8 = c1417e.A();
                h(A8.K(), 127, 128);
                this.f8353a.I(A8);
                return;
            }
            h(c1420h.K(), 127, 0);
            this.f8353a.I(c1420h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(java.util.List r14) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: O6.d.b.g(java.util.List):void");
        }

        void h(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f8353a.writeByte(i8 | i10);
                return;
            }
            this.f8353a.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f8353a.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.f8353a.writeByte(i11);
        }

        b(int i8, boolean z8, C1417e c1417e) {
            this.f8355c = Integer.MAX_VALUE;
            this.f8359g = new c[8];
            this.f8360h = r0.length - 1;
            this.f8361i = 0;
            this.f8362j = 0;
            this.f8357e = i8;
            this.f8358f = i8;
            this.f8354b = z8;
            this.f8353a = c1417e;
        }
    }

    static {
        c cVar = new c(c.f8339i, "");
        C1420h c1420h = c.f8336f;
        c cVar2 = new c(c1420h, ShareTarget.METHOD_GET);
        c cVar3 = new c(c1420h, ShareTarget.METHOD_POST);
        C1420h c1420h2 = c.f8337g;
        c cVar4 = new c(c1420h2, "/");
        c cVar5 = new c(c1420h2, "/index.html");
        C1420h c1420h3 = c.f8338h;
        c cVar6 = new c(c1420h3, "http");
        c cVar7 = new c(c1420h3, "https");
        C1420h c1420h4 = c.f8335e;
        f8343a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(c1420h4, "200"), new c(c1420h4, "204"), new c(c1420h4, "206"), new c(c1420h4, "304"), new c(c1420h4, "400"), new c(c1420h4, "404"), new c(c1420h4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f8344b = b();
    }

    static C1420h a(C1420h c1420h) {
        int K8 = c1420h.K();
        for (int i8 = 0; i8 < K8; i8++) {
            byte h8 = c1420h.h(i8);
            if (h8 >= 65 && h8 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1420h.Q());
            }
        }
        return c1420h;
    }

    private static Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f8343a.length);
        int i8 = 0;
        while (true) {
            c[] cVarArr = f8343a;
            if (i8 < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i8].f8340a)) {
                    linkedHashMap.put(cVarArr[i8].f8340a, Integer.valueOf(i8));
                }
                i8++;
            } else {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
