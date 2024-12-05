package V0;

import V0.d;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements S0.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f11831f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g, reason: collision with root package name */
    private static final S0.c f11832g = S0.c.a(LeanbackPreferenceDialogFragment.ARG_KEY).b(V0.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final S0.c f11833h = S0.c.a("value").b(V0.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final S0.d f11834i = new S0.d() { // from class: V0.e
        @Override // S0.d
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (S0.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f11835a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11836b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f11837c;

    /* renamed from: d, reason: collision with root package name */
    private final S0.d f11838d;

    /* renamed from: e, reason: collision with root package name */
    private final i f11839e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11840a;

        static {
            int[] iArr = new int[d.a.values().length];
            f11840a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11840a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11840a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map map, Map map2, S0.d dVar) {
        this.f11835a = outputStream;
        this.f11836b = map;
        this.f11837c = map2;
        this.f11838d = dVar;
    }

    private static ByteBuffer p(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(S0.d dVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f11835a;
            this.f11835a = bVar;
            try {
                dVar.a(obj, this);
                this.f11835a = outputStream;
                long a8 = bVar.a();
                bVar.close();
                return a8;
            } catch (Throwable th) {
                this.f11835a = outputStream;
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

    private f r(S0.d dVar, S0.c cVar, Object obj, boolean z8) {
        long q8 = q(dVar, obj);
        if (z8 && q8 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q8);
        dVar.a(obj, this);
        return this;
    }

    private f s(S0.f fVar, S0.c cVar, Object obj, boolean z8) {
        this.f11839e.b(cVar, z8);
        fVar.a(obj, this.f11839e);
        return this;
    }

    private static d u(S0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new S0.b("Field has no @Protobuf config");
    }

    private static int v(S0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new S0.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, S0.e eVar) {
        eVar.a(f11832g, entry.getKey());
        eVar.a(f11833h, entry.getValue());
    }

    private void x(int i8) {
        while ((i8 & (-128)) != 0) {
            this.f11835a.write((i8 & 127) | 128);
            i8 >>>= 7;
        }
        this.f11835a.write(i8 & 127);
    }

    private void y(long j8) {
        while (((-128) & j8) != 0) {
            this.f11835a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f11835a.write(((int) j8) & 127);
    }

    @Override // S0.e
    public S0.e a(S0.c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    @Override // S0.e
    public S0.e b(S0.c cVar, double d8) {
        return g(cVar, d8, true);
    }

    S0.e g(S0.c cVar, double d8, boolean z8) {
        if (z8 && d8 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f11835a.write(p(8).putDouble(d8).array());
        return this;
    }

    S0.e h(S0.c cVar, float f8, boolean z8) {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f11835a.write(p(4).putFloat(f8).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0.e i(S0.c cVar, Object obj, boolean z8) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f11831f);
            x(bytes.length);
            this.f11835a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f11834i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(cVar, ((Double) obj).doubleValue(), z8);
        }
        if (obj instanceof Float) {
            return h(cVar, ((Float) obj).floatValue(), z8);
        }
        if (obj instanceof Number) {
            return m(cVar, ((Number) obj).longValue(), z8);
        }
        if (obj instanceof Boolean) {
            return o(cVar, ((Boolean) obj).booleanValue(), z8);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z8 && bArr.length == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            x(bArr.length);
            this.f11835a.write(bArr);
            return this;
        }
        S0.d dVar = (S0.d) this.f11836b.get(obj.getClass());
        if (dVar != null) {
            return r(dVar, cVar, obj, z8);
        }
        S0.f fVar = (S0.f) this.f11837c.get(obj.getClass());
        if (fVar != null) {
            return s(fVar, cVar, obj, z8);
        }
        if (obj instanceof c) {
            return c(cVar, ((c) obj).getNumber());
        }
        if (obj instanceof Enum) {
            return c(cVar, ((Enum) obj).ordinal());
        }
        return r(this.f11838d, cVar, obj, z8);
    }

    @Override // S0.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(S0.c cVar, int i8) {
        return k(cVar, i8, true);
    }

    f k(S0.c cVar, int i8, boolean z8) {
        if (z8 && i8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i9 = a.f11840a[u8.intEncoding().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    x((u8.tag() << 3) | 5);
                    this.f11835a.write(p(4).putInt(i8).array());
                }
            } else {
                x(u8.tag() << 3);
                x((i8 << 1) ^ (i8 >> 31));
            }
        } else {
            x(u8.tag() << 3);
            x(i8);
        }
        return this;
    }

    @Override // S0.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d(S0.c cVar, long j8) {
        return m(cVar, j8, true);
    }

    f m(S0.c cVar, long j8, boolean z8) {
        if (z8 && j8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i8 = a.f11840a[u8.intEncoding().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    x((u8.tag() << 3) | 1);
                    this.f11835a.write(p(8).putLong(j8).array());
                }
            } else {
                x(u8.tag() << 3);
                y((j8 >> 63) ^ (j8 << 1));
            }
        } else {
            x(u8.tag() << 3);
            y(j8);
        }
        return this;
    }

    @Override // S0.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f e(S0.c cVar, boolean z8) {
        return o(cVar, z8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f o(S0.c cVar, boolean z8, boolean z9) {
        return k(cVar, z8 ? 1 : 0, z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        S0.d dVar = (S0.d) this.f11836b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new S0.b("No encoder for " + obj.getClass());
    }
}
