package y6;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.C3834a;
import v6.d;

/* loaded from: classes5.dex */
public final class k implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final k f40004a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f40005b = v6.i.b("kotlinx.serialization.json.JsonElement", d.b.f38893a, new v6.f[0], a.f40006a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40006a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0919a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0919a f40007a = new C0919a();

            C0919a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v6.f invoke() {
                return y.f40030a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40008a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v6.f invoke() {
                return u.f40021a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f40009a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v6.f invoke() {
                return q.f40016a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f40010a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v6.f invoke() {
                return w.f40025a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final e f40011a = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v6.f invoke() {
                return C4001c.f39967a.a();
            }
        }

        a() {
            super(1);
        }

        public final void a(C3834a buildSerialDescriptor) {
            v6.f f8;
            v6.f f9;
            v6.f f10;
            v6.f f11;
            v6.f f12;
            AbstractC3159y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f8 = l.f(C0919a.f40007a);
            C3834a.b(buildSerialDescriptor, "JsonPrimitive", f8, null, false, 12, null);
            f9 = l.f(b.f40008a);
            C3834a.b(buildSerialDescriptor, "JsonNull", f9, null, false, 12, null);
            f10 = l.f(c.f40009a);
            C3834a.b(buildSerialDescriptor, "JsonLiteral", f10, null, false, 12, null);
            f11 = l.f(d.f40010a);
            C3834a.b(buildSerialDescriptor, "JsonObject", f11, null, false, 12, null);
            f12 = l.f(e.f40011a);
            C3834a.b(buildSerialDescriptor, "JsonArray", f12, null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3834a) obj);
            return I.f6487a;
        }
    }

    private k() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f40005b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC4007i c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return l.d(decoder).n();
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, AbstractC4007i value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.h(encoder);
        if (value instanceof x) {
            encoder.j(y.f40030a, value);
        } else if (value instanceof v) {
            encoder.j(w.f40025a, value);
        } else if (value instanceof C4000b) {
            encoder.j(C4001c.f39967a, value);
        }
    }
}
