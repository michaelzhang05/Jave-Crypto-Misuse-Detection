package m4;

import L5.InterfaceC1227k;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class W {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1227k f35289a;

    /* renamed from: b, reason: collision with root package name */
    public static final W f35290b = new W("HIDDEN", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final W f35291c = new W("OPTIONAL", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final W f35292d = new W("REQUIRED", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W[] f35293e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f35294f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35295a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.uicore.elements.PhoneNumberState", W.values(), new String[]{"hidden", "optional", "required"}, new Annotation[][]{null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) W.f35289a.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        W[] a8 = a();
        f35293e = a8;
        f35294f = R5.b.a(a8);
        Companion = new b(null);
        f35289a = L5.l.a(L5.o.f6505b, a.f35295a);
    }

    private W(String str, int i8) {
    }

    private static final /* synthetic */ W[] a() {
        return new W[]{f35290b, f35291c, f35292d};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f35293e.clone();
    }
}
