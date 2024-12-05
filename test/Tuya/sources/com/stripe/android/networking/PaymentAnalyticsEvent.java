package com.stripe.android.networking;

import R5.b;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3151p;
import x2.InterfaceC3871a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaymentAnalyticsEvent implements InterfaceC3871a {

    /* renamed from: E0, reason: collision with root package name */
    private static final /* synthetic */ PaymentAnalyticsEvent[] f24815E0;

    /* renamed from: F0, reason: collision with root package name */
    private static final /* synthetic */ R5.a f24817F0;

    /* renamed from: b, reason: collision with root package name */
    private static final a f24838b;

    /* renamed from: a, reason: collision with root package name */
    private final String f24874a;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24839c = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24840d = new PaymentAnalyticsEvent("PaymentMethodCreate", 1, "payment_method_creation");

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24841e = new PaymentAnalyticsEvent("PaymentMethodUpdate", 2, "payment_method_update");

    /* renamed from: f, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24842f = new PaymentAnalyticsEvent("CustomerRetrieve", 3, "retrieve_customer");

    /* renamed from: g, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24843g = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 4, "retrieve_payment_methods");

    /* renamed from: h, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24844h = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 5, "attach_payment_method");

    /* renamed from: i, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24845i = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 6, "detach_payment_method");

    /* renamed from: j, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24846j = new PaymentAnalyticsEvent("CustomerDeleteSource", 7, "delete_source");

    /* renamed from: k, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24847k = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 8, "set_shipping_info");

    /* renamed from: l, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24848l = new PaymentAnalyticsEvent("CustomerAddSource", 9, "add_source");

    /* renamed from: m, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24849m = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 10, "default_source");

    /* renamed from: n, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24850n = new PaymentAnalyticsEvent("IssuingRetrievePin", 11, "issuing_retrieve_pin");

    /* renamed from: o, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24851o = new PaymentAnalyticsEvent("IssuingUpdatePin", 12, "issuing_update_pin");

    /* renamed from: p, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24852p = new PaymentAnalyticsEvent("SourceCreate", 13, "source_creation");

    /* renamed from: q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24854q = new PaymentAnalyticsEvent("SourceRetrieve", 14, "retrieve_source");

    /* renamed from: r, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24856r = new PaymentAnalyticsEvent("PaymentIntentConfirm", 15, "payment_intent_confirmation");

    /* renamed from: s, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24858s = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 16, "payment_intent_retrieval");

    /* renamed from: t, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24860t = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 17, "payment_intent_retrieval_ordered");

    /* renamed from: u, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24862u = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 18, "payment_intent_cancel_source");

    /* renamed from: v, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24864v = new PaymentAnalyticsEvent("PaymentIntentRefresh", 19, "payment_intent_refresh");

    /* renamed from: w, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24866w = new PaymentAnalyticsEvent("SetupIntentConfirm", 20, "setup_intent_confirmation");

    /* renamed from: x, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24868x = new PaymentAnalyticsEvent("SetupIntentRetrieve", 21, "setup_intent_retrieval");

    /* renamed from: y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24870y = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 22, "setup_intent_retrieval_ordered");

    /* renamed from: z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24872z = new PaymentAnalyticsEvent("SetupIntentCancelSource", 23, "setup_intent_cancel_source");

    /* renamed from: A, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24806A = new PaymentAnalyticsEvent("SetupIntentRefresh", 24, "setup_intent_refresh");

    /* renamed from: B, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24808B = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 25, "paymenthandler.confirm.started");

    /* renamed from: C, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24810C = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 26, "paymenthandler.confirm.finished");

    /* renamed from: D, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24812D = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 27, "paymenthandler.handle_next_action.started");

    /* renamed from: E, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24814E = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 28, "paymenthandler.handle_next_action.finished");

    /* renamed from: F, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24816F = new PaymentAnalyticsEvent("FileCreate", 29, "create_file");

    /* renamed from: G, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24818G = new PaymentAnalyticsEvent("Auth3ds1Sdk", 30, "3ds1_sdk");

    /* renamed from: H, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24819H = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 31, "3ds1_challenge_start");

    /* renamed from: I, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24820I = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 32, "3ds1_challenge_error");

    /* renamed from: J, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24821J = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 33, "3ds1_challenge_complete");

    /* renamed from: K, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24822K = new PaymentAnalyticsEvent("AuthWithWebView", 34, "auth_with_webview");

    /* renamed from: L, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24823L = new PaymentAnalyticsEvent("AuthWithCustomTabs", 35, "auth_with_customtabs");

    /* renamed from: M, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24824M = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 36, "auth_with_defaultbrowser");

    /* renamed from: N, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24825N = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 37, "confirm_returnurl_null");

    /* renamed from: O, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24826O = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 38, "confirm_returnurl_default");

    /* renamed from: P, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24827P = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 39, "confirm_returnurl_custom");

    /* renamed from: Q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24828Q = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 40, "retrieve_fpx_bank_statuses");

    /* renamed from: R, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24829R = new PaymentAnalyticsEvent("StripeUrlRetrieve", 41, "retrieve_stripe_url");

    /* renamed from: S, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24830S = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 42, "3ds2_authentication_request_params_failed");

    /* renamed from: T, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24831T = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 43, "3ds2_fingerprint");

    /* renamed from: U, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24832U = new PaymentAnalyticsEvent("Auth3ds2Start", 44, "3ds2_authenticate");

    /* renamed from: V, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24833V = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 45, "3ds2_frictionless_flow");

    /* renamed from: W, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24834W = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 46, "3ds2_challenge_flow_presented");

    /* renamed from: X, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24835X = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 47, "3ds2_challenge_flow_canceled");

    /* renamed from: Y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24836Y = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 48, "3ds2_challenge_flow_completed");

    /* renamed from: Z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24837Z = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 49, "3ds2_challenge_flow_errored");

    /* renamed from: p0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24853p0 = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 50, "3ds2_challenge_flow_timed_out");

    /* renamed from: q0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24855q0 = new PaymentAnalyticsEvent("Auth3ds2Fallback", 51, "3ds2_fallback");

    /* renamed from: r0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24857r0 = new PaymentAnalyticsEvent("AuthRedirect", 52, "url_redirect_next_action");

    /* renamed from: s0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24859s0 = new PaymentAnalyticsEvent("AuthError", 53, "auth_error");

    /* renamed from: t0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24861t0 = new PaymentAnalyticsEvent("AuthSourceStart", 54, "auth_source_start");

    /* renamed from: u0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24863u0 = new PaymentAnalyticsEvent("AuthSourceRedirect", 55, "auth_source_redirect");

    /* renamed from: v0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24865v0 = new PaymentAnalyticsEvent("AuthSourceResult", 56, "auth_source_result");

    /* renamed from: w0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24867w0 = new PaymentAnalyticsEvent("RadarSessionCreate", 57, "radar_session_create");

    /* renamed from: x0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24869x0 = new PaymentAnalyticsEvent("GooglePayLauncherInit", 58, "googlepaylauncher_init");

    /* renamed from: y0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24871y0 = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 59, "googlepaypaymentmethodlauncher_init");

    /* renamed from: z0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24873z0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 60, "card_metadata_pk_available");

    /* renamed from: A0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24807A0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 61, "card_metadata_pk_unavailable");

    /* renamed from: B0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24809B0 = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 62, "card_metadata_loaded_too_slow");

    /* renamed from: C0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24811C0 = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 63, "card_metadata_load_failure");

    /* renamed from: D0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24813D0 = new PaymentAnalyticsEvent("CardMetadataMissingRange", 64, "card_metadata_missing_range");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        PaymentAnalyticsEvent[] b8 = b();
        f24815E0 = b8;
        f24817F0 = b.a(b8);
        f24838b = new a(null);
    }

    private PaymentAnalyticsEvent(String str, int i8, String str2) {
        this.f24874a = str2;
    }

    private static final /* synthetic */ PaymentAnalyticsEvent[] b() {
        return new PaymentAnalyticsEvent[]{f24839c, f24840d, f24841e, f24842f, f24843g, f24844h, f24845i, f24846j, f24847k, f24848l, f24849m, f24850n, f24851o, f24852p, f24854q, f24856r, f24858s, f24860t, f24862u, f24864v, f24866w, f24868x, f24870y, f24872z, f24806A, f24808B, f24810C, f24812D, f24814E, f24816F, f24818G, f24819H, f24820I, f24821J, f24822K, f24823L, f24824M, f24825N, f24826O, f24827P, f24828Q, f24829R, f24830S, f24831T, f24832U, f24833V, f24834W, f24835X, f24836Y, f24837Z, f24853p0, f24855q0, f24857r0, f24859s0, f24861t0, f24863u0, f24865v0, f24867w0, f24869x0, f24871y0, f24873z0, f24807A0, f24809B0, f24811C0, f24813D0};
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) f24815E0.clone();
    }

    @Override // x2.InterfaceC3871a
    public String a() {
        return toString();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return "stripe_android." + this.f24874a;
    }
}
