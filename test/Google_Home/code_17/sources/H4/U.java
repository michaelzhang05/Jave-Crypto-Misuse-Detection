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
/* loaded from: classes4.dex */
public final class U {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1355k f32524a;

    /* renamed from: b, reason: collision with root package name */
    public static final U f32525b = new U("Country", 0);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ U[] f32526c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f32527d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32528a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.ui.core.elements.DisplayField", U.values(), new String[]{"country"}, new Annotation[][]{null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) U.f32524a.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        U[] a8 = a();
        f32526c = a8;
        f32527d = U5.b.a(a8);
        Companion = new b(null);
        f32524a = O5.l.a(O5.o.f8296b, a.f32528a);
    }

    private U(String str, int i8) {
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f32525b};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f32526c.clone();
    }
}
