package X0;

import X0.d;
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
public final class f implements U0.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f12720f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g, reason: collision with root package name */
    private static final U0.c f12721g = U0.c.a(LeanbackPreferenceDialogFragment.ARG_KEY).b(X0.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final U0.c f12722h = U0.c.a("value").b(X0.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final U0.d f12723i = new U0.d() { // from class: X0.e
        @Override // U0.d
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (U0.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f12724a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12725b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12726c;

    /* renamed from: d, reason: collision with root package name */
    private final U0.d f12727d;

    /* renamed from: e, reason: collision with root package name */
    private final i f12728e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12729a;

        static {
            int[] iArr = new int[d.a.values().length];
            f12729a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12729a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12729a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map map, Map map2, U0.d dVar) {
        this.f12724a = outputStream;
        this.f12725b = map;
        this.f12726c = map2;
        this.f12727d = dVar;
    }

    private static ByteBuffer p(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(U0.d dVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f12724a;
            this.f12724a = bVar;
            try {
                dVar.a(obj, this);
                this.f12724a = outputStream;
                long a8 = bVar.a();
                bVar.close();
                return a8;
            } catch (Throwable th) {
                this.f12724a = outputStream;
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

    private f r(U0.d dVar, U0.c cVar, Object obj, boolean z8) {
        long q8 = q(dVar, obj);
        if (z8 && q8 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q8);
        dVar.a(obj, this);
        return this;
    }

    private f s(U0.f fVar, U0.c cVar, Object obj, boolean z8) {
        this.f12728e.b(cVar, z8);
        fVar.a(obj, this.f12728e);
        return this;
    }

    private static d u(U0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new U0.b("Field has no @Protobuf config");
    }

    private static int v(U0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new U0.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, U0.e eVar) {
        eVar.g(f12721g, entry.getKey());
        eVar.g(f12722h, entry.getValue());
    }

    private void x(int i8) {
        while ((i8 & (-128)) != 0) {
            this.f12724a.write((i8 & 127) | 128);
            i8 >>>= 7;
        }
        this.f12724a.write(i8 & 127);
    }

    private void y(long j8) {
        while (((-128) & j8) != 0) {
            this.f12724a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f12724a.write(((int) j8) & 127);
    }

    @Override // U0.e
    public U0.e a(U0.c cVar, double d8) {
        return f(cVar, d8, true);
    }

    U0.e f(U0.c cVar, double d8, boolean z8) {
        if (z8 && d8 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f12724a.write(p(8).putDouble(d8).array());
        return this;
    }

    @Override // U0.e
    public U0.e g(U0.c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    U0.e h(U0.c cVar, float f8, boolean z8) {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f12724a.write(p(4).putFloat(f8).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public U0.e i(U0.c cVar, Object obj, boolean z8) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12720f);
            x(bytes.length);
            this.f12724a.write(bytes);
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
                r(f12723i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return f(cVar, ((Double) obj).doubleValue(), z8);
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
            this.f12724a.write(bArr);
            return this;
        }
        U0.d dVar = (U0.d) this.f12725b.get(obj.getClass());
        if (dVar != null) {
            return r(dVar, cVar, obj, z8);
        }
        U0.f fVar = (U0.f) this.f12726c.get(obj.getClass());
        if (fVar != null) {
            return s(fVar, cVar, obj, z8);
        }
        if (obj instanceof c) {
            return c(cVar, ((c) obj).getNumber());
        }
        if (obj instanceof Enum) {
            return c(cVar, ((Enum) obj).ordinal());
        }
        return r(this.f12727d, cVar, obj, z8);
    }

    @Override // U0.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(U0.c cVar, int i8) {
        return k(cVar, i8, true);
    }

    f k(U0.c cVar, int i8, boolean z8) {
        if (z8 && i8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i9 = a.f12729a[u8.intEncoding().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    x((u8.tag() << 3) | 5);
                    this.f12724a.write(p(4).putInt(i8).array());
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

    @Override // U0.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f b(U0.c cVar, long j8) {
        return m(cVar, j8, true);
    }

    f m(U0.c cVar, long j8, boolean z8) {
        if (z8 && j8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i8 = a.f12729a[u8.intEncoding().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    x((u8.tag() << 3) | 1);
                    this.f12724a.write(p(8).putLong(j8).array());
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

    @Override // U0.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f d(U0.c cVar, boolean z8) {
        return o(cVar, z8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f o(U0.c cVar, boolean z8, boolean z9) {
        return k(cVar, z8 ? 1 : 0, z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        U0.d dVar = (U0.d) this.f12725b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new U0.b("No encoder for " + obj.getClass());
    }
}
