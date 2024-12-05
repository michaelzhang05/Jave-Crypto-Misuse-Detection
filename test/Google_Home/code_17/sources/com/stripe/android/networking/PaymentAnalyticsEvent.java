package com.stripe.android.networking;

import A2.InterfaceC0943a;
import U5.b;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3247p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaymentAnalyticsEvent implements InterfaceC0943a {

    /* renamed from: E0, reason: collision with root package name */
    private static final /* synthetic */ PaymentAnalyticsEvent[] f25870E0;

    /* renamed from: F0, reason: collision with root package name */
    private static final /* synthetic */ U5.a f25872F0;

    /* renamed from: b, reason: collision with root package name */
    private static final a f25893b;

    /* renamed from: a, reason: collision with root package name */
    private final String f25929a;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25894c = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25895d = new PaymentAnalyticsEvent("PaymentMethodCreate", 1, "payment_method_creation");

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25896e = new PaymentAnalyticsEvent("PaymentMethodUpdate", 2, "payment_method_update");

    /* renamed from: f, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25897f = new PaymentAnalyticsEvent("CustomerRetrieve", 3, "retrieve_customer");

    /* renamed from: g, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25898g = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 4, "retrieve_payment_methods");

    /* renamed from: h, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25899h = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 5, "attach_payment_method");

    /* renamed from: i, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25900i = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 6, "detach_payment_method");

    /* renamed from: j, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25901j = new PaymentAnalyticsEvent("CustomerDeleteSource", 7, "delete_source");

    /* renamed from: k, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25902k = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 8, "set_shipping_info");

    /* renamed from: l, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25903l = new PaymentAnalyticsEvent("CustomerAddSource", 9, "add_source");

    /* renamed from: m, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25904m = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 10, "default_source");

    /* renamed from: n, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25905n = new PaymentAnalyticsEvent("IssuingRetrievePin", 11, "issuing_retrieve_pin");

    /* renamed from: o, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25906o = new PaymentAnalyticsEvent("IssuingUpdatePin", 12, "issuing_update_pin");

    /* renamed from: p, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25907p = new PaymentAnalyticsEvent("SourceCreate", 13, "source_creation");

    /* renamed from: q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25909q = new PaymentAnalyticsEvent("SourceRetrieve", 14, "retrieve_source");

    /* renamed from: r, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25911r = new PaymentAnalyticsEvent("PaymentIntentConfirm", 15, "payment_intent_confirmation");

    /* renamed from: s, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25913s = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 16, "payment_intent_retrieval");

    /* renamed from: t, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25915t = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 17, "payment_intent_retrieval_ordered");

    /* renamed from: u, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25917u = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 18, "payment_intent_cancel_source");

    /* renamed from: v, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25919v = new PaymentAnalyticsEvent("PaymentIntentRefresh", 19, "payment_intent_refresh");

    /* renamed from: w, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25921w = new PaymentAnalyticsEvent("SetupIntentConfirm", 20, "setup_intent_confirmation");

    /* renamed from: x, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25923x = new PaymentAnalyticsEvent("SetupIntentRetrieve", 21, "setup_intent_retrieval");

    /* renamed from: y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25925y = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 22, "setup_intent_retrieval_ordered");

    /* renamed from: z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25927z = new PaymentAnalyticsEvent("SetupIntentCancelSource", 23, "setup_intent_cancel_source");

    /* renamed from: A, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25861A = new PaymentAnalyticsEvent("SetupIntentRefresh", 24, "setup_intent_refresh");

    /* renamed from: B, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25863B = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 25, "paymenthandler.confirm.started");

    /* renamed from: C, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25865C = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 26, "paymenthandler.confirm.finished");

    /* renamed from: D, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25867D = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 27, "paymenthandler.handle_next_action.started");

    /* renamed from: E, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25869E = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 28, "paymenthandler.handle_next_action.finished");

    /* renamed from: F, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25871F = new PaymentAnalyticsEvent("FileCreate", 29, "create_file");

    /* renamed from: G, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25873G = new PaymentAnalyticsEvent("Auth3ds1Sdk", 30, "3ds1_sdk");

    /* renamed from: H, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25874H = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 31, "3ds1_challenge_start");

    /* renamed from: I, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25875I = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 32, "3ds1_challenge_error");

    /* renamed from: J, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25876J = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 33, "3ds1_challenge_complete");

    /* renamed from: K, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25877K = new PaymentAnalyticsEvent("AuthWithWebView", 34, "auth_with_webview");

    /* renamed from: L, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25878L = new PaymentAnalyticsEvent("AuthWithCustomTabs", 35, "auth_with_customtabs");

    /* renamed from: M, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25879M = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 36, "auth_with_defaultbrowser");

    /* renamed from: N, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25880N = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 37, "confirm_returnurl_null");

    /* renamed from: O, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25881O = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 38, "confirm_returnurl_default");

    /* renamed from: P, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25882P = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 39, "confirm_returnurl_custom");

    /* renamed from: Q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25883Q = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 40, "retrieve_fpx_bank_statuses");

    /* renamed from: R, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25884R = new PaymentAnalyticsEvent("StripeUrlRetrieve", 41, "retrieve_stripe_url");

    /* renamed from: S, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25885S = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 42, "3ds2_authentication_request_params_failed");

    /* renamed from: T, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25886T = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 43, "3ds2_fingerprint");

    /* renamed from: U, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25887U = new PaymentAnalyticsEvent("Auth3ds2Start", 44, "3ds2_authenticate");

    /* renamed from: V, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25888V = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 45, "3ds2_frictionless_flow");

    /* renamed from: W, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25889W = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 46, "3ds2_challenge_flow_presented");

    /* renamed from: X, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25890X = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 47, "3ds2_challenge_flow_canceled");

    /* renamed from: Y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25891Y = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 48, "3ds2_challenge_flow_completed");

    /* renamed from: Z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25892Z = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 49, "3ds2_challenge_flow_errored");

    /* renamed from: p0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25908p0 = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 50, "3ds2_challenge_flow_timed_out");

    /* renamed from: q0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25910q0 = new PaymentAnalyticsEvent("Auth3ds2Fallback", 51, "3ds2_fallback");

    /* renamed from: r0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25912r0 = new PaymentAnalyticsEvent("AuthRedirect", 52, "url_redirect_next_action");

    /* renamed from: s0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25914s0 = new PaymentAnalyticsEvent("AuthError", 53, "auth_error");

    /* renamed from: t0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25916t0 = new PaymentAnalyticsEvent("AuthSourceStart", 54, "auth_source_start");

    /* renamed from: u0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25918u0 = new PaymentAnalyticsEvent("AuthSourceRedirect", 55, "auth_source_redirect");

    /* renamed from: v0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25920v0 = new PaymentAnalyticsEvent("AuthSourceResult", 56, "auth_source_result");

    /* renamed from: w0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25922w0 = new PaymentAnalyticsEvent("RadarSessionCreate", 57, "radar_session_create");

    /* renamed from: x0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25924x0 = new PaymentAnalyticsEvent("GooglePayLauncherInit", 58, "googlepaylauncher_init");

    /* renamed from: y0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25926y0 = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 59, "googlepaypaymentmethodlauncher_init");

    /* renamed from: z0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25928z0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 60, "card_metadata_pk_available");

    /* renamed from: A0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25862A0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 61, "card_metadata_pk_unavailable");

    /* renamed from: B0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25864B0 = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 62, "card_metadata_loaded_too_slow");

    /* renamed from: C0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25866C0 = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 63, "card_metadata_load_failure");

    /* renamed from: D0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f25868D0 = new PaymentAnalyticsEvent("CardMetadataMissingRange", 64, "card_metadata_missing_range");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        PaymentAnalyticsEvent[] b8 = b();
        f25870E0 = b8;
        f25872F0 = b.a(b8);
        f25893b = new a(null);
    }

    private PaymentAnalyticsEvent(String str, int i8, String str2) {
        this.f25929a = str2;
    }

    private static final /* synthetic */ PaymentAnalyticsEvent[] b() {
        return new PaymentAnalyticsEvent[]{f25894c, f25895d, f25896e, f25897f, f25898g, f25899h, f25900i, f25901j, f25902k, f25903l, f25904m, f25905n, f25906o, f25907p, f25909q, f25911r, f25913s, f25915t, f25917u, f25919v, f25921w, f25923x, f25925y, f25927z, f25861A, f25863B, f25865C, f25867D, f25869E, f25871F, f25873G, f25874H, f25875I, f25876J, f25877K, f25878L, f25879M, f25880N, f25881O, f25882P, f25883Q, f25884R, f25885S, f25886T, f25887U, f25888V, f25889W, f25890X, f25891Y, f25892Z, f25908p0, f25910q0, f25912r0, f25914s0, f25916t0, f25918u0, f25920v0, f25922w0, f25924x0, f25926y0, f25928z0, f25862A0, f25864B0, f25866C0, f25868D0};
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) f25870E0.clone();
    }

    @Override // A2.InterfaceC0943a
    public String a() {
        return toString();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return "stripe_android." + this.f25929a;
    }
}
