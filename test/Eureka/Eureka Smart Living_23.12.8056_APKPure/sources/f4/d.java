package f4;

import d4.f;
import d4.g;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class d implements e4.b {

    /* renamed from: e, reason: collision with root package name */
    private static final d4.d f6592e = new d4.d() { // from class: f4.a
        @Override // d4.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (d4.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final f f6593f = new f() { // from class: f4.b
        @Override // d4.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).a((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final f f6594g = new f() { // from class: f4.c
        @Override // d4.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f6595h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f6596a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f6597b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private d4.d f6598c = f6592e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6599d = false;

    /* loaded from: classes.dex */
    class a implements d4.a {
        a() {
        }

        @Override // d4.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f6596a, d.this.f6597b, d.this.f6598c, d.this.f6599d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f6601a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6601a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // d4.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.a(f6601a.format(date));
        }
    }

    public d() {
        p(String.class, f6593f);
        p(Boolean.class, f6594g);
        p(Date.class, f6595h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, d4.e eVar) {
        throw new d4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.b(bool.booleanValue());
    }

    public d4.a i() {
        return new a();
    }

    public d j(e4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z5) {
        this.f6599d = z5;
        return this;
    }

    @Override // e4.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, d4.d dVar) {
        this.f6596a.put(cls, dVar);
        this.f6597b.remove(cls);
        return this;
    }

    public d p(Class cls, f fVar) {
        this.f6597b.put(cls, fVar);
        this.f6596a.remove(cls);
        return this;
    }
}
