package a3;

import com.stripe.android.paymentsheet.u;
import h4.P0;
import h4.Y;
import h4.w0;
import h4.y0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.D;
import p4.G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC1619a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1619a f13831a = new EnumC1619a("Name", 0) { // from class: a3.a.b
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // a3.EnumC1619a
        public u.d.b b(u.d configuration) {
            AbstractC3255y.i(configuration, "configuration");
            return configuration.s();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a3.EnumC1619a
        public D c(Map initialValues) {
            AbstractC3255y.i(initialValues, "initialValues");
            return new w0((G) null, (P0) (0 == true ? 1 : 0), 3, (AbstractC3247p) (0 == true ? 1 : 0)).l(initialValues);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1619a f13832b = new EnumC1619a("Phone", 1) { // from class: a3.a.c
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // a3.EnumC1619a
        public u.d.b b(u.d configuration) {
            AbstractC3255y.i(configuration, "configuration");
            return configuration.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a3.EnumC1619a
        public D c(Map initialValues) {
            AbstractC3255y.i(initialValues, "initialValues");
            return new y0((G) null, 1, (AbstractC3247p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1619a f13833c = new EnumC1619a("Email", 2) { // from class: a3.a.a
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // a3.EnumC1619a
        public u.d.b b(u.d configuration) {
            AbstractC3255y.i(configuration, "configuration");
            return configuration.p();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a3.EnumC1619a
        public D c(Map initialValues) {
            AbstractC3255y.i(initialValues, "initialValues");
            return new Y((G) null, 1, (AbstractC3247p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC1619a[] f13834d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f13835e;

    static {
        EnumC1619a[] a8 = a();
        f13834d = a8;
        f13835e = U5.b.a(a8);
    }

    public /* synthetic */ EnumC1619a(String str, int i8, AbstractC3247p abstractC3247p) {
        this(str, i8);
    }

    private static final /* synthetic */ EnumC1619a[] a() {
        return new EnumC1619a[]{f13831a, f13832b, f13833c};
    }

    public static U5.a d() {
        return f13835e;
    }

    public static EnumC1619a valueOf(String str) {
        return (EnumC1619a) Enum.valueOf(EnumC1619a.class, str);
    }

    public static EnumC1619a[] values() {
        return (EnumC1619a[]) f13834d.clone();
    }

    public abstract u.d.b b(u.d dVar);

    public abstract D c(Map map);

    public final boolean e(u.d configuration) {
        AbstractC3255y.i(configuration, "configuration");
        if (b(configuration) != u.d.b.f27452b) {
            return true;
        }
        return false;
    }

    public final boolean f(u.d configuration) {
        AbstractC3255y.i(configuration, "configuration");
        if (b(configuration) == u.d.b.f27453c) {
            return true;
        }
        return false;
    }

    private EnumC1619a(String str, int i8) {
    }
}
