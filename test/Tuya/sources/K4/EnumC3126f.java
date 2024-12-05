package k4;

import L5.InterfaceC1227k;
import L5.l;
import L5.o;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import j4.AbstractC3081g;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import m4.G;
import r2.AbstractC3685e;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class EnumC3126f {
    public static final b Companion;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1227k f33470d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3126f f33471e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3126f f33472f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3126f f33473g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3126f f33474h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3126f f33475i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC3126f f33476j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC3126f f33477k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC3126f f33478l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC3126f[] f33479m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ R5.a f33480n;

    /* renamed from: a, reason: collision with root package name */
    private final String f33481a;

    /* renamed from: b, reason: collision with root package name */
    private final G f33482b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33483c;

    /* renamed from: k4.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33484a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.uicore.address.FieldType", EnumC3126f.values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: k4.f$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) EnumC3126f.f33470d.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        G.b bVar = G.Companion;
        f33471e = new EnumC3126f("AddressLine1", 0, "addressLine1", bVar.p(), AbstractC3685e.f37574a);
        f33472f = new EnumC3126f("AddressLine2", 1, "addressLine2", bVar.q(), AbstractC3081g.f33189b);
        G k8 = bVar.k();
        int i8 = AbstractC3685e.f37575b;
        f33473g = new EnumC3126f("Locality", 2, "locality", k8, i8);
        f33474h = new EnumC3126f("DependentLocality", 3, "dependentLocality", bVar.m(), i8);
        f33475i = new EnumC3126f("PostalCode", 4) { // from class: k4.f.c
            {
                G u8 = G.Companion.u();
                int i9 = AbstractC3685e.f37580g;
                AbstractC3151p abstractC3151p = null;
                String str = HintConstants.AUTOFILL_HINT_POSTAL_CODE;
            }

            @Override // k4.EnumC3126f
            public int c() {
                return KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
            }
        };
        f33476j = new EnumC3126f("SortingCode", 5) { // from class: k4.f.d
            {
                G y8 = G.Companion.y();
                int i9 = AbstractC3685e.f37580g;
                AbstractC3151p abstractC3151p = null;
                String str = "sortingCode";
            }

            @Override // k4.EnumC3126f
            public int c() {
                return KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
            }
        };
        f33477k = new EnumC3126f("AdministrativeArea", 6, "administrativeArea", bVar.z(), g.f33508v.c());
        f33478l = new EnumC3126f("Name", 7, "name", bVar.r(), AbstractC3685e.f37578e);
        EnumC3126f[] a8 = a();
        f33479m = a8;
        f33480n = R5.b.a(a8);
        Companion = new b(null);
        f33470d = l.a(o.f6505b, a.f33484a);
    }

    public /* synthetic */ EnumC3126f(String str, int i8, String str2, G g8, int i9, AbstractC3151p abstractC3151p) {
        this(str, i8, str2, g8, i9);
    }

    private static final /* synthetic */ EnumC3126f[] a() {
        return new EnumC3126f[]{f33471e, f33472f, f33473g, f33474h, f33475i, f33476j, f33477k, f33478l};
    }

    public static EnumC3126f valueOf(String str) {
        return (EnumC3126f) Enum.valueOf(EnumC3126f.class, str);
    }

    public static EnumC3126f[] values() {
        return (EnumC3126f[]) f33479m.clone();
    }

    public int c() {
        return KeyboardCapitalization.Companion.m4898getWordsIUNYP9k();
    }

    public final int d() {
        return this.f33483c;
    }

    public final G e() {
        return this.f33482b;
    }

    private EnumC3126f(String str, int i8, String str2, G g8, int i9) {
        this.f33481a = str2;
        this.f33482b = g8;
        this.f33483c = i9;
    }
}
