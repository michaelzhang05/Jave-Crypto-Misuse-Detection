package e4;

import L5.InterfaceC1227k;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
/* renamed from: e4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2639z {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1227k f30885a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2639z f30886b = new EnumC2639z("None", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2639z f30887c = new EnumC2639z("Characters", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2639z f30888d = new EnumC2639z("Words", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2639z f30889e = new EnumC2639z("Sentences", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC2639z[] f30890f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ R5.a f30891g;

    /* renamed from: e4.z$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30892a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.ui.core.elements.Capitalization", EnumC2639z.values(), new String[]{"none", "characters", "words", "sentences"}, new Annotation[][]{null, null, null, null}, null);
        }
    }

    /* renamed from: e4.z$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) EnumC2639z.f30885a.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        EnumC2639z[] a8 = a();
        f30890f = a8;
        f30891g = R5.b.a(a8);
        Companion = new b(null);
        f30885a = L5.l.a(L5.o.f6505b, a.f30892a);
    }

    private EnumC2639z(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2639z[] a() {
        return new EnumC2639z[]{f30886b, f30887c, f30888d, f30889e};
    }

    public static EnumC2639z valueOf(String str) {
        return (EnumC2639z) Enum.valueOf(EnumC2639z.class, str);
    }

    public static EnumC2639z[] values() {
        return (EnumC2639z[]) f30890f.clone();
    }
}
