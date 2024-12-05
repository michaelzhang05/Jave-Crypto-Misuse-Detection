package X0;

import X0.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12730a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12731b;

    /* renamed from: c, reason: collision with root package name */
    private final U0.d f12732c;

    /* loaded from: classes3.dex */
    public static final class a implements V0.b {

        /* renamed from: d, reason: collision with root package name */
        private static final U0.d f12733d = new U0.d() { // from class: X0.g
            @Override // U0.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (U0.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f12734a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f12735b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private U0.d f12736c = f12733d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, U0.e eVar) {
            throw new U0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f12734a), new HashMap(this.f12735b), this.f12736c);
        }

        public a d(V0.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // V0.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, U0.d dVar) {
            this.f12734a.put(cls, dVar);
            this.f12735b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, U0.d dVar) {
        this.f12730a = map;
        this.f12731b = map2;
        this.f12732c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f12730a, this.f12731b, this.f12732c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
