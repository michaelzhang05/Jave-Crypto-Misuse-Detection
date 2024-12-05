package y6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4001c implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4001c f39967a = new C4001c();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39968b = a.f39969b;

    /* renamed from: y6.c$a */
    /* loaded from: classes5.dex */
    private static final class a implements v6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39969b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f39970c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ v6.f f39971a = AbstractC3808a.g(k.f40004a).a();

        private a() {
        }

        @Override // v6.f
        public String a() {
            return f39970c;
        }

        @Override // v6.f
        public boolean c() {
            return this.f39971a.c();
        }

        @Override // v6.f
        public int d(String name) {
            AbstractC3159y.i(name, "name");
            return this.f39971a.d(name);
        }

        @Override // v6.f
        public int e() {
            return this.f39971a.e();
        }

        @Override // v6.f
        public String f(int i8) {
            return this.f39971a.f(i8);
        }

        @Override // v6.f
        public List g(int i8) {
            return this.f39971a.g(i8);
        }

        @Override // v6.f
        public List getAnnotations() {
            return this.f39971a.getAnnotations();
        }

        @Override // v6.f
        public v6.j getKind() {
            return this.f39971a.getKind();
        }

        @Override // v6.f
        public v6.f h(int i8) {
            return this.f39971a.h(i8);
        }

        @Override // v6.f
        public boolean i(int i8) {
            return this.f39971a.i(i8);
        }

        @Override // v6.f
        public boolean isInline() {
            return this.f39971a.isInline();
        }
    }

    private C4001c() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39968b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4000b c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        l.b(decoder);
        return new C4000b((List) AbstractC3808a.g(k.f40004a).c(decoder));
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, C4000b value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.c(encoder);
        AbstractC3808a.g(k.f40004a).e(encoder, value);
    }
}
