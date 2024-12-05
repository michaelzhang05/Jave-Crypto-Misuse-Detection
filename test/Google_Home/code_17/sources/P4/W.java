package p4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class W {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1355k f37315a;

    /* renamed from: b, reason: collision with root package name */
    public static final W f37316b = new W("HIDDEN", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final W f37317c = new W("OPTIONAL", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final W f37318d = new W("REQUIRED", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W[] f37319e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ U5.a f37320f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37321a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.uicore.elements.PhoneNumberState", W.values(), new String[]{"hidden", "optional", "required"}, new Annotation[][]{null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) W.f37315a.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        W[] a8 = a();
        f37319e = a8;
        f37320f = U5.b.a(a8);
        Companion = new b(null);
        f37315a = O5.l.a(O5.o.f8296b, a.f37321a);
    }

    private W(String str, int i8) {
    }

    private static final /* synthetic */ W[] a() {
        return new W[]{f37316b, f37317c, f37318d};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f37319e.clone();
    }
}
