package V3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: i2, reason: collision with root package name */
    private static final /* synthetic */ g[] f10790i2;

    /* renamed from: j2, reason: collision with root package name */
    private static final /* synthetic */ U5.a f10793j2;

    /* renamed from: a, reason: collision with root package name */
    private final String f10837a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f10767b = new g("PARAM_PLATFORM", 0, "C001");

    /* renamed from: c, reason: collision with root package name */
    public static final g f10770c = new g("PARAM_DEVICE_MODEL", 1, "C002");

    /* renamed from: d, reason: collision with root package name */
    public static final g f10773d = new g("PARAM_OS_NAME", 2, "C003");

    /* renamed from: e, reason: collision with root package name */
    public static final g f10776e = new g("PARAM_OS_VERSION", 3, "C004");

    /* renamed from: f, reason: collision with root package name */
    public static final g f10779f = new g("PARAM_LOCALE", 4, "C005");

    /* renamed from: g, reason: collision with root package name */
    public static final g f10782g = new g("PARAM_TIME_ZONE", 5, "C006");

    /* renamed from: h, reason: collision with root package name */
    public static final g f10785h = new g("PARAM_HARDWARE_ID", 6, "C007");

    /* renamed from: i, reason: collision with root package name */
    public static final g f10788i = new g("PARAM_SCREEN_RESOLUTION", 7, "C008");

    /* renamed from: j, reason: collision with root package name */
    public static final g f10791j = new g("PARAM_DEVICE_NAME", 8, "C009");

    /* renamed from: k, reason: collision with root package name */
    public static final g f10794k = new g("PARAM_IP_ADDRESS", 9, "C010");

    /* renamed from: l, reason: collision with root package name */
    public static final g f10796l = new g("PARAM_LATITUDE", 10, "C011");

    /* renamed from: m, reason: collision with root package name */
    public static final g f10798m = new g("PARAM_LONGITUDE", 11, "C012");

    /* renamed from: n, reason: collision with root package name */
    public static final g f10800n = new g("PARAM_TELE_DEVICE_ID", 12, "A001");

    /* renamed from: o, reason: collision with root package name */
    public static final g f10802o = new g("PARAM_TELE_SUBSCRIBER_ID", 13, "A002");

    /* renamed from: p, reason: collision with root package name */
    public static final g f10804p = new g("PARAM_TELE_IMEI_SV", 14, "A003");

    /* renamed from: q, reason: collision with root package name */
    public static final g f10807q = new g("PARAM_TELE_GROUP_IDENTIFIER_L1", 15, "A004");

    /* renamed from: r, reason: collision with root package name */
    public static final g f10810r = new g("PARAM_TELE_LINE1_NUMBER", 16, "A005");

    /* renamed from: s, reason: collision with root package name */
    public static final g f10813s = new g("PARAM_TELE_MMS_UA_PROFILE_URL", 17, "A006");

    /* renamed from: t, reason: collision with root package name */
    public static final g f10816t = new g("PARAM_TELE_MMS_USER_AGENT", 18, "A007");

    /* renamed from: u, reason: collision with root package name */
    public static final g f10819u = new g("PARAM_TELE_NETWORK_COUNTRY_ISO", 19, "A008");

    /* renamed from: v, reason: collision with root package name */
    public static final g f10822v = new g("PARAM_TELE_NETWORK_OPERATOR", 20, "A009");

    /* renamed from: w, reason: collision with root package name */
    public static final g f10825w = new g("PARAM_TELE_NETWORK_OPERATOR_NAME", 21, "A010");

    /* renamed from: x, reason: collision with root package name */
    public static final g f10828x = new g("PARAM_TELE_NETWORK_TYPE", 22, "A011");

    /* renamed from: y, reason: collision with root package name */
    public static final g f10831y = new g("PARAM_TELE_PHONE_COUNT", 23, "A012");

    /* renamed from: z, reason: collision with root package name */
    public static final g f10834z = new g("PARAM_TELE_PHONE_TYPE", 24, "A013");

    /* renamed from: A, reason: collision with root package name */
    public static final g f10687A = new g("PARAM_TELE_SIM_COUNTRY_ISO", 25, "A014");

    /* renamed from: B, reason: collision with root package name */
    public static final g f10690B = new g("PARAM_TELE_SIM_OPERATOR", 26, "A015");

    /* renamed from: C, reason: collision with root package name */
    public static final g f10693C = new g("PARAM_TELE_SIM_OPERATOR_NAME", 27, "A016");

    /* renamed from: D, reason: collision with root package name */
    public static final g f10696D = new g("PARAM_TELE_SIM_SERIAL_NUMBER", 28, "A017");

    /* renamed from: E, reason: collision with root package name */
    public static final g f10699E = new g("PARAM_TELE_SIM_STATE", 29, "A018");

    /* renamed from: F, reason: collision with root package name */
    public static final g f10702F = new g("PARAM_TELE_VOICE_MAIL_ALPHA_TAG", 30, "A019");

    /* renamed from: G, reason: collision with root package name */
    public static final g f10705G = new g("PARAM_TELE_VOICE_MAIL_NUMBER", 31, "A020");

    /* renamed from: H, reason: collision with root package name */
    public static final g f10708H = new g("PARAM_TELE_HAS_ICC_CARD", 32, "A021");

    /* renamed from: I, reason: collision with root package name */
    public static final g f10711I = new g("PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED", 33, "A022");

    /* renamed from: J, reason: collision with root package name */
    public static final g f10714J = new g("PARAM_TELE_IS_NETWORK_ROAMING", 34, "A023");

    /* renamed from: K, reason: collision with root package name */
    public static final g f10717K = new g("PARAM_TELE_IS_SMS_CAPABLE", 35, "A024");

    /* renamed from: L, reason: collision with root package name */
    public static final g f10720L = new g("PARAM_TELE_IS_TTY_MODE_SUPPORTED", 36, "A025");

    /* renamed from: M, reason: collision with root package name */
    public static final g f10723M = new g("PARAM_TELE_IS_VOICE_CAPABLE", 37, "A026");

    /* renamed from: N, reason: collision with root package name */
    public static final g f10726N = new g("PARAM_TELE_IS_WORLD_PHONE", 38, "A027");

    /* renamed from: O, reason: collision with root package name */
    public static final g f10729O = new g("PARAM_WIFI_MAC", 39, "A028");

    /* renamed from: P, reason: collision with root package name */
    public static final g f10732P = new g("PARAM_WIFI_BSSID", 40, "A029");

    /* renamed from: Q, reason: collision with root package name */
    public static final g f10735Q = new g("PARAM_WIFI_SSID", 41, "A030");

    /* renamed from: R, reason: collision with root package name */
    public static final g f10738R = new g("PARAM_WIFI_NETWORK_ID", 42, "A031");

    /* renamed from: S, reason: collision with root package name */
    public static final g f10741S = new g("PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED", 43, "A032");

    /* renamed from: T, reason: collision with root package name */
    public static final g f10744T = new g("PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED", 44, "A033");

    /* renamed from: U, reason: collision with root package name */
    public static final g f10747U = new g("PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED", 45, "A034");

    /* renamed from: V, reason: collision with root package name */
    public static final g f10750V = new g("PARAM_WIFI_IS_P2P_SUPPORTED", 46, "A035");

    /* renamed from: W, reason: collision with root package name */
    public static final g f10753W = new g("PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED", 47, "A036");

    /* renamed from: X, reason: collision with root package name */
    public static final g f10756X = new g("PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE", 48, "A037");

    /* renamed from: Y, reason: collision with root package name */
    public static final g f10759Y = new g("PARAM_WIFI_IS_TDLS_SUPPORTED", 49, "A038");

    /* renamed from: Z, reason: collision with root package name */
    public static final g f10762Z = new g("PARAM_BLUETOOTH_ADDRESS", 50, "A039");

    /* renamed from: p0, reason: collision with root package name */
    public static final g f10805p0 = new g("PARAM_BLUETOOTH_BONDED_DEVICE", 51, "A040");

    /* renamed from: q0, reason: collision with root package name */
    public static final g f10808q0 = new g("PARAM_BLUETOOTH_IS_ENABLED", 52, "A041");

    /* renamed from: r0, reason: collision with root package name */
    public static final g f10811r0 = new g("PARAM_BUILD_BOARD", 53, "A042");

    /* renamed from: s0, reason: collision with root package name */
    public static final g f10814s0 = new g("PARAM_BUILD_BOOTLOADER", 54, "A043");

    /* renamed from: t0, reason: collision with root package name */
    public static final g f10817t0 = new g("PARAM_BUILD_BRAND", 55, "A044");

    /* renamed from: u0, reason: collision with root package name */
    public static final g f10820u0 = new g("PARAM_BUILD_DEVICE", 56, "A045");

    /* renamed from: v0, reason: collision with root package name */
    public static final g f10823v0 = new g("PARAM_BUILD_DISPLAY", 57, "A046");

    /* renamed from: w0, reason: collision with root package name */
    public static final g f10826w0 = new g("PARAM_BUILD_FINGERPRINT", 58, "A047");

    /* renamed from: x0, reason: collision with root package name */
    public static final g f10829x0 = new g("PARAM_BUILD_HARDWARE", 59, "A048");

    /* renamed from: y0, reason: collision with root package name */
    public static final g f10832y0 = new g("PARAM_BUILD_ID", 60, "A049");

    /* renamed from: z0, reason: collision with root package name */
    public static final g f10835z0 = new g("PARAM_BUILD_MANUFACTURER", 61, "A050");

    /* renamed from: A0, reason: collision with root package name */
    public static final g f10688A0 = new g("PARAM_BUILD_PRODUCT", 62, "A051");

    /* renamed from: B0, reason: collision with root package name */
    public static final g f10691B0 = new g("PARAM_BUILD_RADIO", 63, "A052");

    /* renamed from: C0, reason: collision with root package name */
    public static final g f10694C0 = new g("PARAM_BUILD_SERIAL", 64, "A053");

    /* renamed from: D0, reason: collision with root package name */
    public static final g f10697D0 = new g("PARAM_BUILD_SUPPORTED_32_BIT_ABIS", 65, "A054");

    /* renamed from: E0, reason: collision with root package name */
    public static final g f10700E0 = new g("PARAM_BUILD_SUPPORTED_64_BIT_ABIS", 66, "A055");

    /* renamed from: F0, reason: collision with root package name */
    public static final g f10703F0 = new g("PARAM_BUILD_TAGS", 67, "A056");

    /* renamed from: G0, reason: collision with root package name */
    public static final g f10706G0 = new g("PARAM_BUILD_TIME", 68, "A057");

    /* renamed from: H0, reason: collision with root package name */
    public static final g f10709H0 = new g("PARAM_BUILD_TYPE", 69, "A058");

    /* renamed from: I0, reason: collision with root package name */
    public static final g f10712I0 = new g("PARAM_BUILD_USER", 70, "A059");

    /* renamed from: J0, reason: collision with root package name */
    public static final g f10715J0 = new g("PARAM_BUILD_VERSION_CODENAME", 71, "A060");

    /* renamed from: K0, reason: collision with root package name */
    public static final g f10718K0 = new g("PARAM_BUILD_VERSION_INCREMENTAL", 72, "A061");

    /* renamed from: L0, reason: collision with root package name */
    public static final g f10721L0 = new g("PARAM_BUILD_VERSION_PREVIEW_SDK_INT", 73, "A062");

    /* renamed from: M0, reason: collision with root package name */
    public static final g f10724M0 = new g("PARAM_BUILD_VERSION_SDK_INT", 74, "A063");

    /* renamed from: N0, reason: collision with root package name */
    public static final g f10727N0 = new g("PARAM_BUILD_VERSION_SECURITY_PATCH", 75, "A064");

    /* renamed from: O0, reason: collision with root package name */
    public static final g f10730O0 = new g("PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED", 76, "A065");

    /* renamed from: P0, reason: collision with root package name */
    public static final g f10733P0 = new g("PARAM_SECURE_ACCESSIBILITY_ENABLED", 77, "A066");

    /* renamed from: Q0, reason: collision with root package name */
    public static final g f10736Q0 = new g("PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD", 78, "A067");

    /* renamed from: R0, reason: collision with root package name */
    public static final g f10739R0 = new g("PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS", 79, "A068");

    /* renamed from: S0, reason: collision with root package name */
    public static final g f10742S0 = new g("PARAM_SECURE_ANDROID_ID", 80, "A069");

    /* renamed from: T0, reason: collision with root package name */
    public static final g f10745T0 = new g("PARAM_SECURE_DATA_ROAMING", 81, "A070");

    /* renamed from: U0, reason: collision with root package name */
    public static final g f10748U0 = new g("PARAM_SECURE_DEFAULT_INPUT_METHOD", 82, "A071");

    /* renamed from: V0, reason: collision with root package name */
    public static final g f10751V0 = new g("PARAM_SECURE_DEVICE_PROVISIONED", 83, "A072");

    /* renamed from: W0, reason: collision with root package name */
    public static final g f10754W0 = new g("PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES", 84, "A073");

    /* renamed from: X0, reason: collision with root package name */
    public static final g f10757X0 = new g("PARAM_SECURE_ENABLED_INPUT_METHODS", 85, "A074");

    /* renamed from: Y0, reason: collision with root package name */
    public static final g f10760Y0 = new g("PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY", 86, "A075");

    /* renamed from: Z0, reason: collision with root package name */
    public static final g f10763Z0 = new g("PARAM_SECURE_INSTALL_NON_MARKET_APPS", 87, "A076");

    /* renamed from: a1, reason: collision with root package name */
    public static final g f10765a1 = new g("PARAM_SECURE_LOCATION_MODE", 88, "A077");

    /* renamed from: b1, reason: collision with root package name */
    public static final g f10768b1 = new g("PARAM_SECURE_SKIP_FIRST_USE_HINTS", 89, "A078");

    /* renamed from: c1, reason: collision with root package name */
    public static final g f10771c1 = new g("PARAM_SECURE_SYS_PROP_SETTING_VERSION", 90, "A079");

    /* renamed from: d1, reason: collision with root package name */
    public static final g f10774d1 = new g("PARAM_SECURE_TTS_DEFAULT_PITCH", 91, "A080");

    /* renamed from: e1, reason: collision with root package name */
    public static final g f10777e1 = new g("PARAM_SECURE_TTS_DEFAULT_RATE", 92, "A081");

    /* renamed from: f1, reason: collision with root package name */
    public static final g f10780f1 = new g("PARAM_SECURE_TTS_DEFAULT_SYNTH", 93, "A082");

    /* renamed from: g1, reason: collision with root package name */
    public static final g f10783g1 = new g("PARAM_SECURE_TTS_ENABLED_PLUGINS", 94, "A083");

    /* renamed from: h1, reason: collision with root package name */
    public static final g f10786h1 = new g("PARAM_GLOBAL_ADB_ENABLED", 95, "A084");

    /* renamed from: i1, reason: collision with root package name */
    public static final g f10789i1 = new g("PARAM_GLOBAL_AIRPLANE_MODE_RADIOS", 96, "A085");

    /* renamed from: j1, reason: collision with root package name */
    public static final g f10792j1 = new g("PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES", 97, "A086");

    /* renamed from: k1, reason: collision with root package name */
    public static final g f10795k1 = new g("PARAM_GLOBAL_ANIMATOR_DURATION_SCALE", 98, "A087");

    /* renamed from: l1, reason: collision with root package name */
    public static final g f10797l1 = new g("PARAM_GLOBAL_AUTO_TIME", 99, "A088");

    /* renamed from: m1, reason: collision with root package name */
    public static final g f10799m1 = new g("PARAM_GLOBAL_AUTO_TIME_ZONE", 100, "A089");

    /* renamed from: n1, reason: collision with root package name */
    public static final g f10801n1 = new g("PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED", 101, "A090");

    /* renamed from: o1, reason: collision with root package name */
    public static final g f10803o1 = new g("PARAM_GLOBAL_HTTP_PROXY", 102, "A091");

    /* renamed from: p1, reason: collision with root package name */
    public static final g f10806p1 = new g("PARAM_GLOBAL_NETWORK_PREFERENCE", 103, "A092");

    /* renamed from: q1, reason: collision with root package name */
    public static final g f10809q1 = new g("PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN", 104, "A093");

    /* renamed from: r1, reason: collision with root package name */
    public static final g f10812r1 = new g("PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE", 105, "A094");

    /* renamed from: s1, reason: collision with root package name */
    public static final g f10815s1 = new g("PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED", 106, "A095");

    /* renamed from: t1, reason: collision with root package name */
    public static final g f10818t1 = new g("PARAM_GLOBAL_USE_GOOGLE_MAIL", 107, "A096");

    /* renamed from: u1, reason: collision with root package name */
    public static final g f10821u1 = new g("PARAM_GLOBAL_WAIT_FOR_DEBUGGER", 108, "A097");

    /* renamed from: v1, reason: collision with root package name */
    public static final g f10824v1 = new g("PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON", 109, "A098");

    /* renamed from: w1, reason: collision with root package name */
    public static final g f10827w1 = new g("PARAM_SYSTEM_ACCELEROMETER_ROTATION", 110, "A099");

    /* renamed from: x1, reason: collision with root package name */
    public static final g f10830x1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY", 111, "A100");

    /* renamed from: y1, reason: collision with root package name */
    public static final g f10833y1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT", 112, "A101");

    /* renamed from: z1, reason: collision with root package name */
    public static final g f10836z1 = new g("PARAM_SYSTEM_DATE_FORMAT", 113, "A102");

    /* renamed from: A1, reason: collision with root package name */
    public static final g f10689A1 = new g("PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING", 114, "A103");

    /* renamed from: B1, reason: collision with root package name */
    public static final g f10692B1 = new g("PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING", 115, "A104");

    /* renamed from: C1, reason: collision with root package name */
    public static final g f10695C1 = new g("PARAM_SYSTEM_END_BUTTON_BEHAVIOR", 116, "A105");

    /* renamed from: D1, reason: collision with root package name */
    public static final g f10698D1 = new g("PARAM_SYSTEM_FONT_SCALE", 117, "A106");

    /* renamed from: E1, reason: collision with root package name */
    public static final g f10701E1 = new g("PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED", 118, "A107");

    /* renamed from: F1, reason: collision with root package name */
    public static final g f10704F1 = new g("PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED", 119, "A108");

    /* renamed from: G1, reason: collision with root package name */
    public static final g f10707G1 = new g("PARAM_SYSTEM_NOTIFICATION_SOUND", 120, "A109");

    /* renamed from: H1, reason: collision with root package name */
    public static final g f10710H1 = new g("PARAM_SYSTEM_MUTE_STREAMS_AFFECTED", 121, "A110");

    /* renamed from: I1, reason: collision with root package name */
    public static final g f10713I1 = new g("PARAM_SYSTEM_RINGTONE", 122, "A111");

    /* renamed from: J1, reason: collision with root package name */
    public static final g f10716J1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS", 123, "A112");

    /* renamed from: K1, reason: collision with root package name */
    public static final g f10719K1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE", 124, "A113");

    /* renamed from: L1, reason: collision with root package name */
    public static final g f10722L1 = new g("PARAM_SYSTEM_SCREEN_OFF_TIMEOUT", 125, "A114");

    /* renamed from: M1, reason: collision with root package name */
    public static final g f10725M1 = new g("PARAM_SYSTEM_SOUND_EFFECTS_ENABLED", 126, "A115");

    /* renamed from: N1, reason: collision with root package name */
    public static final g f10728N1 = new g("PARAM_SYSTEM_TEXT_AUTO_CAPS", 127, "A116");

    /* renamed from: O1, reason: collision with root package name */
    public static final g f10731O1 = new g("PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE", 128, "A117");

    /* renamed from: P1, reason: collision with root package name */
    public static final g f10734P1 = new g("PARAM_SYSTEM_TEXT_AUTO_REPLACE", TsExtractor.TS_STREAM_TYPE_AC3, "A118");

    /* renamed from: Q1, reason: collision with root package name */
    public static final g f10737Q1 = new g("PARAM_SYSTEM_TEXT_SHOW_PASSWORD", TsExtractor.TS_STREAM_TYPE_HDMV_DTS, "A119");

    /* renamed from: R1, reason: collision with root package name */
    public static final g f10740R1 = new g("PARAM_SYSTEM_TIME_12_24", 131, "A120");

    /* renamed from: S1, reason: collision with root package name */
    public static final g f10743S1 = new g("PARAM_SYSTEM_USER_ROTATION", 132, "A121");

    /* renamed from: T1, reason: collision with root package name */
    public static final g f10746T1 = new g("PARAM_SYSTEM_VIBRATE_ON", 133, "A122");

    /* renamed from: U1, reason: collision with root package name */
    public static final g f10749U1 = new g("PARAM_SYSTEM_VIBRATE_WHEN_RINGING", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "A123");

    /* renamed from: V1, reason: collision with root package name */
    public static final g f10752V1 = new g("PARAM_PACKAGE_IS_SAFE_MODE", TsExtractor.TS_STREAM_TYPE_E_AC3, "A124");

    /* renamed from: W1, reason: collision with root package name */
    public static final g f10755W1 = new g("PARAM_PACKAGE_GET_INSTALLED_APPS", 136, "A125");

    /* renamed from: X1, reason: collision with root package name */
    public static final g f10758X1 = new g("PARAM_PACKAGE_INSTALLER_PACKAGE_NAME", 137, "A126");

    /* renamed from: Y1, reason: collision with root package name */
    public static final g f10761Y1 = new g("PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES", TsExtractor.TS_STREAM_TYPE_DTS, "A127");

    /* renamed from: Z1, reason: collision with root package name */
    public static final g f10764Z1 = new g("PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES", 139, "A128");

    /* renamed from: a2, reason: collision with root package name */
    public static final g f10766a2 = new g("PARAM_ENV_EXTERNAL_STORAGE_STATE", 140, "A129");

    /* renamed from: b2, reason: collision with root package name */
    public static final g f10769b2 = new g("PARAM_LOCALE_AVAILABLE_LOCALES", 141, "A130");

    /* renamed from: c2, reason: collision with root package name */
    public static final g f10772c2 = new g("PARAM_DISPLAY_DENSITY", 142, "A131");

    /* renamed from: d2, reason: collision with root package name */
    public static final g f10775d2 = new g("PARAM_DISPLAY_DENSITY_DPI", 143, "A132");

    /* renamed from: e2, reason: collision with root package name */
    public static final g f10778e2 = new g("PARAM_DISPLAY_SCALED_DENSITY", 144, "A133");

    /* renamed from: f2, reason: collision with root package name */
    public static final g f10781f2 = new g("PARAM_DISPLAY_XDPI", 145, "A134");

    /* renamed from: g2, reason: collision with root package name */
    public static final g f10784g2 = new g("PARAM_DISPLAY_YDPI", 146, "A135");

    /* renamed from: h2, reason: collision with root package name */
    public static final g f10787h2 = new g("PARAM_STAT_FS_TOTAL_BYTES", 147, "A136");

    static {
        g[] a8 = a();
        f10790i2 = a8;
        f10793j2 = U5.b.a(a8);
    }

    private g(String str, int i8, String str2) {
        this.f10837a = str2;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f10767b, f10770c, f10773d, f10776e, f10779f, f10782g, f10785h, f10788i, f10791j, f10794k, f10796l, f10798m, f10800n, f10802o, f10804p, f10807q, f10810r, f10813s, f10816t, f10819u, f10822v, f10825w, f10828x, f10831y, f10834z, f10687A, f10690B, f10693C, f10696D, f10699E, f10702F, f10705G, f10708H, f10711I, f10714J, f10717K, f10720L, f10723M, f10726N, f10729O, f10732P, f10735Q, f10738R, f10741S, f10744T, f10747U, f10750V, f10753W, f10756X, f10759Y, f10762Z, f10805p0, f10808q0, f10811r0, f10814s0, f10817t0, f10820u0, f10823v0, f10826w0, f10829x0, f10832y0, f10835z0, f10688A0, f10691B0, f10694C0, f10697D0, f10700E0, f10703F0, f10706G0, f10709H0, f10712I0, f10715J0, f10718K0, f10721L0, f10724M0, f10727N0, f10730O0, f10733P0, f10736Q0, f10739R0, f10742S0, f10745T0, f10748U0, f10751V0, f10754W0, f10757X0, f10760Y0, f10763Z0, f10765a1, f10768b1, f10771c1, f10774d1, f10777e1, f10780f1, f10783g1, f10786h1, f10789i1, f10792j1, f10795k1, f10797l1, f10799m1, f10801n1, f10803o1, f10806p1, f10809q1, f10812r1, f10815s1, f10818t1, f10821u1, f10824v1, f10827w1, f10830x1, f10833y1, f10836z1, f10689A1, f10692B1, f10695C1, f10698D1, f10701E1, f10704F1, f10707G1, f10710H1, f10713I1, f10716J1, f10719K1, f10722L1, f10725M1, f10728N1, f10731O1, f10734P1, f10737Q1, f10740R1, f10743S1, f10746T1, f10749U1, f10752V1, f10755W1, f10758X1, f10761Y1, f10764Z1, f10766a2, f10769b2, f10772c2, f10775d2, f10778e2, f10781f2, f10784g2, f10787h2};
    }

    public static U5.a b() {
        return f10793j2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f10790i2.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f10837a;
    }
}
