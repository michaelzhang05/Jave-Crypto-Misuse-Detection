package g4;

import g4.d;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements d4.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f6773f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final d4.c f6774g = d4.c.a("key").b(g4.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final d4.c f6775h = d4.c.a("value").b(g4.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final d4.d f6776i = new d4.d() { // from class: g4.e
        @Override // d4.d
        public final void a(Object obj, Object obj2) {
            f.t((Map.Entry) obj, (d4.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f6777a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6778b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f6779c;

    /* renamed from: d, reason: collision with root package name */
    private final d4.d f6780d;

    /* renamed from: e, reason: collision with root package name */
    private final i f6781e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6782a;

        static {
            int[] iArr = new int[d.a.values().length];
            f6782a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6782a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6782a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map map, Map map2, d4.d dVar) {
        this.f6777a = outputStream;
        this.f6778b = map;
        this.f6779c = map2;
        this.f6780d = dVar;
    }

    private static ByteBuffer m(int i6) {
        return ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(d4.d dVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f6777a;
            this.f6777a = bVar;
            try {
                dVar.a(obj, this);
                this.f6777a = outputStream;
                long g6 = bVar.g();
                bVar.close();
                return g6;
            } catch (Throwable th) {
                this.f6777a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f o(d4.d dVar, d4.c cVar, Object obj, boolean z5) {
        long n6 = n(dVar, obj);
        if (z5 && n6 == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(n6);
        dVar.a(obj, this);
        return this;
    }

    private f p(d4.f fVar, d4.c cVar, Object obj, boolean z5) {
        this.f6781e.d(cVar, z5);
        fVar.a(obj, this.f6781e);
        return this;
    }

    private static d r(d4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new d4.b("Field has no @Protobuf config");
    }

    private static int s(d4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new d4.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, d4.e eVar) {
        eVar.c(f6774g, entry.getKey());
        eVar.c(f6775h, entry.getValue());
    }

    private void u(int i6) {
        while (true) {
            long j6 = i6 & (-128);
            OutputStream outputStream = this.f6777a;
            if (j6 == 0) {
                outputStream.write(i6 & 127);
                return;
            } else {
                outputStream.write((i6 & 127) | 128);
                i6 >>>= 7;
            }
        }
    }

    private void v(long j6) {
        while (true) {
            long j7 = (-128) & j6;
            OutputStream outputStream = this.f6777a;
            if (j7 == 0) {
                outputStream.write(((int) j6) & 127);
                return;
            } else {
                outputStream.write((((int) j6) & 127) | 128);
                j6 >>>= 7;
            }
        }
    }

    d4.e b(d4.c cVar, double d6, boolean z5) {
        if (z5 && d6 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f6777a.write(m(8).putDouble(d6).array());
        return this;
    }

    @Override // d4.e
    public d4.e c(d4.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    d4.e f(d4.c cVar, float f6, boolean z5) {
        if (z5 && f6 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f6777a.write(m(4).putFloat(f6).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d4.e g(d4.c cVar, Object obj, boolean z5) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6773f);
            u(bytes.length);
            this.f6777a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                o(f6776i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return b(cVar, ((Double) obj).doubleValue(), z5);
        }
        if (obj instanceof Float) {
            return f(cVar, ((Float) obj).floatValue(), z5);
        }
        if (obj instanceof Number) {
            return k(cVar, ((Number) obj).longValue(), z5);
        }
        if (obj instanceof Boolean) {
            return l(cVar, ((Boolean) obj).booleanValue(), z5);
        }
        if (!(obj instanceof byte[])) {
            d4.d dVar = (d4.d) this.f6778b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z5);
            }
            d4.f fVar = (d4.f) this.f6779c.get(obj.getClass());
            return fVar != null ? p(fVar, cVar, obj, z5) : obj instanceof c ? d(cVar, ((c) obj).a()) : obj instanceof Enum ? d(cVar, ((Enum) obj).ordinal()) : o(this.f6780d, cVar, obj, z5);
        }
        byte[] bArr = (byte[]) obj;
        if (z5 && bArr.length == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        u(bArr.length);
        this.f6777a.write(bArr);
        return this;
    }

    @Override // d4.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f d(d4.c cVar, int i6) {
        return i(cVar, i6, true);
    }

    f i(d4.c cVar, int i6, boolean z5) {
        if (z5 && i6 == 0) {
            return this;
        }
        d r5 = r(cVar);
        int i7 = a.f6782a[r5.intEncoding().ordinal()];
        if (i7 == 1) {
            u(r5.tag() << 3);
            u(i6);
        } else if (i7 == 2) {
            u(r5.tag() << 3);
            u((i6 << 1) ^ (i6 >> 31));
        } else if (i7 == 3) {
            u((r5.tag() << 3) | 5);
            this.f6777a.write(m(4).putInt(i6).array());
        }
        return this;
    }

    @Override // d4.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(d4.c cVar, long j6) {
        return k(cVar, j6, true);
    }

    f k(d4.c cVar, long j6, boolean z5) {
        if (z5 && j6 == 0) {
            return this;
        }
        d r5 = r(cVar);
        int i6 = a.f6782a[r5.intEncoding().ordinal()];
        if (i6 == 1) {
            u(r5.tag() << 3);
            v(j6);
        } else if (i6 == 2) {
            u(r5.tag() << 3);
            v((j6 >> 63) ^ (j6 << 1));
        } else if (i6 == 3) {
            u((r5.tag() << 3) | 1);
            this.f6777a.write(m(8).putLong(j6).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f l(d4.c cVar, boolean z5, boolean z6) {
        return i(cVar, z5 ? 1 : 0, z6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f q(Object obj) {
        if (obj == null) {
            return this;
        }
        d4.d dVar = (d4.d) this.f6778b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new d4.b("No encoder for " + obj.getClass());
    }
}
