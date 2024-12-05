package g4;

import g4.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6783a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6784b;

    /* renamed from: c, reason: collision with root package name */
    private final d4.d f6785c;

    /* loaded from: classes.dex */
    public static final class a implements e4.b {

        /* renamed from: d, reason: collision with root package name */
        private static final d4.d f6786d = new d4.d() { // from class: g4.g
            @Override // d4.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (d4.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f6787a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f6788b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private d4.d f6789c = f6786d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, d4.e eVar) {
            throw new d4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f6787a), new HashMap(this.f6788b), this.f6789c);
        }

        public a d(e4.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // e4.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, d4.d dVar) {
            this.f6787a.put(cls, dVar);
            this.f6788b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, d4.d dVar) {
        this.f6783a = map;
        this.f6784b = map2;
        this.f6785c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f6783a, this.f6784b, this.f6785c).q(obj);
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
