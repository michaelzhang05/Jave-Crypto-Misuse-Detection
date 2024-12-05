package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f14539b = new r("Checkbox", 0, "clicked_checkbox_nospm_mobile_v0");

    /* renamed from: c, reason: collision with root package name */
    public static final r f14540c = new r("CheckboxWithPrefilledEmail", 1, "clicked_checkbox_nospm_mobile_v0_0");

    /* renamed from: d, reason: collision with root package name */
    public static final r f14541d = new r("CheckboxWithPrefilledEmailAndPhone", 2, "clicked_checkbox_nospm_mobile_v0_1");

    /* renamed from: e, reason: collision with root package name */
    public static final r f14542e = new r("Implied", 3, "implied_consent_withspm_mobile_v0");

    /* renamed from: f, reason: collision with root package name */
    public static final r f14543f = new r("ImpliedWithPrefilledEmail", 4, "implied_consent_withspm_mobile_v0_0");

    /* renamed from: g, reason: collision with root package name */
    public static final r f14544g = new r("EnteredPhoneNumberClickedSaveToLink", 5, "entered_phone_number_clicked_save_to_link");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f14545h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14546i;

    /* renamed from: a, reason: collision with root package name */
    private final String f14547a;

    static {
        r[] a8 = a();
        f14545h = a8;
        f14546i = R5.b.a(a8);
    }

    private r(String str, int i8, String str2) {
        this.f14547a = str2;
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f14539b, f14540c, f14541d, f14542e, f14543f, f14544g};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f14545h.clone();
    }

    public final String b() {
        return this.f14547a;
    }
}
