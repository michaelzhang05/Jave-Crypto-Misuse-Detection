package s3;

import L5.x;
import M5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3871a;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3745a implements InterfaceC3871a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0873a f37848a = new C0873a(null);

    /* renamed from: s3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0873a {
        private C0873a() {
        }

        public /* synthetic */ C0873a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: s3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3745a {

        /* renamed from: b, reason: collision with root package name */
        private final String f37849b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f37850c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f37851d;

        /* renamed from: e, reason: collision with root package name */
        private final String f37852e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String country, boolean z8, Integer num) {
            super(null);
            AbstractC3159y.i(country, "country");
            this.f37849b = country;
            this.f37850c = z8;
            this.f37851d = num;
            this.f37852e = "mc_address_completed";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f37852e;
        }

        @Override // s3.AbstractC3745a
        public Map b() {
            Map m8 = Q.m(x.a("address_country_code", this.f37849b), x.a("auto_complete_result_selected", Boolean.valueOf(this.f37850c)));
            Integer num = this.f37851d;
            if (num != null) {
                m8.put("edit_distance", Integer.valueOf(num.intValue()));
            }
            return Q.e(x.a("address_data_blob", m8));
        }
    }

    /* renamed from: s3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3745a {

        /* renamed from: b, reason: collision with root package name */
        private final String f37853b;

        /* renamed from: c, reason: collision with root package name */
        private final String f37854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String country) {
            super(null);
            AbstractC3159y.i(country, "country");
            this.f37853b = country;
            this.f37854c = "mc_address_show";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f37854c;
        }

        @Override // s3.AbstractC3745a
        public Map b() {
            return Q.e(x.a("address_data_blob", Q.e(x.a("address_country_code", this.f37853b))));
        }
    }

    private AbstractC3745a() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC3745a(AbstractC3151p abstractC3151p) {
        this();
    }
}
