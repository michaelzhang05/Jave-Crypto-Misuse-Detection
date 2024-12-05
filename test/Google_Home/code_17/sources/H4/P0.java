package h4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import u2.AbstractC4058e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class P0 {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1355k f32400b;

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f32401c = new P0("IdealBank", 0, e4.n.f31762v);

    /* renamed from: d, reason: collision with root package name */
    public static final P0 f32402d = new P0("P24Bank", 1, e4.n.f31698E);

    /* renamed from: e, reason: collision with root package name */
    public static final P0 f32403e = new P0("EpsBank", 2, e4.n.f31750p);

    /* renamed from: f, reason: collision with root package name */
    public static final P0 f32404f = new P0("FpxBank", 3, e4.n.f31752q);

    /* renamed from: g, reason: collision with root package name */
    public static final P0 f32405g = new P0("AddressName", 4, AbstractC4058e.f39958e);

    /* renamed from: h, reason: collision with root package name */
    public static final P0 f32406h = new P0("AuBecsAccountName", 5, AbstractC3407E.f34824K);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ P0[] f32407i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ U5.a f32408j;

    /* renamed from: a, reason: collision with root package name */
    private final int f32409a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32410a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.ui.core.elements.TranslationId", P0.values(), new String[]{"upe.labels.ideal.bank", "upe.labels.p24.bank", "upe.labels.eps.bank", "upe.labels.fpx.bank", "address.label.name", "upe.labels.name.onAccount"}, new Annotation[][]{null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) P0.f32400b.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        P0[] a8 = a();
        f32407i = a8;
        f32408j = U5.b.a(a8);
        Companion = new b(null);
        f32400b = O5.l.a(O5.o.f8296b, a.f32410a);
    }

    private P0(String str, int i8, int i9) {
        this.f32409a = i9;
    }

    private static final /* synthetic */ P0[] a() {
        return new P0[]{f32401c, f32402d, f32403e, f32404f, f32405g, f32406h};
    }

    public static P0 valueOf(String str) {
        return (P0) Enum.valueOf(P0.class, str);
    }

    public static P0[] values() {
        return (P0[]) f32407i.clone();
    }

    public final int c() {
        return this.f32409a;
    }
}
