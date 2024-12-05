package kotlin.reflect.x.internal.l0.m;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.m.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class t implements f {
    private final String a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f21446b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f21446b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.m.t.a.<init>(int):void");
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return yVar.h().size() >= this.f21446b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f21447b;

        public b(int i2) {
            super("must have exactly " + i2 + " value parameters", null);
            this.f21447b = i2;
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return yVar.h().size() == this.f21447b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final c f21448b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return yVar.h().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final d f21449b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return yVar.h().size() == 1;
        }
    }

    private t(String str) {
        this.a = str;
    }

    public /* synthetic */ t(String str, g gVar) {
        this(str);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String a(y yVar) {
        return f.a.a(this, yVar);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String getDescription() {
        return this.a;
    }
}
