package i1;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31525a;

    /* renamed from: b, reason: collision with root package name */
    private final w f31526b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f31527c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31528d;

    /* renamed from: e, reason: collision with root package name */
    private int f31529e;

    /* renamed from: f, reason: collision with root package name */
    private o f31530f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C3156v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31531a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public r(boolean z8, w timeProvider, Function0 uuidGenerator) {
        AbstractC3159y.i(timeProvider, "timeProvider");
        AbstractC3159y.i(uuidGenerator, "uuidGenerator");
        this.f31525a = z8;
        this.f31526b = timeProvider;
        this.f31527c = uuidGenerator;
        this.f31528d = b();
        this.f31529e = -1;
    }

    private final String b() {
        String uuid = ((UUID) this.f31527c.invoke()).toString();
        AbstractC3159y.h(uuid, "uuidGenerator().toString()");
        String lowerCase = g6.n.A(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final o a() {
        String b8;
        int i8 = this.f31529e + 1;
        this.f31529e = i8;
        if (i8 == 0) {
            b8 = this.f31528d;
        } else {
            b8 = b();
        }
        this.f31530f = new o(b8, this.f31528d, this.f31529e, this.f31526b.b());
        return d();
    }

    public final boolean c() {
        return this.f31525a;
    }

    public final o d() {
        o oVar = this.f31530f;
        if (oVar != null) {
            return oVar;
        }
        AbstractC3159y.y("currentSession");
        return null;
    }

    public final boolean e() {
        if (this.f31530f != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ r(boolean z8, w wVar, Function0 function0, int i8, AbstractC3151p abstractC3151p) {
        this(z8, wVar, (i8 & 4) != 0 ? a.f31531a : function0);
    }
}
