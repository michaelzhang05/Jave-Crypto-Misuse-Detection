package b4;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15417d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f15418a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15419b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15420c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a(String fieldName) {
            AbstractC3255y.i(fieldName, "fieldName");
            return new c(f.f15450g.b(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        public final c b(String fieldName) {
            AbstractC3255y.i(fieldName, "fieldName");
            return new c(f.f15448e.b(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i8, String description, String detail) {
        super(i8 + " - " + description + " (" + detail + ")");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(detail, "detail");
        this.f15418a = i8;
        this.f15419b = description;
        this.f15420c = detail;
    }

    public final int a() {
        return this.f15418a;
    }

    public final String b() {
        return this.f15419b;
    }

    public final String c() {
        return this.f15420c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f protocolError, String detail) {
        this(protocolError.b(), protocolError.c(), detail);
        AbstractC3255y.i(protocolError, "protocolError");
        AbstractC3255y.i(detail, "detail");
    }
}
