package B6;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.C4211a;
import y6.d;

/* loaded from: classes5.dex */
public final class k implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1048a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1049b = y6.i.b("kotlinx.serialization.json.JsonElement", d.b.f41024a, new y6.f[0], a.f1050a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1050a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: B6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0012a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0012a f1051a = new C0012a();

            C0012a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.f invoke() {
                return y.f1074a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1052a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.f invoke() {
                return u.f1065a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f1053a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.f invoke() {
                return q.f1060a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f1054a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.f invoke() {
                return w.f1069a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final e f1055a = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y6.f invoke() {
                return B6.c.f1011a.a();
            }
        }

        a() {
            super(1);
        }

        public final void a(C4211a buildSerialDescriptor) {
            y6.f f8;
            y6.f f9;
            y6.f f10;
            y6.f f11;
            y6.f f12;
            AbstractC3255y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f8 = l.f(C0012a.f1051a);
            C4211a.b(buildSerialDescriptor, "JsonPrimitive", f8, null, false, 12, null);
            f9 = l.f(b.f1052a);
            C4211a.b(buildSerialDescriptor, "JsonNull", f9, null, false, 12, null);
            f10 = l.f(c.f1053a);
            C4211a.b(buildSerialDescriptor, "JsonLiteral", f10, null, false, 12, null);
            f11 = l.f(d.f1054a);
            C4211a.b(buildSerialDescriptor, "JsonObject", f11, null, false, 12, null);
            f12 = l.f(e.f1055a);
            C4211a.b(buildSerialDescriptor, "JsonArray", f12, null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4211a) obj);
            return I.f8278a;
        }
    }

    private k() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1049b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return l.d(decoder).n();
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, i value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.h(encoder);
        if (value instanceof x) {
            encoder.g(y.f1074a, value);
        } else if (value instanceof v) {
            encoder.g(w.f1069a, value);
        } else if (value instanceof b) {
            encoder.g(c.f1011a, value);
        }
    }
}
