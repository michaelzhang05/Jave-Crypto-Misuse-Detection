package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class T6 implements S6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15566a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15567b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15568c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15569d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15570e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15571f;

    /* renamed from: g, reason: collision with root package name */
    public static final X2 f15572g;

    /* renamed from: h, reason: collision with root package name */
    public static final X2 f15573h;

    /* renamed from: i, reason: collision with root package name */
    public static final X2 f15574i;

    /* renamed from: j, reason: collision with root package name */
    public static final X2 f15575j;

    /* renamed from: k, reason: collision with root package name */
    public static final X2 f15576k;

    /* renamed from: l, reason: collision with root package name */
    public static final X2 f15577l;

    /* renamed from: m, reason: collision with root package name */
    public static final X2 f15578m;

    /* renamed from: n, reason: collision with root package name */
    public static final X2 f15579n;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15566a = a8.f("measurement.redaction.app_instance_id", true);
        f15567b = a8.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f15568c = a8.f("measurement.redaction.config_redacted_fields", true);
        f15569d = a8.f("measurement.redaction.device_info", true);
        f15570e = a8.f("measurement.redaction.e_tag", true);
        f15571f = a8.f("measurement.redaction.enhanced_uid", true);
        f15572g = a8.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f15573h = a8.f("measurement.redaction.google_signals", true);
        f15574i = a8.f("measurement.redaction.no_aiid_in_config_request", true);
        f15575j = a8.f("measurement.redaction.retain_major_os_version", true);
        f15576k = a8.f("measurement.redaction.scion_payload_generator", true);
        f15577l = a8.f("measurement.redaction.upload_redacted_fields", true);
        f15578m = a8.f("measurement.redaction.upload_subdomain_override", true);
        f15579n = a8.f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean a() {
        return ((Boolean) f15575j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean b() {
        return ((Boolean) f15576k.b()).booleanValue();
    }
}
