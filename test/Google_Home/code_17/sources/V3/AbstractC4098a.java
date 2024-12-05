package v3;

import A2.InterfaceC0943a;
import O5.x;
import P5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4098a implements InterfaceC0943a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0909a f40121a = new C0909a(null);

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0909a {
        private C0909a() {
        }

        public /* synthetic */ C0909a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: v3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4098a {

        /* renamed from: b, reason: collision with root package name */
        private final String f40122b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40123c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f40124d;

        /* renamed from: e, reason: collision with root package name */
        private final String f40125e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String country, boolean z8, Integer num) {
            super(null);
            AbstractC3255y.i(country, "country");
            this.f40122b = country;
            this.f40123c = z8;
            this.f40124d = num;
            this.f40125e = "mc_address_completed";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f40125e;
        }

        @Override // v3.AbstractC4098a
        public Map b() {
            Map m8 = Q.m(x.a("address_country_code", this.f40122b), x.a("auto_complete_result_selected", Boolean.valueOf(this.f40123c)));
            Integer num = this.f40124d;
            if (num != null) {
                m8.put("edit_distance", Integer.valueOf(num.intValue()));
            }
            return Q.e(x.a("address_data_blob", m8));
        }
    }

    /* renamed from: v3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4098a {

        /* renamed from: b, reason: collision with root package name */
        private final String f40126b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40127c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String country) {
            super(null);
            AbstractC3255y.i(country, "country");
            this.f40126b = country;
            this.f40127c = "mc_address_show";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f40127c;
        }

        @Override // v3.AbstractC4098a
        public Map b() {
            return Q.e(x.a("address_data_blob", Q.e(x.a("address_country_code", this.f40126b))));
        }
    }

    private AbstractC4098a() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC4098a(AbstractC3247p abstractC3247p) {
        this();
    }
}
