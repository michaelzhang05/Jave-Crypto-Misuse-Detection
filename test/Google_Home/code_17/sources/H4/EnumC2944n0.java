package h4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
/* renamed from: h4.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2944n0 {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1355k f32684a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2944n0 f32685b = new EnumC2944n0("Text", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2944n0 f32686c = new EnumC2944n0("Ascii", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2944n0 f32687d = new EnumC2944n0("Number", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2944n0 f32688e = new EnumC2944n0("Phone", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2944n0 f32689f = new EnumC2944n0("Uri", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2944n0 f32690g = new EnumC2944n0("Email", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2944n0 f32691h = new EnumC2944n0("Password", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC2944n0 f32692i = new EnumC2944n0("NumberPassword", 7);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC2944n0[] f32693j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ U5.a f32694k;

    /* renamed from: h4.n0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32695a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.ui.core.elements.KeyboardType", EnumC2944n0.values(), new String[]{MimeTypes.BASE_TYPE_TEXT, "ascii", "number", HintConstants.AUTOFILL_HINT_PHONE, "uri", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: h4.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) EnumC2944n0.f32684a.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        EnumC2944n0[] a8 = a();
        f32693j = a8;
        f32694k = U5.b.a(a8);
        Companion = new b(null);
        f32684a = O5.l.a(O5.o.f8296b, a.f32695a);
    }

    private EnumC2944n0(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2944n0[] a() {
        return new EnumC2944n0[]{f32685b, f32686c, f32687d, f32688e, f32689f, f32690g, f32691h, f32692i};
    }

    public static EnumC2944n0 valueOf(String str) {
        return (EnumC2944n0) Enum.valueOf(EnumC2944n0.class, str);
    }

    public static EnumC2944n0[] values() {
        return (EnumC2944n0[]) f32693j.clone();
    }
}
