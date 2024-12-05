package n4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import O5.l;
import O5.o;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import p4.G;
import u2.AbstractC4058e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: n4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class EnumC3481f {
    public static final b Companion;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1355k f35462d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3481f f35463e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3481f f35464f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3481f f35465g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3481f f35466h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3481f f35467i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC3481f f35468j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC3481f f35469k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC3481f f35470l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC3481f[] f35471m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ U5.a f35472n;

    /* renamed from: a, reason: collision with root package name */
    private final String f35473a;

    /* renamed from: b, reason: collision with root package name */
    private final G f35474b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35475c;

    /* renamed from: n4.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35476a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.uicore.address.FieldType", EnumC3481f.values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: n4.f$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) EnumC3481f.f35462d.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        G.b bVar = G.Companion;
        f35463e = new EnumC3481f("AddressLine1", 0, "addressLine1", bVar.p(), AbstractC4058e.f39954a);
        f35464f = new EnumC3481f("AddressLine2", 1, "addressLine2", bVar.q(), AbstractC3435g.f35165b);
        G k8 = bVar.k();
        int i8 = AbstractC4058e.f39955b;
        f35465g = new EnumC3481f("Locality", 2, "locality", k8, i8);
        f35466h = new EnumC3481f("DependentLocality", 3, "dependentLocality", bVar.m(), i8);
        f35467i = new EnumC3481f("PostalCode", 4) { // from class: n4.f.c
            {
                G u8 = G.Companion.u();
                int i9 = AbstractC4058e.f39960g;
                AbstractC3247p abstractC3247p = null;
                String str = HintConstants.AUTOFILL_HINT_POSTAL_CODE;
            }

            @Override // n4.EnumC3481f
            public int c() {
                return KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
            }
        };
        f35468j = new EnumC3481f("SortingCode", 5) { // from class: n4.f.d
            {
                G y8 = G.Companion.y();
                int i9 = AbstractC4058e.f39960g;
                AbstractC3247p abstractC3247p = null;
                String str = "sortingCode";
            }

            @Override // n4.EnumC3481f
            public int c() {
                return KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
            }
        };
        f35469k = new EnumC3481f("AdministrativeArea", 6, "administrativeArea", bVar.z(), g.f35500v.c());
        f35470l = new EnumC3481f("Name", 7, "name", bVar.r(), AbstractC4058e.f39958e);
        EnumC3481f[] a8 = a();
        f35471m = a8;
        f35472n = U5.b.a(a8);
        Companion = new b(null);
        f35462d = l.a(o.f8296b, a.f35476a);
    }

    public /* synthetic */ EnumC3481f(String str, int i8, String str2, G g8, int i9, AbstractC3247p abstractC3247p) {
        this(str, i8, str2, g8, i9);
    }

    private static final /* synthetic */ EnumC3481f[] a() {
        return new EnumC3481f[]{f35463e, f35464f, f35465g, f35466h, f35467i, f35468j, f35469k, f35470l};
    }

    public static EnumC3481f valueOf(String str) {
        return (EnumC3481f) Enum.valueOf(EnumC3481f.class, str);
    }

    public static EnumC3481f[] values() {
        return (EnumC3481f[]) f35471m.clone();
    }

    public int c() {
        return KeyboardCapitalization.Companion.m4903getWordsIUNYP9k();
    }

    public final int d() {
        return this.f35475c;
    }

    public final G e() {
        return this.f35474b;
    }

    private EnumC3481f(String str, int i8, String str2, G g8, int i9) {
        this.f35473a = str2;
        this.f35474b = g8;
        this.f35475c = i9;
    }
}
