package I6;

import I6.q;
import I6.x;
import I6.z;
import K6.d;
import S6.AbstractC1424l;
import S6.AbstractC1425m;
import S6.C1417e;
import S6.C1420h;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import S6.L;
import S6.X;
import S6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1265c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    final K6.f f4249a;

    /* renamed from: b, reason: collision with root package name */
    final K6.d f4250b;

    /* renamed from: c, reason: collision with root package name */
    int f4251c;

    /* renamed from: d, reason: collision with root package name */
    int f4252d;

    /* renamed from: e, reason: collision with root package name */
    private int f4253e;

    /* renamed from: f, reason: collision with root package name */
    private int f4254f;

    /* renamed from: g, reason: collision with root package name */
    private int f4255g;

    /* renamed from: I6.c$a */
    /* loaded from: classes5.dex */
    class a implements K6.f {
        a() {
        }

        @Override // K6.f
        public void a(K6.c cVar) {
            C1265c.this.o(cVar);
        }

        @Override // K6.f
        public z b(x xVar) {
            return C1265c.this.b(xVar);
        }

        @Override // K6.f
        public void c(z zVar, z zVar2) {
            C1265c.this.s(zVar, zVar2);
        }

        @Override // K6.f
        public K6.b d(z zVar) {
            return C1265c.this.g(zVar);
        }

        @Override // K6.f
        public void e(x xVar) {
            C1265c.this.m(xVar);
        }

        @Override // K6.f
        public void trackConditionalCacheHit() {
            C1265c.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I6.c$b */
    /* loaded from: classes5.dex */
    public final class b implements K6.b {

        /* renamed from: a, reason: collision with root package name */
        private final d.c f4257a;

        /* renamed from: b, reason: collision with root package name */
        private X f4258b;

        /* renamed from: c, reason: collision with root package name */
        private X f4259c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4260d;

        /* renamed from: I6.c$b$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1424l {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1265c f4262b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.c f4263c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X x8, C1265c c1265c, d.c cVar) {
                super(x8);
                this.f4262b = c1265c;
                this.f4263c = cVar;
            }

            @Override // S6.AbstractC1424l, S6.X, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C1265c.this) {
                    try {
                        b bVar = b.this;
                        if (bVar.f4260d) {
                            return;
                        }
                        bVar.f4260d = true;
                        C1265c.this.f4251c++;
                        super.close();
                        this.f4263c.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        b(d.c cVar) {
            this.f4257a = cVar;
            X d8 = cVar.d(1);
            this.f4258b = d8;
            this.f4259c = new a(d8, C1265c.this, cVar);
        }

        @Override // K6.b
        public void abort() {
            synchronized (C1265c.this) {
                try {
                    if (this.f4260d) {
                        return;
                    }
                    this.f4260d = true;
                    C1265c.this.f4252d++;
                    J6.c.d(this.f4258b);
                    try {
                        this.f4257a.a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // K6.b
        public X body() {
            return this.f4259c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0068c extends A {

        /* renamed from: a, reason: collision with root package name */
        final d.e f4265a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1419g f4266b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4267c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4268d;

        /* renamed from: I6.c$c$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1425m {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.e f4269b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z8, d.e eVar) {
                super(z8);
                this.f4269b = eVar;
            }

            @Override // S6.AbstractC1425m, S6.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f4269b.close();
                super.close();
            }
        }

        C0068c(d.e eVar, String str, String str2) {
            this.f4265a = eVar;
            this.f4267c = str;
            this.f4268d = str2;
            this.f4266b = L.d(new a(eVar.b(1), eVar));
        }

        @Override // I6.A
        public long a() {
            try {
                String str = this.f4268d;
                if (str == null) {
                    return -1L;
                }
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // I6.A
        public InterfaceC1419g g() {
            return this.f4266b;
        }
    }

    public C1265c(File file, long j8) {
        this(file, j8, P6.a.f8897a);
    }

    private void a(d.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public static String f(r rVar) {
        return C1420h.f(rVar.toString()).B().n();
    }

    static int l(InterfaceC1419g interfaceC1419g) {
        try {
            long readDecimalLong = interfaceC1419g.readDecimalLong();
            String readUtf8LineStrict = interfaceC1419g.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + "\"");
        } catch (NumberFormatException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    z b(x xVar) {
        try {
            d.e n8 = this.f4250b.n(f(xVar.i()));
            if (n8 == null) {
                return null;
            }
            try {
                d dVar = new d(n8.b(0));
                z d8 = dVar.d(n8);
                if (!dVar.b(xVar, d8)) {
                    J6.c.d(d8.a());
                    return null;
                }
                return d8;
            } catch (IOException unused) {
                J6.c.d(n8);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4250b.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f4250b.flush();
    }

    K6.b g(z zVar) {
        d.c cVar;
        String g8 = zVar.E().g();
        if (M6.f.a(zVar.E().g())) {
            try {
                m(zVar.E());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!g8.equals(ShareTarget.METHOD_GET) || M6.e.e(zVar)) {
            return null;
        }
        d dVar = new d(zVar);
        try {
            cVar = this.f4250b.l(f(zVar.E().i()));
            if (cVar == null) {
                return null;
            }
            try {
                dVar.f(cVar);
                return new b(cVar);
            } catch (IOException unused2) {
                a(cVar);
                return null;
            }
        } catch (IOException unused3) {
            cVar = null;
        }
    }

    void m(x xVar) {
        this.f4250b.D(f(xVar.i()));
    }

    synchronized void n() {
        this.f4254f++;
    }

    synchronized void o(K6.c cVar) {
        try {
            this.f4255g++;
            if (cVar.f5137a != null) {
                this.f4253e++;
            } else if (cVar.f5138b != null) {
                this.f4254f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void s(z zVar, z zVar2) {
        d.c cVar;
        d dVar = new d(zVar2);
        try {
            cVar = ((C0068c) zVar.a()).f4265a.a();
            if (cVar != null) {
                try {
                    dVar.f(cVar);
                    cVar.b();
                } catch (IOException unused) {
                    a(cVar);
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    C1265c(File file, long j8, P6.a aVar) {
        this.f4249a = new a();
        this.f4250b = K6.d.f(aVar, file, 201105, 2, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I6.c$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: k, reason: collision with root package name */
        private static final String f4271k = Q6.f.i().j() + "-Sent-Millis";

        /* renamed from: l, reason: collision with root package name */
        private static final String f4272l = Q6.f.i().j() + "-Received-Millis";

        /* renamed from: a, reason: collision with root package name */
        private final String f4273a;

        /* renamed from: b, reason: collision with root package name */
        private final q f4274b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4275c;

        /* renamed from: d, reason: collision with root package name */
        private final v f4276d;

        /* renamed from: e, reason: collision with root package name */
        private final int f4277e;

        /* renamed from: f, reason: collision with root package name */
        private final String f4278f;

        /* renamed from: g, reason: collision with root package name */
        private final q f4279g;

        /* renamed from: h, reason: collision with root package name */
        private final p f4280h;

        /* renamed from: i, reason: collision with root package name */
        private final long f4281i;

        /* renamed from: j, reason: collision with root package name */
        private final long f4282j;

        d(Z z8) {
            C c8;
            try {
                InterfaceC1419g d8 = L.d(z8);
                this.f4273a = d8.readUtf8LineStrict();
                this.f4275c = d8.readUtf8LineStrict();
                q.a aVar = new q.a();
                int l8 = C1265c.l(d8);
                for (int i8 = 0; i8 < l8; i8++) {
                    aVar.b(d8.readUtf8LineStrict());
                }
                this.f4274b = aVar.d();
                M6.k a8 = M6.k.a(d8.readUtf8LineStrict());
                this.f4276d = a8.f7238a;
                this.f4277e = a8.f7239b;
                this.f4278f = a8.f7240c;
                q.a aVar2 = new q.a();
                int l9 = C1265c.l(d8);
                for (int i9 = 0; i9 < l9; i9++) {
                    aVar2.b(d8.readUtf8LineStrict());
                }
                String str = f4271k;
                String f8 = aVar2.f(str);
                String str2 = f4272l;
                String f9 = aVar2.f(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f4281i = f8 != null ? Long.parseLong(f8) : 0L;
                this.f4282j = f9 != null ? Long.parseLong(f9) : 0L;
                this.f4279g = aVar2.d();
                if (a()) {
                    String readUtf8LineStrict = d8.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        g a9 = g.a(d8.readUtf8LineStrict());
                        List c9 = c(d8);
                        List c10 = c(d8);
                        if (!d8.exhausted()) {
                            c8 = C.a(d8.readUtf8LineStrict());
                        } else {
                            c8 = C.SSL_3_0;
                        }
                        this.f4280h = p.b(c8, a9, c9, c10);
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + "\"");
                    }
                } else {
                    this.f4280h = null;
                }
                z8.close();
            } catch (Throwable th) {
                z8.close();
                throw th;
            }
        }

        private boolean a() {
            return this.f4273a.startsWith("https://");
        }

        private List c(InterfaceC1419g interfaceC1419g) {
            int l8 = C1265c.l(interfaceC1419g);
            if (l8 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(l8);
                for (int i8 = 0; i8 < l8; i8++) {
                    String readUtf8LineStrict = interfaceC1419g.readUtf8LineStrict();
                    C1417e c1417e = new C1417e();
                    c1417e.I(C1420h.c(readUtf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(c1417e.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private void e(InterfaceC1418f interfaceC1418f, List list) {
            try {
                interfaceC1418f.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    interfaceC1418f.writeUtf8(C1420h.C(((Certificate) list.get(i8)).getEncoded()).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public boolean b(x xVar, z zVar) {
            if (this.f4273a.equals(xVar.i().toString()) && this.f4275c.equals(xVar.g()) && M6.e.o(zVar, this.f4274b, xVar)) {
                return true;
            }
            return false;
        }

        public z d(d.e eVar) {
            String a8 = this.f4279g.a("Content-Type");
            String a9 = this.f4279g.a("Content-Length");
            return new z.a().o(new x.a().h(this.f4273a).e(this.f4275c, null).d(this.f4274b).a()).m(this.f4276d).g(this.f4277e).j(this.f4278f).i(this.f4279g).b(new C0068c(eVar, a8, a9)).h(this.f4280h).p(this.f4281i).n(this.f4282j).c();
        }

        public void f(d.c cVar) {
            InterfaceC1418f c8 = L.c(cVar.d(0));
            c8.writeUtf8(this.f4273a).writeByte(10);
            c8.writeUtf8(this.f4275c).writeByte(10);
            c8.writeDecimalLong(this.f4274b.e()).writeByte(10);
            int e8 = this.f4274b.e();
            for (int i8 = 0; i8 < e8; i8++) {
                c8.writeUtf8(this.f4274b.c(i8)).writeUtf8(": ").writeUtf8(this.f4274b.f(i8)).writeByte(10);
            }
            c8.writeUtf8(new M6.k(this.f4276d, this.f4277e, this.f4278f).toString()).writeByte(10);
            c8.writeDecimalLong(this.f4279g.e() + 2).writeByte(10);
            int e9 = this.f4279g.e();
            for (int i9 = 0; i9 < e9; i9++) {
                c8.writeUtf8(this.f4279g.c(i9)).writeUtf8(": ").writeUtf8(this.f4279g.f(i9)).writeByte(10);
            }
            c8.writeUtf8(f4271k).writeUtf8(": ").writeDecimalLong(this.f4281i).writeByte(10);
            c8.writeUtf8(f4272l).writeUtf8(": ").writeDecimalLong(this.f4282j).writeByte(10);
            if (a()) {
                c8.writeByte(10);
                c8.writeUtf8(this.f4280h.a().c()).writeByte(10);
                e(c8, this.f4280h.e());
                e(c8, this.f4280h.d());
                c8.writeUtf8(this.f4280h.f().c()).writeByte(10);
            }
            c8.close();
        }

        d(z zVar) {
            this.f4273a = zVar.E().i().toString();
            this.f4274b = M6.e.n(zVar);
            this.f4275c = zVar.E().g();
            this.f4276d = zVar.A();
            this.f4277e = zVar.g();
            this.f4278f = zVar.u();
            this.f4279g = zVar.o();
            this.f4280h = zVar.l();
            this.f4281i = zVar.F();
            this.f4282j = zVar.D();
        }
    }
}
