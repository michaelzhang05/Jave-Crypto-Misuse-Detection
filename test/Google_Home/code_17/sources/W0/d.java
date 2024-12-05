package W0;

import U0.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements V0.b {

    /* renamed from: e, reason: collision with root package name */
    private static final U0.d f11331e = new U0.d() { // from class: W0.a
        @Override // U0.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (U0.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final U0.f f11332f = new U0.f() { // from class: W0.b
        @Override // U0.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).e((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final U0.f f11333g = new U0.f() { // from class: W0.c
        @Override // U0.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f11334h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f11335a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f11336b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private U0.d f11337c = f11331e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11338d = false;

    /* loaded from: classes3.dex */
    class a implements U0.a {
        a() {
        }

        @Override // U0.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f11335a, d.this.f11336b, d.this.f11337c, d.this.f11338d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // U0.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements U0.f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f11340a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11340a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // U0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.e(f11340a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f11332f);
        p(Boolean.class, f11333g);
        p(Date.class, f11334h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, U0.e eVar) {
        throw new U0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.f(bool.booleanValue());
    }

    public U0.a i() {
        return new a();
    }

    public d j(V0.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z8) {
        this.f11338d = z8;
        return this;
    }

    @Override // V0.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, U0.d dVar) {
        this.f11335a.put(cls, dVar);
        this.f11336b.remove(cls);
        return this;
    }

    public d p(Class cls, U0.f fVar) {
        this.f11336b.put(cls, fVar);
        this.f11335a.remove(cls);
        return this;
    }
}
