package n3;

import A2.InterfaceC0943a;
import O5.r;
import O5.x;
import P5.Q;
import P5.a0;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import n3.InterfaceC3474d;
import w2.AbstractC4144k;
import z4.AbstractC4229b;

/* loaded from: classes4.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35386a = a.f35387a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35387a = new a();

        private a() {
        }

        public static /* synthetic */ i b(a aVar, Context context, Set set, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                set = a0.f();
            }
            return aVar.a(context, set);
        }

        public final i a(Context context, Set productUsage) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(productUsage, "productUsage");
            InterfaceC3474d.a a8 = AbstractC3472b.a();
            Context applicationContext = context.getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            return a8.a(applicationContext).b(productUsage).build().a();
        }

        public final Map c(Throwable error) {
            AbstractC3255y.i(error, "error");
            if (error instanceof AbstractC4144k) {
                return d((AbstractC4144k) error);
            }
            return d(AbstractC4144k.f40356e.b(error));
        }

        public final Map d(AbstractC4144k stripeException) {
            Integer valueOf;
            String str;
            String str2;
            AbstractC3255y.i(stripeException, "stripeException");
            String str3 = null;
            if (stripeException.c() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(stripeException.c());
            }
            r a8 = x.a("analytics_value", stripeException.a());
            if (valueOf != null) {
                str = valueOf.toString();
            } else {
                str = null;
            }
            r a9 = x.a("status_code", str);
            r a10 = x.a("request_id", stripeException.b());
            u2.f d8 = stripeException.d();
            if (d8 != null) {
                str2 = d8.getType();
            } else {
                str2 = null;
            }
            r a11 = x.a("error_type", str2);
            u2.f d9 = stripeException.d();
            if (d9 != null) {
                str3 = d9.o();
            }
            return AbstractC4229b.a(Q.k(a8, a9, a10, a11, x.a("error_code", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ void a(i iVar, c cVar, AbstractC4144k abstractC4144k, Map map, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    abstractC4144k = null;
                }
                if ((i8 & 4) != 0) {
                    map = Q.h();
                }
                iVar.a(cVar, abstractC4144k, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends InterfaceC0943a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final d f35388b = new d("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");

        /* renamed from: c, reason: collision with root package name */
        public static final d f35389c = new d("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");

        /* renamed from: d, reason: collision with root package name */
        public static final d f35390d = new d("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");

        /* renamed from: e, reason: collision with root package name */
        public static final d f35391e = new d("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 3, "elements.customer_sheet.elements_session.load_failure");

        /* renamed from: f, reason: collision with root package name */
        public static final d f35392f = new d("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 4, "elements.customer_sheet.payment_methods.load_failure");

        /* renamed from: g, reason: collision with root package name */
        public static final d f35393g = new d("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 5, "elements.customer_sheet.customer_adapter.not_found");

        /* renamed from: h, reason: collision with root package name */
        public static final d f35394h = new d("PLACES_FIND_AUTOCOMPLETE_ERROR", 6, "address_element.find_autocomplete.error");

        /* renamed from: i, reason: collision with root package name */
        public static final d f35395i = new d("PLACES_FETCH_PLACE_ERROR", 7, "address_element.fetch_place.error");

        /* renamed from: j, reason: collision with root package name */
        public static final d f35396j = new d("LINK_CREATE_CARD_FAILURE", 8, "link.create_new_card.create_payment_details_failure");

        /* renamed from: k, reason: collision with root package name */
        public static final d f35397k = new d("LINK_SHARE_CARD_FAILURE", 9, "link.create_new_card.share_payment_details_failure");

        /* renamed from: l, reason: collision with root package name */
        public static final d f35398l = new d("LINK_LOG_OUT_FAILURE", 10, "link.log_out.failure");

        /* renamed from: m, reason: collision with root package name */
        public static final d f35399m = new d("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 11, "payments.paymentlauncherconfirmation.null_args");

        /* renamed from: n, reason: collision with root package name */
        public static final d f35400n = new d("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 12, "payments.browserlauncher.activity_not_found");

        /* renamed from: o, reason: collision with root package name */
        public static final d f35401o = new d("BROWSER_LAUNCHER_NULL_ARGS", 13, "payments.browserlauncher.null_args");

        /* renamed from: p, reason: collision with root package name */
        public static final d f35402p = new d("GOOGLE_PAY_FAILED", 14, "google_pay.confirm.error");

        /* renamed from: q, reason: collision with root package name */
        public static final d f35403q = new d("FRAUD_DETECTION_API_FAILURE", 15, "fraud_detection_data_repository.api_failure");

        /* renamed from: r, reason: collision with root package name */
        public static final d f35404r = new d("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 16, "paymentsheet.external_payment_method.confirm_handler_is_null");

        /* renamed from: s, reason: collision with root package name */
        public static final d f35405s = new d("EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", 17, "paymentsheet.external_payment_method.launcher_is_null");

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ d[] f35406t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ U5.a f35407u;

        /* renamed from: a, reason: collision with root package name */
        private final String f35408a;

        static {
            d[] b8 = b();
            f35406t = b8;
            f35407u = U5.b.a(b8);
        }

        private d(String str, int i8, String str2) {
            this.f35408a = str2;
        }

        private static final /* synthetic */ d[] b() {
            return new d[]{f35388b, f35389c, f35390d, f35391e, f35392f, f35393g, f35394h, f35395i, f35396j, f35397k, f35398l, f35399m, f35400n, f35401o, f35402p, f35403q, f35404r, f35405s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f35406t.clone();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35408a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final e f35409b = new e("GET_SAVED_PAYMENT_METHODS_SUCCESS", 0, "elements.customer_repository.get_saved_payment_methods_success");

        /* renamed from: c, reason: collision with root package name */
        public static final e f35410c = new e("PLACES_FIND_AUTOCOMPLETE_SUCCESS", 1, "address_element.find_autocomplete.success");

        /* renamed from: d, reason: collision with root package name */
        public static final e f35411d = new e("PLACES_FETCH_PLACE_SUCCESS", 2, "address_element.fetch_place.success");

        /* renamed from: e, reason: collision with root package name */
        public static final e f35412e = new e("LINK_CREATE_CARD_SUCCESS", 3, "link.create_new_card.success");

        /* renamed from: f, reason: collision with root package name */
        public static final e f35413f = new e("LINK_LOG_OUT_SUCCESS", 4, "link.log_out.success");

        /* renamed from: g, reason: collision with root package name */
        public static final e f35414g = new e("EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", 5, "paymentsheet.external_payment_method.launch_success");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ e[] f35415h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ U5.a f35416i;

        /* renamed from: a, reason: collision with root package name */
        private final String f35417a;

        static {
            e[] b8 = b();
            f35415h = b8;
            f35416i = U5.b.a(b8);
        }

        private e(String str, int i8, String str2) {
            this.f35417a = str2;
        }

        private static final /* synthetic */ e[] b() {
            return new e[]{f35409b, f35410c, f35411d, f35412e, f35413f, f35414g};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f35415h.clone();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35417a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class f implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final f f35418b = new f("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");

        /* renamed from: c, reason: collision with root package name */
        public static final f f35419c = new f("MISSING_CARDSCAN_DEPENDENCY", 1, "cardscan.missing_dependency");

        /* renamed from: d, reason: collision with root package name */
        public static final f f35420d = new f("MISSING_HOSTED_VOUCHER_URL", 2, "payments.missing_hosted_voucher_url");

        /* renamed from: e, reason: collision with root package name */
        public static final f f35421e = new f("MISSING_POLLING_AUTHENTICATOR", 3, "payments.missing_polling_authenticator");

        /* renamed from: f, reason: collision with root package name */
        public static final f f35422f = new f("LINK_INVALID_SESSION_STATE", 4, "link.signup.failure.invalidSessionState");

        /* renamed from: g, reason: collision with root package name */
        public static final f f35423g = new f("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 5, "google_pay.confirm.unexpected_result");

        /* renamed from: h, reason: collision with root package name */
        public static final f f35424h = new f("GOOGLE_PAY_MISSING_INTENT_DATA", 6, "google_pay.on_result.missing_data");

        /* renamed from: i, reason: collision with root package name */
        public static final f f35425i = new f("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 7, "address_element.find_autocomplete.without_dependency");

        /* renamed from: j, reason: collision with root package name */
        public static final f f35426j = new f("FETCH_PLACE_WITHOUT_DEPENDENCY", 8, "address_element.fetch_place.without_dependency");

        /* renamed from: k, reason: collision with root package name */
        public static final f f35427k = new f("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 9, "link.create_new_card.missing_link_account");

        /* renamed from: l, reason: collision with root package name */
        public static final f f35428l = new f("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 10, "paymentsheet.authenticators.not_found");

        /* renamed from: m, reason: collision with root package name */
        public static final f f35429m = new f("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 11, "paymentsheet.loader.elements_session.customer.not_found");

        /* renamed from: n, reason: collision with root package name */
        public static final f f35430n = new f("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 12, "elements.external_payment_methods_serializer.error");

        /* renamed from: o, reason: collision with root package name */
        public static final f f35431o = new f("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 13, "paymentsheet.no_payment_selection");

        /* renamed from: p, reason: collision with root package name */
        public static final f f35432p = new f("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 14, "paymentsheet.invalid_payment_selection");

        /* renamed from: q, reason: collision with root package name */
        public static final f f35433q = new f("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 15, "flow_controller.invalid_payment_selection");

        /* renamed from: r, reason: collision with root package name */
        public static final f f35434r = new f("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 16, "intent_confirmation_handler.invalid_payment_confirmation_option");

        /* renamed from: s, reason: collision with root package name */
        public static final f f35435s = new f("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 17, "paymentsheet.external_payment_method.unexpected_result_code");

        /* renamed from: t, reason: collision with root package name */
        public static final f f35436t = new f("CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", 18, "payments.cvc_recollection_unexpected_payment_selection");

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ f[] f35437u;

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ U5.a f35438v;

        /* renamed from: a, reason: collision with root package name */
        private final String f35439a;

        static {
            f[] b8 = b();
            f35437u = b8;
            f35438v = U5.b.a(b8);
        }

        private f(String str, int i8, String str2) {
            this.f35439a = str2;
        }

        private static final /* synthetic */ f[] b() {
            return new f[]{f35418b, f35419c, f35420d, f35421e, f35422f, f35423g, f35424h, f35425i, f35426j, f35427k, f35428l, f35429m, f35430n, f35431o, f35432p, f35433q, f35434r, f35435s, f35436t};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f35437u.clone();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return "unexpected_error." + this.f35439a;
        }
    }

    void a(c cVar, AbstractC4144k abstractC4144k, Map map);
}
