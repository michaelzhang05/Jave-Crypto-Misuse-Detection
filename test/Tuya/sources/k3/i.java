package k3;

import L5.r;
import L5.x;
import M5.Q;
import M5.a0;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import k3.InterfaceC3119d;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;
import w4.AbstractC3849b;
import x2.InterfaceC3871a;

/* loaded from: classes4.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33394a = a.f33395a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33395a = new a();

        private a() {
        }

        public static /* synthetic */ i b(a aVar, Context context, Set set, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                set = a0.f();
            }
            return aVar.a(context, set);
        }

        public final i a(Context context, Set productUsage) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(productUsage, "productUsage");
            InterfaceC3119d.a a8 = AbstractC3117b.a();
            Context applicationContext = context.getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            return a8.a(applicationContext).b(productUsage).build().a();
        }

        public final Map c(Throwable error) {
            AbstractC3159y.i(error, "error");
            if (error instanceof AbstractC3790k) {
                return d((AbstractC3790k) error);
            }
            return d(AbstractC3790k.f38229e.b(error));
        }

        public final Map d(AbstractC3790k stripeException) {
            Integer valueOf;
            String str;
            String str2;
            AbstractC3159y.i(stripeException, "stripeException");
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
            r2.f d8 = stripeException.d();
            if (d8 != null) {
                str2 = d8.getType();
            } else {
                str2 = null;
            }
            r a11 = x.a("error_type", str2);
            r2.f d9 = stripeException.d();
            if (d9 != null) {
                str3 = d9.r();
            }
            return AbstractC3849b.a(Q.k(a8, a9, a10, a11, x.a("error_code", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ void a(i iVar, c cVar, AbstractC3790k abstractC3790k, Map map, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    abstractC3790k = null;
                }
                if ((i8 & 4) != 0) {
                    map = Q.h();
                }
                iVar.a(cVar, abstractC3790k, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends InterfaceC3871a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final d f33396b = new d("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");

        /* renamed from: c, reason: collision with root package name */
        public static final d f33397c = new d("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");

        /* renamed from: d, reason: collision with root package name */
        public static final d f33398d = new d("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");

        /* renamed from: e, reason: collision with root package name */
        public static final d f33399e = new d("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 3, "elements.customer_sheet.elements_session.load_failure");

        /* renamed from: f, reason: collision with root package name */
        public static final d f33400f = new d("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 4, "elements.customer_sheet.payment_methods.load_failure");

        /* renamed from: g, reason: collision with root package name */
        public static final d f33401g = new d("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 5, "elements.customer_sheet.customer_adapter.not_found");

        /* renamed from: h, reason: collision with root package name */
        public static final d f33402h = new d("PLACES_FIND_AUTOCOMPLETE_ERROR", 6, "address_element.find_autocomplete.error");

        /* renamed from: i, reason: collision with root package name */
        public static final d f33403i = new d("PLACES_FETCH_PLACE_ERROR", 7, "address_element.fetch_place.error");

        /* renamed from: j, reason: collision with root package name */
        public static final d f33404j = new d("LINK_CREATE_CARD_FAILURE", 8, "link.create_new_card.create_payment_details_failure");

        /* renamed from: k, reason: collision with root package name */
        public static final d f33405k = new d("LINK_SHARE_CARD_FAILURE", 9, "link.create_new_card.share_payment_details_failure");

        /* renamed from: l, reason: collision with root package name */
        public static final d f33406l = new d("LINK_LOG_OUT_FAILURE", 10, "link.log_out.failure");

        /* renamed from: m, reason: collision with root package name */
        public static final d f33407m = new d("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 11, "payments.paymentlauncherconfirmation.null_args");

        /* renamed from: n, reason: collision with root package name */
        public static final d f33408n = new d("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 12, "payments.browserlauncher.activity_not_found");

        /* renamed from: o, reason: collision with root package name */
        public static final d f33409o = new d("BROWSER_LAUNCHER_NULL_ARGS", 13, "payments.browserlauncher.null_args");

        /* renamed from: p, reason: collision with root package name */
        public static final d f33410p = new d("GOOGLE_PAY_FAILED", 14, "google_pay.confirm.error");

        /* renamed from: q, reason: collision with root package name */
        public static final d f33411q = new d("FRAUD_DETECTION_API_FAILURE", 15, "fraud_detection_data_repository.api_failure");

        /* renamed from: r, reason: collision with root package name */
        public static final d f33412r = new d("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 16, "paymentsheet.external_payment_method.confirm_handler_is_null");

        /* renamed from: s, reason: collision with root package name */
        public static final d f33413s = new d("EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", 17, "paymentsheet.external_payment_method.launcher_is_null");

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ d[] f33414t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ R5.a f33415u;

        /* renamed from: a, reason: collision with root package name */
        private final String f33416a;

        static {
            d[] b8 = b();
            f33414t = b8;
            f33415u = R5.b.a(b8);
        }

        private d(String str, int i8, String str2) {
            this.f33416a = str2;
        }

        private static final /* synthetic */ d[] b() {
            return new d[]{f33396b, f33397c, f33398d, f33399e, f33400f, f33401g, f33402h, f33403i, f33404j, f33405k, f33406l, f33407m, f33408n, f33409o, f33410p, f33411q, f33412r, f33413s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f33414t.clone();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33416a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final e f33417b = new e("GET_SAVED_PAYMENT_METHODS_SUCCESS", 0, "elements.customer_repository.get_saved_payment_methods_success");

        /* renamed from: c, reason: collision with root package name */
        public static final e f33418c = new e("PLACES_FIND_AUTOCOMPLETE_SUCCESS", 1, "address_element.find_autocomplete.success");

        /* renamed from: d, reason: collision with root package name */
        public static final e f33419d = new e("PLACES_FETCH_PLACE_SUCCESS", 2, "address_element.fetch_place.success");

        /* renamed from: e, reason: collision with root package name */
        public static final e f33420e = new e("LINK_CREATE_CARD_SUCCESS", 3, "link.create_new_card.success");

        /* renamed from: f, reason: collision with root package name */
        public static final e f33421f = new e("LINK_LOG_OUT_SUCCESS", 4, "link.log_out.success");

        /* renamed from: g, reason: collision with root package name */
        public static final e f33422g = new e("EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", 5, "paymentsheet.external_payment_method.launch_success");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ e[] f33423h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f33424i;

        /* renamed from: a, reason: collision with root package name */
        private final String f33425a;

        static {
            e[] b8 = b();
            f33423h = b8;
            f33424i = R5.b.a(b8);
        }

        private e(String str, int i8, String str2) {
            this.f33425a = str2;
        }

        private static final /* synthetic */ e[] b() {
            return new e[]{f33417b, f33418c, f33419d, f33420e, f33421f, f33422g};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f33423h.clone();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33425a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class f implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final f f33426b = new f("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");

        /* renamed from: c, reason: collision with root package name */
        public static final f f33427c = new f("MISSING_CARDSCAN_DEPENDENCY", 1, "cardscan.missing_dependency");

        /* renamed from: d, reason: collision with root package name */
        public static final f f33428d = new f("MISSING_HOSTED_VOUCHER_URL", 2, "payments.missing_hosted_voucher_url");

        /* renamed from: e, reason: collision with root package name */
        public static final f f33429e = new f("MISSING_POLLING_AUTHENTICATOR", 3, "payments.missing_polling_authenticator");

        /* renamed from: f, reason: collision with root package name */
        public static final f f33430f = new f("LINK_INVALID_SESSION_STATE", 4, "link.signup.failure.invalidSessionState");

        /* renamed from: g, reason: collision with root package name */
        public static final f f33431g = new f("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 5, "google_pay.confirm.unexpected_result");

        /* renamed from: h, reason: collision with root package name */
        public static final f f33432h = new f("GOOGLE_PAY_MISSING_INTENT_DATA", 6, "google_pay.on_result.missing_data");

        /* renamed from: i, reason: collision with root package name */
        public static final f f33433i = new f("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 7, "address_element.find_autocomplete.without_dependency");

        /* renamed from: j, reason: collision with root package name */
        public static final f f33434j = new f("FETCH_PLACE_WITHOUT_DEPENDENCY", 8, "address_element.fetch_place.without_dependency");

        /* renamed from: k, reason: collision with root package name */
        public static final f f33435k = new f("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 9, "link.create_new_card.missing_link_account");

        /* renamed from: l, reason: collision with root package name */
        public static final f f33436l = new f("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 10, "paymentsheet.authenticators.not_found");

        /* renamed from: m, reason: collision with root package name */
        public static final f f33437m = new f("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 11, "paymentsheet.loader.elements_session.customer.not_found");

        /* renamed from: n, reason: collision with root package name */
        public static final f f33438n = new f("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 12, "elements.external_payment_methods_serializer.error");

        /* renamed from: o, reason: collision with root package name */
        public static final f f33439o = new f("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 13, "paymentsheet.no_payment_selection");

        /* renamed from: p, reason: collision with root package name */
        public static final f f33440p = new f("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 14, "paymentsheet.invalid_payment_selection");

        /* renamed from: q, reason: collision with root package name */
        public static final f f33441q = new f("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 15, "flow_controller.invalid_payment_selection");

        /* renamed from: r, reason: collision with root package name */
        public static final f f33442r = new f("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 16, "intent_confirmation_handler.invalid_payment_confirmation_option");

        /* renamed from: s, reason: collision with root package name */
        public static final f f33443s = new f("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 17, "paymentsheet.external_payment_method.unexpected_result_code");

        /* renamed from: t, reason: collision with root package name */
        public static final f f33444t = new f("CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", 18, "payments.cvc_recollection_unexpected_payment_selection");

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ f[] f33445u;

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ R5.a f33446v;

        /* renamed from: a, reason: collision with root package name */
        private final String f33447a;

        static {
            f[] b8 = b();
            f33445u = b8;
            f33446v = R5.b.a(b8);
        }

        private f(String str, int i8, String str2) {
            this.f33447a = str2;
        }

        private static final /* synthetic */ f[] b() {
            return new f[]{f33426b, f33427c, f33428d, f33429e, f33430f, f33431g, f33432h, f33433i, f33434j, f33435k, f33436l, f33437m, f33438n, f33439o, f33440p, f33441q, f33442r, f33443s, f33444t};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f33445u.clone();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return "unexpected_error." + this.f33447a;
        }
    }

    void a(c cVar, AbstractC3790k abstractC3790k, Map map);
}
