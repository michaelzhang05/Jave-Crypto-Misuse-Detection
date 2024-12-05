package com.google.firebase.sessions;

import A0.n;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;
import l1.I;
import l1.y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final b f18563f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final I f18564a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f18565b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18566c;

    /* renamed from: d, reason: collision with root package name */
    private int f18567d;

    /* renamed from: e, reason: collision with root package name */
    private y f18568e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3252v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18569a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final c a() {
            Object j8 = n.a(A0.c.f72a).j(c.class);
            AbstractC3255y.h(j8, "Firebase.app[SessionGenerator::class.java]");
            return (c) j8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public c(I timeProvider, Function0 uuidGenerator) {
        AbstractC3255y.i(timeProvider, "timeProvider");
        AbstractC3255y.i(uuidGenerator, "uuidGenerator");
        this.f18564a = timeProvider;
        this.f18565b = uuidGenerator;
        this.f18566c = b();
        this.f18567d = -1;
    }

    private final String b() {
        String uuid = ((UUID) this.f18565b.invoke()).toString();
        AbstractC3255y.h(uuid, "uuidGenerator().toString()");
        String lowerCase = j6.n.A(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        String b8;
        int i8 = this.f18567d + 1;
        this.f18567d = i8;
        if (i8 == 0) {
            b8 = this.f18566c;
        } else {
            b8 = b();
        }
        this.f18568e = new y(b8, this.f18566c, this.f18567d, this.f18564a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f18568e;
        if (yVar != null) {
            return yVar;
        }
        AbstractC3255y.y("currentSession");
        return null;
    }

    public /* synthetic */ c(I i8, Function0 function0, int i9, AbstractC3247p abstractC3247p) {
        this(i8, (i9 & 2) != 0 ? a.f18569a : function0);
    }
}
