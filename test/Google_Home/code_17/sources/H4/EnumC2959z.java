package h4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
/* renamed from: h4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2959z {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1355k f32806a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2959z f32807b = new EnumC2959z("None", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2959z f32808c = new EnumC2959z("Characters", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2959z f32809d = new EnumC2959z("Words", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2959z f32810e = new EnumC2959z("Sentences", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC2959z[] f32811f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U5.a f32812g;

    /* renamed from: h4.z$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32813a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.ui.core.elements.Capitalization", EnumC2959z.values(), new String[]{"none", "characters", "words", "sentences"}, new Annotation[][]{null, null, null, null}, null);
        }
    }

    /* renamed from: h4.z$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) EnumC2959z.f32806a.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        EnumC2959z[] a8 = a();
        f32811f = a8;
        f32812g = U5.b.a(a8);
        Companion = new b(null);
        f32806a = O5.l.a(O5.o.f8296b, a.f32813a);
    }

    private EnumC2959z(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2959z[] a() {
        return new EnumC2959z[]{f32807b, f32808c, f32809d, f32810e};
    }

    public static EnumC2959z valueOf(String str) {
        return (EnumC2959z) Enum.valueOf(EnumC2959z.class, str);
    }

    public static EnumC2959z[] values() {
        return (EnumC2959z[]) f32811f.clone();
    }
}
